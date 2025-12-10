package Atividade;

public class Principal {

	public static void main(String[] args) {
		
		Tipo_Pessoa p1 = new Tipo_Pessoa();
		p1.Nome = "Andressa";
		p1.Idade = 18;
		p1.Sexo = "Feminino";
		p1.Velocidade = "1km/30min";
		p1.Atividade = "Parada";
		p1.parar();
		
		p1.status();
		p1.andar();
		
		System.out.println("  ");
		
		System.out.println("  ");
		
		Tipo_Pessoa p2 = new Tipo_Pessoa();
		p2.Nome = "Guilherme";
		p2.Idade = 20;
		p2.Sexo = "Masculino";
		p2.Velocidade = "1km/15min";
		p2.Atividade = "Correndo";
		p2.correr();
		
		p2.status();
		p2.andar();
		
		System.out.println("  ");
		System.out.println("  ");
		
		
		


	}

}
