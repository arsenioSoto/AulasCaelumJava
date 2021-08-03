package orientacaoaobjectos;

public class ProgramaConta {

	public static void main(String[] args) {
		Cliente c1 = new Cliente("Cleive","Chambule","1221281j");
		Conta minhaConta1 = new Conta(123,c1);
		
		
		
		System.out.println(minhaConta1.getTitular().nome);
		
		Cliente c2 = new Cliente("Denise","Mussepe","31212837");
		Conta minhaConta2 = new Conta(456,c2);
		
		minhaConta2.deposita(2000); 
		
		
		minhaConta1.deposita(1500);
		
		if(minhaConta1.saca(200)) {
			System.out.println("Consegui sacar");
		}else {
			System.out.println("Nao consegui sacar");
		}
		
		System.out.println("Saldo Actual conta 1: " + minhaConta1.getSaldo());
		
		if(minhaConta1.transferePara(minhaConta2, 1000)) {
			System.out.println("Transferencia feita com sucesso");
		}else {
			System.out.println("Transferencia nao foi bem sucedida");
		}
		
		System.out.println("Saldo conta 2: " + minhaConta2.getSaldo() + "\nSaldo conta 1: " + minhaConta1.getSaldo());
        
		int total = Conta.getTotalDeContas();
		System.out.println("Total de contas: " + total );
	}

}
