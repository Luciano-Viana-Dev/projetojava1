package cursojava.classes;

/*A essência da orientação a objeto é ir criando métodos,rotinas,ir chamado e processando o software*/
/*Está é nossa classe/objeto que representa o Aluno*/
public class Aluno {

	/* Esses são os atributos do Aluno */
	private String nome;
	private int idade;
	private String dataNascimento;
	private String registroGeral;
	private String numeroCpf;
	private String nomeMae;
	private String nomePai;
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	private String sexo;
	private double nota1;
	private double nota2;
	private double nota3;
	private double nota4;

	public Aluno() {/* Cria os dados na memória - Sendo padrão do Java */

	}

	/* Podemos também ter outros construtores para receber valores definidos */
	public Aluno(String nomePadrao) {
		nome = nomePadrao;
	}

	public Aluno(String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}
	/*-------------------SET e GET abaixo feito de forma manual-------------*/
	/* Veremos os métodos SETTERS e GETTERs do Objeto */
	/* SET é para adicionar ou receber dados para os atributos */
	/* GET é para resgatar ou obter o valor do atributo */

	/* Método SET insere os dados */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/* Método GET recebe "resgata" os dados inserido pelo SET */
	public String getNome() {
		return nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getIdade() {
		return idade;
	}

	/*-------------------SET e GET abaixo feito de forma automatica pela função Generate Getters and Setters-------------*/
	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getNumeroCpf() {
		return numeroCpf;
	}

	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double getNota4() {
		return nota4;
	}

	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}

	/* Método que retorna a média das notas do Aluno */
	public double getMediaNota() {
		return (nota1 + nota2 + nota3 + nota4) / 4;
	}

	/*
	 * Sempre separar as responsabilidades,processos, funções, rotinas em métodos
	 */
	/* Método que retorna true para aprovado e false para reprovado*/
	public boolean getAlunoAprovado() {
		double media = this.getMediaNota(); /*This.getMediaNota() está utilizando o método de cima*/

		if (media >= 70) {
			return true;
		} else {
			return false;
		}
	}
	
	/*Método que retornar o resultado por String com a mensagem informada "Aluno Aprovado" ou "Aluno Reprovado"*/
	public String getAlunoAprovado2() {
		double media = this.getMediaNota();

		if (media >= 70) {
			return "Aluno Aprovado!!";
		} else {
			return "Aluno Reprovado!!";
		}
	}

}
