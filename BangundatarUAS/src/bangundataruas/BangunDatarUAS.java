package bangundataruas;

import java.util.Scanner;


public class BangunDatarUAS {
	public static void main(String[] args) {
        int pil;
      	Segitigaii S = new Segitigaii();
        Persegi K = new Persegi();
        Persegipanjang P = new Persegipanjang();
        Scanner inp = new Scanner(System.in);
        System.out.println("MENU");      
        System.out.println("************************************");   
        System.out.println("1. Segitiga");      
        System.out.println("2. Persegi");      
        System.out.println("3. Persegi Panjang");      
        System.out.println("4. Exit");      
        System.out.print("Pilihan : ");
        pil = inp.nextInt();
        switch(pil){            
            case 1 : S.Segitigaii();
            break;
            case 2 : K.Persegi();
            break;
            case 3 : P.Persegipanjang();
            break;
            case 4 : System.exit(0);
        }
    }   
}
