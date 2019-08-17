package br.ufrn.imd.lpii.unidadei.hotel.funcionarios;

public abstract class Funcionario {
	private String matricula;
	private String nome;
	private double salario;
	
	public Funcionario() {
		this.matricula = "";
		this.nome = "";
		this.salario = 0;
	}
	
	public Funcionario(String matricula, String nome, double salario) {
		this.matricula = matricula;
		this.nome = nome;
		this.salario = salario;
	}
	
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMatricula() {
		return this.matricula;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getSalario() {
		return this.salario;
	}	
}
