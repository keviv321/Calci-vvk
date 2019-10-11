/*
 * written by @vivek_kumar
 */

package swing_sample;

import java.awt.Color;
import java.awt.Container;
//import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.math.BigInteger;

//import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Demo implements ActionListener{
	private JFrame frame1=new JFrame("Calculator");

	//private JPanel panel=new JPanel();

	//private JTextArea txt=new JTextArea(5,30);

	private JTextField txtfield=new JTextField();

	private BigInteger nmbr1,nmbr2,result;
	private BigDecimal decnum1,decnum2,resultt;

	private byte addc=0,subc=0,divc=0,mulc=0,eql=0;

	private Container c;

	private JButton btn1=new JButton("1");
	private JButton btn2=new JButton("2");
	private JButton btn3=new JButton("3");
	private JButton btn4=new JButton("4");
	private JButton btn5=new JButton("5");
	private JButton btn6=new JButton("6");
	private JButton btn7=new JButton("7");
	private JButton btn8=new JButton("8");
	private JButton btn9=new JButton("9");
	private JButton btn0=new JButton("0");
	private JButton btndot=new JButton(".");
	private JButton btnadd=new JButton("+");
	private JButton btnsub=new JButton("-");
	private JButton btndiv=new JButton("/");
	private JButton btnmul=new JButton("*");
	private JButton btnclr=new JButton("CLR");
	private JButton btnequls=new JButton("=");








	public Demo(){
		frame1.setVisible(true);

		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame1.setBounds(100,100,540,600);
		frame1.setResizable(false);
		c=frame1.getContentPane();
		c.setLayout(null);
		//frame1.add(panel);
		// panel.setBackground(Color.GRAY);
		//Border bd1=new BorderFactory.createLineBorder(Color.BLUE,4);
		//panel.setBorder(bd1);
		// panel.add(txt);
		//c.add(txt);

		txtfield.setBounds(10,20,500,100);
		c.add(txtfield);
		//txt.setBackground(Color.BLACK);
		//txt.setForeground(Color.WHITE);
		Font f=new Font("arial",Font.BOLD,20);
		txtfield.setFont(f);
		txtfield.setBackground(Color.BLACK);
		txtfield.setForeground(Color.WHITE);
		// txt.setFont(f);
		//txt.setPreferredSize(new Dimension(5,30));
		//txt.setLineWrap(true);
		// btn1.setPreferredSize(new Dimension(25,25));
		//panel.add(btn1);
		btn1.setBounds(10, 150, 100, 50);
		btn2.setBounds(130, 150, 100, 50);
		btn3.setBounds(250, 150, 100, 50);
		btn4.setBounds(10, 220, 100, 50);
		btn5.setBounds(130, 220, 100, 50);
		btn6.setBounds(250, 220, 100, 50);
		btn7.setBounds(10, 290, 100, 50);
		btn8.setBounds(130, 290, 100, 50);
		btn9.setBounds(250, 290, 100, 50);
		btn0.setBounds(130, 360, 100, 50);
		btndot.setBounds(10, 360, 100, 50);
		btnadd.setBounds(390, 150, 100, 50);
		btnsub.setBounds(390, 220, 100, 50);
		btndiv.setBounds(390, 290, 100, 50);
		btnmul.setBounds(390, 360, 100, 50);
		btnclr.setBounds(40, 450, 200, 40);
		btnequls.setBounds(270, 450, 200, 40);



		c.add(btn1);
		c.add(btn2);
		c.add(btn3);
		c.add(btn4);
		c.add(btn5);
		c.add(btn6);
		c.add(btn7);
		c.add(btn8);
		c.add(btn9);
		c.add(btn0);
		c.add(btndot);
		c.add(btnadd);
		c.add(btnsub);
		c.add(btndiv);
		c.add(btnmul);
		c.add(btnequls);
		c.add(btnclr);


		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);
		btn7.addActionListener(this);
		btn8.addActionListener(this);
		btn9.addActionListener(this);
		btn0.addActionListener(this);
		btndot.addActionListener(this);
		btnadd.addActionListener(this);
		btnsub.addActionListener(this);
		btndiv.addActionListener(this);
		btnmul.addActionListener(this);
		btnequls.addActionListener(this);
		btnclr.addActionListener(this);




	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object source=e.getSource();
		txtfield.setEditable(true);
		String t;
		if(source==btn1)
		{
			if (eql==1)
			{txtfield.setText("1");eql=0;}
			else{
				t=txtfield.getText();
				txtfield.setText(t+"1");
			}
		}
		if(source==btn2)
		{
			if (eql==1)
			{txtfield.setText("2");eql=0;}
			else{
				t=txtfield.getText();
				txtfield.setText(t+"2");
			}
		}
		if(source==btn3)
		{
			if (eql==1)
			{txtfield.setText("3");eql=0;}
			else{
				t=txtfield.getText();
				txtfield.setText(t+"3");
			}
		}
		if(source==btn4)
		{
			if (eql==1)
			{txtfield.setText("4");eql=0;}
			else{
				t=txtfield.getText();
				txtfield.setText(t+"4");
			}
		}
		if(source==btn5)
		{
			if (eql==1)
			{txtfield.setText("5");eql=0;}
			else{
				t=txtfield.getText();
				txtfield.setText(t+"5");
			}
		}
		if(source==btn6)
		{
			if (eql==1)
			{txtfield.setText("6");eql=0;}
			else{
				t=txtfield.getText();
				txtfield.setText(t+"6");
			}
		}
		if(source==btn7)
		{
			if (eql==1)
			{txtfield.setText("7");eql=0;}
			else{
				t=txtfield.getText();
				txtfield.setText(t+"7");
			}
		}
		if(source==btn8)
		{
			if (eql==1)
			{txtfield.setText("8");eql=0;}
			else{
				t=txtfield.getText();
				txtfield.setText(t+"8");
			}
		}
		if(source==btn9)
		{
			if (eql==1)
			{txtfield.setText("9");eql=0;}
			else{
				t=txtfield.getText();
				txtfield.setText(t+"9");
			}
		}
		if(source==btn0)
		{
			if (eql==1)
			{txtfield.setText("0");eql=0;}
			else{
				t=txtfield.getText();
				txtfield.setText(t+"0");
			}
		}
		if(source==btndot)
		{
			t=txtfield.getText();
			if (t.indexOf('.')==-1)
				txtfield.setText(t+".");
			else
				txtfield.setText(t);
		}
		if(source==btnadd)
		{
			if(txtfield.getText().indexOf('.')==-1)
			{ 
				nmbr1=Number_Reader();
				txtfield.setText("");
				addc=1;
				divc=0;
				mulc=0;
				subc=0;
			}
			else
			{	
				decnum1=Num_Read();
				txtfield.setText("");
				addc=11;
				divc=0;
				mulc=0;
				subc=0;
			}

		}
		if(source==btnsub)
		{
			if(txtfield.getText().indexOf('.')==-1)
			{ 
				nmbr1=Number_Reader();
				txtfield.setText("");
				addc=0;
				divc=0;
				mulc=0;
				subc=1;
			}
			else
			{	
				decnum1=Num_Read();
				txtfield.setText("");
				addc=0;
				divc=0;
				mulc=0;
				subc=11;
			}

		}
		if(source==btndiv)
		{
			if(txtfield.getText().indexOf('.')==-1)
			{ 
				nmbr1=Number_Reader();
				txtfield.setText("");
				addc=0;
				divc=1;
				mulc=0;
				subc=0;
			}
			else
			{	
				decnum1=Num_Read();
				txtfield.setText("");
				addc=0;
				divc=11;
				mulc=0;
				subc=0;
			}


		}
		if(source==btnmul)
		{
			if(txtfield.getText().indexOf('.')==-1)
			{ 
				nmbr1=Number_Reader();
				txtfield.setText("");
				addc=0;
				divc=0;
				mulc=1;
				subc=0;
			}
			else
			{	
				decnum1=Num_Read();
				txtfield.setText("");
				addc=0;
				divc=0;
				mulc=11;
				subc=0;
			}
		}
		if (source==btnequls)
		{
			eql=1;
			if(txtfield.getText().indexOf('.')==-1)
				nmbr2=Number_Reader();
			else
				decnum2=Num_Read();
			if (addc==1){
				try{
					result=nmbr1.add(nmbr2);
					txtfield.setText(result.toString());
				}
				catch(Exception e1)
				{
					txtfield.setText("ERROR");
				}
			}
			else if (subc==1){
				try{
					result=nmbr1.subtract(nmbr2);
					txtfield.setText(result.toString());
				}
				catch(Exception e1)
				{
					txtfield.setText("ERROR");
				}
			}
			else if (divc==1){
				try{
					result=nmbr1.divide(nmbr2);
					txtfield.setText(result.toString());
				}
				catch(ArithmeticException a1)
				{
					txtfield.setText("MATH ERROR");
				}
			}
			else if (mulc==1){
				try{
					result=nmbr1.multiply(nmbr2);
					txtfield.setText(result.toString());
				}
				catch(Exception e1)
				{
					txtfield.setText("ERROR");
				}
			}
			else if (addc==11){
				try{
					resultt=decnum1.add(decnum2);
					txtfield.setText(resultt.toString());
				}
				catch(Exception e1)
				{
					txtfield.setText("ERROR");
				}
			}
			else if (subc==11){
				try{
					resultt=decnum1.subtract(decnum2);
					txtfield.setText(resultt.toString());
				}
				catch(Exception e1)
				{
					txtfield.setText("ERROR");
				}
			}
			else if (mulc==11){
				try
				{
					resultt=decnum1.multiply(decnum2);
					txtfield.setText(resultt.toString());
				}
				catch(Exception e1)
				{
					txtfield.setText("ERROR");
				}
			}
			else if (divc==11){
				try{
					resultt=decnum1.divide(decnum2);
					txtfield.setText(resultt.toString());
				}
				catch(ArithmeticException a)
				{
					txtfield.setText("MATH ERROR");
				}
			}
		}
		if (source==btnclr)
		{
			txtfield.setText("");
		}
	}
	private BigInteger Number_Reader()
	{

		try{
			BigInteger num1=new BigInteger(txtfield.getText());
			return num1;
		}
		catch(Exception e){
			txtfield.setText(" Error ");
		}
		return null;
	}
	private BigDecimal Num_Read()
	{
		try{
			BigDecimal num=new BigDecimal(txtfield.getText());
			return num;
		}
		catch(Exception e)
		{
			txtfield.setText("Error");
		}
		return null;
	}
	public static void main(String args[])
	{
		Demo ob=new Demo();
	}


}
