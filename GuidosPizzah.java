import javax.swing.*;//for gui objects
import java.awt.*;//for gridLayout
import java.awt.event.*;//for listener interfaces
import java.text.DecimalFormat;//for decimals


public class GuidosPizzah extends JFrame {
	private Label lblMsg0;
	private Label lblMsg;
	private Label lblMsgCenter;
	private Label lblMsgEast;
	
	private JLabel lblPizzaPic;
	private JLabel lblZeppoles;
	private JLabel lblDrinking;
	private JLabel lblpinched;
	
	private ImageIcon imgPizza;
	private ImageIcon imgZeppoles;
	private ImageIcon imgDrinking;
	private ImageIcon imgpinched;
	
	private JRadioButton chkSmPie;
	private JRadioButton chkMedPie;
	private JRadioButton chkLarPie;
	private JRadioButton chkExPie;
	
	private JCheckBox chkSausg;
	private JCheckBox chkPeppr;
	private JCheckBox chkBlkOlv;
	private JCheckBox chkPineAppl;
	private JCheckBox chkZeppoles;
	
	private JRadioButton chkSoda;
	private JRadioButton chkTea;
	private JRadioButton chkBottled;
	private JRadioButton chkTap;
	
	
	private JPanel pnlNorth;
	private JPanel pnlSouth;
	private JPanel pnlEast;
	private JPanel pnlWest;
	private JPanel pnlCenter;
	
	
	private JPanel TotPanel;
	private JButton FinCost;
	private JButton Exit;
	
	private ButtonGroup grpPizzaRadios;
	private ButtonGroup grpDrinkRadios;
	
	private JLabel lblTotal;
	private double total=0.0;
	private double SmPie=0.0, MedPie=0.0, LarPie=0.0, ExPie=0.0;
	private double Soda=0.0, Tea=0.0, Bottle=0.0, Tap=0.0;
	private double Sausg=0.0, Peppr=0.0,BlkOlv=0.0,PineAppl=0.0, Zeppoles=0. ;
	public double t1=total;
	//constructor
public GuidosPizzah()	{
	
	super("Guido's Pizzah Fazzool");//sets title bar calling super constructor
	
	setSize(815,620);
	
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	setLayout(new BorderLayout());

	
	buildNorth();
	buildSouth();
	buildEast();
	buildWest();
	buildCenter();
	
	add(pnlNorth,BorderLayout.NORTH);
	pnlNorth.setBorder(BorderFactory.createRaisedBevelBorder());
	add(TotPanel,BorderLayout.SOUTH);
	TotPanel.setBorder(BorderFactory.createRaisedBevelBorder());
	add(pnlEast,BorderLayout.EAST);
	pnlEast.setBorder(BorderFactory.createMatteBorder(5,5,5,5, Color.BLUE));
	add(pnlWest,BorderLayout.WEST);
	pnlWest.setBorder(BorderFactory.createMatteBorder(5,5,5,5, Color.RED));
	add(pnlCenter,BorderLayout.CENTER);
	pnlCenter.setBorder(BorderFactory.createMatteBorder(5,5,5,5, Color.getHSBColor(20, 240, 40)));
	//make frame vis
	setVisible(true);
	
	lblTotal= new JLabel();
	
}

private void buildSouth(){

TotPanel = new JPanel();	
TotPanel.setBackground(Color.DARK_GRAY);

imgpinched = new ImageIcon("pinched.jpg");
lblpinched = new JLabel();
lblpinched.setText(null);
lblpinched.setIcon(imgpinched);

FinCost= new JButton("Final Cost");
Exit= new JButton("Exit");

TotPanel.add(FinCost);
TotPanel.add(Exit);

TotPanel.add(lblpinched);

ExitConvertListener convertListen= new ExitConvertListener();
Exit.addActionListener(convertListen);

FinCostConvertListener FinconvertListen = new FinCostConvertListener();
FinCost.addActionListener(FinconvertListen);
	
}

private class ExitConvertListener implements ActionListener{
	
	public void actionPerformed(ActionEvent e){
		System.exit(0);
	}
	
	
}
private class FinCostConvertListener implements ActionListener{
	
