package com.springmvc.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class TestTwoController {
    private static Logger logger = LoggerFactory.getLogger(TestTwoController.class);

    @RequestMapping("/testTwo")

    public String testTwo(){
        logger.info("输出testTwo页面的日志信息");
        return "testTwo";
    }
}
