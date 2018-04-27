/*
** Windows compile: javac -encoding utf-8 Option.java
** Windows run: java -DconsoleEncoding=utf-8 Option -en
*/

import java.io.* ;

class Option
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
		if ( args[0].equals( "-en" ) )
		{
			System.out.println( "Опция для Анлийского языка" ) ;
		}
		else if ( args[0].equals( "-es" ) )
		{
			System.out.println( "Опция для Испанского языка" ) ;
		}
		else System.out.println( "Неизвестная опция" ) ;
	}
}
