import java.util.Scanner;

public class ElectrodomesticoTest {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Electrodomestico electro = new Electrodomestico();
		
		System.out.println("Digite a marca: ");
		String marca = ler.nextLine();
		System.out.println("Digite o modelo: ");
		String modelo = ler.nextLine();
		System.out.println("Digite a cor: ");
		String cor = ler.nextLine();
		
	    electro.marca = marca; 
		electro.modelo = modelo;
		electro.cor = cor;
		
		electro.visualizarElectromestico();
	}
	
	

}
