//package com.example.demo.domain;
//
//
//
//import javax.sql.DataSource;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
//import org.springframework.orm.jpa.JpaVendorAdapter;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.orm.jpa.vendor.Database;
//import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
//
//@Configuration
//	@EnableJpaRepositories
//	public class Application {
//
//	    @Bean
//	    public DataSource dataSource() {
//	        return new EmbeddedDatabaseBuilder().setType(H2).build();
//	    }
//
//	    @Bean
//	    public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource, JpaVendorAdapter jpaVendorAdapter) {
//	        LocalContainerEntityManagerFactoryBean lef = new LocalContainerEntityManagerFactoryBean();
//	        lef.setDataSource(dataSource);
//	        lef.setJpaVendorAdapter(jpaVendorAdapter);
//	        lef.setPackagesToScan("com.example.demo.domain");
//	        return lef;
//	    }
//
//	    @Bean
//	    public JpaVendorAdapter jpaVendorAdapter() {
//	        HibernateJpaVendorAdapter hibernateJpaVendorAdapter = new HibernateJpaVendorAdapter();
//	        hibernateJpaVendorAdapter.setShowSql(false);
//	        hibernateJpaVendorAdapter.setGenerateDdl(true);
//	        hibernateJpaVendorAdapter.setDatabase(Database.H2);
//	        return hibernateJpaVendorAdapter;
//	    }
//
//
