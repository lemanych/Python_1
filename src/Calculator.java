import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
        System.out.println("'*' - ���������, '+' - ���������, '-' - � ��������� �������"
        					+"\n������� ��� ������������: ");
        String input = s.nextLine();
        
        if(input.equals("-")) {
        	System.out.println("������ �������: ");
        	String scc = s.nextLine();
        	PostfixCalc rpn = new PostfixCalc();
        	rpn.calculate(scc);
        } else if(input.equals("+")) {
        	calc(s);
        } else if(input.equals("*")) {
        	Matrix matrix = new Matrix();
        	matrix.matrixCalc(s);
        } else
        	System.exit(0);
        

        s.close();
	}

	public static void calc(Scanner s) {

		System.out.print("������ ����� �����: ");
		double n1 = s.nextDouble();
		System.out.print("������ ���� ��������: ");
		String operation = s.next();
		System.out.print("������ ����� �����: ");
		double n2 = s.nextDouble();
		
		switch (operation)  {
		case "+":
			System.out.println("³������: " + (n1 + n2));
			break;
			
		case "-":
			System.out.println("³������: " + (n1 - n2));
			break;
			
		case "/":
			System.out.println("³������: " + (n1 / n2));
			break;
			
		case "*":
			System.out.println("³������: " + (n1 * n2));
			break;
			
		default:
			System.out.println("���� �� ���!");
		
		}
	}
}
