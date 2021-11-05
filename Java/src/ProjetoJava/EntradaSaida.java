package ProjetoJava;

import java.util.Scanner;

public class EntradaSaida {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a,b, soma;
		System.out.print("Entre como valor de A: ");
		a = ler.nextInt();
		System.out.print("Entre com valor de b: ");
		b= ler.nextInt();
		soma=a+b;
		System.out.printf("\n O valor da soma e: %d", soma);
	}

}
