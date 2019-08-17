package br.ufrn.imd.lpii.unidadei.hotel.funcionarios;

import java.util.ArrayList;

public class Recepcionista extends Funcionario {
	private ArrayList<String> idiomasQueDomina;
	
	public Recepcionista() {
		super();
		this.idiomasQueDomina = new ArrayList<String>();
		this.idiomasQueDomina.add(" ");
	}
	
	public Recepcionista(String matricula, String nome, double salario, ArrayList<String> idiomas) {
		super(matricula, nome, salario);
		this.idiomasQueDomina.addAll(idiomas);
	}
	
	public void setIdiomasQueDomina(ArrayList <String> idiomas) {
		this.idiomasQueDomina = idiomas;
	}
	public ArrayList<String> getIdiomasQueDomina(){
		return this.idiomasQueDomina;
	}
	
	public void addIdiomas(String idioma) {
		this.idiomasQueDomina.add(idioma);
	}
}
