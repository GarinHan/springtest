package com.springmvc.web;

//import org.apache.logging.log4j.Logger;
import org.slf4j.Logger;
//import org.apache.logging.log4j.Logger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.*;
import com.springmvc.web.AnnOne;
import java.lang.reflect.Field;//用于反射得到注解的值
//import java.util.logging.Logger;


@Controller
@AnnOne
public class testOneController {

    //private static Logger logger = LoggerFactory.getLogger(testOneController.class);
    //AnnOne annOne = AnnOne.class.getAnnotation(AnnOne.class);

    private static Logger logger = LoggerFactory.getLogger(testOneController.class);

    @RequestMapping("/testOne")
    public String testOne(Model model,String name){
        logger.info("输出信息log日志testOneController控制器log");
        //System.out.println(getClass().getClassLoader().getResource("src/main/log4j.properties"));
        model.addAttribute("name",name);

        try {
            Class<?> clazz = Class.forName("com.springmvc.web.testOneController");
            AnnOne annOne = clazz.getAnnotation(AnnOne.class);//获得注解的内容
            System.out.println(annOne.value());//打印注解的内容
        }catch (ClassNotFoundException e){
            logger.error("ClassNotFoundException");
        }

        return "testOne";
    }

    @RequestMapping("/testThree")
    public String testThree(){
        return "testThree";
    }
}
