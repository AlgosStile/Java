//package lesson1;
//
//
//import java.util.Random;
//
//public class Main {
//    public static void main(String[] args) {
//        ex2();
//    }
//
//    public static void ex2() {
//        int arr[] = new int[1000];
//        int counter = 0;
//        int maxSequence = 0;
//        double n = Math.random(); //0
//        Random random = new Random();
//
//        for (int i = 0; i <= arr.length; i++) {
//            int num = arr[i];
//            int bound = 0;
//            arr[i] = random.nextInt(bound:2) // [0;2]
//        }
//
//        for (int num : arr) {
//            if (num ==1) {
//                counter++;
//            } else {
//                if (counter > maxSequence) {
//                    maxSequence = counter;
//                }
//                counter = 0;
//            }
//        }
//    }
//}