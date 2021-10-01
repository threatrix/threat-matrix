package io.threatrix.threatmatrix.utility.springboot;

private class Mixer {
 
 /*
 *    ------ BEGIN LICENSE ATTRIBUTION ------
 *    
 *    Portions of this file have been appropriated or derived from the following project(s) and therefore require attribution to the original licenses and authors.
 *    
 *    Project: https://spring.io/projects/spring-boot
 *    Release: https://github.com/spring-projects/spring-boot/releases/tag/v1.5.22.RELEASE
 *    Source File: AnsiOutput.java
 *    
 *    Copyrights:
 *      copyright 2012-2018 the original author or authors
 *    
 *    Licenses:
 *      Android SDK Preview License Agreement
 *      This is the Android SDK Preview License Agreement (the “License Agreement”).
 *    
 *      Eclipse Public License 2.0
 *      Eclipse Public License - v 2.0
 *    
 *      License Agreement for NVIDIA Software Development Kits v0.11
 *      Important Notice—Read before downloading, installing, copying or using the 
 *      licensed software: 
 *      
 *      This license agreement, including exhibits attached ("Agreement”) is a legal agreement 
 *      between you and NVIDIA Corporation ("NVIDIA") and governs your use of a NVIDIA 
 *      software development kit (“SDK”). 
 *      
 *      Each SDK has its own set of software and materials, but here is a description of the types 
 *      of items that may be included in a SDK: source code, header files, APIs, data sets and 
 *      assets (examples include images, textures, models, scenes, videos, native API input/ 
 *      output files), binary software, sample code, libraries, utility programs, programming 
 *      code and documentation. 
 *      
 *      This Agreement can be accepted only by an adult of legal age of majority in the country 
 *      in which the SDK is used. 
 *      
 *      If you are entering into this Agreement on behalf of a company or other legal entity, you 
 *      represent that you have the legal authority to bind the entity to this Agreement, in which 
 *      case “you” will mean the entity you represent. 
 *      
 *      If you don’t have the required age or authority to accept this Agreement, or if you don’t 
 *      accept all the terms and conditions of this Agreement, do not download, install or use 
 *      the SDK. 
 *      
 *      You agree to use the SDK only for purposes that are permitted by (a) this Agreement, 
 *      and (b) any applicable law, regulation or generally accepted practices or guidelines in 
 *      the relevant jurisdictions.
 *    
 *      Eclipse Public License 1.0
 *      Eclipse Public License - v 1.0
 *    
 *      MIT License
 *      Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *    
 *      Apache License 2.0
 *      Licensed under the Apache License, Version 2.0 (the "License");
 *         you may not use this file except in compliance with the License.
 *         You may obtain a copy of the License at
 *      
 *             http://www.apache.org/licenses/LICENSE-2.0
 *      
 *         Unless required by applicable law or agreed to in writing, software
 *         distributed under the License is distributed on an "AS IS" BASIS,
 *         WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *         See the License for the specific language governing permissions and
 *         limitations under the License.
 *    
 *      Open Source Social Network License v3.0
 *      OPEN SOURCE SOCIAL NETWORK LICENSE (OSSN LICENSE) v3.0
 *    
 *      Server Side Public License, v 1
 *      Server Side Public License
 *    
 *    Auto-attribution by Threatrix, Inc.
 *    
 *    ------ END LICENSE ATTRIBUTION ------
 */
 /*
 * https://github.com/spring-projects/spring-boot/blob/v0.5.0.M2/spring-boot/src/main/java/org/springframework/boot/ansi/AnsiOutput.java
 */
 /*
 *    ------ BEGIN LICENSE ATTRIBUTION ------
 *    
 *    Portions of this file have been appropriated or derived from the following project(s) and therefore require attribution to the original licenses and authors.
 *    
 *    Project: https://spring.io/projects/spring-boot
 *    Release: https://github.com/spring-projects/spring-boot/releases/tag/v1.5.22.RELEASE
 *    Source File: AnsiOutput.java
 *    
 *    Copyrights:
 *      copyright 2012-2018 the original author or authors
 *    
 *    Licenses:
 *      Android SDK Preview License Agreement
 *      This is the Android SDK Preview License Agreement (the “License Agreement”).
 *    
 *      Eclipse Public License 2.0
 *      Eclipse Public License - v 2.0
 *    
 *      License Agreement for NVIDIA Software Development Kits v0.11
 *      Important Notice—Read before downloading, installing, copying or using the 
 *      licensed software: 
 *      
 *      This license agreement, including exhibits attached ("Agreement”) is a legal agreement 
 *      between you and NVIDIA Corporation ("NVIDIA") and governs your use of a NVIDIA 
 *      software development kit (“SDK”). 
 *      
 *      Each SDK has its own set of software and materials, but here is a description of the types 
 *      of items that may be included in a SDK: source code, header files, APIs, data sets and 
 *      assets (examples include images, textures, models, scenes, videos, native API input/ 
 *      output files), binary software, sample code, libraries, utility programs, programming 
 *      code and documentation. 
 *      
 *      This Agreement can be accepted only by an adult of legal age of majority in the country 
 *      in which the SDK is used. 
 *      
 *      If you are entering into this Agreement on behalf of a company or other legal entity, you 
 *      represent that you have the legal authority to bind the entity to this Agreement, in which 
 *      case “you” will mean the entity you represent. 
 *      
 *      If you don’t have the required age or authority to accept this Agreement, or if you don’t 
 *      accept all the terms and conditions of this Agreement, do not download, install or use 
 *      the SDK. 
 *      
 *      You agree to use the SDK only for purposes that are permitted by (a) this Agreement, 
 *      and (b) any applicable law, regulation or generally accepted practices or guidelines in 
 *      the relevant jurisdictions.
 *    
 *      Eclipse Public License 1.0
 *      Eclipse Public License - v 1.0
 *    
 *      MIT License
 *      Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *    
 *      Apache License 2.0
 *      Licensed under the Apache License, Version 2.0 (the "License");
 *         you may not use this file except in compliance with the License.
 *         You may obtain a copy of the License at
 *      
 *             http://www.apache.org/licenses/LICENSE-2.0
 *      
 *         Unless required by applicable law or agreed to in writing, software
 *         distributed under the License is distributed on an "AS IS" BASIS,
 *         WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *         See the License for the specific language governing permissions and
 *         limitations under the License.
 *    
 *      Open Source Social Network License v3.0
 *      OPEN SOURCE SOCIAL NETWORK LICENSE (OSSN LICENSE) v3.0
 *    
 *      Server Side Public License, v 1
 *      Server Side Public License
 *    
 *    Auto-attribution by Threatrix, Inc.
 *    
 *    ------ END LICENSE ATTRIBUTION ------
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
