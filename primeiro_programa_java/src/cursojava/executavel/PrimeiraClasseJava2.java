package cursojava.executavel;

import java.text.DecimalFormat;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava2 {
	
	public static void main(String[] args) {
		
		/*Objeto ainda não existe na memória*/
		Aluno aluno0;
		
		/*Agora sim temos um objeto real na memória*/
		/*Construtor padrão*/
		/*new Aluno() é uma instânciar (Criação de Objeto)*/
		/*Exemplo: aluno1 é uma variável referência para o objetivo aluno*/
		/*Instância 'construtor': São os contrutores para construir o objeto, exemplo "new Aluno()".
		 *Referência: São as variáveis que faz referência para os objetos, exemplo: "aluno1".
		 *Atributo: São os atributos das caracteristicas 'nome, idade...' que representa a pessoa no mundo real, no caso da classe Aluno*/
		Aluno aluno1 = new Aluno(); /*Aqui será o João*/
		/*SET setar os dados dentro do objetivo*/
		aluno1.setNome("João da Silva");
		aluno1.setIdade(17);
		aluno1.setDataNascimento("01/01/1990");
		aluno1.setRegistroGeral("MG.16.055.507");
		aluno1.setNumeroCpf("099.498.905-80");
		aluno1.setNomeMae("Lais da Silva");
		aluno1.setNomePai("Fábio da Silva");
		aluno1.setDataMatricula("10/02/2024");
		aluno1.setNomeEscola("Colégio Ojvetivo integrado");
		aluno1.setSerieMatriculado("3° Ano - Ensino Médio");
		aluno1.setSexo("M");
		aluno1.setNota1(90);
		aluno1.setNota2(80.8);
		aluno1.setNota3(70.9);
		aluno1.setNota4(90.7);
		
		System.out.println("*****************LISTA DE ALUNOS*****************");
		/*GET recuperar os dados dentro do objeto*/
		System.out.println("Nome do aluno 1: " + aluno1.getNome());
		System.out.println("Idade: " + aluno1.getIdade());
		System.out.println("Data Nascimento: " + aluno1.getDataNascimento());
		System.out.println("Número da Identidade: " + aluno1.getRegistroGeral());
		System.out.println("CPF: " + aluno1.getNumeroCpf());
		System.out.println("Nome da Mãe: " + aluno1.getNomeMae());
		System.out.println("Nome do Pai: " + aluno1.getNomePai());
		System.out.println("Data da Matrícula: " + aluno1.getDataMatricula());
		System.out.println("Colégio Matriculado: " + aluno1.getNomeEscola());
		System.out.println("Série Matriculado: " + aluno1.getSerieMatriculado());
		System.out.println("Sexo: " + aluno1.getSexo());
		DecimalFormat deci = new DecimalFormat("0.00");/*Objeto para formatar as casas decimais após a virgula*/
		System.out.println("Média Nota: " + deci.format(aluno1.getMediaNota())); /*Chamada de método que calcula média aluno*/
		System.out.println("Resultado: " + (aluno1.getAlunoAprovado()? "Aprovado" : "Reprovado")); /*Validação do resultado boolean por operador ternário*/
		System.out.println("Resultado2: " + aluno1.getAlunoAprovado2()); /*Resultado por método do tipo String*/
		
		/*=============================================================================*/
		Aluno aluno2 = new Aluno(); /*Aqui será o Lucas*/
		aluno2.setNome("Lucas");
		aluno2.setIdade(25);
		
		System.out.println("-------------------------------------------------");
		System.out.println("Nome do aluno 2: " + aluno2.getNome());
		System.out.println("Idade: " + aluno2.getIdade());
		
		/*=============================================================================*/
		Aluno aluno3 = new Aluno(); /*Aqui será a Patricia*/
		aluno3.setNome("Patrícia");
		aluno3.setIdade(28);
		
		System.out.println("-------------------------------------------------");
		System.out.println("Nome do aluno 3: " + aluno3.getNome());
		System.out.println("Idade: " + aluno3.getIdade());
		
		/*=============================================================================*/
		
		
		/*Construtor com uma parâmetro*/
		Aluno aluno4 = new Aluno("Maria");
		
		/*Construtor com 2 parâmetros*/
		Aluno aluno5 = new Aluno("Lais", 23);
	}

}
