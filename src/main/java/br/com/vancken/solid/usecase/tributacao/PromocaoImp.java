package br.com.vancken.solid.usecase.tributacao;

import java.math.BigDecimal;
import java.time.LocalDate;

public class PromocaoImp implements ReajusteTributavel {

	private BigDecimal valor;
	private LocalDate data;

	public PromocaoImp(BigDecimal valor) {
		this.valor = valor;
		this.data = LocalDate.now();
	}

	@Override
	public BigDecimal valor() {
		return valor;
	}

	@Override
	public LocalDate data() {
		return data;
	}
	
	@Override
	public BigDecimal valorImpostoDeRenda() {
		return valor.multiply(new BigDecimal("0.1"));
	}

}
