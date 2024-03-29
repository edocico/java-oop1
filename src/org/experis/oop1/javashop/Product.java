package org.experis.oop1.javashop;


import java.util.Random;

public class Product {
    private int code;
    private String name;
    private String description;
    private double price;
    private int iva;

    Random random = new Random();

    private int x = random.nextInt(99999999);

    // setter
    public void setCode(int code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    // getter

    public double getPrice() {
        return price;
    }

    public int getIva() {
        return iva;
    }

    // constructor


    public Product() {
        setCode(x);

    }

    // methods

    public double getBasePrice(double price, int iva) {

        double productIva = (price * iva) / 100;
        double basePrice = price - productIva;
        return basePrice;
    }


}
