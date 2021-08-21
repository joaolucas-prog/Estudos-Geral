package br.com.ingrao.springsecurity.config;

import java.beans.PropertyVetoException;
import java.util.logging.Logger;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "br.com.ingrao.springsecurity")
@PropertySource("classpath:database.properties")
public class AppConfig {

	//set up variable to hold the properties
	
	@Autowired
	private Environment env;
	
	private	Logger logger = Logger.getLogger(getClass().getName());
	
	//define bean for view resolver
	@Bean
	public ViewResolver viewResolver() {		
		
		InternalResourceViewResolver viewResouver = new InternalResourceViewResolver();
		
		viewResouver.setPrefix("/WEB-INF/view/");
		viewResouver.setSuffix(".jsp");
		
		return viewResouver;
	}
	
	//define a bean for our security datasource
	
	@Bean
	public DataSource securityDataSource() {
		
		//create a connection pool
		ComboPooledDataSource securityDataSource = new ComboPooledDataSource();
		//set jdbc driver class
		try {
			securityDataSource.setDriverClass(env.getProperty("jdbc.driver"));
		} catch (PropertyVetoException e) {
			logger.warning("Erro no carregamento do jdbc driver");
			throw new RuntimeException();
		}
		
		//log the connection props
		logger.info(" >>> jdbc.url=" + env.getProperty("jdbc.url"));
		logger.info(" >>> jdbc.user= " + env.getProperty("jdbc.username"));
		
		//set database connection props
		securityDataSource.setJdbcUrl(env.getProperty("jdbc.url"));
		securityDataSource.setUser(env.getProperty("jdbc.username"));
		securityDataSource.setPassword(env.getProperty("jdbc.password"));
		//set connection pool props
		securityDataSource.setInitialPoolSize(
				getIntProperty("connection.pool.initialPoolSize"));
		securityDataSource.setMinPoolSize(
				getIntProperty("connection.pool.minPoolSize"));
		securityDataSource.setMaxPoolSize(
				getIntProperty("connection.pool.maxPoolSize"));
		securityDataSource.setMaxIdleTime(
				getIntProperty("connection.pool.maxIdleTime"));
		
		return securityDataSource;
	}
	
	private int getIntProperty(String propName) {
		String propVal = env.getProperty(propName);
		int intPropVal = Integer.parseInt(propVal);
		return intPropVal;
	}
}
