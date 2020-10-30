package com.example.nacosdemo.config;

import com.alibaba.nacos.api.config.ConfigType;
import com.alibaba.nacos.api.config.annotation.NacosConfigurationProperties;
import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.example.nacosdemo.bean.QiYu;
import com.example.nacosdemo.bean.WeiXin;
import com.example.nacosdemo.bean.cheDuo;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @author: LuckyBoy
 * @create: 2020-08-14 10:37
 **/
@NacosConfigurationProperties(dataId = "testService", autoRefreshed = true, ignoreNestedProperties = true, type = ConfigType.YAML)
@Configuration
public class PropertiesValue {

    @NacosValue(value = "127.0.0.1:8848", autoRefreshed = true)
    private String thisUrl;

    public String getThisUrl() {
        return thisUrl;
    }

    public void setThisUrl(String thisUrl) {
        this.thisUrl = thisUrl;
    }

    @Override
    public String toString() {
        return "PropertiesValue{" +
                "thisUrl='" + thisUrl + '\'' +
                '}';
    }
}
