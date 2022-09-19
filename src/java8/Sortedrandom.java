package java8;

import java.util.Random;



class SortedRandom {

    public static void main(String[] args) {

        Random random = new Random();
        random.ints().limit(5).sorted().forEach(System.out::println);
        

    }
}