package com.fei.crowd.test;


import com.fei.crowd.entity.Admin;
import com.fei.crowd.mapper.AdminMapper;
import com.fei.crowd.service.api.AdminService;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.context.support.XmlWebApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-persist-mybatis.xml","classpath:spring-persist-tx.xml"})
public class CrowdTest {
    @Autowired
    DataSource dataSource;

    @Autowired
    AdminMapper adminMapper;

    @Autowired
    AdminService adminService;

    @Test
    public void setAdminServiceTest(){
        Admin admin = new Admin(null, "jre", "123123", "大户", "48988@qq.com", null);
        adminService.saveAdmin(admin);
    }

    @Test
    public void adminMapperTest(){
//         Admin admin = new Admin(null, "tom", "123123", "二宁", "123123@qq.com", null);
//         int insert = adminMapper.insert(admin);
//         System.out.println(insert);

    }

    @Test
    public void test1() throws SQLException {
        Connection connection = dataSource.getConnection();
        System.out.println(connection);


    }
}
