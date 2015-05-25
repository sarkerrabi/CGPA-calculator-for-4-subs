import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Board extends JFrame implements ActionListener {
		
	/**
	 * 
	 */
	private static final long serialVersionUID = -1243789144958572515L;
	JMenuBar jmb = new JMenuBar();
	JMenu jm= new JMenu("New"); 
	JButton cal= new JButton("Calculate!!!");
	
	JLabel crt1    =new JLabel("credit for Subject 1");
	JTextField crt1F = new JTextField();
	JLabel cgpa1   =new JLabel("CGPA for Subject 1");
	JTextField cgpa1F = new JTextField();
	
	
	JLabel crt2    =new JLabel("credit for Subject 2");
	JTextField crt2F = new JTextField();
	JLabel cgpa2   =new JLabel("CGPA for Subject 2");
	JTextField cgpa2F = new JTextField();
	
	JLabel crt3    =new JLabel("credit for Subject 3");
	JTextField crt3F = new JTextField();
	JLabel cgpa3   =new JLabel("CGPA for Subject 3");
	JTextField cgpa3F = new JTextField();
	
	JLabel crt4    =new JLabel("credit for Subject 4");
	JTextField crt4F = new JTextField();
	JLabel cgpa4   =new JLabel("CGPA for Subject 4");
	JTextField cgpa4F = new JTextField();
	
	
	
	
	
	
	JLabel cgpa    =new JLabel("Your CGPA");
	JLabel gap=new JLabel("");
	
	JTextField cgpaF = new JTextField();
	

public void Board(){
		showWindow();
		GridLayout gb = new GridLayout(5,4,10,20);
		super.setJMenuBar(jmb);
		super.setLayout(gb);
		
		jmb.add(jm);
		super.add(crt1F);
		super.add(crt1);
		super.add(cgpa1F);
		super.add(cgpa1);
		//sub2
		super.add(crt2F);
		super.add(crt2);
		super.add(cgpa2F);
		super.add(cgpa2);
		//sub3
		super.add(crt3F);
		super.add(crt3);
		super.add(cgpa3F);
		super.add(cgpa3);
		//sub4
		super.add(crt4F);
		super.add(crt4);
		super.add(cgpa4F);
		super.add(cgpa4);
		
		super.add(gap);
		super.add(cal);
		
		
		super.add(cgpa);
		super.add(cgpaF);
		super.add(gap);
		cgpaF.setBackground(Color.BLACK);
		cgpaF.setEditable(false);
		cgpaF.setForeground(Color.RED);
		
		cal.addActionListener(this);
}
	
	
	
	
	
	
	public void showWindow() {
	// TODO Auto-generated method stub
		 try {
				//super.setContentPane(new JLabel((Icon) new ImageIcon(ImageIO.read(new File("H:\\Prac\\Bangladesh\\Images\\BD.jpg")))));
		        super.setTitle("4 subjects CGPA Calculator");
		       
				super.setSize(555, 300);
				super.setLocation(500, 200);
				super.setDefaultCloseOperation(EXIT_ON_CLOSE);
				super.setVisible(true);
			    super.setResizable(false);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			   }
}

public void actionPerformed(ActionEvent e) {
		try{
			if(e.getSource()== cal){
				String p1t=crt1F.getText();
				int p1 = Integer.parseInt(p1t);
				String q1t=cgpa1F.getText();
				float q1 = Float.parseFloat(q1t);
				
				String p2t=crt2F.getText();
				int p2 = Integer.parseInt(p2t);
				String q2t=cgpa2F.getText();
				float q2 = Float.parseFloat(q2t);
				
				String p3t=crt3F.getText();
				int p3 = Integer.parseInt(p3t);
				String q3t=cgpa3F.getText();
				float q3 = Float.parseFloat(q3t);
				
				String p4t=crt4F.getText();
				int p4 = Integer.parseInt(p4t);
				String q4t=cgpa4F.getText();
				float q4 = Float.parseFloat(q4t);
				

				float cat =CGPA(p1,p2,p3,p4,q1,q2,q3,q4) ;
					
				
				String h=(cat+" ");
				cgpaF.setText(h);
				if(cat<2.0){
					String h1 =("SorrY probation Marks!");
					gap.setText(h1);
				}
				
			}
			
			
		}
		catch(Exception e1){
			System.out.println("hahaaaaaa!!!!!!!");
			
		}
		
}

public float CGPA(int w,int x,int y,int z,float p,float q,float r,float s){
	
	float sum=(p*w)+(q*x)+(r*y)+(s*z);
	float t=(w+x+y+z);
	float cgpa=sum/t;
	return cgpa;
	}


}
