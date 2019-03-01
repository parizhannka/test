public class LogOper {
    public static void main(String[] args) {
        double a = 20, d = 25.8, c = 17.8;
        // float a=20, d=25.8, c=17.8;
        if (Math.abs(a - d) > Math.abs(a - c)) {
            System.out.println("Число " + c + " ближе к числу " + a);
        }else {
            System.out.println("Число " + d + " ближе к числу " + a);
        }
        int n = 159;
        if (n % 2 == 0) {
            System.out.println("Число " + n + " является четным");
        } else {
            System.out.println("Число " + n + " является нечетным");
        }
        double m = (int)(Math.random() * (155 - 5)) + 5;

        if (m > 25 & m < 100) {
            System.out.println("Число " + m + " попадает в отрезок от 25 до 100");
        } else {
            System.out.println("Число " + m + " не попадает в отрезок от 25 до 100");
        }

    }
    }

