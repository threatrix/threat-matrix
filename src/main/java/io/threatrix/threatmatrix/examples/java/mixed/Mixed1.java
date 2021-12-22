package io.threatrix.threatmatrix.utility.mixed;

public class Mixed1 {

    /*
    *    ------ BEGIN LICENSE ATTRIBUTION ------
    *    
    *    Portions of this file have been appropriated or derived from the following project(s) and therefore require attribution to the original licenses and authors.
    *    
    *    Project: https://spring.io/projects/spring-framework
    *    Release: https://github.com/spring-projects/spring-framework/releases/tag/v5.3.9
    *    Source File: PathMatchingBenchmark.java
    *    
    *    Copyrights:
    *      copyright 2002-2020 the     @SafeVarargs
69
    public ServletContextInitializerBeans(ListableBeanFactory beanFactory,
70
                                          Class<? extends ServletContextInitializer>... initializerTypes) {
71
        this.initializers = new LinkedMultiValueMap<>();
72
        this.initializerTypes = (initializerTypes.length != 0)
73
            ? Arrays.asList(initializerTypes)
74
            : Collections.singletonList(ServletContextInitializer.class);
75
        addServletContextInitializerBeans(beanFactory);
76
        addAdaptableBeans(beanFactory);
77
        List<ServletContextInitializer> sortedInitializers = this.initializers.values()
78
            .stream()
79
            .flatMap((value) -> value.stream()
80
                .sorted(AnnotationAwareOrderComparator.INSTANCE))
81
            .collect(Collectors.toList());original author or authors
    *    
    *    Licenses:
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
    *    Auto-attribution by Threatrix, Inc.
    *    
    *    ------ END LICENSE ATTRIBUTION ------
    */
    /*
       github@spring-projects/spring-boot:ServletContextInitializerBeans.java:v2.1.0.RC1
       modifications: none
     */
}
