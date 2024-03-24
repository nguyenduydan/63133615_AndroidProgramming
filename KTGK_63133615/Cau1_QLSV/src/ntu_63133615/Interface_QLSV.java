package ntu_63133615;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JSplitPane;
import java.awt.Color;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Window.Type;
import java.net.URL;
import java.util.Vector;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class Interface_QLSV extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txt_mssv;
	private JTextField txt_sdt;
	private JTextField txt_diachi;
	private JTextField txt_hoten;
	private JTextField txt_namsinh;
	private JTextField txt_email;
	private JTable table;
	DefaultTableModel data = new DefaultTableModel();
	private int Stt=0;
	/**
	 * Create the frame.
	 */
	public Interface_QLSV() {
		setTitle("Quản lý sinh viên");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1530, 800);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JPanel navbar = new JPanel();
		navbar.setBounds(0, 88, 525, 673);
		navbar.setBackground(new Color(255, 255, 255));
		URL urlIcon = Login.class.getResource("/ntu_63133615/Img/people.png"); //set icon cho JFrame
		Image img = Toolkit.getDefaultToolkit().createImage(urlIcon);
		this.setIconImage(img);
		contentPane.setLayout(null);
		contentPane.add(navbar);
		navbar.setLayout(null);
		
		JLabel ntuicon = new JLabel("");
		ImageIcon ntu_icon = createResizedIcon("/ntu_63133615/Img/NTU_icon.png",220,220);
		ntuicon.setIcon(ntu_icon);
		ntuicon.setBounds(150, 5, 223, 212);
		navbar.add(ntuicon);
		
		JLabel lblNewLabel_3 = new JLabel("Mã sinh viên");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("JetBrains Mono Medium", Font.BOLD, 18));
		lblNewLabel_3.setBounds(0, 214, 154, 27);
		navbar.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Họ Tên");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setFont(new Font("JetBrains Mono Medium", Font.BOLD, 18));
		lblNewLabel_3_1.setBounds(0, 261, 154, 27);
		navbar.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Năm sinh");
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2.setFont(new Font("JetBrains Mono Medium", Font.BOLD, 18));
		lblNewLabel_3_2.setBounds(0, 308, 154, 27);
		navbar.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("Số điện thoại");
		lblNewLabel_3_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_3.setFont(new Font("JetBrains Mono Medium", Font.BOLD, 18));
		lblNewLabel_3_3.setBounds(4, 457, 154, 27);
		navbar.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_4 = new JLabel("Email");
		lblNewLabel_3_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_4.setFont(new Font("JetBrains Mono Medium", Font.BOLD, 18));
		lblNewLabel_3_4.setBounds(0, 508, 154, 27);
		navbar.add(lblNewLabel_3_4);
		
		txt_mssv = new JTextField();
		txt_mssv.setFont(new Font("JetBrains Mono Medium", Font.PLAIN, 18));
		txt_mssv.setBounds(164, 210, 350, 35);
		navbar.add(txt_mssv);
		txt_mssv.setColumns(10);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("Địa chỉ");
		lblNewLabel_3_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2_1.setFont(new Font("JetBrains Mono Medium", Font.BOLD, 18));
		lblNewLabel_3_2_1.setBounds(0, 383, 154, 27);
		navbar.add(lblNewLabel_3_2_1);
		
		txt_sdt = new JTextField();
		txt_sdt.setFont(new Font("JetBrains Mono Medium", Font.PLAIN, 18));
		txt_sdt.setBackground(new Color(255, 255, 255));
		txt_sdt.setColumns(10);
		txt_sdt.setBounds(164, 453, 350, 35);
		navbar.add(txt_sdt);
		
		txt_diachi = new JTextField();
		txt_diachi.setFont(new Font("JetBrains Mono Medium", Font.PLAIN, 18));
		txt_diachi.setColumns(10);
		txt_diachi.setBounds(164, 351, 350, 90);
		navbar.add(txt_diachi);
		
		txt_hoten = new JTextField();
		txt_hoten.setFont(new Font("JetBrains Mono Medium", Font.PLAIN, 18));
		txt_hoten.setColumns(10);
		txt_hoten.setBounds(164, 257, 350, 35);
		navbar.add(txt_hoten);
		
		txt_namsinh = new JTextField();
		txt_namsinh.setFont(new Font("JetBrains Mono Medium", Font.PLAIN, 18));
		txt_namsinh.setColumns(10);
		txt_namsinh.setBounds(164, 304, 350, 35);
		navbar.add(txt_namsinh);
		
		txt_email = new JTextField();
		txt_email.setFont(new Font("JetBrains Mono Medium", Font.PLAIN, 18));
		txt_email.setColumns(10);
		txt_email.setBounds(164, 504, 350, 35);
		navbar.add(txt_email);
		
		JButton btnNewButton_1 = new JButton("Thêm");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Stt++;
				ThemSinhVien(Stt);
			}
		});
		btnNewButton_1.setFont(new Font("JetBrains Mono Medium", Font.BOLD, 20));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(0, 209, 238));
		btnNewButton_1.setBounds(41, 587, 120, 40);
		navbar.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Xóa");
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.setFont(new Font("JetBrains Mono Medium", Font.BOLD, 20));
		btnNewButton_1_1.setBackground(new Color(255, 0, 0));
		btnNewButton_1_1.setBounds(202, 587, 120, 40);
		navbar.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Sửa");
		btnNewButton_1_2.setForeground(Color.WHITE);
		btnNewButton_1_2.setFont(new Font("JetBrains Mono Medium", Font.BOLD, 20));
		btnNewButton_1_2.setBackground(new Color(0, 255, 64));
		btnNewButton_1_2.setBounds(363, 587, 120, 40);
		navbar.add(btnNewButton_1_2);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1530, 89);
		panel.setBackground(new Color(5, 0, 255));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Quản Lý Sinh Viên");
		lblNewLabel.setFont(new Font("JetBrains Mono ExtraBold", Font.BOLD, 30));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(569, 32, 446, 45);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(523, 88, 990, 673);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		int stt = 0;
		//Thêm cộ dữ liệu
		data.addColumn("STT");
		data.addColumn("Mã sinh viên");
		data.addColumn("Họ và tên");
		data.addColumn("Năm sinh");
		data.addColumn("Số điện thoại");
		data.addColumn("Email");
		data.addColumn("Địa chỉ");
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setEnabled(false);
		scrollPane.setBounds(10, 11, 968, 660);
		panel_1.add(scrollPane);
		
		table = new JTable();
		table.setEnabled(false);
		table.getTableHeader().setReorderingAllowed(false); //Không cho phép di chuyển các cột
		scrollPane.setViewportView(table);
		table.setBorder(new EmptyBorder(0, 0, 0, 0));
		table.setFont(new Font("JetBrains Mono Medium", Font.PLAIN, 16));
		boolean[] columnEditables = new boolean[] {
				false
		};
		table.setModel(data);
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(3).setResizable(false);
		table.getColumnModel().getColumn(4).setResizable(false);
		table.getColumnModel().getColumn(5).setResizable(false);
		table.getColumnModel().getColumn(6).setResizable(false);
		table.getColumnModel().getColumn(0).setPreferredWidth(36);
		table.getColumnModel().getColumn(0).setMaxWidth(968);
		table.getColumnModel().getColumn(1).setPreferredWidth(109);
		table.getColumnModel().getColumn(2).setPreferredWidth(180);
		table.getColumnModel().getColumn(6).setPreferredWidth(200);
	}
	
	// Phương thức để tạo mới một ImageIcon với kích thước mới
	private static ImageIcon createResizedIcon(String path, int width, int height) {
	    URL imgURL = Interface_QLSV.class.getResource(path);
	    if (imgURL != null) {
	        ImageIcon originalIcon = new ImageIcon(imgURL);
	        Image img = originalIcon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
	        return new ImageIcon(img);
	    } else {
	        System.err.println("Couldn't find file: " + path);
	        return null;
	    }
	}
	
	public void ThemSinhVien(int Stt) {
		String hoTen, namSinh,diaChi,email;
		int mssv;
		int Sdt=054634555;
		hoTen = txt_hoten.getText();
		mssv = Integer.parseInt(txt_mssv.getText());
		namSinh = txt_namsinh.getText();
		diaChi = txt_diachi.getText();
		email = txt_email.getText();
		Vector hangX = new Vector<>();
		hangX.add(Stt);
		hangX.add(mssv);
		hangX.add(hoTen);
		hangX.add(namSinh);
		hangX.add(Sdt);
		hangX.add(email);
		hangX.add(diaChi);
		//Them vao bang
		data.addRow(hangX);
		//Cap nhat lai bang
		data.fireTableDataChanged();
		txt_hoten.setText("");
		txt_mssv.setText("");
		txt_namsinh.setText("");
		txt_diachi.setText("");
		txt_email.setText("");
		txt_sdt.setText("");
	}
}
