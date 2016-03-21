package com.turgutguduk.init;

/**
 * Created by turgut on 19.03.2016.
 */
import java.util.Properties;
import javax.sql.DataSource;

import com.turgutguduk.constant.SystemConstant;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

@Configuration
@EnableTransactionManagement
public class DatabaseConfig
{

    @Value(SystemConstant.PROPERTY_VALUE_HIBERNATE_DB_DRIVER)
    private String DB_DRIVER;

    @Value(SystemConstant.PROPERTY_VALUE_HIBERNATE_DB_PASSWORD)
    private String DB_PASSWORD;

    @Value(SystemConstant.PROPERTY_VALUE_HIBERNATE_DB_URL)
    private String DB_URL;

    @Value(SystemConstant.PROPERTY_VALUE_HIBERNATE_DB_USERNAME)
    private String DB_USERNAME;

    @Value(SystemConstant.PROPERTY_VALUE_HIBERNATE_DIALECT)
    private String HIBERNATE_DIALECT;

    @Value(SystemConstant.PROPERTY_VALUE_HIBERNATE_SHOW_SQL)
    private String HIBERNATE_SHOW_SQL;

    @Value(SystemConstant.PROPERTY_VALUE_HIBERNATE_HBM2DLL_AUTO)
    private String HIBERNATE_HBM2DDL_AUTO;

    @Value(SystemConstant.PROPERTY_VALUE_ENTITYMANAGER_PACKAGES_TO_SCAN)
    private String ENTITYMANAGER_PACKAGES_TO_SCAN;

    @Bean
    public DataSource dataSource()
    {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(DB_DRIVER);
        dataSource.setUrl(DB_URL);
        dataSource.setUsername(DB_USERNAME);
        dataSource.setPassword(DB_PASSWORD);
        return dataSource;
    }

    @Bean
    public LocalSessionFactoryBean sessionFactory()
    {
        LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
        sessionFactoryBean.setDataSource(dataSource());
        sessionFactoryBean.setPackagesToScan(ENTITYMANAGER_PACKAGES_TO_SCAN);
        Properties hibernateProperties = new Properties();
        hibernateProperties.put(SystemConstant.PROPERTY_NAME_HIBERNATE_DIALECT, HIBERNATE_DIALECT);
        hibernateProperties.put(SystemConstant.PROPERTY_NAME_HIBERNATE_SHOW_SQL, HIBERNATE_SHOW_SQL);
        hibernateProperties.put(SystemConstant.PROPERTY_NAME_HIBERNATE_HBM2DDL_AUTO, HIBERNATE_HBM2DDL_AUTO);
        sessionFactoryBean.setHibernateProperties(hibernateProperties);
        return sessionFactoryBean;
    }

    @Bean
    public HibernateTransactionManager transactionManager()
    {
        HibernateTransactionManager transactionManager =  new HibernateTransactionManager();
        transactionManager.setSessionFactory(sessionFactory().getObject());
        return transactionManager;
    }


}