	public void actionPerformed(ActionEvent e){
		
		DecimalFormat dollar = new DecimalFormat("0.00");
		System.out.print("Total is:"+total);
		lblTotal.setText("Total = $" + t1);
		JOptionPane.showMessageDialog(null,"Your total is: $"+dollar.format(total));
	}
	
	
}


private void buildWest(){
		
		
		pnlWest=new JPanel();
		pnlWest.setLayout(new GridLayout(7,1));
		//create label object
		
		imgPizza = new ImageIcon("pizza.jpg");
		
		lblMsg=new Label("Select your pie:");

		lblPizzaPic = new JLabel();
		lblPizzaPic.setText(null);
		lblPizzaPic.setIcon(imgPizza);
		
		//create check boxed obj
		chkSmPie= new JRadioButton("Small Pie: $7.00");
		chkMedPie= new JRadioButton("Medium Pie: $9.00");
		chkLarPie= new JRadioButton("Large Pie: $11.00");
		chkExPie= new JRadioButton("Ex Large Pie: $14.00");
		
		chkSmPie.addItemListener(new checkBoxListener());
		chkMedPie.addItemListener(new checkBoxListener());
		chkLarPie.addItemListener(new checkBoxListener());
		chkExPie.addItemListener(new checkBoxListener());
		
		
		grpPizzaRadios= new ButtonGroup();
		grpPizzaRadios.add(chkSmPie);
		grpPizzaRadios.add(chkMedPie);
		grpPizzaRadios.add(chkLarPie);
		grpPizzaRadios.add(chkExPie);
		
		
		pnlWest.add(lblPizzaPic);
		lblMsg.setBackground(Color.RED);
		lblMsg.setForeground(Color.WHITE);
		pnlWest.add(lblMsg);
		
		
		pnlWest.add(chkSmPie);
		pnlWest.add(chkMedPie);
		pnlWest.add(chkLarPie);
		pnlWest.add(chkExPie);
	
}

private class checkBoxListener implements ItemListener{
	
	public void itemStateChanged(ItemEvent e){
		
		if(chkSmPie.isSelected()){
			//chkSmPie.setSelected(true);
			SmPie=7.00;
			
		}
		else{
			SmPie=0.00;
		}
		
		if(chkMedPie.isSelected()){
			//chkMedPie.setSelected(true);
			MedPie=9.00;
			
		}
		else{
			MedPie=0.00;
		}
		
		if(chkLarPie.isSelected()){
			//chkLarPie.setSelected(true);
			LarPie=11.00;
		}
		else{
			LarPie=0.00;
		}
		
		if(chkExPie.isSelected()){
			//chkExPie.setSelected(true);
			ExPie=14.00;
		}
		else{
			ExPie=0.00;
		}
		
		Total();
		//lblTotal.setText("Total is:"+total);	
	
	}
	
}
private void Total(){
	total=SmPie+MedPie+LarPie+ExPie+Soda+Tea+Bottle+Tap+Sausg+Peppr+BlkOlv+PineAppl+Zeppoles;
}




private void buildEast(){
	
	pnlEast=new JPanel();
	pnlEast.setLayout(new GridLayout(7,1));
	
	imgDrinking = new ImageIcon("drinking.jpg");
	lblDrinking = new JLabel();
	lblDrinking.setText(null);
	lblDrinking.setIcon(imgDrinking);
	
	
	
	
	lblMsgEast=new Label("Select your drink:");
	chkSoda= new JRadioButton("Soda: $2.00") ;
	chkTea= new JRadioButton("Tea: $1.50") ;
	chkBottled= new JRadioButton("Bottled Water: $1.25") ;
	chkTap= new JRadioButton("Tap Water: $0.00") ;
	
	chkSoda.addItemListener(new checkBoxListener2());
	chkTea.addItemListener(new checkBoxListener2());
	chkBottled.addItemListener(new checkBoxListener2());
	chkTap.addItemListener(new checkBoxListener2());
	
	
	grpDrinkRadios= new ButtonGroup();
	grpDrinkRadios.add(chkSoda);
	grpDrinkRadios.add(chkTea);
	grpDrinkRadios.add(chkBottled);
	grpDrinkRadios.add(chkTap);
	
	pnlEast.add(lblDrinking);
	pnlEast.add(lblMsgEast);lblMsgEast.setBackground(Color.BLUE);lblMsgEast.setForeground(Color.WHITE);
	pnlEast.add(chkSoda);
	pnlEast.add(chkTea);
	pnlEast.add(chkBottled);
	pnlEast.add(chkTap);
	
	
	
}
private class checkBoxListener2 implements ItemListener{
	
