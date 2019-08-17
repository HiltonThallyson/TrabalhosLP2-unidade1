package br.ufrn.imd.lpii.unidadei.hotel.clientes;

public class Hospede {
	private int codigo;
	private String nome;
	private String CPF;
	private String RG;
	private String telefone;
	
	public Hospede() {
		this.codigo = 0;
		this.nome = " ";
		this.CPF = " ";
		this.RG = " ";
		this.telefone = " ";
	}
	
	public Hospede(int codigo, String nome, String cpf, String rg, String telefone) {
		this.codigo = codigo;
		this.nome = nome;
		this.CPF = cpf;
		this.RG = rg;
		this.telefone = telefone;
	}
	
	public int getCodigo() {
		return this.codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return this.CPF;
	}
	
	public void setCpf(String cpf) {
		this.CPF = cpf;
	}
	
	public String getRg() {
		return this.RG;
	}
	
	public void setRg(String rg) {
		this.RG = rg;
	}
	
	public String getTelefone() {
		return this.telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
