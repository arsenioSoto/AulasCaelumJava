package heranca.polimorfismo.rescrita;

public class Empregados {

	public static void main(String[] args) {
		ProfessorDaFaculdade prof = new ProfessorDaFaculdade("Cleive", 10000, 10);
		GeradorDeRelatorio f = new GeradorDeRelatorio() ;
		Reitor r = new Reitor("Cleverly", 10000);
		f.adiciona(prof);
		f.adiciona(r);
		System.out.println("Professor" + prof.getGastos());
		System.out.println("Reito: "+r.getGastos());
		
		

	}

}
