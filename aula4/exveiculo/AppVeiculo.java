package exveiculo;

public class AppVeiculo {

    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo("City", "Honda", 12);

        veiculo1.exibirDados();
       

        System.out.println("Consumo de " + veiculo1.consumo() + " km/h ");

    }
}
