package orientacaoaobjectos;

public class Conta {
	private int numero;
	private double saldo;
	private Cliente titular;
	private static int totalDeContas;
	
	public Conta(int numero, Cliente titular){
		this.numero = numero;
		this.titular = titular;
		Conta.totalDeContas += 1;
	}
	
	public int getNumero(){
		return this.numero;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public Cliente getTitular(){
		return this.titular;
	}
	public static int getTotalDeContas() {
		return Conta.totalDeContas;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	boolean saca(double valor) {
		if(this.saldo < valor) {
			return false;
		}
		else {
			this.saldo -= valor;
			return true;
		}
	}
	
       void deposita(double quantidade) {
		this.saldo += quantidade;
	}
       
       boolean transferePara(Conta destino, double valor) {
    	   boolean retirou = this.saca(valor);//usamos o metodo saca para transferir
    	   if(retirou == false) {//caso o valor seja maior que o saldo nao transfere
    		   return false;
    	   }else {//caso o valor seja menor que o saldo levamos o valor sacado e depositamos na conta destino
    		   destino.deposita(valor);
    		   return true;
    	   }
       }

}
