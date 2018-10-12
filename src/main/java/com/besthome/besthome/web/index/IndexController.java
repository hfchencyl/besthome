package com.besthome.besthome.web.index;

import com.besthome.besthome.web.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController extends BaseController {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }
}
