package controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bank.pojo.AccountInfo;
import com.bank.service.AccountInfoservice;

@Controller
@RequestMapping("/user")
public class AccountInfocontroller {
@Resource
private AccountInfoservice accountinfoservice;
/**
 * 用户登录
 */
@RequestMapping("/login")
public ModelAndView login(HttpServletRequest req, ModelAndView mv) {
	List<AccountInfo> list =accountinfoservice.getAccount();
	
    if (list != null) {//登录成功进入首页
    	mv.addObject("list",list);
        mv.setViewName("index");
    } else {//登录失败回到登录页面
        mv.addObject("message", "用户名或密码输入错误,请重新输入");
        mv.setViewName("login");
    }
	return mv;

	}
}

