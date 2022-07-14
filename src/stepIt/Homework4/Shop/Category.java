package stepIt.Homework4.Shop;

import java.util.Arrays;

public class Category {


    private String name;
    private Product product[];
    private int productAmount;

    Category(String name, int productAmount){
        this.name = name;
        this.productAmount = productAmount;
    }

    Category(){

    }

    public int getProductAmount() {
        return productAmount;
    }

    public void setProductAmount() {
        productAmount -= 1;
    }

    public  Product[] initializeArray(Product[] arr, Product elementToAdd)
    {
        product = new Product[arr.length + 1];//new array of larger size
        //copying elements from old to new array
        for(int i = 0; i < arr.length; i++)
            product[i] = arr[i];
        product[product.length - 1] = elementToAdd;//Adding the element
        return product;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", product=" + Arrays.toString(product) +
                '}';
    }
}
