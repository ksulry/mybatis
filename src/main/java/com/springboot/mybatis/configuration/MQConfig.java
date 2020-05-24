package com.springboot.mybatis.configuration;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class MQConfig {

    public static final String QUEUE_NAME = "mqueue";

    @Bean
    public Queue Testqueue(){
        System.out.println("KKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKK");
        return new Queue(QUEUE_NAME,true);//第一个参数是队列名  第二是是否持久化
    }

    //Direct交换机 起名：TestDirectExchange
    @Bean
    DirectExchange DirectExchange() {
        //  return new DirectExchange("TestDirectExchange",true,true);
        return new DirectExchange("TestDirectExchange",true,false);
    }

    //绑定  将队列和交换机绑定, 并设置用于匹配键：TestDirectRouting
    @Bean
    Binding bindingDirect() {
        return BindingBuilder.bind(Testqueue()).to(DirectExchange()).with("TestDirectRouting");
    }
}
