package orientacaoaobjectos;

public class Carro {
	String cor;
	String modelo;
	double velocidadeActual;
	double velocidadeMaxima;
	Motor motor;
	
	void liga() {
		System.out.println("O carro esta ligado");
	}
	
	void acelera(double quantidade) {
		double velocidadeNova = this.velocidadeActual + quantidade;
		this.velocidadeActual = velocidadeNova;
	}
	
	int	pegaMarcha(){
		if(this.velocidadeActual <	0){
			return	-1;	
		}								
		if(this.velocidadeActual >=	0 && this.velocidadeActual < 40){												
			return	1;						
		}		
		if	(this.velocidadeActual >= 40 &&	this.velocidadeActual <	80)	{			
			return	2;		
		}								
		    return	3;		
	} 
} 

