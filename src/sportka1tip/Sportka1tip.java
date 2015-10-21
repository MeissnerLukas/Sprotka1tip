
package sportka1tip;

import java.util.ArrayList;
import java.util.Random;


public class Sportka1tip {

    
    public static void main(String[] args) {
        final int POCET_HODU = 6;
        //o jednu více, než max. hodnota
        final int ROZSAH_HODU = 50; 
        // seznam vylosovaných čísel
        ArrayList<Integer> vylosovano = new ArrayList<>();
        // losování zadaného počtu neopakujících se čísel
        for (int i = 1; i <= POCET_HODU; i++) {
            Random ran = new Random();
            // parametr je hodnota (max - min +1) + min
            // chceme tedy (49-1+1) + 1
            int právěpadlo = ran.nextInt(ROZSAH_HODU)+1;
            // generujeme náhodné dokud nebude jiné, než už máme
            while (vylosovano.contains(právěpadlo)) {
                // generuje číslo
                právěpadlo = ran.nextInt(ROZSAH_HODU)+1;
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
