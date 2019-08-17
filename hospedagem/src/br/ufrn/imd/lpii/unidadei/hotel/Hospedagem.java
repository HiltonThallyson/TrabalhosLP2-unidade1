package br.ufrn.imd.lpii.unidadei.hotel;

import java.util.Date;

import br.ufrn.imd.lpii.unidadei.hotel.clientes.Conta;
import br.ufrn.imd.lpii.unidadei.hotel.clientes.Hospede;

public class Hospedagem {
	private int codigo;
	private Date dataEntrada;
	private Date dataSaida;
	private Hospede hospede;
	private Aposento aposento;
	private Conta conta;
	
	public Hospedagem() {
		this.codigo = 0;
		this.dataEntrada = new Date();
		this.dataSaida = new Date();
		this.hospede = new Hospede();
		this.aposento = new Aposento();
		this.conta = new Conta();
		
	}
	
	public Hospedagem(int codigo, Date dataEntrada, Date dataSaida, Hospede hospede, Aposento aposento, Conta conta) {
		this.codigo = codigo;
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
		this.hospede = hospede;
		this.aposento = aposento;
		this.conta = conta;
		
	}
	
	public int getCodigo() {
		return this.codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public Date getDataEntrada() {
		return this.dataEntrada;
	}
	
	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	
	public Date getDataSaida() {
		return this.dataSaida;
	}
	
	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
	}
	
	public Hospede getHospede() {
		return this.hospede;
	}
	
	public void setHospede(Hospede hospede) {
		this.hospede = hospede;
	}
	
	public Aposento getAposento() {
		return this.aposento;
	}
	
	public void setAposento(Aposento aposento) {
		this.aposento = aposento;
	}
	
	public Conta getConta() {
		return this.conta;
	}
	
	public void setConta(Conta conta) {
		this.conta = conta;
	}
}
