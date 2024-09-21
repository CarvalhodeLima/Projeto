package Servicos;
import Servicos.VotacaoServico;
import entidades.Candidato;
import entidades.EleicaoNacional;
import entidades.Eleitor;
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Candidato candidato1 = new Candidato("Bosonaro", 22);
        Candidato candidato2 = new Candidato("Lule", 13);
        List<Candidato> candidatos = new ArrayList<>();
        candidatos.add(candidato1);
        candidatos.add(candidato2);


        EleicaoNacional eleicao = new EleicaoNacional(candidatos);

        Eleitor eleitor1 = new Eleitor("Joao", "12345678900");
        Eleitor eleitor2 = new Eleitor("Maria", "09876543211");
        Eleitor eleitor3 = new Eleitor("Bob esponja", "123123123123");
        Eleitor eleitor4 = new Eleitor("Felipe", "098098098098");

        VotacaoServico servicoVotacao = new VotacaoServico();
        servicoVotacao.registrarVoto(eleitor1, candidato1);
        servicoVotacao.registrarVoto(eleitor2, candidato2);
        servicoVotacao.registrarVoto(eleitor3, candidato1);
        servicoVotacao.registrarVoto(eleitor4, candidato1);

        servicoVotacao.desfazerVoto();

        Candidato vencedor = servicoVotacao.apurarResultado();
        System.out.println("Candidato vencedor: " + vencedor.getNome());
    }
}
