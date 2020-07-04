package Main.View;
import Main.Controller.*;
import Main.Model.*;

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
import java.io.PrintWriter;

import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

import java.util.Hashtable;
import java.util.Scanner;

import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JSlider;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

import javax.swing.JRadioButton;

@SuppressWarnings({"ALL", "rawtypes"})
public class main_windows {

	public JFrame frame;
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
	JComboBox comboBox=null;
	Ads ads = null;
	Product prod=new Product(false);
	Private_User use =null;
	Bus_User bus_user=null;
	Eating_Stats eat_s =null;
	private JTextField name_set_textField;
	private JTextField lastname_set_textField;
	private JTextField username_set_textField;
	private JPasswordField passwordField_set;
	private JTextField city_set_textField;
	private JTextField country_set_textField;
	private JTextField bis_name_text_Field;
	private JTextField bis_username_text_Field;
	private JPasswordField bis_password_Field;
	private JTextField bis_city_text_Field;
	private JTextField bis_cuntry_text_Field;
	private JTextField bis_food_name_text_Field;
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
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
	} */

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
		Private_User_page.setBackground(new Color(75,78,244));
		JPanel set_bis_rdata_page = new JPanel();
		JPanel log_in_page = new JPanel();
		JPanel start_page = new JPanel();
		JPanel bis_add_food_page = new JPanel();
		JPanel myfood_page = new JPanel();
		start_page.setBackground(new Color(248, 191, 88));
		frame.getContentPane().add(start_page, "name_830499986510200");
		JPanel add_food_page = new JPanel();
		add_food_page.setBackground(new Color(254, 194, 22));
		JSpinner weight_spinner = new JSpinner();
		JPanel data_analysis_page = new JPanel();
		data_analysis_page.setBackground(new Color(226,229,228));
		JPanel sport_activity_page = new JPanel();
		sport_activity_page.setBackground(new Color(232, 192, 90));
		frame.getContentPane().add(sport_activity_page, "name_135054560240100");
		JSpinner height_spinner = new JSpinner();
		JSpinner age_spinner = new JSpinner();
		JComboBox Gender_comboBox = new JComboBox();
		JComboBox Purpose_comboBox = new JComboBox();
		
		JPanel ate_food_page = new JPanel();
		ate_food_page.setBackground(new Color(201, 114, 54));
		frame.getContentPane().add(ate_food_page, "name_31670348278500");
		ate_food_page.setLayout(null);
		//
		JPanel veg_page = new JPanel();
		veg_page.setBackground(new Color(181,255,245));
		frame.getContentPane().add(veg_page, "name_31411297190200");
		veg_page.setLayout(null);
		
		JButton btnNewButton_33 = new JButton("\u05D7\u05D6\u05D5\u05E8");
		btnNewButton_33.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				veg_page.setVisible(false);
				ate_food_page.setVisible(true);
				
			}
		});
		btnNewButton_33.setBounds(747, 482, 89, 23);
		veg_page.add(btnNewButton_33);
		
		JButton btnNewButton_34 = new JButton("");
		btnNewButton_34.setToolTipText("\u05E2\u05D2\u05D1\u05E0\u05D9\u05D4");
		btnNewButton_34.setBounds(10, 11, 100, 100);
		Image agva= new ImageIcon(this.getClass().getResource("/agvaniya.jpg")).getImage();
		btnNewButton_34.setIcon(new ImageIcon(agva));
		btnNewButton_34.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Veg veg= null;
				try {
					veg = (Veg) prod.Get("Veg", 0);
				} catch (CloneNotSupportedException ex) {
					ex.printStackTrace();
				}

				JSlider vegid =new JSlider(0,1000,100);
				vegid.setValue(0);
				JFrame parent = new JFrame();
				 JOptionPane optionPane = new JOptionPane();
				 vegid.setMajorTickSpacing(100);
				 vegid.setMinorTickSpacing(50);
				 vegid.setPaintTicks(true);
				 vegid.setPaintLabels(true);
		         
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
				vegid.setLabelTable(position);
				    optionPane.setMessage(new Object[] { "Select a value: ", vegid });
				    optionPane.setMessageType(JOptionPane.PLAIN_MESSAGE);
				    optionPane.setOptionType(JOptionPane.OK_CANCEL_OPTION);
				    JDialog dialog = optionPane.createDialog(parent,"\u05E2\u05D2\u05D1\u05E0\u05D9\u05D4");
				    dialog.setSize(500, 300);
				    dialog.setVisible(true);
				    
				    //System.out.print(lehemslid.getValue());
				    //bl_bra=bl_bra.Calc(lehemslid.getValue());
				try {
					eat_s.Ate(veg.Calc(vegid.getValue()));
				} catch (IOException ex) {
					ex.printStackTrace();
				}
				//System.out.print(use+"\n");
				

			}
		});
		
		veg_page.add(btnNewButton_34);
		JButton button = new JButton("");
		button.setToolTipText("\u05DE\u05DC\u05E4\u05E4\u05D5\u05DF");
		button.setBounds(120, 11, 100, 100);
		Image mel= new ImageIcon(this.getClass().getResource("/mlafefon.jpg")).getImage();
		button.setIcon(new ImageIcon(mel));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {


				Veg veg= null;
				try {
					veg = (Veg) prod.Get("Veg", 3);
				} catch (CloneNotSupportedException ex) {
					ex.printStackTrace();
				}

				JSlider vegid =new JSlider(0,1000,100);
				vegid.setValue(0);
				JFrame parent = new JFrame();
				 JOptionPane optionPane = new JOptionPane();
				 vegid.setMajorTickSpacing(100);
				 vegid.setMinorTickSpacing(50);
				 vegid.setPaintTicks(true);
				 vegid.setPaintLabels(true);
		         
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
				vegid.setLabelTable(position);
				    optionPane.setMessage(new Object[] { "Select a value: ", vegid });
				    optionPane.setMessageType(JOptionPane.PLAIN_MESSAGE);
				    optionPane.setOptionType(JOptionPane.OK_CANCEL_OPTION);
				    JDialog dialog = optionPane.createDialog(parent,"\u05DE\u05DC\u05E4\u05E4\u05D5\u05DF");
				    dialog.setSize(500, 300);
				    dialog.setVisible(true);
				    
				    //System.out.print(lehemslid.getValue());
				    //bl_bra=bl_bra.Calc(lehemslid.getValue());
				try {
					eat_s.Ate(veg.Calc(vegid.getValue()));
				} catch (IOException ex) {
					ex.printStackTrace();
				}
				//System.out.print(use+"\n");
				
				
			}
		});
	
		veg_page.add(button);
		
		JButton button_1 = new JButton("");
		button_1.setToolTipText("\u05D2\u05D6\u05E8");
		button_1.setBounds(230, 11, 100, 100);
		Image gez= new ImageIcon(this.getClass().getResource("/gezer.jpg")).getImage();
		button_1.setIcon(new ImageIcon(gez));
		
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {


				Veg veg= null;
				try {
					veg = (Veg) prod.Get("Veg", 2);
				} catch (CloneNotSupportedException ex) {
					ex.printStackTrace();
				}

				JSlider vegid =new JSlider(0,1000,100);
				vegid.setValue(0);
				JFrame parent = new JFrame();
				 JOptionPane optionPane = new JOptionPane();
				 vegid.setMajorTickSpacing(100);
				 vegid.setMinorTickSpacing(50);
				 vegid.setPaintTicks(true);
				 vegid.setPaintLabels(true);
		         
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
				vegid.setLabelTable(position);
				    optionPane.setMessage(new Object[] { "Select a value: ", vegid });
				    optionPane.setMessageType(JOptionPane.PLAIN_MESSAGE);
				    optionPane.setOptionType(JOptionPane.OK_CANCEL_OPTION);
				    JDialog dialog = optionPane.createDialog(parent,"\u05D2\u05D6\u05E8");
				    dialog.setSize(500, 300);
				    dialog.setVisible(true);
				    
				    //System.out.print(lehemslid.getValue());
				    //bl_bra=bl_bra.Calc(lehemslid.getValue());
				try {
					eat_s.Ate(veg.Calc(vegid.getValue()));
				} catch (IOException ex) {
					ex.printStackTrace();
				}
				//System.out.print(use+"\n");
				
				
			}
		});
	
		veg_page.add(button_1);
		
		JButton button_2 = new JButton("");
		button_2.setToolTipText("\u05D1\u05E6\u05DC \u05D0\u05D3\u05D5\u05DD");
		button_2.setBounds(340, 11, 100, 100);
		Image quoo= new ImageIcon(this.getClass().getResource("/batsal s.jpg")).getImage();
		button_2.setIcon(new ImageIcon(quoo));
		
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {


				Veg veg= null;
				try {
					veg = (Veg) prod.Get("Veg", 8);
				} catch (CloneNotSupportedException ex) {
					ex.printStackTrace();
				}

				JSlider vegid =new JSlider(0,1000,100);
				vegid.setValue(0);
				JFrame parent = new JFrame();
				 JOptionPane optionPane = new JOptionPane();
				 vegid.setMajorTickSpacing(100);
				 vegid.setMinorTickSpacing(50);
				 vegid.setPaintTicks(true);
				 vegid.setPaintLabels(true);
		         
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
				vegid.setLabelTable(position);
				    optionPane.setMessage(new Object[] { "Select a value: ", vegid });
				    optionPane.setMessageType(JOptionPane.PLAIN_MESSAGE);
				    optionPane.setOptionType(JOptionPane.OK_CANCEL_OPTION);
				    JDialog dialog = optionPane.createDialog(parent,"\u05D1\u05E6\u05DC \u05D0\u05D3\u05D5\u05DD");
				    dialog.setSize(500, 300);
				    dialog.setVisible(true);
				    
				    //System.out.print(lehemslid.getValue());
				    //bl_bra=bl_bra.Calc(lehemslid.getValue());
				try {
					eat_s.Ate(veg.Calc(vegid.getValue()));
				} catch (IOException ex) {
					ex.printStackTrace();
				}
				//System.out.print(use+"\n");
				
				
			}
		});
	
		veg_page.add(button_2);
		
		JButton button_3 = new JButton("");
		button_3.setToolTipText("\u05D1\u05E6\u05DC");
		button_3.setBounds(450, 11, 100, 100);
		Image bars= new ImageIcon(this.getClass().getResource("/batsal.jpg")).getImage();
		button_3.setIcon(new ImageIcon(bars));
		
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {


				Veg veg= null;
				try {
					veg = (Veg) prod.Get("Veg", 7);
				} catch (CloneNotSupportedException ex) {
					ex.printStackTrace();
				}

				JSlider vegid =new JSlider(0,1000,100);
				vegid.setValue(0);
				JFrame parent = new JFrame();
				 JOptionPane optionPane = new JOptionPane();
				 vegid.setMajorTickSpacing(100);
				 vegid.setMinorTickSpacing(50);
				 vegid.setPaintTicks(true);
				 vegid.setPaintLabels(true);
		         
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
				vegid.setLabelTable(position);
				    optionPane.setMessage(new Object[] { "Select a value: ", vegid });
				    optionPane.setMessageType(JOptionPane.PLAIN_MESSAGE);
				    optionPane.setOptionType(JOptionPane.OK_CANCEL_OPTION);
				    JDialog dialog = optionPane.createDialog(parent,"\u05D1\u05E6\u05DC");
				    dialog.setSize(500, 300);
				    dialog.setVisible(true);
				    
				    //System.out.print(lehemslid.getValue());
				    //bl_bra=bl_bra.Calc(lehemslid.getValue());
				try {
					eat_s.Ate(veg.Calc(vegid.getValue()));
				} catch (IOException ex) {
					ex.printStackTrace();
				}
				//System.out.print(use+"\n");
				
				
			}
		});

		veg_page.add(button_3);
		
		JButton button_4 = new JButton("");
		button_4.setToolTipText("\u05D1\u05E6\u05DC \u05D9\u05E8\u05D5\u05E7");
		button_4.setBounds(560, 11, 100, 100);
		Image gree= new ImageIcon(this.getClass().getResource("/batsal g.jpg")).getImage();
		button_4.setIcon(new ImageIcon(gree));
		
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {


				Veg veg= null;
				try {
					veg = (Veg) prod.Get("Veg", 6);
				} catch (CloneNotSupportedException ex) {
					ex.printStackTrace();
				}

				JSlider vegid =new JSlider(0,1000,100);
				vegid.setValue(0);
				JFrame parent = new JFrame();
				 JOptionPane optionPane = new JOptionPane();
				 vegid.setMajorTickSpacing(100);
				 vegid.setMinorTickSpacing(50);
				 vegid.setPaintTicks(true);
				 vegid.setPaintLabels(true);
		         
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
				vegid.setLabelTable(position);
				    optionPane.setMessage(new Object[] { "Select a value: ", vegid });
				    optionPane.setMessageType(JOptionPane.PLAIN_MESSAGE);
				    optionPane.setOptionType(JOptionPane.OK_CANCEL_OPTION);
				    JDialog dialog = optionPane.createDialog(parent,"\u05D1\u05E6\u05DC \u05D9\u05E8\u05D5\u05E7");
				    dialog.setSize(500, 300);
				    dialog.setVisible(true);
				    
				    //System.out.print(lehemslid.getValue());
				    //bl_bra=bl_bra.Calc(lehemslid.getValue());
				try {
					eat_s.Ate(veg.Calc(vegid.getValue()));
				} catch (IOException ex) {
					ex.printStackTrace();
				}
				//System.out.print(use+"\n");
				
				
			}
		});

		veg_page.add(button_4);
		
		JButton button_5 = new JButton("");
		button_5.setToolTipText("\u05EA\u05E4\u05D5\u05D7 \u05E2\u05E5");
		button_5.setBounds(670, 11, 100, 100);
		Image appe= new ImageIcon(this.getClass().getResource("/apples.jpg")).getImage();
		button_5.setIcon(new ImageIcon(appe));
		
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {


				Veg veg= null;
				try {
					veg = (Veg) prod.Get("Veg", 4);
				} catch (CloneNotSupportedException ex) {
					ex.printStackTrace();
				}

				JSlider vegid =new JSlider(0,1000,100);
				vegid.setValue(0);
				JFrame parent = new JFrame();
				 JOptionPane optionPane = new JOptionPane();
				 vegid.setMajorTickSpacing(100);
				 vegid.setMinorTickSpacing(50);
				 vegid.setPaintTicks(true);
				 vegid.setPaintLabels(true);
		         
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
				vegid.setLabelTable(position);
				    optionPane.setMessage(new Object[] { "Select a value: ", vegid });
				    optionPane.setMessageType(JOptionPane.PLAIN_MESSAGE);
				    optionPane.setOptionType(JOptionPane.OK_CANCEL_OPTION);
				    JDialog dialog = optionPane.createDialog(parent,"\u05EA\u05E4\u05D5\u05D7 \u05E2\u05E5");
				    dialog.setSize(500, 300);
				    dialog.setVisible(true);
				    
				    //System.out.print(lehemslid.getValue());
				    //bl_bra=bl_bra.Calc(lehemslid.getValue());
				try {
					eat_s.Ate(veg.Calc(vegid.getValue()));
				} catch (IOException ex) {
					ex.printStackTrace();
				}
				//System.out.print(use+"\n");
				
				
			}
		});

		veg_page.add(button_5);
		
		JButton button_6 = new JButton("");
		button_6.setToolTipText("\u05DB\u05E8\u05D5\u05D1");
		button_6.setBounds(10, 122, 100, 100);
		Image kru= new ImageIcon(this.getClass().getResource("/kruv.jpg")).getImage();
		button_6.setIcon(new ImageIcon(kru));
		
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {


				Veg veg= null;
				try {
					veg = (Veg) prod.Get("Veg", 1);
				} catch (CloneNotSupportedException ex) {
					ex.printStackTrace();
				}

				JSlider vegid =new JSlider(0,1000,100);
				vegid.setValue(0);
				JFrame parent = new JFrame();
				 JOptionPane optionPane = new JOptionPane();
				 vegid.setMajorTickSpacing(100);
				 vegid.setMinorTickSpacing(50);
				 vegid.setPaintTicks(true);
				 vegid.setPaintLabels(true);
		         
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
				vegid.setLabelTable(position);
				    optionPane.setMessage(new Object[] { "Select a value: ", vegid });
				    optionPane.setMessageType(JOptionPane.PLAIN_MESSAGE);
				    optionPane.setOptionType(JOptionPane.OK_CANCEL_OPTION);
				    JDialog dialog = optionPane.createDialog(parent,"\u05DB\u05E8\u05D5\u05D1");
				    dialog.setSize(500, 300);
				    dialog.setVisible(true);
				    
				    //System.out.print(lehemslid.getValue());
				    //bl_bra=bl_bra.Calc(lehemslid.getValue());
				try {
					eat_s.Ate(veg.Calc(vegid.getValue()));
				} catch (IOException ex) {
					ex.printStackTrace();
				}
				//System.out.print(use+"\n");
				
				
			}
		});

		veg_page.add(button_6);
		
		JButton button_7 = new JButton("");
		button_7.setToolTipText("\u05D7\u05E6\u05D9\u05DC");
		button_7.setBounds(120, 122, 100, 100);
		Image hisi= new ImageIcon(this.getClass().getResource("/hatsil.jpg")).getImage();
		button_7.setIcon(new ImageIcon(hisi));
		
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {


				Veg veg= null;
				try {
					veg = (Veg) prod.Get("Veg", 5);
				} catch (CloneNotSupportedException ex) {
					ex.printStackTrace();
				}

				JSlider vegid =new JSlider(0,1000,100);
				vegid.setValue(0);
				JFrame parent = new JFrame();
				 JOptionPane optionPane = new JOptionPane();
				 vegid.setMajorTickSpacing(100);
				 vegid.setMinorTickSpacing(50);
				 vegid.setPaintTicks(true);
				 vegid.setPaintLabels(true);
		         
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
				vegid.setLabelTable(position);
				    optionPane.setMessage(new Object[] { "Select a value: ", vegid });
				    optionPane.setMessageType(JOptionPane.PLAIN_MESSAGE);
				    optionPane.setOptionType(JOptionPane.OK_CANCEL_OPTION);
				    JDialog dialog = optionPane.createDialog(parent,"\u05E4\u05E1\u05D8\u05D4");
				    dialog.setSize(500, 300);
				    dialog.setVisible(true);
				    
				    //System.out.print(lehemslid.getValue());
				    //bl_bra=bl_bra.Calc(lehemslid.getValue());
				try {
					eat_s.Ate(veg.Calc(vegid.getValue()));
				} catch (IOException ex) {
					ex.printStackTrace();
				}
				//System.out.print(use+"\n");
				
				
			}
		});

		veg_page.add(button_7);
		
		JButton button_8 = new JButton("");
		button_8.setToolTipText("\u05D3\u05DC\u05E2\u05EA");
		button_8.setBounds(230, 122, 100, 100);
		Image dluat= new ImageIcon(this.getClass().getResource("/dlaat.jpg")).getImage();
		button_8.setIcon(new ImageIcon(dluat));
		
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {


				Veg veg= null;
				try {
					veg = (Veg) prod.Get("Veg", 12);
				} catch (CloneNotSupportedException ex) {
					ex.printStackTrace();
				}

				JSlider vegid =new JSlider(0,1000,100);
				vegid.setValue(0);
				JFrame parent = new JFrame();
				 JOptionPane optionPane = new JOptionPane();
				 vegid.setMajorTickSpacing(100);
				 vegid.setMinorTickSpacing(50);
				 vegid.setPaintTicks(true);
				 vegid.setPaintLabels(true);
		         
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
				vegid.setLabelTable(position);
				    optionPane.setMessage(new Object[] { "Select a value: ", vegid });
				    optionPane.setMessageType(JOptionPane.PLAIN_MESSAGE);
				    optionPane.setOptionType(JOptionPane.OK_CANCEL_OPTION);
				    JDialog dialog = optionPane.createDialog(parent,"\u05D3\u05DC\u05E2\u05EA");
				    dialog.setSize(500, 300);
				    dialog.setVisible(true);
				    
				    //System.out.print(lehemslid.getValue());
				    //bl_bra=bl_bra.Calc(lehemslid.getValue());
				try {
					eat_s.Ate(veg.Calc(vegid.getValue()));
				} catch (IOException ex) {
					ex.printStackTrace();
				}
				//System.out.print(use+"\n");
				
				
			}
		});

		veg_page.add(button_8);
		
		JButton button_9 = new JButton("");
		button_9.setToolTipText("\u05E9\u05D5\u05DD");
		button_9.setBounds(340, 122, 100, 100);
		Image shum= new ImageIcon(this.getClass().getResource("/shum.jpg")).getImage();
		button_9.setIcon(new ImageIcon(shum));
		
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {


				Veg veg= null;
				try {
					veg = (Veg) prod.Get("Veg", 15);
				} catch (CloneNotSupportedException ex) {
					ex.printStackTrace();
				}

				JSlider vegid =new JSlider(0,1000,100);
				vegid.setValue(0);
				JFrame parent = new JFrame();
				 JOptionPane optionPane = new JOptionPane();
				 vegid.setMajorTickSpacing(100);
				 vegid.setMinorTickSpacing(50);
				 vegid.setPaintTicks(true);
				 vegid.setPaintLabels(true);
		         
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
				vegid.setLabelTable(position);
				    optionPane.setMessage(new Object[] { "Select a value: ", vegid });
				    optionPane.setMessageType(JOptionPane.PLAIN_MESSAGE);
				    optionPane.setOptionType(JOptionPane.OK_CANCEL_OPTION);
				    JDialog dialog = optionPane.createDialog(parent,"\u05E9\u05D5\u05DD");
				    dialog.setSize(500, 300);
				    dialog.setVisible(true);
				    
				    //System.out.print(lehemslid.getValue());
				    //bl_bra=bl_bra.Calc(lehemslid.getValue());
				try {
					eat_s.Ate(veg.Calc(vegid.getValue()));
				} catch (IOException ex) {
					ex.printStackTrace();
				}
				//System.out.print(use+"\n");
				
				
			}
		});
		
		veg_page.add(button_9);
		
		JButton button_10 = new JButton("");
		button_10.setToolTipText("\u05D1\u05D8\u05D8\u05D4");
		button_10.setBounds(450, 122, 100, 100);
		Image batat= new ImageIcon(this.getClass().getResource("/batata.jpg")).getImage();
		button_10.setIcon(new ImageIcon(batat));
		
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {


				Veg veg= null;
				try {
					veg = (Veg) prod.Get("Veg", 13);
				} catch (CloneNotSupportedException ex) {
					ex.printStackTrace();
				}

				JSlider vegid =new JSlider(0,1000,100);
				vegid.setValue(0);
				JFrame parent = new JFrame();
				 JOptionPane optionPane = new JOptionPane();
				 vegid.setMajorTickSpacing(100);
				 vegid.setMinorTickSpacing(50);
				 vegid.setPaintTicks(true);
				 vegid.setPaintLabels(true);
		         
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
				vegid.setLabelTable(position);
				    optionPane.setMessage(new Object[] { "Select a value: ", vegid });
				    optionPane.setMessageType(JOptionPane.PLAIN_MESSAGE);
				    optionPane.setOptionType(JOptionPane.OK_CANCEL_OPTION);
				    JDialog dialog = optionPane.createDialog(parent,"\u05D1\u05D8\u05D8\u05D4");
				    dialog.setSize(500, 300);
				    dialog.setVisible(true);
				    
				    //System.out.print(lehemslid.getValue());
				    //bl_bra=bl_bra.Calc(lehemslid.getValue());
				try {
					eat_s.Ate(veg.Calc(vegid.getValue()));
				} catch (IOException ex) {
					ex.printStackTrace();
				}
				//System.out.print(use+"\n");
				
				
			}
		});
	
		veg_page.add(button_10);
		
		JButton button_11 = new JButton("");
		button_11.setToolTipText("\u05D1\u05E0\u05E0\u05D4");
		button_11.setBounds(560, 122, 100, 100);
		Image bana= new ImageIcon(this.getClass().getResource("/banana.jpg")).getImage();
		button_11.setIcon(new ImageIcon(bana));
		
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {


				Veg veg= null;
				try {
					veg = (Veg) prod.Get("Veg", 14);
				} catch (CloneNotSupportedException ex) {
					ex.printStackTrace();
				}

				JSlider vegid =new JSlider(0,1000,100);
				vegid.setValue(0);
				JFrame parent = new JFrame();
				 JOptionPane optionPane = new JOptionPane();
				 vegid.setMajorTickSpacing(100);
				 vegid.setMinorTickSpacing(50);
				 vegid.setPaintTicks(true);
				 vegid.setPaintLabels(true);
		         
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
				vegid.setLabelTable(position);
				    optionPane.setMessage(new Object[] { "Select a value: ", vegid });
				    optionPane.setMessageType(JOptionPane.PLAIN_MESSAGE);
				    optionPane.setOptionType(JOptionPane.OK_CANCEL_OPTION);
				    JDialog dialog = optionPane.createDialog(parent,"\u05D1\u05E0\u05E0\u05D4");
				    dialog.setSize(500, 300);
				    dialog.setVisible(true);
				    
				    //System.out.print(lehemslid.getValue());
				    //bl_bra=bl_bra.Calc(lehemslid.getValue());
				try {
					eat_s.Ate(veg.Calc(vegid.getValue()));
				} catch (IOException ex) {
					ex.printStackTrace();
				}
				//System.out.print(use+"\n");
				
				
			}
		});

		veg_page.add(button_11);
		
		JButton button_12 = new JButton("");
		button_12.setToolTipText("\u05DE\u05DC\u05D5\u05DF");
		button_12.setBounds(670, 122, 100, 100);
		Image melo= new ImageIcon(this.getClass().getResource("/melon.jpg")).getImage();
		button_12.setIcon(new ImageIcon(melo));
		
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {


				Veg veg= null;
				try {
					veg = (Veg) prod.Get("Veg", 10);
				} catch (CloneNotSupportedException ex) {
					ex.printStackTrace();
				}

				JSlider vegid =new JSlider(0,1000,100);
				vegid.setValue(0);
				JFrame parent = new JFrame();
				 JOptionPane optionPane = new JOptionPane();
				 vegid.setMajorTickSpacing(100);
				 vegid.setMinorTickSpacing(50);
				 vegid.setPaintTicks(true);
				 vegid.setPaintLabels(true);
		         
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
				vegid.setLabelTable(position);
				    optionPane.setMessage(new Object[] { "Select a value: ", vegid });
				    optionPane.setMessageType(JOptionPane.PLAIN_MESSAGE);
				    optionPane.setOptionType(JOptionPane.OK_CANCEL_OPTION);
				    JDialog dialog = optionPane.createDialog(parent,"\u05DE\u05DC\u05D5\u05DF");
				    dialog.setSize(500, 300);
				    dialog.setVisible(true);
				    
				    //System.out.print(lehemslid.getValue());
				    //bl_bra=bl_bra.Calc(lehemslid.getValue());
				try {
					eat_s.Ate(veg.Calc(vegid.getValue()));
				} catch (IOException ex) {
					ex.printStackTrace();
				}
				//System.out.print(use+"\n");
				
				
			}
		});
	
		veg_page.add(button_12);
		
		JButton button_13 = new JButton("");
		button_13.setToolTipText("\u05EA\u05E4\u05D5\u05D6");
		button_13.setBounds(10, 234, 100, 100);
		Image tupu= new ImageIcon(this.getClass().getResource("/tabuz.jpg")).getImage();
		button_13.setIcon(new ImageIcon(tupu));
		
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {


				Veg veg= null;
				try {
					veg = (Veg) prod.Get("Veg", 9);
				} catch (CloneNotSupportedException ex) {
					ex.printStackTrace();
				}

				JSlider vegid =new JSlider(0,1000,100);
				vegid.setValue(0);
				JFrame parent = new JFrame();
				 JOptionPane optionPane = new JOptionPane();
				 vegid.setMajorTickSpacing(100);
				 vegid.setMinorTickSpacing(50);
				 vegid.setPaintTicks(true);
				 vegid.setPaintLabels(true);
		         
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
				vegid.setLabelTable(position);
				    optionPane.setMessage(new Object[] { "Select a value: ", vegid });
				    optionPane.setMessageType(JOptionPane.PLAIN_MESSAGE);
				    optionPane.setOptionType(JOptionPane.OK_CANCEL_OPTION);
				    JDialog dialog = optionPane.createDialog(parent,"\u05EA\u05E4\u05D5\u05D6");
				    dialog.setSize(500, 300);
				    dialog.setVisible(true);
				    
				    //System.out.print(lehemslid.getValue());
				    //bl_bra=bl_bra.Calc(lehemslid.getValue());
				try {
					eat_s.Ate(veg.Calc(vegid.getValue()));
				} catch (IOException ex) {
					ex.printStackTrace();
				}
				//System.out.print(use+"\n");
				
				
			}
		});
	
		veg_page.add(button_13);
		
		JButton button_14 = new JButton("");
		button_14.setToolTipText("\u05D0\u05E0\u05E0\u05E1");
		button_14.setBounds(120, 233, 100, 100);
		Image anas= new ImageIcon(this.getClass().getResource("/ananas.jpg")).getImage();
		button_14.setIcon(new ImageIcon(anas));
		
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {


				Veg veg= null;
				try {
					veg = (Veg) prod.Get("Veg", 11);
				} catch (CloneNotSupportedException ex) {
					ex.printStackTrace();
				}

				JSlider vegid =new JSlider(0,1000,100);
				vegid.setValue(0);
				JFrame parent = new JFrame();
				 JOptionPane optionPane = new JOptionPane();
				 vegid.setMajorTickSpacing(100);
				 vegid.setMinorTickSpacing(50);
				 vegid.setPaintTicks(true);
				 vegid.setPaintLabels(true);
		         
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
				vegid.setLabelTable(position);
				    optionPane.setMessage(new Object[] { "Select a value: ", vegid });
				    optionPane.setMessageType(JOptionPane.PLAIN_MESSAGE);
				    optionPane.setOptionType(JOptionPane.OK_CANCEL_OPTION);
				    JDialog dialog = optionPane.createDialog(parent,"\u05D0\u05E0\u05E0\u05E1");
				    dialog.setSize(500, 300);
				    dialog.setVisible(true);
				    
				    //System.out.print(lehemslid.getValue());
				    //bl_bra=bl_bra.Calc(lehemslid.getValue());
				try {
					eat_s.Ate(veg.Calc(vegid.getValue()));
				} catch (IOException ex) {
					ex.printStackTrace();
				}
				//System.out.print(use+"\n");
				
				
			}
		});
	
		veg_page.add(button_14);
		
		JLabel lblNewLabel_55 = new JLabel("");
		Image veg_gif = new ImageIcon(this.getClass().getResource("/veg_gif.gif")).getImage();
		lblNewLabel_55.setIcon (new ImageIcon(veg_gif));
		lblNewLabel_55.setBounds(0, 0, 846, 516);
		veg_page.add(lblNewLabel_55);
		
		
		
		JPanel Junk_Food_page = new JPanel();
		Junk_Food_page.setBackground(new Color(233,52,74));
		frame.getContentPane().add(Junk_Food_page, "name_31478926767500");
		Junk_Food_page.setLayout(null);
		
		JButton btnNewButton_18 = new JButton("");
		btnNewButton_18.setToolTipText("\u05E4\u05D9\u05E6\u05D4");
		btnNewButton_18.setBounds(10, 11, 100, 100);
		
		Image pizza= new ImageIcon(this.getClass().getResource("/pizza.jpg")).getImage();
		btnNewButton_18.setIcon(new ImageIcon(pizza));
		btnNewButton_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Junk_Food piza= null;
				try {
					piza = (Junk_Food) prod.Get("Junk Food", 0);
				} catch (CloneNotSupportedException ex) {
					ex.printStackTrace();
				}

				JSlider pizid =new JSlider(0,1000,100);
				pizid.setValue(0);
				JFrame parent = new JFrame();
				 JOptionPane optionPane = new JOptionPane();
				 pizid.setMajorTickSpacing(100);
				 pizid.setMinorTickSpacing(50);
				 pizid.setPaintTicks(true);
				 pizid.setPaintLabels(true);
		         
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
				pizid.setLabelTable(position);
				    optionPane.setMessage(new Object[] { "Select a value: ", pizid });
				    optionPane.setMessageType(JOptionPane.PLAIN_MESSAGE);
				    optionPane.setOptionType(JOptionPane.OK_CANCEL_OPTION);
				    JDialog dialog = optionPane.createDialog(parent,"\u05E4\u05D9\u05E6\u05D4");
				    dialog.setSize(500, 300);
				    dialog.setVisible(true);
				    
				    //System.out.print(lehemslid.getValue());
				    //bl_bra=bl_bra.Calc(lehemslid.getValue());
				try {
					eat_s.Ate(piza.Calc(pizid.getValue()));
				} catch (IOException ex) {
					ex.printStackTrace();
				}
				//System.out.print(use+"\n");
				
			}
		});
	
		Junk_Food_page.add(btnNewButton_18);
		
		JButton btnNewButton_19 = new JButton("");
		btnNewButton_19.setToolTipText("\u05D4\u05DE\u05D1\u05D5\u05E8\u05D2\u05E8");
		btnNewButton_19.setBounds(120, 11, 100, 100);
		Image burger= new ImageIcon(this.getClass().getResource("/burger.jpg")).getImage();
		btnNewButton_19.setIcon(new ImageIcon(burger));
		
		btnNewButton_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Junk_Food bur= null;
				try {
					bur = (Junk_Food) prod.Get("Junk Food", 1);
				} catch (CloneNotSupportedException ex) {
					ex.printStackTrace();
				}

				JSlider burid =new JSlider(0,1000,100);
				burid.setValue(0);
				JFrame parent = new JFrame();
				 JOptionPane optionPane = new JOptionPane();
				 burid.setMajorTickSpacing(100);
				 burid.setMinorTickSpacing(50);
				 burid.setPaintTicks(true);
				 burid.setPaintLabels(true);
		         
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
				burid.setLabelTable(position);
				    optionPane.setMessage(new Object[] { "Select a value: ", burid });
				    optionPane.setMessageType(JOptionPane.PLAIN_MESSAGE);
				    optionPane.setOptionType(JOptionPane.OK_CANCEL_OPTION);
				    JDialog dialog = optionPane.createDialog(parent,"\u05D4\u05DE\u05D1\u05D5\u05E8\u05D2\u05E8");
				    dialog.setSize(500, 300);
				    dialog.setVisible(true);
				    
				    //System.out.print(lehemslid.getValue());
				    //bl_bra=bl_bra.Calc(lehemslid.getValue());
				try {
					eat_s.Ate(bur.Calc(burid.getValue()));
				} catch (IOException ex) {
					ex.printStackTrace();
				}
				//System.out.print(use+"\n");
				
			}
		});
	
		Junk_Food_page.add(btnNewButton_19);
		
		JButton btnNewButton_20 = new JButton("");
		btnNewButton_20.setToolTipText("\u05E6'\u05D9\u05E4\u05E1");
		btnNewButton_20.setBounds(230, 11, 100, 100);
		Image chips= new ImageIcon(this.getClass().getResource("/chips.jpg")).getImage();
		btnNewButton_20.setIcon(new ImageIcon(chips));
		btnNewButton_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Junk_Food fri= null;
				try {
					fri = (Junk_Food) prod.Get("Junk Food", 2);
				} catch (CloneNotSupportedException ex) {
					ex.printStackTrace();
				}

				JSlider friid =new JSlider(0,1000,100);
				friid.setValue(0);
				JFrame parent = new JFrame();
				 JOptionPane optionPane = new JOptionPane();
				 friid.setMajorTickSpacing(100);
				 friid.setMinorTickSpacing(50);
				 friid.setPaintTicks(true);
				 friid.setPaintLabels(true);
		         
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
				friid.setLabelTable(position);
				    optionPane.setMessage(new Object[] { "Select a value: ", friid });
				    optionPane.setMessageType(JOptionPane.PLAIN_MESSAGE);
				    optionPane.setOptionType(JOptionPane.OK_CANCEL_OPTION);
				    JDialog dialog = optionPane.createDialog(parent,"\u05E6'\u05D9\u05E4\u05E1");
				    dialog.setSize(500, 300);
				    dialog.setVisible(true);
				    
				    //System.out.print(lehemslid.getValue());
				    //bl_bra=bl_bra.Calc(lehemslid.getValue());
				try {
					eat_s.Ate(fri.Calc(friid.getValue()));
				} catch (IOException ex) {
					ex.printStackTrace();
				}
				//System.out.print(use+"\n");
				
			}
		});
	
		Junk_Food_page.add(btnNewButton_20);
		
		JButton btnNewButton_21 = new JButton("");
		btnNewButton_21.setToolTipText("\u05E1\u05D5\u05E9\u05D9");
		btnNewButton_21.setBounds(340, 11, 100, 100);
		/*
		Image foo1= new ImageIcon(this.getClass().getResource("/159059408251378162.png")).getImage();
		add_new_food_Button.setIcon(new ImageIcon(foo1));*/
		Image sushi= new ImageIcon(this.getClass().getResource("/sushi100.jpg")).getImage();
		btnNewButton_21.setIcon(new ImageIcon(sushi));
		btnNewButton_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Junk_Food susi= null;
				try {
					susi = (Junk_Food) prod.Get("Junk Food", 3);
				} catch (CloneNotSupportedException ex) {
					ex.printStackTrace();
				}

				JSlider susiid =new JSlider(0,1000,100);
				susiid.setValue(0);
				JFrame parent = new JFrame();
				 JOptionPane optionPane = new JOptionPane();
				 susiid.setMajorTickSpacing(100);
				 susiid.setMinorTickSpacing(50);
				 susiid.setPaintTicks(true);
				 susiid.setPaintLabels(true);
		         
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
				susiid.setLabelTable(position);
				    optionPane.setMessage(new Object[] { "Select a value: ", susiid });
				    optionPane.setMessageType(JOptionPane.PLAIN_MESSAGE);
				    optionPane.setOptionType(JOptionPane.OK_CANCEL_OPTION);
				    JDialog dialog = optionPane.createDialog(parent,"\u05E1\u05D5\u05E9\u05D9");
				    dialog.setSize(500, 300);
				    dialog.setVisible(true);
				    
				    //System.out.print(lehemslid.getValue());
				    //bl_bra=bl_bra.Calc(lehemslid.getValue());
				try {
					eat_s.Ate(susi.Calc(susiid.getValue()));
				} catch (IOException ex) {
					ex.printStackTrace();
				}
				//System.out.print(use+"\n");
				
			}
		});
		Junk_Food_page.add(btnNewButton_21);
		
		JButton btnNewButton_32 = new JButton("\u05D7\u05D6\u05D5\u05E8");
		btnNewButton_32.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Junk_Food_page.setVisible(false);
				ate_food_page.setVisible(true);
				
			}
		});
		btnNewButton_32.setBounds(747, 482, 89, 23);
		Junk_Food_page.add(btnNewButton_32);
		
		JLabel lblNewLabel_56 = new JLabel("");
		Image junk = new ImageIcon(this.getClass().getResource("/junk_food_gif.gif")).getImage();
		lblNewLabel_56.setIcon (new ImageIcon(junk));
		lblNewLabel_56.setBounds(20, 122, 826, 474);
		Junk_Food_page.add(lblNewLabel_56);
		
		
		
		
		JPanel Meat_Fish_Dai_page = new JPanel();
		Meat_Fish_Dai_page.setBackground(new Color(242,163,94));
		frame.getContentPane().add(Meat_Fish_Dai_page, "name_31571261321900");
		Meat_Fish_Dai_page.setLayout(null);
		
		JButton btnNewButton_22 = new JButton("");
		btnNewButton_22.setToolTipText("\u05E2\u05D5\u05E3 \u05E6\u05DC\u05D5\u05D9");
		btnNewButton_22.setBounds(10, 11, 100, 100);
		Image chik= new ImageIcon(this.getClass().getResource("/chicken.jpg")).getImage();
		btnNewButton_22.setIcon(new ImageIcon(chik));
		btnNewButton_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Meat_Fish_Dai r_chic= null;
				try {
					r_chic = (Meat_Fish_Dai) prod.Get("x", 1);
				} catch (CloneNotSupportedException ex) {
					ex.printStackTrace();
				}

				JSlider r_chicid =new JSlider(0,1000,100);
				r_chicid.setValue(0);
				JFrame parent = new JFrame();
				 JOptionPane optionPane = new JOptionPane();
				 r_chicid.setMajorTickSpacing(100);
				 r_chicid.setMinorTickSpacing(50);
				 r_chicid.setPaintTicks(true);
				 r_chicid.setPaintLabels(true);
		         
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
				r_chicid.setLabelTable(position);
				    optionPane.setMessage(new Object[] { "Select a value: ", r_chicid });
				    optionPane.setMessageType(JOptionPane.PLAIN_MESSAGE);
				    optionPane.setOptionType(JOptionPane.OK_CANCEL_OPTION);
				    JDialog dialog = optionPane.createDialog(parent,"\u05E2\u05D5\u05E3 \u05E6\u05DC\u05D5\u05D9");
				    dialog.setSize(500, 300);
				    dialog.setVisible(true);
				    
				    //System.out.print(lehemslid.getValue());
				    //bl_bra=bl_bra.Calc(lehemslid.getValue());
				try {
					eat_s.Ate(r_chic.Calc(r_chicid.getValue()));
				} catch (IOException ex) {
					ex.printStackTrace();
				}
				//System.out.print(use+"\n");
				
			}
		});
		
		Meat_Fish_Dai_page.add(btnNewButton_22);
		
		JButton btnNewButton_23 = new JButton("");
		btnNewButton_23.setToolTipText("\u05D1\u05E7\u05E8 \u05DE\u05D8\u05D5\u05D2\u05DF");
		btnNewButton_23.setBounds(120, 11, 100, 100);
		Image beef= new ImageIcon(this.getClass().getResource("/beef  roast.jpg")).getImage();
		btnNewButton_23.setIcon(new ImageIcon(beef));
		
		btnNewButton_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Meat_Fish_Dai r_beef= null;
				try {
					r_beef = (Meat_Fish_Dai) prod.Get("x", 0);
				} catch (CloneNotSupportedException ex) {
					ex.printStackTrace();
				}

				JSlider r_beefid =new JSlider(0,1000,100);
				r_beefid.setValue(0);
				JFrame parent = new JFrame();
				 JOptionPane optionPane = new JOptionPane();
				 r_beefid.setMajorTickSpacing(100);
				 r_beefid.setMinorTickSpacing(50);
				 r_beefid.setPaintTicks(true);
				 r_beefid.setPaintLabels(true);
		         
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
				r_beefid.setLabelTable(position);
				    optionPane.setMessage(new Object[] { "Select a value: ", r_beefid });
				    optionPane.setMessageType(JOptionPane.PLAIN_MESSAGE);
				    optionPane.setOptionType(JOptionPane.OK_CANCEL_OPTION);
				    JDialog dialog = optionPane.createDialog(parent,"\u05D1\u05E7\u05E8 \u05DE\u05D8\u05D5\u05D2\u05DF");
				    dialog.setSize(500, 300);
				    dialog.setVisible(true);
				    
				    //System.out.print(lehemslid.getValue());
				    //bl_bra=bl_bra.Calc(lehemslid.getValue());
				try {
					eat_s.Ate(r_beef.Calc(r_beefid.getValue()));
				} catch (IOException ex) {
					ex.printStackTrace();
				}
				//System.out.print(use+"\n");
				
				
			}
		});
		
		Meat_Fish_Dai_page.add(btnNewButton_23);
		
		JButton btnNewButton_24 = new JButton("");
		btnNewButton_24.setToolTipText("\u05D1\u05E8\u05D5\u05D5\u05D6 \u05E6\u05DC\u05D5\u05D9");
		btnNewButton_24.setBounds(230, 11, 100, 100);
		Image duck= new ImageIcon(this.getClass().getResource("/roast-duck.jpg")).getImage();
		btnNewButton_24.setIcon(new ImageIcon(duck));
		btnNewButton_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Meat_Fish_Dai r_duck= null;
				try {
					r_duck = (Meat_Fish_Dai) prod.Get("x", 2);
				} catch (CloneNotSupportedException ex) {
					ex.printStackTrace();
				}

				JSlider r_duckid =new JSlider(0,1000,100);
				r_duckid.setValue(0);
				JFrame parent = new JFrame();
				 JOptionPane optionPane = new JOptionPane();
				 r_duckid.setMajorTickSpacing(100);
				 r_duckid.setMinorTickSpacing(50);
				 r_duckid.setPaintTicks(true);
				 r_duckid.setPaintLabels(true);
		         
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
				r_duckid.setLabelTable(position);
				    optionPane.setMessage(new Object[] { "Select a value: ", r_duckid });
				    optionPane.setMessageType(JOptionPane.PLAIN_MESSAGE);
				    optionPane.setOptionType(JOptionPane.OK_CANCEL_OPTION);
				    JDialog dialog = optionPane.createDialog(parent,"\u05D1\u05E8\u05D5\u05D5\u05D6 \u05E6\u05DC\u05D5\u05D9");
				    dialog.setSize(500, 300);
				    dialog.setVisible(true);
				    
				    //System.out.print(lehemslid.getValue());
				    //bl_bra=bl_bra.Calc(lehemslid.getValue());
				try {
					eat_s.Ate(r_duck.Calc(r_duckid.getValue()));
				} catch (IOException ex) {
					ex.printStackTrace();
				}
				//System.out.print(use+"\n");
				
				
				
			}
		});
		
		Meat_Fish_Dai_page.add(btnNewButton_24);
		
		JButton btnNewButton_25 = new JButton("");
		btnNewButton_25.setToolTipText("\u05DB\u05D1\u05E9 \u05E6\u05DC\u05D5\u05D9");
		btnNewButton_25.setBounds(340, 11, 100, 100);
		Image ship= new ImageIcon(this.getClass().getResource("/lamb-and-mutton-roast.jpg")).getImage();
		btnNewButton_25.setIcon(new ImageIcon(ship));
		btnNewButton_25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Meat_Fish_Dai r_lamp= null;
				try {
					r_lamp = (Meat_Fish_Dai) prod.Get("x", 3);
				} catch (CloneNotSupportedException ex) {
					ex.printStackTrace();
				}

				JSlider r_lampid =new JSlider(0,1000,100);
				r_lampid.setValue(0);
				JFrame parent = new JFrame();
				 JOptionPane optionPane = new JOptionPane();
				 r_lampid.setMajorTickSpacing(100);
				 r_lampid.setMinorTickSpacing(50);
				 r_lampid.setPaintTicks(true);
				 r_lampid.setPaintLabels(true);
		         
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
				r_lampid.setLabelTable(position);
				    optionPane.setMessage(new Object[] { "Select a value: ", r_lampid });
				    optionPane.setMessageType(JOptionPane.PLAIN_MESSAGE);
				    optionPane.setOptionType(JOptionPane.OK_CANCEL_OPTION);
				    JDialog dialog = optionPane.createDialog(parent,"\u05DB\u05D1\u05E9 \u05E6\u05DC\u05D5\u05D9");
				    dialog.setSize(500, 300);
				    dialog.setVisible(true);
				    
				    //System.out.print(lehemslid.getValue());
				    //bl_bra=bl_bra.Calc(lehemslid.getValue());
				try {
					eat_s.Ate(r_lamp.Calc(r_lampid.getValue()));
				} catch (IOException ex) {
					ex.printStackTrace();
				}
				//System.out.print(use+"\n");
				
				
			}
		});
		
		Meat_Fish_Dai_page.add(btnNewButton_25);
		
		JButton btnNewButton_26 = new JButton("");
		btnNewButton_26.setToolTipText("\u05D3\u05D2 \u05D0\u05DE\u05E0\u05D5\u05DF \u05E6\u05DC\u05D5\u05D9");
		btnNewButton_26.setBounds(450, 11, 100, 100);
		Image amnon= new ImageIcon(this.getClass().getResource("/amnon-roast.jpg")).getImage();
		btnNewButton_26.setIcon(new ImageIcon(amnon));
		btnNewButton_26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Meat_Fish_Dai r_til= null;
				try {
					r_til = (Meat_Fish_Dai) prod.Get("x", 4);
				} catch (CloneNotSupportedException ex) {
					ex.printStackTrace();
				}

				JSlider r_tilid =new JSlider(0,1000,100);
				r_tilid.setValue(0);
				JFrame parent = new JFrame();
				 JOptionPane optionPane = new JOptionPane();
				 r_tilid.setMajorTickSpacing(100);
				 r_tilid.setMinorTickSpacing(50);
				 r_tilid.setPaintTicks(true);
				 r_tilid.setPaintLabels(true);
		         
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
				r_tilid.setLabelTable(position);
				    optionPane.setMessage(new Object[] { "Select a value: ", r_tilid });
				    optionPane.setMessageType(JOptionPane.PLAIN_MESSAGE);
				    optionPane.setOptionType(JOptionPane.OK_CANCEL_OPTION);
				    JDialog dialog = optionPane.createDialog(parent,"\u05D3\u05D2 \u05D0\u05DE\u05E0\u05D5\u05DF \u05E6\u05DC\u05D5\u05D9");
				    dialog.setSize(500, 300);
				    dialog.setVisible(true);
				    
				    //System.out.print(lehemslid.getValue());
				    //bl_bra=bl_bra.Calc(lehemslid.getValue());
				try {
					eat_s.Ate(r_til.Calc(r_tilid.getValue()));
				} catch (IOException ex) {
					ex.printStackTrace();
				}
				//System.out.print(use+"\n");
				
				
			}
		});
		
		Meat_Fish_Dai_page.add(btnNewButton_26);
		
		JButton btnNewButton_27 = new JButton("");
		btnNewButton_27.setToolTipText("\u05E1\u05DC\u05DE\u05D5\u05DF \u05DE\u05D1\u05D5\u05E9\u05DC");
		btnNewButton_27.setBounds(560, 11, 100, 100);
		Image salsmon= new ImageIcon(this.getClass().getResource("/salmon.jpg")).getImage();
		btnNewButton_27.setIcon(new ImageIcon(salsmon));
		
		btnNewButton_27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Meat_Fish_Dai r_salm= null;
				try {
					r_salm = (Meat_Fish_Dai) prod.Get("x", 4);
				} catch (CloneNotSupportedException ex) {
					ex.printStackTrace();
				}

				JSlider r_salmid =new JSlider(0,1000,100);
				r_salmid.setValue(0);
				JFrame parent = new JFrame();
				 JOptionPane optionPane = new JOptionPane();
				 r_salmid.setMajorTickSpacing(100);
				 r_salmid.setMinorTickSpacing(50);
				 r_salmid.setPaintTicks(true);
				 r_salmid.setPaintLabels(true);
		         
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
				r_salmid.setLabelTable(position);
				    optionPane.setMessage(new Object[] { "Select a value: ", r_salmid });
				    optionPane.setMessageType(JOptionPane.PLAIN_MESSAGE);
				    optionPane.setOptionType(JOptionPane.OK_CANCEL_OPTION);
				    JDialog dialog = optionPane.createDialog(parent,"\u05E1\u05DC\u05DE\u05D5\u05DF \u05DE\u05D1\u05D5\u05E9\u05DC");
				    dialog.setSize(500, 300);
				    dialog.setVisible(true);
				    
				    //System.out.print(lehemslid.getValue());
				    //bl_bra=bl_bra.Calc(lehemslid.getValue());
				try {
					eat_s.Ate(r_salm.Calc(r_salmid.getValue()));
				} catch (IOException ex) {
					ex.printStackTrace();
				}
				//System.out.print(use+"\n");
				    
				
			}
		});
		
		Meat_Fish_Dai_page.add(btnNewButton_27);
		
		JButton btnNewButton_28 = new JButton("");
		btnNewButton_28.setToolTipText("\u05D8\u05D5\u05E0\u05D4 \u05E9\u05DE\u05D5\u05E8\u05D9\u05DD");
		btnNewButton_28.setBounds(676, 11, 100, 100);
		Image tuna= new ImageIcon(this.getClass().getResource("/Tuna.jpg")).getImage();
		btnNewButton_28.setIcon(new ImageIcon(tuna));
		
		btnNewButton_28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Meat_Fish_Dai r_tuna= null;
				try {
					r_tuna = (Meat_Fish_Dai) prod.Get("x", 6);
				} catch (CloneNotSupportedException ex) {
					ex.printStackTrace();
				}

				JSlider r_tunaid =new JSlider(0,1000,100);
				r_tunaid.setValue(0);
				JFrame parent = new JFrame();
				 JOptionPane optionPane = new JOptionPane();
				 r_tunaid.setMajorTickSpacing(100);
				 r_tunaid.setMinorTickSpacing(50);
				 r_tunaid.setPaintTicks(true);
				 r_tunaid.setPaintLabels(true);
		         
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
				r_tunaid.setLabelTable(position);
				    optionPane.setMessage(new Object[] { "Select a value: ", r_tunaid });
				    optionPane.setMessageType(JOptionPane.PLAIN_MESSAGE);
				    optionPane.setOptionType(JOptionPane.OK_CANCEL_OPTION);
				    JDialog dialog = optionPane.createDialog(parent,"\u05D8\u05D5\u05E0\u05D4 \u05E9\u05DE\u05D5\u05E8\u05D9\u05DD");
				    dialog.setSize(500, 300);
				    dialog.setVisible(true);
				    
				    //System.out.print(lehemslid.getValue());
				    //bl_bra=bl_bra.Calc(lehemslid.getValue());
				try {
					eat_s.Ate(r_tuna.Calc(r_tunaid.getValue()));
				} catch (IOException ex) {
					ex.printStackTrace();
				}
				//System.out.print(use+"\n");
				
				
			}
		});
		
		Meat_Fish_Dai_page.add(btnNewButton_28);
		
		JButton btnNewButton_29 = new JButton("");
		btnNewButton_29.setToolTipText("\u05D2\u05D1\u05D9\u05E0\u05D4 \u05D0\u05DE\u05E8\u05D9\u05E7\u05D0\u05D9\u05EA");
		btnNewButton_29.setBounds(10, 122, 100, 100);
		Image chees= new ImageIcon(this.getClass().getResource("/american-cheese.jpg")).getImage();
		btnNewButton_29.setIcon(new ImageIcon(chees));
		
		btnNewButton_29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Meat_Fish_Dai a_chee= null;
				try {
					a_chee = (Meat_Fish_Dai) prod.Get("x", 7);
				} catch (CloneNotSupportedException ex) {
					ex.printStackTrace();
				}

				JSlider a_cheeid =new JSlider(0,1000,100);
				a_cheeid.setValue(0);
				JFrame parent = new JFrame();
				 JOptionPane optionPane = new JOptionPane();
				 a_cheeid.setMajorTickSpacing(100);
				 a_cheeid.setMinorTickSpacing(50);
				 a_cheeid.setPaintTicks(true);
				 a_cheeid.setPaintLabels(true);
		         
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
				a_cheeid.setLabelTable(position);
				    optionPane.setMessage(new Object[] { "Select a value: ", a_cheeid });
				    optionPane.setMessageType(JOptionPane.PLAIN_MESSAGE);
				    optionPane.setOptionType(JOptionPane.OK_CANCEL_OPTION);
				    JDialog dialog = optionPane.createDialog(parent,"\u05D2\u05D1\u05D9\u05E0\u05D4 \u05D0\u05DE\u05E8\u05D9\u05E7\u05D0\u05D9\u05EA");
				    dialog.setSize(500, 300);
				    dialog.setVisible(true);
				    
				    //System.out.print(lehemslid.getValue());
				    //bl_bra=bl_bra.Calc(lehemslid.getValue());
				try {
					eat_s.Ate(a_chee.Calc(a_cheeid.getValue()));
				} catch (IOException ex) {
					ex.printStackTrace();
				}
				//System.out.print(use+"\n");
				
				
			}
		});
		
		Meat_Fish_Dai_page.add(btnNewButton_29);
		
		JButton btnNewButton_30 = new JButton("");
		btnNewButton_30.setToolTipText("\u05E7\u05D5\u05B9\u05D8\u05B6\u05D2'");
		btnNewButton_30.setBounds(120, 122, 100, 100);
		Image kotg= new ImageIcon(this.getClass().getResource("/koteg.jpg")).getImage();
		btnNewButton_30.setIcon(new ImageIcon(kotg));
		
		btnNewButton_30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Meat_Fish_Dai cotege= null;
				try {
					cotege = (Meat_Fish_Dai) prod.Get("x", 8);
				} catch (CloneNotSupportedException ex) {
					ex.printStackTrace();
				}

				JSlider cotegeid =new JSlider(0,1000,100);
				cotegeid.setValue(0);
				JFrame parent = new JFrame();
				 JOptionPane optionPane = new JOptionPane();
				 cotegeid.setMajorTickSpacing(100);
				 cotegeid.setMinorTickSpacing(50);
				 cotegeid.setPaintTicks(true);
				 cotegeid.setPaintLabels(true);
		         
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
				cotegeid.setLabelTable(position);
				    optionPane.setMessage(new Object[] { "Select a value: ", cotegeid });
				    optionPane.setMessageType(JOptionPane.PLAIN_MESSAGE);
				    optionPane.setOptionType(JOptionPane.OK_CANCEL_OPTION);

				    JDialog dialog = optionPane.createDialog(parent,"\u05E7\u05D5\u05B9\u05D8\u05B6\u05D2'");
				    dialog.setSize(500, 300);
				    dialog.setVisible(true);
				    
				    //System.out.print(lehemslid.getValue());
				    //bl_bra=bl_bra.Calc(lehemslid.getValue());
				try {
					eat_s.Ate(cotege.Calc(cotegeid.getValue()));
				} catch (IOException ex) {
					ex.printStackTrace();
				}
				//System.out.print(use+"\n");
				
				
			}
		});
		
		Meat_Fish_Dai_page.add(btnNewButton_30);
		
	
		
		JButton btnNewButton_10 = new JButton("\u05DE\u05E1 \u05E6\u05E2\u05D3\u05D9\u05DD");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JSlider stepss =new JSlider(0,10000,100);
				stepss.setValue(0);
				JFrame parent = new JFrame();
				 JOptionPane optionPane = new JOptionPane();
				 stepss.setMajorTickSpacing(1000);
				 stepss.setMinorTickSpacing(500);
				 stepss.setPaintTicks(true);
				 stepss.setPaintLabels(true);
		         
				// Add positions label in the slider
				Hashtable position1 = new Hashtable();
				position1.put(0, new JLabel("0"));
				position1.put(500, new JLabel("500"));
				position1.put(1000, new JLabel("1000"));
				position1.put(1500, new JLabel("1500"));
				position1.put(2000, new JLabel("2000"));
				position1.put(2500, new JLabel("2500"));
				position1.put(3000, new JLabel("3000"));
				position1.put(3500, new JLabel("3500"));
				position1.put(4000, new JLabel("4000"));
				position1.put(4500, new JLabel("4500"));
				position1.put(5000, new JLabel("5000"));
				position1.put(5500, new JLabel("5500"));
				position1.put(6000, new JLabel("6000"));
				position1.put(6500, new JLabel("6500"));
				position1.put(7000, new JLabel("7000"));
				position1.put(7500, new JLabel("7500"));
				position1.put(8000, new JLabel("8000"));
				position1.put(8500, new JLabel("8500"));
				position1.put(9000, new JLabel("9000"));
				position1.put(9500, new JLabel("9500"));
				position1.put(10000, new JLabel("10000"));
				
				         
				// Set the label to be drawn
				stepss.setLabelTable(position1);
				    optionPane.setMessage(new Object[] { "Select a value: ", stepss });
				    optionPane.setMessageType(JOptionPane.PLAIN_MESSAGE);
				    optionPane.setOptionType(JOptionPane.OK_CANCEL_OPTION);
				    JDialog dialog = optionPane.createDialog(parent,"\u05DE\u05E1 \u05E6\u05E2\u05D3\u05D9\u05DD");
				    dialog.setSize(800, 300);
				    dialog.setVisible(true);
				  //  System.out.println(stepss.getValue());
				    eat_s.Activity(stepss.getValue());
				
			}
		});
		btnNewButton_10.setBounds(10, 11, 100, 100);
		sport_activity_page.add(btnNewButton_10);
		
		JButton btnNewButton_31 = new JButton("\u05D7\u05D6\u05D5\u05E8");
		btnNewButton_31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Meat_Fish_Dai_page.setVisible(false);
				ate_food_page.setVisible(true);
				
			}
		});
		btnNewButton_31.setBounds(747, 482, 89, 23);
		Meat_Fish_Dai_page.add(btnNewButton_31);
		
		JLabel lblNewLabel_58 = new JLabel("");
		Image meat_gif = new ImageIcon(this.getClass().getResource("/meat_gif.gif")).getImage();
		lblNewLabel_58.setIcon (new ImageIcon(meat_gif));
		lblNewLabel_58.setBounds(251, 99, 595, 383);
		Meat_Fish_Dai_page.add(lblNewLabel_58);
		
		

		
		
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
				    optionPane.setMessageType(JOptionPane.PLAIN_MESSAGE);
				    optionPane.setOptionType(JOptionPane.OK_CANCEL_OPTION);
				    JDialog dialog = optionPane.createDialog(parent,"\u05E7\u05DC\u05E8\u05D9\u05D5\u05EA");
				    dialog.setSize(500, 300);
				    dialog.setVisible(true);
				    //System.out.println(stepss.getValue());
				    eat_s.Burned_Calories(Double.valueOf(stepss.getValue()));
				
				
			}
		});
		btnNewButton_11.setBounds(118, 11, 100, 100);
		sport_activity_page.add(btnNewButton_11);
		
		JPanel set_rdata_page = new JPanel();
		set_rdata_page.setBackground(new Color(241,240,241));
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
				

				if(username_set_textField.getText().isEmpty()||
						String.valueOf(passwordField_set.getPassword()).isEmpty() ||
						weight_set_spinner.getValue().toString().equals("1")||
						height_set_spinner.getValue().toString().equals("1")||
						name_set_textField.getText().isEmpty()||
						lastname_set_textField.getText().isEmpty()||
						country_set_textField.getText().isEmpty()||
						city_set_textField.getText().isEmpty() ||
						age_set_spinner.getValue().toString().equals("1"))
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
					log_in_page.setVisible(true);
	
				}	
				
			}
		});
		btnNewButton_12.setBounds(634, 482, 89, 23);
		set_rdata_page.add(btnNewButton_12);
		
		JLabel lblNewLabel_59 = new JLabel("");
		Image update_gif = new ImageIcon(this.getClass().getResource("/update_data_gif1.gif")).getImage();
		lblNewLabel_59.setIcon (new ImageIcon(update_gif));
		lblNewLabel_59.setBounds(-46, 272, 321, 300);
		set_rdata_page.add(lblNewLabel_59);
		
		

		
		log_in_page.setBackground(new Color(42, 200, 125));
		frame.getContentPane().add(log_in_page, "name_830509498735800");
		log_in_page.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u05E9\u05DD \u05DE\u05E9\u05EA\u05DE\u05E9 : ");
		lblNewLabel.setBounds(731, 11, 95, 28);
		log_in_page.add(lblNewLabel);
		JPanel dry_food_page = new JPanel();
		dry_food_page.setBackground(new Color(249,222,189));
		JButton Button_back = new JButton("\u05D7\u05D6\u05E8\u05D4");
		Button_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
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
		
		JButton btnNewButton_5 = new JButton("\u05D9\u05E6\u05D9\u05D0");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			business_page.setVisible(false);
			start_page.setVisible(true);
			}
		});
		btnNewButton_5.setBounds(747, 11, 89, 23);
		business_page.add(btnNewButton_5);
		
		JButton btnNewButton_35 = new JButton("\u05DC\u05E9\u05E0\u05D9\u05D5\u05EA \u05D0\u05EA \u05D4\u05E4\u05E8\u05D8\u05D9\u05DD \u05E9\u05DC\u05D9");
		btnNewButton_35.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				set_bis_rdata_page.setVisible(true);
				bis_name_text_Field.setText(bus_user.Get_Company_Name());
				bis_username_text_Field.setText(bus_user.Get_Username());
				bis_password_Field.setText(bus_user.Get_Password());
				bis_city_text_Field.setText(bus_user.getCountry());
				bis_cuntry_text_Field.setText(bus_user.getCity());
				business_page.setVisible(false);
			}
		});
		btnNewButton_35.setBounds(10, 102, 161, 23);
		business_page.add(btnNewButton_35);
		
		JButton btnNewButton_36 = new JButton("\u05DE\u05D9\u05D9\u05E1 \u05DE\u05D7\u05D9\u05E8\u05D5\u05EA");
		btnNewButton_36.setBounds(10, 45, 161, 23);
		business_page.add(btnNewButton_36);
		
		
		frame.getContentPane().add(Private_User_page, "name_339221586896400");
		Private_User_page.setLayout(null);
		JSpinner cal_spinner = new JSpinner();
		cal_spinner.setBounds(638, 99, 46, 20);
		JRadioButton dro_RadioButton = new JRadioButton("\u05E7\u05D8\u05E0\u05D9\u05D5\u05EA \u05D5\u05DE\u05D0\u05DB\u05DC\u05D9\u05DD \u05D9\u05D1\u05E9\u05D9\u05DD");
		dro_RadioButton.setBackground(new Color(254, 194, 22));
		dro_RadioButton.setBounds(532, 69, 152, 23);
		JRadioButton met_RadioButton = new JRadioButton("\u05D1\u05E9\u05E8 \u05D7\u05DC\u05D1 \u05D3\u05D2\u05D9\u05DD");
		met_RadioButton.setBackground(new Color(254, 194, 22));
		met_RadioButton.setBounds(428, 69, 109, 23);
		JRadioButton junk_RadioButton = new JRadioButton("\u05D7\u05EA\u05D9\u05E4\u05D9\u05DD \u05D5\u05D0\u05DB\u05DC \u05DE\u05E2\u05D9\u05E8");
		junk_RadioButton.setBackground(new Color(254, 194, 22));
		junk_RadioButton.setBounds(307, 69, 119, 23);
		JRadioButton fru_RadioButton = new JRadioButton("\u05E4\u05E8\u05D5\u05EA \u05D5\u05D9\u05E8\u05E7\u05D5\u05EA");
		fru_RadioButton.setBackground(new Color(254, 194, 22));
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
				ads.SetNull();
				
			
			}
		});
		Private_User_page.add(btnNewButton_7);
		
		JLabel lblNewLabel_9 = new JLabel(   "\u05E7\u05DC\u05D5\u05E8\u05D9\u05D5\u05EA: " +0 );
		lblNewLabel_9.setForeground(Color.WHITE);
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_9.setBounds(140, 27, 110, 14);
		Private_User_page.add(lblNewLabel_9);
		
		JLabel lblNewLabel_20 = new JLabel("\u05E0\u05EA\u05E8\u05D0\u05DF: "+0);
		lblNewLabel_20.setForeground(Color.WHITE);
		lblNewLabel_20.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_20.setBounds(140, 53, 110, 14);
		Private_User_page.add(lblNewLabel_20);
		
		JLabel lblNewLabel_20_1 = new JLabel("\u05D7\u05DC\u05D1\u05D5\u05E0\u05D9\u05DD: "+0);
		lblNewLabel_20_1.setForeground(Color.WHITE);
		lblNewLabel_20_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_20_1.setBounds(140, 83, 110, 14);
		Private_User_page.add(lblNewLabel_20_1);
		
		JLabel lblNewLabel_20_2 = new JLabel("\u05E9\u05D5\u05DE\u05E0\u05D9\u05DD: "+0);
		lblNewLabel_20_2.setForeground(Color.WHITE);
		lblNewLabel_20_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_20_2.setBounds(140, 108, 110, 14);
		Private_User_page.add(lblNewLabel_20_2);
		
		JLabel lblNewLabel_20_3 = new JLabel("\u05E7\u05D5\u05DC\u05E1\u05D8\u05E8\u05D5\u05DC: "+0);
		lblNewLabel_20_3.setForeground(Color.WHITE);
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
		lblNewLabel_38.setForeground(Color.WHITE);
		
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
												bus_user=new Bus_User(tokens[0],tokens[1], tokens[2], tokens[3],tokens[4]);
												
												
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
											
											 use = new Private_User(tokens[0], tokens[1],
													Double.parseDouble(tokens[2]),Double.parseDouble(tokens[3]),tokens[4],tokens [5],tokens [6],tokens [7],
													Double.parseDouble(tokens[8]),Integer.parseInt(tokens[9]),Integer.parseInt(tokens[10]));
											  eat_s = new Eating_Stats(use);
											  ads = Ads.getInstance(use);

												if(eat_s.Get_Status_cal()) {
												lblNewLabel_9.setText( "\u05E7\u05DC\u05D5\u05E8\u05D9\u05D5\u05EA: " +Math.floor(eat_s.stats[0]*100)/100 );
												lblNewLabel_9.setForeground(Color.RED);
												}else {lblNewLabel_9.setText( "\u05E7\u05DC\u05D5\u05E8\u05D9\u05D5\u05EA: " +Math.floor(eat_s.stats[0]*100)/100 );}
												
												if(eat_s.Get_Status_sod()) {
												lblNewLabel_20.setText("\u05E0\u05EA\u05E8\u05D0\u05DF: "+Math.floor(eat_s.stats[3]*100)/100);
												lblNewLabel_20.setForeground(Color.RED);
												}else {lblNewLabel_20.setText("\u05E0\u05EA\u05E8\u05D0\u05DF: "+Math.floor(eat_s.stats[3]*100)/100);}
												
												if(eat_s.Get_Status_prot()) {
												lblNewLabel_20_1.setText("\u05D7\u05DC\u05D1\u05D5\u05E0\u05D9\u05DD: "+Math.floor(eat_s.stats[1]*100)/100);
												lblNewLabel_20_1.setForeground(Color.RED);
												}else {lblNewLabel_20_1.setText("\u05D7\u05DC\u05D1\u05D5\u05E0\u05D9\u05DD: "+Math.floor(eat_s.stats[1]*100)/100);}
												
												if(eat_s.Get_Status_fat()) {
												lblNewLabel_20_2.setText("\u05E9\u05D5\u05DE\u05E0\u05D9\u05DD: "+Math.floor(eat_s.stats[4]*100)/100);
												lblNewLabel_20_2.setForeground(Color.RED);
												}else {lblNewLabel_20_2.setText("\u05E9\u05D5\u05DE\u05E0\u05D9\u05DD: "+Math.floor(eat_s.stats[4]*100)/100);}
												
												if(eat_s.Get_Status_co()) {
												lblNewLabel_20_3.setText("\u05E7\u05D5\u05DC\u05E1\u05D8\u05E8\u05D5\u05DC: "+Math.floor(eat_s.stats[2]*100)/100);
												lblNewLabel_20_3.setForeground(Color.RED);
												}else {lblNewLabel_20_3.setText("\u05E7\u05D5\u05DC\u05E1\u05D8\u05E8\u05D5\u05DC: "+Math.floor(eat_s.stats[2]*100)/100);}
												
												if(eat_s.Get_Status_pah()) {
												lblNewLabel_38.setText("\u05E4\u05D7\u05DE\u05D9\u05DE\u05D5\u05EA: "+Math.floor(eat_s.stats[9]*100)/100);
												lblNewLabel_38.setForeground(Color.RED);
												}else {lblNewLabel_38.setText("\u05E4\u05D7\u05DE\u05D9\u05DE\u05D5\u05EA: "+Math.floor(eat_s.stats[9]*100)/100);}
												
											 
											 
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
											 use = new Private_User(tokens[0], tokens[1],
													Double.parseDouble(tokens[2]),Double.parseDouble(tokens[3]),tokens[4],tokens [5],tokens [6],tokens [7],
													Double.parseDouble(tokens[8]),Integer.parseInt(tokens[9]),Integer.parseInt(tokens[10]));
											eat_s =new Eating_Stats(use);
											ads = Ads.getInstance(use);

											if(eat_s.Get_Status_cal()) {
											lblNewLabel_9.setText( "\u05E7\u05DC\u05D5\u05E8\u05D9\u05D5\u05EA: " +Math.floor(eat_s.stats[0]*100)/100 );
											lblNewLabel_9.setForeground(Color.RED);
											}else {lblNewLabel_9.setText( "\u05E7\u05DC\u05D5\u05E8\u05D9\u05D5\u05EA: " +Math.floor(eat_s.stats[0]*100)/100 );}
											
											if(eat_s.Get_Status_sod()) {
											lblNewLabel_20.setText("\u05E0\u05EA\u05E8\u05D0\u05DF: "+Math.floor(eat_s.stats[3]*100)/100);
											lblNewLabel_20.setForeground(Color.RED);
											}else {lblNewLabel_20.setText("\u05E0\u05EA\u05E8\u05D0\u05DF: "+Math.floor(eat_s.stats[3]*100)/100);}
											
											if(eat_s.Get_Status_prot()) {
											lblNewLabel_20_1.setText("\u05D7\u05DC\u05D1\u05D5\u05E0\u05D9\u05DD: "+Math.floor(eat_s.stats[1]*100)/100);
											lblNewLabel_20_1.setForeground(Color.RED);
											}else {lblNewLabel_20_1.setText("\u05D7\u05DC\u05D1\u05D5\u05E0\u05D9\u05DD: "+Math.floor(eat_s.stats[1]*100)/100);}
											
											if(eat_s.Get_Status_fat()) {
											lblNewLabel_20_2.setText("\u05E9\u05D5\u05DE\u05E0\u05D9\u05DD: "+Math.floor(eat_s.stats[4]*100)/100);
											lblNewLabel_20_2.setForeground(Color.RED);
											}else {lblNewLabel_20_2.setText("\u05E9\u05D5\u05DE\u05E0\u05D9\u05DD: "+Math.floor(eat_s.stats[4]*100)/100);}
											
											if(eat_s.Get_Status_co()) {
											lblNewLabel_20_3.setText("\u05E7\u05D5\u05DC\u05E1\u05D8\u05E8\u05D5\u05DC: "+Math.floor(eat_s.stats[2]*100)/100);
											lblNewLabel_20_3.setForeground(Color.RED);
											}else {lblNewLabel_20_3.setText("\u05E7\u05D5\u05DC\u05E1\u05D8\u05E8\u05D5\u05DC: "+Math.floor(eat_s.stats[2]*100)/100);}
											
											if(eat_s.Get_Status_pah()) {
											lblNewLabel_38.setText("\u05E4\u05D7\u05DE\u05D9\u05DE\u05D5\u05EA: "+Math.floor(eat_s.stats[9]*100)/100);
											lblNewLabel_38.setForeground(Color.RED);
											}else {lblNewLabel_38.setText("\u05E4\u05D7\u05DE\u05D9\u05DE\u05D5\u05EA: "+Math.floor(eat_s.stats[9]*100)/100);}
											
											 
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
		Button_page_1.setBounds(10, 11, 118, 23);
		Button_page_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				name_text_Field.setText("");
				password_Field.setText("");
				start_page.setVisible(false);
				log_in_page.setVisible(true);
				name_text_Field.requestFocus();
			}
		});
		start_page.setLayout(null);
		start_page.add(Button_page_1);

		
		JPanel regist_page = new JPanel();
		regist_page.setBackground(new Color(253, 243, 228));
		frame.getContentPane().add(regist_page, "name_830513354330700");
		regist_page.setLayout(null);
		
		JButton Button_page_2 = new JButton("\u05DE\u05D9\u05E9\u05EA\u05DE\u05E9 \u05D7\u05D3\u05E9");
		Button_page_2.setBounds(10, 45, 118, 23);
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
		start_page.add(Button_page_2);
		
		JLabel lblNewLabel_2 = new JLabel("  ");
		lblNewLabel_2.setBounds(109, 0, 543, 320);
		Image runing = new ImageIcon(this.getClass().getResource("/running_on_empty_eran_mendel_dribbble_gif.gif")).getImage();
		lblNewLabel_2.setIcon (new ImageIcon(runing));
		start_page.add(lblNewLabel_2);
		
		JButton btnNewButton_9 = new JButton("New button");
		btnNewButton_9.setBounds(10, 482, 89, 23);
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				start_page.setVisible(false);
				admin_page.setVisible(true);
			}
		});
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
				

				if(username_text_Field.getText().isEmpty()||
						String.valueOf(passwordField.getPassword()).isEmpty()||
						weight_spinner.getValue().toString().equals("1")||
						height_spinner.getValue().toString().equals("1")||
						user_name_text_Field.getText().isEmpty()||
						user_lastname_text_Field.getText().isEmpty()||
						country_text_Field.getText().isEmpty()||
						city_text_Field.getText().isEmpty()||
						age_spinner.getValue().toString().equals("1"))
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


				if(username_text_Field.getText().isEmpty()||
						String.valueOf(passwordField.getPassword()).isEmpty()||
						weight_spinner.getValue().toString().equals("1")||
						height_spinner.getValue().toString().equals("1")||
						user_name_text_Field.getText().isEmpty()||
						user_lastname_text_Field.getText().isEmpty()||
						country_text_Field.getText().isEmpty()||
						city_text_Field.getText().isEmpty()||
						age_spinner.getValue().toString().equals("1"))
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
		
	
		cal_spinner.setModel(new SpinnerNumberModel(0, 0, null, 1));
		add_food_page.add(cal_spinner);
		
		JSpinner Fat_spinner = new JSpinner();
		Fat_spinner.setBounds(638, 130, 46, 20);
		Fat_spinner.setModel(new SpinnerNumberModel(0, 0, null, 1));
		add_food_page.add(Fat_spinner);
		
		JSpinner coles_spinner = new JSpinner();
		coles_spinner.setBounds(638, 161, 46, 20);
		coles_spinner.setModel(new SpinnerNumberModel( 0, 0, null, 1));
		add_food_page.add(coles_spinner);
		
		JSpinner salt_spinner = new JSpinner();
		salt_spinner.setBounds(638, 192, 46, 20);
		salt_spinner.setModel(new SpinnerNumberModel(0,  0, null, 1));
		add_food_page.add(salt_spinner);
		
		JSpinner carbo_spinner = new JSpinner();
		carbo_spinner.setBounds(638, 223, 46, 20);
		carbo_spinner.setModel(new SpinnerNumberModel(0, 0, null, 1));
		add_food_page.add(carbo_spinner);
		
		JSpinner prot_spinner = new JSpinner();
		prot_spinner.setBounds(638, 254, 46, 20);
		prot_spinner.setModel(new SpinnerNumberModel(0, 0, null, 1));
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
		spinner_5_1.setModel(new SpinnerNumberModel(0, 0, null, 1));
		add_food_page.add(spinner_5_1);
		
		JSpinner spinner_5_2 = new JSpinner();
		spinner_5_2.setBounds(638, 337, 46, 20);
		spinner_5_2.setModel(new SpinnerNumberModel(0, 0, null, 1));
		add_food_page.add(spinner_5_2);
		
		JSpinner spinner_5_3 = new JSpinner();
		spinner_5_3.setBounds(638, 362, 46, 20);
		spinner_5_3.setModel(new SpinnerNumberModel(0, 0, null, 1));
		add_food_page.add(spinner_5_3);
		
		JSpinner spinner_5_4 = new JSpinner();
		spinner_5_4.setBounds(638, 387, 46, 20);
		spinner_5_4.setModel(new SpinnerNumberModel(0, 0, null, 1));
		add_food_page.add(spinner_5_4);
		
		JSpinner spinner_5_5 = new JSpinner();
		spinner_5_5.setBounds(638, 412, 46, 20);
		spinner_5_5.setModel(new SpinnerNumberModel(0, 0, null, 1));
		add_food_page.add(spinner_5_5);
		
		JSpinner spinner_5_6 = new JSpinner();
		spinner_5_6.setBounds(638, 438, 46, 20);
		spinner_5_6.setModel(new SpinnerNumberModel(0, 0, null, 1));
		add_food_page.add(spinner_5_6);
		
		JSpinner spinner_5_7 = new JSpinner();
		spinner_5_7.setBounds(476, 312, 46, 20);
		spinner_5_7.setModel(new SpinnerNumberModel(0, 0, null, 1));
		add_food_page.add(spinner_5_7);
		
		JSpinner spinner_5_8 = new JSpinner();
		spinner_5_8.setBounds(476, 337, 46, 20);
		spinner_5_8.setModel(new SpinnerNumberModel(0, 0, null, 1));
		add_food_page.add(spinner_5_8);
		
		JSpinner spinner_5_9 = new JSpinner();
		spinner_5_9.setBounds(476, 362, 46, 20);
		spinner_5_9.setModel(new SpinnerNumberModel(0, 0, null, 1));
		add_food_page.add(spinner_5_9);
		
		JSpinner spinner_5_10 = new JSpinner();
		spinner_5_10.setBounds(476, 387, 46, 20);
		spinner_5_10.setModel(new SpinnerNumberModel(0, 0, null, 1));
		add_food_page.add(spinner_5_10);
		
		JSpinner spinner_5_11 = new JSpinner();
		spinner_5_11.setBounds(476, 412, 46, 20);
		spinner_5_11.setModel(new SpinnerNumberModel(0, 0, null, 1));
		add_food_page.add(spinner_5_11);
		
		JSpinner spinner_5_12 = new JSpinner();
		spinner_5_12.setBounds(476, 438, 46, 20);
		spinner_5_12.setModel(new SpinnerNumberModel(0, 0, null, 1));
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
		
		JLabel lblNewLabel_60 = new JLabel("");
		Image add_food = new ImageIcon(this.getClass().getResource("/add_food.gif")).getImage();
		lblNewLabel_60.setIcon (new ImageIcon(add_food));
		lblNewLabel_60.setBounds(-106, 101, 846, 516);
		add_food_page.add(lblNewLabel_60);
		
	
		
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
					
					
					outFile = new FileWriter ("C:\\data"+"\\"+"food_"+name_text_Field.getText()+".txt",true);
				} catch (IOException e1) {
					System.out.println("Error: " + e1);
				
				}
				BufferedWriter outStream =new BufferedWriter(outFile);
				PrintWriter pw = new PrintWriter(outStream);
				pw.print(food_name_text_Field.getText()+"\n");
				if(dro_RadioButton.isSelected()==true) 
				pw.print("1");
				else if(met_RadioButton.isSelected()==true)
					pw.print("2");
				else if(junk_RadioButton.isSelected()==true)
					pw.print("3");
				else if(fru_RadioButton.isSelected()==true)
					pw.print("4");
				pw.print("\n");
				pw.print(cal_spinner.getValue().toString()+"\n");
				pw.print(Fat_spinner.getValue().toString()+"\n");
				pw.print(coles_spinner.getValue().toString()+"\n");
				pw.print(salt_spinner.getValue().toString()+"\n");
				pw.print(carbo_spinner.getValue().toString()+"\n");
				pw.print(prot_spinner.getValue().toString()+"\n");
				pw.print(spinner_5_1.getValue().toString()+"\n");
				pw.print(spinner_5_2.getValue().toString()+"\n");
				pw.print(spinner_5_3.getValue().toString()+"\n");
				pw.print(spinner_5_4.getValue().toString()+"\n");
				pw.print(spinner_5_5.getValue().toString()+"\n");
				pw.print(spinner_5_6.getValue().toString()+"\n");
				pw.print(spinner_5_7.getValue().toString()+"\n");
				pw.print(spinner_5_8.getValue().toString()+"\n");
				pw.print(spinner_5_9.getValue().toString()+"\n");
				pw.print(spinner_5_10.getValue().toString()+"\n");
				pw.print(spinner_5_11.getValue().toString()+"\n");
				pw.print(spinner_5_12.getValue().toString()+"\n");
				pw.print(name_text_Field.getText()+"\n");
				pw.close ();
				
				
				try {
					outStream.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					outFile.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					use.Extract_Private_Collection();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
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
				food_name_text_Field.requestFocus();
				
			
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
		
		
		frame.getContentPane().add(dry_food_page, "name_133487254905400");
		
		JButton back_Button_3 = new JButton("\u05D7\u05D6\u05E8\u05D4");
		back_Button_3.setBounds(747, 482, 89, 23);
		
		back_Button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dry_food_page.setVisible(false);
				
				
				ate_food_page.setVisible(true);
			}
		});
		dry_food_page.setLayout(null);
		dry_food_page.add(back_Button_3);
