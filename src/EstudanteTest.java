
public class EstudanteTest {

	
	public static void main(String[] args) {
		
        Estudante est = new Estudante("Arsenio",12,14);
		
		est.imprimir();
		
		System.out.println("Media: " + est.getMedia());//acesso da media
		
		est.setTeste1(17);//modificacao do teste1
		
		est.imprimir();
		
		
		
		
	}

}
