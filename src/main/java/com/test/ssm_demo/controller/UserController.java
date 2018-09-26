package com.test.ssm_demo.controller;

import com.test.ssm_demo.model.User;
import com.test.ssm_demo.service.UserService;
import com.test.ssm_demo.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @description:
 * @author: yinc.luo
 * @date: 2018-05-29 15:06
 */
@Controller
@RequestMapping("/userController")
public class UserController {
    @Autowired
    private UserService userService;
//    public UserService getUserService() {
//        return userService;
//    }
//    public void setUserService(UserService userService) {
//        this.userService = userService;
//    }


    @RequestMapping("addPage")
    public String addPage(HttpServletRequest request){
        return "add";

    }

    @SuppressWarnings("finally")
    @RequestMapping("addInfo")
    public String add(User user,HttpServletRequest request){
        try {
//			user.setId(UUID.randomUUID().toString());
            System.out.println(user.getId() + ":::::" + user.getUsername() + ":::::" + user.getPassword());
            String str = userService.addInfo(user);
            System.out.println(str);
            request.setAttribute("InfoMessage", str);
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("InfoMessage", "添加信息失败！具体异常信息：" + e.getMessage());
        } finally {
            return "result";
        }
    }

    @RequestMapping("getAll")
    public String getAddInfoAll(HttpServletRequest request){
        try {
            List<User> list = userService.getAll();
            System.out.println("------User_list-----"+list.size());
            request.setAttribute("addLists", list);
            return "listAll";
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("InfoMessage", "信息载入失败！具体异常信息：" + e.getMessage());
            return "result";
        }
    }

    @SuppressWarnings("finally")
    @RequestMapping("del")
    public String del(int id,HttpServletRequest request){
        try {
            String str = userService.delete(id);
            request.setAttribute("InfoMessage", str);
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("InfoMessage", "删除信息失败！具体异常信息：" + e.getMessage());
        } finally {
            return "result";
        }
    }
    @RequestMapping("modify")
    public String modify(int id,HttpServletRequest request){
        try {
            User user = userService.findById(id);
            request.setAttribute("add", user);
            return "modify";
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("InfoMessage", "信息载入失败！具体异常信息：" + e.getMessage());
            return "result";
        }
    }
    @SuppressWarnings("finally")
    @RequestMapping("update")
    public String update(User user,HttpServletRequest request){
        try {
            String str = userService.update(user);
            request.setAttribute("InfoMessage", str);
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("InfoMessage", "更新信息失败！具体异常信息：" + e.getMessage());
        } finally {
            return "result";
        }
    }
    @RequestMapping("login")
    public String login(User user, HttpServletRequest request){
        try {
            System.out.println("------login--qian----"+user.getUsername()+","+user.getPassword()+".");
            User loginUser = null;
            loginUser=userService.login(user);
            if(loginUser!=null){
                request.setAttribute("loginUser", loginUser.getUsername());
                return "/index.jsp";
            }else{
                request.setAttribute("loginUser", "登录失败");
                return "/index.jsp";
            }
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("InfoMessage", "登录失败！具体异常信息：" + e.getMessage());
            return "result";
        }
    }


    @Test
    public void test(){
        UserController demo =new UserController();
        demo.testSpring();
    }
    public void testSpring(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("classpath:applicationContext.xml","classpath:spring-mybatis.xml");
        UserService userService=(UserServiceImpl) ctx.getBean("UserServiceImpl");
        System.out.println(userService.getAll());


    }

    }
