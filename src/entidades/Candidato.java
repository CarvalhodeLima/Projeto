package entidades;

public class Candidato {
        private String nome;
        private String partido;

        public Candidato(String nome, String partido) {
            this.nome = nome;
            this.partido = partido;
        }

        public String getNome() {
            return nome;
        }

        public String getPartido() {
            return partido;
        }
    }
