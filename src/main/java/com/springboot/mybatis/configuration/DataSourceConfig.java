package com.springboot.mybatis.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import javax.sql.DataSource;
/**
 * 数据源配置
 */
@Configuration
public class DataSourceConfig {
    @Bean(name="datasourceTest1")
    @ConfigurationProperties(prefix = "spring.datasource.org")
    public DataSource datasourceTest1() {
        return DataSourceBuilder.create().build();
    }
    @Bean(name="datasourceTest2")
    @ConfigurationProperties(prefix = "spring.datasource.gsiot")
    public DataSource datasourceTest2() {
        return DataSourceBuilder.create().build();
    }
}
