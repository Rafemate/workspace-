
import javax.swing.JOptionPane;
public class Questao01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num ,x ,y;
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 n�mero :"));
		x=num-1;
		y=num+1;
		JOptionPane.showInternalMessageDialog(null, "Os n�meros vizinhos s�o "+ x + "e"+ y );

	}

}
