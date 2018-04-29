/*
** Windows compile: javac -encoding utf-8 ReadFile.java
** Windows run: java -DconsoleEncoding=utf-8 ReadFile
*/

import java.io.* ;

class ReadFile
{
	public static void main ( String[] args )
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
		try
		{
			FileReader file = new FileReader( "oscar.txt" ) ;
			BufferedReader buffer = new BufferedReader( file ) ;
			String line = "" ;
			while ( ( line = buffer.readLine() ) != null )
			{
				System.out.println( line ) ;
			}
			buffer.close() ;
		}
		catch ( IOException e )
		{
			System.out.println( "Произошла ошибка чтения" ) ;
		}
	}
}
