package bangundataruas;

import java.util.Scanner;


public class Segitigaii extends BangunDatarUAS{
    public void Segitigaii(){
        double ls,as,ts,ss,ks;
        Scanner a = new Scanner(System.in);
        System.out.println("SEGITIGA");
        System.out.println("************************************");
        System.out.println("Masukkan alas : ");
        as = a.nextDouble();
        System.out.println("Masukkan tinggi :");
        ts = a.nextDouble();
        System.out.println("Masukkan sisi : ");
        ss = a.nextDouble();
        ls = (as*ts)/2;
        ks = (ss*2)+as;
        System.out.println("Luas Segitiga adalah : "+ls);
        System.out.println("Keliling Segitiga adalah : "+ks);
    }
}
