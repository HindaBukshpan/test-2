import java.time.LocalDate;
import java.util.ArrayList;

public class Order {
    private int id;
    private String  name;
    private Address deliveryAddress;
    private ArrayList<Item> itemsList;
    private Customer customer;
    private Enum<Type> orderType;
    private double totalPrice;
    private Enum<PaymentType> paymentType;
    private LocalDate dateOfOrder;

 public Order(int id, String name, ArrayList<Item> itemsList, Customer customer, Enum<Type> orderType, Enum<PaymentType> paymentType) {
  this.id = id;
  this.name = name;
  this.deliveryAddress = customer.getDeliveryAddress();
  this.itemsList = itemsList;
  this.customer = customer;
  this.orderType = orderType;
  this.paymentType = paymentType;
  this.dateOfOrder = LocalDate.now();
 }

 public int getId() {
  return id;
 }

 public void setId(int id) {
  this.id = id;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public Address getDeliveryAddress() {
  return deliveryAddress;
 }

 public void setDeliveryAddress(Customer customer) {
  this.deliveryAddress = customer.getDeliveryAddress();
 }

 public ArrayList<Item> getItemsList() {
  return itemsList;
 }

 public void setItemsList(ArrayList<Item> itemsList) {
  itemsList.add(0,)
  this.itemsList = itemsList;
 }

 public Customer getCustomer() {
  return customer;
 }

 public void setCustomer(Customer customer) {
  this.customer = customer;
 }

 public Enum<Type> getOrderType() {
  return orderType;
 }

 public void setOrderType(Enum<Type> orderType) {
  this.orderType = orderType;
 }

 public double getTotalPrice() {
  return totalPrice;
 }

 public void setTotalPrice(double totalPrice) {
  this.totalPrice = totalPrice;
 }

 public Enum<PaymentType> getPaymentType() {
  return paymentType;
 }

 public void setPaymentType(Enum<PaymentType> paymentType) {
  this.paymentType = paymentType;
 }

 public LocalDate getDateOfOrder() {
  return dateOfOrder;
 }

 public void setDateOfOrder(LocalDate dateOfOrder) {
  this.dateOfOrder = dateOfOrder;
 }




 public void calculateTheTotalPrice (ArrayList<Item> itemsList){


 }
}
