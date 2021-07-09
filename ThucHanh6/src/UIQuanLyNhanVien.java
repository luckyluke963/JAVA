import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import java.awt.Panel;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.DropMode;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.ListSelectionModel;

public class UIQuanLyNhanVien extends JFrame {

	private JPanel contentPane;
	private JTextField MaSinhVien;
	private JTextField TenSinhVien;
	private JTextField NamSinh;
	private JTextField NgayVaoLam;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIQuanLyNhanVien frame = new UIQuanLyNhanVien();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void  add() {
		MaSinhVien.setText("");
		TenSinhVien.setText("");
		NamSinh.setText("");
		NgayVaoLam.setText("");
		
	}
	/**
	 * Create the frame.
	 */
	public UIQuanLyNhanVien() {
		setTitle("Quản Lý Sinh Viên");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 547, 381);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Chọn Phòng Ban");
		lblNewLabel.setBounds(142, 11, 101, 14);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Phòng Tổ Chức", "Phòng Kinh Doanh", "Phòng Giao Dịch", "Phòng Bảo Vệ"}));
		comboBox.setBounds(244, 7, 152, 22);
		contentPane.add(comboBox);
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Th\u00F4ng tin chi ti\u1EBFt", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(176, 40, 328, 236);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Mã Sinh Viên");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(22, 21, 73, 14);
		panel_1.add(lblNewLabel_1);
		
		MaSinhVien = new JTextField();
		MaSinhVien.setBounds(10, 38, 287, 20);
		panel_1.add(MaSinhVien);
		MaSinhVien.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Tên Nhân Viên");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(22, 69, 125, 14);
		panel_1.add(lblNewLabel_2);
		
		TenSinhVien = new JTextField();
		TenSinhVien.setBounds(10, 83, 287, 20);
		panel_1.add(TenSinhVien);
		TenSinhVien.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Năm Sinh");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(20, 125, 98, 14);
		panel_1.add(lblNewLabel_3);
		
		NamSinh = new JTextField();
		NamSinh.setBounds(10, 142, 287, 20);
		panel_1.add(NamSinh);
		NamSinh.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Ngày Vào Làm");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(22, 183, 96, 14);
		panel_1.add(lblNewLabel_4);
		
		NgayVaoLam = new JTextField();
		NgayVaoLam.setBounds(10, 198, 287, 20);
		panel_1.add(NgayVaoLam);
		NgayVaoLam.setColumns(10);
		
		JButton btnNewButton = new JButton("Thoát");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setBounds(444, 287, 77, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Xóa");
		btnNewButton_1.setBounds(363, 287, 69, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Lưu");
		btnNewButton_2.setBounds(294, 287, 59, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Thêm");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_3.setBounds(215, 287, 69, 23);
		contentPane.add(btnNewButton_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(20, 53, 122, 214);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBorder(new TitledBorder(null, "Danh S\u00E1ch Sinh Vi\u00EAn", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panel.setBounds(10, 36, 144, 240);
		contentPane.add(panel);
		
		JList list = new JList();
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		panel.add(list);
	}
}
