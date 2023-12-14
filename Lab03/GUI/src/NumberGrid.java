import java.awt.Container;

public class NumberGrid extends JFrame{
	private JButton[] btnNumbers = new JButton[10];
	private JBotton btnDelete, btnReset;
	private JTextField tfDisplay;
	
	public NumberGrid() {
		tfDisplay = new JTextField();
		tfDisplay.setComponetOrientation(
			ComponentOrientation.RIGHT_TO_LEFT);
		
		jPanel panelButtons = new JPanel(new GridLayout(4, 3));
		addButtons(panelButtons);
		
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());
		cp.add(tfDisplay, BorderLayout.NORTH);
		cp.add(panelButotons, BorderLayout.CENTER);
		
		setDefaultCloseOperation(JFame.EXIT_ON_CLOSE);
		setTittle("Number Grid");
		setSize(200, 200);
		setVissible(true);
		
	}

}
