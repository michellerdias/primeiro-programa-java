package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		
		/*String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		String idade = JOptionPane.showInputDialog("Qual a idade do aluno?");
		String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento?");
		String registroGeral = JOptionPane.showInputDialog("Registro Geral");
		String cpf = JOptionPane.showInputDialog("CPF");
		String nomeMae = JOptionPane.showInputDialog("Qual o nome da mãe?");
		String nomePai = JOptionPane.showInputDialog("Qual o nome do pai?");
		String dataMatricula = JOptionPane.showInputDialog("Qual a data da matrícula?");
		String serieMatriculado = JOptionPane.showInputDialog("Qual a série do aluno?");
		String nomeEscola = JOptionPane.showInputDialog("Qual o nome da escola?");
		String nota1 = JOptionPane.showInputDialog("Qual a nota 1?");
		String nota2 = JOptionPane.showInputDialog("Qual a nota 2?");
		String nota3 = JOptionPane.showInputDialog("Qual a nota 3?");
		String nota4 = JOptionPane.showInputDialog("Qual a nota 4?");
		
		//new Aluno() é uma instância (Criação de Objeto)
		Aluno aluno = new Aluno(); //Agora temos um objeto real na memória
		aluno.setNome(nome);
		aluno.setIdade(Integer.valueOf(idade));
		aluno.setDataNascimento(dataNascimento);
		aluno.setRegistroGeral(registroGeral);
		aluno.setCpf(cpf);
		aluno.setNomeMae(nomeMae);
		aluno.setNomePai(nomePai);
		aluno.setDataMatricula(dataMatricula);
		aluno.setSerieMatriculado(serieMatriculado);
		aluno.setNomeEscola(nomeEscola);
		aluno.setNota1(Double.parseDouble(nota1));
		aluno.setNota2(Double.parseDouble(nota2));
		aluno.setNota3(Double.parseDouble(nota3));
		aluno.setNota4(Double.parseDouble(nota4));
			
		
		System.out.println("Nome é = " + aluno.getNome());
		System.out.println("Idade = " + aluno.getIdade());
		System.out.println("Data de nascimento = " + aluno.getDataNascimento());
		System.out.println("Média = " + aluno.getMediaNota());
		
		System.out.println(aluno.getAlunoAprovado() ? "Aprovado" : "Reprovado"); //true=aprovado false=reprovado
		System.out.println(aluno.getAlunoAprovado2());
		
		System.out.println(aluno.toString());*/
		
		//Equals e Hashcode (Diferenciar objetos)
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Alex");
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Alex");
		
		if (aluno1.equals(aluno2)) {
			System.out.println("Alunos são iguais.");
		}else {
			System.out.println("Alunos não são iguais");
		//O java diferencia os objetos com códigos (em memória) por trás
			
		}
		
		
	}

}
