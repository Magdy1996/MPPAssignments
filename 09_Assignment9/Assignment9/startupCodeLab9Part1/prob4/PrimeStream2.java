package lesson9.labs.prob4;

import java.util.stream.Stream;

public class PrimeStream2 {

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

    // Method to generate a stream of prime numbers
    public static Stream<Integer> generatePrimes() {
        return Stream.iterate(2, PrimeStream2::nextPrime);
    }

    // Method to print the first n prime numbers
    public void printFirstNPrimes(long n) {
        generatePrimes().limit(n).forEach(System.out::println);
    }

    public static void main(String[] args) {
        PrimeStream2 ps = new PrimeStream2();
        ps.printFirstNPrimes(10);
        System.out.println("====");
        ps.printFirstNPrimes(5);
    }
}
