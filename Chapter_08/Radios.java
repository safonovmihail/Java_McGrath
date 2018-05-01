import java.io.* ;
import javax.swing.* ;

class Radios extends JFrame
{
	JPanel pnl = new JPanel() ;
	JRadioButton rad1 = new JRadioButton( "Красное" , true ) ;
	JRadioButton rad2 = new JRadioButton( "Розовое" ) ;
	JRadioButton rad3 = new JRadioButton( "Белое" ) ;
	ButtonGroup wines = new ButtonGroup() ;
	JSlider slider1 = new JSlider() ;

	public Radios()
	{
		super( "Окно Swing" ) ;
		setSize( 500 , 200 ) ;
		setDefaultCloseOperation( EXIT_ON_CLOSE ) ;
		add( pnl ) ;
		wines.add( rad1 ) ;
		wines.add( rad2 ) ;
		wines.add( rad3 ) ;
		pnl.add( rad1 ) ;
		pnl.add( rad2 ) ;
		pnl.add( rad3 ) ;
		slider1.setMajorTickSpacing( 10 ) ;
		slider1.setMinorTickSpacing( 2 ) ;
		slider1.setPaintTicks( true ) ;
		slider1.setPaintLabels( true ) ;
		pnl.add( slider1 ) ;
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
		Radios gui = new Radios() ;
	}
}
