package Main;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;


import java.util.Scanner;

import javax.swing.JComboBox;

import javax.swing.DefaultComboBoxModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import javax.swing.SwingConstants;
import javax.swing.JToolBar;
import javax.swing.JLayeredPane;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.border.LineBorder;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.AdjustmentListener;
import java.awt.event.AdjustmentEvent;
import javax.swing.JList;
import javax.swing.JInternalFrame;
import javax.swing.ScrollPaneConstants;
import javax.swing.Box;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
 
public class main_windows {

	protected static final String J0ptionPane = null;
	private JFrame frame;
	private JTextField name_text_Field;
	private JPasswordField password_Field;
	private JTextField user_name_text_Field;
	private JTextField user_lastname_text_Field;
	private JTextField username_text_Field;
	private JPasswordField passwordField;
	private JTextField city_text_Field;
	private JTextField country_text_Field;
	private JTextField b_username_text_Field;
	private JPasswordField passwordField_1;
	private JTextField b_city_text_Field;
	private JTextField b_country_text_Field;
	private JTextField b_company_field;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main_windows window = new main_windows();
					window.frame.setVisible(true);
				} catch (Exception e1) {
					System.out.println("Error: " + e1);
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
		frame.setResizable(false);
		frame.setBounds(0,0, 852, 545);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		JPanel Private_User_page = new JPanel();
		JPanel start_page = new JPanel();
		start_page.setBackground(new Color(248, 191, 88));
		frame.getContentPane().add(start_page, "name_830499986510200");
		start_page.setLayout(null);
		JPanel add_food_page = new JPanel();

		JPanel data_analysis_page = new JPanel();
		JPanel sport_activity_page = new JPanel();
		frame.getContentPane().add(sport_activity_page, "name_135054560240100");
		sport_activity_page.setLayout(null);
		
		JButton btnNewButton_3 = new JButton("\u05D7\u05D6\u05E8\u05D4");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Private_User_page.setVisible(true);
				sport_activity_page.setVisible(false);
			}
		});
		btnNewButton_3.setBounds(747, 482, 89, 23);
		sport_activity_page.add(btnNewButton_3);
		
		JPanel set_rdata_page = new JPanel();
		frame.getContentPane().add(set_rdata_page, "name_135834242867900");
		set_rdata_page.setLayout(null);
		JPanel recommend_food_page = new JPanel();
		
		JButton btnNewButton_4 = new JButton("\u05D7\u05D6\u05E8\u05D4");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				set_rdata_page.setVisible(false);
				Private_User_page.setVisible(true);
			}
		});
		btnNewButton_4.setBounds(747, 482, 89, 23);
		set_rdata_page.add(btnNewButton_4);

		JPanel log_in_page = new JPanel();
		log_in_page.setBackground(new Color(42, 200, 125));
		frame.getContentPane().add(log_in_page, "name_830509498735800");
		log_in_page.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u05E9\u05DD \u05DE\u05E9\u05EA\u05DE\u05E9 : ");
		lblNewLabel.setBounds(731, 11, 95, 28);
		log_in_page.add(lblNewLabel);
		JPanel ate_food_page = new JPanel();
		JButton Button_back = new JButton("\u05D7\u05D6\u05E8\u05D4");
		Button_back.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				log_in_page.setVisible(false);
				start_page.setVisible(true);
			}
		});
		Button_back.setBounds(737, 472, 89, 23);
		log_in_page.add(Button_back);
		
		JPanel business_page = new JPanel();
		frame.getContentPane().add(business_page, "name_337916315403200");
		business_page.setLayout(null);
		
		JLabel lblNewLabel_18 = new JLabel("business_page");
		lblNewLabel_18.setFont(new Font("Tahoma", Font.PLAIN, 93));
		lblNewLabel_18.setBounds(72, 71, 717, 355);
		business_page.add(lblNewLabel_18);
		
		
		frame.getContentPane().add(Private_User_page, "name_339221586896400");
		Private_User_page.setLayout(null);
		
		JLabel lblNewLabel_19 = new JLabel("Private_User");
		lblNewLabel_19.setBounds(10, 430, 606, 57);
		lblNewLabel_19.setFont(new Font("Tahoma", Font.PLAIN, 90));
		Private_User_page.add(lblNewLabel_19);
		
		JButton add_new_food_Button = new JButton("");
		add_new_food_Button.setBounds(10, 11, 100, 100);
		add_new_food_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Private_User_page.setVisible(false);
				add_food_page.setVisible(true);
			}
		});
		add_new_food_Button.setBackground(new Color(255, 255, 255));
		add_new_food_Button.setIcon(new ImageIcon("C:\\Users\\oleg1\\Documents\\GitHub\\SWProject\\gif\\159059408251378162.png"));
		Private_User_page.add(add_new_food_Button);
		
		JButton ate_food_Button = new JButton("");
		ate_food_Button.setBounds(10, 124, 100, 100);
		ate_food_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ate_food_page.setVisible(true);
				Private_User_page.setVisible(false);
			}
		});
		ate_food_Button.setBackground(new Color(255, 255, 255));
		ate_food_Button.setIcon(new ImageIcon("C:\\Users\\oleg1\\Documents\\GitHub\\SWProject\\gif\\food_eat.png"));
		Private_User_page.add(ate_food_Button);
		/*add_new_food_Button.setBackground(new Color(135, 206, 250));
		add_new_food_Button.setIcon(new ImageIcon("C:\\Users\\oleg1\\Documents\\GitHub\\SWProject\\gif\\159059408251378162.png"));
		add_new_food_Button.setBounds(10, 11, 100, 100);
		Private_User_page.add(add_new_food_Button);*/
		
		JButton data_Button_4 = new JButton("");
		data_Button_4.setBounds(10, 235, 100, 100);
		data_Button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				data_analysis_page.setVisible(true);
				Private_User_page.setVisible(false);
			}
		});
		data_Button_4.setBackground(new Color(255, 255, 255));
		data_Button_4.setIcon(new ImageIcon("C:\\Users\\oleg1\\Documents\\GitHub\\SWProject\\gif\\data_analysis.png"));
		Private_User_page.add(data_Button_4);
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Private_User_page.setVisible(false);
				set_rdata_page.setVisible(true);
			}
		});
		btnNewButton_6.setBounds(120, 341, 100, 100);
		btnNewButton_6.setBackground(new Color(255, 255, 255));
		btnNewButton_6.setIcon(new ImageIcon("C:\\Users\\oleg1\\Documents\\GitHub\\SWProject\\gif\\imageedit.png"));
		Private_User_page.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("\u05D9\u05E6\u05D9\u05D0");
		btnNewButton_7.setBounds(722, 23, 89, 23);
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Private_User_page.setVisible(false);
				start_page.setVisible(false);
				
			
			}
		});
		Private_User_page.add(btnNewButton_7);
		
		JLabel lblNewLabel_9 = new JLabel(" cal \u05E7\u05DC\u05D5\u05E8\u05D9\u05D5\u05EA");
		lblNewLabel_9.setBounds(140, 27, 113, 14);
		Private_User_page.add(lblNewLabel_9);
		
		JLabel lblNewLabel_20 = new JLabel("\u05E0\u05EA\u05E8\u05D0\u05DFsalt");
		lblNewLabel_20.setBounds(140, 53, 100, 14);
		Private_User_page.add(lblNewLabel_20);
		
		JLabel lblNewLabel_20_1 = new JLabel("\u05D7\u05DC\u05D1\u05D5\u05E0\u05D9\u05DDprot");
		lblNewLabel_20_1.setBounds(140, 83, 100, 14);
		Private_User_page.add(lblNewLabel_20_1);
		
		JLabel lblNewLabel_20_2 = new JLabel("\u05E9\u05D5\u05DE\u05E0\u05D9\u05DD fat");
		lblNewLabel_20_2.setBounds(140, 108, 100, 14);
		Private_User_page.add(lblNewLabel_20_2);
		
		JLabel lblNewLabel_20_3 = new JLabel("\u05E7\u05D5\u05DC\u05E1\u05D8\u05E8\u05D5\u05DC coles");
		lblNewLabel_20_3.setBounds(140, 133, 100, 14);
		Private_User_page.add(lblNewLabel_20_3);
		
		JLabel lblNewLabel_21 = new JLabel("New label");
		lblNewLabel_21.setBounds(395, 430, 416, 14);
		Private_User_page.add(lblNewLabel_21);
		
		JButton sport_Button_3_1 = new JButton("");
		sport_Button_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Private_User_page.setVisible(false);
				sport_activity_page.setVisible(true);
				
			}
		});
		sport_Button_3_1.setBounds(10, 341, 100, 100);
		sport_Button_3_1.setIcon(new ImageIcon("C:\\Users\\oleg1\\Documents\\GitHub\\SWProject\\gif\\add_sport_4.gif"));
		sport_Button_3_1.setBackground(new Color(255, 255, 255));
		Private_User_page.add(sport_Button_3_1);
		
		JButton btnNewButton_3_2 = new JButton("");
		btnNewButton_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Private_User_page.setVisible(false);
				recommend_food_page.setVisible(true);
			}
		});
		btnNewButton_3_2.setBounds(120, 235, 100, 100);
		btnNewButton_3_2.setIcon(new ImageIcon("C:\\Users\\oleg1\\Documents\\GitHub\\SWProject\\gif\\recommend_food_1.png"));	
		btnNewButton_3_2.setBackground(new Color(255, 255, 255));
		Private_User_page.add(btnNewButton_3_2);
		
		
		name_text_Field = new JTextField();
		name_text_Field.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					password_Field.requestFocus();
				}
			}
		});
		name_text_Field.setBounds(513, 11, 208, 28);
		log_in_page.add(name_text_Field);
		name_text_Field.setColumns(10);
		JPanel admin_page = new JPanel();
		JButton login_Button = new JButton("\u05D0\u05D9\u05E9\u05D5\u05E8");
		
		login_Button.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				if (name_text_Field.getText().isEmpty() || password_Field.getText().isEmpty())
				{
				JOptionPane.showMessageDialog(null, "Please Input Username and Password." + "!");
				} else if (name_text_Field.getText().equals("admin") && password_Field.getText().equals("12345")) 
				{
				JOptionPane.showMessageDialog (null, "Admin Login Success" + "!");
				log_in_page.setVisible(false);
				admin_page.setVisible(true);
				
				} else {
					String user_id;
					
					//outFile = new FileWriter ( fileChooser.getSelectedFile()+"\\"+username_text_Field.getText()+".txt");
					 user_id = "C:\\Users\\oleg1\\Documents\\GitHub\\SWProject\\data";
					
		
					File dir = new File (user_id);
					for (File f : dir.listFiles()) 
					{
							if (f.getName ().contains (".txt"))
							{
								if(f.getName ().contains(name_text_Field.getText())) 
								{
									System.out.println(f.getName ());
									if(f.getName ().contains("bus_")) 
									{
										
										String whole=user_id +"/"+ f.getName();
										try
										{
											String readF=new Scanner (new File (whole)).useDelimiter ("\\A").next ();
											String splitHere="\n";
											String[] tokens=readF.split(splitHere);
											if(password_Field.getText().equals(tokens [1]))
											{
												log_in_page.setVisible(false);
												business_page.setVisible(true);
												
											}else 
											{
												JOptionPane.showMessageDialog(null, "Incorrect Password." + "!");
											}
										
										}catch(IOException e1) 
										{
										System.out.println("Error: " + e1);
										}
										
										
									}else
									{
								
									String whole=user_id +"/"+ f.getName();
									try
									{
										String readF=new Scanner (new File (whole)).useDelimiter ("\\A").next ();
										String splitHere="\n";
										String[] tokens=readF.split(splitHere);
										if(password_Field.getText().equals(tokens [1]))
										{
											log_in_page.setVisible(false);
											Private_User_page.setVisible(true);
											
										}else 
										{
											JOptionPane.showMessageDialog(null, "Incorrect Password." + "!");
										}
									
									}catch(IOException e1) 
									{
									System.out.println("Error: " + e1);
									}
								}
								}
							}
					}
			}
			}
			
		});	
			
		
		password_Field = new JPasswordField();
		password_Field.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					login_Button.doClick();
				}
			}
		});
		password_Field.setBounds(513, 56, 208, 28);
		log_in_page.add(password_Field);
		
		
		
		admin_page.setBackground(new Color(8,66,82));
		frame.getContentPane().add(admin_page, "name_830520031415000");
		admin_page.setLayout(null);
		
		JButton login_page_Button = new JButton("login");
		login_page_Button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				admin_page.setVisible(false);
				log_in_page.setVisible(true);
			}
		});
		login_page_Button.setBounds(10, 11, 124, 23);
		admin_page.add(login_page_Button);
		
		JButton main_page_Button = new JButton("main page");
		main_page_Button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				admin_page.setVisible(false);
				start_page.setVisible(true);
			}
		});
		main_page_Button.setBounds(10, 45, 124, 23);
		admin_page.add(main_page_Button);
		
		JLabel lblNewLabel_15 = new JLabel("  ");
		Image bmo = new ImageIcon(this.getClass().getResource("/5aXac9q.gif")).getImage();
		lblNewLabel_15.setIcon (new ImageIcon(bmo));

		lblNewLabel_15.setBounds(318, -57, 632, 459);
		admin_page.add(lblNewLabel_15);
		
		
		
		JLabel lblNewLabel_3 = new JLabel("\u05E1\u05D9\u05E1\u05DE\u05D4 :");
		lblNewLabel_3.setBounds(737, 67, 46, 14);
		log_in_page.add(lblNewLabel_3);
		
		
		login_Button.addMouseListener(new MouseAdapter() {
			@SuppressWarnings({ "deprecation", "resource" })
			@Override
			public void mouseClicked(MouseEvent e) {
				
					if (name_text_Field.getText().isEmpty() || password_Field.getText().isEmpty())
					{
					JOptionPane.showMessageDialog(null, "Please Input Username and Password." + "!");
					} else if (name_text_Field.getText().equals("admin") && password_Field.getText().equals("12345")) 
					{
					JOptionPane.showMessageDialog (null, "Admin Login Success" + "!");
					log_in_page.setVisible(false);
					admin_page.setVisible(true);
					
					} else {
						
						String user_id = "C:\\Users\\oleg1\\Documents\\GitHub\\SWProject\\data";
						File dir = new File (user_id);
						for (File f : dir.listFiles()) 
						{
								if (f.getName ().contains (".txt"))
								{
									if(f.getName ().contains(name_text_Field.getText())) 
									{
										System.out.println(f.getName ());
									
										String whole=user_id +"/"+ f.getName();
										try
										{
											String readF=new Scanner (new File (whole)).useDelimiter ("\\A").next ();
											String splitHere="\n";
											String[] tokens=readF.split(splitHere);
											if(password_Field.getText().equals(tokens [1]))
											{
												log_in_page.setVisible(false);
												admin_page.setVisible(true);
											}else 
											{
												JOptionPane.showMessageDialog(null, "Incorrect Password." + "!");
											}
										
										}catch(IOException e1) 
										{
										System.out.println("Error: " + e1);
										}
									}
								}
						}
				}
			}
		});
		login_Button.setBounds(513, 122, 128, 39);
		log_in_page.add(login_Button);
		
		JLabel lblNewLabel_4 = new JLabel(" ");
		lblNewLabel_4.setBackground(new Color(248, 191, 88));
		Image login = new ImageIcon(this.getClass().getResource("/login-animated-gif-4.gif")).getImage();
		lblNewLabel_4.setIcon (new ImageIcon(login));
		lblNewLabel_4.setBounds(-104, 0, 667, 350);
		log_in_page.add(lblNewLabel_4);
		
		
		
		
		
		JButton Button_page_1 = new JButton("\u05DE\u05D9\u05E9\u05EA\u05DE\u05E9 \u05E9\u05DC\u05D9");
		Button_page_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				start_page.setVisible(false);
				log_in_page.setVisible(true);
				name_text_Field.requestFocus();
				
			}
		});
		Button_page_1.setBounds(10, 11, 118, 23);
		start_page.add(Button_page_1);
		
		JPanel regist_page = new JPanel();
		regist_page.setBackground(new Color(253, 243, 228));
		frame.getContentPane().add(regist_page, "name_830513354330700");
		regist_page.setLayout(null);
		
		JButton Button_page_2 = new JButton("\u05DE\u05D9\u05E9\u05EA\u05DE\u05E9 \u05D7\u05D3\u05E9");
		Button_page_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				start_page.setVisible(false);
				regist_page.setVisible(true);
			}
		});
		Button_page_2.setBounds(10, 45, 118, 23);
		start_page.add(Button_page_2);
		
		JLabel lblNewLabel_2 = new JLabel("  ");
		Image runing = new ImageIcon(this.getClass().getResource("/running_on_empty_eran_mendel_dribbble_gif.gif")).getImage();
		lblNewLabel_2.setIcon (new ImageIcon(runing));
		lblNewLabel_2.setBounds(109, 0, 543, 320);
		start_page.add(lblNewLabel_2);
		
		JButton Button_back2 = new JButton("\u05D7\u05D6\u05E8\u05D4");
		Button_back2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				regist_page.setVisible(false);
				start_page.setVisible(true);
			}
		});
		Button_back2.setBounds(737, 472, 89, 23);
		regist_page.add(Button_back2);
		
		JLabel lblNewLabel_1 = new JLabel(" ");
		Image gender_gif = new ImageIcon(this.getClass().getResource("/Dcku.gif")).getImage();
		lblNewLabel_1.setIcon (new ImageIcon(gender_gif));
		lblNewLabel_1.setBounds(10, 15, 332, 442);
		regist_page.add(lblNewLabel_1);
		
		JLabel lblNewLabel_5 = new JLabel("\u05E9\u05DD:");
		lblNewLabel_5.setBounds(736, 45, 89, 14);
		regist_page.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("\u05E9\u05DD \u05DE\u05E9\u05E4\u05D7\u05D4:");
		lblNewLabel_6.setBounds(736, 76, 89, 14);
		regist_page.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("\u05E9\u05DD \u05DE\u05E9\u05EA\u05DE\u05E9:");
		lblNewLabel_7.setBounds(733, 107, 67, 14);
		regist_page.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("\u05E1\u05D9\u05E1\u05DE\u05D4:");
		lblNewLabel_8.setBounds(733, 138, 70, 14);
		regist_page.add(lblNewLabel_8);
		
		JLabel lblNewLabel_10 = new JLabel("\u05D2\u05D9\u05DC:");
		lblNewLabel_10.setBounds(737, 231, 46, 14);
		regist_page.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("\u05D2\u05D5\u05D1\u05D4:");
		lblNewLabel_11.setBounds(737, 262, 46, 14);
		regist_page.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("\u05DE\u05E9\u05E7\u05DC:");
		lblNewLabel_12.setBounds(737, 293, 46, 14);
		regist_page.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("\u05DE\u05D9\u05DF:");
		lblNewLabel_13.setBounds(737, 324, 46, 14);
		regist_page.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("\u05DE\u05D8\u05E8\u05D4:");
		lblNewLabel_14.setBounds(737, 355, 46, 14);
		regist_page.add(lblNewLabel_14);
		
		user_name_text_Field = new JTextField();
		user_name_text_Field.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					user_lastname_text_Field.requestFocus();
				}
			}
		});
		user_name_text_Field.setBounds(575, 42, 150, 20);
		regist_page.add(user_name_text_Field);
		user_name_text_Field.setColumns(15);
		
		user_lastname_text_Field = new JTextField();
		user_lastname_text_Field.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					username_text_Field.requestFocus();
				}
			}
		});
		user_lastname_text_Field.setBounds(575, 73, 150, 20);
		regist_page.add(user_lastname_text_Field);
		user_lastname_text_Field.setColumns(15);
		
		username_text_Field = new JTextField();
		username_text_Field.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					passwordField.requestFocus();
				}
			}
		});
		username_text_Field.setBounds(575, 104, 150, 20);
		regist_page.add(username_text_Field);
		username_text_Field.setColumns(30);
		
		passwordField = new JPasswordField();
		passwordField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					city_text_Field.requestFocus();
				}
			}
		});
		passwordField.setBounds(575, 135, 150, 20);
		regist_page.add(passwordField);
		
		JButton Button_save = new JButton("\u05E9\u05DE\u05D5\u05E8");
		
		Button_save.setBounds(577, 472, 89, 23);
		regist_page.add(Button_save);
		
		JComboBox Purpose_comboBox = new JComboBox();
		Purpose_comboBox.setToolTipText("...");
		Purpose_comboBox.setModel(new DefaultComboBoxModel(new String[] {"\u05DC\u05E8\u05D3\u05EA \u05D1\u05DE\u05E9\u05E7\u05DC", "\u05DC\u05D4\u05D9\u05E9\u05D0\u05E8 \u05D1\u05D0\u05D5\u05EA\u05D5 \u05DE\u05E9\u05E7\u05DC", "\u05DC\u05E2\u05DC\u05D5\u05EA \u05D1\u05DE\u05E9\u05E7\u05DC"}));
		Purpose_comboBox.setForeground(new Color(0, 0, 0));
		Purpose_comboBox.setMaximumRowCount(3);
		Purpose_comboBox.setBounds(576, 352, 151, 22);
		regist_page.add(Purpose_comboBox);
		Purpose_comboBox.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					Button_save.doClick();
					
				}
			}
		});
		
		JComboBox Gender_comboBox = new JComboBox();
		Gender_comboBox.setToolTipText("...");
		Gender_comboBox.setModel(new DefaultComboBoxModel(new String[] {"\u05D6\u05DB\u05E8", "\u05E0\u05E7\u05D1\u05D4"}));
		Gender_comboBox.setMaximumRowCount(2);
		Gender_comboBox.setBounds(576, 321, 150, 22);
		regist_page.add(Gender_comboBox);
		Gender_comboBox.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					Purpose_comboBox.requestFocus();
					
				}
			}
		});
		
		
		JSpinner weight_spinner = new JSpinner();
		weight_spinner.setModel(new SpinnerNumberModel(1.0, 0.0, 300.0, 1.0));
		weight_spinner.setBounds(576, 290, 151, 20);
		regist_page.add(weight_spinner);
		weight_spinner.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					Gender_comboBox.requestFocus();
					
				}
			}
		});
		
		JSpinner height_spinner = new JSpinner();
		height_spinner.setModel(new SpinnerNumberModel(1.0, 1.0, 300.0, 1.0));
		height_spinner.setBounds(576, 259, 150, 20);
		regist_page.add(height_spinner);
		height_spinner.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					weight_spinner.requestFocus();
					
				}
			}
		});
		
		JSpinner age_spinner = new JSpinner();
		age_spinner.setModel(new SpinnerNumberModel(1.0, 1.0, 120.0, 1.0));
		age_spinner.setBounds(575, 228, 151, 20);
		regist_page.add(age_spinner);
		age_spinner.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					height_spinner.requestFocus();
					
				}
			}
		});
		
		
		
		
		
	

		JLabel lblNewLabel_16 = new JLabel("\u05E2\u05D9\u05E8: ");
		lblNewLabel_16.setBounds(733, 169, 76, 14);
		regist_page.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("\u05DE\u05D3\u05D9\u05E0\u05D4:");
		lblNewLabel_17.setBounds(737, 200, 46, 14);
		regist_page.add(lblNewLabel_17);
		
		city_text_Field = new JTextField();
		city_text_Field.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					country_text_Field.requestFocus();
				}
			}
		});
		
		city_text_Field.setBounds(575, 166, 150, 20);
		regist_page.add(city_text_Field);
		city_text_Field.setColumns(10);
		
		country_text_Field = new JTextField();
		country_text_Field.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					age_spinner.requestFocus();
					
				}
			}
		});
		country_text_Field.setBounds(575, 197, 150, 20);
		regist_page.add(country_text_Field);
		country_text_Field.setColumns(10);
		
		JPanel regist_page_Business = new JPanel();
		regist_page_Business.setBackground(new Color(227, 227, 227));
		
		JButton Button_goto_Business = new JButton("\u05DE\u05E9\u05EA\u05DE\u05E9 \u05E2\u05E1\u05E7\u05D9");
		Button_goto_Business.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				regist_page.setVisible(false);
				regist_page_Business.setVisible(true);
			}
		});
		Button_goto_Business.setBounds(391, 472, 124, 23);
		regist_page.add(Button_goto_Business);
		JLabel label_1=new JLabel();
		label_1.setToolTipText("");
		label_1.setBounds(352, 380, 473, 23);
		regist_page.add(label_1);
		
		Button_save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				if(username_text_Field.getText().isEmpty()||passwordField.getText().isEmpty()||weight_spinner.getValue().equals(1.0)||
						height_spinner.getValue().equals(1.0)||user_name_text_Field.getText().isEmpty()||user_lastname_text_Field.getText().isEmpty()||
						country_text_Field.getText().isEmpty()||city_text_Field.getText().isEmpty()||age_spinner.getValue().equals(1.0))
				{
					JOptionPane.showMessageDialog(null, "You have to fill all" + "!");

					
				}else {
				FileWriter outFile = null;
				
				try {
					
					
					outFile = new FileWriter ("data\\"+username_text_Field.getText()+".txt");
				} catch (IOException e1) {
					System.out.println("Error: " + e1);
				
				}
				BufferedWriter outStream =new BufferedWriter(outFile);
			
				try {
					
					
					outStream.write(username_text_Field.getText()+"\n");
					outStream.write(passwordField.getPassword());
					outStream.write("\n");
					outStream.write(weight_spinner.getValue().toString()+"\n");
					outStream.write(height_spinner.getValue().toString()+"\n");
					outStream.write(user_name_text_Field.getText()+"\n");
					outStream.write(user_lastname_text_Field.getText()+"\n");
					outStream.write(country_text_Field.getText()+"\n");
					outStream.write(city_text_Field.getText()+"\n");
					outStream.write(age_spinner.getValue().toString()+"\n");
					outStream.write(Gender_comboBox.getSelectedIndex()+"\n");
					outStream.write(Purpose_comboBox.getSelectedIndex()+"\n");
					outStream.close ();
				} catch (IOException e1) {
					System.out.println("Error: " + e1);
				}
				
				
				
				
					regist_page.setVisible(false);
					start_page.setVisible(true);
					/*					new Private_User(username_text_Field.getText(),passwordField.getPassword(),
						(double)weight_spinner.getValue(), (double)height_spinner.getValue(), user_name_text_Field.getText(),
						user_lastname_text_Field.getText(),country_text_Field.getText(), city_text_Field.getText(),
						(double)age_spinner.getValue(), Gender_comboBox.getSelectedIndex(),Purpose_comboBox.getSelectedIndex());*/
				}	
			}
		});
		
		Button_save.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				
				if(username_text_Field.getText().isEmpty()||passwordField.getText().isEmpty()||weight_spinner.getValue().equals(1.0)||
						height_spinner.getValue().equals(1.0)||user_name_text_Field.getText().isEmpty()||user_lastname_text_Field.getText().isEmpty()||
						country_text_Field.getText().isEmpty()||city_text_Field.getText().isEmpty()||age_spinner.getValue().equals(1.0))
				{
					JOptionPane.showMessageDialog(null, "You have to fill all" + "!");

					
					
				}else {
				FileWriter outFile = null;
				
				try {
					outFile = new FileWriter ("data\\"+username_text_Field.getText()+".txt");
				} catch (IOException e1) {
					System.out.println("Error: " + e1);
				
				}
				BufferedWriter outStream =new BufferedWriter(outFile);
			
				try {
					
					
					outStream.write(username_text_Field.getText()+"\n");
					outStream.write(passwordField.getPassword());
					outStream.write("\n");
					outStream.write(weight_spinner.getValue().toString()+"\n");
					outStream.write(height_spinner.getValue().toString()+"\n");
					outStream.write(user_name_text_Field.getText()+"\n");
					outStream.write(user_lastname_text_Field.getText()+"\n");
					outStream.write(country_text_Field.getText()+"\n");
					outStream.write(city_text_Field.getText()+"\n");
					outStream.write(age_spinner.getValue().toString()+"\n");
					outStream.write(Gender_comboBox.getSelectedIndex()+"\n");
					outStream.write(Purpose_comboBox.getSelectedIndex()+"\n");
					outStream.close ();
				} catch (IOException e1) {
					System.out.println("Error: " + e1);
				}
				
				
				
				
					regist_page.setVisible(false);
					start_page.setVisible(true);
				}
			}
		});
		
		
		JButton Button_page_2_1  = new JButton("\u05DE\u05D9\u05E9\u05EA\u05DE\u05E9 \u05D7\u05D3\u05E9");
		Button_page_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				admin_page.setVisible(false);
				regist_page.setVisible(true);
			}
		});
		
		
		Button_page_2_1.setBounds(10, 79, 124, 23);
		admin_page.add(Button_page_2_1);
		
		JButton Button_goto_Business_1 = new JButton("\u05DE\u05E9\u05EA\u05DE\u05E9 \u05E2\u05E1\u05E7\u05D9");
		Button_goto_Business_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				admin_page.setVisible(false);
				regist_page_Business.setVisible(true);
			}
		});
		Button_goto_Business_1.setBounds(10, 113, 124, 23);
		admin_page.add(Button_goto_Business_1);
		
		JButton btnNewButton = new JButton("business_page");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				admin_page.setVisible(false);
				business_page.setVisible(true);
				
			}
		});
		btnNewButton.setBounds(10, 150, 124, 23);
		admin_page.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Private_User");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Private_User_page.setVisible(true);
				admin_page.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(10, 184, 124, 23);
		admin_page.add(btnNewButton_1);
		
		
		frame.getContentPane().add(regist_page_Business, "name_269455872836600");
		regist_page_Business.setLayout(null);
		
		b_username_text_Field = new JTextField();
		b_username_text_Field.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					passwordField_1.requestFocus();
					
				}
			}
		});
		b_username_text_Field.setColumns(30);
		b_username_text_Field.setBounds(561, 65, 150, 20);
		regist_page_Business.add(b_username_text_Field);
		
		JLabel lblNewLabel_7_1 = new JLabel("\u05E9\u05DD \u05DE\u05E9\u05EA\u05DE\u05E9:");
		lblNewLabel_7_1.setBounds(719, 68, 67, 14);
		regist_page_Business.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_8_1 = new JLabel("\u05E1\u05D9\u05E1\u05DE\u05D4:");
		lblNewLabel_8_1.setBounds(719, 99, 70, 14);
		regist_page_Business.add(lblNewLabel_8_1);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					b_city_text_Field.requestFocus();
					
				}
			}
		});
		passwordField_1.setBounds(561, 96, 150, 20);
		regist_page_Business.add(passwordField_1);
		
		JLabel lblNewLabel_16_1 = new JLabel("\u05E2\u05D9\u05E8: ");
		lblNewLabel_16_1.setBounds(719, 126, 76, 14);
		regist_page_Business.add(lblNewLabel_16_1);
		
		b_city_text_Field = new JTextField();
		b_city_text_Field.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					b_country_text_Field.requestFocus();
					
				}
			}
		});
		b_city_text_Field.setColumns(10);
		b_city_text_Field.setBounds(561, 124, 150, 20);
		regist_page_Business.add(b_city_text_Field);
		
		JButton b_Button_save = new JButton("\u05E9\u05DE\u05D5\u05E8");
		
		b_country_text_Field = new JTextField();
		b_country_text_Field.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					b_Button_save.doClick();
				}
			}
		});
		b_country_text_Field.setColumns(10);
		b_country_text_Field.setBounds(561, 155, 150, 20);
		regist_page_Business.add(b_country_text_Field);
		
		JLabel lblNewLabel_17_1 = new JLabel("\u05DE\u05D3\u05D9\u05E0\u05D4:");
		lblNewLabel_17_1.setBounds(719, 156, 46, 14);
		regist_page_Business.add(lblNewLabel_17_1);
		
		b_company_field = new JTextField();
		b_company_field.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					b_username_text_Field.requestFocus();
					
				}
			}
		});
		b_company_field.setColumns(15);
		b_company_field.setBounds(561, 34, 150, 20);
		regist_page_Business.add(b_company_field);
		
		JLabel lblNewLabel_6_1 = new JLabel("\u05E9\u05DD \u05D4\u05D7\u05D1\u05E8\u05D4");
		lblNewLabel_6_1.setBounds(722, 37, 89, 14);
		regist_page_Business.add(lblNewLabel_6_1);
		
		JButton Button_back2_1 = new JButton("\u05D7\u05D6\u05E8\u05D4");
		Button_back2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				regist_page_Business.setVisible(false);
				start_page.setVisible(true);
			}
		});
		Button_back2_1.setBounds(722, 472, 89, 23);
		regist_page_Business.add(Button_back2_1);
		
		
		b_Button_save.setBounds(548, 472, 89, 23);
		regist_page_Business.add(b_Button_save);
		
		JLabel business_gif = new JLabel("  ");
		Image busin = new ImageIcon(this.getClass().getResource("/business.gif")).getImage();
		business_gif.setIcon (new ImageIcon(busin));
		
		business_gif.setBounds(-165, -42, 703, 600);
		regist_page_Business.add(business_gif);
		
		
		frame.getContentPane().add(add_food_page, "name_85480630022700");
		add_food_page.setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(532, 39, 152, 20);
		add_food_page.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(532, 68, 152, 20);
		add_food_page.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(532, 99, 152, 20);
		add_food_page.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(532, 130, 152, 20);
		add_food_page.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(532, 161, 152, 20);
		add_food_page.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(532, 192, 152, 20);
		add_food_page.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(532, 223, 152, 20);
		add_food_page.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(532, 254, 152, 20);
		add_food_page.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(532, 285, 152, 20);
		add_food_page.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(532, 316, 152, 20);
		add_food_page.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(532, 345, 152, 20);
		add_food_page.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(532, 376, 152, 20);
		add_food_page.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(532, 407, 152, 20);
		add_food_page.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(532, 438, 152, 20);
		add_food_page.add(textField_14);
		
		JButton btnNewButton_5 = new JButton("\u05E9\u05DE\u05D5\u05E8 ");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_5.setBounds(532, 469, 152, 23);
		add_food_page.add(btnNewButton_5);
		
		JButton btnNewButton_2 = new JButton("\u05D7\u05D6\u05D5\u05E8");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				add_food_page.setVisible(false);
				Private_User_page.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(693, 469, 133, 23);
		add_food_page.add(btnNewButton_2);
		
		JLabel lblNewLabel_22 = new JLabel("New label");
		lblNewLabel_22.setBounds(694, 11, 142, 20);
		add_food_page.add(lblNewLabel_22);
		JRadioButton dro_RadioButton = new JRadioButton("\u05E7\u05D8\u05E0\u05D9\u05D5\u05EA \u05D5\u05DE\u05D0\u05DB\u05DC\u05D9\u05DD \u05D9\u05D1\u05E9\u05D9\u05DD");
		JRadioButton met_RadioButton = new JRadioButton("\u05D1\u05E9\u05E8 \u05D7\u05DC\u05D1 \u05D3\u05D2\u05D9\u05DD");
		JRadioButton junk_RadioButton = new JRadioButton("\u05D7\u05EA\u05D9\u05E4\u05D9\u05DD \u05D5\u05D0\u05DB\u05DC \u05DE\u05E2\u05D9\u05E8");
		JRadioButton fru_RadioButton = new JRadioButton("\u05E4\u05E8\u05D5\u05EA \u05D5\u05D9\u05E8\u05E7\u05D5\u05EA");
		fru_RadioButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dro_RadioButton.setSelected(false);
				met_RadioButton.setSelected(false);
				junk_RadioButton.setSelected(false);
				fru_RadioButton.setSelected(true);
			}
		});
		junk_RadioButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dro_RadioButton.setSelected(false);
				met_RadioButton.setSelected(false);
				junk_RadioButton.setSelected(true);
				fru_RadioButton.setSelected(false);
			}
		});
		met_RadioButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dro_RadioButton.setSelected(false);
				met_RadioButton.setSelected(true);
				junk_RadioButton.setSelected(false);
				fru_RadioButton.setSelected(false);
			}
		});
		dro_RadioButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dro_RadioButton.setSelected(true);
				met_RadioButton.setSelected(false);
				junk_RadioButton.setSelected(false);
				fru_RadioButton.setSelected(false);
			}
		});
		dro_RadioButton.setBounds(532, 10, 152, 23);
		add_food_page.add(dro_RadioButton);
		
			met_RadioButton.setBounds(428, 10, 109, 23);
		add_food_page.add(met_RadioButton);
		
		junk_RadioButton.setBounds(307, 10, 119, 23);
		add_food_page.add(junk_RadioButton);
		
		fru_RadioButton.setBounds(218, 10, 87, 23);
		add_food_page.add(fru_RadioButton);
		
		
		frame.getContentPane().add(ate_food_page, "name_133487254905400");
		
		JButton back_Button_3 = new JButton("\u05D7\u05D6\u05E8\u05D4");
		back_Button_3.setBounds(747, 482, 89, 23);
		back_Button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ate_food_page.setVisible(false);
				Private_User_page.setVisible(true);
			}
		});
		ate_food_page.setLayout(null);
		ate_food_page.add(back_Button_3);
