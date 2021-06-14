import javax.swing.JOptionPane;

public class Questao04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String senha, acesso;
		acesso="Java-2021";
		for (int i = 4; i >0; i--) {
		senha=JOptionPane.showInputDialog("Digite a palavra de acesso ?");
		if (acesso.equals(senha)) {
			JOptionPane.showInternalMessageDialog(null, "Permissão: aprovada");
			break;
		}
			else {
				
				JOptionPane.showInternalMessageDialog(null, "Tente novamente"+ i + "tentativas" );
				
			}
		
		}

	}

}
