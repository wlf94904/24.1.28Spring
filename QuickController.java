package com.itheima.controller;

import com.itheima.service.QuickService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author hhm
 * @version 1.0
 */

@Controller
@RequestMapping("/quick")
public class QuickController {

    //直接注入Service进行使用
    @Autowired
    private QuickService quickService;

//    @RequestMapping(value = {"/show","/showxxx","/showyyy"},method = RequestMethod.GET)
    @GetMapping("/show")
//    @PostMapping("/show")
//    @PutMapping
//    @DeleteMapping
    public String show(){
        System.out.println("show running..."+quickService);
        return "/index.jsp";
    }

    @RequestMapping("/show2")
    public String show2(){
        System.out.println("show222 running..."+quickService);
        return "/index.jsp";
    }
}
