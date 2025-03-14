package es.uah.matcomp.e1.ejerciciosclases.b.b.CustomerInvoice;

import es.uah.matcomp.e1.ejerciciosclases.b.b.CustomerInvoice.Customer;

public class Invoice {
    private int id;
    private Customer customer1;
    private double amount;
    public Invoice(int id, Customer customer1, double amount) {
        this.id = id;
        this.customer1 = customer1;
        this.amount = amount;
    }
    public int getId() {
        return id;
    }
    public Customer getCustomer() {
        return customer1;
    }

    public void setCustomer(Customer customer1) {
        this.customer1 = customer1;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public int getCustomerId() {
        return customer1.getId();
    }
    public String getCustomerName() {
        return customer1.getName();
    }
    public int getCustomerDiscount() {
        return customer1.getDiscount();
    }
    public double getAmountAfterDiscount() {
        return amount * (1 - (double) customer1.getDiscount() / 100);
    }
    public String toString() {
        return "Invoice[id=" + id + ",customer=" + customer1.getName() + "(" + id + ")" + "(" + customer1.getDiscount() + "%),amount=" + amount + "]";
    }
}