JButton button_food_3 = new JButton("");
button_food_3.setToolTipText("\u05DC\u05D7\u05DD \u05E9\u05D7\u05D5\u05E8");
button_food_3.setBounds(230, 11, 100, 100);
Image bbrad= new ImageIcon(this.getClass().getResource("/bbrad.jpg")).getImage();
button_food_3.setIcon(new ImageIcon(bbrad));

button_food_3.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {

		Dry_Food bl_bra= null;
		try {
			bl_bra = (Dry_Food) prod.Get("Dry Food", 2);
		} catch (CloneNotSupportedException ex) {
			ex.printStackTrace();
		}

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
		    optionPane.setMessageType(JOptionPane.PLAIN_MESSAGE);
		    optionPane.setOptionType(JOptionPane.OK_CANCEL_OPTION);
		    JDialog dialog = optionPane.createDialog(parent,"\u05DC\u05D7\u05DD \u05E9\u05D7\u05D5\u05E8");
		    dialog.setSize(500, 300);
		    dialog.setVisible(true);
		    
		    //System.out.print(lehemslid.getValue());
		    //bl_bra=bl_bra.Calc(lehemslid.getValue());
		try {
			eat_s.Ate(bl_bra.Calc(lehemslid.getValue()));
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		System.out.print(use+"\n");
		   
	}
});
button_food_3.setBounds(230, 11, 100, 100);
dry_food_page.add(button_food_3);
JButton button_food_4 = new JButton("");
button_food_4.setToolTipText("\u05D0\u05D5\u05E8\u05D6");
button_food_4.setBounds(340, 11, 100, 100);
Image rise= new ImageIcon(this.getClass().getResource("/rise.jpg")).getImage();
button_food_4.setIcon(new ImageIcon(rise));
button_food_4.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {


		Dry_Food ris= null;
		try {
			ris = (Dry_Food) prod.Get("Dry Food", 3);
		} catch (CloneNotSupportedException ex) {
			ex.printStackTrace();
		}

		JSlider risid=new JSlider(0,1000,100);
		risid.setValue(0);
		JFrame parent = new JFrame();
		 JOptionPane optionPane = new JOptionPane();
		 risid.setMajorTickSpacing(100);
		 risid.setMinorTickSpacing(50);
		 risid.setPaintTicks(true);
		 risid.setPaintLabels(true);
         
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
		risid.setLabelTable(position);
		    optionPane.setMessage(new Object[] { "Select a value: ", risid });
		    optionPane.setMessageType(JOptionPane.PLAIN_MESSAGE);
		    optionPane.setOptionType(JOptionPane.OK_CANCEL_OPTION);
		    JDialog dialog = optionPane.createDialog(parent,"\u05D0\u05D5\u05E8\u05D6");
		    dialog.setSize(500, 300);
		    dialog.setVisible(true);
		    
		    //System.out.print(lehemslid.getValue());
		    //bl_bra=bl_bra.Calc(lehemslid.getValue());
		try {
			eat_s.Ate(ris.Calc(risid.getValue()));
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		// System.out.print(use+"\n");
		
	}
});

