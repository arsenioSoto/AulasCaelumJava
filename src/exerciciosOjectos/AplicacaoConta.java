package exerciciosOjectos;

public class AplicacaoConta {

	public static void main(String[] args) {
		Conta conta1 = new Conta("Cleive");
		
		
		conta1.setNumero(123);
		conta1.setAgencia("56552-9");
		Data data = new Data();
		data.dia = 11;
		data.mes = 01;
		data.ano = 2021;
		
		conta1.setDataDeAbertura(data);
		
		conta1.deposita(2000);
		System.out.println("Saldo apos o deposito: " + conta1.getSaldo());
		conta1.saca(100);
		System.out.println("Saldo apos o saque: " + conta1.getSaldo());
		System.out.println("Rendimento mensal: " + conta1.getCalculaRendimento());
        System.out.println(conta1.recuperaDadosParaImpressao());
        
        Conta conta2 = new Conta("Cleve");
		
        Data data1 = new Data();
		data1.dia = 10;
		data1.mes = 01;
		data1.ano = 2021;
		conta2.setNumero(143);
		conta2.setAgencia("56432-1");
		conta2.setDataDeAbertura(data1);
		System.out.println(conta2.recuperaDadosParaImpressao());

	}

}
