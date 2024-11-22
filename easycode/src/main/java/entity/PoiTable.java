package entity;

import java.io.Serializable;

/**
 * (PoiTable)实体类
 *
 * @author makejava
 * @since 2024-11-22 15:47:51
 */
public class PoiTable implements Serializable {
    private static final long serialVersionUID = 420072174704025006L;

    private Integer id;

    private String name;

    private String position;

    private Object lng;

    private Object lat;

    private String conver;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Object getLng() {
        return lng;
    }

    public void setLng(Object lng) {
        this.lng = lng;
    }

    public Object getLat() {
        return lat;
    }

    public void setLat(Object lat) {
        this.lat = lat;
    }

    public String getConver() {
        return conver;
    }

    public void setConver(String conver) {
        this.conver = conver;
    }

}

