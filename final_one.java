package designing;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;
public class final_one extends JFrame implements ActionListener
{
	static JPanel jp1=new JPanel();
	static JPanel jp2=new JPanel();
	static JPanel jp3=new JPanel();
	static JPanel jp4=new JPanel();
	static JPanel jp5=new JPanel();
	static JPanel jp6=new JPanel();
	static JPanel jp7=new JPanel();
	static JPanel jp8=new JPanel();
	static JPanel jp9=new JPanel();
	static JButton jb1=new JButton("Create New Member");
	static JButton jb11=new JButton("Create New Book");
	static JButton jb21=new JButton("Search For Book");
	static JButton jb22=new JButton("Search For Book");
	static JButton jb23=new JButton("Search For Member");
	static JButton jb24=new JButton("Search For Member");
	static JButton jb31=new JButton("Return Book");
	static JButton jb41=new JButton("Borrow Book");
	static JButton jb51=new JButton("Check Transaction");
	static JButton jb81=new JButton("Book Details");
	static JButton jb82=new JButton("Member Details");
	static JTextField jtf1=new JTextField();
	static JTextField jtf2=new JTextField();
	static JTextField jtf3=new JTextField();
	static JTextField jtf4=new JTextField();
	static JTextField jtf5=new JTextField();
	static JTextField jtf6=new JTextField();
	static JTextField jtf11=new JTextField();
	static JTextField jtf12=new JTextField();
	static JTextField jtf13=new JTextField();
	static JTextField jtf14=new JTextField();
	static JTextField jtf15=new JTextField();
	static JTextField jtf16=new JTextField();
	static JTextField jtf21=new JTextField();
	static JTextField jtf22=new JTextField();
	static JTextField jtf23=new JTextField();
	static JTextField jtf24=new JTextField();
	static JTextField jtf31=new JTextField();
	static JTextField jtf32=new JTextField();
	static JTextField jtf41=new JTextField();
	static JTextField jtf42=new JTextField();
	static JTextField jtf43=new JTextField();
	static JTextField jtf51=new JTextField();

