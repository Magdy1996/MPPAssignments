package lesson9.labs.prob9;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class Main {

    public static void printSquares(int num){
        IntStream.iterate(1, n -> (int) Math.pow(Math.sqrt(n) + 1,2)).limit(num).forEach(System.out::println);
    }

    public static void main(String[] args) {
        printSquares(4);

    }
}
