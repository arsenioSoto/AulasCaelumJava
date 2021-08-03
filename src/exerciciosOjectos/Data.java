package exerciciosOjectos;

public class Data {
	public int dia;
	public int mes;
	public int ano;
	
	
	public String formatada() {
		String data = this.dia + "-" + this.mes + "-" + this.ano;
		return data;
	}
	
}
