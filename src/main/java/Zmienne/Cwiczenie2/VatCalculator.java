package Zmienne.Cwiczenie2;

public class VatCalculator {

    public static void main(String[] args) {
        double netto = 100;
        double vat = 0.23;

        System.out.println("Cena netto: " + netto);
        System.out.println("Kwota VAT: " + netto * vat);
        System.out.println("Do zapłaty (brutto): " + (netto + netto * vat));
    }

}