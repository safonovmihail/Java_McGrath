/*
** Windows compile: javac -encoding utf-8 Elements.java
** Windows run: java -DconsoleEncoding=utg-8 Elements
*/

import java.io.* ;

class Elements
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
				System.err.println( "Unsuppoted encoding set for console: " + consoleEncoding ) ;
			}
		int[] kiosk_q1 = { 42000 , 48000 , 50000 } ;
		int[] kiosk_q2 = { 52000 , 58000 , 60000 } ;
		int[] kiosk_q3 = { 46000 , 49000 , 58000 } ;
		int[] kiosk_q4 = { 50000 , 51000 , 61000 } ;
		int[] outlet_q1 = { 57000 , 63000 , 60000 } ;
		int[] outlet_q2 = { 70000 , 67000 , 73000 } ;
		int[] outlet_q3 = { 67000 , 65000 , 62000 } ;
		int[] outlet_q4 = { 72000 , 69000 , 75000 } ;
		int[] sum = new int[12] ;
		int total = 0 ;
		for ( int i = 0 ; i < kiosk_q1.length ; i++  )
		{
			sum[ i ] = kiosk_q1[i] + outlet_q1[i] ;
			sum[i+3] = kiosk_q2[i] + outlet_q2[i] ;
			sum[i+6] = kiosk_q3[i] + outlet_q3[i] ;
			sum[i+9] = kiosk_q4[i] + outlet_q4[i] ;
		}
		for ( int i = 0 ; i < sum.length ; i++ )
		{
			System.out.println( "Месяц "+(i+1)+" объем продаж:\t"+sum[i] ) ;
			total += sum[i] ;
		}
		System.out.println( "ОБЩИЙ ОБЪЕМ ПРОДАЖ ЗА ГОД\t" + total ) ;
	}
}
