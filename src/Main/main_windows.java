package Main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import javax.swing.JScrollBar;
import javax.swing.JSeparator;
import javax.swing.JToggleButton;
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.SystemColor;

public class main_windows {

	protected static final String J0ptionPane = null;
	private JFrame frame;
	private JTextField name_text_Field;
	private JPasswordField password_Field;
	private JTextField user_name_text_Field;
	private JTextField user_lastname_text_Field;
	private JTextField username_text_Field;
	private JPasswordField passwordField;
	private JTextField email_text_Field;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main_windows window = new main_windows();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public main_windows() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 852, 545);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel main_page = new JPanel();
		main_page.setBackground(new Color(248, 191, 88));
		frame.getContentPane().add(main_page, "name_830499986510200");
		main_page.setLayout(null);

		JPanel page_1 = new JPanel();
		page_1.setBackground(new Color(42, 200, 125));
		frame.getContentPane().add(page_1, "name_830509498735800");
		page_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u05E9\u05DD \u05DE\u05E9\u05EA\u05DE\u05E9 : ");
		lblNewLabel.setBounds(731, 11, 95, 28);
		page_1.add(lblNewLabel);
		
		JButton Button_back = new JButton("\u05D7\u05D6\u05E8\u05D4");
		Button_back.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				page_1.setVisible(false);
				main_page.setVisible(true);
			}
		});
		Button_back.setBounds(737, 472, 89, 23);
		page_1.add(Button_back);
		
		name_text_Field = new JTextField();
		name_text_Field.setBounds(513, 11, 208, 28);
		page_1.add(name_text_Field);
		name_text_Field.setColumns(10);
		
		
		password_Field = new JPasswordField();
		password_Field.setBounds(513, 56, 208, 28);
		page_1.add(password_Field);
		
		JPanel admin_page = new JPanel();
		admin_page.setBackground(new Color(8,66,82));
		frame.getContentPane().add(admin_page, "name_830520031415000");
		admin_page.setLayout(null);
		
		JButton login_page_Button = new JButton("login");
		login_page_Button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				admin_page.setVisible(false);
				page_1.setVisible(true);
			}
		});
		login_page_Button.setBounds(10, 11, 89, 23);
		admin_page.add(login_page_Button);
		
		JButton main_page_Button = new JButton("main page");
		main_page_Button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				admin_page.setVisible(false);
				main_page.setVisible(true);
			}
		});
		main_page_Button.setBounds(10, 45, 89, 23);
		admin_page.add(main_page_Button);
		
		JLabel lblNewLabel_15 = new JLabel("  ");
		lblNewLabel_15.setIcon(new ImageIcon("C:\\Users\\oleg1\\Documents\\GitHub\\SWProject\\src\\image\\5aXac9q.gif"));
		lblNewLabel_15.setBounds(318, -57, 632, 459);
		admin_page.add(lblNewLabel_15);
		
		JLabel lblNewLabel_3 = new JLabel("\u05E1\u05D9\u05E1\u05DE\u05D4 :");
		lblNewLabel_3.setBounds(737, 67, 46, 14);
		page_1.add(lblNewLabel_3);
		
		JButton login_Button = new JButton("\u05D0\u05D9\u05E9\u05D5\u05E8");
		login_Button.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("deprecation")
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if (name_text_Field.getText().isEmpty() || password_Field.getText().isEmpty())
				{
				JOptionPane.showMessageDialog(null, "Please Input Username and Password." + "!");
				} else if (name_text_Field.getText().equals("admin") && password_Field.getText ().equals("12345")) 
				{
				JOptionPane.showMessageDialog (null, "Admin Login Success" + "!");
				page_1.setVisible(false);
				admin_page.setVisible(true);
				
				} else
				{
				JOptionPane.showMessageDialog(null, "Incorrect Username or Password." + "!");
				}
				
				
			}
		});
		login_Button.setBounds(513, 122, 128, 39);
		page_1.add(login_Button);
		
		JLabel lblNewLabel_4 = new JLabel(" ");
		lblNewLabel_4.setBackground(new Color(248, 191, 88));
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\oleg1\\Documents\\GitHub\\SWProject\\src\\image\\login-animated-gif-4.gif"));
		lblNewLabel_4.setBounds(-104, 0, 667, 350);
		page_1.add(lblNewLabel_4);
		
		
		
		
		
		JButton Button_page_1 = new JButton("\u05DE\u05D9\u05E9\u05EA\u05DE\u05E9 \u05E9\u05DC\u05D9");
		Button_page_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				main_page.setVisible(false);
				page_1.setVisible(true);
				
			}
		});
		Button_page_1.setBounds(10, 11, 118, 23);
		main_page.add(Button_page_1);
		
		JPanel page_2 = new JPanel();
		page_2.setBackground(new Color(253, 243, 228));
		frame.getContentPane().add(page_2, "name_830513354330700");
		page_2.setLayout(null);
		
		JButton Button_page_2 = new JButton("\u05DE\u05D9\u05E9\u05EA\u05DE\u05E9 \u05D7\u05D3\u05E9");
		Button_page_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				main_page.setVisible(false);
				page_2.setVisible(true);
			}
		});
		Button_page_2.setBounds(10, 45, 118, 23);
		main_page.add(Button_page_2);
		
		JLabel lblNewLabel_2 = new JLabel("  ");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\oleg1\\Documents\\GitHub\\SWProject\\src\\image\\running_on_empty_eran_mendel_dribbble_gif.gif"));
		lblNewLabel_2.setBounds(109, 0, 543, 320);
		main_page.add(lblNewLabel_2);
		
		JButton Button_back2 = new JButton("\u05D7\u05D6\u05E8\u05D4");
		Button_back2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				page_2.setVisible(false);
				main_page.setVisible(true);
			}
		});
		Button_back2.setBounds(737, 472, 89, 23);
		page_2.add(Button_back2);
		
		JLabel lblNewLabel_1 = new JLabel(" ");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\oleg1\\Documents\\GitHub\\SWProject\\src\\image\\Dcku.gif"));
		lblNewLabel_1.setBounds(-47, 0, 332, 442);
		page_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_5 = new JLabel("\u05E9\u05DD:");
		lblNewLabel_5.setBounds(737, 105, 89, 14);
		page_2.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("\u05E9\u05DD \u05DE\u05E9\u05E4\u05D7\u05D4:");
		lblNewLabel_6.setBounds(737, 136, 89, 14);
		page_2.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("\u05E9\u05DD \u05DE\u05E9\u05EA\u05DE\u05E9:");
		lblNewLabel_7.setBounds(734, 167, 67, 14);
		page_2.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("\u05E1\u05D9\u05E1\u05DE\u05D4:");
		lblNewLabel_8.setBounds(734, 198, 70, 14);
		page_2.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("\u05D3\u05D5\u05D0\u05E8 \u05D0\u05DC\u05E7\u05D8\u05E8\u05D5\u05E0\u05D9:");
		lblNewLabel_9.setBounds(737, 229, 89, 14);
		page_2.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("\u05D2\u05D9\u05DC:");
		lblNewLabel_10.setBounds(737, 260, 46, 14);
		page_2.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("\u05D2\u05D5\u05D1\u05D4:");
		lblNewLabel_11.setBounds(737, 291, 46, 14);
		page_2.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("\u05DE\u05E9\u05E7\u05DC:");
		lblNewLabel_12.setBounds(737, 322, 46, 14);
		page_2.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("\u05DE\u05D9\u05DF:");
		lblNewLabel_13.setBounds(737, 354, 46, 14);
		page_2.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("\u05DE\u05D8\u05E8\u05D4:");
		lblNewLabel_14.setBounds(737, 389, 46, 14);
		page_2.add(lblNewLabel_14);
		
		user_name_text_Field = new JTextField();
		user_name_text_Field.setBounds(576, 102, 150, 20);
		page_2.add(user_name_text_Field);
		user_name_text_Field.setColumns(15);
		
		user_lastname_text_Field = new JTextField();
		user_lastname_text_Field.setBounds(576, 133, 150, 20);
		page_2.add(user_lastname_text_Field);
		user_lastname_text_Field.setColumns(15);
		
		username_text_Field = new JTextField();
		username_text_Field.setBounds(576, 164, 150, 20);
		page_2.add(username_text_Field);
		username_text_Field.setColumns(30);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(576, 195, 150, 20);
		page_2.add(passwordField);
		
		email_text_Field = new JTextField();
		email_text_Field.setBounds(576, 226, 150, 20);
		page_2.add(email_text_Field);
		email_text_Field.setColumns(50);
		
		JSpinner age_spinner = new JSpinner();
		age_spinner.setModel(new SpinnerNumberModel(1, 1, 120, 1));
		age_spinner.setBounds(575, 257, 151, 20);
		page_2.add(age_spinner);
		
		JSpinner height_spinner = new JSpinner();
		height_spinner.setModel(new SpinnerNumberModel(1, 1, 300, 1));
		height_spinner.setBounds(576, 288, 150, 20);
		page_2.add(height_spinner);
		
		JSpinner weight_spinner = new JSpinner();
		weight_spinner.setModel(new SpinnerNumberModel(1, 0, 300, 1));
		weight_spinner.setBounds(576, 319, 151, 20);
		page_2.add(weight_spinner);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("...");
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\u05DC\u05E8\u05D3\u05EA \u05D1\u05DE\u05E9\u05E7\u05DC", "\u05DC\u05D4\u05D9\u05E9\u05D0\u05E8 \u05D1\u05D0\u05D5\u05EA\u05D5 \u05DE\u05E9\u05E7\u05DC", "\u05DC\u05E2\u05DC\u05D5\u05EA \u05D1\u05DE\u05E9\u05E7\u05DC"}));
		comboBox.setForeground(new Color(0, 0, 0));
		comboBox.setMaximumRowCount(3);
		comboBox.setBounds(576, 385, 151, 22);
		page_2.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setToolTipText("...");
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"\u05D6\u05DB\u05E8", "\u05E0\u05E7\u05D1\u05D4"}));
		comboBox_1.setMaximumRowCount(2);
		comboBox_1.setBounds(576, 350, 150, 22);
		page_2.add(comboBox_1);
		
		JButton btnNewButton = new JButton("\u05E9\u05DE\u05D5\u05E8");
		btnNewButton.setBounds(577, 472, 89, 23);
		page_2.add(btnNewButton);
		
		
		
		
		
	}
}
