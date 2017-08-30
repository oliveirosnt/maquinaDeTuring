package turing;

import java.util.HashSet;

public class Estado {	
	public HashSet<Transicao> transicoes;
	public String nome;
	
	public Transicao getTransicao(String simboloFita) {
		for (Transicao transicao : this.transicoes) {
			if (transicao.simboloAtual.equals(simboloFita)) {
				return transicao;
			}
		}
		return null;
	}
	
	public void addTransicao(Transicao transicao){
		transicoes.add(transicao);
	}
	
	public Estado(String nome) {
		this.nome = nome;
		this.transicoes = new HashSet<Transicao>();
	}
	
	public HashSet<Transicao> getTransicoes(){
		return transicoes;
	}

	public String getNome() {
		return nome;
	}
	
}
