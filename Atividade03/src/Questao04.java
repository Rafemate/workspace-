import javax.swing.JOptionPane;

public class Questao04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float conta,gar;
		conta = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da conta"));
		gar=(conta*10)/100;
		JOptionPane.showInternalMessageDialog(null, "10% do garçom :R$"+gar + "e Total:R$"+conta );
		

	}

}
