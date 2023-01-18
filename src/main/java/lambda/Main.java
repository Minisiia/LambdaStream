package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * Створити список та заповнити рандомними числами 10 осередків,
 * потрібно вивести суму квадратів усіх елементів списку.
 * Ми використовуємо метод map() для зведення квадрат кожного елемента,
 * а потім застосовуємо метод reduce() для згортки всіх елементів в одне число.
 */
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>(3);
        for (int i = 0; i < 3; i++) {
            list.add(random.nextInt(10) + 1);
        }
        System.out.println((char) 27 + "[34m" + "Original list:" + (char) 27 + "[38m");
        for (int temp : list) System.out.println(temp);
        System.out.println((char) 27 + "[34m" + "Squares of all elements of the list:" + (char) 27 + "[38m");
        list.stream().map(a -> a * a).forEach(System.out::println);
        System.out.println((char) 27 + "[34m" + "The sum of the squares of all elements of the list:" + (char) 27 + "[38m");
        int number = list.stream().map(a -> a * a).reduce(Integer::sum).get();
        System.out.println(number);
    }
}
