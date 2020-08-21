package exveiculo;

public class Veiculo {
    // atributos
    String modelo, marca;
    int consumo;

    // construtor
    Veiculo(String modelo, String marca, int consumo) {
        
        this.modelo = modelo; 
        this.marca = marca;
        this.consumo = consumo;
    }

    // métodos
    void exibirDados() { 
        System.out.println(modelo + " - " + marca );
    }

    int consumo() { 
        
        return consumo;
    }
}