package com.tyq.spring.cloud.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
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

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World Spring Cloud";
    }
}
