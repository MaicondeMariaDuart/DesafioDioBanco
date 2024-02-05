package principal;

import java.util.ArrayList;
import java.util.List;

public abstract class Conta implements IConta {
	
	
	private static final int Conta_AGENCIA_PADRAO = 1;
	private static  int SEQUENCIAL = 1;

	
	protected int agencia;
	protected int numero;
	protected double saldo;
	private Cliente cliente;
	protected String nome;
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public Conta(Cliente cliente) {
		this.agencia = Conta_AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public void sacar(double valor) {
		saldo -= saldo + valor;
		
	}

	@Override
	public void depositar(double valor) {
		saldo += saldo + valor;

	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	protected void imprimirinfoComuns() {
		//System.out.println(String.format("Titular: %s", this.cliente.getNome()));       // %s formato string
		System.out.println(String.format("Agencia: %d", this.agencia));   //%d formato decimal
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo)); //%.2f duas casas decimais
	}
	
	
	public List<Cliente> nome(){
		
		List<Cliente> nome = new  ArrayList<>();
		
		int i=0;
		while (i <10) {
				Cliente actual = new Cliente();
				nome.add(actual);
				i++;
		}
		System.out.println(nome.getFirst());
		return nome;
	}


}
