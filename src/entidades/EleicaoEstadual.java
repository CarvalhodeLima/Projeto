package entidades;

public class EleicaoEstadual extends Eleicao {
    @Override
    public String getTipoEleicao() {
        return "Eleição Estadual";
    }

    public static class EleicaoMunicipal extends Eleicao {
        @Override
        public String getTipoEleicao() {
            return "Eleição Municipal";
        }
    }
}
