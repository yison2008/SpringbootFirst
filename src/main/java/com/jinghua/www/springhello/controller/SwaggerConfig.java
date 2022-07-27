package com.jinghua.www.springhello.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2 //开启Swagger的使用
public class SwaggerConfig {

    @Bean  //Swagger的使用主要是要将docket对象传入IOC容器
    public Docket docket1(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo1()) //关于文档的各种信息
                .enable(true) //使Swagger生效
                .groupName("111")
                .select()//选择扫描的接口
                .apis(RequestHandlerSelectors.basePackage("com.jinghua.www.springhello.controller"))//指定扫描的接口
                .build();
    }

    @Bean  //Swagger的使用主要是要将docket对象传入IOC容器
    public Docket docket2(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo2()) //关于文档的各种信息
                .enable(true) //使Swagger生效
                .groupName("222")
                .select()//选择扫描的接口
                .apis(RequestHandlerSelectors.basePackage("com.jinghua.www.springhello.controller"))//指定扫描的接口
                .build();
    }

    @Bean  //Swagger的使用主要是要将docket对象传入IOC容器
    public Docket docket3(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo3()) //关于文档的各种信息
                .enable(true) //使Swagger生效
                .groupName("333")
                .select()//选择扫描的接口
                .apis(RequestHandlerSelectors.basePackage("com.jinghua.www.springhello.controller"))//指定扫描的接口
                .build();
    }

    public ApiInfo apiInfo1(){
        Contact contact = new Contact("jinghua1","https://www.baidu.com/","13710003368@163.com");//个人的联系方式
        return new ApiInfo("SpringBoot+Swagger开发文档1", "第一个SpringBoot开发文档", "1.0", "urn:tos",contact, "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0", new ArrayList<>());//文档的各种信息
    }

    public ApiInfo apiInfo2(){
        Contact contact = new Contact("jinghua2","https://www.baidu.com/","13710003368@163.com");//个人的联系方式
        return new ApiInfo("SpringBoot+Swagger开发文档2", "第一个SpringBoot开发文档", "1.0", "urn:tos",contact, "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0", new ArrayList<>());//文档的各种信息
    }

    public ApiInfo apiInfo3(){
        Contact contact = new Contact("jinghua3","https://www.baidu.com/","13710003368@163.com");//个人的联系方式
        return new ApiInfo("SpringBoot+Swagger开发文档3", "第一个SpringBoot开发文档", "1.0", "urn:tos",contact, "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0", new ArrayList<>());//文档的各种信息
    }
}