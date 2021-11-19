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
    *      copyright 2002-2020 the original author or authors
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
    @SafeVarargs
    public ServletContextInitializerBeans(ListableBeanFactory beanFactory,
                                          Class<? extends ServletContextInitializer>... initializerTypes) {
        this.initializers = new LinkedMultiValueMap<>();
        this.initializerTypes = (initializerTypes.length != 0)
            ? Arrays.asList(initializerTypes)
            : Collections.singletonList(ServletContextInitializer.class);
        addServletContextInitializerBeans(beanFactory);
        addAdaptableBeans(beanFactory);
        List<ServletContextInitializer> sortedInitializers = this.initializers.values()
            .stream()
            .flatMap((value) -> value.stream()
                .sorted(AnnotationAwareOrderComparator.INSTANCE))
            .collect(Collectors.toList());
        this.sortedList = Collections.unmodifiableList(sortedInitializers);
    }

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
    *      copyright 2002-2020 the original author or authors
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
       github@spring-projects/spring-hateoas:WebFluxLinkBuilder.java:1.3.2
       modifications: none
    */
    public static class WebFluxLink {

        private final Mono<Link> link;

        public WebFluxLink(Mono<Link> link) {
            this.link = link;
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
        *      copyright 2002-2020 the original author or authors
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
        }

        /**
         * Adds the affordance created by the given virtual method invocation.
         *
         * @param invocation must not be {@literal null}.
         * @return
         * @see WebFluxLinkBuilder#methodOn(Class, Object...)
         */
        public WebFluxLink andAffordance(Object invocation) {

            Assert.notNull(invocation, "Invocation must not be null!");

            Mono<WebFluxLinkBuilder> builder = linkToInternal(invocation);

            return new WebFluxLink(link.flatMap(it -> builder //
                .flatMapIterable(WebFluxLinkBuilder::getAffordances) //
                .singleOrEmpty() //
                .map(it::andAffordance)));
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
        *      copyright 2002-2020 the original author or authors
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
        }

        /**
         * Creates a new {@link WebFluxLink} with the current {@link Link} instance transformed using the given mapper.
         *
         * @param mapper must not be {@literal null}.
         * @return
         */
        public WebFluxLink map(Function<Link, Link> mapper) {

            Assert.notNull(mapper, "Function must not be null!");

            return new WebFluxLink(link.map(mapper));
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
        *      copyright 2002-2020 the original author or authors
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
        }

        /**
         * Returns the underlying {@link Mono} of {@link Link} for further handling within a reactive pipeline.
         *
         * @return
         */
        public Mono<Link> toMono() {
            return link;
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
        *      copyright 2002-2020 the original author or authors
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
        }

        /**
         * Returns a {@link Mono} of {@link Link} with the current one augmented by the given {@link Function}. Allows
         * immediate customization of the {@link Link} instance and immediately return to a general reactive API.
         *
         * @param finisher must not be {@literal null}.
         * @return
         */
        public Mono<Link> toMono(Function<Link, Link> finisher) {

            Assert.notNull(finisher, "Function must not be null!");

            return link.map(finisher);
        }
    }


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
    *      copyright 2002-2020 the original author or authors
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
    private static class ServletRegistrationBeanAdapter
        implements RegistrationBeanAdapter<Servlet> {

        private final MultipartConfigElement multipartConfig;

        ServletRegistrationBeanAdapter(MultipartConfigElement multipartConfig) {
            this.multipartConfig = multipartConfig;
        }

        @Override
        public RegistrationBean createRegistrationBean(String name, Servlet source,
                                                       int totalNumberOfSourceBeans) {
            String url = (totalNumberOfSourceBeans != 1) ? "/" + name + "/" : "/";
            if (name.equals(DISPATCHER_SERVLET_NAME)) {
                url = "/"; // always map the main dispatcherServlet to "/"
            }
            ServletRegistrationBean<Servlet> bean = new ServletRegistrationBean<>(source,
                url);
            bean.setName(name);
            bean.setMultipartConfig(this.multipartConfig);
            return bean;
        }

    }

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
    *      copyright 2002-2020 the original author or authors
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
        github@spring-projects/spring-hateoas:WebFluxLinkBuilder.java:1.3.2
        modifications: none
    */
    private static class CurrentRequest {

        private static final ConversionService FALLBACK_CONVERSION_SERVICE = new DefaultConversionService();

        private UriComponentsBuilder builder;
        private ConversionService conversionService;

        public static Mono<CurrentRequest> of(@Nullable ServerWebExchange exchange) {

            CurrentRequest result = new CurrentRequest();

            if (exchange == null) {

                result.builder = UriComponentsBuilder.fromPath("/");
                result.conversionService = FALLBACK_CONVERSION_SERVICE;

                return Mono.just(result);
            }

            ServerHttpRequest request = exchange.getRequest();
            PathContainer contextPath = request.getPath().contextPath();

            result.builder = UriComponentsBuilder.fromHttpRequest(request) //
                .replacePath(contextPath.toString()) //
                .replaceQuery("");

            ApplicationContext context = exchange.getApplicationContext();

            result.conversionService = context != null && context.containsBean("webFluxConversionService")
                ? context.getBean("webFluxConversionService", ConversionService.class)
                : FALLBACK_CONVERSION_SERVICE;

            return Mono.just(result);
        }
    }


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
    *      copyright 2002-2020 the original author or authors
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
       github@spring-projects/spring-framework:PathMatchingBenchmark.java:v5.3.9
       modifications: none
    */
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
    *      copyright 2002-2020 the original author or authors
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
    static class RouteGenerator {

        static List<Route> staticRoutes() {
            return Arrays.asList(
                new Route("/"),
                new Route("/why-spring"),
                new Route("/microservices"),
                new Route("/reactive"),
                new Route("/event-driven"),
                new Route("/cloud"),
                new Route("/web-applications"),
                new Route("/serverless"),
                new Route("/batch"),
                new Route("/community/overview"),
                new Route("/community/team"),
                new Route("/community/events"),
                new Route("/community/support"),
                new Route("/some/other/section"),
                new Route("/blog.atom")
            );
        }

        static List<Route> captureRoutes() {
            return Arrays.asList(
                new Route("/guides"),
                new Route("/guides/gs/{repositoryName}",
                    "/guides/gs/rest-service", "/guides/gs/scheduling-tasks",
                    "/guides/gs/consuming-rest", "/guides/gs/relational-data-access"),
                new Route("/projects"),
                new Route("/projects/{name}",
                    "/projects/spring-boot", "/projects/spring-framework",
                    "/projects/spring-data", "/projects/spring-security", "/projects/spring-cloud"),
                new Route("/blog/category/{category}.atom",
                    "/blog/category/releases.atom", "/blog/category/engineering.atom",
                    "/blog/category/news.atom"),
                new Route("/tools/{name}", "/tools/eclipse", "/tools/vscode"),
                new Route("/team/{username}",
                    "/team/jhoeller", "/team/bclozel", "/team/snicoll", "/team/sdeleuze", "/team/rstoyanchev"),
                new Route("/api/projects/{projectId}",
                    "/api/projects/spring-boot", "/api/projects/spring-framework",
                    "/api/projects/reactor", "/api/projects/spring-data",
                    "/api/projects/spring-restdocs", "/api/projects/spring-batch"),
                new Route("/api/projects/{projectId}/releases/{version}",
                    "/api/projects/spring-boot/releases/2.3.0", "/api/projects/spring-framework/releases/5.3.0",
                    "/api/projects/spring-boot/releases/2.2.0", "/api/projects/spring-framework/releases/5.2.0")
            );
        }

        static List<Route> regexRoute() {
            return Arrays.asList(
                new Route("/blog/{year:\\\\d+}/{month:\\\\d+}/{day:\\\\d+}/{slug}",
                    "/blog/2020/01/01/spring-boot-released", "/blog/2020/02/10/this-week-in-spring",
                    "/blog/2020/03/12/spring-one-conference-2020", "/blog/2020/05/17/spring-io-barcelona-2020",
                    "/blog/2020/05/17/spring-io-barcelona-2020", "/blog/2020/06/06/spring-cloud-release"),
                new Route("/user/{name:[a-z]+}",
                    "/user/emily", "/user/example", "/user/spring")
            );
        }

        static List<Route> allRoutes() {
            List<Route> routes = new ArrayList<>();
            routes.addAll(staticRoutes());
            routes.addAll(captureRoutes());
            routes.addAll(regexRoute());
            routes.add(new Route("/static/**", "/static/image.png", "/static/style.css"));
            routes.add(new Route("/**", "/notfound", "/favicon.ico"));
            return routes;
        }

    }

    /*
        github@spring-projects/spring-framework:JmsInvokerClientInterceptor.java:v5.0.4.RELEASE
        modifications: none
    */
    protected RemoteInvocationResult executeRequest(RemoteInvocation invocation) throws JMSException {
        Connection con = createConnection();
        Session session = null;
        try {
            session = createSession(con);
            Queue queueToUse = resolveQueue(session);
            Message requestMessage = createRequestMessage(session, invocation);
            con.start();
            Message responseMessage = doExecuteRequest(session, queueToUse, requestMessage);
            if (responseMessage != null) {
                return extractInvocationResult(responseMessage);
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
            *      copyright 2002-2020 the original author or authors
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
            } else {
                return onReceiveTimeout(invocation);
            }
        } finally {
            JmsUtils.closeSession(session);
            ConnectionFactoryUtils.releaseConnection(con, getConnectionFactory(), true);
        }

    }
}