	public static void main(String[] args)throws Exception {
		final_one f1=new final_one();
		JFrame jf1=new JFrame("Library Management System");
		jf1.setLayout(null);
		jf1.setBounds(50, 50, 750,320);
		jf1.setVisible(true);
		JTabbedPane jtp1=new JTabbedPane();
		jtp1.setBounds(0, 0, 750, 800);
		jf1.add(jtp1);
		
		
	
		
		jp1.setLayout(null);
		JLabel jl1=new JLabel("Member Name	: ");
		JLabel jl2=new JLabel("Age	:");
		JLabel jl3=new JLabel("ID No	:");
		JLabel jl4=new JLabel("Member Type	:	");
		JLabel jl5=new JLabel("Address	:");
		JLabel jl6=new JLabel("Telephone	:");
		jl1.setBounds(0, 0, 150, 30);
		jl2.setBounds(0, 30, 150, 30);
		jl3.setBounds(0, 60, 150, 30);
		jl4.setBounds(0, 90, 150, 30);
		jl5.setBounds(0, 120, 150, 30);
		jl6.setBounds(0, 150, 150, 30);
		jp1.add(jl1);
		jp1.add(jl2);
		jp1.add(jl1);
		jp1.add(jl2);
		jp1.add(jl3);
		jp1.add(jl4);
		jp1.add(jl5);
		jp1.add(jl6);
		
		jtf1.setBounds(500, 0, 230, 30);
		jtf2.setBounds(500, 30, 230, 30);
		jtf3.setBounds(500, 60, 230, 30);
		jtf4.setBounds(500, 90, 230, 30);
		jtf5.setBounds(500, 120, 230, 30);
		jtf6.setBounds(500, 150, 230, 30);
		jp1.add(jtf1);
		jp1.add(jtf2);
		jp1.add(jtf1);
		jp1.add(jtf2);
		jp1.add(jtf3);
		jp1.add(jtf4);
		jp1.add(jtf5);
		jp1.add(jtf6);
		
		jb1.setBounds(0, 180, 750, 30);
		jp1.add(jb1);
		JLabel datestr1=date();
		jp1.add(datestr1);
		
		
		
		jp2.setLayout(null);
		JLabel jl11=new JLabel("Book Name	:");
		JLabel jl12=new JLabel("Author Name	:");
		JLabel jl13=new JLabel("Publisher Name :");
		JLabel jl14=new JLabel("Book Type	:");
		JLabel jl15=new JLabel("Book ID	:");
		JLabel jl16=new JLabel("Year	:");
		jl11.setBounds(0, 0, 150, 30);
		jl12.setBounds(0, 30, 150, 30);
		jl13.setBounds(0, 60, 150, 30);
		jl14.setBounds(0, 90, 150, 30);
		jl15.setBounds(0, 120, 150, 30);
		jl16.setBounds(0, 150, 150, 30);
		jp2.add(jl11);
		jp2.add(jl12);
		jp2.add(jl13);
		jp2.add(jl14);
		jp2.add(jl15);
		jp2.add(jl16);
		
		jtf11.setBounds(500, 0, 230, 30);
		jtf12.setBounds(500, 30, 230, 30);
		jtf13.setBounds(500, 60, 230, 30);
		jtf14.setBounds(500, 90, 230, 30);
		jtf15.setBounds(500, 120, 230, 30);
		jtf16.setBounds(500, 150, 230, 30);
		jp2.add(jtf11);
		jp2.add(jtf12);
		jp2.add(jtf13);
		jp2.add(jtf14);
		jp2.add(jtf15);
		jp2.add(jtf16);
		
		jb11.setBounds(0, 180, 750, 30);
		jp2.add(jb11);
		JLabel datestr12=date();
		jp2.add(datestr12);
		
		
		jp3.setLayout(null);
		JLabel jl21=new JLabel("Enter Book ID	:");
		JLabel jl22=new JLabel("Enter Book Name	:");
		JLabel jl23=new JLabel("Enter Member ID	:");
		JLabel jl24=new JLabel("Enter Member Name	:");
		
		jl21.setBounds(0, 0, 150, 30);
		jl22.setBounds(380, 0, 150, 30);
		jl23.setBounds(0, 125, 150, 30);
		jl24.setBounds(380, 125, 150, 30);
		
		jtf21.setBounds(0, 25, 380, 30);
		jtf22.setBounds(380, 25, 380, 30);
		jtf23.setBounds(0, 150, 380, 30);
		jtf24.setBounds(380, 150, 380, 30);
		
		jb21.setBounds(0, 55, 380, 30);
		jb22.setBounds(380,55, 380, 30);
		jb23.setBounds(0, 180, 380, 30);
		jb24.setBounds(380, 180, 380, 30);
		
		jp3.add(jl21);
		jp3.add(jl22);
		jp3.add(jl23);
		jp3.add(jl24);
		
		jp3.add(jtf21);
		jp3.add(jtf22);
		jp3.add(jtf23);
		jp3.add(jtf24);
		
		jp3.add(jb21);
		jp3.add(jb22);
		jp3.add(jb23);
		jp3.add(jb24);
		JLabel datestr22=date();
		jp3.add(datestr22);
		
		jp4.setLayout(null);
		JLabel jl31=new JLabel("Please enter the date property to calculate fines correctly.See Important Notes for details.");
		JLabel jl32=new JLabel("Enter Return Date	:");
		JLabel jl33=new JLabel("Enter Book ID	:");
		
		
		jb31.setBounds(0, 180, 750, 30);
		jp4.add(jb31);
		JLabel datestr31=date();
		jp4.add(datestr31);
		jl31.setBounds(0, 0, 800, 30);
		jl32.setBounds(0, 50, 150, 30);
		jl33.setBounds(0, 120, 150, 30);
		jtf31.setBounds(450, 30, 280, 70);
		jtf32.setBounds(450, 100, 280, 70);
		jp4.add(jl31);
		jp4.add(jl32);
		jp4.add(jl33);
		jp4.add(jtf31);
		jp4.add(jtf32);
		
		
		jp5.setLayout(null);
		JLabel jl41=new JLabel("Enter Date Borrow	:");
		JLabel jl42=new JLabel("Enter Member ID	:");
		JLabel jl43=new JLabel("Enter Book ID	:");
	
		
		jb41.setBounds(0, 180, 750, 30);
		jp5.add(jb41);
		JLabel datestr41=date();
		jp5.add(datestr41);
		jl41.setBounds(0, 0, 150, 30);
		jl42.setBounds(0, 60, 150, 30);
		jl43.setBounds(0, 120, 150, 30);
		jtf41.setBounds(450, 0, 280, 60);
		jtf42.setBounds(450, 60, 280, 60);
		jtf43.setBounds(450, 120, 280, 60);
		jp5.add(jl41);
		jp5.add(jl42);
		jp5.add(jl43);
		jp5.add(jtf41);
		jp5.add(jtf42);
		jp5.add(jtf43);
		
		
		
		jp6.setLayout(null);
		JLabel jl51=new JLabel("Enter Member ID	:");
	
		
		jb51.setBounds(0, 100, 750, 50);
		jp6.add(jb51);
		JLabel datestr51=date();
		jp6.add(datestr51);
		jl51.setBounds(0, 10, 150, 30);
		jtf51.setBounds(0, 50, 750, 50);
		jp6.add(jl51);
		jp6.add(jtf51);
		
		
		jp7.setLayout(null);
		JLabel jl61=new JLabel("Designed By	:");
		JLabel jl62=new JLabel("Debaditya Bhattacharya");
		JLabel jl63=new JLabel("C/647,Koelnagar");
		JLabel jl64=new JLabel("Rourkela");
		JLabel jl65=new JLabel("Odisha");
		jl61.setBounds(0, 40, 150, 30);
		jl62.setBounds(40, 70, 150, 30);
		jl63.setBounds(40, 90, 150, 30);
		jl64.setBounds(40, 110, 150, 30);
		jl65.setBounds(40, 130, 150, 30);
		jp7.add(jl61);
		jp7.add(jl62);
		jp7.add(jl63);
		jp7.add(jl64);
		jp7.add(jl65);
		JLabel datestr61=date();
		jp7.add(datestr61);
		
		
		
		jp8.setLayout(null);
		JLabel jl71=new JLabel("Important Notes:");
		JLabel jl72=new JLabel("Below are the important notes you need to ");
		JLabel jl73=new JLabel("keep in mind while using this system:");
		JLabel jl74=new JLabel("If the book was borrowed previous month,for entering the return date please calculate and enter");
		JLabel jl75=new JLabel("the no of days that book have been with memeber.");
		JLabel jl76=new JLabel("Ex:Borrowed Date:25th February");
		JLabel jl77=new JLabel("Return Date:15th March");
		JLabel jl78=new JLabel("No of days in February:28-25=3");
		JLabel jl79=new JLabel("No of days in March:15");
		JLabel jl710=new JLabel("Total no of days:15+3=18 days");
		jl71.setBounds(0, 10, 350, 30);
		jl72.setBounds(0, 30, 350, 30);
		jl73.setBounds(0, 50, 350, 30);
		jl74.setBounds(40, 80, 555, 30);
		jl75.setBounds(40, 100, 350, 30);
		jl76.setBounds(40, 120, 350, 30);
		jl77.setBounds(40, 140, 350, 30);
		jl78.setBounds(40, 160, 350, 30);
		jl79.setBounds(40, 180, 350, 30);
		jl710.setBounds(40, 200, 350, 30);
		jp8.add(jl71);
		jp8.add(jl72);
		jp8.add(jl73);
		jp8.add(jl74);
		jp8.add(jl75);
		jp8.add(jl76);
		jp8.add(jl77);
		jp8.add(jl78);
		jp8.add(jl79);
		jp8.add(jl710);
		JLabel datestr71=date();
		jp8.add(datestr71);
		
		
		jp9.setLayout(null);
		JLabel jl81=new JLabel("Book Details	:");
		JLabel jl82=new JLabel("Member Details	:");

		jl81.setBounds(0, 0, 350, 30);
		jl82.setBounds(0, 100, 350, 30);
		jb81.setBounds(0, 30, 750, 30);
		jb82.setBounds(0, 130, 750, 30);
		jp9.add(jl81);
		jp9.add(jl82);
		jp9.add(jb81);
		jp9.add(jb82);
		JLabel datestr81=date();
		jp9.add(datestr81);
		
		
		
		jtp1.addTab("Add Members", jp1);
		jtp1.addTab("Add Books", jp2);
		jtp1.addTab("Search", jp3);
		jtp1.addTab("Returning Books", jp4);
		jtp1.addTab("Borrowing Books", jp5);
		jtp1.addTab("Transaction Records", jp6);
		jtp1.addTab("Designed By", jp7);
		jtp1.addTab("Important Notes", jp8);
		jtp1.addTab("More Enquiry", jp9);
		
		
		
		//f1.createDatabase();
		jb1.addActionListener(f1);
		jb11.addActionListener(f1);
		jb21.addActionListener(f1);
		jb22.addActionListener(f1);
		jb23.addActionListener(f1);
		jb24.addActionListener(f1);
		jb31.addActionListener(f1);
		jb41.addActionListener(f1);
		jb51.addActionListener(f1);
		jb81.addActionListener(f1);
		jb82.addActionListener(f1);
		
		

	}
	public void createDatabase() throws Exception 
	{
		Connection con=Connecting_Drivers.getOracleConnection();
		String sql1="create table Member(MemberName varchar2(30),Age number(3),IDNo number(10),MemberType varchar2(10),Address varchar2(30),Telephone number(20))";
		Statement st=con.createStatement();
		boolean res1=st.execute(sql1);
		System.out.println(res1);
		String sql2="create table Book(BookName varchar2(30),AuthorName varchar2(30),PublisherName varchar2(30),BookType varchar2(10),BookID number(10),Year number(4))";
		boolean res2=st.execute(sql2);
		System.out.println(res2);
		con.close();
	}
	public static JLabel date()
	{
		Date d1=new Date();
		DateFormat dateFormat1 = new SimpleDateFormat("hh:mm:ss a");
        String time=dateFormat1.format(d1);
        DateFormat dateFormat2 = new SimpleDateFormat("dd-MM-yyyy");
        String date=dateFormat2.format(d1);
		JLabel datestr=new JLabel("Today the date is"+date+". And now the time is "+time);
		datestr.setBounds(200,210,800,30);
		return datestr;
	}
	@Override
	public void actionPerformed(ActionEvent ae) 
	{
		Connection con=Connecting_Drivers.getOracleConnection();
		if(ae.getSource()==jb1) 
		{
			
			
			String sql="insert into member(MemberName,Age,IDNo,MemberType,Address,Telephone)values(?,?,?,?,?,?)";
			JOptionPane.showMessageDialog(null,"member record inserted");
			try 
			{
				PreparedStatement pst=con.prepareStatement(sql);
				pst.setString(1, jtf1.getText());
				pst.setInt(2, Integer.parseInt(jtf2.getText()));
				pst.setInt(3, Integer.parseInt(jtf3.getText()));
				pst.setString(4, jtf4.getText());
				pst.setString(5, jtf5.getText());
				pst.setInt(6, Integer.parseInt(jtf6.getText()));
				int status=pst.executeUpdate();				
				System.out.println(status);			
			} 
			catch (Exception e) 
			{		
				e.printStackTrace();
			}
		
			
		}
		
		
		
		if(ae.getSource()==jb11)
		{
			String sql="insert into book(BookName,AuthorName,PublisherName,BookType,BookID,Year)values(?,?,?,?,?,?)";
			JOptionPane.showMessageDialog(null,"book record inserted");
			try 
			{
				PreparedStatement pst=con.prepareStatement(sql);
				pst.setString(1, jtf11.getText());
				pst.setString(2, jtf12.getText());
				pst.setString(3, jtf13.getText());
				pst.setString(4, jtf14.getText());
				pst.setInt(5, Integer.parseInt(jtf15.getText()));
				pst.setInt(6, Integer.parseInt(jtf16.getText()));
				int status=pst.executeUpdate();				
				System.out.println(status);			
			} 
			catch (Exception e) 
			{		
				e.printStackTrace();
			}
		}
		
		
		
		if(ae.getSource()==jb21)
		{
			try
			{
				int x=Integer.parseInt(jtf21.getText());
				String sql="select bookid from book where bookid=?";
				PreparedStatement pst=con.prepareStatement(sql);
				pst.setInt(1, Integer.parseInt(jtf21.getText()));
				ResultSet rs=pst.executeQuery();
				int r , flag = 0 ;
				while(rs.next())
				{
					r=rs.getInt(1);
					int tem=Integer.parseInt(jtf21.getText());
					System.out.println(tem);
					if(r==Integer.parseInt(jtf21.getText()))
						{
						   flag=1;
						}
				}
				if (flag == 1)
					JOptionPane.showMessageDialog(null,"book  founded");
				else
					JOptionPane.showMessageDialog(null,"book not founded");
					
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		
		
		if(ae.getSource()==jb22)
		{
			
		}
		
		
		
		if(ae.getSource()==jb23)
		{
			
		}
		
		
		
		if(ae.getSource()==jb24)
		{
			
		}
		
		
		
		if(ae.getSource()==jb31)
		{
			
		}
		
		
		
		if(ae.getSource()==jb41)
		{
			
		}
		
		
		
		if(ae.getSource()==jb51)
		{
			
		}
		
		
		
		if(ae.getSource()==jb81)
		{
			
		}
		
		
		
		if(ae.getSource()==jb82)
		{
			
		}
		
		
	}

}
