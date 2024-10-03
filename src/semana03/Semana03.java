/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana03;

import org.tempuri.Order;

/**
 *
 * @author IDAT
 */
public class Semana03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int userId = 1;
        Order intArray = createNewOrder(userId);
        if (intArray !=null) {
            System.out.println("UserId :" + intArray.getUserId());
            System.out.println("OrderId :" + intArray.getOrderId());
            System.out.println("Status :" +  intArray.getStatus());
        }
    }

    private static Order createNewOrder(int userId) {
        org.tempuri.OrderService service = new org.tempuri.OrderService();
        org.tempuri.OrderServiceSoap port = service.getOrderServiceSoap();
        return port.createNewOrder(userId);
    }
    
}
