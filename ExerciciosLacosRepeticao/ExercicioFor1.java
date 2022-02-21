package ExerciciosLacosRepeticao;

/*
 * 1-	Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)
 * */

public class ExercicioFor1 {

	public static void main(String[] args) {
		
		int cont;
		
		for(cont = 1000; cont <= 1999; cont++) {
			if(cont % 11 == 5) {
				System.out.println(cont); 
			}
		
		}

	}

}