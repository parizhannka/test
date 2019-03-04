import java.util.Scanner;

public class ZadachaChetNechet {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Введите любое число");

        n=input.nextInt();
        if (n % 2 == 0) {
            System.out.println("Число " + n + " является четным");
        } else {
            System.out.println("Число " + n + " является нечетным");
        }
    }

}
