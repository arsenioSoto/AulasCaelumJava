package heranca.polimorfismo.rescrita;

public class ProfessorDaFaculdade extends EmpregadosDaFaculdade {
	private int horasDeAula;
	
	public ProfessorDaFaculdade() {
		
	}
	public ProfessorDaFaculdade(String nome, double salario, int horasDeAula) {
		super(nome, salario);
		this.horasDeAula = horasDeAula;
	}
	public double getGastos() {
		return super.getGastos() + this.horasDeAula * 10;
	}
	
	public String getInfo() {
		String informacao = super.getInfo() + "\nHoras de Aula: " + this.horasDeAula;
		return informacao;
	}
	
	public void setHorasDeAula(int horas) {
		this.horasDeAula = horas;
	}
}
