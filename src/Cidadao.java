

public class Cidadao {
	public String nome;
	public String sexo;
	public String estadoCivil;
	private int idade;
	
	public Cidadao() {
		
	}
	public static int qtdCidadaoes = 0;
	
	
	public Cidadao(String nome, String sexo, String estadoCivil, int idade) {
		this.nome = nome;
		this.sexo = sexo;
		this.estadoCivil = estadoCivil;
		this.idade = idade;
		qtdCidadaoes ++;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void imprimir() {
		System.out.println("Nome: " + nome + "\nSexo: "+ sexo +"\nEstado Civil: "+ estadoCivil + "\nIdade: "+idade);
		
	}
}