JScrollPane scrollPane = new JScrollPane();
scrollPane.setToolTipText("");
scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
scrollPane.setBounds(10, 11, 826, 138);
ate_food_page.add(scrollPane);
JButton button_food_3 = new JButton("but_3");
button_food_3.setBounds(230, 143, 100, 100);
ate_food_page.add(button_food_3);
JButton button_food_4 = new JButton("but_4");
button_food_4.setBounds(335, 143, 100, 100);
ate_food_page.add(button_food_4);
JButton button_food_5 = new JButton("but_5");
button_food_5.setBounds(440, 143, 100, 100);
ate_food_page.add(button_food_5);
JButton button_food_6 = new JButton("but_6");
button_food_6.setBounds(545, 143, 100, 100);
ate_food_page.add(button_food_6);
JButton button_food_7 = new JButton("but_7");
button_food_7.setBounds(650, 143, 100, 100);
ate_food_page.add(button_food_7);
JButton button_food_8 = new JButton("but_8");
button_food_8.setBounds(755, 143, 100, 100);
ate_food_page.add(button_food_8);
JButton button_food_9 = new JButton("but_9");
button_food_9.setBounds(860, 143, 100, 100);
ate_food_page.add(button_food_9);
JButton button_food_10 = new JButton("but_10");
button_food_10.setBounds(860, 143, 100, 100);
ate_food_page.add(button_food_10);
JButton button_food_2 = new JButton("but_2");
button_food_2.setBounds(127, 143, 100, 100);
ate_food_page.add(button_food_2);

