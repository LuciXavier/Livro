public class Estoque {

    private Livro[] livros;
    private int contador;

    public Estoque() {
        livros = new Livro[100]; 
        contador = 0;
    }

    public void adicionarLivro(Livro livro) { 
        for (int i = 0; i < contador; i++) {
            if (livros[i].getIsbn().equals(livro.getIsbn())) {
                livros[i].setQuantidade(livros[i].getQuantidade() + livro.getQuantidade());
                System.out.println("Livro já existe. Quantidade atualizada.");
                return;
            }
        }
        if (contador < 100) {
            livros[contador] = livro;
            contador++;
            System.out.println("Livro adicionado.");
        } else {
            System.out.println("Estoque cheio.");
        }
    }

    public void removerLivro(String isbn) {
        for (int i = 0; i < contador; i++) {
            if (livros[i].getIsbn().equals(isbn)) {
                for (int j = i; j < contador - 1; j++) {
                    livros[j] = livros[j + 1]; 
                }
                livros[contador - 1] = null; 
                contador--;
                System.out.println("Livro removido do estoque.");
                return;
            }
        }
        System.out.println("Livro não encontrado.");
    }

    public Livro buscarLivro(String isbn) {
        for (int i = 0; i < contador; i++) {
            if (livros[i].getIsbn().equals(isbn)) {
                return livros[i];
            }
        }
        System.out.println("Livro não encontrado.");
        return null;
    }

    public void listarLivros() {
        if (contador == 0) {
            System.out.println("Estoque vazio.");
        } else {
            for (int i = 0; i < contador; i++) {
                System.out.println(livros[i]);
            }
        }
    }

    public void attQuantidade(String isbn, int quantidade) {
        Livro livro = buscarLivro(isbn);
        if (livro != null) {
            livro.setQuantidade(quantidade);
            System.out.println("Quantidade do livro atualizada.");
        } else {
            System.out.println("Livro não encontrado para atualizar.");
        }
    }
}