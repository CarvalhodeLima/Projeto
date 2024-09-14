package entidades;

class EleicaoEstadual extends Eleicao {
    @Override
    public String getTipoEleicao() {
        return "Eleição Estadual";
    }

    static class EleicaoMunicipal extends Eleicao {
        @Override
        public String getTipoEleicao() {return "Eleição Municipal";}
    }
}
