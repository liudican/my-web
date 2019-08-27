package com.baizhi.springtest;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestDataSource {

    public static void main(String[] args) {
        ApplicationContext app = new AnnotationConfigApplicationContext(DruidDataSourceConf.class);
        // @bean 方法名为注入的bean名称
        DruidDataSource dataSource = (DruidDataSource) app.getBean("getDruidDataSource");

        System.out.println(dataSource);

//        String[] names = app.getBeanDefinitionNames();
//        for (String name : names) {
//            System.out.println(name);
//        }

    }
}
