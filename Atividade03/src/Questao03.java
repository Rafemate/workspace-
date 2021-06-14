import javax.swing.JOptionPane;

public class Questao03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float nota1, nota2,media;
		nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digte nota 01:"));
		nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digte nota 02:"));
		media=(nota1+nota2)/2;
		JOptionPane.showInternalMessageDialog(null, "A média é: "+ media );

	}

}
