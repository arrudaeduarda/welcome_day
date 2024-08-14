package switchCase;

import java.util.Scanner;

public class AtividadeDois2307 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		int soma, semana1, semana2, semana3, semana4;

		System.out.println("Insira o número de venda da primeira semana do mês:");
		semana1 = ler.nextInt();

		System.out.println("Insira o número de venda da segunda semana do mês:");
		semana2 = ler.nextInt();

		System.out.println("Insira o número de venda da terceira semana do mês:");
		semana3 = ler.nextInt();

		System.out.println("Insira o número de venda da quarta semana do mês:");
		semana4 = ler.nextInt();

		soma = semana1+semana2+semana3+semana4;
		System.out.println("Sua soma é de "+ soma + " vendas no mês!");

		switch (soma) {

		case 1:
			System.out.println("Seu bônus é inexistente!");
			break;
		case 2: 
			System.out.println("Seu bônus é inexistente!");
			break;
		case 3:
			System.out.println("Seu bônus é inexistente!");
			break;
		case 4:
			System.out.println("Seu bônus é inexistente!");
			break;
		case 5:
			System.out.println("Seu bônus é inexistente!");
			break;
		case 6:
			System.out.println("Seu bônus é inexistente!");
			break;
		case 7: 
			System.out.println("Seu bônus é inexistente!");
			break;
		case 8:
			System.out.println("Seu bônus é inexistente!");
			break;
		case 9:
			System.out.println("Seu bônus é inexistente!");
			break;
		case 10:
			System.out.println("Seu bônus é de R$100,00!");
			break;
		case 11:
			System.out.println("Seu bônus é de R$100,00!");
			break;
		case 13:
			System.out.println("Seu bônus é de R$100,00!");
			break;
		case 14:
			System.out.println("Seu bônus é de R$100,00!");
			break;
		case 15:
			System.out.println("Seu bônus é de R$100,00!");
			break;
		case 16:
			System.out.println("Seu bônus é de R$300,00!");
			break;
		case 17:
			System.out.println("Seu bônus é de R$300,00!");
			break;
		case 18:
			System.out.println("Seu bônus é de R$300,00!");
			break;
		case 19:
			System.out.println("Seu bônus é de R$300,00!");
			break;
		case 20:
			System.out.println("Seu bônus é de R$300,00!");
			break;

		default:
			System.out.println("Seu bônus é de R$500,00");

		}
		ler.close();
	}

}
