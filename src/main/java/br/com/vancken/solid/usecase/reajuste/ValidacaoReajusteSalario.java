package br.com.vancken.solid.usecase.reajuste;

import br.com.vancken.solid.domain.Funcionario;

import java.math.BigDecimal;

public interface ValidacaoReajusteSalario {
    void execute(Funcionario funcionario, BigDecimal aumento);
}
