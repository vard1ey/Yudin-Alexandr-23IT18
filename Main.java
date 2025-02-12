import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите n = ");
        int n = scan.nextInt();
        System.out.print("Введите x = ");
        double x = scan.nextInt();
        double sum = 0;
        double fact = 1;
        for (int i = 1; i <= n; i++){
            if (i > 0){
                fact *= i;
            }
            double ans = Math.pow(-1, i) * Math.pow(x,i)/fact;
            sum += ans;
        }
        System.out.print("Сумма = " + sum);
    }
}