dry_food_page.add(button_food_4);
JButton button_food_5 = new JButton("");
button_food_5.setToolTipText("\u05E7\u05D5\u05E1\u05E7\u05D5\u05E1");
button_food_5.setBounds(450, 11, 100, 100);
Image kuskus= new ImageIcon(this.getClass().getResource("/kuskus.jpg")).getImage();
button_food_5.setIcon(new ImageIcon(kuskus));

button_food_5.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {


		Dry_Food cus= null;
		try {
			cus = (Dry_Food) prod.Get("Dry Food", 4);
		} catch (CloneNotSupportedException ex) {
			ex.printStackTrace();
		}

		JSlider cusid =new JSlider(0,1000,100);
		cusid.setValue(0);
		JFrame parent = new JFrame();
		 JOptionPane optionPane = new JOptionPane();
		 cusid.setMajorTickSpacing(100);
		 cusid.setMinorTickSpacing(50);
		 cusid.setPaintTicks(true);
		 cusid.setPaintLabels(true);
         
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
		cusid.setLabelTable(position);
		    optionPane.setMessage(new Object[] { "Select a value: ", cusid });
		    optionPane.setMessageType(JOptionPane.PLAIN_MESSAGE);
		    optionPane.setOptionType(JOptionPane.OK_CANCEL_OPTION);
		    JDialog dialog = optionPane.createDialog(parent,"\u05E7\u05D5\u05E1\u05E7\u05D5\u05E1");
		    dialog.setSize(500, 300);
		    dialog.setVisible(true);
		    
		    //System.out.print(lehemslid.getValue());
		    //bl_bra=bl_bra.Calc(lehemslid.getValue());
		try {
			eat_s.Ate(cus.Calc(cusid.getValue()));
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	
		
	}
});

