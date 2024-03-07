import java.util.Scanner;

public class Task3Scanner {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину массива: "); // Задаём через консоль длину массива
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Заполните свой массив:"); // Заполняем свой массив
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        System.out.print("Вывожу результат кратный 3:");
        for (int i = 0; i < size; i++) {
            if (array[i] % 3 == 0)
                System.out.print(" " + array[i]);
        }
        System.out.println();
    }
}

