package com.itheima.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.itheima.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

/**
 * @author hhm
 * @version 1.0
 */
@Controller
public class ParamController {
    @GetMapping("/user/{id}/{xxx}")
    public String findUserById(
            @PathVariable("id") int id,
            @PathVariable("xxx") String yyy
    ){
        System.out.println("id==>"+id);
        System.out.println("yyy==>"+yyy);
        return "/index.jsp";
    }

    @GetMapping("/param9")
    public String param9(@RequestBody User user) throws JsonProcessingException {
        System.out.println(user);
        return "/index.jsp";
    }

    @GetMapping("/param8")
    public String param8(@RequestBody String body) throws JsonProcessingException {
        //使用jackson进行转换，将json格式的字符串转换成User对象
        ObjectMapper objectMapper=new ObjectMapper();
        User user=objectMapper.readValue(body, User.class);
        System.out.println(user);
        return "/index.jsp";
    }

    @GetMapping("/param7")
    public String param7(@RequestBody String body){
        System.out.println(body);
        return "/index.jsp";
    }

    @GetMapping("/param6")
    public String param6(User user){
        System.out.println(user);
        return "/index.jsp";
    }

    @GetMapping("/param5")
    public String param5(@RequestParam Map<String,String> map){
        map.forEach((k,v)->{
            System.out.println(k+"==>"+v);
        });
        return "/index.jsp";
    }


    @GetMapping("/param4")
    public String param4(@RequestParam List<String> hobby){
        for(String s:hobby){
            System.out.println(s);
        }
        return "/index.jsp";
    }

    @GetMapping("/param3")
    public String param3(String[] hobby){
        for(String s:hobby){
            System.out.println(s);
        }
        return "/index.jsp";
    }

    @GetMapping("/param2")
    public String param2(@RequestParam(value = "username",required = false,defaultValue = "haohao") String name,Integer age){
        System.out.println(name+"===="+age);
        return "/index.jsp";
    }

    @GetMapping("/param1")
    public String param1(String username,int age){
        System.out.println(username+"===="+age);
        return "/index.jsp";
    }

}
