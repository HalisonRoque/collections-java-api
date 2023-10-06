package main.java.list.Pesquisa;

public class Livro {
    //atributos
    private String titulos;
    private String autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulos = titulos;
        this.autor = this.autor;
        this.anoPublicacao = this.anoPublicacao;
    }

    public String getTitulos() {
        return titulos;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulos='" + titulos + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                '}';
    }
}
