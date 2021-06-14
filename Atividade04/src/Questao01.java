import javax.swing.JOptionPane;

public class Questao01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome;
		float nota; 
		nome = JOptionPane.showInputDialog("Digite o nome do aluno");
		nota = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota final"));
		
		if (nota<4) {
			JOptionPane.showInternalMessageDialog(null, "Reprovado");
		}
		if (nota>=4 && nota<7) {
			JOptionPane.showMessageDialog(null,"Recuperação");
		} 
		if (nota>=7){
			JOptionPane.showMessageDialog(null,"Aprovado");

		}
		
	}

}
