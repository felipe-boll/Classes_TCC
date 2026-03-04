import java.util.*;

public class Banda extends Artista {
    private List<Cantor> cantores = new ArrayList<>();


    public Banda(String nome, List<Cantor> cantores) {
        super(nome);
        this.cantores = cantores;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Cantor> getCantores() {
        return cantores;
    }

    public void setCantores(List<Cantor> cantores) {
        this.cantores = cantores;
    }

    public ArrayList<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(ArrayList<Musica> musicas) {
        this.musicas = musicas;
    }
}
