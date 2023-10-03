import java.util.Scanner;
public class esercizioQuattro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Inserisci il numero da cui vuoi parta il countdown:");
        int n =input.nextInt();

        for (int i = n; i >= 0; --i) {
            System.out.println(i);
        }

        input.close();
    }
}
