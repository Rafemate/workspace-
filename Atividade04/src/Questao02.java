import javax.swing.JOptionPane;

public class Questao02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float num_1 , num_2;
		num_1 = Float.parseFloat(JOptionPane.showInputDialog("Digite 1 n�mero"));
		num_2 = Float.parseFloat(JOptionPane.showInputDialog("Digite outro n�mero"));
		if (num_1==num_2) {
			JOptionPane.showInternalMessageDialog(null, "N�meros iguais");
		}
		if (num_1>num_2) {
			JOptionPane.showInternalMessageDialog(null, "O maior n�mero � "+ num_1);
		} 
		if (num_2>num_1) {
			JOptionPane.showInternalMessageDialog(null, "O maior n�mero � "+ num_2);
		}
		
 
	}

}
