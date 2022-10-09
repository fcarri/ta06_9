package project6;

import java.util.Scanner;
import java.util.Random;

public class ta06_9 {
	public static void main(String args[]){	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Tamany array: ");
		int tamany = sc.nextInt();				
						
		omplir(tamany);
		
		sc.close();
		
	}
	
	public static void omplir(int tamany) {
		
		int k = 0;
		
		Random rand = new Random(); 
		int num[] = new int[tamany];					
		
		for(k = 0; k < tamany; k++) {
			int rand1 = rand.nextInt(10);
			num[k] = rand1; 			
		}
		
		mostrar(tamany, num);
		
	}
	
	public static void mostrar(int tamany, int num[]) {
		
		int suma = 0;
		
		for(int k = 0;k < tamany; k++) {
			System.out.println("array_"+k+"  "+num[k]);
			suma = suma + num[k];
		}
		
		System.out.println("suma: "+suma);
		
	}
}
