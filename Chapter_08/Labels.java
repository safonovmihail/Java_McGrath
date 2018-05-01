import java.io.* ;
import javax.swing.* ;

class Labels extends JFrame
{
	JPanel pnl = new JPanel() ;
	ClassLoader ldr = this.getClass().getClassLoader() ;
	ImageIcon duke = new ImageIcon( ldr.getResource( "duke.png" ) ) ;
	JLabel lbl1 = new JLabel( duke ) ;
	JLabel lbl2 = new JLabel( "Дюк - талисман технологии Java." ) ;
	JLabel lbl3 = new JLabel( "Дюк" , duke , JLabel.CENTER ) ;

	public Labels()
	{
		super( "Окно Swing" ) ;
		setSize( 500 , 200 ) ;
		setDefaultCloseOperation( EXIT_ON_CLOSE ) ;
		lbl1.setToolTipText( "Дюк - талисман Java" ) ;
		lbl3.setHorizontalTextPosition( JLabel.CENTER ) ;
		lbl3.setVerticalTextPosition( JLabel.BOTTOM ) ;
		add( pnl ) ;
		pnl.add( lbl1 ) ;
		pnl.add( lbl2 ) ;
		pnl.add( lbl3 ) ;
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
		Labels gui = new Labels() ;
	}
}
