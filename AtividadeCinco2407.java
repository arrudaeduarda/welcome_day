package switchCase;

import java.util.Scanner;

public class AtividadeCinco2407 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in); 
		int num;
		for (int i= 1; i<=8; i++) {
			System.out.println("Indique um número: ");
			num = ler.nextInt();

			if (num %2 == 0) {
				System.out.println("este número é um número par!");
			}
			else {
				System.out.println("este é um número impar! ");
			}
		}
		
		ler.close();
	}
}
