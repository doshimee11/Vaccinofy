/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Order;

import java.util.ArrayList;

/**
 *
 * @author kalindjoshi
 */

public class OrderCatalog {
    
    private ArrayList<Order> orderList;
    
    public OrderCatalog(){
        orderList = new ArrayList<Order>();
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }
    
    public Order addNewOrder(Order order){
        orderList.add(order);
        return order;
    }
    
}
