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
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

import java.util.Hashtable;
import java.util.Scanner;
import java.util.function.DoubleUnaryOperator;

import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JSlider;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JScrollBar;
import java.awt.event.AdjustmentListener;
import java.awt.event.AdjustmentEvent;
 
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
	private JTextField food_name_text_Field;
	Product prod=new Product(false);
	Private_User use =null;
	private JTextField name_set_textField;
	private JTextField lastname_set_textField;
	private JTextField username_set_textField;
	private JPasswordField passwordField_set;
	private JTextField city_set_textField;
	private JTextField country_set_textField;
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
		JSpinner weight_spinner = new JSpinner();
		JPanel data_analysis_page = new JPanel();
		JPanel sport_activity_page = new JPanel();
		frame.getContentPane().add(sport_activity_page, "name_135054560240100");
		JSpinner height_spinner = new JSpinner();
		JSpinner age_spinner = new JSpinner();
		JComboBox Gender_comboBox = new JComboBox();
		JComboBox Purpose_comboBox = new JComboBox();
		
		
		
		
		JButton btnNewButton_10 = new JButton("\u05DE\u05E1 \u05E6\u05E2\u05D3\u05D9\u05DD");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JSlider stepss =new JSlider(0,1000,100);
				stepss.setValue(0);
				JFrame parent = new JFrame();
				 JOptionPane optionPane = new JOptionPane();
				 stepss.setMajorTickSpacing(100);
				 stepss.setMinorTickSpacing(50);
				 stepss.setPaintTicks(true);
				 stepss.setPaintLabels(true);
		         
				// Add positions label in the slider
				Hashtable position1 = new Hashtable();
				position1.put(0, new JLabel("0"));
				position1.put(100, new JLabel("100"));
				position1.put(200, new JLabel("200"));
				position1.put(300, new JLabel("300"));
				position1.put(400, new JLabel("400"));
				position1.put(500, new JLabel("500"));
				position1.put(600, new JLabel("600"));
				position1.put(700, new JLabel("700"));
				position1.put(800, new JLabel("800"));
				position1.put(900, new JLabel("900"));
				position1.put(1000, new JLabel("1000"));
				
				         
				// Set the label to be drawn
				stepss.setLabelTable(position1);
				    optionPane.setMessage(new Object[] { "Select a value: ", stepss });
				    optionPane.setMessageType(JOptionPane.QUESTION_MESSAGE);
				    optionPane.setOptionType(JOptionPane.OK_CANCEL_OPTION);
				    JDialog dialog = optionPane.createDialog(parent,"\u05DE\u05E1 \u05E6\u05E2\u05D3\u05D9\u05DD");
				    dialog.setSize(500, 300);
				    dialog.setVisible(true);
				  //  System.out.println(stepss.getValue());
				    use.Activity(stepss.getValue());
				
			}
		});
		btnNewButton_10.setBounds(10, 11, 100, 100);
		sport_activity_page.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("\u05E7\u05DC\u05E8\u05D9\u05D5\u05EA");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JSlider stepss =new JSlider(0,1000,100);
				stepss.setValue(0);
				JFrame parent = new JFrame();
				 JOptionPane optionPane = new JOptionPane();
				 stepss.setMajorTickSpacing(100);
				 stepss.setMinorTickSpacing(50);
				 stepss.setPaintTicks(true);
				 stepss.setPaintLabels(true);
		         
				// Add positions label in the slider
				Hashtable position1 = new Hashtable();
				position1.put(0, new JLabel("0"));
				position1.put(100, new JLabel("100"));
				position1.put(200, new JLabel("200"));
				position1.put(300, new JLabel("300"));
				position1.put(400, new JLabel("400"));
				position1.put(500, new JLabel("500"));
				position1.put(600, new JLabel("600"));
				position1.put(700, new JLabel("700"));
				position1.put(800, new JLabel("800"));
				position1.put(900, new JLabel("900"));
				position1.put(1000, new JLabel("1000"));
				
				         
				// Set the label to be drawn
				stepss.setLabelTable(position1);
				    optionPane.setMessage(new Object[] { "Select a value: ", stepss });
				    optionPane.setMessageType(JOptionPane.QUESTION_MESSAGE);
				    optionPane.setOptionType(JOptionPane.OK_CANCEL_OPTION);
				    JDialog dialog = optionPane.createDialog(parent,"\u05E7\u05DC\u05E8\u05D9\u05D5\u05EA");
				    dialog.setSize(500, 300);
				    dialog.setVisible(true);
				    //System.out.println(stepss.getValue());
				    use.Burned_Calories(Double.valueOf(stepss.getValue()));
				
				
			}
		});
		btnNewButton_11.setBounds(118, 11, 100, 100);
		sport_activity_page.add(btnNewButton_11);
		
		JPanel set_rdata_page = new JPanel();
		frame.getContentPane().add(set_rdata_page, "name_135834242867900");
		JPanel recommend_food_page = new JPanel();
		
		JButton btnNewButton_4 = new JButton("\u05D7\u05D6\u05E8\u05D4");
		btnNewButton_4.setBounds(747, 482, 89, 23);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				set_rdata_page.setVisible(false);
				Private_User_page.setVisible(true);
			}
		});
		set_rdata_page.setLayout(null);
		set_rdata_page.add(btnNewButton_4);
		
		name_set_textField = new JTextField();
		name_set_textField.setColumns(15);
		name_set_textField.setBounds(586, 11, 150, 20);
		set_rdata_page.add(name_set_textField);
		
		JLabel label = new JLabel("\u05E9\u05DD:");
		label.setBounds(747, 14, 89, 14);
		set_rdata_page.add(label);
		
		lastname_set_textField = new JTextField();
		lastname_set_textField.setColumns(15);
		lastname_set_textField.setBounds(586, 42, 150, 20);
		set_rdata_page.add(lastname_set_textField);
		
		JLabel label_2 = new JLabel("\u05E9\u05DD \u05DE\u05E9\u05E4\u05D7\u05D4:");
		label_2.setBounds(747, 45, 89, 14);
		set_rdata_page.add(label_2);
		
		username_set_textField = new JTextField();
		username_set_textField.setColumns(30);
		username_set_textField.setBounds(586, 73, 150, 20);
		set_rdata_page.add(username_set_textField);
		
		JLabel label_3 = new JLabel("\u05E9\u05DD \u05DE\u05E9\u05EA\u05DE\u05E9:");
		label_3.setBounds(744, 76, 67, 14);
		set_rdata_page.add(label_3);
		
		passwordField_set = new JPasswordField();
		passwordField_set.setBounds(586, 104, 150, 20);
		set_rdata_page.add(passwordField_set);
		
		JLabel label_4 = new JLabel("\u05E1\u05D9\u05E1\u05DE\u05D4:");
		label_4.setBounds(744, 107, 70, 14);
		set_rdata_page.add(label_4);
		
		city_set_textField = new JTextField();
		city_set_textField.setColumns(10);
		city_set_textField.setBounds(586, 135, 150, 20);
		set_rdata_page.add(city_set_textField);
		
		JLabel label_5 = new JLabel("\u05E2\u05D9\u05E8: ");
		label_5.setBounds(744, 138, 76, 14);
		set_rdata_page.add(label_5);
		
		country_set_textField = new JTextField();
		country_set_textField.setColumns(10);
		country_set_textField.setBounds(586, 166, 150, 20);
		set_rdata_page.add(country_set_textField);
		
		JLabel label_6 = new JLabel("\u05DE\u05D3\u05D9\u05E0\u05D4:");
		label_6.setBounds(748, 169, 46, 14);
		set_rdata_page.add(label_6);
		
		JSpinner age_set_spinner = new JSpinner();
		age_set_spinner.setBounds(586, 197, 151, 20);
		set_rdata_page.add(age_set_spinner);
		
		JLabel label_7 = new JLabel("\u05D2\u05D9\u05DC:");
		label_7.setBounds(748, 200, 46, 14);
		set_rdata_page.add(label_7);
		
		JSpinner height_set_spinner = new JSpinner();
		height_set_spinner.setBounds(586, 228, 150, 20);
		set_rdata_page.add(height_set_spinner);
		
		JLabel label_8 = new JLabel("\u05D2\u05D5\u05D1\u05D4:");
		label_8.setBounds(748, 231, 46, 14);
		set_rdata_page.add(label_8);
		
		JSpinner weight_set_spinner = new JSpinner();
		weight_set_spinner.setBounds(587, 259, 151, 20);
		set_rdata_page.add(weight_set_spinner);
		
		JLabel label_9 = new JLabel("\u05DE\u05E9\u05E7\u05DC:");
		label_9.setBounds(748, 262, 46, 14);
		set_rdata_page.add(label_9);
		
		JComboBox gend_set_comboBox = new JComboBox();
		gend_set_comboBox.setModel(new DefaultComboBoxModel(new String[] {"\u05D6\u05DB\u05E8", "\u05E0\u05E7\u05D1\u05D4"}));
		gend_set_comboBox.setToolTipText("...");
		gend_set_comboBox.setMaximumRowCount(2);
		gend_set_comboBox.setBounds(587, 290, 150, 22);
		set_rdata_page.add(gend_set_comboBox);
		
		JLabel label_10 = new JLabel("\u05DE\u05D9\u05DF:");
		label_10.setBounds(748, 293, 46, 14);
		set_rdata_page.add(label_10);
		
		JComboBox Purpose_set_comboBox = new JComboBox();
		Purpose_set_comboBox.setModel(new DefaultComboBoxModel(new String[] {"\u05DC\u05E8\u05D3\u05EA \u05D1\u05DE\u05E9\u05E7\u05DC", "\u05DC\u05D4\u05D9\u05E9\u05D0\u05E8 \u05D1\u05D0\u05D5\u05EA\u05D5 \u05DE\u05E9\u05E7\u05DC", "\u05DC\u05E2\u05DC\u05D5\u05EA \u05D1\u05DE\u05E9\u05E7\u05DC"}));
		Purpose_set_comboBox.setToolTipText("...");
		Purpose_set_comboBox.setMaximumRowCount(3);
		Purpose_set_comboBox.setForeground(Color.BLACK);
		Purpose_set_comboBox.setBounds(587, 321, 151, 22);
		set_rdata_page.add(Purpose_set_comboBox);
		
		JLabel label_11 = new JLabel("\u05DE\u05D8\u05E8\u05D4:");
		label_11.setBounds(748, 324, 46, 14);
		set_rdata_page.add(label_11);
		
		JButton btnNewButton_12 = new JButton("\u05E9\u05DE\u05D5\u05E8");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				if(username_set_textField.getText().isEmpty()||passwordField_set.getText().isEmpty()||weight_set_spinner.getValue().equals(1.0)||
						height_set_spinner.getValue().equals(1.0)||name_set_textField.getText().isEmpty()||lastname_set_textField.getText().isEmpty()||
						country_set_textField.getText().isEmpty()||city_set_textField.getText().isEmpty()||age_set_spinner.getValue().equals(1.0))
				{
					JOptionPane.showMessageDialog(null, "You have to fill all" + "!");

					
				}else {
					File file =new File("C:\\data");
					file.mkdirs();
					
				FileWriter outFile = null;
				
				try {
					
					
					outFile = new FileWriter ("C:\\data"+"\\"+username_set_textField.getText()+".txt");
				} catch (IOException e1) {
					System.out.println("Error: " + e1);
				
				}
				BufferedWriter outStream =new BufferedWriter(outFile);
			
				try {
					
					
					outStream.write(username_set_textField.getText()+"\n");
					outStream.write(passwordField_set.getPassword());
					outStream.write("\n");
					outStream.write(weight_set_spinner.getValue().toString()+"\n");
					outStream.write(height_set_spinner.getValue().toString()+"\n");
					outStream.write(name_set_textField.getText()+"\n");
					outStream.write(lastname_set_textField.getText()+"\n");
					outStream.write(country_set_textField.getText()+"\n");
					outStream.write(city_set_textField.getText()+"\n");
					outStream.write(age_set_spinner.getValue().toString()+"\n");
					outStream.write(gend_set_comboBox.getSelectedIndex()+"\n");
					outStream.write(Purpose_set_comboBox.getSelectedIndex()+"\n");
					outStream.close ();
				} catch (IOException e1) {
					System.out.println("Error: " + e1);
				}
				
				
				
					set_rdata_page.setVisible(false);
					Private_User_page.setVisible(true);
	
				}	
				
			}
		});
		btnNewButton_12.setBounds(634, 482, 89, 23);
		set_rdata_page.add(btnNewButton_12);

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
				name_text_Field.setText("");
				password_Field.setText("");
			}
		});
		Button_back.setBounds(737, 472, 89, 23);
		log_in_page.add(Button_back);
		
		JPanel business_page = new JPanel();
		frame.getContentPane().add(business_page, "name_337916315403200");
		business_page.setLayout(null);
		
		JLabel lblNewLabel_18 = new JLabel("business_page");
		lblNewLabel_18.setBounds(72, 71, 717, 355);
		lblNewLabel_18.setFont(new Font("Tahoma", Font.PLAIN, 93));
		business_page.add(lblNewLabel_18);
		
		JButton btnNewButton_5 = new JButton("\u05D9\u05E6\u05D9\u05D0");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			business_page.setVisible(false);
			log_in_page.setVisible(true);
			}
		});
		btnNewButton_5.setBounds(747, 11, 89, 23);
		business_page.add(btnNewButton_5);
		
		
		frame.getContentPane().add(Private_User_page, "name_339221586896400");
		Private_User_page.setLayout(null);
		JSpinner cal_spinner = new JSpinner();
		cal_spinner.setBounds(638, 99, 46, 20);
		JRadioButton dro_RadioButton = new JRadioButton("\u05E7\u05D8\u05E0\u05D9\u05D5\u05EA \u05D5\u05DE\u05D0\u05DB\u05DC\u05D9\u05DD \u05D9\u05D1\u05E9\u05D9\u05DD");
		dro_RadioButton.setBounds(532, 69, 152, 23);
		JRadioButton met_RadioButton = new JRadioButton("\u05D1\u05E9\u05E8 \u05D7\u05DC\u05D1 \u05D3\u05D2\u05D9\u05DD");
		met_RadioButton.setBounds(428, 69, 109, 23);
		JRadioButton junk_RadioButton = new JRadioButton("\u05D7\u05EA\u05D9\u05E4\u05D9\u05DD \u05D5\u05D0\u05DB\u05DC \u05DE\u05E2\u05D9\u05E8");
		junk_RadioButton.setBounds(307, 69, 119, 23);
		JRadioButton fru_RadioButton = new JRadioButton("\u05E4\u05E8\u05D5\u05EA \u05D5\u05D9\u05E8\u05E7\u05D5\u05EA");
		fru_RadioButton.setBounds(218, 69, 87, 23);
		
		JButton add_new_food_Button = new JButton("");
		add_new_food_Button.setToolTipText("\u05DC\u05D0\u05E9\u05D9\u05E3 \u05DE\u05D5\u05E6\u05E8\u05D9\u05DD \u05D7\u05D3\u05E9\u05D9\u05DD");
		add_new_food_Button.setBounds(10, 11, 100, 100);
		
		add_new_food_Button.setBackground(new Color(255, 255, 255));
		Image foo1= new ImageIcon(this.getClass().getResource("/159059408251378162.png")).getImage();
		add_new_food_Button.setIcon(new ImageIcon(foo1));
		Private_User_page.add(add_new_food_Button);
		
		JButton ate_food_Button = new JButton("");
		ate_food_Button.setToolTipText("\u05EA\u05D0\u05D5\u05D3 \u05DE \u05D4\u05D0\u05D7\u05DC\u05EA\u05D9 \u05D4\u05D9\u05D5\u05DD");
		ate_food_Button.setBounds(10, 124, 100, 100);
		ate_food_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ate_food_page.setVisible(true);
				Private_User_page.setVisible(false);
			}
		});
		ate_food_Button.setBackground(new Color(255, 255, 255));
		Image foo= new ImageIcon(this.getClass().getResource("/food_eat.png")).getImage();
		ate_food_Button.setIcon(new ImageIcon(foo));
		Private_User_page.add(ate_food_Button);
		/*add_new_food_Button.setBackground(new Color(135, 206, 250));
		add_new_food_Button.setIcon(new ImageIcon("C:\\Users\\oleg1\\Documents\\GitHub\\SWProject\\gif\\159059408251378162.png"));
		add_new_food_Button.setBounds(10, 11, 100, 100);
		Private_User_page.add(add_new_food_Button);*/
		
		
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.setToolTipText("\u05DC\u05E9\u05E0\u05D9\u05D5\u05EA \u05D0\u05EA \u05D4\u05E4\u05E8\u05D8\u05D9\u05DD \u05E9\u05DC\u05D9");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Private_User_page.setVisible(false);
				
				
				name_set_textField.setText(use.Get_fname());
				lastname_set_textField.setText(use.Get_lname());
				username_set_textField.setText(use.Get_Username());
				passwordField_set.setText(use.Get_Password());
				city_set_textField.setText(use.Get_City());
				country_set_textField.setText(use.Get_Country());
				age_set_spinner.setValue(use.Get_Age());
				height_set_spinner.setValue(use.Get_Hei());
				weight_set_spinner.setValue(use.Get_Weig());
				gend_set_comboBox.setSelectedIndex(use.Get_gender());
				Purpose_set_comboBox.setSelectedIndex(use.Get_Path());
				
				
				
				
				
				
				
				set_rdata_page.setVisible(true);
			}
		});
		btnNewButton_6.setBounds(120, 341, 100, 100);
		btnNewButton_6.setBackground(new Color(255, 255, 255));
		Image ima = new ImageIcon(this.getClass().getResource("/imageedit.png")).getImage();
		btnNewButton_6.setIcon(new ImageIcon(ima));
		Private_User_page.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("\u05D9\u05E6\u05D9\u05D0");
		btnNewButton_7.setBounds(722, 23, 89, 23);
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Private_User_page.setVisible(false);
				start_page.setVisible(false);
				name_text_Field.setText("");
				password_Field.setText("");
				
			
			}
		});
		Private_User_page.add(btnNewButton_7);
		
		JLabel lblNewLabel_9 = new JLabel(   "\u05E7\u05DC\u05D5\u05E8\u05D9\u05D5\u05EA: " +0 );
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_9.setBounds(140, 27, 110, 14);
		Private_User_page.add(lblNewLabel_9);
		
		JLabel lblNewLabel_20 = new JLabel("\u05E0\u05EA\u05E8\u05D0\u05DF: "+0);
		lblNewLabel_20.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_20.setBounds(140, 53, 110, 14);
		Private_User_page.add(lblNewLabel_20);
		
		JLabel lblNewLabel_20_1 = new JLabel("\u05D7\u05DC\u05D1\u05D5\u05E0\u05D9\u05DD: "+0);
		lblNewLabel_20_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_20_1.setBounds(140, 83, 110, 14);
		Private_User_page.add(lblNewLabel_20_1);
		
		JLabel lblNewLabel_20_2 = new JLabel("\u05E9\u05D5\u05DE\u05E0\u05D9\u05DD: "+0);
		lblNewLabel_20_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_20_2.setBounds(140, 108, 110, 14);
		Private_User_page.add(lblNewLabel_20_2);
		
		JLabel lblNewLabel_20_3 = new JLabel("\u05E7\u05D5\u05DC\u05E1\u05D8\u05E8\u05D5\u05DC: "+0);
		lblNewLabel_20_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_20_3.setBounds(140, 133, 110, 14);
		Private_User_page.add(lblNewLabel_20_3);
		
		
		
		JButton sport_Button_3_1 = new JButton("");
		sport_Button_3_1.setToolTipText("\u05DC\u05D0\u05E9\u05D9\u05E3 \u05D0\u05EA \u05D4\u05E4\u05D9\u05DC\u05D5\u05EA \u05D4\u05D2\u05D5\u05E4\u05E0\u05D9\u05EA \u05D4\u05D9\u05D5\u05DD");
		sport_Button_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Private_User_page.setVisible(false);
				sport_activity_page.setVisible(true);
				
			}
		});
		sport_Button_3_1.setBounds(10, 341, 100, 100);
		Image spo = new ImageIcon(this.getClass().getResource("/add_sport_4.gif")).getImage();
		sport_Button_3_1.setIcon(new ImageIcon(spo));
		sport_Button_3_1.setBackground(new Color(255, 255, 255));
		Private_User_page.add(sport_Button_3_1);
		
		JButton btnNewButton_3_2 = new JButton("");
		btnNewButton_3_2.setToolTipText("\u05D0\u05DE\u05DC\u05E6\u05D5\u05EA \u05DC\u05DE\u05D5\u05E6\u05E8\u05D9\u05DD \u05D9\u05D5\u05EA\u05E8 \u05EA\u05D5\u05D1\u05D9\u05DD \u05D0\u05D1\u05D5\u05E8\u05D9");
		btnNewButton_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Private_User_page.setVisible(false);
				recommend_food_page.setVisible(true);
			}
		});
		btnNewButton_3_2.setBounds(120, 235, 100, 100);
		Image rec = new ImageIcon(this.getClass().getResource("/recommend_food_1.png")).getImage();
		btnNewButton_3_2.setIcon(new ImageIcon(rec));	
		btnNewButton_3_2.setBackground(new Color(255, 255, 255));
		Private_User_page.add(btnNewButton_3_2);
		
		JLabel lblNewLabel_38 = new JLabel("\u05E4\u05D7\u05DE\u05D9\u05DE\u05D5\u05EA:"+0);
		lblNewLabel_38.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_38.setBounds(140, 158, 110, 14);
		Private_User_page.add(lblNewLabel_38);
		
		
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
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e)
			{	
				File file =new File("C:\\data");
				file.mkdirs();
				
				
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
					 user_id = "C:\\data";
					
					 int flag=0;
					File dir = new File (user_id);
					for (File f : dir.listFiles()) 
					{
						String tmp_bus = "bus_" + name_text_Field.getText()	+".txt";
						String tmp_reg_user = name_text_Field.getText() + ".txt";
						if (f.getName ().equals(tmp_bus))
							{flag=1;
								
										
									String whole=user_id +"\\"+ f.getName();
									try
									{
										String readF = extracted(whole).useDelimiter ("\\A").next ();
										String splitHere="\n";
										String[] tokens=readF.split(splitHere);
										if(password_Field.getText().equals(tokens [1]))											{
												log_in_page.setVisible(false);
												business_page.setVisible(true);
												Bus_User bus_user=new Bus_User(tokens[0],tokens[1], tokens[2], tokens[3],tokens[4]);
												
												
											}else 
											{
												JOptionPane.showMessageDialog(null, "Incorrect Password." + "!");
											}
										
										}catch(IOException e1) 
										{
										System.out.println("Error:2 " + e1);
										}
										
										
									}else if(f.getName().equals(tmp_reg_user)){
										
										flag=1;
								
									String whole=user_id +"\\"+ f.getName();
									try
									{	
										String readF=extracted(whole).useDelimiter("\\A").next();
										String splitHere="\n";
										String[] tokens=readF.split(splitHere);
										if(password_Field.getText().equals(tokens[1]))
										{
											log_in_page.setVisible(false);
											Private_User_page.setVisible(true);
											 use	= new Private_User(tokens[0], tokens[1],
													Double.parseDouble(tokens[2]),Double.parseDouble(tokens[3]),tokens[4],tokens [5],tokens [6],tokens [7],
													Double.parseDouble(tokens[8]),Integer.parseInt(tokens[9]),Integer.parseInt(tokens[10]));
											
										}else 
										{
											JOptionPane.showMessageDialog(null, "Incorrect Password." + "!");
										}
									
									}catch(IOException e1) 
									{
										
									System.out.println("Error:1 " + e1);
									System.out.println("Error:1 " + e1.toString());
									}
								}
								
							}if(flag==0) {JOptionPane.showMessageDialog(null, "Incorrect Username." + "!");}
					}
			}

			private Scanner extracted(String whole) throws FileNotFoundException {
				return new Scanner(new File (whole));
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
			public void mouseClicked(MouseEvent e)
			{
				File file =new File("C:\\data");
				file.mkdirs();
				
				
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
					 user_id = "C:\\data";
					
					 int flag=0;
					File dir = new File (user_id);
					for (File f : dir.listFiles()) 
					{
						String tmp_bus = "bus_" + name_text_Field.getText()	+".txt";
						String tmp_reg_user = name_text_Field.getText() + ".txt";
						if (f.getName ().equals(tmp_bus))
							{flag=1;
								
										
									String whole=user_id +"\\"+ f.getName();
									try
									{
										String readF = new Scanner(new File (whole)).useDelimiter ("\\A").next ();
										String splitHere="\n";
										String[] tokens=readF.split(splitHere);
										if(password_Field.getText().equals(tokens [1]))											{
												log_in_page.setVisible(false);
												business_page.setVisible(true);
												Bus_User bus_user=new Bus_User(tokens[0],tokens[1], tokens[2], tokens[3],tokens[4]);
												
											}else 
											{
												JOptionPane.showMessageDialog(null, "Incorrect Password." + "!");
											}
										
										}catch(IOException e1) 
										{
										System.out.println("Error: " + e1);
										}
										
										
									}else if(f.getName().equals(tmp_reg_user)){
										flag=1;
								
									String whole=user_id +"\\"+ f.getName();
									try
									{
										String readF=new Scanner (new File (whole)).useDelimiter ("\\A").next ();
										String splitHere="\n";
										String[] tokens=readF.split(splitHere);
										if(password_Field.getText().equals(tokens [1]))
										{
											log_in_page.setVisible(false);
											Private_User_page.setVisible(true);
											 use	= new Private_User(tokens[0], tokens[1],
													Double.parseDouble(tokens[2]),Double.parseDouble(tokens[3]),tokens[4],tokens [5],tokens [6],tokens [7],
													Double.parseDouble(tokens[8]),Integer.parseInt(tokens[9]),Integer.parseInt(tokens[10]));
											
										}else 
										{
											JOptionPane.showMessageDialog(null, "Incorrect Password." + "!");
										}
									
									}catch(IOException e1) 
									{
									System.out.println("Error: " + e1);
									}
								}
								
							}if(flag==0) {JOptionPane.showMessageDialog(null, "Incorrect Username." + "!");}
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
		Button_page_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				start_page.setVisible(false);
				regist_page.setVisible(true);

				username_text_Field.setText("");
				passwordField.setText("");
				weight_spinner.setValue(1);
				height_spinner.setValue(1);
				user_name_text_Field.setText("");
				user_lastname_text_Field.setText("");
				country_text_Field.setText("");
				city_text_Field.setText("");
				age_spinner.setValue(1);
				Gender_comboBox.setSelectedIndex(0);
				Purpose_comboBox.setSelectedIndex(0);
			}
		});
		Button_page_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				start_page.setVisible(false);
				regist_page.setVisible(true);
				username_text_Field.setText("");
				passwordField.setText("");
				weight_spinner.setValue(0);
				height_spinner.setValue(0);
				user_name_text_Field.setText("");
				user_lastname_text_Field.setText("");
				country_text_Field.setText("");
				city_text_Field.setText("");
				age_spinner.setValue(0);
				Gender_comboBox.setSelectedIndex(0);
				Purpose_comboBox.setSelectedIndex(0);
			}
		});
		Button_page_2.setBounds(10, 45, 118, 23);
		start_page.add(Button_page_2);
		
		JLabel lblNewLabel_2 = new JLabel("  ");
		Image runing = new ImageIcon(this.getClass().getResource("/running_on_empty_eran_mendel_dribbble_gif.gif")).getImage();
		lblNewLabel_2.setIcon (new ImageIcon(runing));
		lblNewLabel_2.setBounds(109, 0, 543, 320);
		start_page.add(lblNewLabel_2);
		
		JButton btnNewButton_9 = new JButton("New button");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				start_page.setVisible(false);
				admin_page.setVisible(true);
			}
		});
		btnNewButton_9.setBounds(10, 482, 89, 23);
		start_page.add(btnNewButton_9);
		
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
				b_username_text_Field.setText("");
				passwordField_1.setText("");
				b_company_field.setText("");
				b_country_text_Field.setText("");
				b_city_text_Field.setText("");
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
					File file =new File("C:\\data");
					file.mkdirs();
					
				FileWriter outFile = null;
				
				try {
					
					
					outFile = new FileWriter ("C:\\data"+"\\"+username_text_Field.getText()+".txt");
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
				File file =new File("C:\\data");
				file.mkdirs();
				try {
					outFile = new FileWriter ("C:\\data"+"\\"+username_text_Field.getText()+".txt");
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
		
		JButton food_save_Button = new JButton("\u05E9\u05DE\u05D5\u05E8 ");
		food_save_Button.setBounds(532, 469, 152, 23);
		add_food_page.add(food_save_Button);
		
		JButton btnNewButton_2 = new JButton("\u05D7\u05D6\u05D5\u05E8");
		btnNewButton_2.setBounds(693, 469, 133, 23);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				add_food_page.setVisible(false);
				Private_User_page.setVisible(true);
			}
		});
		add_food_page.add(btnNewButton_2);
		
		JLabel lblNewLabel_22 = new JLabel("\u05E1\u05D5\u05D2 \u05D4\u05D0\u05D5\u05DB\u05DC:");
		lblNewLabel_22.setBounds(694, 70, 142, 20);
		add_food_page.add(lblNewLabel_22);
		
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
		add_food_page.add(dro_RadioButton);
		add_food_page.add(met_RadioButton);
		add_food_page.add(junk_RadioButton);
		add_food_page.add(fru_RadioButton);
		dro_RadioButton.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_LEFT) {
					met_RadioButton.requestFocus();
			}
				if(e.getKeyCode()==KeyEvent.VK_SPACE) {
				
				met_RadioButton.setSelected(false);
				junk_RadioButton.setSelected(false);
				fru_RadioButton.setSelected(false);
				}
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					cal_spinner.requestFocus();
					
				}
		  }
		});
		met_RadioButton.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
					dro_RadioButton.requestFocus();
			}
				if(e.getKeyCode()==KeyEvent.VK_LEFT) {
					junk_RadioButton.requestFocus();
			}
				if(e.getKeyCode()==KeyEvent.VK_SPACE) {
				
				dro_RadioButton.setSelected(false);
				junk_RadioButton.setSelected(false);
				fru_RadioButton.setSelected(false);
				}
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					cal_spinner.requestFocus();
					
				}
				
			}
		});
		
		junk_RadioButton.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
			
					if(e.getKeyCode()==KeyEvent.VK_LEFT) {
						fru_RadioButton.requestFocus();
				}
					if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
						met_RadioButton.requestFocus();
				}
					if(e.getKeyCode()==KeyEvent.VK_SPACE) {
					
					dro_RadioButton.setSelected(false);
					met_RadioButton.setSelected(false);
					fru_RadioButton.setSelected(false);
					}
					if(e.getKeyCode()==KeyEvent.VK_ENTER) {
						cal_spinner.requestFocus();
					}
					
				
			}
		});
		fru_RadioButton.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {

				
				if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
					junk_RadioButton.requestFocus();
			}
				if(e.getKeyCode()==KeyEvent.VK_SPACE) {
				
				dro_RadioButton.setSelected(false);
				met_RadioButton.setSelected(false);
				junk_RadioButton.setSelected(false);
				}
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					cal_spinner.requestFocus();
				}
			}
		});
		
		
		
		
		
		
		food_name_text_Field = new JTextField();
		food_name_text_Field.setBounds(532, 42, 152, 20);
		food_name_text_Field.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					
					dro_RadioButton.requestFocus();
				}
			}
		});
		add_food_page.add(food_name_text_Field);
		food_name_text_Field.setColumns(10);
		
		JLabel lblNewLabel_23 = new JLabel("\u05E9\u05DD \u05D4\u05D0\u05D5\u05DB\u05DC:");
		lblNewLabel_23.setBounds(693, 45, 87, 14);
		add_food_page.add(lblNewLabel_23);
		
		JLabel lblNewLabel_24 = new JLabel("\u05D0\u05E0\u05E8\u05D2\u05D9\u05D4");
		lblNewLabel_24.setBounds(694, 102, 56, 14);
		add_food_page.add(lblNewLabel_24);
		
		JLabel lblNewLabel_25 = new JLabel("\u05E0\u05EA\u05E8\u05D0\u05DF");
		lblNewLabel_25.setBounds(694, 195, 56, 14);
		add_food_page.add(lblNewLabel_25);
		
		JLabel lblNewLabel_26 = new JLabel("\u05D7\u05DC\u05D1\u05D5\u05E0\u05D9\u05DD");
		lblNewLabel_26.setBounds(694, 257, 46, 14);
		add_food_page.add(lblNewLabel_26);
		
		JLabel lblNewLabel_27 = new JLabel("\u05E9\u05D5\u05DE\u05E0\u05D9\u05DD");
		lblNewLabel_27.setBounds(694, 133, 46, 14);
		add_food_page.add(lblNewLabel_27);
		
		JLabel lblNewLabel_28 = new JLabel("\u05E4\u05D7\u05DE\u05D9\u05DE\u05D5\u05EA");
		lblNewLabel_28.setBounds(694, 226, 46, 14);
		add_food_page.add(lblNewLabel_28);
		
		JLabel lblNewLabel_29 = new JLabel("\u05DB\u05D5\u05DC\u05E1\u05D8\u05D9\u05E8\u05D5\u05DC");
		lblNewLabel_29.setBounds(694, 164, 56, 14);
		add_food_page.add(lblNewLabel_29);
		
	
		cal_spinner.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		add_food_page.add(cal_spinner);
		
		JSpinner Fat_spinner = new JSpinner();
		Fat_spinner.setBounds(638, 130, 46, 20);
		Fat_spinner.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		add_food_page.add(Fat_spinner);
		
		JSpinner coles_spinner = new JSpinner();
		coles_spinner.setBounds(638, 161, 46, 20);
		coles_spinner.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		add_food_page.add(coles_spinner);
		
		JSpinner salt_spinner = new JSpinner();
		salt_spinner.setBounds(638, 192, 46, 20);
		salt_spinner.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		add_food_page.add(salt_spinner);
		
		JSpinner carbo_spinner = new JSpinner();
		carbo_spinner.setBounds(638, 223, 46, 20);
		carbo_spinner.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		add_food_page.add(carbo_spinner);
		
		JSpinner prot_spinner = new JSpinner();
		prot_spinner.setBounds(638, 254, 46, 20);
		prot_spinner.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		add_food_page.add(prot_spinner);
		
		JLabel lblNewLabel_30 = new JLabel("(\u05E7\u05DC\u05D5\u05E8\u05D9\u05D5\u05EA)");
		lblNewLabel_30.setBounds(572, 102, 56, 14);
		lblNewLabel_30.setHorizontalAlignment(SwingConstants.RIGHT);
		add_food_page.add(lblNewLabel_30);
		
		JLabel lblNewLabel_30_1 = new JLabel("(\u05D2\u05E8\u05DD)");
		lblNewLabel_30_1.setBounds(582, 133, 46, 14);
		lblNewLabel_30_1.setHorizontalAlignment(SwingConstants.RIGHT);
		add_food_page.add(lblNewLabel_30_1);
		
		JLabel lblNewLabel_30_2 = new JLabel("(\u05DE''\u05D2)");
		lblNewLabel_30_2.setBounds(582, 164, 46, 14);
		lblNewLabel_30_2.setHorizontalAlignment(SwingConstants.RIGHT);
		add_food_page.add(lblNewLabel_30_2);
		
		JLabel lblNewLabel_30_3 = new JLabel("(\u05DE''\u05D2)");
		lblNewLabel_30_3.setBounds(582, 195, 46, 14);
		lblNewLabel_30_3.setHorizontalAlignment(SwingConstants.RIGHT);
		add_food_page.add(lblNewLabel_30_3);
		
		JLabel lblNewLabel_30_4 = new JLabel("(\u05D2\u05E8\u05DD)");
		lblNewLabel_30_4.setBounds(582, 226, 46, 14);
		lblNewLabel_30_4.setHorizontalAlignment(SwingConstants.RIGHT);
		add_food_page.add(lblNewLabel_30_4);
		
		JLabel lblNewLabel_30_5 = new JLabel("(\u05D2\u05E8\u05DD)");
		lblNewLabel_30_5.setBounds(582, 257, 46, 14);
		lblNewLabel_30_5.setHorizontalAlignment(SwingConstants.RIGHT);
		add_food_page.add(lblNewLabel_30_5);
		
		JLabel lblNewLabel_31 = new JLabel("\u05E1\u05D5\u05E7\u05E8");
		lblNewLabel_31.setBounds(693, 315, 46, 14);
		add_food_page.add(lblNewLabel_31);
		
		JLabel lblNewLabel_31_1 = new JLabel("\u05E9\u05D5\u05DE\u05DF \u05E8\u05D5\u05D5\u05D9");
		lblNewLabel_31_1.setBounds(694, 340, 46, 14);
		add_food_page.add(lblNewLabel_31_1);
		
		JLabel lblNewLabel_31_2 = new JLabel("\u05E1\u05D1\u05D9\u05DD \u05EA\u05D6\u05D5\u05E0\u05EA\u05D9\u05D9\u05DD");
		lblNewLabel_31_2.setBounds(693, 365, 87, 14);
		add_food_page.add(lblNewLabel_31_2);
		
		JLabel lblNewLabel_32 = new JLabel("\u05DE\u05D9\u05DD");
		lblNewLabel_32.setBounds(694, 390, 86, 14);
		add_food_page.add(lblNewLabel_32);
		
		JLabel lblNewLabel_32_1 = new JLabel("\u05D5\u05D5\u05D8\u05DE\u05D9\u05DF C");
		lblNewLabel_32_1.setBounds(694, 415, 86, 14);
		add_food_page.add(lblNewLabel_32_1);
		
		JLabel lblNewLabel_32_2 = new JLabel("\u05D5\u05D5\u05D9\u05D8\u05DE\u05D9\u05DF B9");
		lblNewLabel_32_2.setBounds(694, 444, 86, 14);
		add_food_page.add(lblNewLabel_32_2);
		
		JLabel lblNewLabel_32_3 = new JLabel("\u05D1\u05E8\u05D6\u05DC");
		lblNewLabel_32_3.setBounds(532, 315, 35, 14);
		add_food_page.add(lblNewLabel_32_3);
		
		JLabel lblNewLabel_33 = new JLabel("\u05E1\u05D9\u05D3\u05DF");
		lblNewLabel_33.setBounds(532, 340, 46, 14);
		add_food_page.add(lblNewLabel_33);
		
		JLabel lblNewLabel_34 = new JLabel("\u05DE\u05D2\u05D0\u05D6\u05D9\u05D5\u05DD");
		lblNewLabel_34.setBounds(532, 365, 46, 14);
		add_food_page.add(lblNewLabel_34);
		
		JLabel lblNewLabel_35 = new JLabel("\u05D6\u05E8\u05D7\u05DF");
		lblNewLabel_35.setBounds(532, 390, 46, 14);
		add_food_page.add(lblNewLabel_35);
		
		JLabel lblNewLabel_36 = new JLabel("\u05D0\u05D1\u05E5");
		lblNewLabel_36.setBounds(532, 415, 46, 14);
		add_food_page.add(lblNewLabel_36);
		
		JLabel lblNewLabel_37 = new JLabel("\u05D0\u05E9\u05DC\u05D2\u05DF");
		lblNewLabel_37.setBounds(532, 444, 46, 14);
		add_food_page.add(lblNewLabel_37);
		
		JSpinner spinner_5_1 = new JSpinner();
		spinner_5_1.setBounds(638, 312, 46, 20);
		spinner_5_1.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		add_food_page.add(spinner_5_1);
		
		JSpinner spinner_5_2 = new JSpinner();
		spinner_5_2.setBounds(638, 337, 46, 20);
		spinner_5_2.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		add_food_page.add(spinner_5_2);
		
		JSpinner spinner_5_3 = new JSpinner();
		spinner_5_3.setBounds(638, 362, 46, 20);
		spinner_5_3.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		add_food_page.add(spinner_5_3);
		
		JSpinner spinner_5_4 = new JSpinner();
		spinner_5_4.setBounds(638, 387, 46, 20);
		spinner_5_4.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		add_food_page.add(spinner_5_4);
		
		JSpinner spinner_5_5 = new JSpinner();
		spinner_5_5.setBounds(638, 412, 46, 20);
		spinner_5_5.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		add_food_page.add(spinner_5_5);
		
		JSpinner spinner_5_6 = new JSpinner();
		spinner_5_6.setBounds(638, 438, 46, 20);
		spinner_5_6.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		add_food_page.add(spinner_5_6);
		
		JSpinner spinner_5_7 = new JSpinner();
		spinner_5_7.setBounds(476, 312, 46, 20);
		spinner_5_7.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		add_food_page.add(spinner_5_7);
		
		JSpinner spinner_5_8 = new JSpinner();
		spinner_5_8.setBounds(476, 337, 46, 20);
		spinner_5_8.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		add_food_page.add(spinner_5_8);
		
		JSpinner spinner_5_9 = new JSpinner();
		spinner_5_9.setBounds(476, 362, 46, 20);
		spinner_5_9.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		add_food_page.add(spinner_5_9);
		
		JSpinner spinner_5_10 = new JSpinner();
		spinner_5_10.setBounds(476, 387, 46, 20);
		spinner_5_10.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		add_food_page.add(spinner_5_10);
		
		JSpinner spinner_5_11 = new JSpinner();
		spinner_5_11.setBounds(476, 412, 46, 20);
		spinner_5_11.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		add_food_page.add(spinner_5_11);
		
		JSpinner spinner_5_12 = new JSpinner();
		spinner_5_12.setBounds(476, 438, 46, 20);
		spinner_5_12.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		add_food_page.add(spinner_5_12);
		
		JLabel lblNewLabel_39 = new JLabel("______________________________________________________");
		lblNewLabel_39.setBounds(462, 260, 364, 29);
		add_food_page.add(lblNewLabel_39);
		
		JLabel lblNewLabel_40 = new JLabel("\u05E1\u05D3\u05D5\u05EA \u05D7\u05D5\u05D1\u05D4");
		lblNewLabel_40.setBounds(758, 20, 67, 14);
		add_food_page.add(lblNewLabel_40);
		
		JLabel lblNewLabel_41 = new JLabel("\u05E1\u05D3\u05D5\u05EA \u05DC\u05D0 \u05D7\u05D5\u05D1\u05D4");
		lblNewLabel_41.setBounds(721, 290, 87, 14);
		add_food_page.add(lblNewLabel_41);
		food_save_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				
				
				if(food_name_text_Field.getText().isEmpty()||cal_spinner.getValue().equals(0)||Fat_spinner.getValue().equals(0)||coles_spinner.getValue().equals(0)||salt_spinner.getValue().equals(0)||
						carbo_spinner.getValue().equals(0)||prot_spinner.getValue().equals(0)||(dro_RadioButton.isSelected()==false&&met_RadioButton.isSelected()==false&&junk_RadioButton.isSelected()==false&&fru_RadioButton.isSelected()==false))
				{
					JOptionPane.showMessageDialog(null, "You have to fill the critic parameters" + "!");

					
				}else {
					File file =new File("C:\\data");
					file.mkdirs();
					
				FileWriter outFile = null;
				
				try {
					
					
					outFile = new FileWriter ("C:\\data"+"\\"+"food_"+food_name_text_Field.getText()+"_"+name_text_Field.getText()+".txt");
				} catch (IOException e1) {
					System.out.println("Error: " + e1);
				
				}
				BufferedWriter outStream =new BufferedWriter(outFile);
			
				try {
					
					
					outStream.write(food_name_text_Field.getText()+"\n");
					if(dro_RadioButton.isSelected()==true) 
					outStream.write("1");
					else if(met_RadioButton.isSelected()==true)
						outStream.write("2");
					else if(junk_RadioButton.isSelected()==true)
						outStream.write("3");
					else if(fru_RadioButton.isSelected()==true)
						outStream.write("4");
					outStream.write("\n");
					outStream.write(cal_spinner.getValue().toString()+"\n");
					outStream.write(Fat_spinner.getValue().toString()+"\n");
					outStream.write(coles_spinner.getValue().toString()+"\n");
					outStream.write(salt_spinner.getValue().toString()+"\n");
					outStream.write(carbo_spinner.getValue().toString()+"\n");
					outStream.write(prot_spinner.getValue().toString()+"\n");
					outStream.write(spinner_5_1.getValue().toString()+"\n");
					outStream.write(spinner_5_2.getValue().toString()+"\n");
					outStream.write(spinner_5_3.getValue().toString()+"\n");
					outStream.write(spinner_5_4.getValue().toString()+"\n");
					outStream.write(spinner_5_5.getValue().toString()+"\n");
					outStream.write(spinner_5_6.getValue().toString()+"\n");
					outStream.write(spinner_5_7.getValue().toString()+"\n");
					outStream.write(spinner_5_8.getValue().toString()+"\n");
					outStream.write(spinner_5_9.getValue().toString()+"\n");
					outStream.write(spinner_5_10.getValue().toString()+"\n");
					outStream.write(spinner_5_11.getValue().toString()+"\n");
					outStream.write(spinner_5_12.getValue().toString()+"\n");
					outStream.write(name_text_Field.getText()+"\n");
					outStream.close ();
				} catch (IOException e1) {
					System.out.println("Error: " + e1);
				}
				
				
				
					add_food_page.setVisible(false);
					Private_User_page.setVisible(true);
	
				}	
				
				
				
				
				
			}
		});
		add_new_food_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				food_name_text_Field.setText("");
				dro_RadioButton.setSelected(false);
				met_RadioButton.setSelected(false);
				junk_RadioButton.setSelected(false);
				fru_RadioButton.setSelected(false);
				cal_spinner.setValue(0);
				Fat_spinner.setValue(0);
				coles_spinner.setValue(0);
				salt_spinner.setValue(0);
				carbo_spinner.setValue(0);
				prot_spinner.setValue(0);
				spinner_5_1.setValue(0);
				spinner_5_2.setValue(0);
				spinner_5_3.setValue(0);
				spinner_5_4.setValue(0);
				spinner_5_5.setValue(0);
				spinner_5_6.setValue(0);
				spinner_5_7.setValue(0);
				spinner_5_8.setValue(0);
				spinner_5_9.setValue(0);
				spinner_5_10.setValue(0);
				spinner_5_11.setValue(0);
				spinner_5_12.setValue(0);
				
				
				Private_User_page.setVisible(false);
				add_food_page.setVisible(true);
			}
		});
		
		
		cal_spinner.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					Fat_spinner.requestFocus();
					
				}
			}
		});
		Fat_spinner.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					coles_spinner.requestFocus();
					
				}
			}
		});
		coles_spinner.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					salt_spinner.requestFocus();
					
				}
			}
		});
		salt_spinner.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					carbo_spinner.requestFocus();
					
				}
			}
		});
		carbo_spinner.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					prot_spinner.requestFocus();
					
				}
			}
		});
		prot_spinner.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					spinner_5_1.requestFocus();
					
				}
			}
		});
		spinner_5_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					spinner_5_2.requestFocus();
					
				}
			}
		});spinner_5_2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					spinner_5_3.requestFocus();
					
				}
			}
		});spinner_5_3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					spinner_5_4.requestFocus();
					
				}
			}
		});spinner_5_4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					spinner_5_5.requestFocus();
					
				}
			}
		});spinner_5_5.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					spinner_5_6.requestFocus();
					
				}
			}
		});spinner_5_6.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					spinner_5_7.requestFocus();
					
				}
			}
		});spinner_5_7.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					spinner_5_8.requestFocus();
					
				}
			}
		});spinner_5_8.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					spinner_5_9.requestFocus();
					
				}
			}
		});spinner_5_9.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					spinner_5_10.requestFocus();
					
				}
			}
		});spinner_5_10.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					spinner_5_11.requestFocus();
					
				}
			}
		});spinner_5_11.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					spinner_5_12.requestFocus();
					
				}
			}
		});spinner_5_12.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					food_save_Button.doClick();
				}
			}
		});
		
		
		frame.getContentPane().add(ate_food_page, "name_133487254905400");
		
		JButton back_Button_3 = new JButton("\u05D7\u05D6\u05E8\u05D4");
		back_Button_3.setBounds(747, 482, 89, 23);
		back_Button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ate_food_page.setVisible(false);
		
				
				lblNewLabel_9.setText( "\u05E7\u05DC\u05D5\u05E8\u05D9\u05D5\u05EA: " +Math.floor(use.food_det[0]*100)/100 );
				
				lblNewLabel_20.setText("\u05E0\u05EA\u05E8\u05D0\u05DF: "+Math.floor(use.food_det[3]*100)/100);
			
				lblNewLabel_20_1.setText("\u05D7\u05DC\u05D1\u05D5\u05E0\u05D9\u05DD: "+Math.floor(use.food_det[1]*100)/100);
				
				lblNewLabel_20_2.setText("\u05E9\u05D5\u05DE\u05E0\u05D9\u05DD: "+Math.floor(use.food_det[4]*100)/100);
				
				lblNewLabel_20_3.setText("\u05E7\u05D5\u05DC\u05E1\u05D8\u05E8\u05D5\u05DC: "+Math.floor(use.food_det[2]*100)/100);
				
				lblNewLabel_38.setText("\u05E4\u05D7\u05DE\u05D9\u05DE\u05D5\u05EA: "+Math.floor(use.food_det[9]*100)/100);
				
				
				
				
				
				
				Private_User_page.setVisible(true);
			}
		});
		ate_food_page.setLayout(null);
		ate_food_page.add(back_Button_3);
