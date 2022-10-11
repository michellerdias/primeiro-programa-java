package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
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
		Aluno aluno1 = new Aluno(); //Agora temos um objeto real na memória
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(registroGeral);
		aluno1.setCpf(cpf);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setSerieMatriculado(serieMatriculado);
		aluno1.setNomeEscola(nomeEscola);
		aluno1.setNota1(Double.parseDouble(nota1));
		aluno1.setNota2(Double.parseDouble(nota2));
		aluno1.setNota3(Double.parseDouble(nota3));
		aluno1.setNota4(Double.parseDouble(nota4));
			
		
		System.out.println("Nome é = " + aluno1.getNome());
		System.out.println("Idade = " + aluno1.getIdade());
		System.out.println("Data de nascimento = " + aluno1.getDataNascimento());
		System.out.println("Média = " + aluno1.getMediaNota());
		System.out.println("Idade = " + aluno1.getIdade());
		
		
		System.out.println(aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"); //true=aprovado false=reprovado
		System.out.println(aluno1.getAlunoAprovado2());
		
	}

}
