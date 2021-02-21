package com.mycompany.nyplab3;

import java.util.Scanner;

public class lab3 {

    public static void main(String[] args) {

        System.out.println("---------Calisma1---------");
        System.out.println("----------------------------------\n");
        //Turkce karakter bulundurmayan cumledeki sesli harfleri silerek yazdirmak

        Scanner scan = new Scanner(System.in);
        System.out.println("Cumleyi giriniz:\n");
        String cumle = scan.nextLine();
        char[] sesli = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        int uzunluk = cumle.length();
        int adet = 0;

        for (int i = 0; i < uzunluk; i++) {
            int x = 0;
            for (int k = 0; k < 10; k++) {
                if (cumle.charAt(i) == sesli[k]) {
                    adet++;
                    x = 1;
                    break;
                }
            }
            if (x == 0) {
                System.out.print(cumle.charAt(i));
            }
        }

        System.out.println("\nCumledeki sesli harf sayisi: " + adet);

        System.out.println("\n---------Calisma2---------");
        System.out.println("----------------------------------\n");
        //Cumledeki a harflerinin adedini yazdirmak
        
        char harf = 'a';
        int a_sayisi = 0;

        for (int i = 0; i < uzunluk; i++) {
            if (cumle.charAt(i) == harf) {
                a_sayisi++;
            }
        }
        
        System.out.print("Cumledeki a harfi sayisi: " + a_sayisi);

    }
}
