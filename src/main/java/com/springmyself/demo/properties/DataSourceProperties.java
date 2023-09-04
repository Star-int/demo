package com.springmyself.demo.properties;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ToString
@Component
@ConfigurationProperties(prefix = "spring.jdbc.datasource")
public class DataSourceProperties {

    private String driverClassName;
    private  String url;
    private  String username;
    private String password;

}
