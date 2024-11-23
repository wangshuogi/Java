package entity;

import java.io.Serializable;

/**
 * (PicTable)实体类
 *
 * @author makejava
 * @since 2024-11-22 15:47:51
 */
public class PicTable implements Serializable {
    private static final long serialVersionUID = 772913504853327976L;

    private Integer id;

    private String poiId;

    private String picUrl;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPoiId() {
        return poiId;
    }

    public void setPoiId(String poiId) {
        this.poiId = poiId;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

}

