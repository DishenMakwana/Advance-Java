package com.vvp.web;
// Generated 16 Apr, 2021 1:32:14 PM by Hibernate Tools 4.3.1



/**
 * Products generated by hbm2java
 */
public class Products  implements java.io.Serializable {


     private Integer productOrderId;
     private int orderId;
     private int productId;
     private String productName;
     private double productPrice;
     private int productQty;

    public Products() {
    }

    public Products(int orderId, int productId, String productName, double productPrice, int productQty) {
       this.orderId = orderId;
       this.productId = productId;
       this.productName = productName;
       this.productPrice = productPrice;
       this.productQty = productQty;
    }
   
    public Integer getProductOrderId() {
        return this.productOrderId;
    }
    
    public void setProductOrderId(Integer productOrderId) {
        this.productOrderId = productOrderId;
    }
    public int getOrderId() {
        return this.orderId;
    }
    
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    public int getProductId() {
        return this.productId;
    }
    
    public void setProductId(int productId) {
        this.productId = productId;
    }
    public String getProductName() {
        return this.productName;
    }
    
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public double getProductPrice() {
        return this.productPrice;
    }
    
    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }
    public int getProductQty() {
        return this.productQty;
    }
    
    public void setProductQty(int productQty) {
        this.productQty = productQty;
    }




}


