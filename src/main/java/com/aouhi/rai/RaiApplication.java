package com.aouhi.rai;

import com.aouhi.rai.service.INewsService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableJpaRepositories
//@EnableAutoConfiguration
//@EnableJpaRepositories(basePackages="com.aouhi.rai", entityManagerFactoryRef="emf")
//@ComponentScan({"com.aouhi.rai"})
//@EntityScan("com.aouhi.rai.entity")
//@EnableJpaRepositories("com.aouhi.rai.repository")
//@ComponentScan
//@Configuration
//@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
//@EnableJpaRepositories(basePackages = "com.aouhi.rai.repository")
//@SpringBootApplication(scanBasePackages= "com.aouhi.rai")
//@SpringBootApplication(scanBasePackages={"com.aouhi.rai"})
//@EnableJpaRepositories(basePackageClasses = INewsService.class)
public class RaiApplication { //extends SpringBootServletInitializer {

	/*@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(RaiApplication.class);
	}*/

	public static void main(String[] args) {
		SpringApplication.run(RaiApplication.class, args);
	}

}

