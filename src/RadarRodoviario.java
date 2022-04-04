import java.util.Scanner;

public class RadarRodoviario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*
 
 * se este não estiver acima da velocidade limite da estrada, não
é aplicada nenhum tipo de multa. 

Se o veículo estiver acima da velocidade permitida em até 20%, o Código
Nacional de Trânsito prevê uma multa de R$ 130,16,
equivalente a uma infração média, além dos 4 pontos
na CNH. 

Se a velocidade for entre 20% e 50%
(inclusive), a infração é considerada grave e a multa
será de R$ 195,23 e na CNH do infrator serão
computados 5 pontos.

Para o motorista que for pego
dirigindo com velocidade superior a 50% da máxima permitida
para o local é uma infração gravíssima e o
valor da multa é de R$ 880,41.*/
		
		Scanner ler = new Scanner(System.in);
		
		
		System.out.println("Informe a frequencia:");
		double frequenciaCarro= ler.nextDouble();
		
		System.out.println("Velocidade maxima:");
		int velocidadeMaxima = ler.nextInt();
		
		double velocidade;
		velocidade = 300 *(1/ frequenciaCarro -1);
		
		if(velocidadeMaxima <= velocidade)
		{
			System.out.println("Velocidade do carro = " + velocidade);
			System.out.println("velocidade limite = " + velocidadeMaxima);
		}
		else if (velocidadeMaxima * 1.2 > velocidade)
		{
			System.out.println("Velocidade do carro = " + velocidade);
			System.out.println("Multa de : R$30,16");
		}
		else if (velocidadeMaxima * 1.2 > velocidade && velocidadeMaxima * 1.5 < velocidade)
		{
			System.out.println("Velocidade do carro = " + velocidade);
			System.out.println("Multa de : R$195,23");
		}
		else 
		{
			System.out.println("Velocidade do carro = " + velocidade);
			System.out.println("Multa de : R$880,41");
		}
	}

}
