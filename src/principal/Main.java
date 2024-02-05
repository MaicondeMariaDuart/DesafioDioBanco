package principal;

import java.util.ArrayList;
import java.util.List;
import principal.Cliente;
import java.util.Scanner;



public class Main {
	public static void main(String[] args) {
		
		Cliente ce = new Cliente();
		Scanner scanner = new Scanner (System.in);
		System.out.println("====SEJA BEM VINDO AO BANCO DO POVO====");
		
		
		System.out.println("==== Nome do cliente: ");
		String nome=scanner.next();
		System.out.println("==== EXTRATO - tecle 1 ");
		System.out.println("==== DEPOSITO - tecle 2 ");
		System.out.println("==== TRANSFERENCIA - tecle 3 ");
		int resp=scanner.nextInt();
		
		
		if (resp==1) {
			Conta cc = new ContaCorrente(ce);
			Conta poupanca  = new ContaPoupanca(ce);
			
			cc.depositar(1000);
			cc.transferir(0, poupanca);
			
			cc.imprimirExtrato();
			poupanca.imprimirExtrato();
			System.exit(resp);
			return;
			
		} else if(resp==2)   {
			Conta cc = new ContaCorrente(ce);
			cc.depositar(3000);
			cc.imprimirExtrato();
			return;
			
			
		} else if(resp==3) {
			Conta cc = new ContaCorrente(ce);
			Conta poupanca  = new ContaPoupanca(ce);
			cc.transferir(1000, poupanca);
			poupanca.imprimirExtrato();
			return;
		} 
			
			
		
		
		
		
				
	
	
		
	}

}
