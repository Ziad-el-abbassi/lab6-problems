package problem1;

import java.util.ArrayList;
import java.util.Scanner;
public class Shop
{
    public static void main (String[] args)
    {
        ArrayList<Item> cart = new ArrayList<>();
        String itemName;
        double itemPrice;
        int quantity;
        Scanner scan = new Scanner(System.in);
        String keepShopping = "y";
        do
        {
            System.out.print ("Enter the name of the item: ");
            itemName = scan.nextLine();
            System.out.print ("Enter the unit price: ");
            itemPrice = scan.nextDouble();
            System.out.print ("Enter the quantity: ");
            quantity = scan.nextInt();
            scan.nextLine();
            // *** create a new item and add it to the cart
            Item val=new Item(itemName,itemPrice,quantity);
            cart.add(val);
            // *** print the contents of the cart object using println
            //System.out.println(cart);
            double total_price=0;
            for(int i=0;i<cart.size();i++){
                System.out.println(cart.get(i));
                total_price+=cart.get(i).getPrice()*cart.get(i).getQuantity();
            }
            System.out.print("Total price: "+total_price+"\n");
            System.out.print ("Continue shopping (y/n)? ");
            keepShopping = scan.nextLine();
        }
        while (keepShopping.equals("y"));
    }
}