dry_food_page.add(button_food_5);
JButton button_food_2 = new JButton("");
button_food_2.setToolTipText("\u05E4\u05E1\u05D8\u05D4");
button_food_2.setBounds(120, 11, 100, 100);
Image pasta= new ImageIcon(this.getClass().getResource("/pasta.jpg")).getImage();
button_food_2.setIcon(new ImageIcon(pasta));
button_food_2.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {

		Dry_Food past= null;
		try {
			past = (Dry_Food) prod.Get("Dry Food",0);
		} catch (CloneNotSupportedException ex) {
			ex.printStackTrace();
		}

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
		    optionPane.setMessageType(JOptionPane.PLAIN_MESSAGE);
		    optionPane.setOptionType(JOptionPane.OK_CANCEL_OPTION);
		    JDialog dialog = optionPane.createDialog(parent,"\u05E4\u05E1\u05D8\u05D4");
		    dialog.setSize(500, 300);
		    dialog.setVisible(true);
		    
		    //System.out.print(lehemslid.getValue());
		    //past=past.Calc(lehemslid.getValue());
		try {
			eat_s.Ate(past.Calc(lehemslid.getValue()));
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		System.out.print(use+"\n");
		   
	}
});

dry_food_page.add(button_food_2);

JButton button_food_1 = new JButton("");
button_food_1.setToolTipText("\u05DC\u05D7\u05DD \u05DC\u05D1\u05DF");
button_food_1.setBounds(10, 11, 100, 100);
Image wbrad= new ImageIcon(this.getClass().getResource("/w_Brad.jpg")).getImage();
button_food_1.setIcon(new ImageIcon(wbrad));
button_food_1.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {

		Dry_Food bra= null;
		try {
			bra = (Dry_Food) prod.Get("Dry Food", 1);
		} catch (CloneNotSupportedException ex) {
			ex.printStackTrace();
		}
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
		    optionPane.setMessageType(JOptionPane.PLAIN_MESSAGE);
		    optionPane.setOptionType(JOptionPane.OK_CANCEL_OPTION);
		    JDialog dialog = optionPane.createDialog(parent,"\u05DC\u05D7\u05DD \u05DC\u05D1\u05DF");
		    dialog.setSize(500, 300);
		    dialog.setVisible(true);
		    
		    //System.out.print(lehemslid.getValue());
		   // Double d = new Double(lehemslid.getValue());
		try {
			eat_s.Ate(bra.Calc(lehemslid.getValue()));
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		//System.out.print(use+"\n");
			}

	
});




