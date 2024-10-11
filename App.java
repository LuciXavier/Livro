public class App {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();

        Livro livro1 = new Livro("Charlie Donlea", "1239", 10, "A garota do Lago");
        Livro livro2 = new Livro("J.K. Rowling", "98761", 5, "Harry Potter");

        estoque.adicionarLivro(livro1);
        estoque.adicionarLivro(livro2);

        estoque.listarLivros();

        Livro livroEncontrado = estoque.buscarLivro("123456789");
        if (livroEncontrado != null) {
            System.out.println("Livro encontrado: " + livroEncontrado);
        }

        estoque.attQuantidade("123456789", 20);

        estoque.removerLivro("987654321");

        estoque.listarLivros();
    }
}