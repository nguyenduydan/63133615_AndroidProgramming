package ntu_63133615;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.net.URL;
import java.util.HashMap;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Register extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txt_username;
	private JPasswordField txt_pass;
	private HashMap<String, String> users;
	
	
	
	public Register() {
		users = new HashMap<>();
		setResizable(false);
		setTitle("Đăng kí");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 470);
		this.setLocation(635,305);
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
		
		JLabel lblNewLabel_1 = new JLabel("Đăng kí");
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
		txt_username.setBounds(480, 180, 150, 35);
		contentPane.add(txt_username);
		txt_username.setColumns(10);
		
		txt_pass = new JPasswordField();
		txt_pass.setFont(new Font("JetBrains Mono", Font.PLAIN, 18));
		txt_pass.setBounds(480, 246, 150, 35);
		contentPane.add(txt_pass);
		
		JButton btn_dangki = new JButton("Đăng kí");
		btn_dangki.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XuLyDangKi();
			}
		});
		btn_dangki.setBackground(Color.BLACK);
		btn_dangki.setForeground(Color.WHITE);
		btn_dangki.setFont(new Font("JetBrains Mono ExtraBold", Font.BOLD, 25));
		btn_dangki.setBounds(381, 313, 200, 60);
		contentPane.add(btn_dangki);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Hiển thị mật khẩu");
		chckbxNewCheckBox.setBackground(new Color(255, 255, 255));
		chckbxNewCheckBox.setFont(new Font("JetBrains Mono ExtraBold", Font.PLAIN, 12));
		chckbxNewCheckBox.setBounds(480, 283, 150, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JButton btn_dangnhap = new JButton("Đăng nhập");
		btn_dangnhap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login();
			}
		});
		btn_dangnhap.setBackground(new Color(233, 233, 233));
		btn_dangnhap.setFont(new Font("JetBrains Mono", Font.BOLD, 16));
		btn_dangnhap.setBounds(414, 383, 135, 30);
		contentPane.add(btn_dangnhap);
		chckbxNewCheckBox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    // Nếu được chọn, hiển thị mật khẩu
                	txt_pass.setEchoChar((char) 0); // Xóa ký tự ẩn đi
                } else {
                    // Nếu không được chọn, ẩn mật khẩu
                	txt_pass.setEchoChar('\u2022'); // Sử dụng ký tự đặc biệt để ẩn mật khẩu
                }
            }
        });
	}
	

	public void XuLyDangKi() {
        String username = txt_username.getText();
        String password = new String(txt_pass.getPassword());

        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập tên đăng nhập và mật khẩu", "Lỗi", JOptionPane.ERROR_MESSAGE);
        } else if (users.containsKey(username)) {
            JOptionPane.showMessageDialog(this, "Tên đăng nhập đã tồn tại", "Lỗi", JOptionPane.ERROR_MESSAGE);
        } else {
            users.put(username, password);
            JOptionPane.showMessageDialog(this, "Đăng ký thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            txt_username.setText("");
            txt_pass.setText("");
            Login();
        }
	}
	
	public void Login() {
		Login lg = new Login(this);
		lg.setVisible(true);
		lg.setLocation(635,305);
		this.setVisible(false);
	}
	public HashMap<String, String> getUsers() {
        return users;
    }

}
