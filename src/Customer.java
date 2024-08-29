import java.util.ArrayList;

public class Customer {

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private Address deliveryAddress;
    private Enum<Type> customerType;
    private int discount;
    private ArrayList <Item> favoriteItemsList;
    private GiftBox gift;

    public Customer(int id, String firstName, String lastName, String email, Address deliveryAddress, Enum<Type> customerType, int discount) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.deliveryAddress = deliveryAddress;
        this.customerType = customerType;
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(Address deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public Enum<Type> getCustomerType() {
        return customerType;
    }

    public void setCustomerType(Enum<Type> customerType) {
        this.customerType = customerType;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public ArrayList<Item> getFavoriteItemsList() {
        return favoriteItemsList;
    }

    public void setFavoriteItemsList(ArrayList<Item> favoriteItemsList) {
        this.favoriteItemsList = favoriteItemsList;
    }

    public GiftBox getGift() {
        return gift;
    }

    public void setGift(GiftBox gift) {
        this.gift = gift;
    }



}
