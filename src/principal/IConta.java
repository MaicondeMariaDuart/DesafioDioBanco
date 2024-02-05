package principal;

import java.util.List;

public interface IConta {
	void sacar (double valor);
	
	void depositar(double valor);
	
	void transferir(double valor, Conta contaDestino);  //usando polimorfismo
	
	void imprimirExtrato();
	
	

}
