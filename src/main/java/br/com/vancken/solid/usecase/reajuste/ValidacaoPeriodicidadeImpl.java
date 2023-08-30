package br.com.vancken.solid.usecase.reajuste;


import br.com.vancken.solid.ValidacaoException;
import br.com.vancken.solid.domain.Funcionario;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ValidacaoPeriodicidadeImpl implements ValidacaoReajusteSalario {

    public void execute(Funcionario funcionario, BigDecimal aumento) {
        long mesesDesdeUltimoReajuste = ChronoUnit.MONTHS.between(funcionario.getDataUltimoReajuste(), LocalDate.now());
        if (mesesDesdeUltimoReajuste < 6) {
            throw new ValidacaoException("Só pode receber aumento após 6 meses.");
        }
    }
}
