package entidades;


public class Voto {
    private Eleitor eleitor;
    private Candidato candidato;

    public Voto(Eleitor eleitor, Candidato candidato) {
        this.eleitor = eleitor;
        this.candidato = candidato;
    }

    public Eleitor getEleitor() {
        return eleitor;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    @Override
    public String toString() {
        return "Voto{" + "eleitor=" + eleitor.getNome() + ", candidato=" + candidato.getNome() + '}';
    }
}

