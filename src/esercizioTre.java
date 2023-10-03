
import java.util.Objects;
import java.util.Scanner;

public class esercizioTre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Insersci una stringa");
            String string=input.nextLine();
            if(Objects.equals(string, ":q"))break;
            else cutStr(string);
        }

        input.close();
    }public static void cutStr(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(i==str.length()-1?str.charAt(i):str.charAt(i));
        }


    }
}
