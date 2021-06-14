import javax.swing.JOptionPane;

public class Questao05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float horaTrab,valorHora,x;
		String total;
		horaTrab = Float.parseFloat(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhada"));
		valorHora = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da hora"));
		x=horaTrab*valorHora;
		total=String.valueOf(x);
		JOptionPane.showInternalMessageDialog(null, "O salário do funcionario é :"+ total);
	}

}
