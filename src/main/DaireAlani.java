package main;

import java.util.Scanner;

public class DaireAlani {
    public static void main(String[] args) {
        int r ,  𝛼  ;
        double pi = 3.14 ,alan ;
        Scanner inp = new Scanner(System.in);
        System.out.print("Yarı Çapı Giriniz : ");
        r = inp.nextInt();
        System.out.print("Merkez Açısını Giriniz : ");
        𝛼 = inp.nextInt();

        alan = (pi*(r*r)*𝛼)/360;

        System.out.println("Daire Dilimin Alanı : " + alan);







    }
}
