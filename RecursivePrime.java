/*
import java.util.Scanner;
public class RecursivePrime {
    static boolean isPrime(int a) {
        for (int i = 2; i < a; i++){
            if (a % i == 0){
                return false;
            }
        }

        return true;
    }



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String m1;
        int num;

        m1 = "Enter the number you want to check its prime status : ";
        System.out.print(m1);
        num = input.nextInt();

        System.out.print(isPrime(num));
    }
}

 */

import java.util.Scanner;

public class RecursivePrime {

    // Ana recursive metot: Sayının asal olup olmadığını kontrol eder
    static boolean isPrime(int number, int divisor) {
        // Base cases
        if (number < 2) {
            return false;
        }
        if (divisor == 1) {
            return true;
        }
        if (number % divisor == 0) {
            return false;
        }

        // Recursive case
        return isPrime(number, divisor - 1);
    }

    // Yardımcı metot: Recursive işlemi başlatır ve başlangıç değerini ayarlar
    static boolean isPrime(int number) {
        return isPrime(number, number / 2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        int num = input.nextInt();

        if (isPrime(num)) {
            System.out.println(num + " sayısı ASALDIR !");
        } else {
            System.out.println(num + " sayısı ASAL değildir !");
        }
    }
}
