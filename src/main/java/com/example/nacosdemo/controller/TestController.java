package com.example.nacosdemo.controller;

import com.alibaba.nacos.api.config.ConfigType;
import com.alibaba.nacos.api.config.annotation.NacosConfigurationProperties;
import com.example.nacosdemo.config.PropertiesValue;
import com.example.nacosdemo.service.EchoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.cloud.netflix.ribbon.RibbonAutoConfiguration;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;
import org.springframework.cloud.openfeign.ribbon.FeignRibbonClientAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @description:
 * @author: LuckyBoy
 * @create: 2020-08-14 10:31
 **/
@RestController
@RequestMapping(value = "discovery")
@ImportAutoConfiguration({RibbonAutoConfiguration.class, FeignRibbonClientAutoConfiguration.class, FeignAutoConfiguration.class})
public class TestController {

    @Resource
    private PropertiesValue propertiesValue;

    @Autowired
    private EchoService echoService;

    @GetMapping("/test")
    @ApiOperation(value = "你好哈哈哈哈哈")
    @ResponseBody
    public String one () {
        System.out.println("---------------");
        return "nacos demo2";
    }

    @GetMapping("/two")
    @ApiOperation(value = "这是一个测试接口")
    public String two (@ApiParam(name = "name",value = "名字",required = true) String name) {
        return "你的名字是： " + name;
    }

    @GetMapping("/feginTest")
    @ResponseBody
    public String feginTest () {
        return echoService.echo();
    }

}
