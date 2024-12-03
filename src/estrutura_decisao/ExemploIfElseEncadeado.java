package estrutura_decisao;

import java.util.Scanner;

public class ExemploIfElseEncadeado {

	public static void main(String[] args) {
		// Variaveis
		float media;

		Scanner leia = new Scanner(System.in);

		// Entrada
		System.out.println("Digite a sua média: ");
		media = leia.nextFloat();

		// Processsamento
		if (media >= 6) {
			// Saída
			System.out.println("Parabéns, você foi aprovado!");
		} else if (media == 5) {
			System.out.println("Você está de recuperação.");
		} else {
			System.out.println("Você está reprovado.");
		}

	}

}