import java.util.Scanner;

public class RadarRodoviario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*
 
 * se este n�o estiver acima da velocidade limite da estrada, n�o
� aplicada nenhum tipo de multa. 

Se o ve�culo estiver acima da velocidade permitida em at� 20%, o C�digo
Nacional de Tr�nsito prev� uma multa de R$ 130,16,
equivalente a uma infra��o m�dia, al�m dos 4 pontos
na CNH. 

Se a velocidade for entre 20% e 50%
(inclusive), a infra��o � considerada grave e a multa
ser� de R$ 195,23 e na CNH do infrator ser�o
computados 5 pontos.

Para o motorista que for pego
dirigindo com velocidade superior a 50% da m�xima permitida
para o local � uma infra��o grav�ssima e o
valor da multa � de R$ 880,41.*/
		
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