JButton button_food_3 = new JButton("\u05DC\u05D7\u05DD \u05E9\u05D7\u05D5\u05E8");
button_food_3.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		
		Dry_Food bl_bra=prod.d_food[0];
		
		JSlider lehemslid =new JSlider(0,1000,100);
		lehemslid.setValue(0);
		JFrame parent = new JFrame();
		 JOptionPane optionPane = new JOptionPane();
		 lehemslid.setMajorTickSpacing(100);
		 lehemslid.setMinorTickSpacing(50);
		 lehemslid.setPaintTicks(true);
		 lehemslid.setPaintLabels(true);
         
		// Add positions label in the slider
		Hashtable position = new Hashtable();
		position.put(0, new JLabel("0"));
		position.put(100, new JLabel("100"));
		position.put(200, new JLabel("200"));
		position.put(300, new JLabel("300"));
		position.put(400, new JLabel("400"));
		position.put(500, new JLabel("500"));
		position.put(600, new JLabel("600"));
		position.put(700, new JLabel("700"));
		position.put(800, new JLabel("800"));
		position.put(900, new JLabel("900"));
		position.put(1000, new JLabel("1000"));
		
		         
		// Set the label to be drawn
		lehemslid.setLabelTable(position);
		    optionPane.setMessage(new Object[] { "Select a value: ", lehemslid });
		    optionPane.setMessageType(JOptionPane.QUESTION_MESSAGE);
		    optionPane.setOptionType(JOptionPane.OK_CANCEL_OPTION);
		    JDialog dialog = optionPane.createDialog(parent,"\u05E4\u05E1\u05D8\u05D4");
		    dialog.setSize(500, 300);
		    dialog.setVisible(true);
		    
		    //System.out.print(lehemslid.getValue());
		    //bl_bra=bl_bra.Calc(lehemslid.getValue());
		    use.Ate_Dry_food(bl_bra.Calc(lehemslid.getValue()));
		    System.out.print(use+"\n");
		   
	}
});
button_food_3.setBounds(230, 11, 100, 100);
ate_food_page.add(button_food_3);
JButton button_food_4 = new JButton("but_4");
button_food_4.setBounds(340, 11, 100, 100);
ate_food_page.add(button_food_4);
JButton button_food_5 = new JButton("but_5");
button_food_5.setBounds(450, 11, 100, 100);
ate_food_page.add(button_food_5);
JButton button_food_6 = new JButton("but_6");
button_food_6.setBounds(560, 11, 100, 100);
ate_food_page.add(button_food_6);
JButton button_food_7 = new JButton("but_7");
button_food_7.setBounds(667, 11, 100, 100);
ate_food_page.add(button_food_7);
JButton button_food_8 = new JButton("but_8");
button_food_8.setBounds(10, 122, 100, 100);
ate_food_page.add(button_food_8);
JButton button_food_9 = new JButton("but_9");
button_food_9.setBounds(120, 122, 100, 100);
ate_food_page.add(button_food_9);
JButton button_food_10 = new JButton("but_10");
button_food_10.setBounds(230, 122, 100, 100);
ate_food_page.add(button_food_10);
JButton button_food_2 = new JButton("\u05E4\u05E1\u05D8\u05D4");
button_food_2.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {

		Dry_Food past=prod.d_food[0];
		
		JSlider lehemslid =new JSlider(0,1000,100);
		lehemslid.setValue(0);
		JFrame parent = new JFrame();
		 JOptionPane optionPane = new JOptionPane();
		 lehemslid.setMajorTickSpacing(100);
		 lehemslid.setMinorTickSpacing(50);
		 lehemslid.setPaintTicks(true);
		 lehemslid.setPaintLabels(true);
         
		// Add positions label in the slider
		Hashtable position = new Hashtable();
		position.put(0, new JLabel("0"));
		position.put(100, new JLabel("100"));
		position.put(200, new JLabel("200"));
		position.put(300, new JLabel("300"));
		position.put(400, new JLabel("400"));
		position.put(500, new JLabel("500"));
		position.put(600, new JLabel("600"));
		position.put(700, new JLabel("700"));
		position.put(800, new JLabel("800"));
		position.put(900, new JLabel("900"));
		position.put(1000, new JLabel("1000"));
		
		         
		// Set the label to be drawn
		lehemslid.setLabelTable(position);
		    optionPane.setMessage(new Object[] { "Select a value: ", lehemslid });
		    optionPane.setMessageType(JOptionPane.QUESTION_MESSAGE);
		    optionPane.setOptionType(JOptionPane.OK_CANCEL_OPTION);
		    JDialog dialog = optionPane.createDialog(parent,"\u05E4\u05E1\u05D8\u05D4");
		    dialog.setSize(500, 300);
		    dialog.setVisible(true);
		    
		    //System.out.print(lehemslid.getValue());
		    //past=past.Calc(lehemslid.getValue());
		    use.Ate_Dry_food(past.Calc(lehemslid.getValue()));
		    System.out.print(use+"\n");
		   
	}
});
button_food_2.setBounds(120, 11, 100, 100);
ate_food_page.add(button_food_2);

