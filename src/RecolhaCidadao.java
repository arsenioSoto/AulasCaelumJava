import java.util.Scanner;

public class RecolhaCidadao {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Foram criados cidadoes: " + Cidadao.qtdCidadaoes);
		for (int i = 0; i < 2; i++) {
			System.out.println("Digite o nome: ");
			String nome = ler.nextLine();
			System.out.println("Digite o sexo: ");
			String sexo = ler.nextLine();
			System.out.println("Digite o estado civil: ");
			String estadoCivil = ler.nextLine();
			System.out.println("Digite o idade: ");
			int idade = ler.nextInt();
			ler.nextLine();
			
			Cidadao c = new Cidadao(nome,sexo,estadoCivil,idade);
			c.imprimir();
			System.out.println("Foram criados cidadoes: " + Cidadao.qtdCidadaoes);
		}
	}

}
