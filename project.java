//Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
// public class myown {

//     public static int summa(int n) {
//         if (n == 1)
//             return 1;
//         else {
//             return n + summa(n - 1);
//         }
//     }
//     public static void main(String[] args) {
//     System.out.println(summa(5));
//     }

// }

//Вывести все простые числа от 1 до 1000
// public class myown {
//     public static int[] CreateArray(int length){
//         int[] array = new int[length];
//         for (int i  = 0; i < array.length; i++)
//             array[i] = i + 1;
//         return array;
//     }
//     public static void main(String[] args) {
//         int[] array = CreateArray(1000);
//         for ( int i = 2; i < array.length; i++) {
//             int count = 0;
//             for ( int j = 2; j <= i && count < 2; j++)
//                 if (i%j == 0){
//                     ++count;
//             }
//             if (count < 2)
//             System.out.println(i);
//         }
//     }

// }

//Реализовать простой калькулятор
import java.util.Scanner;
public class project {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number: ");
        int first = sc.nextInt();
        System.out.println("enter an operation symbol: ");
        char operation = sc.next().charAt(0);
        System.out.println("enter second number: ");
        int second = sc.nextInt();
        int result = Calculator(first, second, operation);
        System.out.printf("Result is: %d \n", result);
        sc.close();
    }
    public static int Calculator(int first, int second, char operation) {
        int result = 0;
        switch (operation) {
            case '+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            case '*':
                result = first * second;
                break;
            case '/':
                result = first / second;
                break;
            default:
                System.out.println(" Wrong symbol");
        }
        return result;
    }
}