package com.sunm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/***
 * @Controller 采用注解的方式，可以明确的定义该类为处理请求的Controller类
 * @RequestMapping 用于定义一个请求映射，value为请求的url, 值为 / 说明，该请求首页请求，method用于指定该请求类型
 *
 */
@Controller
public class MainController {

    private static final String TAG = "MainController";

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        System.out.println("receive request localhost:8080");
        return "index";
    }

    @RequestMapping(value = "/name", method = RequestMethod.GET)
    public String name() {
        System.out.println("receive request localhost:8080/name");
        return "Hello , world";
    }

}
