package com.bootdo.screen.controller;

import com.bootdo.common.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/screen")
@Controller
public class UrlController extends BaseController {
    String prefix = "screen";

    @GetMapping("/main")
    String main(){
        return "screen/main";
    }

}
