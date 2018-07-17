package bangundataruas;

import java.util.Scanner;


public class Persegi extends BangunDatarUAS {
	
	//public class Bujursangkar extends Bangundatar{
	    public void Persegi(){
	        double sk,lk,kk;
	        Scanner c = new Scanner(System.in);
	        System.out.println("Persegi");
	        System.out.println("************************************");
	        System.out.println("Masukkan sisi : ");
	        sk = c.nextDouble();      
	        lk = sk*sk;
	        kk = 4*sk;
	        System.out.println("Luas Bujur Sangkar adalah : "+lk);
	        System.out.println("Keliling Bujur Sangkar adalah : "+kk);
	    } 
}