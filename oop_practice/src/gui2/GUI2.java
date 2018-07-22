package gui2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUI2 extends JFrame {
	
	public static void main(String[] args) {
		GUI2 gui2=new GUI2();
		gui2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui2.setSize(350,100);
		gui2.setVisible(true);
	}
	
	private final JTextField textField1;
	private final JTextField textField2;
	private final JTextField textField3;
	private final JPasswordField passwordField;
	
	public GUI2(){
		super("Testing JTextField and JPasswordField");
		setLayout(new FlowLayout());
		
		textField1=new JTextField(10);
		add(textField1); //add textField1 to JFrame
		
		textField2=new JTextField("Enter text here");
		add(textField2);//add textField2 to JFrame
		
		textField3=new JTextField("Uneditable text field",21);
		textField3.setEditable(false);
		add(textField3);//add textField3 to JFrame
		
		passwordField=new JPasswordField("Hidden Text");
		add(passwordField);//add Password FIled to JFrame
	
		TextFieldHandler handler=new TextFieldHandler();
		textField1.addActionListener(handler);
		textField2.addActionListener(handler);
		textField3.addActionListener(handler);
		passwordField.addActionListener(handler);

	
	
	
	}
	private class TextFieldHandler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent event){
			String string="";
			
			//user pressed Enter in JTextfield textfeild1
			if(event.getSource()==textField1)
				string=String.format("textField1 : %s", event.getActionCommand());
			else if(event.getSource()==textField2){
				string=String.format("textField2 : %s", event.getActionCommand());
			}else if(event.getSource()==textField3){
				string=String.format("textField3 : %s", event.getActionCommand());
			}else if(event.getSource()==passwordField){
				string=String.format("password Filed : %s", event.getActionCommand());
			}
			JOptionPane.showMessageDialog(null, string);
		}
		
		
		
		
		
		
		
		
		
	}
	
}
