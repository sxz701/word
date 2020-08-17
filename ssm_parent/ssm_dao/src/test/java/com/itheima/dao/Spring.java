package com.itheima.dao;

import com.itheima.pojo.Items;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.security.auth.login.AppConfigurationEntry;
import java.util.List;

/**
 * @Author: sunxinzhi
 * lbcdzyy
 * @Date: 2020/7/30 16:26
 */
public class Spring {
    @Test
    public void test01(){
        ApplicationContext cpa = new ClassPathXmlApplicationContext("classpath:spring-mybatis.xml");
        ItemsDao itemsDao = (ItemsDao)cpa.getBean("itemsDao");
        List<Items> all = itemsDao.findAll();
        System.out.println(all);
    }
}
