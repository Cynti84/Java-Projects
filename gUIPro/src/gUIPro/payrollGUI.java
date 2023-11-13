package gUIPro;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

//import projectGUI.EmployeePayroll;

public class payrollGUI {	

		private JFrame frmGeorgetownCleaningService;
		private JTextField textFieldName;
		private JTextField textFieldHourlySalary;
		private JTextField textFieldFirstMon;
		private JTextField textFieldFirstTue;
		private JTextField textFieldFirstWed;
		private JTextField textFieldFirstThu;
		private JTextField textFieldFirstFri;
		private JTextField textFieldFirstSat;
		private JTextField textFieldFirstSun;
		private JLabel lblNewLabel_3;
		private JTextField textFieldSecondMon;
		private JTextField textFieldSecondTue;
		private JTextField textFieldSecondWed;
		private JTextField textFieldSecondThu;
		private JTextField textFieldSecondFri;
		private JTextField textFieldSecondSat;
		private JTextField textFieldSecondSun;
		private JLabel lblNewLabel_4;
		private JLabel lblNewLabel_5;
		private JLabel lblNewLabel_6;
		private JLabel lblNewLabel_7;
		private JLabel lblNewLabel_8;
		private JLabel lblNewLabel_9;
		private JLabel lblNewLabel_10;
		private JPanel panelTimeSheet;
		private JButton btnProcess;
		private JLabel lblNewLabel_11;
		private JTextField textFieldRegularHours;
		private JLabel lblNewLabel_12;
		private JLabel lblNewLabel_13;
		private JTextField textFieldOverhours;
		private JTextField textFieldRegularAmount;
		private JTextField textFieldOverAmount;
		private JLabel lblNewLabel_14;
		private JLabel lblNewLabel_15;
		private JTextField textFieldNetPay;
		private JButton btnClose;
		private JPanel panelProcessing;

		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						payrollGUI window = new payrollGUI();
						window.frmGeorgetownCleaningService.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

		/**
		 * Create the application.
		 */
		public payrollGUI() {
			initialize();
		}

