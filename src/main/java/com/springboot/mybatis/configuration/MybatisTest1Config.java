package com.springboot.mybatis.configuration;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import javax.sql.DataSource;
/**
 * 定义test1数据源
 */
@Configuration
@MapperScan(basePackages = {"com.springboot.mybatis.mapper.test1"},sqlSessionFactoryRef = "sqlSessionFactoryTest1")
public class MybatisTest1Config {
    @Autowired
    @Qualifier(value="datasourceTest1")
    private DataSource test1;
    @Bean
    public SqlSessionFactory sqlSessionFactoryTest1() throws Exception {
        SqlSessionFactoryBean factory = new SqlSessionFactoryBean();
        factory.setDataSource(test1);
        //指定mapper位置
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        factory.setMapperLocations(resolver.getResources("classpath:xml/*.xml"));
        factory.getObject().getConfiguration().setMapUnderscoreToCamelCase(true);
        return factory.getObject();
    }
    @Bean
    public SqlSessionTemplate sqlSessionTemplateTest1() throws Exception {
        SqlSessionTemplate template = new SqlSessionTemplate(sqlSessionFactoryTest1());
        return template;
    }
    @Bean(name = "transactionManagerTest1")
    public PlatformTransactionManager transactionManagerTest1() {

        return new DataSourceTransactionManager(test1);
    }
}
