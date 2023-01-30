// class Main {
//
//    public static void main(String[] args) {
//        int age_1 = 100, age_2 = 200, age_3 = 300;
//        String age_4 = " ";
//        System.out.println(age_1);
//        System.out.println(age_2);
//        System.out.println(age_3);
//        System.out.print(age_1 + " " + age_2 + " " + age_3);
//    }
//}
//public static void main(String[] args) {
//    int age_1 = 2021;
//    double age_2 = 3.1415;
//    String age_3 = "Java";
//    String arg = String.valueOf(5 < 10);
//    System.out.println(age_1);
//    System.out.println(age_2);
//    System.out.println(age_3);
//    System.out.print(arg);
//}
// }
//import java.util.Scanner;
//
//class MySolution {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String st = sc.nextLine();
//        System.out.println(st);
//        System.out.println(st);
//        System.out.println(st);
//    }
//}

import java.util.Scanner;

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt(), y = sc.nextInt();
//        System.out.println(x + y);
//        sc.close();
//
//    }
//
//}
import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        double x = sc.nextDouble(), y = sc.nextDouble();
//        System.out.println(x*y);
//        System.out.println((x+y)*2);
//
//    }
//import java.util.Scanner;
//
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        double x = sc.nextDouble();
//        double y = sc.nextDouble();
//        double z = sc.nextDouble();
//        double p = (x+y+z) / 3;
//        System.out.println(p);
//
//
//    }
//}
/*ООО "Круче Гугла" нанимает Java-разработчиков. Месячный бюджет на зарплату разработчиков - X,
 зарплата одного разработчика - Y. Выведите на печать в одной строке через пробел,
 какое максимальное количество разработчиков компания сможет нанять, и какое количество денег
 из ежемесячного бюджета останется неиспользованным.
*/
//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        int y = sc.nextInt();
//        int myOoo = x / y;
//        int oooSum = myOoo * y;
//        int e = x - oooSum;
//        System.out.print(myOoo + " " + e);
//    }
//}

//import java.util.Scanner;

//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        int ch = (x % 86400) / 3600; //получаем часы 1 day = 86400 second (24 * 3600)
//        int min = ((x % 86400) % 3600) / 60; // тут получаем минуты 1 minute = 60 seconds
//        int sec = ((x % 86400) % 3600) % 60; // тут получаем секудны
//        System.out.format("%02d" + ":" + "%02d" + ":" + "%02d", ch, min, sec);
//        //System.out.format позволяет задать шаблон строки и тут же передать в нее аргументы.
//    }
//}
//class Main {
//    public static void main(String[] args) {
//        int x = 1, y = 5, z = 0;
//        --y; //y = 4
//        x = 4 + y++; // x = 9
//        z += x--; // z=0+8 = 8
//        x = y + z; // 5+8 = 13
//        System.out.print(++x);// тут добавляем 13+1 так как перед
//        // x стоят знаки ++ то есть ++x
//        // ответ будет 14
//    }
//}
//змените программу таким образом, чтобы она выводила
//на печать числа 11, 12, 13. Используйте инкремент.
//class Main {
//    public static void main(String[] args) {
//        int x = 10;
//        ++x;
//        int y = 11;
//        ++y;
//        int z = 12;
//        ++z;
//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(z);
//
//    }
//}
//На вход подаётся натуральное число n. Выведите на печать
//числа n - 1, n, n + 1 в одну строку, через пробел (см. образец).

//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int x = n;
//        --x;
//        int y = n;
//        int z = n+1;
//        System.out.print(x + " " + y + " " + z);
//
//    }
//}

import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        int y = sc.nextInt();
//        int z = ((x+1) / (y-1)) + ((y+1) / (x-1));
//        System.out.print(z);
//    }
//}
//class Main {
//    public static void main(String[] args) {
//        String myVar;
//        myVar = "Hello, World!";
//                System.out.print(myVar);
//    }
//}
//На вход подаётся строка. Выведите её длину.
//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in); //ввод данных
//        String str = sc.nextLine(); //ввод данных
//        int len = str.length(); //определяем длину строки
//        System.out.println(len); //выводим длину строки
//    }
//}
//Вывести 1 и последний элеимент строки
//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in); //сканер для ввода данных
//        String str = sc.nextLine(); // ввод данных
//        char letter_0 = str.charAt(0); //вывели 1 элемент строки
//        char letter_1 = str.charAt(str.length() - 1); //вывели последний элемент строки
//        System.out.println(letter_0 + " " + letter_1);
//        //вывели 1 и последний элементы строки
//
//    }
//}
//На вход подаётся строка текста, затем слово. Выведите на печать true, если слово содержится в
//строке, и false - если не содержится.
//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in); //сканер для ввода данных
//        String str_1 = sc.nextLine();// ввод данных
//        String str_2 = sc.nextLine();
//        System.out.println(str_1.contains(str_2));
//    }
//}
