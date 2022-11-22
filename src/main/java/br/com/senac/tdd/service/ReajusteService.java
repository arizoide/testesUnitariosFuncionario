package br.com.senac.tdd.service;

import java.math.BigDecimal;

import br.com.senac.tdd.modelo.Desempenho;
import br.com.senac.tdd.modelo.Funcionario;

public class ReajusteService {

	public void concederReajuste(Funcionario funcionario,
			Desempenho desempenho) {
		BigDecimal reajuste = desempenho.percentualReajuste();
		funcionario.reajustarSalario(reajuste);
	}

}




