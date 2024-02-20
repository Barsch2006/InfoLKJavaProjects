import java.util.Scanner;

class Input {
    public static void main(String[] args) {
        System.out.print("Bitte geben Sie Ihren Namen ein: ");
        String name = new Scanner(System.in).nextLine();
        System.out.println("Hallo " + name + "!");
    }
}