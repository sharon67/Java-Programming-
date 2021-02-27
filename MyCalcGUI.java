import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyCalcGUI extends JFrame implements ActionListener{

	JButton[] b=new JButton[15];
	JPanel p=new JPanel();
	GridBagLayout layout =new GridBagLayout();
	TextField t=new TextField();
	static String op1,op2,op;
	public MyCalcGUI() {
			for(int i=0;i<10;i++)
				b[i]=new JButton(String.valueOf(i));
			b[10]=new JButton("*");
			b[11]=new JButton("/");
			b[12]=new JButton("-");
			b[13]=new JButton("=");
			b[14]=new JButton("+");

			t.setPreferredSize(new Dimension(320, 30));
			t.setEditable(false);
			p.setLayout(layout);
			for(int i=0;i<15;i++)
				b[i].addActionListener(this);
			add(t,BorderLayout.NORTH);
			add(p,BorderLayout.CENTER);
			setVisible(true);
			setSize(350,500);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			GridBagConstraints c=new GridBagConstraints();
			c.fill = GridBagConstraints.BOTH;
			c.insets=new Insets(2,2,2,2);
			int x=0;
			int y=0;
			for(int i=1;i<10;i++) {
				if(x>2) {
					x=0;
					y++;
				}
				c.gridx=x;
				c.gridy=y;
				p.add(b[i],c);
				x++;
			}
			c.gridx=1;
			c.gridy=3;
			p.add(b[0],c);
			c.gridx=0;
			c.gridy=3;
			p.add(b[10],c);
			c.gridx=2;
			c.gridy=3;
			p.add(b[11],c);
			c.gridx=3;
			c.gridy=3;
			p.add(b[12],c);
			c.gridx=3;
			c.gridy=0;
			c.gridheight=2;
			p.add(b[14],c);
			c.gridx=3;
			c.gridy=2;
			c.gridheight=1;
			p.add(b[13],c);
			op1=op2=op="";
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyCalcGUI();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String ip=e.getActionCommand();
		if(ip=="+" || ip=="-" || ip=="*" || ip=="/") {
			if(!op1.equals("")) {
				op=ip;
			}
			t.setText(ip);
		}
		else if(ip.equals("=")) {
			if(!op2.equals("")) {
				double v1,v2,res=0.0;
				v1=Double.parseDouble(op1);
				v2=Double.parseDouble(op2);
				switch(op) {
				case "+":res=v1+v2;
						 break;
				case "-":res=v1-v2;
				 break;
				case "*":res=v1*v2;
				 break;
				case "/":res=v1/v2;
				 break;
				}
				op1=op2=op="";
				t.setText(String.valueOf(res));
				
			}
		}
		else {
			if(!op.equals("")) {
				op2+=""+ip;
				t.setText(op2);
			}
			else {
				op1+=""+ip;
				t.setText(op1);
			}
		}
	}
}
