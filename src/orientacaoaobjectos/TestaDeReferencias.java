package orientacaoaobjectos;

public class TestaDeReferencias {

	public static void main(String[] args) {
		Cliente cl1 = new Cliente("Cleive","Chambule","1221281j");
		Conta c1 = new Conta(1123,cl1);
		c1.deposita(100);
		
		//esse dois objectos passam a apontar a mesma refencia na memoria e sao iguais
		
		Conta c2 = c1;
		c2.deposita(30);
		
		System.out.println(c1.getSaldo());
		System.out.println(c2.getSaldo());
		Cliente cl3 = new Cliente("Denise","Mussepe","31212837");
		Conta c3 = new Conta(343,cl3);
		
		c3.deposita(50);
		
		Cliente cl4 = new Cliente("Denise","Mussepe","31212837");
		Conta c4 = new Conta(654,cl4);
		
		c4.deposita(50); 
		
		//compara se os dois objectos sao iguais ou nao e nao sao
		if(c1 == c2) {
			System.out.println("Sao iguais");
		}else {
			System.out.println("Nao sao iguais");
		}

	}

}
