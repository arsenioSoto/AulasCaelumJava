
public class Electrodomestico {
	public String marca;
	public String modelo;
	public String cor;
	
	public Electrodomestico() {
		
	}
	
	public Electrodomestico(String marca, String modelo, String cor) {
	this.marca = marca;
	this.modelo = modelo;
	this.cor = cor;
}
	
	
	public void visualizarElectromestico() {
			System.out.println("Marca: " + marca + "\nModelo: "+ modelo +"\nCor: "+ cor);
	}
	

}
