package com.besthome.besthome.web.index;

import com.besthome.besthome.web.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class IndexController extends BaseController {

    @RequestMapping("/index")
    public String index(HttpServletRequest request) {
        HttpSession session = request.getSession();//获取session并将userName存入session对象
        session.setAttribute("userName", "chenliang");
        return "index";
    }
}
