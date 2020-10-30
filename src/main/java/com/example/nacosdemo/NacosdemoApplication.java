package com.example.nacosdemo;

import com.alibaba.nacos.api.config.ConfigType;
import com.alibaba.nacos.api.config.annotation.NacosConfigurationProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;
import org.springframework.cloud.openfeign.ribbon.FeignRibbonClientAutoConfiguration;

@SpringBootApplication
@EnableFeignClients(basePackages = {"com.example.nacosdemo.service"})
@NacosConfigurationProperties(dataId = "testService", autoRefreshed = true, ignoreNestedProperties = true, type = ConfigType.YAML)
//@ImportAutoConfiguration({RibbonAutoConfiguration.class, FeignRibbonClientAutoConfiguration.class, FeignAutoConfiguration.class})
public class NacosdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosdemoApplication.class, args);
    }

}
