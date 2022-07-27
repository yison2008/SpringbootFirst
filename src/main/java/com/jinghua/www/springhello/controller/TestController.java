package com.jinghua.www.springhello.controller;

import io.swagger.annotations.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

//控制层注解
@Controller
@Api("用户管理")
public class TestController {

    @ApiOperation("用户新增")
    @ApiImplicitParams({ @ApiImplicitParam(paramType = "body", dataType = "MessageParam", name = "param", value = "信息参数", required = true) })
    @RequestMapping(value="/addUser", method= RequestMethod.POST)
    @ResponseBody//加了这个就不是跳转jsp页面而是在页面打印Map对象
    public Map<String,String> addUser(){
        Map<String,String> map=new HashMap<>();
        map.put("operation","用户新增");
        return map;
    }

    @ApiOperation("用户删除")
    @RequestMapping(value="/deleteUser", method= RequestMethod.GET)
    @ResponseBody//加了这个就不是跳转jsp页面而是在页面打印Map对象
    public Map<String,String> deleteUser(@ApiParam(name="userName", value = "用户名", required = true)
                                             @RequestParam(value="userName", required = false) String userName){
        Map<String,String> map=new HashMap<>();

        //url中不存在userName属性时会报错“Whitelabel Error Page”
        if(userName.equals("") ){
            System.out.println("用户名不能为空");
            map.put("用户名","不能为空");
        }else {
            map.put("deletedUser",userName);
        }
        return map;
    }

    @ApiOperation("用户修改")
    @RequestMapping(value="/updateUser", method= RequestMethod.POST)
    @ResponseBody//加了这个就不是跳转jsp页面而是在页面打印Map对象
    public Map<String,String> test(){
        Map<String,String> map=new HashMap<>();
        map.put("operation","用户修改");
        return map;
    }

    //访问localhost:8080/chapter2/index
    @RequestMapping(value="/idx", method= RequestMethod.GET)
    public String index(){
        return "index";//跳转到名字为index.jsp的页面文件
    }
}
