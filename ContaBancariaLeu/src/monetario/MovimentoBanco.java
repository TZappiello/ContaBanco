package monetario;

import java.util.Random;
import java.util.Scanner;

public class MovimentoBanco {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		Random ge = new Random();
		
		ContaBanco p1 = new ContaBanco();
		
		System.out.println("Digite o Banco:");
		p1.setBanco(sc.next());
			
		p1.setNumConta(ge.nextInt(9999));
		System.out.println("Numero da Conta: " + p1.getNumConta());
			
		System.out.println("Digite o Nome do Cliente:");
		p1.setDono(sc.next());
		sc.nextLine();
		
		System.out.println("Qual tipo de Conta: CC/CP ");
		p1.abrirConta(sc.next());
		
		
		System.out.println("Quanto deseja depositar: ");
		p1.depositar(sc.nextInt());	
		
		
		p1.banco();
		p1.estadoAtual();
	}

}
