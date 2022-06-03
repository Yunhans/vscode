import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GUI implements ActionListener {

	private static JLabel userlabel; //前面"user"文字標示
	private static JLabel passwordlabel; //前面"password"文字標示
	private static JLabel success;
	
	private static JTextField usertext; // 輸入用戶帳號
	private static JPasswordField passwordtext; // 輸入用戶密碼
	
	private static JButton loginbutton; //登入按鈕
	
	private static JFrame frame = new JFrame();
	private static JPanel panel = new JPanel();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
			userlabel = new JLabel("User");
			passwordlabel = new JLabel("Password");
			usertext = new JTextField(20); //20是長度限制
			passwordtext = new JPasswordField(20);
			loginbutton = new JButton("log in");
			success = new JLabel("");
			
			
			
			frame.setSize(420, 420);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.add(panel);
			
			panel.setLayout(null);
			
			//user part
			userlabel.setBounds(10,20,80,25);
			panel.add(userlabel);
			usertext.setBounds(100, 20, 165, 25);
			panel.add(usertext);
			
			//password part
			passwordlabel.setBounds(10, 50, 80, 25);
			panel.add(passwordlabel);
			passwordtext.setBounds(100, 50, 165, 25);
			panel.add(passwordtext);
			
			// log in button
			loginbutton.setBounds(10, 80, 80, 25);
			panel.add(loginbutton);
			loginbutton.addActionListener(new GUI());
			
			success.setBounds(10, 110, 300, 25);
			panel.add(success);
			
			frame.setVisible(true);
			
			
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String user = usertext.getText();
		String password = passwordtext.getText();
		if (user.equals("lin") && password.equals("lin")) 
		{success.setText("you login successfully ");}
	}

}
