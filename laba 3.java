import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = scan.nextInt();
        double[] mas = new double[n];
//ввод массива
        for (int i = 0; i < n; i++) {
            System.out.print("Введите " + (i + 1) + " элемент массива: ");
            mas[i] = scan.nextDouble();
        }
        Sort(mas);
    }

    public static void Sort(double[] mas) {
//Подсчёт кол-ва чётных элементов
        int count = 0;
        for (double num : mas) {
            if (num % 2 == 0) {
                count++;
            }
        }
//Создание нового массива из чётных элементов
        double[] chet = new double[count];
        int index = 0;

        for (double num : mas) {
            if (num % 2 == 0) {
                chet[index++] = num;
            }
        }
//Сортировка чётных элементов по убыванию
        for (int i = 0; i < chet.length; i++) {
            double temp = chet[i];
            int j = i - 1;
            while (j >= 0 && chet[j] < temp) {
                chet[j + 1] = chet[j];
                j--;
            }
            chet[j + 1] = temp;
        }
        index = 0;
//Возвращение чётных элементов в массив
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] % 2 == 0) {
                mas[i] = chet[index++];
            }
        }
//вывод массива
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
    }
}
