package frota;

import java.util.ArrayList;

public class Carro {
	
		private String marca;
		private String modelo;
		private double autonomia;
		private String motorizacao;
		private double capacidade_tanque;
		private double quantidade_combustivel;
		
		
		public Carro(String marca,String modelo,double autonomia,String motorizacao,double capacidade_tanque,double quantidade_combustivel) {
			this.marca=marca;
			this.modelo=modelo;
			this.autonomia=autonomia;
			this.motorizacao=motorizacao;
			this.capacidade_tanque=capacidade_tanque;
			this.quantidade_combustivel=quantidade_combustivel;
		}


		public String getMarca() {
			return marca;
		}


		public void setMarca(String marca) {
			this.marca = marca;
		}


		public String getModelo() {
			return modelo;
		}


		public void setModelo(String modelo) {
			this.modelo = modelo;
		}


		public double getAutonomia() {
			return autonomia;
		}


		public void setAutonomia(double autonomia) {
			this.autonomia = autonomia;
		}


		public String getMotorizacao() {
			return motorizacao;
		}


		public void setMotorizacao(String motorizacao) {
			this.motorizacao = motorizacao;
		}


		public double getCapacidade_tanque() {
			return capacidade_tanque;
		}


		public void abastecer(double quantidade) {
			quantidade_combustivel = Math.min(capacidade_tanque, quantidade_combustivel + quantidade);
			
		}


		public double getQuantidade_combustivel() {
			// TODO Auto-generated method stub
			return 0;
		}

		  @Override
		    public String toString() {
		        return  "marca='" + marca + '\'' +
		                ", modelo='" + modelo + '\'' +
		                ", autonomia=" + autonomia +
		                ", motor='" + motorizacao + '\'' +
		                ", tanque=" + capacidade_tanque +
		                ", quantidade_combustivel=" + quantidade_combustivel +
		                '}';
		    }
		
		
};
