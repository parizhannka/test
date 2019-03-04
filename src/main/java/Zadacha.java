import java.util.Scanner;

public class Zadacha {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
      float z;
      System.out.println("Начнем сравнение с числом 20 \n Введите первое число");
        z=input.nextFloat();
        float w;
        System.out.println("Введите второе число");
        w=input.nextFloat();
        if (Math.abs(20 - z) == Math.abs(20 - w))
            System.out.println("Числа z и w равноудалены от 20");
         else if
                (Math.abs(20 - z) < Math.abs(20 - w))
            System.out.println("Число " + z + " ближе к числу " + 20);
        else
            System.out.println("Число " + w + " ближе к числу " + 20);
            }
}
