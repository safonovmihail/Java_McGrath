/*
** Windows compile: javac -encoding utf-8 CharacterSwap.java
** Windows run: java -DconsoleEncoding=utf-8 CharacterSwap
*/

import java.io.* ;

class CharacterSwap
{
	public static void main ( String[] args )
	{
		String consoleEncoding = System.getProperty( "consoleEncoding" ) ;
		if ( consoleEncoding != null )
			try
			{
				System.setOut( new PrintStream ( System.out, true , consoleEncoding ) ) ;
			}
			catch( UnsupportedEncodingException ex )
			{
				System.err.println( "Unsupported encoding set for console: " + consoleEncoding ) ;
			}
		String txt = "" ;
		if ( txt.isEmpty() ) txt = " Боррокудо " ;
		System.out.println( "Строка: " + txt ) ;
		System.out.println( "Длина первоначальной строки: " + txt.length() ) ;
		txt = txt.trim() ;
		System.out.println( "Строка: " + txt ) ;
		System.out.println( "Длина строки: " + txt.length() ) ;
		char initial = txt.charAt(0) ;
		System.out.println( "Первая буква: " + initial ) ;
		initial = txt.charAt( ( txt.length() - 1 ) ) ;
		System.out.println( "Последняя буква: " + initial ) ;
		txt = txt.replace( 'о' , 'а' ) ;
		System.out.println( "Строка: " + txt ) ;
	}
}
