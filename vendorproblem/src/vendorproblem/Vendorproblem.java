package vendorproblem;

import java.util.Scanner;

/**
 *
 * @author fadhl
 */
//vendor 1 fadhlan = makanan
//vendor 3 arya = minuman
//vendor 3 mikhael = gorengan
public class Vendorproblem {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        double harga = 1;
        double diskon = 0.9;
        System.out.println("Are you a member of the canteen");
        System.out.println("(1) yes");
        System.out.println("(2) no");
        Scanner member = new Scanner(System.in);
        int membership = member.nextInt();
        System.out.println("What do you want to buy");
        System.out.println("(1) vendor 1");
        System.out.println("(2) vendor 2");
        System.out.println("(3) vendor 3");
        int prod = member.nextInt();
        if(membership == 1){
            diskon = 0.9;
        }else{
            diskon = 1;
        }
        vendor v1= new vendor("vendor 1");
        vendor v2= new vendor("vendor 2");
        vendor v3= new vendor("vendor 3");
        
        product p1v1 = new product("aqua", 2.2);
        product p1v2 = new product("teh botol", 0.2);
        product p1v3 = new product("pocari", 1.2);
        product p2v1 = new product("nasi goreng", 3.5);
        product p2v2 = new product("ayam goreng", 4.3);
        product p2v3 = new product("ikan bakar", 1.2);
        product p3v1 = new product("roti", 5.2);
        product p3v2 = new product("cereal", 2.6);
        product p3v3 = new product("lontong", 9.0);
        if(prod==1){
            System.out.println("What do you want to buy");
            System.out.println("(1) aqua");
            System.out.println("(2) teh botol");
            System.out.println("(3) pocari");
            prod = member.nextInt();
            if(prod == 1){
                harga = p1v1.price*diskon;
            }else if(prod == 2){
                harga = p1v2.price*diskon;
            }else if(prod == 3){
                harga = p1v3.price*diskon;
            }
        }else if(prod==2){
            System.out.println("What do you want to buy");
            System.out.println("(1) nasi goreng");
            System.out.println("(2) ayam goreng");
            System.out.println("(3) ikan bakar");
            prod = member.nextInt();
            if(prod == 1){
                harga = p2v1.price*diskon;
            }else if(prod == 2){
                harga = p2v2.price*diskon;
            }else if(prod == 3){
                harga = p2v3.price*diskon;
            }
        }else if(prod==3){
            System.out.println("What do you want to buy");
            System.out.println("(1) roti");
            System.out.println("(2) cereal");
            System.out.println("(3) lontong");
            prod = member.nextInt();
            if(prod == 1){
                harga = p3v1.price*diskon;
            }else if(prod == 2){
                harga = p3v2.price*diskon;
            }else if(prod == 3){
                harga = p3v3.price*diskon;
            }
        }
        System.out.println("the price is "+harga);
        System.out.println("Thanks for purchasing!");
    }
}
