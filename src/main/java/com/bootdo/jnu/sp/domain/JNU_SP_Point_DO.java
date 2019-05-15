package com.bootdo.jnu.sp.domain;


import javax.persistence.Entity;
import javax.persistence.Table;

/*
*
* */
@Entity
@Table
public class JNU_SP_Point_DO {

    private String id;        //主键
    private String longitude; //经度
    private String latitude;  //纬度
    private String src;       //监控资源
    private String name;      //监控地点名称
    private String remark;    //备注

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "JNU_SP_Point_DO{" +
                "id='" + id + '\'' +
                ", longitude='" + longitude + '\'' +
                ", latitude='" + latitude + '\'' +
                ", src='" + src + '\'' +
                ", name='" + name + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
