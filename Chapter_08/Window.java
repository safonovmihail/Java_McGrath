import java.io.* ;
import javax.swing.* ;

class Window extends JFrame
{
	JPanel pnl = new JPanel() ;

	public Window()
	{
		super( "Окно Swing" ) ;
		setSize( 500 , 200 ) ;
		setDefaultCloseOperation( EXIT_ON_CLOSE ) ;
		add( pnl ) ;
		setVisible( true ) ;
	}

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
		Window gui = new Window() ;
	}
}
