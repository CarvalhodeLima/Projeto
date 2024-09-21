package entidades;
import java.util.List;

public class EleicaoNacional extends Eleicao {

    public EleicaoNacional(List<Candidato> candidatos) {
        super(candidatos);
    }


    public void iniciarEleicao() {
        System.out.println("Eleição Nacional Iniciada!");
    }
}
