package repositorios;

import entidades.Candidato;
import entidades.Eleitor;

public interface RepositorioVotos {
    void salvarVoto(Eleitor eleitor, Candidato candidato);
}
