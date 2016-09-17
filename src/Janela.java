
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JButton;

import java.awt.TextField;
import java.awt.event.ActionEvent;




import java.awt.event.ActionListener;
import java.awt.Label;
import java.awt.Button;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import java.awt.Font;
import javax.swing.JLabel;

public class Janela extends JFrame {

	private JPanel contentPane;
	private JTextField palavradois;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela frame = new Janela();
					frame.setVisible(true);
					frame.setTitle("Matriz de Adjacência               by: Breno Negreiros");
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Janela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setForeground(new Color(0, 0, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final TextField palavra = new TextField();
		palavra.setBounds(38, 50, 89, 22);
		contentPane.add(palavra);
		
		JButton btnNewButton = new JButton("Inserir");
		btnNewButton.setBounds(38, 89, 89, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
			
			int x =palavra.getText().length();
			int tamanhox =palavradois.getText().length();
			String y = palavra.getText();
			String z = palavradois.getText();
			Metodos m = new Metodos(x,y,z,tamanhox);
			
			//------------INSERINDO DADOS----------------------
			
		
			
			m.componentes();
			
			}
		});
		
		
	contentPane.add(btnNewButton);
	
	palavradois = new JTextField();
	palavradois.setBounds(172, 50, 236, 22);
	contentPane.add(palavradois);
	palavradois.setColumns(10);
	
	JEditorPane dtrpnGveOndeV = new JEditorPane();
	dtrpnGveOndeV.setBackground(new Color(250, 128, 114));
	dtrpnGveOndeV.setFont(new Font("Segoe UI", Font.BOLD, 12));
	dtrpnGveOndeV.setForeground(new Color(255, 0, 0));
	dtrpnGveOndeV.setEnabled(false);
	dtrpnGveOndeV.setEditable(false);
	dtrpnGveOndeV.setText(" G(V,E) ,  onde V \u00E9 um conjunto n\u00E3o vazio de objetos denominados    v\u00E9rtices e  E \u00E9 um  conjunto de pares n\u00E3o ordenados de V, chamado  arestas.");
	dtrpnGveOndeV.setBounds(38, 152, 380, 71);
	contentPane.add(dtrpnGveOndeV);
	
	JLabel lblConjuntoV = new JLabel("Conjunto V :");
	lblConjuntoV.setForeground(new Color(0, 0, 255));
	lblConjuntoV.setBounds(38, 28, 72, 14);
	contentPane.add(lblConjuntoV);
	
	JLabel lblConjuntoE = new JLabel("Conjunto E :");
	lblConjuntoE.setForeground(new Color(0, 0, 205));
	lblConjuntoE.setBounds(172, 28, 72, 14);
	contentPane.add(lblConjuntoE);
	
	JLabel lblObservaes = new JLabel("Observa\u00E7\u00F5es : ");
	lblObservaes.setForeground(new Color(0, 0, 205));
	lblObservaes.setBounds(186, 131, 123, 14);
	contentPane.add(lblObservaes);
	
	
	
		
	
	}
}
