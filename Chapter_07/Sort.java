/*
** Windows compile: javac -encoding Windows-1251 Sort.java
** Windows run: java -DconsoleEncoding=Windows-1251 Sort
*/

import java.io.* ;
import java.util.Arrays ;
import java.util.Collections ;

class Sort
{
	public static void main ( String[] args )
	{
		String consoleEncoding = System.getProperty ( "consoleEncoding" ) ;
		if ( consoleEncoding != null )
			try
			{
				System.setOut( new PrintStream( System.out, true, consoleEncoding ) ) ;
			}
			catch ( UnsupportedEncodingException ex )
			{
				System.err.println( "Unsupported encoding set for console: " + consoleEncoding ) ;
			}
		String[] names = { "Майк" , "Дэйв" , "Энди" } ;
		int[] nums = { 200 , 300 , 100 } ;
		display( names ) ;
		display( nums ) ;
		Arrays.sort( names, Collections.reverseOrder() ) ;
		Arrays.sort( nums ) ;
		display( names ) ;
		display( nums ) ;
	}

	public static void display( String[] elems )
	{
		System.out.println( "\nСтроковый Массив:" ) ;
		for ( int i = 0 ; i < elems.length ; i++ )
			System.out.println( "Элемент "+i+" - "+elems[i] ) ;
	}

	public static void display( int[] elems )
	{
		System.out.println( "\nЦелочисленный Массив:" ) ;
		for ( int i = 0 ; i < elems.length ; i++ )
			System.out.println( "Элемент "+i+" - "+elems[i] ) ;
	}
}
