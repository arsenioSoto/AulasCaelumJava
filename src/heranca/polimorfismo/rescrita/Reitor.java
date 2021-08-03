package heranca.polimorfismo.rescrita;

public class Reitor extends EmpregadosDaFaculdade{
	
	public Reitor() {
		
	}
	public Reitor(String nome, double salario) {
		super(nome, salario);
	}
	
	public String getInfo() {
		return super.getInfo() + " - Reitor";
	}

}
