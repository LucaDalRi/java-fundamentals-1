import java.text.DecimalFormat;
import java.util.Scanner;

public class BigliettoTreno {
    public static void main(String[] args) {

        Scanner ScanAge = new Scanner(System.in);
        Scanner ScanDistance = new Scanner(System.in);

        System.out.println("Inserisci la tua età");
        int Age = ScanAge.nextInt();

        System.out.println("Inserisci i chilometri da percorrere");
        int DistanceKm = ScanDistance.nextInt();

        float PricePerKm = 0.21f;
        float FinalPrice = PricePerKm * DistanceKm;

        float Discount40 = ((FinalPrice * 40) / 100);
        float Discount20 = ((FinalPrice * 20) / 100);

        if (Age > 65) {
            FinalPrice = (FinalPrice - Discount40);
            String formattedPrice = new DecimalFormat("#.00").format(FinalPrice);
            System.out.println("Il prezzo totale è di " + formattedPrice + " euro");
        } else if (Age < 18) {
            FinalPrice = (FinalPrice - Discount20);
            String formattedPrice = new DecimalFormat("#.00").format(FinalPrice);
            System.out.println("Il prezzo totale è di " + formattedPrice + " euro");
        } else {
            String formattedPrice = new DecimalFormat("#.00").format(FinalPrice);
            System.out.println("Il prezzo totale è di " + formattedPrice + " euro");
        }

    }
}
