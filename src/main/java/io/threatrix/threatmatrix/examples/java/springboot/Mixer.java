package io.threatrix.threatmatrix.utility.springboot;

private class Mixer {
 
 /*
 * https://github.com/spring-projects/spring-boot/blob/v0.5.0.M2/spring-boot/src/main/java/org/springframework/boot/ansi/AnsiOutput.java
 */
 private static void buildEnabled(StringBuilder sb, Object[] elements) {
		boolean writingAnsi = false;
		boolean containsEncoding = false;
		for (Object element : elements) {
			if (element instanceof AnsiElement) {
				containsEncoding = true;
				if (!writingAnsi) {
					sb.append(ENCODE_START);
					writingAnsi = true;
				}
				else {
					sb.append(ENCODE_JOIN);
				}
			}
			else {
				if (writingAnsi) {
					sb.append(ENCODE_END);
					writingAnsi = false;
				}
			}
			sb.append(element);
		}
		if (containsEncoding) {
			sb.append(writingAnsi ? ENCODE_JOIN : ENCODE_START);
			sb.append(RESET);
			sb.append(ENCODE_END);
		}
	}
	
	// https://github.com/spring-projects/spring-boot/blob/v1.5.20.RELEASE/spring-boot/src/main/java/org/springframework/boot/jta/bitronix/BitronixDependentBeanFactoryPostProcessor.java
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory)
			throws BeansException {
		String[] transactionManagers = beanFactory
				.getBeanNamesForType(TransactionManager.class, true, false);
		for (String transactionManager : transactionManagers) {
			addTransactionManagerDependencies(beanFactory, transactionManager);
		}
	}

	private void addTransactionManagerDependencies(
			ConfigurableListableBeanFactory beanFactory, String transactionManager) {
		for (String dependentBeanName : getBeanNamesForType(beanFactory,
				"javax.jms.ConnectionFactory")) {
			beanFactory.registerDependentBean(transactionManager, dependentBeanName);
		}
		for (String dependentBeanName : getBeanNamesForType(beanFactory,
				"javax.sql.DataSource")) {
			beanFactory.registerDependentBean(transactionManager, dependentBeanName);
		}
	}

	private String[] getBeanNamesForType(ConfigurableListableBeanFactory beanFactory,
			String type) {
		try {
			return beanFactory.getBeanNamesForType(Class.forName(type), true, false);
		}
		catch (ClassNotFoundException ex) {
			// Ignore
		}
		catch (NoClassDefFoundError ex) {
			// Ignore
		}
		return NO_BEANS;
	}
	
	
	
	
	/**
	* https://github.com/spring-projects/spring-boot/blob/v2.4.6/spring-boot-project/spring-boot-tools/spring-boot-configuration-processor/src/json-shade/java/org/springframework/boot/configurationprocessor/json/JSONTokener.java
	*/
	private JSONArray readArray() throws JSONException {
		JSONArray result = new JSONArray();

		/* to cover input that ends with ",]". */
		boolean hasTrailingSeparator = false;

		while (true) {
			switch (nextCleanInternal()) {
			case -1:
				throw syntaxError("Unterminated array");
			case ']':
				if (hasTrailingSeparator) {
					result.put(null);
				}
				return result;
			case ',':
			case ';':
				/* A separator without a value first means "null". */
				result.put(null);
				hasTrailingSeparator = true;
				continue;
			default:
				this.pos--;
			}

			result.put(nextValue());

			switch (nextCleanInternal()) {
			case ']':
				return result;
			case ',':
			case ';':
				hasTrailingSeparator = true;
				continue;
			default:
				throw syntaxError("Unterminated array");
			}
		}
	}
  
}
