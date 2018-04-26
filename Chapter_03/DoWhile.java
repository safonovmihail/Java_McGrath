/*
** Win compile: javac -encoding utf-8 DoWhile.java
** Win run: java -DconsoleEncoding=utf-8 DoWhile
*/

import java.io.* ;

class DoWhile
{
	public static void main( String[] args )
	{
		String consoleEncoding = System.getProperty( "consoleEncoding" ) ;
		if ( consoleEncoding != null )
			try
			{
				System.setOut( new PrintStream( System.out, true, consoleEncoding ) ) ;
			}
			catch ( UnsupportedEncodingException ex )
			{
				System.err.println( "Unsupported encoding set for console: " + consoleEncoding ) ;
			}
		int num = 100 ;
		do
		{
			System.out.println( "Используем DoWhile: " + num ) ;
			num += 10 ;
		}
		while ( num < 0 ) ;
	}
}