		/**
		 * Initialize the contents of the frame.
		 */
		private void initialize() {
			frmGeorgetownCleaningService = new JFrame();
			frmGeorgetownCleaningService.getContentPane().setBackground(new Color(243, 240, 220));
			frmGeorgetownCleaningService.setTitle("Georgetown Cleaning Service - Employee Payroll");
			frmGeorgetownCleaningService.setBounds(100, 100, 650, 400);
			frmGeorgetownCleaningService.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frmGeorgetownCleaningService.getContentPane().setLayout(null);
			
			JLabel lblNewLabel = new JLabel("Employee Name :");
			lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 11));
			lblNewLabel.setBounds(99, 50, 87, 14);
			frmGeorgetownCleaningService.getContentPane().add(lblNewLabel);
			
			textFieldName = new JTextField();
			textFieldName.setBounds(196, 47, 96, 20);
			frmGeorgetownCleaningService.getContentPane().add(textFieldName);
			textFieldName.setColumns(10);
			
			JLabel lblNewLabel_1 = new JLabel("Hourly Salary :");
			lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 11));
			lblNewLabel_1.setBounds(316, 50, 73, 14);
			frmGeorgetownCleaningService.getContentPane().add(lblNewLabel_1);
			
			textFieldHourlySalary = new JTextField();
			textFieldHourlySalary.setBounds(399, 47, 96, 20);
			frmGeorgetownCleaningService.getContentPane().add(textFieldHourlySalary);
			textFieldHourlySalary.setColumns(10);
			
			JPanel panel_identification = new JPanel();
			panel_identification.setBackground(new Color(243, 240, 220));
			panel_identification.setBorder(new TitledBorder(null, "Employee Identification", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_identification.setBounds(10, 23, 618, 67);
			frmGeorgetownCleaningService.getContentPane().add(panel_identification);
			
			JLabel lblNewLabel_2 = new JLabel("First Week :");
			lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 11));
			lblNewLabel_2.setBounds(36, 144, 59, 14);
			frmGeorgetownCleaningService.getContentPane().add(lblNewLabel_2);
			
			textFieldFirstMon = new JTextField();
			textFieldFirstMon.setBounds(127, 141, 59, 20);
			frmGeorgetownCleaningService.getContentPane().add(textFieldFirstMon);
			textFieldFirstMon.setColumns(10);
			
			textFieldFirstTue = new JTextField();
			textFieldFirstTue.setBounds(196, 141, 59, 20);
			frmGeorgetownCleaningService.getContentPane().add(textFieldFirstTue);
			textFieldFirstTue.setColumns(10);
			
			textFieldFirstWed = new JTextField();
			textFieldFirstWed.setBounds(265, 141, 59, 20);
			frmGeorgetownCleaningService.getContentPane().add(textFieldFirstWed);
			textFieldFirstWed.setColumns(10);
			
			textFieldFirstThu = new JTextField();
			textFieldFirstThu.setBounds(334, 141, 59, 20);
			frmGeorgetownCleaningService.getContentPane().add(textFieldFirstThu);
			textFieldFirstThu.setColumns(10);
			
			textFieldFirstFri = new JTextField();
			textFieldFirstFri.setBounds(399, 141, 59, 20);
			frmGeorgetownCleaningService.getContentPane().add(textFieldFirstFri);
			textFieldFirstFri.setColumns(10);
			
			textFieldFirstSat = new JTextField();
			textFieldFirstSat.setBounds(468, 141, 59, 20);
			frmGeorgetownCleaningService.getContentPane().add(textFieldFirstSat);
			textFieldFirstSat.setColumns(10);
			
			textFieldFirstSun = new JTextField();
			textFieldFirstSun.setBounds(537, 141, 59, 20);
			frmGeorgetownCleaningService.getContentPane().add(textFieldFirstSun);
			textFieldFirstSun.setColumns(10);
			
			lblNewLabel_3 = new JLabel("Second Week :");
			lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 11));
			lblNewLabel_3.setBounds(36, 185, 74, 14);
			frmGeorgetownCleaningService.getContentPane().add(lblNewLabel_3);
			
			textFieldSecondMon = new JTextField();
			textFieldSecondMon.setBounds(127, 182, 59, 20);
			frmGeorgetownCleaningService.getContentPane().add(textFieldSecondMon);
			textFieldSecondMon.setColumns(10);
			
			textFieldSecondTue = new JTextField();
			textFieldSecondTue.setBounds(196, 182, 59, 20);
			frmGeorgetownCleaningService.getContentPane().add(textFieldSecondTue);
			textFieldSecondTue.setColumns(10);
			
			textFieldSecondWed = new JTextField();
			textFieldSecondWed.setBounds(265, 182, 59, 20);
			frmGeorgetownCleaningService.getContentPane().add(textFieldSecondWed);
			textFieldSecondWed.setColumns(10);
			
			textFieldSecondThu = new JTextField();
			textFieldSecondThu.setBounds(334, 182, 59, 20);
			frmGeorgetownCleaningService.getContentPane().add(textFieldSecondThu);
			textFieldSecondThu.setColumns(10);
			
			textFieldSecondFri = new JTextField();
			textFieldSecondFri.setBounds(399, 182, 59, 20);
			frmGeorgetownCleaningService.getContentPane().add(textFieldSecondFri);
			textFieldSecondFri.setColumns(10);
			
			textFieldSecondSat = new JTextField();
			textFieldSecondSat.setBounds(468, 182, 59, 20);
			frmGeorgetownCleaningService.getContentPane().add(textFieldSecondSat);
			textFieldSecondSat.setColumns(10);
			
			textFieldSecondSun = new JTextField();
			textFieldSecondSun.setBounds(537, 182, 59, 20);
			frmGeorgetownCleaningService.getContentPane().add(textFieldSecondSun);
			textFieldSecondSun.setColumns(10);
			
			lblNewLabel_4 = new JLabel("Monday");
			lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 11));
			lblNewLabel_4.setBounds(127, 116, 48, 14);
			frmGeorgetownCleaningService.getContentPane().add(lblNewLabel_4);
			
			lblNewLabel_5 = new JLabel("Tuesday");
			lblNewLabel_5.setFont(new Font("Arial", Font.PLAIN, 11));
			lblNewLabel_5.setBounds(196, 116, 48, 14);
			frmGeorgetownCleaningService.getContentPane().add(lblNewLabel_5);
			
			lblNewLabel_6 = new JLabel("Wednesday");
			lblNewLabel_6.setFont(new Font("Arial", Font.PLAIN, 11));
			lblNewLabel_6.setBounds(265, 116, 59, 14);
			frmGeorgetownCleaningService.getContentPane().add(lblNewLabel_6);
			
			lblNewLabel_7 = new JLabel("Thursday");
			lblNewLabel_7.setFont(new Font("Arial", Font.PLAIN, 11));
			lblNewLabel_7.setBounds(334, 116, 48, 14);
			frmGeorgetownCleaningService.getContentPane().add(lblNewLabel_7);
			
			lblNewLabel_8 = new JLabel("Friday");
			lblNewLabel_8.setFont(new Font("Arial", Font.PLAIN, 11));
			lblNewLabel_8.setBounds(399, 116, 48, 14);
			frmGeorgetownCleaningService.getContentPane().add(lblNewLabel_8);
			
			lblNewLabel_9 = new JLabel("Saturday");
			lblNewLabel_9.setFont(new Font("Arial", Font.PLAIN, 11));
			lblNewLabel_9.setBounds(468, 116, 48, 14);
			frmGeorgetownCleaningService.getContentPane().add(lblNewLabel_9);
			
			lblNewLabel_10 = new JLabel("Sunday");
			lblNewLabel_10.setFont(new Font("Arial", Font.PLAIN, 11));
			lblNewLabel_10.setBounds(537, 116, 48, 14);
			frmGeorgetownCleaningService.getContentPane().add(lblNewLabel_10);
			
			panelTimeSheet = new JPanel();
			panelTimeSheet.setBackground(new Color(243, 240, 220));
			panelTimeSheet.setBorder(new TitledBorder(null, "Time Sheet", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panelTimeSheet.setBounds(10, 101, 618, 125);
			frmGeorgetownCleaningService.getContentPane().add(panelTimeSheet);
			
			btnProcess = new JButton("Process It");
			btnProcess.setBackground(new Color(243, 240, 220));
			btnProcess.setBounds(36, 266,100, 70);
			frmGeorgetownCleaningService.getContentPane().add(btnProcess);
			btnProcess.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					
					double rate, mon1, tue1, wed1, thu1, fri1, sat1, sun1, mon2, tue2, wed2, thu2, fri2, sat2, sun2, regsum1=0, oversum1=0, regsum2=0, oversum2=0, mo=0, no=0;
					int daily = 8;
					
					rate = Double.valueOf(textFieldHourlySalary.getText());
					
					mon1 = Double.valueOf(textFieldFirstMon.getText());
					tue1 = Double.valueOf(textFieldFirstTue.getText());
					wed1 = Double.valueOf(textFieldFirstWed.getText());
					thu1 = Double.valueOf(textFieldFirstThu.getText());
					fri1 = Double.valueOf(textFieldFirstFri.getText());
					sat1 = Double.valueOf(textFieldFirstSat.getText());
					sun1 = Double.valueOf(textFieldFirstSun.getText());
					
					mon2 = Double.valueOf(textFieldSecondMon.getText());
					tue2 = Double.valueOf(textFieldSecondTue.getText());
					wed2 = Double.valueOf(textFieldSecondWed.getText());
					thu2 = Double.valueOf(textFieldSecondThu.getText());
					fri2 = Double.valueOf(textFieldSecondFri.getText());
					sat2 = Double.valueOf(textFieldSecondSat.getText());
					sun2 = Double.valueOf(textFieldSecondSun.getText());
					
					double[] week1 = {mon1, tue1, wed1, thu1, fri1, sat1, sun1};
					double[] week2 = {mon2, tue2, wed2, thu2, fri2, sat2, sun2};
					
					//week 1
					for(int i=0; i<7; i++) {
						if(week1[i] <= daily) {
							regsum1 = regsum1 + week1[i];
						}
						else {
							double extrahours1 = week1[i] - daily;
							oversum1 = oversum1 + extrahours1;
							no = no + daily;
							
						}					
					}				
					//week 2
					for(int i=0; i<7; i++) {
						if(week2[i] <= daily) {
							regsum2 = regsum2 + week2[i];
						}
						else {
							double extrahours2 = week2[i] - daily;
							oversum2 = oversum2 + extrahours2;
							mo = mo + daily;
							
						}					
					}
					double regular = regsum1 + regsum2 + mo + no;
					double overtime = oversum1 + oversum2;
					double regAmount = regular * rate;
					double overAmount = overtime * rate;
					double netpay = regAmount + overAmount;
					
					textFieldRegularHours.setText(String.valueOf(regular));
					textFieldRegularAmount.setText(String.valueOf(regAmount));
					textFieldOverhours.setText(String.valueOf(overtime));
					textFieldOverAmount.setText(String.valueOf(overAmount));
					textFieldNetPay.setText(String.valueOf(netpay));
					
					}
				});
			
			lblNewLabel_11 = new JLabel("Regular :");
			lblNewLabel_11.setFont(new Font("Arial", Font.PLAIN, 11));
			lblNewLabel_11.setBounds(161, 282, 48, 14);
			frmGeorgetownCleaningService.getContentPane().add(lblNewLabel_11);
			
			textFieldRegularHours = new JTextField();
			textFieldRegularHours.setEditable(false);
			textFieldRegularHours.setBounds(219, 279, 59, 20);
			frmGeorgetownCleaningService.getContentPane().add(textFieldRegularHours);
			textFieldRegularHours.setColumns(10);
			
			lblNewLabel_12 = new JLabel("Hours");
			lblNewLabel_12.setFont(new Font("Arial", Font.PLAIN, 11));
			lblNewLabel_12.setBounds(219, 254, 48, 14);
			frmGeorgetownCleaningService.getContentPane().add(lblNewLabel_12);
			
			lblNewLabel_13 = new JLabel("Overtime :");
			lblNewLabel_13.setFont(new Font("Arial", Font.PLAIN, 11));
			lblNewLabel_13.setBounds(153, 322, 67, 14);
			frmGeorgetownCleaningService.getContentPane().add(lblNewLabel_13);
			
			textFieldOverhours = new JTextField();
			textFieldOverhours.setEditable(false);
			textFieldOverhours.setBounds(219, 319, 59, 20);
			frmGeorgetownCleaningService.getContentPane().add(textFieldOverhours);
			textFieldOverhours.setColumns(10);
			
			textFieldRegularAmount = new JTextField();
			textFieldRegularAmount.setEditable(false);
			textFieldRegularAmount.setBounds(288, 279, 59, 20);
			frmGeorgetownCleaningService.getContentPane().add(textFieldRegularAmount);
			textFieldRegularAmount.setColumns(10);
			
			textFieldOverAmount = new JTextField();
			textFieldOverAmount.setEditable(false);
			textFieldOverAmount.setBounds(288, 319, 59, 20);
			frmGeorgetownCleaningService.getContentPane().add(textFieldOverAmount);
			textFieldOverAmount.setColumns(10);
			
			lblNewLabel_14 = new JLabel("Amount");
			lblNewLabel_14.setFont(new Font("Arial", Font.PLAIN, 11));
			lblNewLabel_14.setBounds(288, 254, 48, 14);
			frmGeorgetownCleaningService.getContentPane().add(lblNewLabel_14);
			
			lblNewLabel_15 = new JLabel("Net Pay :");
			lblNewLabel_15.setFont(new Font("Arial", Font.PLAIN, 11));
			lblNewLabel_15.setBounds(376, 282, 48, 14);
			frmGeorgetownCleaningService.getContentPane().add(lblNewLabel_15);
			
			textFieldNetPay = new JTextField();
			textFieldNetPay.setEditable(false);
			textFieldNetPay.setBounds(431, 279, 59, 20);
			frmGeorgetownCleaningService.getContentPane().add(textFieldNetPay);
			textFieldNetPay.setColumns(10);
			
			btnClose = new JButton("Close");
			btnClose.setBackground(new Color(243, 240, 220));
			btnClose.setBounds(510, 266,100, 70);
			frmGeorgetownCleaningService.getContentPane().add(btnClose);
			btnClose.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}});
			
			panelProcessing = new JPanel();
			panelProcessing.setBackground(new Color(243, 240, 220));
			panelProcessing.setBorder(new TitledBorder(null, "Payroll Processing", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panelProcessing.setBounds(10, 237, 618, 117);
			frmGeorgetownCleaningService.getContentPane().add(panelProcessing);
		}
	}