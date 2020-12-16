/*
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

*/
/*
 * 定义test1数据源
*//*


@Configuration
@MapperScan(basePackages = {"com.springboot.mybatis.mapper.dm"},sqlSessionFactoryRef = "datasourceDmFactory")
public class DMDatasourceConfig {
    @Autowired
    @Qualifier(value="datasourceDm")
    private DataSource datasourceDm;
    @Bean
    public SqlSessionFactory datasourceDmFactory() throws Exception {
        SqlSessionFactoryBean factory = new SqlSessionFactoryBean();
        factory.setDataSource(datasourceDm);
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        factory.setMapperLocations(resolver.getResources("classpath:xml/*.xml"));
        factory.getObject().getConfiguration().setMapUnderscoreToCamelCase(true);

        //指定mapper位置Factory
        //factory.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mybatis/mapper/test1/*.xml"));
        return factory.getObject();
    }
    @Bean
    public SqlSessionTemplate datasourceDmTemplate() throws Exception {
        SqlSessionTemplate template = new SqlSessionTemplate(datasourceDmFactory());
        return template;
    }
    @Bean(name = "dmTransactionManager")
    public PlatformTransactionManager dmTransactionManager() {
        return new DataSourceTransactionManager(datasourceDm);
    }
}
*/
