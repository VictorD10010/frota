package frota;

public class teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gerenciamento gerenciador = new Gerenciamento();

        // Exemplo de cadastro de veículos
        gerenciador.cadastrarVeiculo(new Carro("Ford", "Fiesta", 600, "Gasolina", 50, 30));
        gerenciador.cadastrarVeiculo(new Carro("Tesla", "Model S", 700, "Elétrico", 0, 0));
        gerenciador.cadastrarVeiculo(new Carro("Renault", "Sedan", 0, "Gasolina", 100, 30));
        gerenciador.cadastrarVeiculo(new Carro("Tesla", "Model S", 550, "Elétrico", 0, 0));

        // Exemplo de uso das funcionalidades
        System.out.println("Veículos com maior autonomia:");
        System.out.println(gerenciador.listarMaiores());

        System.out.println("Veículos com menor autonomia:");
        System.out.println(gerenciador.listarMenores());

        System.out.println("Veículos movidos a gasolina:");
        System.out.println(gerenciador.listarVeiculosPorTipoMotorizacao("Gasolina"));

        System.out.println("Abastecendo frota com gasolina:");
        gerenciador.abastecerFrota("Gasolina", 50);

        System.out.println("Veículos com autonomia inferior a 20%:");
        System.out.println(gerenciador.listarVeiculosAutonomiaInferior(20));
    }

}
