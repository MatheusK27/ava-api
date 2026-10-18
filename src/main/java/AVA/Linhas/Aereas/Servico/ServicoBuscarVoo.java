package AVA.Linhas.Aereas.Servico;


import AVA.Linhas.Aereas.DTOEntrada.DadosBuscarVoo;
import AVA.Linhas.Aereas.DTOSaida.DadosBusca;
import AVA.Linhas.Aereas.Repositorio.RepositorioVoo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ServicoBuscarVoo {

    private final RepositorioVoo repositorioVoo;

    public List<DadosBusca > buscarVoosPorOrigemEDestino(DadosBuscarVoo dados){
        return  repositorioVoo.findByOrigemAndDestino(dados.origem(),dados.destino())
                .stream().map(DadosBusca::new).toList();

    }
}
