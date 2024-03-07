import java.util.Scanner;

public class Task2Scanner {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Здравствуйте! Как Вас зовут?: ");
        String name = in.nextLine();
        do {
            if (name.equals("Вячеслав")) {
                System.out.println("Привет " + name);
                return;
            } else {
                System.out.println("Нет такого имени: ");
            }
            name = in.nextLine();
        } while (name != "Вячеслав");
        System.out.println("Нет такого имени: ");
    }

}