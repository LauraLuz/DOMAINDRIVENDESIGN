import java.util.Scanner;

public class soma {

	public static void main(String[] args){
		
		/*System.out.println("Escreva dois n�meros");
		
		Scanner leitor = new Scanner(System.in);
		
		int numero1, numero2;
		
		numero1 = leitor.nextInt();
		numero2 = leitor.nextInt();

		System.out.println("Resultado da sua soma � " + (numero1 + numero2 ));
		System.out.println("Resultado da sua subtra��o � " + (numero1 - numero2 ));
		System.out.println("Resultado da sua mulplica��o � " + (numero1 * numero2 ));
		System.out.println("Resultado da sua divis�o � " + (numero1 / numero2 ));
		
		*/
		
		Scanner leitor = new Scanner(System.in);
			
		int n1, n2, soma, multi, div, sub;
		
		System.out.println("Escreva o primeiro n�mero");
		n1 = leitor.nextInt();
		System.out.println("Escreva o segundo n�mero");
		n2 = leitor.nextInt();
		
		leitor.close();
		
		soma = n1 + n2;
		multi = n1*n2;
		div = n1/n2;
		sub = n1-n2;
		
		System.out.println("Soma: " + soma);
		System.out.println("Subtra��o: " + sub);
		System.out.println("Multiplica��o: " + multi);
		System.out.println("Divis�o: " + div + " Resto da divis�o:" + n1%n2);
		
		


	}

}
