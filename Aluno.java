package faculdade.trabalho_encapsulamento;

public class Aluno {

	private String nome;
	private int matricula;
	private double notaFinal;
	
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public void setNotaFinal(double nota) {
		if (nota <= 10 || nota >= 0) {
			notaFinal = nota;
		}
		else {
			System.out.println("Erro, a nota tem que ser entre 1 e 10");
			System.exit(1);
		}
	}
	
	public boolean isAprovado() {
		if (getNotaFinal() > 7) {
			return true;
		}
		return false;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getMatricula() {
		return matricula;
	}
	
	public double getNotaFinal() {
		return notaFinal;
	}
	
	public String getInfo() {
		return "Nome: " + nome + "; Matricula: " + matricula + "; Nota Final: " + notaFinal;
	}
}
