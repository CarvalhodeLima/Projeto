package Servicos;

import Servicos.ServicoApuracaoImpl;
import entidades.Candidato;
import entidades.Eleicao;
import entidades.EleicaoEstadual;
import entidades.Eleitor;
import repositorios.RepositorioVotos;
import repositorios.RepositorioVotosMemoria;
import Servicos.ServicoApuracao;

public class Main {
    public static void main(String[] args) {
        // Criar eleitores
        Eleitor eleitor1 = new Eleitor("Paula", "123456789");
        Eleitor eleitor2 = new Eleitor("Tejando", "987654321");

        // Criar candidatos
        Candidato candidato1 = new Candidato("Candidato X", "Partido Y");
        Candidato candidato2 = new Candidato("Candidato A", "Partido B");

        // Criar uma eleição municipal e adicionar candidatos
        Eleicao eleicaoMunicipal = new EleicaoEstadual.EleicaoMunicipal();
        eleicaoMunicipal.adicionarCandidato(candidato1);
        eleicaoMunicipal.adicionarCandidato(candidato2);

        // Criar repositório de votos e serviço de apuração
        RepositorioVotos repositorioVotos = new RepositorioVotosMemoria();
        ServicoApuracao servicoApuracao = new ServicoApuracaoImpl();

        // votos eleitores
        repositorioVotos.salvarVoto(eleitor1, candidato1);
        repositorioVotos.salvarVoto(eleitor2, candidato2);

        // Registrar osvotos
        eleicaoMunicipal.registrarVoto(candidato1);
        eleicaoMunicipal.registrarVoto(candidato2);

        // Apurar os votos
        servicoApuracao.apurar(eleicaoMunicipal);
    }
}
