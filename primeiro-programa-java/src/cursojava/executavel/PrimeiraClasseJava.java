package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//new Aluno() é uma instância (Criação de Objeto)
		Aluno aluno1 = new Aluno(); //Agora temos um objeto real na memória
		aluno1.setNome("João da Silva");
		aluno1.setIdade(50);
		aluno1.setDataNascimento("01/12/1994");
		aluno1.setRegistroGeral("17447231");
		aluno1.setCpf("119.855.784-48");
		aluno1.setNomeMae("Maria");
		aluno1.setNomePai("Pedro");
		aluno1.setDataMatricula("01/01/2000");
		aluno1.setSerieMatriculado("5a série");
		aluno1.setNomeEscola("Escola JDev Treinamento");
		
		System.out.println("Nome é = " + aluno1.getNome());
		System.out.println("Idade = " + aluno1.getIdade());
		System.out.println("Data de nascimento = " + aluno1.getDataNascimento());
		System.out.println("Idade = " + aluno1.getIdade());
		
		Aluno aluno2 = new Aluno(); 
		
		Aluno aluno3 = new Aluno("Maria"); //Esse objeto sempre terá como nomePadrao Maria
		
		Aluno aluno4 = new Aluno("José", 50);
		
	}

}
