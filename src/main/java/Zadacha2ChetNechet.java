import java.util.Scanner;

public class Zadacha2ChetNechet {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int ch = 0;
        int nech = 0;
        System.out.println("Задание № 1 ");
        System.out.println("Введите любое число");
        n = input.nextInt();
        for (int i = 1; i <= Math.abs(n); i++) {
            if (i % 2 == 0) {
                ch++;
            } else {
                nech++;
            }
        }
        System.out.println("Количество нечетных чисел равно  " + nech);
        System.out.println(" Количество четных чисел равно  " + ch);

        System.out.println("Задание № 2 ");

        int c;
        int i = 1;
        int summ = 0;

        System.out.println("Введите любое натуральное число");
        c = input.nextInt();
        while (i <= c) {
            if (i % 2 == 0) {
                summ=summ+1;
            }
            i++;
        }
            System.out.println("Сумма четных чисел равна  " + summ);
        
        }
    }





