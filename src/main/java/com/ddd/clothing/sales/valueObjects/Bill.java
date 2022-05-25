package com.ddd.clothing.sales.valueObjects;

import com.ddd.clothing.sales.entities.Order;

public class Bill {
    private SellerID sellerID;
    private Date date;
    private Order order;
    private Total total;
    private Payment payment;

    public Bill(SellerID sellerID, Date date, Order order, Total total, Payment payment) {
        this.sellerID = sellerID;
        this.date = date;
        this.order = order;
        this.total = total;
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "Bill [" +
                "\nsellerID=" + sellerID +
                "\n date=" + date +
                "\n order=" + order +
                "\n total=" + total +
                "\n payment=" + payment +
                "\n]";
    }

    public String value() {
        return this.toString();
    }
}
