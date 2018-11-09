package com.tyq.spring.cloud.helloworld.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>功能描述，该部分必须以中文句号结尾。</p>
 * <p>
 * 创建日期 2018/11/6
 *
 * @author tangyiqing(jsutyq@126.com)
 * @since $version$
 */
@RestController
public class HelloWorldController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World Spring Cloud";
    }

    @RequestMapping("/hi")
    public String home(@RequestParam(value = "name", defaultValue = "tyq") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }
}
