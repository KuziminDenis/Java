package stepIt.Homework4.Shop;

public class Basket{

    private static String productWasBought[];
    private int maxBasket = 10;

    void buy(int amount, String product){
        productWasBought = new String[maxBasket];
        for(int i = 0; i < amount; i++){
            productWasBought[i] = product;
        }
    }

    String showBasket(){
        int count = 0;
        for(int i = 0; i < maxBasket; i++){

            if(productWasBought[i] != null){
                System.out.println("Товар = " + productWasBought[i]);
                count++;
            }
            else break;

        }
        return "В корзине " + count + " товара";
    }


}
