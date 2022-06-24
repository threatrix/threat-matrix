/*
*    ------ BEGIN LICENSE ATTRIBUTION ------
*    
*    Portions of this file have been appropriated or derived from the following project(s) and therefore require attribution to the original licenses and authors.
*    
*    Project: https://spring.io/projects/spring-boot
*    Release: https://github.com/spring-projects/spring-boot/releases/tag/v1.5.21.RELEASE
*    Source File: SpringBootHypermediaApplication.java
*    
*    Copyrights:
*      copyright 2012-2017 the original author or authors
*    
*    Licenses:
*      Apache License 2.0
*      SPDXId: Apache-2.0
*    
*    Auto-attribution by Threatrix, Inc.
*    
*    ------ END LICENSE ATTRIBUTION ------
*/
package io.threatrix.threatmatrix;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@ComponentScan("io.threatrix.threatmatrix")
public class BootApp implements CommandLineRunner {

    /**
    * Boot app boots the app
    */
    List<Application> apps = new ArrayList<>();
    @Autowired private ApplicationContext ctx;

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(BootApp.class,new String[]{"ThreatMatrix"});
    }

    @Override
    public void run(String... args) throws Exception {
        for(int x=0; x<args.length; x++) {
            System.out.println("AppContents: "+ctx);
            Application application = (Application) ctx.getBean(args[x],ctx);
            application.start();
            apps.add(application);
        }
    }

    @PreDestroy
    public void shutdown() {
        apps.forEach(
            app -> {
                app.shutdown();
            }
        );
    }
}