JButton button_food_1 = new JButton("\u05DC\u05D7\u05DD \u05DC\u05D1\u05DF");
button_food_1.setBounds(10, 11, 100, 100);
button_food_1.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		
		Dry_Food bra=prod.d_food[1];
		JSlider lehemslid =new JSlider(0,1000,100);
		lehemslid.setValue(0);
		JFrame parent = new JFrame();
		 JOptionPane optionPane = new JOptionPane();
		 lehemslid.setMajorTickSpacing(100);
		 lehemslid.setMinorTickSpacing(50);
		 lehemslid.setPaintTicks(true);
		 lehemslid.setPaintLabels(true);
         
		// Add positions label in the slider
		Hashtable position = new Hashtable();
		position.put(0, new JLabel("0"));
		position.put(100, new JLabel("100"));
		position.put(200, new JLabel("200"));
		position.put(300, new JLabel("300"));
		position.put(400, new JLabel("400"));
		position.put(500, new JLabel("500"));
		position.put(600, new JLabel("600"));
		position.put(700, new JLabel("700"));
		position.put(800, new JLabel("800"));
		position.put(900, new JLabel("900"));
		position.put(1000, new JLabel("1000"));
		
		         
		// Set the label to be drawn
		lehemslid.setLabelTable(position);
		    optionPane.setMessage(new Object[] { "Select a value: ", lehemslid });
		    optionPane.setMessageType(JOptionPane.QUESTION_MESSAGE);
		    optionPane.setOptionType(JOptionPane.OK_CANCEL_OPTION);
		    JDialog dialog = optionPane.createDialog(parent,"\u05DC\u05D7\u05DD \u05DC\u05D1\u05DF");
		    dialog.setSize(500, 300);
		    dialog.setVisible(true);
		    
		    //System.out.print(lehemslid.getValue());
		   // Double d = new Double(lehemslid.getValue());
		    use.Ate_Dry_food(bra.Calc(lehemslid.getValue()));
		    System.out.print(use+"\n");
			}

	
});




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
		
		JLabel lblNewLabel_19 = new JLabel("\u05DB\u05DC \u05D4\u05E0\u05EA\u05D5\u05E0\u05D9\u05DD \u05E2\u05DC \u05D4\u05E6\u05E8\u05D9\u05DB\u05D4 \u05D4\u05D9\u05D5\u05DE\u05D9\u05EA \u05E9\u05DC\u05DA");
		lblNewLabel_19.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_19.setBounds(539, 11, 297, 46);
		data_analysis_page.add(lblNewLabel_19);
		
		JLabel lblNewLabel_21 = new JLabel("\u05E7\u05DC\u05D5\u05E8\u05D9\u05D5\u05EA: ");
		lblNewLabel_21.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_21.setBounds(534, 68, 291, 14);
		data_analysis_page.add(lblNewLabel_21);
		
		JLabel lblNewLabel_42 = new JLabel("\u05D7\u05DC\u05D1\u05D5\u05E0\u05D9\u05DD: ");
		lblNewLabel_42.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_42.setBounds(534, 93, 291, 14);
		data_analysis_page.add(lblNewLabel_42);
		
		JLabel lblNewLabel_43 = new JLabel("\u05DB\u05D5\u05DC\u05E1\u05D8\u05E8\u05D5\u05DC: ");
		lblNewLabel_43.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_43.setBounds(534, 118, 291, 14);
		data_analysis_page.add(lblNewLabel_43);
		
		JLabel lblNewLabel_44 = new JLabel("\u05E0\u05EA\u05E8\u05DF: ");
		lblNewLabel_44.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_44.setBounds(534, 143, 291, 14);
		data_analysis_page.add(lblNewLabel_44);
		
		JLabel lblNewLabel_45 = new JLabel("\u05E9\u05D5\u05DE\u05E0\u05D9\u05DD: ");
		lblNewLabel_45.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_45.setBounds(534, 165, 291, 14);
		data_analysis_page.add(lblNewLabel_45);
		
		JLabel lblNewLabel_46 = new JLabel("\u05E1\u05D5\u05DB\u05E8\u05D9\u05DD: ");
		lblNewLabel_46.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_46.setBounds(534, 190, 291, 14);
		data_analysis_page.add(lblNewLabel_46);
		
		JLabel lblNewLabel_47 = new JLabel("\u05D6\u05E8\u05D7\u05DF: ");
		lblNewLabel_47.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_47.setBounds(534, 215, 291, 14);
		data_analysis_page.add(lblNewLabel_47);
		
		JLabel lblNewLabel_48 = new JLabel("\u05D0\u05E9\u05DC\u05D2\u05DF: ");
		lblNewLabel_48.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_48.setBounds(534, 240, 291, 14);
		data_analysis_page.add(lblNewLabel_48);
		
		JLabel lblNewLabel_49 = new JLabel("\u05DE\u05D2\u05E0\u05D6\u05D9\u05D5\u05DD: ");
		lblNewLabel_49.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_49.setBounds(534, 265, 291, 14);
		data_analysis_page.add(lblNewLabel_49);
		
		JLabel lblNewLabel_50 = new JLabel("\u05E4\u05D7\u05DE\u05D9\u05DE\u05D5\u05EA: ");
		lblNewLabel_50.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_50.setBounds(534, 290, 291, 14);
		data_analysis_page.add(lblNewLabel_50);
		
		JLabel lblNewLabel_51 = new JLabel("\u05D1\u05E8\u05D6\u05DC: ");
		lblNewLabel_51.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_51.setBounds(534, 315, 291, 14);
		data_analysis_page.add(lblNewLabel_51);
		
		JLabel lblNewLabel_52 = new JLabel("\u05D5\u05D5\u05D9\u05D8\u05DE\u05D9\u05DF \u05E1\u05D9\u05D9: ");
		lblNewLabel_52.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_52.setBounds(534, 340, 291, 14);
		data_analysis_page.add(lblNewLabel_52);
		
		
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
		
	
		JButton data_Button_4 = new JButton("");
		data_Button_4.setToolTipText("\u05E0\u05EA\u05D5\u05E0\u05D9\u05DD \u05E2\u05DC \u05DE\u05D4 \u05D0\u05D7\u05DC\u05EA\u05D9 ");
		data_Button_4.setBounds(10, 235, 100, 100);
		data_Button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				data_analysis_page.setVisible(true);
				
				
				lblNewLabel_21.setText("\u05E7\u05DC\u05D5\u05E8\u05D9\u05D5\u05EA: "+Math.floor(use.food_det[0]*100)/100);
				
				lblNewLabel_42.setText("\u05D7\u05DC\u05D1\u05D5\u05E0\u05D9\u05DD: "+Math.floor(use.food_det[1]*100)/100);
				
				lblNewLabel_43.setText("\u05DB\u05D5\u05DC\u05E1\u05D8\u05E8\u05D5\u05DC: "+Math.floor(use.food_det[2]*100)/100);
				
				lblNewLabel_44.setText("\u05E0\u05EA\u05E8\u05DF: "+Math.floor(use.food_det[3]*100)/100);

				lblNewLabel_45.setText("\u05E9\u05D5\u05DE\u05E0\u05D9\u05DD: "+Math.floor(use.food_det[4]*100)/100);
				
				lblNewLabel_46.setText("\u05E1\u05D5\u05DB\u05E8\u05D9\u05DD: "+Math.floor(use.food_det[5]*100)/100);

				lblNewLabel_47.setText("\u05D6\u05E8\u05D7\u05DF: "+Math.floor(use.food_det[6]*100)/100);
				
				lblNewLabel_48.setText("\u05D0\u05E9\u05DC\u05D2\u05DF: "+Math.floor(use.food_det[7]*100)/100);
				
				lblNewLabel_49.setText("\u05DE\u05D2\u05E0\u05D6\u05D9\u05D5\u05DD: "+Math.floor(use.food_det[8]*100)/100);

				lblNewLabel_50.setText("\u05E4\u05D7\u05DE\u05D9\u05DE\u05D5\u05EA: "+Math.floor(use.food_det[9]*100)/100);

				lblNewLabel_51.setText("\u05D1\u05E8\u05D6\u05DC: "+Math.floor(use.food_det[10]*100)/100);
				
				lblNewLabel_52.setText("\u05D5\u05D5\u05D9\u05D8\u05DE\u05D9\u05DF \u05E1\u05D9\u05D9: "+Math.floor(use.food_det[11]*100)/100);
				
				
				
				
				Private_User_page.setVisible(false);
			}
		});
		
		JButton btnNewButton_3 = new JButton("\u05D7\u05D6\u05E8\u05D4");
		btnNewButton_3.setBounds(747, 482, 89, 23);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Private_User_page.setVisible(true);
				
				lblNewLabel_9.setText( "\u05E7\u05DC\u05D5\u05E8\u05D9\u05D5\u05EA: " +Math.floor(use.food_det[0]*100)/100 );
				
				lblNewLabel_20.setText("\u05E0\u05EA\u05E8\u05D0\u05DF: "+Math.floor(use.food_det[3]*100)/100);
			
				lblNewLabel_20_1.setText("\u05D7\u05DC\u05D1\u05D5\u05E0\u05D9\u05DD: "+Math.floor(use.food_det[1]*100)/100);
				
				lblNewLabel_20_2.setText("\u05E9\u05D5\u05DE\u05E0\u05D9\u05DD: "+Math.floor(use.food_det[4]*100)/100);
				
				lblNewLabel_20_3.setText("\u05E7\u05D5\u05DC\u05E1\u05D8\u05E8\u05D5\u05DC: "+Math.floor(use.food_det[2]*100)/100);
				
				lblNewLabel_38.setText("\u05E4\u05D7\u05DE\u05D9\u05DE\u05D5\u05EA:"+Math.floor(use.food_det[9]*100)/100);
				
				
				
				sport_activity_page.setVisible(false);
			}
		});
		sport_activity_page.setLayout(null);
		sport_activity_page.add(btnNewButton_3);
		
		data_Button_4.setBackground(new Color(255, 255, 255));
		Image ana = new ImageIcon(this.getClass().getResource("/data_analysis.png")).getImage();
		data_Button_4.setIcon(new ImageIcon(ana));
		Private_User_page.add(data_Button_4);
		
		
		b_Button_save.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				if(b_city_text_Field.getText().isEmpty()||
						b_country_text_Field.getText().isEmpty()||b_company_field.getText().isEmpty()||
						passwordField_1.getText().isEmpty()||b_username_text_Field.getText().isEmpty()) 
				{
					JOptionPane.showMessageDialog(null, "You have to fill all" + "!");	
				}else {
					
					File file =new File("C:\\data");
					file.mkdirs();
					FileWriter outFile = null;
				
				try {outFile = new FileWriter ("C:\\data"+"bus_"+b_username_text_Field.getText()+".txt");
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
				File file =new File("C:\\data");
				file.mkdirs();
				
						
				BufferedWriter outStream=null;
				
				try {
					outFile = new FileWriter ("C:\\data\\"+"bus_"+b_username_text_Field.getText()+".txt");
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
