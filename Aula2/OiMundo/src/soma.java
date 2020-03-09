import java.util.Scanner;

public class soma {

	public static void main(String[] args){
		
		/*System.out.println("Escreva dois números");
		
		Scanner leitor = new Scanner(System.in);
		
		int numero1, numero2;
		
		numero1 = leitor.nextInt();
		numero2 = leitor.nextInt();

		System.out.println("Resultado da sua soma é " + (numero1 + numero2 ));
		System.out.println("Resultado da sua subtração é " + (numero1 - numero2 ));
		System.out.println("Resultado da sua mulplicação é " + (numero1 * numero2 ));
		System.out.println("Resultado da sua divisão é " + (numero1 / numero2 ));
		
		*/
		
		Scanner leitor = new Scanner(System.in);
			
		int n1, n2, soma, multi, div, sub;
		
		System.out.println("Escreva o primeiro número");
		n1 = leitor.nextInt();
		System.out.println("Escreva o segundo número");
		n2 = leitor.nextInt();
		
		leitor.close();
		
		soma = n1 + n2;
		multi = n1*n2;
		div = n1/n2;
		sub = n1-n2;
		
		System.out.println("Soma: " + soma);
		System.out.println("Subtração: " + sub);
		System.out.println("Multiplicação: " + multi);
		System.out.println("Divisão: " + div + " Resto da divisão:" + n1%n2);
		
		


	}

}
