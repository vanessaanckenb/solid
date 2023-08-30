package br.com.vancken.solid.usecase.promocao;


import br.com.vancken.solid.ValidacaoException;
import br.com.vancken.solid.domain.Cargo;
import br.com.vancken.solid.domain.Funcionario;

public class PromocaoUseCase {

    public void promover(Funcionario funcionario, boolean metaBatida) {
        final var cargoAtual = funcionario.getCargo();
        if(cargoAtual == Cargo.GERENTE){
            throw new ValidacaoException("Gerente não pode receber promoções.");
        }
        if(!metaBatida){
            throw new ValidacaoException("Meta não batida, funcionario não pode receber promoção.");
        }
        funcionario.promover(cargoAtual.getProximoCargo());
    }
}
