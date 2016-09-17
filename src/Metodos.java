
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Metodos extends JFrame {
	int linha;
	int coluna;
	int matriz[][];
	String palavra;
	char palavranumerada[];
	char palavranumeradadois[];
	String palavradois;
	int tamanho;
	int[] vetor;
	
	public JPanel panel;  
    public JLabel[][] matrizz;

	public Metodos(int x, String y, String z, int tamanhox) {

		linha = x;
		coluna = x;
		matriz = new int[linha][coluna];
		palavranumerada = new char[x];
		palavranumeradadois = new char[tamanhox];
		palavra = y;
		palavradois = z;
		tamanho = tamanhox;
		vetor = new int[tamanho];
		this.setSize(600,500);  
		this.setVisible(true);  

	}

	
	
	public void componentes(){  
        
		this.setLayout(new BorderLayout());
        matrizz = new JLabel[linha][coluna];  
        
        panel = new JPanel();  
        panel.setLayout(new GridLayout(linha,coluna));  
        comparacao();  
       
          
       for (int i = 0; i < matriz.length; i++) {
		for (int j = 0; j < matriz[i].length; j++) {
			if(matriz[i][j]==1){
				matrizz[i][j] = new JLabel(1+"");
				panel.add(matrizz[i][j]);
			}else{
			matrizz[i][j] = new JLabel(0+"");
			panel.add(matrizz[i][j]);
			}
		}
	}
        
        
        this.add(panel, BorderLayout.CENTER);  
          
    }  
	
	
	
	
	
	
	
	
	
	
	
	
	// Transformando String em char e colocando em cada indice do vetor
	public void NumerandoPalavraUm() {
		for (int i = 0; i < palavranumerada.length; i++) {
			palavranumerada[i] = palavra.charAt(i);
		}
	}

	public void NumerandoPalavraDois() {
		for (int i = 0; i < palavranumeradadois.length; i++) {
			palavranumeradadois[i] = palavradois.charAt(i);
		}
	}

	// metodo que compara para achar valores e colocar em um vetor para depois
	// colocar na matriz
	public void comparacao() {
		NumerandoPalavraUm();
		NumerandoPalavraDois();
		ZerandoMatriz();
		

		for (int i = 0; i < palavranumeradadois.length; i++) {

			for (int j = 0; j < palavranumerada.length; j++) {
				if (palavranumeradadois[i] == palavranumerada[j]) {

					vetor[i] = j;

				}
			}

		}
		
		int temp =0;
		for (int i = 0; i < vetor.length; i++) {
			if(i%2==0){
				 temp = vetor[i];
			}else{
				matriz[temp][vetor[i]]=1;
			}
		}
		
		

		Mostrando();
	}

	// ZERANDO MATRIZ (TODOS ELEMENTOS 0 )

	public void ZerandoMatriz() {

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = 0;
			}
		}
	}

	// MOSTRAR MATRIZ
	public void Mostrando() {
		for (int i = 0; i < matriz.length; i++) {
			System.out.print("Linha [" + i + "] :      ");

			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}

			System.out.println();
		}
		System.out.println();
	}

}
