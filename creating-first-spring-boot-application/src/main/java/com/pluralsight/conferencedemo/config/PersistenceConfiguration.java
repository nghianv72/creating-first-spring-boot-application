package com.pluralsight.conferencedemo.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PersistenceConfiguration {
    @Bean
    public DataSource dataSource() {
        DataSourceBuilder<?> builder = DataSourceBuilder.create();
        //builder.url("jdbc:postgresql://localhost:5432/conference_app");
        builder.driverClassName("org.h2.Driver");
        builder.url("jdbc:h2:mem:testdb");
        builder.username("SA");
        builder.password("");
        System.out.println("My custom datasource bean has been initialized and set");
        return builder.build();
    }

    /*
    @Bean
    public ServletRegistrationBean h2servletRegistration() {
        ServletRegistrationBean registration = new ServletRegistrationBean(new WebServlet());
        registration.addUrlMappings("/console/*");
        return registration;
    }
    */
}
