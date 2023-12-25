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

public class Order {
    
    private ArrayList<OrderItem> orderItemList;
    private static int count = 1;
    private int orderID;
    private String orderStatus;
    
    public Order(){
        orderID = count;
        orderItemList = new ArrayList<OrderItem>();
        count++;
    }
    
    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
    
    public OrderItem addOrderItem(){
        OrderItem orderItem = new OrderItem();
        orderItemList.add(orderItem);
        return  orderItem;
    }
    
    public void removeOrderItem(OrderItem orderItem){
        orderItemList.remove(orderItem);
    }
    
}
