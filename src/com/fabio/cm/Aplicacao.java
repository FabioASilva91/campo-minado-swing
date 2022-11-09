package com.fabio.cm;

import com.fabio.cm.modelo.Tabuleiro;

public class Aplicacao {
	
	public static void main(String[] args) {
		Tabuleiro tabuleiro = new Tabuleiro(3, 3, 9);
		tabuleiro.registraObservador(e -> {
			if (e.isGanhou()) {
				System.out.println("Ganhou");
			}else {
				System.out.println("Ganhou");
				
			}
		
		
		});
	}

}
