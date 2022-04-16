import io.threatrix.threat-matrix.examples.java.springboot;

public class BootMixer {
  
  
    //https://github.com/spring-projects/spring-boot/blob/v1.0.0.RC5/spring-boot/src/main/java/org/springframework/boot/context/embedded/FilterRegistrationBean.java
    protected void configure(FilterRegistration.Dynamic registration) {
      super.configure(registration);
      EnumSet<DispatcherType> dispatcherTypes = this.dispatcherTypes;
      if (dispatcherTypes == null) {
        dispatcherTypes = (isAsyncSupported() ? ASYNC_DISPATCHER_TYPES
            : NON_ASYNC_DISPATCHER_TYPES);
      }

      Set<String> servletNames = new LinkedHashSet<String>();
      for (ServletRegistrationBean servletRegistrationBean : this.servletRegistrationBeans) {
        servletNames.add(servletRegistrationBean.getServletName());
      }
      servletNames.addAll(this.servletNames);

      if (servletNames.isEmpty() && this.urlPatterns.isEmpty()) {
        logger.info("Mapping filter: '" + registration.getName() + "' to: "
            + Arrays.asList(DEFAULT_URL_MAPPINGS));
        registration.addMappingForUrlPatterns(dispatcherTypes, this.matchAfter,
            DEFAULT_URL_MAPPINGS);
      }
      else {
        if (servletNames.size() > 0) {
          logger.info("Mapping filter: '" + registration.getName()
              + "' to servlets: " + servletNames);
          registration.addMappingForServletNames(dispatcherTypes, this.matchAfter,
              servletNames.toArray(new String[servletNames.size()]));
        }
        if (this.urlPatterns.size() > 0) {
          logger.info("Mapping filter: '" + registration.getName() + "' to urls: "
              + this.urlPatterns);
          registration.addMappingForUrlPatterns(dispatcherTypes, this.matchAfter,
              this.urlPatterns.toArray(new String[this.urlPatterns.size()]));
        }
      }
    }
  
    // https://github.com/spring-projects/spring-boot/blob/main/spring-boot-project/spring-boot-tools/spring-boot-loader-tools/src/main/java/org/springframework/boot/loader/tools/FileUtils.java
    public static void removeDuplicatesFromOutputDirectory(File outputDirectory, File originDirectory) {
      if (originDirectory.isDirectory()) {
        for (String name : originDirectory.list()) {
          File targetFile = new File(outputDirectory, name);
          if (targetFile.exists() && targetFile.canWrite()) {
            if (!targetFile.isDirectory()) {
              targetFile.delete();
            }
            else {
              FileUtils.removeDuplicatesFromOutputDirectory(targetFile, new File(originDirectory, name));
            }
          }
        }
      }
    }
  
}
