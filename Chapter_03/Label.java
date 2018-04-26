/*
** Win compile: javac -encoding utf-8 Label.java
** Win run: java -DconsoleEncoding=utf-8 Label
*/

import java.io.* ;

class Label
{
	public static void main( String[] args )
	{
		String consoleEncoding = System.getProperty( "consoleEncoding" ) ;
		if ( consoleEncoding != null)
			try
			{
				System.setOut( new PrintStream( System.out, true, consoleEncoding ) ) ;
			}
			catch ( UnsupportedEncodingException ex )
			{
				System.err.println( "Unsupported encoding set for console: " + consoleEncoding ) ;
			}
		outerLoop : for ( int i = 1 ; i < 4 ; i++ )
		{
			for ( int j = 1 ; j < 4 ; j++ )
			{
				if ( i == 2 && j == 3 )
				{
					System.out.println( "Выход из outerLoop при i="+i+" j="+j ) ;
					break outerLoop ;
				}
				if ( i == 1 && j == 1 )
				{
					System.out.println( "outerLoop продолжает работу при i="+i+" j="+j ) ;
					continue outerLoop ;
				}
				System.out.println( "Итерация i="+i+" j="+j ) ;
			}
		}
	}
}
