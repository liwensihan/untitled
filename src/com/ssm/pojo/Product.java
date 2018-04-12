package com.ssm.pojo;

/**
 * Created by Maze on 2018-04-12.
 */
public class Product {
    private String id;
    private String productname;
    private String descs;
    private String cid;
    private Catagory cg;
    public Catagory getCg() {
        return cg;
    }

    public void setCg(Catagory cg) {
        this.cg = cg;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getDescs() {
        return descs;
    }

    public void setDescs(String descs) {
        this.descs = descs;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }
}
