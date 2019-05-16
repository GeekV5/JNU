package com.bootdo.jnu.sp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/jnu/sp")
public class JNU_SP_Point_PageController {

    @GetMapping("/baidumap")
    String main(){
        return "jnu/sp/BaiduMap";
    }




}
