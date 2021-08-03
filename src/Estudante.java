
public class Estudante {
	public String nome;
	private double teste1;
	private double teste2;
	private double media;
	
	public Estudante(String n, double t1, double t2) {
		nome = n;
		teste1 = t1;
		teste2 = t2;
		media = (t1 + t2) / 2;
	}
	
	public double getTeste1() {
		return teste1;
	}
	
	public double getTeste2() {
		return teste2;
	}
	
	public double getMedia() {
		return media;
	}
	
	public void setTeste1(double t) {
		teste1 = t;
		media = (teste1 + teste2)/2;
	}
	public void imprimir() {
		System.out.println("Nome: " + nome + "\nTeste1: "+ teste1 +"\nTeste2: "+ teste2+ "\nMedia: "+ media);
}
}
