package com.bootdo.jnu.sp.service.impl;

import com.bootdo.jnu.sp.dao.JNU_SP_Point_Dao;
import com.bootdo.jnu.sp.domain.JNU_SP_Point_DO;
import com.bootdo.jnu.sp.service.JNU_SP_Point_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class JNU_SP_Point_ServiceImpl  {
    @Autowired
    private JNU_SP_Point_Dao jnu_sp_point_dao;

//    @Override
//    public List<JNU_SP_Point_DO> list(Map<String, Object> map) {
//        return jnu_sp_point_dao.list(map);
//    }

}
