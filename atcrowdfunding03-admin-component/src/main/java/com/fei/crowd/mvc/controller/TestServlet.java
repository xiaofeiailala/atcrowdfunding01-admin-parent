package com.fei.crowd.mvc.controller;

import com.fei.crowd.entity.Admin;
import com.fei.crowd.service.api.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TestServlet {

    @Autowired
    private AdminService adminService;

    @RequestMapping("/test/ssm.html")
    public String test(ModelMap modelMap){
        List<Admin> admins = adminService.getAll();

        modelMap.addAttribute("adminList",admins);
        return "test";
    }
}
