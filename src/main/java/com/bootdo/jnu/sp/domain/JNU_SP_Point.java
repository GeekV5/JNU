package com.bootdo.jnu.sp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "jnu_sp_point")
public class JNU_SP_Point {

    @Column(name = "id")
    private String id;        //主键

    @Column(name = "longitude")
    private String longitude; //经度

    @Column(name = "latitude")
    private String latitude;  //纬度

    @Column(name = "src")
    private String src;       //监控资源

    @Column(name = "name")
    private String name;      //监控地点名称

    @Column(name = "remark")
    private String remark;    //备注

    //声明 无参数的构造函数
    public JNU_SP_Point(){}

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
        return "JNU_SP_Point{" +
                "id='" + id + '\'' +
                ", longitude='" + longitude + '\'' +
                ", latitude='" + latitude + '\'' +
                ", src='" + src + '\'' +
                ", name='" + name + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
