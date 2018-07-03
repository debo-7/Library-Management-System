package designing;
import java.awt.Color;

import javax.swing.*;
public class add_members  {

	public static void main(String[] args)throws Exception {
		JFrame jf1=new JFrame("hello");
		jf1.setLayout(null);
		jf1.setVisible(true);
		jf1.setSize(400,400);  
		JPanel p1=new JPanel();  
		JTextField jtf1=new JTextField();
		p1.add(jtf1);
		p1.setBackground(Color.red);
		JPanel p2=new JPanel();  
		p2.setBackground(Color.green);
		JPanel p3=new JPanel();
		p3.setBackground(Color.blue);
		JPanel p4=new JPanel();
		p4.setBackground(Color.yellow);
		JPanel p5=new JPanel();
		p5.setBackground(Color.black);
		JTabbedPane jtp1=new JTabbedPane();	
		JTabbedPane jtp2=new JTabbedPane();
		jf1.add(jtp1);
		jf1.add(jtp2);
		jtp1.setBounds(50,50,500,500);  
		jtp2.setBounds(50,35,500,500);  
		jtp1.add("add members", p1);
		jtp1.add("add books", p2);
		jtp2.add("this shit", p3);
		jtp2.add("vfdgdgdfgdfgfdgdfsgdfsgdfsgd", p4);
		jtp2.add("t", p5);



	}

}
