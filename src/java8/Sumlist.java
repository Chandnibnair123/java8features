package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Sumlist {
    public static void main(String[] args) {



       List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int summingIntValue = numbers.stream().collect(Collectors.summingInt(Integer::intValue));



       System.out.println("Sum of integers using java8 : " + summingIntValue);
}
}


