package com.vvp.web;
// Generated 16 Apr, 2021 1:32:14 PM by Hibernate Tools 4.3.1



/**
 * ProductMaster generated by hbm2java
 */
public class ProductMaster  implements java.io.Serializable {


     private Integer pid;
     private String pname;
     private int stock;
     private String image;
     private double price;

    public ProductMaster() {
    }

    public ProductMaster(String pname, int stock, String image, double price) {
       this.pname = pname;
       this.stock = stock;
       this.image = image;
       this.price = price;
    }
   
    public Integer getPid() {
        return this.pid;
    }
    
    public void setPid(Integer pid) {
        this.pid = pid;
    }
    public String getPname() {
        return this.pname;
    }
    
    public void setPname(String pname) {
        this.pname = pname;
    }
    public int getStock() {
        return this.stock;
    }
    
    public void setStock(int stock) {
        this.stock = stock;
    }
    public String getImage() {
        return this.image;
    }
    
    public void setImage(String image) {
        this.image = image;
    }
    public double getPrice() {
        return this.price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }




}


