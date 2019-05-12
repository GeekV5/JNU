package com.bootdo.jnu.sp.service;

import com.bootdo.jnu.sp.domain.JNU_SP_Point_DO;

import java.util.List;
import java.util.Map;

public interface JNU_SP_Point_Service {
    JNU_SP_Point_DO get(String id);

    List<JNU_SP_Point_DO> list(Map<String, Object> map);


}
