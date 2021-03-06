package com.vvp.web;
// Generated 16 Apr, 2021 1:32:14 PM by Hibernate Tools 4.3.1



/**
 * PersonalDetails generated by hbm2java
 */
public class PersonalDetails  implements java.io.Serializable {


     private Integer detailId;
     private int userId;
     private String userName;
     private String mobileNumber;
     private String address;
     private String paymentMethod;

    public PersonalDetails() {
    }

    public PersonalDetails(int userId, String userName, String mobileNumber, String address, String paymentMethod) {
       this.userId = userId;
       this.userName = userName;
       this.mobileNumber = mobileNumber;
       this.address = address;
       this.paymentMethod = paymentMethod;
    }
   
    public Integer getDetailId() {
        return this.detailId;
    }
    
    public void setDetailId(Integer detailId) {
        this.detailId = detailId;
    }
    public int getUserId() {
        return this.userId;
    }
    
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public String getUserName() {
        return this.userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getMobileNumber() {
        return this.mobileNumber;
    }
    
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPaymentMethod() {
        return this.paymentMethod;
    }
    
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }




}


