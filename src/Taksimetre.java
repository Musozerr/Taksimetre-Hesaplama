import java.text.DecimalFormat;
import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        double mesafe,tutar;

        Scanner input = new Scanner(System.in);
        System.out.println("Gidilen mesafeyi(Km) Giriniz : ");
        mesafe = input.nextDouble();
        tutar = (mesafe * 2.20) + 10;
        if (tutar > 20) {
            DecimalFormat df = new DecimalFormat("#.##");
            System.out.println("Ödenecek Tutar : " + df.format(tutar));
        }
        else {

            System.out.println("Ödenecek Tutar : " + 20);
        }
    }
}
