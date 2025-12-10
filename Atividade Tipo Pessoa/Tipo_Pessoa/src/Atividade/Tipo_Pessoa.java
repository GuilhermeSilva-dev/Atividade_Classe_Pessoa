package Atividade;

public class Tipo_Pessoa {

String Nome;
int Idade;
String Sexo;
String Velocidade;
String Atividade;
boolean Movimento;

void status() {
	
System.out.println("Nome: " + this.Nome);
System.out.println("Idade: " + this.Idade);
System.out.println("Sexo: " + this.Sexo);
System.out.println("Velocidade: " + this.Velocidade);
System.out.println("Atividade: " + this.Atividade);
System.out.println("A pessoa está em movimento?" + this.Movimento);

}

void andar() {
if (this.Movimento == false) {
System.out.println("!!!ATENÇÃO!!! Indivíduo não pode andar.");

}

else {
System.out.println("Indivíduo está andando!");

}


}

void parar() {
this.Movimento = false;

}

void correr() {
this.Movimento = true;

}



	}


