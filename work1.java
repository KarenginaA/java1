// 1) Вычислить n-ое треугольного число 
// (сумма чисел от 1 до n), n! 
// (произведение чисел от 1 до n)

// import java.util.Scanner;

//  public class work1 {

//     public static void main(String[] args) {
//         System.out.println("Введите число n:");
//         Scanner num = new Scanner(System.in);
//         int n = num.nextInt();
//         int sum = 0;
//         int mult = 1;
//         for (int i = 1; i <= n; i++) {
//             sum += i;
//             mult *= i;  
//     }
//     System.out.printf("Сумма чисел от 1 до %d: %d%n", n, sum);
//         System.out.printf("Факториал чисел от 1 до %d: %d%n", n, mult);
        
//     }
// }
// 2) Вывести все простые числа от 1 до 1000


/**
 * work1
 */
// public class work1 {

//     public static void main(String[] args) {
//         for (int i = 1; i <= 1000; i++) {
//             boolean isPrimeNumber = true;

//             for (int j = 2; j < i; j++) {
//                 if (i % j == 0) {
//                     isPrimeNumber = false;
//                     break;
//                 }
//             }

//             if (isPrimeNumber) {
//               System.out.println("Простые числа: " + i);  
//             }
//         }
        
//     }
// }

// 3) Реализовать простой калькулятор
// import java.util.Scanner;


// public class work1 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Введите первое число: ");
//         int a = scanner.nextInt();
//         System.out.println("Введите операцию + - / : ");
//         String temp = scanner.next().trim();
//         char operation = temp.charAt(0);
//         System.out.print("Введите второе число: ");
//         int b = scanner.nextInt();

//         int res;
//         switch (operation) {
//             case '+' -> {
//                 res = a + b;
//                 System.out.printf("Результат: %d", res);
//             }
//             case '-' -> {
//                 res = a - b;
//                 System.out.printf("Результат: %d", res);
//             }
//             case '/' -> {
//                 res = a / b;
//                 System.out.printf("Результат: %d", res);
//             }
//             case ' ' -> {
//                 res = a * b;
//                 System.out.printf("Результат: %d", res);
//             }
//         }
//         scanner.close();
//     }
// }