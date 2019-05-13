package com.leo.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.leo.dao","com.leo.service"})
public class RootConfig {
}
