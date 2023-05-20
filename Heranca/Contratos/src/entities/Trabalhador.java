package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.NivelTrabalhador;

public class Trabalhador {
	private String nome ; 
	private NivelTrabalhador nivel ; 
	private double salarioBase ; 
	
	
	//ASSOCIAÇÕES - Isto é, foi feita uma composição de objetos 
	//Um trabalhador possui/TEM um departamento
	private Departamento departamento ; 
	
	//Um trabalhador possui/TEM VARIOS contratos
	private List<ContratoHora> contratos = new ArrayList<ContratoHora>() ; 
	
	public Trabalhador() {
	}
	
	public Trabalhador(String nome, NivelTrabalhador nivel, double salarioBase, Departamento departamento) {
		this.nome = nome;
		this.nivel = nivel;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NivelTrabalhador getNivel() {
		return nivel;
	}

	public void setNivel(NivelTrabalhador nivel) {
		this.nivel = nivel;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<ContratoHora> getContratos() {
		return contratos;
	}

	//NAO PODE OCORRER !!!!!!!!!
	//
	
	//public void setContratos(List<ContratoHora> contratos) {
	//	this.contratos = contratos;
	//}
	
	//
	
	//Dois metodos responsáveis por associar ou desassociar um trabalhador a um contrato
	public void addContrato(ContratoHora contrato) {
		//adiciona um contrato à lista
		contratos.add(contrato) ; 
	}
	public void rmContrato(ContratoHora contrato) {
		//remove um contrato da lista
		contratos.remove(contrato) ; 
	}
	public Double quantoGanhou(int ano , int mes) {
		double soma = salarioBase ;
		Calendar cal = Calendar.getInstance() ; 
		
		for (ContratoHora contrato : contratos) {
			cal.setTime(contrato.getDate()) ;
			int contrato_ano = cal.get(Calendar.YEAR) ; 
			int contrato_mes = cal.get(Calendar.MONTH) + 1 ; 
			if(contrato_ano == ano && contrato_mes == mes) {
				soma += contrato.valorTotal() ; 
			}
		}
		return soma ; 
	}

	
}
