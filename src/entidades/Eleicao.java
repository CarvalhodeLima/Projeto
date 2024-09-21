package entidades;

import java.util.List;

public class Eleicao {
    protected List<Candidato> candidatos;

    public Eleicao(List<Candidato> candidatos) {
        this.candidatos = candidatos;
    }

    public List<Candidato> getCandidatos() {
        return candidatos;
    }

    public void adicionarCandidato(Candidato candidato) {
        candidatos.add(candidato);
    }

    @Override
    public String toString() {
        return "Eleicao{" + "candidatos=" + candidatos + '}';
    }
}

