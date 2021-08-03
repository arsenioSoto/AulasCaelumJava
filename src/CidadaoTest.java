



public class CidadaoTest {

	public static void main(String[] args) {
		Cidadao c = new Cidadao("Rhosty", "Femenino", "Solteira", 27);//criamos com base no primeiro construtor
		
		//com base no segundo construtor
		Cidadao c1;
		String nome = "Alberth";
		String sexo = "Masculino";
		String estadoCivil = "Casado";
		int idade = 34;
		
		
		c1 = new Cidadao(nome, sexo, estadoCivil, idade);
		Cidadao c2 = new Cidadao("Phaula", "Femenino", "Viuva", 72);
		c1.imprimir();
		c.imprimir();
		c2.imprimir();
		
	}

}
