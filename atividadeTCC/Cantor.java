public class Cantor extends Artista {
    private Banda banda;

    public Cantor(String nome, Banda banda) {
        super(nome);
        this.banda = banda;
    }

    public Banda getBanda() {
        return banda;
    }

    public void setBanda(Banda banda) {
        this.banda = banda;
    }

}
