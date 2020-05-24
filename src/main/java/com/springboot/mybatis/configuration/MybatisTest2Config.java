package com.springboot.mybatis.configuration;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

/**
 * 定义test1数据源
 */
@Configuration
@MapperScan(basePackages = {"com.springboot.mybatis.mapper.test2"},sqlSessionFactoryRef = "sqlSessionFactoryTest2")
public class MybatisTest2Config {
    @Autowired
    @Qualifier(value="datasourceTest2")
    private DataSource test2;
    @Bean
    public SqlSessionFactory sqlSessionFactoryTest2() throws Exception {
        SqlSessionFactoryBean factory = new SqlSessionFactoryBean();
        factory.setDataSource(test2);
        factory.getObject().getConfiguration().setMapUnderscoreToCamelCase(true);

        //指定mapper位置
        //factory.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mybatis/mapper/test1/*.xml"));
        return factory.getObject();
    }
    @Bean
    public SqlSessionTemplate sqlSessionTemplateTest2() throws Exception {
        SqlSessionTemplate template = new SqlSessionTemplate(sqlSessionFactoryTest2());
        return template;
    }
    @Bean(name = "transactionManagerTest2")
    public PlatformTransactionManager transactionManagerTest1() {
        return new DataSourceTransactionManager(test2);
    }
}
