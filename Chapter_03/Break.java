/*
** Win compile: javac -encoding utf-8 Break.java
** Win run: java -DconsoleEncoding=utf-8 Break
*/

import java.io.* ;

class Break
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
		for ( int i = 1 ; i < 4 ; i++ )
		{
			for ( int j = 1 ; j < 4 ; j++ )
			{
				if (i == 1 && j == 1 )
				{
					System.out.println( "Продолжение работы внутреннего цикла при i="+i+" j="+j ) ;
					continue ;
				}
				if ( i == 2 && j == 1 )
				{
					System.out.println( "Выход из внутреннего цикла при i="+i+" j ="+j ) ;
					break ;
				}
				System.out.println( "Итерация i="+i+" j="+j ) ;
			}
		}
	}
}
