package heranca.polimorfismo.rescrita;

public class EmpregadosDaFaculdade {
	public String nome;
	private double salario;
	
	public EmpregadosDaFaculdade() {
		
	}
	public EmpregadosDaFaculdade(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	public double getGastos() {
		return this.salario;
	}
	
	public String getInfo() {
		return "Nome: " + this.nome + "\nSalario: " + this.salario;
	}

}
