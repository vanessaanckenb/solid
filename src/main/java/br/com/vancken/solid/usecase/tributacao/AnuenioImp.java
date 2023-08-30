package br.com.vancken.solid.usecase.tributacao;

import java.math.BigDecimal;
import java.time.LocalDate;

public class AnuenioImp implements Reajuste {

	private BigDecimal valor;
	private LocalDate data;

	public AnuenioImp(BigDecimal valor) {
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

}
