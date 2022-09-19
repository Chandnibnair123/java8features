package java8;

import java.util.*;  
import java.util.stream.Collectors;  
class Product{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
public class Javastream {  
    public static void main(String[] args) {  
        List<Product> productsList = new ArrayList<Product>();  
        
        productsList.add(new Product(1,"HP",25000f));  
        productsList.add(new Product(2,"Del",30000f));  
        productsList.add(new Product(3,"Lenevo",28000f));  
        productsList.add(new Product(4,"Sony",28000f));  
        productsList.add(new Product(5,"Apple",90000f));  
        
        double totalPrice3 = productsList.stream()  
                        .collect(Collectors.summingDouble(product->product.price));  
        System.out.println(totalPrice3);  
          
    }  
}