package com.springboot.mybatis.configuration;

/**
 * @author ln
 * @Description: 使用git搭建外部化配置
 * @date 2020/7/17  10:46
 */
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;


@Component
@ConfigurationProperties(prefix = "spring.git")
/*@RefreshScope*/
@Getter
@Setter
public class GitConfig {

    private String name;

    private String age;
}
