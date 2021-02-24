package app;


import app.proces.MakeConnection;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;

import java.sql.*;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@Configuration
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) throws SQLException {
        SpringApplication.run(Application.class, args);
//        new MakeConnection();
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder applicationBuilder) {
        return applicationBuilder.sources(Application.class);
    }
}