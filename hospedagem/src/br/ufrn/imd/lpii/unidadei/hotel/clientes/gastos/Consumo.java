package br.ufrn.imd.lpii.unidadei.hotel.clientes.gastos;

public class Consumo {
	private int codigo;
	private String descricao;
	private String quantidade;
	private double valorUnitario;
	
	public Consumo() {
		this.codigo = 0;
		this.descricao = " ";
		this.quantidade = " ";
		this.valorUnitario = 0.0;
	}
	
	public Consumo(int codigo, String descricao, String quantidade, Double valorUnitario) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.valorUnitario = valorUnitario;
	}
	
	public int getCodigo() {
		return this.codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getQuantidade() {
		return this.quantidade;
	}
	
	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}
	
	public double getValorUnitario() {
		return this.valorUnitario;
	}
	
	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	
}
