/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package animal;

import javax.swing.JOptionPane;

/**
 *
 * @author eurico.santos
 */
public class Animal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                 String v1;
		int resposta;
		v1 = JOptionPane.showInputDialog("Qual é o seu nome?");
		resposta = JOptionPane.showConfirmDialog(null, "O seu nome é " + v1 + "?");
		if (resposta == JOptionPane.YES_OPTION) {
			// verifica se o usuário clicou no botão YES
			JOptionPane.showMessageDialog(null, "Seu nome é " + v1);
		} else {
			JOptionPane.showMessageDialog(null, "Seu nome não é " + v1);
        
        
        
       }
    
    }
}
