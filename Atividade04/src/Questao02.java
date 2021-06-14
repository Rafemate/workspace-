import javax.swing.JOptionPane;

public class Questao02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float num_1 , num_2;
		num_1 = Float.parseFloat(JOptionPane.showInputDialog("Digite 1 número"));
		num_2 = Float.parseFloat(JOptionPane.showInputDialog("Digite outro número"));
		if (num_1==num_2) {
			JOptionPane.showInternalMessageDialog(null, "Números iguais");
		}
		if (num_1>num_2) {
			JOptionPane.showInternalMessageDialog(null, "O maior número é "+ num_1);
		} 
		if (num_2>num_1) {
			JOptionPane.showInternalMessageDialog(null, "O maior número é "+ num_2);
		}
		
 
	}

}
