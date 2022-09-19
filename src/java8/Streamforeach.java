package java8;

import java.util.Arrays;

public class Streamforeach
{
    public static void main(String[] args) {
        String[] name = {"Chandni","Lisna","Priya","Aleena"};
        Arrays.stream(name).forEach(System.out::println);
    }
}
