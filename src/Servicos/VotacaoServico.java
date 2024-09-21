package Servicos;
import entidades.Candidato;
import entidades.Eleitor;
import entidades.Voto;
import repositorios.ApuracaoServico;
import repositorios.VotosRepositorio;
import java.util.HashMap;
import java.util.Map;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class VotacaoServico implements VotosRepositorio, ApuracaoServico {
    private Map<Candidato, Integer> votos = new HashMap<>();
    private Stack<Voto> historicoVotos = new Stack<>();

    // CRIAR
    @Override
    public void registrarVoto(Eleitor eleitor, Candidato candidato) {
        votos.put(candidato, votos.getOrDefault(candidato, 0) + 1);
        historicoVotos.push(new Voto(eleitor, candidato));
        System.out.println("Voto registrado para: " + candidato.getNome());
    }

    // LER
    @Override
    public int contarVotos(Candidato candidato) {
        return votos.getOrDefault(candidato, 0);
    }

    // APAGAR
    public void desfazerVoto() {
        if (!historicoVotos.isEmpty()) {
            Voto ultimoVoto = historicoVotos.pop();
            Candidato candidato = ultimoVoto.getCandidato();
            votos.put(candidato, votos.get(candidato) - 1);
            System.out.println("Último voto desfeito para: " + candidato.getNome());
        } else {
            System.out.println("Nenhum voto para desfazer.");
        }
    }

    // APURAR
    @Override
    public Candidato apurarResultado() {
        return votos.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
    }
}
