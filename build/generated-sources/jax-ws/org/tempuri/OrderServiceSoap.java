
package org.tempuri;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.5
 * Generated source version: 2.2
 * 
 */
@WebService(name = "OrderServiceSoap", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface OrderServiceSoap {


    /**
     * 
     * @param articleId
     * @return
     *     returns org.tempuri.Article
     */
    @WebMethod(operationName = "GetArticleById", action = "http://tempuri.org/GetArticleById")
    @WebResult(name = "GetArticleByIdResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetArticleById", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetArticleById")
    @ResponseWrapper(localName = "GetArticleByIdResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetArticleByIdResponse")
    public Article getArticleById(
        @WebParam(name = "ArticleId", targetNamespace = "http://tempuri.org/")
        int articleId);

    /**
     * 
     * @param articleName
     * @return
     *     returns org.tempuri.Article
     */
    @WebMethod(operationName = "GetArticleByName", action = "http://tempuri.org/GetArticleByName")
    @WebResult(name = "GetArticleByNameResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetArticleByName", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetArticleByName")
    @ResponseWrapper(localName = "GetArticleByNameResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetArticleByNameResponse")
    public Article getArticleByName(
        @WebParam(name = "ArticleName", targetNamespace = "http://tempuri.org/")
        String articleName);

    /**
     * 
     * @param articleNamePattern
     * @return
     *     returns org.tempuri.ArrayOfArticle
     */
    @WebMethod(operationName = "SearchArticles", action = "http://tempuri.org/SearchArticles")
    @WebResult(name = "SearchArticlesResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "SearchArticles", targetNamespace = "http://tempuri.org/", className = "org.tempuri.SearchArticles")
    @ResponseWrapper(localName = "SearchArticlesResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.SearchArticlesResponse")
    public ArrayOfArticle searchArticles(
        @WebParam(name = "ArticleNamePattern", targetNamespace = "http://tempuri.org/")
        String articleNamePattern);

    /**
     * 
     * @param zip
     * @param firstName
     * @param lastName
     * @param password
     * @param city
     * @param street
     * @param username
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "CreateUser", action = "http://tempuri.org/CreateUser")
    @WebResult(name = "CreateUserResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "CreateUser", targetNamespace = "http://tempuri.org/", className = "org.tempuri.CreateUser")
    @ResponseWrapper(localName = "CreateUserResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.CreateUserResponse")
    public boolean createUser(
        @WebParam(name = "Username", targetNamespace = "http://tempuri.org/")
        String username,
        @WebParam(name = "Password", targetNamespace = "http://tempuri.org/")
        String password,
        @WebParam(name = "FirstName", targetNamespace = "http://tempuri.org/")
        String firstName,
        @WebParam(name = "LastName", targetNamespace = "http://tempuri.org/")
        String lastName,
        @WebParam(name = "Street", targetNamespace = "http://tempuri.org/")
        String street,
        @WebParam(name = "City", targetNamespace = "http://tempuri.org/")
        String city,
        @WebParam(name = "ZIP", targetNamespace = "http://tempuri.org/")
        String zip);

    /**
     * 
     * @param password
     * @param username
     */
    @WebMethod(operationName = "DeleteUser", action = "http://tempuri.org/DeleteUser")
    @RequestWrapper(localName = "DeleteUser", targetNamespace = "http://tempuri.org/", className = "org.tempuri.DeleteUser")
    @ResponseWrapper(localName = "DeleteUserResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.DeleteUserResponse")
    public void deleteUser(
        @WebParam(name = "Username", targetNamespace = "http://tempuri.org/")
        String username,
        @WebParam(name = "Password", targetNamespace = "http://tempuri.org/")
        String password);

    /**
     * 
     * @param password
     * @param username
     * @return
     *     returns int
     */
    @WebMethod(operationName = "Login", action = "http://tempuri.org/Login")
    @WebResult(name = "LoginResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Login", targetNamespace = "http://tempuri.org/", className = "org.tempuri.Login")
    @ResponseWrapper(localName = "LoginResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.LoginResponse")
    public int login(
        @WebParam(name = "Username", targetNamespace = "http://tempuri.org/")
        String username,
        @WebParam(name = "Password", targetNamespace = "http://tempuri.org/")
        String password);

    /**
     * 
     */
    @WebMethod(operationName = "Logout", action = "http://tempuri.org/Logout")
    @RequestWrapper(localName = "Logout", targetNamespace = "http://tempuri.org/", className = "org.tempuri.Logout")
    @ResponseWrapper(localName = "LogoutResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.LogoutResponse")
    public void logout();

    /**
     * 
     * @param userId
     * @return
     *     returns org.tempuri.ArrayOfInt
     */
    @WebMethod(operationName = "GetOrders", action = "http://tempuri.org/GetOrders")
    @WebResult(name = "GetOrdersResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetOrders", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetOrders")
    @ResponseWrapper(localName = "GetOrdersResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetOrdersResponse")
    public ArrayOfInt getOrders(
        @WebParam(name = "UserId", targetNamespace = "http://tempuri.org/")
        int userId);

    /**
     * 
     * @param orderId
     * @param userId
     * @return
     *     returns org.tempuri.Order
     */
    @WebMethod(operationName = "GetOrderById", action = "http://tempuri.org/GetOrderById")
    @WebResult(name = "GetOrderByIdResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetOrderById", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetOrderById")
    @ResponseWrapper(localName = "GetOrderByIdResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetOrderByIdResponse")
    public Order getOrderById(
        @WebParam(name = "UserId", targetNamespace = "http://tempuri.org/")
        int userId,
        @WebParam(name = "OrderId", targetNamespace = "http://tempuri.org/")
        int orderId);

    /**
     * 
     * @param userId
     * @return
     *     returns org.tempuri.Order
     */
    @WebMethod(operationName = "CreateNewOrder", action = "http://tempuri.org/CreateNewOrder")
    @WebResult(name = "CreateNewOrderResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "CreateNewOrder", targetNamespace = "http://tempuri.org/", className = "org.tempuri.CreateNewOrder")
    @ResponseWrapper(localName = "CreateNewOrderResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.CreateNewOrderResponse")
    public Order createNewOrder(
        @WebParam(name = "UserId", targetNamespace = "http://tempuri.org/")
        int userId);

    /**
     * 
     * @param orderId
     * @param userId
     */
    @WebMethod(operationName = "DeleteOrder", action = "http://tempuri.org/DeleteOrder")
    @RequestWrapper(localName = "DeleteOrder", targetNamespace = "http://tempuri.org/", className = "org.tempuri.DeleteOrder")
    @ResponseWrapper(localName = "DeleteOrderResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.DeleteOrderResponse")
    public void deleteOrder(
        @WebParam(name = "UserId", targetNamespace = "http://tempuri.org/")
        int userId,
        @WebParam(name = "OrderId", targetNamespace = "http://tempuri.org/")
        int orderId);

    /**
     * 
     * @param amount
     * @param orderId
     * @param articleId
     * @param userId
     */
    @WebMethod(operationName = "AddOrderItem", action = "http://tempuri.org/AddOrderItem")
    @RequestWrapper(localName = "AddOrderItem", targetNamespace = "http://tempuri.org/", className = "org.tempuri.AddOrderItem")
    @ResponseWrapper(localName = "AddOrderItemResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.AddOrderItemResponse")
    public void addOrderItem(
        @WebParam(name = "UserId", targetNamespace = "http://tempuri.org/")
        int userId,
        @WebParam(name = "OrderId", targetNamespace = "http://tempuri.org/")
        int orderId,
        @WebParam(name = "ArticleId", targetNamespace = "http://tempuri.org/")
        int articleId,
        @WebParam(name = "Amount", targetNamespace = "http://tempuri.org/")
        int amount);

    /**
     * 
     * @param orderId
     * @param userId
     * @return
     *     returns double
     */
    @WebMethod(operationName = "GetOrderPrice", action = "http://tempuri.org/GetOrderPrice")
    @WebResult(name = "GetOrderPriceResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetOrderPrice", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetOrderPrice")
    @ResponseWrapper(localName = "GetOrderPriceResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetOrderPriceResponse")
    public double getOrderPrice(
        @WebParam(name = "UserId", targetNamespace = "http://tempuri.org/")
        int userId,
        @WebParam(name = "OrderId", targetNamespace = "http://tempuri.org/")
        int orderId);

    /**
     * 
     * @param orderId
     * @param itemPosition
     * @param userId
     * @return
     *     returns org.tempuri.OrderItem
     */
    @WebMethod(operationName = "GetOrderItem", action = "http://tempuri.org/GetOrderItem")
    @WebResult(name = "GetOrderItemResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetOrderItem", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetOrderItem")
    @ResponseWrapper(localName = "GetOrderItemResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetOrderItemResponse")
    public OrderItem getOrderItem(
        @WebParam(name = "UserId", targetNamespace = "http://tempuri.org/")
        int userId,
        @WebParam(name = "OrderId", targetNamespace = "http://tempuri.org/")
        int orderId,
        @WebParam(name = "ItemPosition", targetNamespace = "http://tempuri.org/")
        int itemPosition);

    /**
     * 
     * @param orderId
     * @param itemPosition
     * @param userId
     */
    @WebMethod(operationName = "RemoveOrderItem", action = "http://tempuri.org/RemoveOrderItem")
    @RequestWrapper(localName = "RemoveOrderItem", targetNamespace = "http://tempuri.org/", className = "org.tempuri.RemoveOrderItem")
    @ResponseWrapper(localName = "RemoveOrderItemResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.RemoveOrderItemResponse")
    public void removeOrderItem(
        @WebParam(name = "UserId", targetNamespace = "http://tempuri.org/")
        int userId,
        @WebParam(name = "OrderId", targetNamespace = "http://tempuri.org/")
        int orderId,
        @WebParam(name = "ItemPosition", targetNamespace = "http://tempuri.org/")
        int itemPosition);

    /**
     * 
     * @param orderId
     * @param userId
     * @return
     *     returns int
     */
    @WebMethod(operationName = "GetOrderItemCount", action = "http://tempuri.org/GetOrderItemCount")
    @WebResult(name = "GetOrderItemCountResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetOrderItemCount", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetOrderItemCount")
    @ResponseWrapper(localName = "GetOrderItemCountResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetOrderItemCountResponse")
    public int getOrderItemCount(
        @WebParam(name = "UserId", targetNamespace = "http://tempuri.org/")
        int userId,
        @WebParam(name = "OrderId", targetNamespace = "http://tempuri.org/")
        int orderId);

    /**
     * 
     * @param newStatus
     * @param orderId
     * @param userId
     */
    @WebMethod(operationName = "ChangeOrderStatus", action = "http://tempuri.org/ChangeOrderStatus")
    @RequestWrapper(localName = "ChangeOrderStatus", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ChangeOrderStatus")
    @ResponseWrapper(localName = "ChangeOrderStatusResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ChangeOrderStatusResponse")
    public void changeOrderStatus(
        @WebParam(name = "UserId", targetNamespace = "http://tempuri.org/")
        int userId,
        @WebParam(name = "OrderId", targetNamespace = "http://tempuri.org/")
        int orderId,
        @WebParam(name = "NewStatus", targetNamespace = "http://tempuri.org/")
        OrderStatus newStatus);

}
