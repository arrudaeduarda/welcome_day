package switchCase;

import java.util.Scanner;

public class AtividadeQuatro2408 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int num, soma=0;


		for (int i= 1; i<=7; i++) {
			System.out.println("Informe um número: ");
			num = ler.nextInt();
			soma+=num;
			
			
		}
		System.out.println("A soma dos números é de: "+soma);
		ler.close();
	}

}
