package br.ufrn.imd.lpii.unidadei.hotel.servicos;
//metodo nao completado, muito confuso pra mim.
import java.util.Date;

import br.ufrn.imd.lpii.unidadei.hotel.Hospedagem;
import br.ufrn.imd.lpii.unidadei.hotel.funcionarios.Camareiro;

public class ServicoQuarto {
	private Date data;
	private Hospedagem hospedagem;
	private Camareiro camareiro;
	private Boolean realizado;
	
	public ServicoQuarto() {
		this.setData(new Date());
		this.setHospedagem(new Hospedagem());
		this.setCamareiro(new Camareiro());
		this.setRealizado(false);
	}
	
	public ServicoQuarto(Date data, Hospedagem hospedagem, Camareiro camareiro, Boolean realizado) {
		this.setData(data);
		this.setHospedagem(hospedagem);
		this.setCamareiro(camareiro);
		this.setRealizado(realizado);
	}

	public Date getData() {
		return this.data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Hospedagem getHospedagem() {
		return hospedagem;
	}

	public void setHospedagem(Hospedagem hospedagem) {
		this.hospedagem = hospedagem;
	}

	public Camareiro getCamareiro() {
		return camareiro;
	}

	public void setCamareiro(Camareiro camareiro) {
		this.camareiro = camareiro;
	}

	public Boolean getRealizado() {
		return realizado;
	}

	public void setRealizado(Boolean realizado) {
		this.realizado = realizado;
	}
		
	public void realizarServicoQuarto(Hospedagem, Camareiro) {
		this.realizado = true;
	}
	
	public void agendarServicoQuarto(Date data, Hospedagem hospedagem, Camareiro camareiro)
	
}
