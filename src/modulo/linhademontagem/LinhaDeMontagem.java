package modulo.linhademontagem;

import java.util.List;
import java.util.Optional;

import guarda.linhademontagem.GuardaEtapaProcesso;

public class LinhaDeMontagem {

	public void execute() {

		ControlerLinhaDeMontagem controler = new ControlerLinhaDeMontagem();

		Optional<List<GuardaEtapaProcesso>> optListEtapas = controler.lerArquivoDeEtapasDeProcesso();
		if (optListEtapas.isPresent())
			controler.gerarLinhasDeMontagem();
		else
			System.out.println("Não foi possível montar uma linha de montagem");
//			List<GuardaEtapaProcesso> listaEtapas = optListEtapas.get();
//			listaEtapas
//			.stream()
//			.filter( a -> a.getTempoExecucao() > 0)
//			.forEach(etapa -> {
//				
//				lista
//				
//			});

	}
}
