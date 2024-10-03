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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int userId= 1;
        int orderId= 19;
        Order intArray = getOrderById_1(userId , orderId);
        if (intArray != null) {
            System.out.println("UserId :" + intArray.getUserId());
            System.out.println("OrderId :" + intArray.getOrderId());
            System.out.println("Status :" +  intArray.getStatus());
        }
    }
    private static Order getOrderById_1(int userId, int orderId) {
        org.tempuri.OrderService service = new org.tempuri.OrderService();
        org.tempuri.OrderServiceSoap port = service.getOrderServiceSoap();
        return port.getOrderById(userId, orderId);
    }
    
}
