package lesson9.labs.prob4;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeStream {

    // Helper method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) return false;
        }
        return true;
    }

    // Generate the next prime number greater than the given number
    public static int nextPrime(int after) {
        int candidate = after + 1;
        while (!isPrime(candidate)) {
            candidate++;
        }
        return candidate;
    }

    public static void main(String[] args) {
        // Creating an infinite stream of prime numbers
        final Stream<Integer> primes = Stream.iterate(2, PrimeStream::nextPrime);

        // Print the first 10 primes for testing purposes
        primes.limit(10).forEach(System.out::println);
    }
}
