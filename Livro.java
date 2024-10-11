public class Livro {

    private String titulo;
    private String autor;
    private String isbn;
    private int quantidade;

    public Livro(String autor, String isbn, int quantidade, String titulo) {
        this.autor = autor;
        this.isbn = isbn;
        this.quantidade = quantidade;
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + "\nAutor: " + autor + "\nISBN: " + isbn + "\nQuantidade: " + quantidade;
    }
}