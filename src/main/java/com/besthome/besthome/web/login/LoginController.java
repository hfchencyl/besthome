package com.besthome.besthome.web.login;

import com.besthome.besthome.web.base.BaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController extends BaseController {

    @RequestMapping("/login")
    public String demoMethod() {
        return "login";
    }
}
