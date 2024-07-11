package lesson9.labs.prob10c;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        int max = getIntegerStream().max().orElse(0);
        int min = getIntegerStream().min().orElse(0);
        System.out.printf("Max is %d, Min is %d%n", max, min);
    }

    public static IntStream getIntegerStream() {
        return IntStream.of(1, 3, 4, 5, 6, 7);
    }
}
