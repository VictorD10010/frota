package frota;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class Gerenciamento {
	
	public List<Carro> frota;
	
	public Gerenciamento(){
		frota= new ArrayList<>();
		
	}
    public void cadastrarVeiculo(Carro veiculo) {
        frota.add(veiculo);
    }

    public List<Carro> listarMaiores() {
        frota.sort(Comparator.comparingDouble(Carro::getAutonomia).reversed());
        return frota.subList(0, Math.min(frota.size(), 2));
    }

    public List<Carro> listarMenores() {
        frota.sort(Comparator.comparingDouble(Carro::getAutonomia));
        return frota.subList(0, Math.min(frota.size(), 2));
    }

    public List<Carro> listarVeiculosPorTipoMotorizacao(String Motorizacao) {
        List<Carro> veiculosPorTipo = new ArrayList<>();
        for (Carro veiculo : frota) {
            if (veiculo.getMotorizacao().equalsIgnoreCase(Motorizacao)) {
                veiculosPorTipo.add(veiculo);
            }
        }
        return veiculosPorTipo;
    }

    public void abastecerFrota(String quantidade_combustivel, double quantidade) {
        for (Carro veiculo : frota) {
            if (veiculo.getMotorizacao().equalsIgnoreCase(quantidade_combustivel)) {
                veiculo.abastecer(quantidade);
            }
        }
    }

    public List<Carro> listarVeiculosAutonomiaInferior(double porcentagem) {
        List<Carro> veiculosAutonomiaInferior = new ArrayList<>();
        for (Carro veiculo : frota) {
            double autonomiaAtual = veiculo.getQuantidade_combustivel() * veiculo.getAutonomia() / veiculo.getCapacidade_tanque();
            if (autonomiaAtual < porcentagem) {
                veiculosAutonomiaInferior.add(veiculo);
            }
        }
        return veiculosAutonomiaInferior;
    }
	
	

}
