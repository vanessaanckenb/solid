package br.com.vancken.solid.usecase.reajuste;

import br.com.vancken.solid.domain.Funcionario;

import java.math.BigDecimal;
import java.util.List;

public class ReajustarSalarioUseCase {

    private final List<ValidacaoReajusteSalario> validacaoReajusteSalario;

    public ReajustarSalarioUseCase(List<ValidacaoReajusteSalario> validacaoReajusteSalario){
        this.validacaoReajusteSalario = validacaoReajusteSalario;
    }

    public void execute(Funcionario funcionario, BigDecimal aumento) {
        validacaoReajusteSalario.forEach(validacao -> validacao.execute(funcionario, aumento));
        final var salarioReajustado = funcionario.getSalario().add(aumento);
        funcionario.reajustaSalario(salarioReajustado);
    }
}
