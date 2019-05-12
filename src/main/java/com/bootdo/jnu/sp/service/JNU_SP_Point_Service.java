package com.bootdo.jnu.sp.service;


import com.bootdo.common.utils.Query;
import com.bootdo.jnu.sp.domain.JNU_SP_Point_DO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface JNU_SP_Point_Service {

    List<JNU_SP_Point_DO> list(Map<String, Object> map);

    List<JNU_SP_Point_DO> queryList(Query query);


}
