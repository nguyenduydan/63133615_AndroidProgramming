package ntu_63133615;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Canvas;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txt_username;
	private JPasswordField txt_pass;

	/**
	 * Create the frame.
	 */
	public Login() {
		setResizable(false);
		setTitle("Đăng nhập");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 470);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		URL urlIcon = Login.class.getResource("/ntu_63133615/Img/people.png"); //set icon cho JFrame
		Image img = Toolkit.getDefaultToolkit().createImage(urlIcon);
		this.setIconImage(img);
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel bg_left = new JLabel("");
		bg_left.setHorizontalAlignment(SwingConstants.CENTER);
		bg_left.setIcon(new ImageIcon(Login.class.getResource("/ntu_63133615/Img/bg.jpg")));
		bg_left.setBounds(0, 0, 315, 431);
		contentPane.add(bg_left);
		
		JLabel lblNewLabel_1 = new JLabel("Đăng nhập");
		lblNewLabel_1.setFont(new Font("JetBrains Mono NL ExtraBold", Font.BOLD, 40));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(364, 66, 249, 53);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Tên người dùng");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("JetBrains Mono NL ExtraBold", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(318, 184, 161, 26);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Mật khẩu");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("JetBrains Mono NL ExtraBold", Font.BOLD, 18));
		lblNewLabel_1_1_1.setBounds(318, 250, 161, 26);
		contentPane.add(lblNewLabel_1_1_1);
		
		txt_username = new JTextField();
		txt_username.setFont(new Font("JetBrains Mono", Font.PLAIN, 18));
		txt_username.setBounds(480, 180, 150, 30);
		contentPane.add(txt_username);
		txt_username.setColumns(10);
		
		txt_pass = new JPasswordField();
		txt_pass.setFont(new Font("JetBrains Mono", Font.PLAIN, 18));
		txt_pass.setBounds(480, 246, 150, 30);
		contentPane.add(txt_pass);
		
		JButton btnNewButton = new JButton("Đăng nhập");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("JetBrains Mono ExtraBold", Font.BOLD, 25));
		btnNewButton.setBounds(381, 316, 200, 60);
		contentPane.add(btnNewButton);
		
	}
}
