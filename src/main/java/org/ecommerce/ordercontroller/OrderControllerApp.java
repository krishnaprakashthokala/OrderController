package org.ecommerce.ordercontroller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.XADataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({})
@ComponentScan({ "org.ecommerce.config.security,org.ecommerce.config.persistence,org.ecommerce.config,org.ecommerce.config.mahout,org.ecommerce.config.root", "controller", "service" } )// If our Controller class or Service class is not in the same packages we have //to add packages's name like this...directory(package) with main class

@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class, XADataSourceAutoConfiguration.class})
public class OrderControllerApp {
    public static void main(String[] args)
    {
      SpringApplication.run(OrderControllerApp.class, args);
    }
}