package com.ironhack.w2.d1.CFU;

import java.util.ArrayList;
import java.util.List;

public class Invoice {
    private String id;
    private double total;
    private boolean isPaid;
    private List<InvoiceItem> invoiceItems;

    public Invoice(String id, double total, boolean isPaid, List<InvoiceItem> invoiceItems) {
        this.id = id;
        this.total = total;
        this.isPaid = isPaid;
        this.invoiceItems = invoiceItems;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public List<InvoiceItem> getInvoiceItems() {
        return invoiceItems;
    }

    public void setInvoiceItems(List<InvoiceItem> invoiceItems) {
        this.invoiceItems = invoiceItems;
    }

    public void addInvoiceItem(InvoiceItem item) {
        if (this.invoiceItems == null) {
            this.invoiceItems = new ArrayList<>();
        }
        this.invoiceItems.add(item);
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "id='" + id + '\'' +
                ", total=" + total +
                ", isPaid=" + isPaid +
                ", invoiceItems=" + invoiceItems +
                '}';
    }
}
