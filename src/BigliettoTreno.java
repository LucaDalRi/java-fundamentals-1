import java.text.DecimalFormat;
import java.util.Scanner;

public class BigliettoTreno {
    public static void main(String[] args) {
//      Istanza scanner inizializzata
        Scanner scanAge = new Scanner(System.in);
        Scanner scanDistance = new Scanner(System.in);
//      Input età e salvataggio nella variabile
        System.out.println("Inserisci la tua età");
        int age = scanAge.nextInt();

        System.out.println("Inserisci i chilometri da percorrere");
        int distanceKm = scanDistance.nextInt();
//      variabili fisse
        float pricePerKm = 0.21f;
        float finalPrice = pricePerKm * distanceKm;
//      Preparo una variabile già con lo sconto
        float Discount40 = ((finalPrice * 40) / 100);
        float Discount20 = ((finalPrice * 20) / 100);
//      If per incanalare il flusso del codice nel risultato corretto
        if (age > 65) {
            finalPrice = (finalPrice - Discount40);
//          Creo un pattern per limitare i decimali del prezzo finale a 2 es. x,xx
            String formattedPrice = new DecimalFormat("#.00").format(finalPrice);
            System.out.println("Il prezzo totale è di " + formattedPrice + " euro");
        } else if (age < 18) {
            finalPrice = (finalPrice - Discount20);
            String formattedPrice = new DecimalFormat("#.00").format(finalPrice);
            System.out.println("Il prezzo totale è di " + formattedPrice + " euro");
        } else {
            String formattedPrice = new DecimalFormat("#.00").format(finalPrice);
            System.out.println("Il prezzo totale è di " + formattedPrice + " euro");
        }

    }
}
