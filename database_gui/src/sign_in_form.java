import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.awt.event.ActionEvent;

public class sign_in_form extends JFrame {

	private JPanel contentPane;
	public HashMap<String,String> passwdMap;
	public HashMap<String,String> nameMap;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sign_in_form frame = new sign_in_form();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public boolean evaluateDetails(String uname, String passwd) {
		JFrame f;
		String msg;
		if(passwdMap.containsKey(uname)==false) {
			f = new JFrame();
			msg = "Wrong UserName/Password";
			JOptionPane.showMessageDialog(f,msg,"INFORMATION",JOptionPane.INFORMATION_MESSAGE);
			return false;
		}
		if(passwdMap.get(uname).equals(passwd)==false) {
			f = new JFrame();
			msg = "Wrong UserName/Password";
			JOptionPane.showMessageDialog(f,msg,"INFORMATION",JOptionPane.INFORMATION_MESSAGE);
			return false;
		}
		f = new JFrame();
		msg = "Welcome"+nameMap.get(uname);
		JOptionPane.showMessageDialog(f,msg,"INFORMATION",JOptionPane.INFORMATION_MESSAGE);
		return true;
	}
	public void evaluateSignUp(String name, String uname, String passwd) {
		JFrame f;
		String msg;
		if(passwdMap.containsKey(uname)==true) {
			f=new JFrame();
			msg="Username already exists";
			JOptionPane.showMessageDialog(f,msg,"INFORMATION",JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		passwdMap.put(uname, passwd);
		nameMap.put(uname, name);
		f=new JFrame();
		msg="Username registered successfully";
		JOptionPane.showMessageDialog(f,msg,"INFORMATION",JOptionPane.INFORMATION_MESSAGE);
		return;
	}
	/**
	 * Create the frame.
	 */
	public sign_in_form() {
		passwdMap = new  HashMap<String,String>();
		nameMap = new HashMap<String, String>();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton signIn = new JButton("Sign In");
		signIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame(); 
				JPanel contentPane;
				JTextField usernameTxt;
				JTextField passwordTxt;
				frame.setVisible(true);
				frame.setSize(450,300);
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setBounds(100, 100, 450, 300);
				contentPane = new JPanel();
				contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
				setContentPane(contentPane);
				contentPane.setLayout(null);
				frame.getContentPane().add(contentPane);
				
				
				JLabel userNameLb = new JLabel("User Name");
				userNameLb.setFont(new Font("Calibri", Font.BOLD, 14));
				userNameLb.setBounds(82, 75, 84, 20);
				contentPane.add(userNameLb);
				
				JLabel PasswordLb = new JLabel("Password");
				PasswordLb.setFont(new Font("Calibri", Font.BOLD, 14));
				PasswordLb.setBounds(82, 118, 84, 20);
				contentPane.add(PasswordLb);
				
				usernameTxt = new JTextField();
				usernameTxt.setBounds(228, 73, 116, 20);
				contentPane.add(usernameTxt);
				usernameTxt.setColumns(10);
				
				passwordTxt = new JTextField();
				passwordTxt.setColumns(10);
				passwordTxt.setBounds(228, 116, 116, 20);
				contentPane.add(passwordTxt);
				
				JButton signInBtn = new JButton("SIGN IN");
				signInBtn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						evaluateDetails(usernameTxt.getText(),passwordTxt.getText());
					}
				});
				signInBtn.setBounds(153, 179, 89, 23);
				contentPane.add(signInBtn);
				
				JLabel signinLb = new JLabel("SIGN IN");
				signinLb.setFont(new Font("Times New Roman", Font.BOLD, 14));
				signinLb.setHorizontalAlignment(SwingConstants.CENTER);
				signinLb.setBounds(139, 11, 127, 30);
				contentPane.add(signinLb);
			}
		});
		signIn.setFont(new Font("Verdana", Font.BOLD, 14));
		signIn.setBounds(62, 116, 113, 23);
		contentPane.add(signIn);
		
		JButton signUp = new JButton("Sign Up");
		signUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame();
				frame.setSize(450,300);
				frame.setVisible(true);
				JPanel contentPane;
				JTextField nameTxt;
				JTextField usernameTxt;
				JTextField passwordTxt;
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setBounds(100, 100, 450, 300);
				contentPane = new JPanel();
				contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
				setContentPane(contentPane);
				contentPane.setLayout(null);
				frame.add(contentPane);
				
				JLabel signUpLb = new JLabel("SIGN UP");
				signUpLb.setFont(new Font("Times New Roman", Font.BOLD, 14));
				signUpLb.setHorizontalAlignment(SwingConstants.CENTER);
				signUpLb.setBounds(126, 25, 135, 25);
				contentPane.add(signUpLb);
				
				JLabel nameLb = new JLabel("Name");
				nameLb.setFont(new Font("Calibri", Font.BOLD, 14));
				nameLb.setHorizontalAlignment(SwingConstants.LEFT);
				nameLb.setBounds(77, 73, 78, 25);
				contentPane.add(nameLb);
				
				JLabel usernameLb = new JLabel("User Name");
				usernameLb.setFont(new Font("Calibri", Font.BOLD, 14));
				usernameLb.setBounds(77, 113, 78, 25);
				contentPane.add(usernameLb);
				
				JLabel passwordLb = new JLabel("Password");
				passwordLb.setHorizontalAlignment(SwingConstants.LEFT);
				passwordLb.setFont(new Font("Calibri", Font.BOLD, 14));
				passwordLb.setBounds(77, 149, 78, 25);
				contentPane.add(passwordLb);
				
				nameTxt = new JTextField();
				nameTxt.setBounds(208, 73, 119, 20);
				contentPane.add(nameTxt);
				nameTxt.setColumns(10);
				
				usernameTxt = new JTextField();
				usernameTxt.setColumns(10);
				usernameTxt.setBounds(208, 113, 119, 20);
				contentPane.add(usernameTxt);
				
				passwordTxt = new JTextField();
				passwordTxt.setColumns(10);
				passwordTxt.setBounds(208, 149, 119, 20);
				contentPane.add(passwordTxt);
				
				JButton signUpBtn = new JButton("SIGN UP");
				signUpBtn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						evaluateSignUp(nameTxt.getText(),usernameTxt.getText(),passwordTxt.getText());
					}
				});
				signUpBtn.setBounds(147, 202, 89, 23);
				contentPane.add(signUpBtn);
			}
		});
		signUp.setFont(new Font("Verdana", Font.BOLD, 14));
		signUp.setBounds(247, 116, 107, 23);
		contentPane.add(signUp);
	}
}
