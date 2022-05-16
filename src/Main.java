import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = true;
        while (exit) {
            System.out.println("Введите 1 если хотите ввести круг или введите что-то(именно число) если хотите квадрат");
            int a = sc.nextInt();
            if (a == 1) {
                Circle crObj = new Circle();
                System.out.println("Введите из каких символов будет фигура");
                char c = sc.next().charAt(0);
                crObj.setSybol(c);
                crObj.draw(crObj.getSybol());
            } else {
                Square sqObj = new Square();
                System.out.println("Введите из каких символов будет фигура");
                char c = sc.next().charAt(0);
                sqObj.setSybol(c);
                sqObj.draw(sqObj.getSybol());
            }
            System.out.println("\nЕсли хочешь выйти введи \"exit\", если нет любую-другую");
            String checkexit = sc.next();
            if (checkexit.equals("exit")) {
                System.out.println("ДО СВИДАНИЯ!!!");
                exit = false;
            }
        }
    }
}

