package br.com.ingrao.springsecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "br.com.ingrao.springsecurity")
public class AppConfig {

	@Bean
	public ViewResolver viewResolver() {
		
		InternalResourceViewResolver viewResouver = new InternalResourceViewResolver();
		
		viewResouver.setPrefix("/WEB-INF/view/");
		viewResouver.setSuffix(".jsp");
		
		return viewResouver;
	}
}
