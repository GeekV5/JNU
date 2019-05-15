package com.bootdo.jnu.sp.service.impl;

import com.bootdo.jnu.sp.dao.JNU_SP_Point_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JNU_SP_Point_ServiceImpl  {
    @Autowired
    private JNU_SP_Point_Repository jnu_sp_point_repository;

//    @Override
//    public List<JNU_SP_Point> list(Map<String, Object> map) {
//        return jnu_sp_point_repository.list(map);
//    }

}
