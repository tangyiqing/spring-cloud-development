package com.tyq.spring.cloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <p>功能描述，该部分必须以中文句号结尾。</p>
 * <p>
 * 创建日期 2018/11/9
 *
 * @author tangyiqing(jsutyq@126.com)
 * @since $version$
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}