dry_food_page.add(button_food_1);
JLabel lblNewLabel_57 = new JLabel("");
Image day_food = new ImageIcon(this.getClass().getResource("/dro_food_gif.gif")).getImage();
lblNewLabel_57.setIcon (new ImageIcon(day_food));
lblNewLabel_57.setBounds(240, 96, 748, 328);
dry_food_page.add(lblNewLabel_57);



		
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
		
		JLabel lblNewLabel_61 = new JLabel("");
		Image data_gif = new ImageIcon(this.getClass().getResource("/WastefulComfortableBongo-small.gif")).getImage();
		lblNewLabel_61.setIcon (new ImageIcon(data_gif));
		lblNewLabel_61.setBounds(0, -11, 846, 516);
		data_analysis_page.add(lblNewLabel_61);
		
		
		
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
		
		JLabel lblNewLabel_63 = new JLabel("");
		lblNewLabel_63.setBounds(36, 24, 46, 14);
		recommend_food_page.add(lblNewLabel_63);
		
	
		JButton data_Button_4 = new JButton("");
		data_Button_4.setToolTipText("\u05E0\u05EA\u05D5\u05E0\u05D9\u05DD \u05E2\u05DC \u05DE\u05D4 \u05D0\u05D7\u05DC\u05EA\u05D9 ");
		data_Button_4.setBounds(10, 235, 100, 100);
		data_Button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				data_analysis_page.setVisible(true);
				
				
				lblNewLabel_21.setText("\u05E7\u05DC\u05D5\u05E8\u05D9\u05D5\u05EA: "+Math.floor(eat_s.stats[0]*100)/100);
				
				lblNewLabel_42.setText("\u05D7\u05DC\u05D1\u05D5\u05E0\u05D9\u05DD: "+Math.floor(eat_s.stats[0]*100)/100);
				
				lblNewLabel_43.setText("\u05DB\u05D5\u05DC\u05E1\u05D8\u05E8\u05D5\u05DC: "+Math.floor(eat_s.stats[2]*100)/100);
				
				lblNewLabel_44.setText("\u05E0\u05EA\u05E8\u05DF: "+Math.floor(eat_s.stats[3]*100)/100);

				lblNewLabel_45.setText("\u05E9\u05D5\u05DE\u05E0\u05D9\u05DD: "+Math.floor(eat_s.stats[4]*100)/100);
				
				lblNewLabel_46.setText("\u05E1\u05D5\u05DB\u05E8\u05D9\u05DD: "+Math.floor(eat_s.stats[5]*100)/100);

				lblNewLabel_47.setText("\u05D6\u05E8\u05D7\u05DF: "+Math.floor(eat_s.stats[6]*100)/100);
				
				lblNewLabel_48.setText("\u05D0\u05E9\u05DC\u05D2\u05DF: "+Math.floor(eat_s.stats[7]*100)/100);
				
				lblNewLabel_49.setText("\u05DE\u05D2\u05E0\u05D6\u05D9\u05D5\u05DD: "+Math.floor(eat_s.stats[8]*100)/100);

				lblNewLabel_50.setText("\u05E4\u05D7\u05DE\u05D9\u05DE\u05D5\u05EA: "+Math.floor(eat_s.stats[9]*100)/100);

				lblNewLabel_51.setText("\u05D1\u05E8\u05D6\u05DC: "+Math.floor(eat_s.stats[10]*100)/100);
				
				lblNewLabel_52.setText("\u05D5\u05D5\u05D9\u05D8\u05DE\u05D9\u05DF \u05E1\u05D9\u05D9: "+Math.floor(eat_s.stats[11]*100)/100);
				
				
				
				
				Private_User_page.setVisible(false);
			}
		});
		
		JButton btnNewButton_3 = new JButton("\u05D7\u05D6\u05E8\u05D4");
		btnNewButton_3.setBounds(747, 482, 89, 23);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Private_User_page.setVisible(true);
				
				if(eat_s.Get_Status_cal()) {
				lblNewLabel_9.setText( "\u05E7\u05DC\u05D5\u05E8\u05D9\u05D5\u05EA: " +Math.floor(eat_s.stats[0]*100)/100 );
				lblNewLabel_9.setForeground(Color.RED);
				}else {lblNewLabel_9.setText( "\u05E7\u05DC\u05D5\u05E8\u05D9\u05D5\u05EA: " +Math.floor(eat_s.stats[0]*100)/100 );}
				
				if(eat_s.Get_Status_sod()) {
				lblNewLabel_20.setText("\u05E0\u05EA\u05E8\u05D0\u05DF: "+Math.floor(eat_s.stats[3]*100)/100);
				lblNewLabel_20.setForeground(Color.RED);
				}else {lblNewLabel_20.setText("\u05E0\u05EA\u05E8\u05D0\u05DF: "+Math.floor(eat_s.stats[3]*100)/100);}
				
				if(eat_s.Get_Status_prot()) {
				lblNewLabel_20_1.setText("\u05D7\u05DC\u05D1\u05D5\u05E0\u05D9\u05DD: "+Math.floor(eat_s.stats[1]*100)/100);
				lblNewLabel_20_1.setForeground(Color.RED);
				}else {lblNewLabel_20_1.setText("\u05D7\u05DC\u05D1\u05D5\u05E0\u05D9\u05DD: "+Math.floor(eat_s.stats[1]*100)/100);}
				
				if(eat_s.Get_Status_fat()) {
				lblNewLabel_20_2.setText("\u05E9\u05D5\u05DE\u05E0\u05D9\u05DD: "+Math.floor(eat_s.stats[4]*100)/100);
				lblNewLabel_20_2.setForeground(Color.RED);
				}else {lblNewLabel_20_2.setText("\u05E9\u05D5\u05DE\u05E0\u05D9\u05DD: "+Math.floor(eat_s.stats[4]*100)/100);}
				
				if(eat_s.Get_Status_co()) {
				lblNewLabel_20_3.setText("\u05E7\u05D5\u05DC\u05E1\u05D8\u05E8\u05D5\u05DC: "+Math.floor(eat_s.stats[2]*100)/100);
				lblNewLabel_20_3.setForeground(Color.RED);
				}else {lblNewLabel_20_3.setText("\u05E7\u05D5\u05DC\u05E1\u05D8\u05E8\u05D5\u05DC: "+Math.floor(eat_s.stats[2]*100)/100);}
				
				if(eat_s.Get_Status_pah()) {
				lblNewLabel_38.setText("\u05E4\u05D7\u05DE\u05D9\u05DE\u05D5\u05EA: "+Math.floor(eat_s.stats[9]*100)/100);
				lblNewLabel_38.setForeground(Color.RED);
				}else {lblNewLabel_38.setText("\u05E4\u05D7\u05DE\u05D9\u05DE\u05D5\u05EA: "+Math.floor(eat_s.stats[9]*100)/100);}
				
				sport_activity_page.setVisible(false);
			}
		});
		sport_activity_page.setLayout(null);
		sport_activity_page.add(btnNewButton_3);
		
		JLabel lblNewLabel_53 = new JLabel("");
		Image sport = new ImageIcon(this.getClass().getResource("/sport_gif.gif")).getImage();
		lblNewLabel_53.setIcon (new ImageIcon(sport));
		lblNewLabel_53.setBounds(203, 76, 543, 320);
		sport_activity_page.add(lblNewLabel_53);
		
		/*JLabel lblNewLabel_2 = new JLabel("  ");
		Image runing = new ImageIcon(this.getClass().getResource("/running_on_empty_eran_mendel_dribbble_gif.gif")).getImage();
		lblNewLabel_2.setIcon (new ImageIcon(runing));
		lblNewLabel_2.setBounds(109, 0, 543, 320);
		start_page.add(lblNewLabel_2);*/
		
		data_Button_4.setBackground(new Color(255, 255, 255));
		Image ana = new ImageIcon(this.getClass().getResource("/data_analysis.png")).getImage();
		data_Button_4.setIcon(new ImageIcon(ana));
		Private_User_page.add(data_Button_4);
		
		JLabel lblNewLabel_62 = new JLabel("");
		Image hello_gif = new ImageIcon(this.getClass().getResource("/hello.gif")).getImage();
		lblNewLabel_62.setIcon (new ImageIcon(hello_gif));
		lblNewLabel_62.setBounds(130, 0, 800, 516);
		Private_User_page.add(lblNewLabel_62);
		
		
		

			
			
		
		
		JButton btnNewButton_13 = new JButton("\u05D7\u05D6\u05D5\u05E8");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ate_food_page.setVisible(false);
		
				if(eat_s.Get_Status_cal()) {
				lblNewLabel_9.setText( "\u05E7\u05DC\u05D5\u05E8\u05D9\u05D5\u05EA: " +Math.floor(eat_s.stats[0]*100)/100 );
				lblNewLabel_9.setForeground(Color.RED);
				}else {lblNewLabel_9.setText( "\u05E7\u05DC\u05D5\u05E8\u05D9\u05D5\u05EA: " +Math.floor(eat_s.stats[0]*100)/100 );}
				
				if(eat_s.Get_Status_sod()) {
				lblNewLabel_20.setText("\u05E0\u05EA\u05E8\u05D0\u05DF: "+Math.floor(eat_s.stats[3]*100)/100);
				lblNewLabel_20.setForeground(Color.RED);
				}else {lblNewLabel_20.setText("\u05E0\u05EA\u05E8\u05D0\u05DF: "+Math.floor(eat_s.stats[3]*100)/100);}
				
				if(eat_s.Get_Status_prot()) {
				lblNewLabel_20_1.setText("\u05D7\u05DC\u05D1\u05D5\u05E0\u05D9\u05DD: "+Math.floor(eat_s.stats[1]*100)/100);
				lblNewLabel_20_1.setForeground(Color.RED);
				}else {lblNewLabel_20_1.setText("\u05D7\u05DC\u05D1\u05D5\u05E0\u05D9\u05DD: "+Math.floor(eat_s.stats[1]*100)/100);}
				
				if(eat_s.Get_Status_fat()) {
				lblNewLabel_20_2.setText("\u05E9\u05D5\u05DE\u05E0\u05D9\u05DD: "+Math.floor(eat_s.stats[4]*100)/100);
				lblNewLabel_20_2.setForeground(Color.RED);
				}else {lblNewLabel_20_2.setText("\u05E9\u05D5\u05DE\u05E0\u05D9\u05DD: "+Math.floor(eat_s.stats[4]*100)/100);}
				
				if(eat_s.Get_Status_co()) {
				lblNewLabel_20_3.setText("\u05E7\u05D5\u05DC\u05E1\u05D8\u05E8\u05D5\u05DC: "+Math.floor(eat_s.stats[2]*100)/100);
				lblNewLabel_20_3.setForeground(Color.RED);
				}else {lblNewLabel_20_3.setText("\u05E7\u05D5\u05DC\u05E1\u05D8\u05E8\u05D5\u05DC: "+Math.floor(eat_s.stats[2]*100)/100);}
				
				if(eat_s.Get_Status_pah()) {
				lblNewLabel_38.setText("\u05E4\u05D7\u05DE\u05D9\u05DE\u05D5\u05EA: "+Math.floor(eat_s.stats[9]*100)/100);
				lblNewLabel_38.setForeground(Color.RED);
				}else {lblNewLabel_38.setText("\u05E4\u05D7\u05DE\u05D9\u05DE\u05D5\u05EA: "+Math.floor(eat_s.stats[9]*100)/100);}
				
				Private_User_page.setVisible(true);
			}
		});
		btnNewButton_13.setBounds(747, 482, 89, 23);
		ate_food_page.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("\u05D0\u05D5\u05DB\u05DC \u05D9\u05D1\u05E9");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ate_food_page.setVisible(false);
				dry_food_page.setVisible(true);
			}
		});
		btnNewButton_14.setBounds(10, 11, 120, 120);
		ate_food_page.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("\u05D2'\u05D0\u05E0\u05E7 \u05E4\u05D5\u05D3");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			ate_food_page.setVisible(false);
			Junk_Food_page.setVisible(true);
				
			}
		});
		btnNewButton_15.setBounds(129, 11, 120, 120);
		ate_food_page.add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("\u05DE\u05D5\u05E6\u05E8\u05D9\u05DD\r\n \u05DE\u05DF \u05D4\u05D7\u05D9 ");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ate_food_page.setVisible(false);
				Meat_Fish_Dai_page.setVisible(true);
			}
		});
		btnNewButton_16.setBounds(248, 11, 120, 120);
		ate_food_page.add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("\u05DE\u05D5\u05E6\u05E8\u05D9\u05DD\r\n\u05DE\u05DF \u05D4\u05E6\u05D5\u05DE\u05D7");
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ate_food_page.setVisible(false);
				veg_page.setVisible(true);
			}
		});
		btnNewButton_17.setBounds(367, 11, 120, 120);
		ate_food_page.add(btnNewButton_17);
		
		JLabel lblNewLabel_54 = new JLabel("");
		Image eating = new ImageIcon(this.getClass().getResource("/eating_gif.gif")).getImage();
		lblNewLabel_54.setIcon (new ImageIcon(eating));
		lblNewLabel_54.setBounds(129, 195, 598, 310);
		ate_food_page.add(lblNewLabel_54);
		
		JButton btnNewButton_42 = new JButton("\u05D4\u05D0\u05D5\u05DB\u05DC \u05E9\u05DC\u05D9");
		btnNewButton_42.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				comboBox.setModel(new DefaultComboBoxModel(use.Get_Names()));
				comboBox.setMaximumRowCount(use.size);
				ate_food_page.setVisible(false);
				myfood_page.setVisible(true);
			}
		});
		btnNewButton_42.setBounds(497, 11, 120, 120);
		ate_food_page.add(btnNewButton_42);
		
		
		frame.getContentPane().add(set_bis_rdata_page, "name_541004544022900");
		
		JButton btnNewButton_38 = new JButton("\u05D7\u05D6\u05E8\u05D4");
		btnNewButton_38.setBounds(747, 482, 89, 23);
		btnNewButton_38.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				set_bis_rdata_page.setVisible(false);
				business_page.setVisible(true);
			}
		});
		set_bis_rdata_page.setLayout(null);
		set_bis_rdata_page.add(btnNewButton_38);
		
		bis_name_text_Field = new JTextField();
		bis_name_text_Field.setColumns(15);
		bis_name_text_Field.setBounds(561, 31, 150, 20);
		set_bis_rdata_page.add(bis_name_text_Field);
		
		JLabel label_12 = new JLabel("\u05E9\u05DD \u05D4\u05D7\u05D1\u05E8\u05D4");
		label_12.setBounds(722, 34, 89, 14);
		set_bis_rdata_page.add(label_12);
		
		JLabel label_13 = new JLabel("\u05E9\u05DD \u05DE\u05E9\u05EA\u05DE\u05E9:");
		label_13.setBounds(719, 65, 67, 14);
		set_bis_rdata_page.add(label_13);
		
		bis_username_text_Field = new JTextField();
		bis_username_text_Field.setColumns(30);
		bis_username_text_Field.setBounds(561, 62, 150, 20);
		set_bis_rdata_page.add(bis_username_text_Field);
		
		bis_password_Field = new JPasswordField();
		bis_password_Field.setBounds(561, 93, 150, 20);
		set_bis_rdata_page.add(bis_password_Field);
		
		JLabel label_14 = new JLabel("\u05E1\u05D9\u05E1\u05DE\u05D4:");
		label_14.setBounds(719, 96, 70, 14);
		set_bis_rdata_page.add(label_14);
		
		JLabel label_15 = new JLabel("\u05E2\u05D9\u05E8: ");
		label_15.setBounds(719, 123, 76, 14);
		set_bis_rdata_page.add(label_15);
		
		bis_city_text_Field = new JTextField();
		bis_city_text_Field.setColumns(10);
		bis_city_text_Field.setBounds(561, 121, 150, 20);
		set_bis_rdata_page.add(bis_city_text_Field);
		
		bis_cuntry_text_Field = new JTextField();
		bis_cuntry_text_Field.setColumns(10);
		bis_cuntry_text_Field.setBounds(561, 152, 150, 20);
		set_bis_rdata_page.add(bis_cuntry_text_Field);
		
		JLabel label_16 = new JLabel("\u05DE\u05D3\u05D9\u05E0\u05D4:");
		label_16.setBounds(719, 153, 46, 14);
		set_bis_rdata_page.add(label_16);
		
		JButton btnNewButton_39 = new JButton("\u05E9\u05DE\u05D5\u05E8");
		btnNewButton_39.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if(bis_city_text_Field.getText().isEmpty()||
						bis_cuntry_text_Field.getText().isEmpty()||bis_name_text_Field.getText().isEmpty()||
						String.valueOf(bis_password_Field.getPassword()).isEmpty()||bis_username_text_Field.getText().isEmpty())
				{
					JOptionPane.showMessageDialog(null, "You have to fill all" + "!");	
				}else {
					
					
					
				FileWriter outFile = null;
				File file =new File("C:\\data");
				file.mkdirs();
				
						
				BufferedWriter outStream=null;
				
				try {
					outFile = new FileWriter ("C:\\data\\"+"bus_"+bis_username_text_Field.getText()+".txt");
				} catch (IOException e1) {
					System.out.println("Error: " + e1);
				
				}
				 outStream =new BufferedWriter(outFile);
			
				try {
					
					
					outStream.write(bis_username_text_Field.getText()+"\n");
					outStream.write(bis_password_Field.getPassword());
					outStream.write("\n");
					outStream.write(bis_name_text_Field.getText()+"\n");
					outStream.write(bis_cuntry_text_Field.getText()+"\n");
					outStream.write(bis_city_text_Field.getText()+"\n");
					outStream.close ();
				} catch (IOException e1) {
					System.out.println("Error: " + e1);
				}
				
				
				
				
				set_bis_rdata_page.setVisible(false);
					log_in_page.setVisible(true);
				
			}
			}
		});
		btnNewButton_39.setBounds(622, 482, 89, 23);
		set_bis_rdata_page.add(btnNewButton_39);
		
		
		frame.getContentPane().add(bis_add_food_page, "name_553627018607200");
		
		JButton btnNewButton_40 = new JButton("\u05D7\u05D6\u05E8\u05D4");
		btnNewButton_40.setBounds(747, 482, 89, 23);
		btnNewButton_40.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bis_add_food_page.setVisible(false);
				business_page.setVisible(true);
			}
		});
		bis_add_food_page.setLayout(null);
		bis_add_food_page.add(btnNewButton_40);
		
		JLabel label_17 = new JLabel("\u05E1\u05D3\u05D5\u05EA \u05D7\u05D5\u05D1\u05D4");
		label_17.setBounds(758, 11, 67, 14);
		bis_add_food_page.add(label_17);
		
		JLabel label_18 = new JLabel("\u05E9\u05DD \u05D4\u05D0\u05D5\u05DB\u05DC:");
		label_18.setBounds(694, 11, 87, 14);
		bis_add_food_page.add(label_18);
		
		bis_food_name_text_Field = new JTextField();
		bis_food_name_text_Field.setColumns(10);
		bis_food_name_text_Field.setBounds(532, 8, 152, 20);
		bis_add_food_page.add(bis_food_name_text_Field);
		
		JLabel label_19 = new JLabel("\u05E1\u05D5\u05D2 \u05D4\u05D0\u05D5\u05DB\u05DC:");
		label_19.setBounds(694, 61, 142, 20);
		bis_add_food_page.add(label_19);
		
		JRadioButton bis_dro_RadioButton = new JRadioButton("\u05E7\u05D8\u05E0\u05D9\u05D5\u05EA \u05D5\u05DE\u05D0\u05DB\u05DC\u05D9\u05DD \u05D9\u05D1\u05E9\u05D9\u05DD");
		bis_dro_RadioButton.setBackground(SystemColor.menu);
		bis_dro_RadioButton.setBounds(532, 60, 152, 23);
		bis_add_food_page.add(bis_dro_RadioButton);
		
		JRadioButton bis_met_RadioButton = new JRadioButton("\u05D1\u05E9\u05E8 \u05D7\u05DC\u05D1 \u05D3\u05D2\u05D9\u05DD");
		bis_met_RadioButton.setBackground(SystemColor.menu);
		bis_met_RadioButton.setBounds(428, 60, 109, 23);
		bis_add_food_page.add(bis_met_RadioButton);
		
		JRadioButton bis_junk_RadioButton = new JRadioButton("\u05D7\u05EA\u05D9\u05E4\u05D9\u05DD \u05D5\u05D0\u05DB\u05DC \u05DE\u05E2\u05D9\u05E8");
		bis_junk_RadioButton.setBackground(SystemColor.menu);
		bis_junk_RadioButton.setBounds(307, 60, 119, 23);
		bis_add_food_page.add(bis_junk_RadioButton);
		
		JRadioButton bis_fru_RadioButton = new JRadioButton("\u05E4\u05E8\u05D5\u05EA \u05D5\u05D9\u05E8\u05E7\u05D5\u05EA");
		bis_fru_RadioButton.setBackground(SystemColor.menu);
		bis_fru_RadioButton.setBounds(218, 60, 87, 23);
		bis_add_food_page.add(bis_fru_RadioButton);
		
		JLabel label_20 = new JLabel("\u05D0\u05E0\u05E8\u05D2\u05D9\u05D4");
		label_20.setBounds(694, 93, 56, 14);
		bis_add_food_page.add(label_20);
		
		JSpinner bis_cal_spinner = new JSpinner();
		bis_cal_spinner.setBounds(638, 90, 46, 20);
		bis_add_food_page.add(bis_cal_spinner);
		
		JLabel label_21 = new JLabel("(\u05E7\u05DC\u05D5\u05E8\u05D9\u05D5\u05EA)");
		label_21.setHorizontalAlignment(SwingConstants.RIGHT);
		label_21.setBounds(572, 93, 56, 14);
		bis_add_food_page.add(label_21);
		
		JLabel label_22 = new JLabel("\u05E9\u05D5\u05DE\u05E0\u05D9\u05DD");
		label_22.setBounds(694, 124, 46, 14);
		bis_add_food_page.add(label_22);
		
		JSpinner bis_Fat_spinner = new JSpinner();
		bis_Fat_spinner.setBounds(638, 121, 46, 20);
		bis_add_food_page.add(bis_Fat_spinner);
		
		JLabel label_23 = new JLabel("(\u05D2\u05E8\u05DD)");
		label_23.setHorizontalAlignment(SwingConstants.RIGHT);
		label_23.setBounds(582, 124, 46, 14);
		bis_add_food_page.add(label_23);
		
		JLabel label_24 = new JLabel("(\u05DE''\u05D2)");
		label_24.setHorizontalAlignment(SwingConstants.RIGHT);
		label_24.setBounds(582, 155, 46, 14);
		bis_add_food_page.add(label_24);
		
		JSpinner bis_coles_spinner = new JSpinner();
		bis_coles_spinner.setBounds(638, 152, 46, 20);
		bis_add_food_page.add(bis_coles_spinner);
		
		JLabel label_25 = new JLabel("\u05DB\u05D5\u05DC\u05E1\u05D8\u05D9\u05E8\u05D5\u05DC");
		label_25.setBounds(694, 155, 56, 14);
		bis_add_food_page.add(label_25);
		
		JLabel label_26 = new JLabel("\u05E0\u05EA\u05E8\u05D0\u05DF");
		label_26.setBounds(694, 186, 56, 14);
		bis_add_food_page.add(label_26);
		
		JSpinner bis_salt_spinner = new JSpinner();
		bis_salt_spinner.setBounds(638, 183, 46, 20);
		bis_add_food_page.add(bis_salt_spinner);
		
		JLabel label_27 = new JLabel("(\u05DE''\u05D2)");
		label_27.setHorizontalAlignment(SwingConstants.RIGHT);
		label_27.setBounds(582, 186, 46, 14);
		bis_add_food_page.add(label_27);
		
		JLabel label_28 = new JLabel("(\u05D2\u05E8\u05DD)");
		label_28.setHorizontalAlignment(SwingConstants.RIGHT);
		label_28.setBounds(582, 217, 46, 14);
		bis_add_food_page.add(label_28);
		
		JSpinner bis_carbo_spinner = new JSpinner();
		bis_carbo_spinner.setBounds(638, 214, 46, 20);
		bis_add_food_page.add(bis_carbo_spinner);
		
		JLabel label_29 = new JLabel("\u05E4\u05D7\u05DE\u05D9\u05DE\u05D5\u05EA");
		label_29.setBounds(694, 217, 46, 14);
		bis_add_food_page.add(label_29);
		
		JLabel label_30 = new JLabel("\u05D7\u05DC\u05D1\u05D5\u05E0\u05D9\u05DD");
		label_30.setBounds(694, 248, 46, 14);
		bis_add_food_page.add(label_30);
		
		JSpinner bis_prot_spinner = new JSpinner();
		bis_prot_spinner.setBounds(638, 245, 46, 20);
		bis_add_food_page.add(bis_prot_spinner);
		
		JLabel label_31 = new JLabel("(\u05D2\u05E8\u05DD)");
		label_31.setHorizontalAlignment(SwingConstants.RIGHT);
		label_31.setBounds(582, 248, 46, 14);
		bis_add_food_page.add(label_31);
		
		JLabel label_32 = new JLabel("______________________________________________________");
		label_32.setBounds(462, 251, 364, 29);
		bis_add_food_page.add(label_32);
		
		JLabel label_33 = new JLabel("\u05E1\u05D3\u05D5\u05EA \u05DC\u05D0 \u05D7\u05D5\u05D1\u05D4");
		label_33.setBounds(721, 281, 87, 14);
		bis_add_food_page.add(label_33);
		
		JSpinner bis_spinner_5_1 = new JSpinner();
		bis_spinner_5_1.setBounds(638, 303, 46, 20);
		bis_add_food_page.add(bis_spinner_5_1);
		
		JLabel label_34 = new JLabel("\u05E1\u05D5\u05E7\u05E8");
		label_34.setBounds(693, 306, 46, 14);
		bis_add_food_page.add(label_34);
		
		JLabel label_35 = new JLabel("\u05E9\u05D5\u05DE\u05DF \u05E8\u05D5\u05D5\u05D9");
		label_35.setBounds(694, 331, 46, 14);
		bis_add_food_page.add(label_35);
		
		JSpinner bis_spinner_5_2 = new JSpinner();
		bis_spinner_5_2.setBounds(638, 328, 46, 20);
		bis_add_food_page.add(bis_spinner_5_2);
		
		JSpinner bis_spinner_5_3 = new JSpinner();
		bis_spinner_5_3.setBounds(638, 353, 46, 20);
		bis_add_food_page.add(bis_spinner_5_3);
		
		JLabel label_36 = new JLabel("\u05E1\u05D1\u05D9\u05DD \u05EA\u05D6\u05D5\u05E0\u05EA\u05D9\u05D9\u05DD");
		label_36.setBounds(693, 356, 87, 14);
		bis_add_food_page.add(label_36);
		
		JLabel label_37 = new JLabel("\u05DE\u05D9\u05DD");
		label_37.setBounds(694, 381, 86, 14);
		bis_add_food_page.add(label_37);
		
		JSpinner bis_spinner_5_4 = new JSpinner();
		bis_spinner_5_4.setBounds(638, 378, 46, 20);
		bis_add_food_page.add(bis_spinner_5_4);
		
		JSpinner bis_spinner_5_5 = new JSpinner();
		bis_spinner_5_5.setBounds(638, 403, 46, 20);
		bis_add_food_page.add(bis_spinner_5_5);
		
		JLabel label_38 = new JLabel("\u05D5\u05D5\u05D8\u05DE\u05D9\u05DF C");
		label_38.setBounds(694, 406, 86, 14);
		bis_add_food_page.add(label_38);
		
		JLabel label_39 = new JLabel("\u05D5\u05D5\u05D9\u05D8\u05DE\u05D9\u05DF B9");
		label_39.setBounds(694, 435, 86, 14);
		bis_add_food_page.add(label_39);
		
		JSpinner bis_spinner_5_6 = new JSpinner();
		bis_spinner_5_6.setBounds(638, 429, 46, 20);
		bis_add_food_page.add(bis_spinner_5_6);
		
		JLabel label_40 = new JLabel("\u05D0\u05E9\u05DC\u05D2\u05DF");
		label_40.setBounds(532, 435, 46, 14);
		bis_add_food_page.add(label_40);
		
		JSpinner bis_spinner_5_12 = new JSpinner();
		bis_spinner_5_12.setBounds(476, 429, 46, 20);
		bis_add_food_page.add(bis_spinner_5_12);
		
		JSpinner bis_spinner_5_11 = new JSpinner();
		bis_spinner_5_11.setBounds(476, 403, 46, 20);
		bis_add_food_page.add(bis_spinner_5_11);
		
		JLabel label_41 = new JLabel("\u05D0\u05D1\u05E5");
		label_41.setBounds(532, 406, 46, 14);
		bis_add_food_page.add(label_41);
		
		JLabel label_42 = new JLabel("\u05D6\u05E8\u05D7\u05DF");
		label_42.setBounds(532, 381, 46, 14);
		bis_add_food_page.add(label_42);
		
		JSpinner bis_spinner_5_10 = new JSpinner();
		bis_spinner_5_10.setBounds(476, 378, 46, 20);
		bis_add_food_page.add(bis_spinner_5_10);
		
		JSpinner bis_spinner_5_9 = new JSpinner();
		bis_spinner_5_9.setBounds(476, 353, 46, 20);
		bis_add_food_page.add(bis_spinner_5_9);
		
		JSpinner bis_spinner_5_8 = new JSpinner();
		bis_spinner_5_8.setBounds(476, 328, 46, 20);
		bis_add_food_page.add(bis_spinner_5_8);
		
		JSpinner bis_spinner_5_7 = new JSpinner();
		bis_spinner_5_7.setBounds(476, 303, 46, 20);
		bis_add_food_page.add(bis_spinner_5_7);
		
		JLabel label_43 = new JLabel("\u05D1\u05E8\u05D6\u05DC");
		label_43.setBounds(532, 306, 35, 14);
		bis_add_food_page.add(label_43);
		
		JLabel label_44 = new JLabel("\u05E1\u05D9\u05D3\u05DF");
		label_44.setBounds(532, 331, 46, 14);
		bis_add_food_page.add(label_44);
		
		JLabel label_45 = new JLabel("\u05DE\u05D2\u05D0\u05D6\u05D9\u05D5\u05DD");
		label_45.setBounds(532, 356, 46, 14);
		bis_add_food_page.add(label_45);
		
		JLabel lblNewLabel_18 = new JLabel("\u05DE\u05D7\u05D9\u05E8:");
		lblNewLabel_18.setBounds(694, 36, 46, 14);
		bis_add_food_page.add(lblNewLabel_18);
		
		JSpinner bis_price_spinner = new JSpinner();
		bis_price_spinner.setBounds(638, 33, 46, 20);
		bis_add_food_page.add(bis_price_spinner);
		
		

		JButton btnNewButton_37 = new JButton("\u05D4\u05D5\u05E1\u05E4\u05D4 \u05DE\u05D5\u05E6\u05E8\u05D9\u05DD");
		btnNewButton_37.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				bis_food_name_text_Field.setText("");
				bis_price_spinner.setValue(0);
				bis_dro_RadioButton.setSelected(false);
				bis_met_RadioButton.setSelected(false);
				bis_junk_RadioButton.setSelected(false);
				bis_fru_RadioButton.setSelected(false);
				bis_cal_spinner.setValue(0);
				bis_Fat_spinner.setValue(0);
				bis_coles_spinner.setValue(0);
				bis_salt_spinner.setValue(0);
				bis_carbo_spinner.setValue(0);
				bis_prot_spinner.setValue(0);
				bis_spinner_5_1.setValue(0);
				bis_spinner_5_2.setValue(0);
				bis_spinner_5_3.setValue(0);
				bis_spinner_5_4.setValue(0);
				bis_spinner_5_5.setValue(0);
				bis_spinner_5_6.setValue(0);
				bis_spinner_5_7.setValue(0);
				bis_spinner_5_8.setValue(0);
				bis_spinner_5_9.setValue(0);
				bis_spinner_5_10.setValue(0);
				bis_spinner_5_11.setValue(0);
				bis_spinner_5_12.setValue(0);
				business_page.setVisible(false);
				bis_add_food_page.setVisible(true);
				bis_food_name_text_Field.requestFocus();




			}
		});
		btnNewButton_37.setBounds(10, 73, 161, 23);
		business_page.add(btnNewButton_37);
		
		
		
		
		JButton btnNewButton_41 = new JButton("\u05E9\u05DE\u05D5\u05E8");
		btnNewButton_41.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				


				
				
				if(bis_food_name_text_Field.getText().isEmpty()||bis_cal_spinner.getValue().equals(0)||bis_Fat_spinner.getValue().equals(0)||bis_coles_spinner.getValue().equals(0)||bis_salt_spinner.getValue().equals(0)||
						bis_carbo_spinner.getValue().equals(0)||bis_prot_spinner.getValue().equals(0)||(bis_dro_RadioButton.isSelected()==false&&bis_met_RadioButton.isSelected()==false&&bis_junk_RadioButton.isSelected()==false&&bis_fru_RadioButton.isSelected()==false))
				{
					JOptionPane.showMessageDialog(null, "You have to fill the critic parameters" + "!");

					
				}else {
					File file =new File("C:\\data");
					file.mkdirs();
					
				FileWriter outFile = null;
				
				try {
					
					
					outFile = new FileWriter ("C:\\data"+"\\"+"bis_food"+".txt");
				} catch (IOException e1) {
					System.out.println("Error: " + e1);
				
				}
				BufferedWriter outStream =new BufferedWriter(outFile);
			
				try {
					
					
					outStream.write(bis_food_name_text_Field.getText()+"\n");
					if(bis_dro_RadioButton.isSelected())
					outStream.write("1");
					else if(bis_met_RadioButton.isSelected())
						outStream.write("2");
					else if(bis_junk_RadioButton.isSelected())
						outStream.write("3");
					else if(bis_fru_RadioButton.isSelected())
						outStream.write("4");
					outStream.write("\n");
					outStream.write(bis_cal_spinner.getValue().toString()+"\n");
					outStream.write(bis_Fat_spinner.getValue().toString()+"\n");
					outStream.write(bis_coles_spinner.getValue().toString()+"\n");
					outStream.write(bis_salt_spinner.getValue().toString()+"\n");
					outStream.write(bis_carbo_spinner.getValue().toString()+"\n");
					outStream.write(bis_prot_spinner.getValue().toString()+"\n");
					outStream.write(bis_spinner_5_1.getValue().toString()+"\n");
					outStream.write(bis_spinner_5_2.getValue().toString()+"\n");
					outStream.write(bis_spinner_5_3.getValue().toString()+"\n");
					outStream.write(bis_spinner_5_4.getValue().toString()+"\n");
					outStream.write(bis_spinner_5_5.getValue().toString()+"\n");
					outStream.write(bis_spinner_5_6.getValue().toString()+"\n");
					outStream.write(bis_spinner_5_7.getValue().toString()+"\n");
					outStream.write(bis_spinner_5_8.getValue().toString()+"\n");
					outStream.write(bis_spinner_5_9.getValue().toString()+"\n");
					outStream.write(bis_spinner_5_10.getValue().toString()+"\n");
					outStream.write(bis_spinner_5_11.getValue().toString()+"\n");
					outStream.write(bis_spinner_5_12.getValue().toString()+"\n");
					outStream.write(name_text_Field.getText()+"\n");
					outStream.close ();
				} catch (IOException e1) {
					System.out.println("Error: " + e1);
				}
				
				
				
					bis_add_food_page.setVisible(false);
					business_page.setVisible(true);
	
				}	
				
				
			}
		});
		btnNewButton_41.setBounds(619, 482, 89, 23);
		bis_add_food_page.add(btnNewButton_41);
		
		
		frame.getContentPane().add(myfood_page, "name_27493486359100");
		myfood_page.setLayout(null);
		
		JButton btnNewButton_43 = new JButton("\u05D7\u05D6\u05D5\u05E8");
		btnNewButton_43.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myfood_page.setVisible(false);
				ate_food_page.setVisible(true);
			}
		});
		btnNewButton_43.setBounds(747, 482, 89, 23);
		myfood_page.add(btnNewButton_43);
		
		comboBox = new JComboBox();
		comboBox.setEditable(true);
		comboBox.setToolTipText("...");
		
		comboBox.setBounds(474, 11, 318, 22);
		myfood_page.add(comboBox);
		
		JButton btnNewButton_44 = new JButton("\u05D1\u05D7\u05E8");
		btnNewButton_44.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				int index=comboBox.getSelectedIndex();
				if ( index < 0){
					index = 19;
				}

				else if (index > use.size){
					index = 0;
				}


				JSlider cusid =new JSlider(0,1000,100);
				cusid.setValue(0);
				JFrame parent = new JFrame();
			 	JOptionPane optionPane = new JOptionPane();
				 cusid.setMajorTickSpacing(100);
				 cusid.setMinorTickSpacing(50);
				 cusid.setPaintTicks(true);
				 cusid.setPaintLabels(true);
         
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
		
		         
				cusid.setLabelTable(position);
				optionPane.setMessage(new Object[] { "Select a value: ", cusid });
				optionPane.setMessageType(JOptionPane.PLAIN_MESSAGE);
				optionPane.setOptionType(JOptionPane.OK_CANCEL_OPTION);
			    JDialog dialog = optionPane.createDialog(parent, use.my_collection[index].GetName());
			    dialog.setSize(500, 300);
			    dialog.setVisible(true);

				try {
					eat_s.Ate(use.my_collection[index].Calc(cusid.getValue()));
				} catch (IOException ex) {
					ex.printStackTrace();
				}
					}
						}
		);
		btnNewButton_44.setBounds(638, 482, 89, 23);
		myfood_page.add(btnNewButton_44);
		
		

		
			
		
		
		
		b_Button_save.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				if(b_city_text_Field.getText().isEmpty()||
						b_country_text_Field.getText().isEmpty()||b_company_field.getText().isEmpty()||
						String.valueOf(passwordField_1.getPassword()).isEmpty()||b_username_text_Field.getText().isEmpty())
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
						String.valueOf(passwordField_1.getPassword()).isEmpty()||b_username_text_Field.getText().isEmpty())
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
