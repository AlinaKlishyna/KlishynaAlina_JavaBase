package com.gmail.alinakotova102.corsoRanstad.altro;

import java.util.Scanner;

public class Valute {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Seleziona una valuta di partenza:\n1 - Euro (EUR)\n2 - Dollaro Statunitense (USD)\n3 - Sterlina Britannica (GBP)");
        int valutaPartenza = scan.nextInt();
        System.out.println("Seleziona quantità di valuta: ");
        int sum = scan.nextInt();
        System.out.println("Seleziona una valuta di destinazione:\n1 - Euro (EUR)\n2 - Dollaro Statunitense (USD)\n3 - Sterlina Britannica (GBP)");
        int valutaDestinazione = scan.nextInt();

        double output = 0;
        switch (valutaPartenza) {
            case 1:
                if (valutaPartenza == valutaDestinazione) {
                    output = sum;
                } else if (valutaDestinazione == 2) {
                    output = sum * 1.16;
                } else if (valutaDestinazione == 3) {
                    output = sum * 0.87;
                }
                break;
            case 2:
                if (valutaPartenza == valutaDestinazione) {
                    output = sum;
                } else if (valutaDestinazione == 1) {
                    output = sum * 0.86;
                } else if (valutaDestinazione == 3) {
                    output = sum * 0.75;
                }
                break;
            case 3:
                if (valutaPartenza == valutaDestinazione) {
                    output = sum;
                } else if (valutaDestinazione == 1) {
                    output = sum * 1.15;
                } else if (valutaDestinazione == 2) {
                    output = sum * 1.34;
                }
                break;

        }
        System.out.println(output);
    }
}
