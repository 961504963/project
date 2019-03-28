package com.test.test.controller;

import com.alibaba.fastjson.JSON;
import com.test.test.service.HaCmdService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class HaCmdController {

    @Resource
    private HaCmdService haCmdService;

    @RequestMapping("/jumpIndex")
    public String JumpIndex(){
        return "index";
    }

    @RequestMapping("/jumpShow")
    public String JumpShow(){
        return "show";
    }

    @RequestMapping("/jumpTest")
    public String JumpTest(){
        return "test";
    }

    @RequestMapping(value = "/QueryHaCmd",produces = "text/plain;charset=utf-8")
    @ResponseBody
    public Object queryHaCmd(@RequestParam(name = "draw", required = false, defaultValue = "0") int draw,
                             @RequestParam(name = "start", required = false, defaultValue = "0") int start,
                             @RequestParam(name = "length", required = false, defaultValue = "0") int length){
        Object obj = null;
        try {
            obj = haCmdService.HaCmdList(draw,start,length);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return JSON.toJSONString(obj);
    }


}
