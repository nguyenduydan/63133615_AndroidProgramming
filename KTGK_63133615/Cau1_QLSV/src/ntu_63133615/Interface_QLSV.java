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
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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
		
		JButton btn_them = new JButton("Thêm");
		btn_them.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Stt++;
				ThemSinhVien(Stt);
			}
		});
		btn_them.setFont(new Font("JetBrains Mono Medium", Font.BOLD, 20));
		btn_them.setForeground(new Color(255, 255, 255));
		btn_them.setBackground(new Color(0, 209, 238));
		btn_them.setBounds(41, 587, 120, 40);
		navbar.add(btn_them);
		
		JButton btn_del = new JButton("Xóa");
		
		btn_del.setForeground(Color.WHITE);
		btn_del.setFont(new Font("JetBrains Mono Medium", Font.BOLD, 20));
		btn_del.setBackground(new Color(255, 0, 0));
		btn_del.setBounds(202, 587, 120, 40);
		navbar.add(btn_del);
		
		JButton btn_sua = new JButton("Sửa");
		btn_sua.setForeground(Color.WHITE);
		btn_sua.setFont(new Font("JetBrains Mono Medium", Font.BOLD, 20));
		btn_sua.setBackground(new Color(0, 255, 64));
		btn_sua.setBounds(363, 587, 120, 40);
		navbar.add(btn_sua);
		
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
		
		table.addMouseListener((MouseListener) new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		        // Lấy rowIndex từ vị trí của sự kiện click
		        int rowIndex = table.rowAtPoint(e.getPoint());
		        // Kiểm tra nếu người dùng click vào một dòng hợp lệ
		        if (rowIndex < 0) {
		            // Xử lý rowIndex ở đây
		        	JOptionPane.showMessageDialog(null, "Không có dữ liệu", "Lỗi", JOptionPane.ERROR_MESSAGE);
		        }else {
		        	HienThiThongTin(rowIndex);
		        	btn_del.addActionListener(new ActionListener() {
		    			public void actionPerformed(ActionEvent e) {
		    				Stt = Stt -1;
		    				XoaSinhVien(rowIndex);
		    			}
		    		});
		        	btn_sua.addActionListener(new ActionListener() {
		    			public void actionPerformed(ActionEvent e) {
		    				SuaSinhVien(rowIndex);
		    			}
		    		});
		        }
		    }
		});
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
		int Sdt;
		hoTen = txt_hoten.getText();
		mssv = Integer.parseInt(txt_mssv.getText());
		Sdt = Integer.parseInt(txt_sdt.getText());
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
		Reset();
		JOptionPane.showMessageDialog(null, "Thêm dữ liệu thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void XoaSinhVien(int rowIndex) {
		if(rowIndex >= 0 ) {
			data.removeRow(rowIndex);
			data.fireTableDataChanged();
			Reset();
			
			JOptionPane.showMessageDialog(null, "Xóa dữ liệu thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
		}else {
			JOptionPane.showMessageDialog(null, "Không có dữ liệu", "Lỗi", JOptionPane.ERROR_MESSAGE);
			
		}
	}
	
	public void SuaSinhVien(int rowIndex) {
		if(rowIndex >= 0 && rowIndex < data.getRowCount()) {
			String hoTen = txt_hoten.getText();
	        int mssv = Integer.parseInt(txt_mssv.getText());
	        int sdt = Integer.parseInt(txt_sdt.getText());
	        String namSinh = txt_namsinh.getText();
	        String diaChi = txt_diachi.getText();
	        String email = txt_email.getText();
	        // Cập nhật giá trị của hàng được chọn
	        data.setValueAt(mssv, rowIndex, 1); // Cột MSSV
	        data.setValueAt(hoTen, rowIndex, 2); // Cột Họ tên
	        data.setValueAt(namSinh, rowIndex, 3); // Cột Năm sinh
	        data.setValueAt(sdt, rowIndex, 4);
	        data.setValueAt(diaChi, rowIndex, 6); // Cột Địa chỉ
	        data.setValueAt(email, rowIndex, 5); // Cột Email
			
			data.fireTableDataChanged();
			JOptionPane.showMessageDialog(null, "Cập nhật dữ liệu thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
			Reset();
		}else {
			JOptionPane.showMessageDialog(null, "Không có dữ liệu", "Lỗi", JOptionPane.ERROR_MESSAGE);
			
		}
	}
	
	public void HienThiThongTin(int rowIndex) {
		TableModel model = table.getModel();
    	Object mssvValue = model.getValueAt(rowIndex, 1); // Giả sử columnIndex là chỉ số cột của MSSV
	    Object hoTenValue = model.getValueAt(rowIndex, 2);
	    Object namSinhValue = model.getValueAt(rowIndex, 3);
	    Object SDTValue = model.getValueAt(rowIndex, 4);
	    Object emailValue = model.getValueAt(rowIndex, 5);
	    Object diachiValue = model.getValueAt(rowIndex, 6);
	    
	    String mssvString =  String.valueOf(mssvValue);
	    String hoTenString= String.valueOf(hoTenValue);
	    String namSinhString = String.valueOf(namSinhValue);
	    String SDTString = String.valueOf(SDTValue);
	    String emailString = String.valueOf(emailValue);
	    String diachiString = String.valueOf(diachiValue);
	    
    	txt_hoten.setText(hoTenString);
		txt_mssv.setText(mssvString);
		txt_namsinh.setText(namSinhString);
		txt_diachi.setText(diachiString);
		txt_email.setText(emailString);
		txt_sdt.setText(SDTString);
	}
	
	public void Reset() {
		txt_hoten.setText("");
		txt_mssv.setText("");
		txt_namsinh.setText("");
		txt_diachi.setText("");
		txt_email.setText("");
		txt_sdt.setText("");
	}
}
