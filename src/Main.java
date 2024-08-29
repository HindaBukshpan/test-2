import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        Item pen = new Item(1,"Pen", 5.5);
        Item marker = new Item(2,"Marker", 7);
        Customer moshe = new Customer(101, "Moshe", "Levi", "gfvfvf",  new Address ("Israel", "Hifa", "Agripas", 57 ), Type.VIP, 5);
//        Order num1 = new Order(500, "NUM1", new ArrayList<Item>(marker, pen), moshe,Type.VIP,PaymentType.CASH);

        ArrayList<Item> itemsList = new ArrayList<>();
        itemsList.add( marker);



        System.out.println("Hello world!");

        System.out.println(itemsList);
    }
}