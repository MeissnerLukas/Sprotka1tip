
package sportka1tip;

import java.util.ArrayList;
import java.util.Random;


public class Sportka1tip {

    
    public static void main(String[] args) {
        final int POCET_HODU = 6;
        // seznam vylosovaných čísel
        ArrayList<Integer> vylosovano = new ArrayList<>();
        // losování zadaného počtu neopakujících se čísel
        for (int i = 1; i <= POCET_HODU; i++) {
            Random ran = new Random();
            int právěpadlo = ran.nextInt(50);
            // generujeme náhodné dokud nebude jiné, než už máme
            while (vylosovano.contains(právěpadlo)) {
                // generuje číslo
                právěpadlo = ran.nextInt(50);
            }
            vylosovano.add(právěpadlo);
        }
        // kontrolní výpis
        System.out.println("Vylosovaná čísla: ");
        for (Integer cislo : vylosovano) {
            System.out.print(cislo + " ");
        }   
        System.out.println();
        // uživatel zadává čísla, my odpovídáme (ukončení nulou)
        System.out.print("Zadej číslo: ");
    }
    
}
