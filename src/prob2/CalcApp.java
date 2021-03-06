package prob2;

import java.util.Scanner;

public class CalcApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		while( true ) {
			System.out.print( ">> " );
			String exp = scanner.nextLine();
			if( "quit".equals( exp ) ) {
				break;
			}
			
			String[] tokens = exp.split( " " );
			Arith arith = null;
			switch( tokens[1] ) {
				case "+" :
					arith = new Add();	
					break;
				case "-" : 
					arith = new Sub();	
					break;
				case "*" : 
					arith = new Mul();	
					break;
				case "/" : 
					arith = new Div();	
					break;
				default :
					System.out.println( "unknown operator" );
					break;
			}
			
			if( arith != null ) {
				arith.setValue( Integer.parseInt( tokens[ 0 ]), Integer.parseInt( tokens[ 2 ]) );
				int result = arith.calculate();
				System.out.println( ">> " + result );
			}
		}
		scanner.close();
	}
}
