import javax.swing.JOptionPane;

public class Questao02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float num1 ,num2  , x;
		num1 = Float.parseFloat(JOptionPane.showInputDialog("Digite 1 n�mero :"));
		num2 = Float.parseFloat(JOptionPane.showInputDialog("Digite 1 n�mero :"));
		x=num1+num2;
		JOptionPane.showInternalMessageDialog(null, "A soma entre os n�meros � "+ x );
		

	}

}
