package com.levirchianca.bibliotecarecyclerview;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Taniro on 17/09/2016.
 */
public class Livro {

    private String titulo;
    private String autor;
    private int quantidade;
    private Boolean lido;

    public Livro(String titulo, String autor, int quantidade, Boolean lido) {
        this.titulo = titulo;
        this.autor = autor;
        this.quantidade = quantidade;
        this.lido = lido;
    }

    public static List<Livro> getLivros(){
        List<Livro> listaLivros = new ArrayList<Livro>();
        listaLivros.add(new Livro("Harry Potter e a pedra filosofal", "J. K. Rowling", 2, true));
        listaLivros.add(new Livro("Harry Potter e a Câmara Secreta", "J. K. Rowling", 3, true));
        listaLivros.add(new Livro("Harry Potter e o Prisioneiro de Azkaban", "J. K. Rowling", 5, true));
        listaLivros.add(new Livro("Harry Potter e o Cálice de Fogo", "J. K. Rowling", 2, true));
        listaLivros.add(new Livro("Harry Potter e a Ordem da Fênix", "J. K. Rowling", 1, false));
        listaLivros.add(new Livro("Harry Potter e o Enigma do Príncipe", "J. K. Rowling", 3, false));
        listaLivros.add(new Livro("Harry Potter e as Relíquias da Morte", "J. K. Rowling", 2, false));
        listaLivros.add(new Livro("O pistoleiro", "Stephen King", 1, true));
        listaLivros.add(new Livro("A Escolha dos Três ", "Stephen King", 5, true));
        listaLivros.add(new Livro("As Terras Devastadas", "Stephen King", 4, true));
        listaLivros.add(new Livro("Mago e Vidro", "Stephen King", 3, true));
        listaLivros.add(new Livro("Lobos de Calla", "Stephen King", 2, false));
        listaLivros.add(new Livro("Canção de Susannah", "Stephen King", 4, false));
        listaLivros.add(new Livro("A Torre Negra", "Stephen King", 5, false));
        listaLivros.add(new Livro("O Vento Pela Fechadura", "Stephen King", 5, true));
        listaLivros.add(new Livro("Viagem ao centro da terra ", "Júlio Verne", 3, false));
        listaLivros.add(new Livro("Senhor dos Anéis: a sociedade do anel", "Tolkien", 1, true));
        listaLivros.add(new Livro("Senhor dos Anéis: as duas torres", "Tolkien", 1, true));
        listaLivros.add(new Livro("Senhor dos Anéis: o retorno do rei", "Tolkien", 1, true));
        listaLivros.add(new Livro("Dom Casmurro", "Machado de Assis", 4, false));

        for (int i = 0; i<50000; i++ ){
            listaLivros.add(new Livro("Livro "+i, "Autor "+i, 2, false));
        }

        return listaLivros;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Boolean getLido() {
        return lido;
    }

    public void setLido(boolean lido) {
        this.lido = lido;
    }
}
