package entidades;
import entidades.Candidato;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Eleicao {
    protected List<Candidato> candidatos = new ArrayList<>();
    protected Map<Candidato, Integer> votos = new HashMap<>();

    public void adicionarCandidato(Candidato candidato) {
        candidatos.add(candidato);
        votos.put(candidato, 0);
    }

    public List<Candidato> getCandidatos() {
        return candidatos;
    }

    public void registrarVoto(Candidato candidato) {
        votos.put(candidato, votos.get(candidato) + 1);
    }

    public Map<Candidato, Integer> getVotos() {
        return votos;
    }

    public abstract String getTipoEleicao();
}

