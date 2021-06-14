import javax.swing.JOptionPane;

public class Questao02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float num1 ,num2  , x;
		num1 = Float.parseFloat(JOptionPane.showInputDialog("Digite 1 número :"));
		num2 = Float.parseFloat(JOptionPane.showInputDialog("Digite 1 número :"));
		x=num1+num2;
		JOptionPane.showInternalMessageDialog(null, "A soma entre os números é "+ x );
		

	}

}
