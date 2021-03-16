package modulo.linhademontagem;

import java.util.List;
import java.util.Optional;

import guarda.linhademontagem.GuardaEtapaProcesso;

public class LinhaDeMontagem {

	public void execute() {

		ControlerLinhaDeMontagem controler = new ControlerLinhaDeMontagem();

		String path = "/arquivos/LinhaDeMontagem.txt";
		Optional<List<GuardaEtapaProcesso>> optListEtapas = controler.lerArquivoDeEtapasDeProcesso(path);

		if (optListEtapas.isPresent()) {

			controler.configurarHorarioDeTrabalhoPadrao();
			controler.gerarLinhasDeMontagem(optListEtapas.get());

		} else
			System.out.println("N�o foi poss�vel montar uma linha de montagem");

	}
}
