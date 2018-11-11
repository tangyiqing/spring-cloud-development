package com.tyq.spring.cloud.helloworld.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * <p>功能描述，该部分必须以中文句号结尾。</p>
 * <p>
 * 创建日期 2018/11/11
 *
 * @author tangyiqing(jsutyq@126.com)
 * @since $version$
 */
@EnableEurekaClient
@SpringBootApplication
public class HelloWorldConsumerApplication {

    @Bean
    @LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldConsumerApplication.class, args);
    }
}
