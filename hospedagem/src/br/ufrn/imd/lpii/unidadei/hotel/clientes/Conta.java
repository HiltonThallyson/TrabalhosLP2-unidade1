package br.ufrn.imd.lpii.unidadei.hotel.clientes;

import java.util.ArrayList;

import br.ufrn.imd.lpii.unidadei.hotel.clientes.gastos.Consumo;

public class Conta {
	private int codigo;
	private double valor;
	private Boolean pago;
	private ArrayList<Consumo> consumo;
	
	public Conta() {
		this.codigo = 0;
		this.valor = 0.0;
		this.pago = false;
		this.consumo = new ArrayList<Consumo>();
		this.consumo.add(new Consumo());
	}
	
	public Conta(int codigo, double valor, Boolean pago, ArrayList<Consumo> consumo) {
		this.codigo = codigo;
		this.valor = valor;
		this.pago = pago;
		this.consumo = new ArrayList<Consumo>();
		this.consumo.addAll(consumo);
		
	}
	
	public int getCodigo() {
		return this.codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public double getValor() {
		return this.valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public Boolean getPago() {
		return this.pago;
	}
	
	public void setPago(Boolean pago) {
		this.pago = pago;
	}
	
	//Faltam os metodos getter and Setter para a lista
}
