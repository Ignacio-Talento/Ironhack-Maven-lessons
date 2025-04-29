package com.ironhack.w1.d3;

public class Invoice {

    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;

        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }

        if (pricePerItem > 0.0) {
            this.pricePerItem = pricePerItem;
        } else {
            this.pricePerItem = 0.0;
        }
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        };
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        if (pricePerItem > 0.0) {
            this.pricePerItem = pricePerItem;
        } else {
            this.pricePerItem = 0.0;
        };
    }

    public double getInvoiceAmount() {
        return pricePerItem * quantity;
    }

    public static void main(String[] args) {
        Invoice i1 = new Invoice("123456", "Laptop", 2, 1000.0);
        System.out.println("Part number: " + i1.getPartNumber());
        System.out.println("Part description: " + i1.getPartDescription());
        System.out.println("Quantity: " + i1.getQuantity());
        System.out.println("Price per item: " + i1.getPricePerItem());
        System.out.println("Invoice amount: " + i1.getInvoiceAmount());

        Invoice i2 = new Invoice("123456", "Laptop", -3, -1000.0);
        System.out.println("Part number: " + i2.getPartDescription());
        System.out.println("Quantity: " + i2.getQuantity());
        System.out.println("Price per item: " + i2.getPricePerItem());
        System.out.println("Invoice amount: " + i2.getInvoiceAmount());


    }
}
