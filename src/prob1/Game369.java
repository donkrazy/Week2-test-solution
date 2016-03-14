package prob1;

public class Game369 {
	public static void main(String[] args) {
		for( int i = 1; i <= 99; i++ ) {
			String number = String.valueOf( i );
			int length = number.length();
			int count369 = 0;
			for( int j = 0; j < length; j++ ) {
				char c = number.charAt( j );
				if( c == '3' || c == '6' || c == '9' ) {
					count369++;
				}
			}
			
			System.out.print( i + " " );
			for( int j = 0; j < count369; j++ ) {
				System.out.print( "짝" );
			}
			
			System.out.println( "" );
		}
	}
}