JButton button_food_1 = new JButton("but_1");
button_food_1.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	}
});
button_food_1.setBounds(20, 143, 100, 100);
ate_food_page.add(button_food_1);
		
		
		frame.getContentPane().add(data_analysis_page, "name_134629289762800");
		data_analysis_page.setLayout(null);
		
		JButton back_Button_4 = new JButton("\u05D7\u05D6\u05E8\u05D4");
		back_Button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Private_User_page.setVisible(true);
				data_analysis_page.setVisible(false);
			}
		});
		back_Button_4.setBounds(747, 482, 89, 23);
		data_analysis_page.add(back_Button_4);
		
		
		frame.getContentPane().add(recommend_food_page, "name_145319149516600");
		recommend_food_page.setLayout(null);
		
		JButton btnNewButton_8 = new JButton("\u05D7\u05D6\u05E8\u05D4");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Private_User_page.setVisible(true);
				recommend_food_page.setVisible(false);
			}
		});
		btnNewButton_8.setBounds(747, 482, 89, 23);
		recommend_food_page.add(btnNewButton_8);
		
	
		
		
		
		b_Button_save.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				if(b_city_text_Field.getText().isEmpty()||
						b_country_text_Field.getText().isEmpty()||b_company_field.getText().isEmpty()||
						passwordField_1.getText().isEmpty()||b_username_text_Field.getText().isEmpty()) 
				{
					JOptionPane.showMessageDialog(null, "You have to fill all" + "!");	
				}else {
				
				FileWriter outFile = null;
				
				try {outFile = new FileWriter ("data\\"+"bus_"+b_username_text_Field.getText()+".txt");
				} catch (IOException e1) {
					System.out.println("Error: " + e1);
				
				}
				BufferedWriter outStream =new BufferedWriter(outFile);
			
				try {
					
				
					outStream.write(b_username_text_Field.getText()+"\n");
					outStream.write(passwordField_1.getPassword());
					outStream.write("\n");
					outStream.write(b_company_field.getText()+"\n");
					outStream.write(b_country_text_Field.getText()+"\n");
					outStream.write(b_city_text_Field.getText()+"\n");
					outStream.close ();
				} catch (IOException e1) {
					System.out.println("Error: " + e1);
				}
				
				
				
				
				regist_page_Business.setVisible(false);
					start_page.setVisible(true);

				}
			}
		});
		b_Button_save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				if(b_city_text_Field.getText().isEmpty()||
						b_country_text_Field.getText().isEmpty()||b_company_field.getText().isEmpty()||
						passwordField_1.getText().isEmpty()||b_username_text_Field.getText().isEmpty()) 
				{
					JOptionPane.showMessageDialog(null, "You have to fill all" + "!");	
				}else {
					
					
					
				FileWriter outFile = null;
				
						
				BufferedWriter outStream=null;
				
				try {
					outFile = new FileWriter ("data\\"+"bus_"+b_username_text_Field.getText()+".txt");
				} catch (IOException e1) {
					System.out.println("Error: " + e1);
				
				}
				 outStream =new BufferedWriter(outFile);
			
				try {
					
					
					outStream.write(b_username_text_Field.getText()+"\n");
					outStream.write(passwordField_1.getPassword());
					outStream.write("\n");
					outStream.write(b_company_field.getText()+"\n");
					outStream.write(b_country_text_Field.getText()+"\n");
					outStream.write(b_city_text_Field.getText()+"\n");
					outStream.close ();
				} catch (IOException e1) {
					System.out.println("Error: " + e1);
				}
				
				
				
				
				regist_page_Business.setVisible(false);
					start_page.setVisible(true);
					
				}
			}
		});
		
		
		
		
	}
}
