import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        //      Creo istanza di scanner
        Scanner scanNum = new Scanner(System.in);
        //      Chiedo in input un numero da 1 a 1000
        System.out.println("Inserisci un numero da 1 a 1000");
        int num = scanNum.nextInt();
        //      se il numero non è tra questo range printo un errore
        if (num < 1 || num > 1000) {
            System.out.println("Hai inserito un numero errato");
            //      oppure vado avanti e sostituisco i vari numeri con le stringe
        } else {
            for (int i = 0; i <= num; i++) {
                if (i % 5 == 0 && i % 3 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
        }
    }
}