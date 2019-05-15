package com.bootdo.jnu.sp.controller;


import com.bootdo.jnu.sp.dao.JNU_SP_Point_Repository;
import com.bootdo.jnu.sp.domain.JNU_SP_Point;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/jnu/sp")
public class JNU_SP_Point_Controller {
    @Autowired
    private JNU_SP_Point_Repository jnu_sp_point_repository;

    @GetMapping("/baidumap")
    String main(){
        return "jnu/sp/BaiduMap";
    }

    @ResponseBody
    @GetMapping("/QueryAll")
    public List<JNU_SP_Point> QueryAll(){
        List<JNU_SP_Point> list = new ArrayList<JNU_SP_Point>();
        list = jnu_sp_point_repository.findAll();
        return list;
    }
}
