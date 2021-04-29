/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vvp.web;

import java.io.Serializable;

/**
 *
 * @author Dishen Makwana
 */
public class Product implements Serializable {

    int qty;
    double price;
    String pname;

    public Product(int qty, double price, String pname) {
        this.qty = qty;
        this.price = price;
        this.pname = pname;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product(int qty, double price) {
        this.qty = qty;
        this.price = price;
    }
}
