package com.offcn.controller;

import com.offcn.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

@Controller //thymeleaf不能使用restcontroller
public class FirstController {

    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("message","欢迎来到优就业学习");

        User user=new User(1L,"小李",23);
        model.addAttribute("user",user);

        Map map=new HashMap();
        map.put("id",2);
        map.put("name","张三2");
        map.put("age",24);
        model.addAttribute("map",map);

        return "index";
    }



    @RequestMapping("/sec")
    public String second(Model model){
        List<User> list=new ArrayList<>();
        User user1=new User(1L,"小李1",23);
        User user2=new User(2L,"小李2",24);
        User user3=new User(3L,"小李3",25);
        list.add(user1);
        list.add(user2);
        list.add(user3);

        model.addAttribute("list",list);
        return "index2";
    }

    @RequestMapping("/index3")
    public String index3(Model model){
        model.addAttribute("message","中公你好");
        model.addAttribute("name","张三");
        model.addAttribute("username","李四");

        return "index3";
    }


    @RequestMapping("/index4")
    public String index4(Model model){
        model.addAttribute("flag","yes");
        model.addAttribute("menu","manage");
        model.addAttribute("manage","manage");

        return "index4";
    }


    @RequestMapping("/index5")
    public String index5(Model model){
        //定义日期
        Date date=new Date();
        model.addAttribute("date",date);
        //定义数字
        Double number=123.456d;
        model.addAttribute("num",number);
        //定义文本
        String str="Thymeleaf是Web和独立环境的现代服务器端Java模板引擎，能够处理HTML，XML，JavaScript，CSS甚至纯文本。\\r\\n\" + \n" +
                "\t  \t\t\"Thymeleaf的主要目标是提供一种优雅和高度可维护的创建模板的方式。为了实现这一点，它建立在自然模板的概念上，将其逻辑注入到模板文件中，不会影响模板被用作设计原型。这改善了设计的沟通，弥补了设计和开发团队之间的差距。\\r\\n\" + \n" +
                "\t  \t\t\"Thymeleaf也从一开始就设计了Web标准 - 特别是HTML5 - 允许您创建完全验证的模板，如果这是您需要的\\r\\n";
        model.addAttribute("str",str);

        return "index5";
    }



}
