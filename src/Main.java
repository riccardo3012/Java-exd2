import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci la stringa");
        String str = input.nextLine();
        pariEdispari(str);
    }

    public static void pariEdispari(String str) {
        int lunghezza = str.length();
        if (lunghezza % 2 == 0) {
            System.out.println("La stringa ha caratteri pari");
        } else {
            System.out.println("La stringa ha caratteri dispari");
        }
    }
}
