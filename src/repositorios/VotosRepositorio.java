package repositorios;
import entidades.Candidato;
import entidades.Eleitor;

public interface VotosRepositorio {
    void registrarVoto(Eleitor eleitor, Candidato candidato);
    int contarVotos(Candidato candidato);
}
