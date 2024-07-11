package lesson9.labs.prob10b;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> List = java.util.List.of(new String[]{"Bill", "Thomas", "Mary"});
        System.out.println(List.stream().reduce((x,y)-> x+", "+y).orElse(""));
    }
}
