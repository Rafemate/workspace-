import javax.swing.JOptionPane;

public class Questao03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,x,y,z;
		String numeros=null;
		num1=Integer.parseInt(JOptionPane.showInputDialog("Digite 1 número"));
		num2=Integer.parseInt(JOptionPane.showInputDialog("Digite outro número"));
		y=num1;
		z=num2;	
		if (num1>num2) {
			
			for (x=num1-num2 ;x>1 ; x--) {
				num2++;
				numeros=numeros + String.valueOf(num2)+ ", ";
			}
			JOptionPane.showInternalMessageDialog(null, "Os numeros entre"+ z +"e"+ y +"são"+ numeros);
			
		}
		if (num2>num1) {
			for (x=num2-num1; x>1; x--) {
				num1++;
				numeros=numeros + String.valueOf(num1)+ ", ";
				
			}
			JOptionPane.showInternalMessageDialog(null, "Os numeros entre"+ y +"e"+ z +"são"+ numeros);
			
		}
		
		
		}	
		

	}


