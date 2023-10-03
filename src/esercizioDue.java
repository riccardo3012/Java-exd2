
    import java.util.Scanner;

    public class esercizioDue  {
        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);

            System.out.println("Inserisci un numero intero compreso tra 0 e 3" + " ");
            int numero=Integer.parseInt(input.nextLine());
            verificaN(numero);

            input.close();
        }
        public static void verificaN(int numero){
            switch (numero){
                case 0:{
                    System.out.println("zero");
                    break;
                }
                case 1:{
                    System.out.println("uno");
                    break;
                }
                case 2:{
                    System.out.println("due");
                    break;
                }
                case 3:{
                    System.out.println("tre2");
                    break;
                } default:{
                    System.out.println("Il numero non è compreso tra 0 e 3");
                    break;
                }

            }
        }
    }

