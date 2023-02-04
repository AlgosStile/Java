//1. Реализовать консольное приложение, которое:
// Принимает от пользователя и “запоминает” строки.
// Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
// Если введено revert, удаляет предыдущую введенную строку из памяти.

package DZ_4;


import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;


public class task3 {
    public static void main(String[] args) {
        ex2();
    }

    private static void ex1() {
        LinkedList<String> words = new LinkedList<>();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Input a string: ");
            String String = input.nextLine();
            if (str.equalsIgnoreCase("print")) {
                if (words.size() > 0) {
                    System.out.println("Состояние списка на данный момент:");
                    for (int i = words.size() -; i >= 0; i--) {
                        System.out.println(words.get(i));
                    }
                } else {
                    System.out.println("Список пуст");
                    continue;
                }
            } else if (str.equalsIgnoreCase("revert")) {
                try {
                    System.out.println("Удален элемент " + words.get(words.size() - 1));
                    words.remove(words.size() -);

                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Список пуст");
                }

            } else if (str.equalsIgnoreCase("exit")) {
                break;
            } else {
                words.add(str);
                System.out.println("Добавлена строка " + str);
            }

        }

    }

    private static void ex2() {
        LinkedList<Integer> list = new LinkedList<>();
        Random random = new Random();
        int size = 5;
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(50));
        }
        System.out.println("Original list: ");
        list.forEach(System.out::println);
        System.out.println("Reversed list: ");
        list.descendingIterator().forEachRemaining(System.out::println);

    }
}