	public void itemStateChanged(ItemEvent e){
		
		if(chkSoda.isSelected()){
			//chkSmPie.setSelected(true);
			Soda=2.00;
			
		}
		else{
			Soda=0.00;
		}
		
		if(chkTea.isSelected()){
			//chkMedPie.setSelected(true);
			Tea=1.50;
			
		}
		else{
			Tea=0.00;
		}
		
		if(chkBottled.isSelected()){
			//chkLarPie.setSelected(true);
			Bottle=1.25;
		}
		else{
			Bottle=0.00;
		}
		
		if(chkTap.isSelected()){
			//chkTap.setSelected();
			Tap=0.00;
		}
		else{
			Tap=0.00;
		}
		
		Total();
		//lblTotal.setText("Total is:"+total);	
	
	}
	
}



private void buildCenter(){
	
	pnlCenter=new JPanel();
	pnlCenter.setLayout(new GridLayout(7,1));
	
	lblMsgCenter=new Label("Select your topping:");
	
	imgZeppoles = new ImageIcon("zeppoles.jpg");
	lblZeppoles = new JLabel();
	lblZeppoles.setText(null);
	lblZeppoles.setIcon(imgZeppoles);
	
	
    
	chkSausg= new JCheckBox("Sausig eyy: $1.00") ;
	chkPeppr=new JCheckBox("Pepperoni eyy: $1.00");
	chkBlkOlv=new JCheckBox("Black olives eyy: $1.00");
	chkPineAppl=new JCheckBox("Pineapple eyy: $1.00");
	chkZeppoles=new JCheckBox("Zeppoles 6 for only: $1.00");
	
	chkSausg.addItemListener(new checkBoxListener3());
	chkPeppr.addItemListener(new checkBoxListener3());
	chkBlkOlv.addItemListener(new checkBoxListener3());
	chkPineAppl.addItemListener(new checkBoxListener3());
	chkZeppoles.addItemListener(new checkBoxListener3());
	
	pnlCenter.add(lblZeppoles);
	pnlCenter.add(lblMsgCenter);
	lblMsgCenter.setBackground(Color.getHSBColor(20, 240, 40));
	lblMsgCenter.setForeground(Color.WHITE);
	
	
	pnlCenter.add(chkSausg);
	pnlCenter.add(chkPeppr);
	pnlCenter.add(chkBlkOlv);
	pnlCenter.add(chkPineAppl);
	pnlCenter.add(chkZeppoles);
	
	
}
private class checkBoxListener3 implements ItemListener{
	
	public void itemStateChanged(ItemEvent e){
		
		if(chkSausg.isSelected()){
			//chkSmPie.setSelected(true);
			Sausg=1.00;
			
		}
		else{
			Sausg=0.00;
		}
		
		if(chkPeppr.isSelected()){
			//chkMedPie.setSelected(true);
			Peppr=1.00;
			
		}
		else{
			Peppr=0.00;
		}
		
		if(chkBlkOlv.isSelected()){
			//chkLarPie.setSelected(true);
			BlkOlv=1.00;
		}
		else{
			BlkOlv=0.00;
		}
		
		if(chkPineAppl.isSelected()){
			//chkTap.setSelected();
			PineAppl=1.00;
		}
		else{
			PineAppl=0.00;
		}
		
		if(chkZeppoles.isSelected()){
			//chkTap.setSelected();
			Zeppoles=1.00;
		}
		else{
			Zeppoles=0.00;
		}
		
		
		
		
		Total();
		//lblTotal.setText("Total is:"+total);	
	
	}
	
}




private void buildNorth(){
	
	pnlNorth=new JPanel();
	pnlNorth.setLayout(new GridLayout(1,1));
	

	
	lblMsg0=new Label("Welcome to Guido's Pizza Fazzool");
	lblMsg0.setFont(new Font("Times New Roman ",Font.PLAIN,24)); //24 = size
	pnlNorth.add(lblMsg0);
	lblMsg0.setBackground(Color.MAGENTA);
	lblMsg0.setForeground(Color.WHITE);
	
	
	
}


	
}
