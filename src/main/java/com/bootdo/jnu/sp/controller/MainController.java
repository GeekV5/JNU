package com.bootdo.jnu.sp.controller;

import com.bootdo.common.controller.BaseController;
import com.bootdo.common.utils.Query;
import com.bootdo.jnu.sp.domain.JNU_SP_Point_DO;
import com.bootdo.jnu.sp.service.JNU_SP_Point_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@RequestMapping("/jnu/sp")
@Controller
public class MainController extends BaseController {
    @Autowired
    private JNU_SP_Point_Service jnu_sp_point_service;

    String prefix = "screen";

    @GetMapping("/baidumap")
    String main(){
        return "jnu/sp/BaiduMap";
    }

    @ResponseBody
    @GetMapping("/ListAll")
    List<JNU_SP_Point_DO> ListAll(@RequestParam Map<String, Object> params){
        Query query = new Query(params);
        List<JNU_SP_Point_DO> JNU_SP_Points_List = jnu_sp_point_service.list(query);

        return JNU_SP_Points_List;
    }
}
