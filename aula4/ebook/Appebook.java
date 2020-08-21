package ebook;

public class Appebook {
    public static void main(String[] args) {
        Ebook livro1 = new Ebook("Programação para iniciantes", "Emerson P.", 256, 85);
        Ebook livro2 = new Ebook("Programando em JAVA", "Marcos A.", 508, 200);

        livro1.exibirDados();
        livro2.exibirDados();
       

    
    }
    
}