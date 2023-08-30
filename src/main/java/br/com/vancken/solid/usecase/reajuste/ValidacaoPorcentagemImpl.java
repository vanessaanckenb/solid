package br.com.vancken.solid.usecase.reajuste;


import br.com.vancken.solid.ValidacaoException;
import br.com.vancken.solid.domain.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ValidacaoPorcentagemImpl implements ValidacaoReajusteSalario {

    public void execute(Funcionario funcionario, BigDecimal aumento) {
        BigDecimal percentualReajuste = aumento.divide(funcionario.getSalario(), RoundingMode.HALF_UP);
        if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
            throw new ValidacaoException("Reajuste nao pode ser superior a 40% do salario!");
        }
    }
}
