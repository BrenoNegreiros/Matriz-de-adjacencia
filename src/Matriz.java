


import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Matriz extends JFrame{  
  
    public JPanel panel;  
    public JLabel[][] matriz;  
      
    public Matriz(){  
        this.setSize(600,500);  
        componentes();  
        this.setVisible(true);  
    }  
      
    public void componentes(){  
        Random r = new Random();  
        this.setLayout(new BorderLayout());  
        matriz = new JLabel[4][4];  
        
        panel = new JPanel();  
        panel.setLayout(new GridLayout(3,3));  
          
        for(int i = 0; i < 4; i++){  
            for(int j = 0; j < 3; j++){  
                matriz[i][j] = new JLabel(i+"");  
                panel.add(matriz[i][j]);  
            }  
        }  
          
        this.add(panel, BorderLayout.CENTER);  
          
    }  
      
    public static void main(String[] args){  
        Matriz m = new Matriz();  
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    }  
  
}  