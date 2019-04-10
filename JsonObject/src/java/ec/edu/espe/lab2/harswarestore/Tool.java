/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab2.harswarestore;

/**
 *
 * @author Cristina
 */
public class Tool {
    
    private int id;
    private String description;
    private float price;
    private int stock;
    private boolean discount;

    public Tool(int id, String description, float price, int stock, boolean discount) {
        this.id = id;
        this.description = description;
        this.price = price;
        this.stock = stock;
        this.discount = discount;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @return the stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * @return the discount
     */
    public boolean isDiscount() {
        return discount;
    }

    /**
     * @param discount the discount to set
     */
    public void setDiscount(boolean discount) {
        this.discount = discount;
    }
    
}
