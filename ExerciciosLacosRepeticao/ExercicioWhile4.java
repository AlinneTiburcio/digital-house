package ExerciciosLacosRepeticao;

import java.util.Scanner;

/*
 * 4-	Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de uma 
 * região. Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), 
 * e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). 
 * Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
•	o número de pessoas calmas; 
•	o número de mulheres nervosas; 
•	o número de homens agressivos; 
•	o número de outros calmos;
•	o número de pessoas nervosas com mais de 40 anos; 
•	o número de pessoas calmas com menos de 18 anos.
*/

public class ExercicioWhile4 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int qtd = 0, idade = -1, m = 0, f = 0, o = 0, sexo = 0, comportamento = 0, pc = 0, pn = 1, pa = 1, mn = 0,
				ha = 0, oc = 0, c40 = 0, c18 = 0, i = 0;
		

		while (qtd < 2) {

			while (idade < 0) {
				System.out.println("Digite a " + ++i + "º idade: ");
				idade = leia.nextInt();

				if (idade >= 0) {

					System.out.println("Carregando...");
				} else {

					System.out.println("Idade Inválida!!!");
					i--;
				}

			}

			while (sexo == 0) {
				System.out.println("\nEscolha uma das opções referente ao seu sexo: ");
				System.out.println("Digite 1 - Masculino");
				System.out.println("Digite 2 - Feminino");
				System.out.println("Digite 3 - Outros");
				sexo = leia.nextInt();

				switch (sexo) {
				case 1:
					m++;
					break;
				case 2:
					f++;
					break;
				case 3:
					o++;
					break;
				default:
					System.out.println("Opção inválida");
					sexo = 0;
					break;
				}

			}

			while (comportamento == 0) {
				System.out.println("\nEscolha uma das opções referente ao seu status emocional: ");
				System.out.println("Digite 1 - Pessoa Calma");
				System.out.println("Digite 2 - Pessoa Nervosa");
				System.out.println("Digite 3 - Pessoa Agressiva");
				comportamento = leia.nextInt();

				switch (comportamento) {
				case 1:
					pc++;
					break;
				case 2:
					pn++;
					break;
				case 3:
					pa++;
					break;
				default:
					System.out.println("Opção inválida!!!");
					comportamento = 0;
					break;
				}

			}

			qtd++;

			if (sexo == 2 && comportamento == 2) {
				mn++;
			}

			if (sexo == 1 && comportamento == 3) {
				ha++;
			}

			if (sexo == 3 && comportamento == 1) {
				oc++;
			}
			if (comportamento == 1 && idade >= 40) {
				c40++;
			}
			if (comportamento == 1 && idade <= 18) {
				c18++;
			}

			idade = -1;
			sexo = 0;
			comportamento = 0;

			

		}
		leia.close();
		System.out.println("Quantidade de pessoas calmas: " + pc);
		System.out.println("Quantidade de mulheres nervosas: " + mn);
		System.out.println("Quantidade de homens agressivos: " + ha);
		System.out.println("Quantidade de outros calmos: " + oc);
		System.out.println("Quantidade de pessoas com mais de 40 anos calmos " + c40);
		System.out.println("Quantidade de pessoas com menos de 18 anos calmos: " + c18);

	}

}