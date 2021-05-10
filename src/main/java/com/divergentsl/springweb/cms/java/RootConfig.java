package com.divergentsl.springweb.cms.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@ComponentScan("com.divergentsl.springweb.cms")
public class RootConfig {
	
	@Bean
	   public LocalEntityManagerFactoryBean geEntityManagerFactoryBean() {
	      LocalEntityManagerFactoryBean factoryBean = new LocalEntityManagerFactoryBean();
	      factoryBean.setPersistenceUnitName("CmsPersistenceUnitForHibernate");
	      return factoryBean;
	   }

	   @Bean
	   public JpaTransactionManager geJpaTransactionManager() {
	      JpaTransactionManager transactionManager = new JpaTransactionManager();
	      transactionManager.setEntityManagerFactory(geEntityManagerFactoryBean().getObject());
	      return transactionManager;
	   }

}
