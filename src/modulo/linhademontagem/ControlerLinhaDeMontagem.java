package modulo.linhademontagem;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import guarda.linhademontagem.GuardaEtapaProcesso;

public class ControlerLinhaDeMontagem {

	public Optional<List<GuardaEtapaProcesso>> lerArquivoDeEtapasDeProcesso() {

		// TODO LER ARQUIVO
		trataArquivoDeEntrada(new Object());

		List<GuardaEtapaProcesso> listaProcessos = new ArrayList<>();
		return Optional.of(listaProcessos);

	}

	private void trataArquivoDeEntrada(Object object) {
		// TODO Auto-generated method stub

	}

	public List<GuardaEtapaProcesso> gerarLinhasDeMontagem() {
		

	}

}
