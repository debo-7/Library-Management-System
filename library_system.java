package designing;
import javax.swing.*;
import java.awt.*;
public class library_system {
	JFrame jf1;
	JLabel jl1;
	JTabbedPane jtp1;
	JTabbedPane jtp2;
	library_system()
	{
		jf1.setLayout(null);
		
		jl1=new JLabel("hello");
		jf1.add(jl1);
	}
	

	public static void main(String[] args) 
	{
		new library_system();
	}

}
