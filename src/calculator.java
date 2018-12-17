import javax.swing.JOptionPane;

public class calculator {
public static void main(String[] args) {
	calculator calculator = new calculator();
	calculator.add(1, 2);
	calculator.subtract(17, 5);
	calculator.multiply(9, 32);
}
void add(int a, int b) {
int answer= a+b;
JOptionPane.showMessageDialog(null, answer);
}
void subtract(int a, int b) {
	int answer=a-b;
	JOptionPane.showMessageDialog(null, answer);
}
void multiply(int a, int b) {
	int answer=a*b;
}
}
