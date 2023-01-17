package com.AMIDAIt.JobPortel_MiniProject.Props;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.AllArgsConstructor;
import lombok.Data;

@EnableConfigurationProperties
@ConfigurationProperties(prefix = "app1")
@Configuration
@Data
@AllArgsConstructor
public class AppProps {
	
	private Map<String, String> messeges= new HashMap<>();

}
