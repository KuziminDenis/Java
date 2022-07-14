package stepIt.Homework4.Shop;

import java.util.Arrays;

public class InheritanceMain {
    public static void main(String[] args) {


        Category proc = new Category("Processor", 100);
        Category videoCard = new Category("Video Card", 200);

        Product[] allProducts = {};

        Product prodProc1 = new Product("Intel I3", 200, 5.0);
        Product prodProc2 = new Product("Intel I5", 300, 6.4);
        Product prodProc3 = new Product("Intel I7", 400, 7.2);
        Product prodProc4 = new Product("AMD Ryzen", 400, 8.0);

        Product prodVideCard1 = new Product("RTX 3050", 500, 8.1);
        Product prodVideCard2 = new Product("RTX 3090", 800, 8.7);
        Product prodVideCard3 = new Product("GTX 1650", 300, 6.3);
        Product prodVideCard4 = new Product("RX 6600", 600, 7.2);



        allProducts = proc.initializeArray(allProducts, prodProc1);
        //sold1.sold("Intel I3");
        allProducts = proc.initializeArray(allProducts, prodProc2);
        allProducts = proc.initializeArray(allProducts, prodProc3);
        allProducts = proc.initializeArray(allProducts, prodProc4);



        allProducts = videoCard.initializeArray(allProducts, prodVideCard1);
        allProducts = videoCard.initializeArray(allProducts, prodVideCard2);
        allProducts = videoCard.initializeArray(allProducts, prodVideCard3);
        allProducts = videoCard.initializeArray(allProducts, prodVideCard4);

        for(int i = 0; i < allProducts.length; i++){
            System.out.println(allProducts[i]);
        }
        System.out.println(proc);
        System.out.println(videoCard);


       //sold1.add("Intel I3", 300, 2, 20);

        //System.out.println(sold1);

        Basket bs1 = new Basket();

        bs1.buy(2, "Intel I3");
        bs1.showBasket();

        User u1 = new User("User1", 122343);
        u1.showUserInfo();

    }
}
