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
	private JTextField city_text_Field;
	private JTextField country_text_Field;
	private JTextField b_username_text_Field;
	private JPasswordField passwordField_1;
	private JTextField b_email_text_Field;
	private JTextField b_city_text_Field;
	private JTextField b_country_text_Field;
	private JTextField b_company_field;

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
		
		JPanel start_page = new JPanel();
		start_page.setBackground(new Color(248, 191, 88));
		frame.getContentPane().add(start_page, "name_830499986510200");
		start_page.setLayout(null);

		JPanel log_in_page = new JPanel();
		log_in_page.setBackground(new Color(42, 200, 125));
		frame.getContentPane().add(log_in_page, "name_830509498735800");
		log_in_page.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u05E9\u05DD \u05DE\u05E9\u05EA\u05DE\u05E9 : ");
		lblNewLabel.setBounds(731, 11, 95, 28);
		log_in_page.add(lblNewLabel);
		
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
		
		JPanel Private_User = new JPanel();
		frame.getContentPane().add(Private_User, "name_339221586896400");
		Private_User.setLayout(null);
		
		JLabel lblNewLabel_19 = new JLabel("Private_User");
		lblNewLabel_19.setFont(new Font("Tahoma", Font.PLAIN, 90));
		lblNewLabel_19.setBounds(51, 53, 752, 361);
		Private_User.add(lblNewLabel_19);
		
		
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
					
					String user_id = "C:\\Users\\oleg1\\Documents\\GitHub\\SWProject\\data";
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
											Private_User.setVisible(true);
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
		
		JLabel lblNewLabel_9 = new JLabel("\u05D3\u05D5\u05D0\u05E8 \u05D0\u05DC\u05E7\u05D8\u05E8\u05D5\u05E0\u05D9:");
		lblNewLabel_9.setBounds(736, 169, 89, 14);
		regist_page.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("\u05D2\u05D9\u05DC:");
		lblNewLabel_10.setBounds(737, 260, 46, 14);
		regist_page.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("\u05D2\u05D5\u05D1\u05D4:");
		lblNewLabel_11.setBounds(737, 291, 46, 14);
		regist_page.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("\u05DE\u05E9\u05E7\u05DC:");
		lblNewLabel_12.setBounds(737, 322, 46, 14);
		regist_page.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("\u05DE\u05D9\u05DF:");
		lblNewLabel_13.setBounds(737, 354, 46, 14);
		regist_page.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("\u05DE\u05D8\u05E8\u05D4:");
		lblNewLabel_14.setBounds(737, 389, 46, 14);
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
					email_text_Field.requestFocus();
				}
			}
		});
		passwordField.setBounds(575, 135, 150, 20);
		regist_page.add(passwordField);
		
		email_text_Field = new JTextField();
		email_text_Field.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					city_text_Field.requestFocus();
				}
			}
		});
		email_text_Field.setBounds(575, 166, 150, 20);
		regist_page.add(email_text_Field);
		email_text_Field.setColumns(50);
		
		JButton Button_save = new JButton("\u05E9\u05DE\u05D5\u05E8");
		
		Button_save.setBounds(577, 472, 89, 23);
		regist_page.add(Button_save);
		
		JComboBox Purpose_comboBox = new JComboBox();
		Purpose_comboBox.setToolTipText("...");
		Purpose_comboBox.setModel(new DefaultComboBoxModel(new String[] {"\u05DC\u05E8\u05D3\u05EA \u05D1\u05DE\u05E9\u05E7\u05DC", "\u05DC\u05D4\u05D9\u05E9\u05D0\u05E8 \u05D1\u05D0\u05D5\u05EA\u05D5 \u05DE\u05E9\u05E7\u05DC", "\u05DC\u05E2\u05DC\u05D5\u05EA \u05D1\u05DE\u05E9\u05E7\u05DC"}));
		Purpose_comboBox.setForeground(new Color(0, 0, 0));
		Purpose_comboBox.setMaximumRowCount(3);
		Purpose_comboBox.setBounds(576, 385, 151, 22);
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
		Gender_comboBox.setBounds(576, 350, 150, 22);
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
		weight_spinner.setBounds(576, 319, 151, 20);
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
		height_spinner.setBounds(576, 288, 150, 20);
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
		age_spinner.setBounds(575, 257, 151, 20);
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
		lblNewLabel_16.setBounds(737, 204, 76, 14);
		regist_page.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("\u05DE\u05D3\u05D9\u05E0\u05D4:");
		lblNewLabel_17.setBounds(737, 229, 46, 14);
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
		
		city_text_Field.setBounds(575, 197, 150, 20);
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
		country_text_Field.setBounds(575, 226, 150, 20);
		regist_page.add(country_text_Field);
		country_text_Field.setColumns(10);
		
		JPanel regist_page_Business = new JPanel();
		
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
		
		Button_save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				
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
					outStream.write(email_text_Field.getText()+"\n");
					outStream.write(Purpose_comboBox.getSelectedIndex()+"\n");
					outStream.close ();
				} catch (IOException e1) {
					System.out.println("Error: " + e);
				}
				
				
				
				
					regist_page.setVisible(false);
					start_page.setVisible(true);
				new Private_User(username_text_Field.getText(),passwordField.getPassword(),
						(double)weight_spinner.getValue(), (double)height_spinner.getValue(), user_name_text_Field.getText(),
						user_lastname_text_Field.getText(),country_text_Field.getText(), city_text_Field.getText(),
						(double)age_spinner.getValue(), Gender_comboBox.getSelectedIndex(), email_text_Field.getText(),Purpose_comboBox.getSelectedIndex());
				
			}
		});
		
		Button_save.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				
				
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
					outStream.write(email_text_Field.getText()+"\n");
					outStream.write(Purpose_comboBox.getSelectedIndex()+"\n");
					outStream.close ();
				} catch (IOException e1) {
					System.out.println("Error: " + e);
				}
				
				
				
				
					regist_page.setVisible(false);
					start_page.setVisible(true);
				new Private_User(username_text_Field.getText(),passwordField.getPassword(),
						(double)weight_spinner.getValue(), (double)height_spinner.getValue(), user_name_text_Field.getText(),
						user_lastname_text_Field.getText(),country_text_Field.getText(), city_text_Field.getText(),
						(double)age_spinner.getValue(), Gender_comboBox.getSelectedIndex(), email_text_Field.getText(),Purpose_comboBox.getSelectedIndex());
				
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
					b_email_text_Field.requestFocus();
					
				}
			}
		});
		passwordField_1.setBounds(561, 96, 150, 20);
		regist_page_Business.add(passwordField_1);
		
		b_email_text_Field = new JTextField();
		b_email_text_Field.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					b_city_text_Field.requestFocus();
					
				}
			}
		});
		b_email_text_Field.setColumns(50);
		b_email_text_Field.setBounds(561, 127, 150, 20);
		regist_page_Business.add(b_email_text_Field);
		
		JLabel lblNewLabel_9_1 = new JLabel("\u05D3\u05D5\u05D0\u05E8 \u05D0\u05DC\u05E7\u05D8\u05E8\u05D5\u05E0\u05D9:");
		lblNewLabel_9_1.setBounds(722, 130, 89, 14);
		regist_page_Business.add(lblNewLabel_9_1);
		
		JLabel lblNewLabel_16_1 = new JLabel("\u05E2\u05D9\u05E8: ");
		lblNewLabel_16_1.setBounds(723, 165, 76, 14);
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
		b_city_text_Field.setBounds(561, 158, 150, 20);
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
		b_country_text_Field.setBounds(561, 187, 150, 20);
		regist_page_Business.add(b_country_text_Field);
		
		JLabel lblNewLabel_17_1 = new JLabel("\u05DE\u05D3\u05D9\u05E0\u05D4:");
		lblNewLabel_17_1.setBounds(723, 190, 46, 14);
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
		
		
		b_Button_save.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				
				
				FileWriter outFile = null;
				
				try {
					
					outFile = new FileWriter ("data\\"+"bus_"+b_username_text_Field.getText()+".txt");
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
					outStream.write(b_email_text_Field.getText()+"\n");
					outStream.close ();
				} catch (IOException e1) {
					System.out.println("Error: " + e);
				}
				
				
				
				
				regist_page_Business.setVisible(false);
					start_page.setVisible(true);
					
				new Bus_User(b_username_text_Field.getText(),passwordField_1.getPassword(),b_company_field.getText());
				
			}
		});
		b_Button_save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				


				
				FileWriter outFile = null;
				
				try {
					
					outFile = new FileWriter ("data\\"+"bus_"+b_username_text_Field.getText()+".txt");
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
					outStream.write(b_email_text_Field.getText()+"\n");
					outStream.close ();
				} catch (IOException e1) {
					System.out.println("Error: " + e);
				}
				
				
				
				
				regist_page_Business.setVisible(false);
					start_page.setVisible(true);
					
				new Bus_User(b_username_text_Field.getText(),passwordField_1.getPassword(),b_company_field.getText());
				
			}
		});
		
		
		
		
	}
}
