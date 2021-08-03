package exerciciosOjectos;

public class Conta {
	private String titular;
	private int numero;
	private String agencia;
	private double saldo;
	private Data dataDeAbertura;
	private static int id;
	
	public Conta() {
		
	}
	
	public Conta(String titular) {
		this.titular = titular;
		Conta.id += 1;
	}
	
	public String getTitular() {
		return this.titular;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public String getAgencia() {
		return this.agencia;
	}
	
	public Data getDataDeAbertura() {
		return this.dataDeAbertura;
	}
	
	public static int getId() {
		return Conta.id;
	}
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	public void setDataDeAbertura(Data dataAbert) {
		this.dataDeAbertura = dataAbert;
	}
	public void saca(double valor) {
		this.saldo -= valor;
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public double getCalculaRendimento() {
		return this.saldo *= 0.1;
	}
	
	public String recuperaDadosParaImpressao() {
		String dados ="Id: " + Conta.id + "\nTitular: " + this.titular + "\nNumero: " + this.numero + "\nAgencia: " + this.agencia + "\nSaldo: " + this.saldo + "\nData de Abertura: " + this.dataDeAbertura.formatada();
		return dados;
	}
	
}
