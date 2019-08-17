package br.ufrn.imd.lpii.unidadei.hotel;

import java.util.ArrayList;

import br.ufrn.imd.lpii.unidadei.hotel.funcionarios.*;

public class Hotel {
	private String nome;
	private String CNPJ;
	private ArrayList<Hospedagem> hospedagem;
	private ArrayList<Recepcionista> recepcionistas;
	private ArrayList<Camareiro> camareiros;
	
	
	public Hotel() {
		this.nome = " ";
		this.CNPJ = " ";
		this.hospedagem = new ArrayList<Hospedagem>();
		this.hospedagem.add(new Hospedagem());
		this.recepcionistas = new ArrayList<Recepcionista>();
		this.recepcionistas.add(new Recepcionista());
		this.camareiros = new ArrayList<Camareiro>();
		this.camareiros.add(new Camareiro());
	}
	
	public Hotel(String nome, String cnpj, ArrayList<Hospedagem> hospedagem, ArrayList<Recepcionista> recepcionistas, ArrayList<Camareiro> camareiros) {
		this.nome = nome;
		this.CNPJ = cnpj;
		this.hospedagem = new ArrayList<Hospedagem>();
		this.hospedagem.addAll(hospedagem);
		this.recepcionistas = new ArrayList<Recepcionista>();
		this.recepcionistas.addAll(recepcionistas);
		this.camareiros = new ArrayList<Camareiro>();
		this.camareiros.addAll(camareiros);
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCnpj() {
		return this.CNPJ;
	}
	
	public void setCnpj(String cnpj) {
		this.CNPJ = cnpj;
	}
	
	//faltam os metodos getters and setter das listas
}
