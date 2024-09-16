package repositorios;
import java.util.HashMap;
import java.util.Map;

import entidades.Candidato;
import entidades.Eleitor;
import repositorios.RepositorioVotos;

public class RepositorioVotosMemoria implements RepositorioVotos {
    private Map<String, Candidato> votosEleitores = new HashMap<>();

    @Override
    public void salvarVoto(Eleitor eleitor, Candidato candidato) {
        votosEleitores.put(eleitor.getCpf(), candidato);
        System.out.println("Voto registrado para o eleitor: " + eleitor.getNome());
    }

    public Candidato consultarVotoPorEleitor(Eleitor eleitor) {
        return votosEleitores.get(eleitor.getCpf());
    }
}
