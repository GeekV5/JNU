package com.bootdo.jnu.sp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/jnu/sp/Rest")

public class JNU_SP_Point_RestController {
//    @Autowired
//    private JNU_SP_Point_Repository jnu_sp_point_repository;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @ResponseBody
    @RequestMapping("/QueryAll")
    public List<Map<String,Object>> QueryAll(){
        String ExSQL = "select * from jnu_sp_point";
        List<Map<String, Object>> list =  jdbcTemplate.queryForList(ExSQL);
        for (Map<String, Object> map : list) {
            Set<Map.Entry<String,Object>> entries = map.entrySet();

            if(entries != null) {

                Iterator<Map.Entry<String, Object>> iterator = entries.iterator( );
                while(iterator.hasNext( )) {
                    Map.Entry<String, Object> entry =(Map.Entry<String, Object>) iterator.next( );
                    Object key = entry.getKey( );
                    Object value = entry.getValue();
                    System.out.println(key+":"+value);
                }
            }
        }
        return list;
    }

}
