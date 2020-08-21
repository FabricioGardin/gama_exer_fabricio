package ebook;

public class Ebook {

    // atributos
    String titulo, autor;
    int totalPaginas, paginaAtual;

    // construtor
    Ebook(String titulo, String autor, int totalPaginas, int paginaAtual) {
        
        this.titulo = titulo; 
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.paginaAtual = paginaAtual;
    }

    // métodos
    void exibirDados() { 
        System.out.println("Titulo: " + titulo + " - Autor: " + autor
         + " Total pg: " + totalPaginas + " Pagina atual: " + paginaAtual);
    }

    int irParaPagina(int cont){
        int irPagina;
        irPagina = paginaAtual + cont;

    }
    
   int avancaPagina(){
       paginaAtual = (paginaAtual + 1);
        
       return paginaAtual;
    }
    int retrocederPagina(){
        paginaAtual = (paginaAtual - 1);
        
        return paginaAtual;
    }

    int exibirPagina(){
                
        return paginaAtual;
    }

    void exibirCapa() { 
        System.out.println("Titulo: " + titulo + " - Autor: " + autor
         + " Total pg: " + totalPaginas + " Pagina atual: 0 ");
    }
}
    
