package entidades;
import java.util.Map;
import repositorios.ServicoApuracao;

class ServicoApuracaoImpl implements ServicoApuracao {
    @Override
    public void apurar(Eleicao eleicao) {
        System.out.println("Apuração para: " + eleicao.getTipoEleicao());
        
        if (eleicao.getVotos().isEmpty()) {
            System.out.println("Nenhum voto registrado.");
            return;
        }
        
        for (Map.Entry<Candidato, Integer> entry : eleicao.getVotos().entrySet()) {
            Candidato candidato = entry.getKey();
            Integer totalVotos = entry.getValue();
            System.out.println("Candidato: " + candidato.getNome() + " | Votos: " + totalVotos);
        }
    }
}
