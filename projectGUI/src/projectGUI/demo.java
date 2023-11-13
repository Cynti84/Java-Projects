package projectGUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;

public class demo {

	private JFrame frmSalaryCalculator;
	private JTextField textFieldEmployeeName;
	private JTextField textFieldRatesPerHour;
	private JTextField textFieldHoursPerDay;
	private JTextField textFieldNumberOfDaysWorked;
	private JTextField textFieldGrossSalary;
	private JTextField textFieldTaxOfMonthlyWage;
	private JTextField textFieldPhilhealth;
	private JTextField textFieldSSS;
	private JTextField textFieldTotalDeduction;
	private JTextField textFieldGrossSal;
	private JTextField textFieldDeductions;
	private JTextField textFieldNetSalary;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					demo window = new demo();
					window.frmSalaryCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public demo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSalaryCalculator = new JFrame();
		frmSalaryCalculator.getContentPane().setFont(new Font("Arial", Font.PLAIN, 11));
		frmSalaryCalculator.setTitle("Salary Calculator");
		frmSalaryCalculator.setBounds(100, 100, 750, 350);
		frmSalaryCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSalaryCalculator.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Simple Payroll System");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel.setBounds(246, 11, 206, 40);
		frmSalaryCalculator.getContentPane().add(lblNewLabel);
		
		JLabel lblEmployee_name = new JLabel("Employee Name:");
		lblEmployee_name.setFont(new Font("Arial", Font.PLAIN, 11));
		lblEmployee_name.setBounds(39, 70, 84, 14);
		frmSalaryCalculator.getContentPane().add(lblEmployee_name);
		
		textFieldEmployeeName = new JTextField();
		textFieldEmployeeName.setBounds(133, 67, 96, 20);
		frmSalaryCalculator.getContentPane().add(textFieldEmployeeName);
		textFieldEmployeeName.setColumns(10);
		
		JLabel lblRate_per_hour = new JLabel("Rate Per Hour:");
		lblRate_per_hour.setFont(new Font("Arial", Font.PLAIN, 11));
		lblRate_per_hour.setBounds(49, 98, 79, 14);
		frmSalaryCalculator.getContentPane().add(lblRate_per_hour);
		
		textFieldRatesPerHour = new JTextField();
		textFieldRatesPerHour.setBounds(133, 95, 96, 20);
		frmSalaryCalculator.getContentPane().add(textFieldRatesPerHour);
		textFieldRatesPerHour.setColumns(10);
		
		JLabel lblHoursPerDay = new JLabel("Hours Per Day:");
		lblHoursPerDay.setFont(new Font("Arial", Font.PLAIN, 11));
		lblHoursPerDay.setBounds(44, 125, 79, 14);
		frmSalaryCalculator.getContentPane().add(lblHoursPerDay);
		
		textFieldHoursPerDay = new JTextField();
		textFieldHoursPerDay.setFont(new Font("Arial", Font.PLAIN, 11));
		textFieldHoursPerDay.setBounds(133, 123, 96, 20);
		frmSalaryCalculator.getContentPane().add(textFieldHoursPerDay);
		textFieldHoursPerDay.setColumns(10);
		
		JLabel lblNumberOfDaysWorked = new JLabel("Number of Days Worked:");
		lblNumberOfDaysWorked.setFont(new Font("Arial", Font.PLAIN, 11));
		lblNumberOfDaysWorked.setBounds(10, 154, 125, 14);
		frmSalaryCalculator.getContentPane().add(lblNumberOfDaysWorked);
		
		textFieldNumberOfDaysWorked = new JTextField();
		textFieldNumberOfDaysWorked.setBounds(133, 151, 96, 20);
		frmSalaryCalculator.getContentPane().add(textFieldNumberOfDaysWorked);
		textFieldNumberOfDaysWorked.setColumns(10);
		
		JLabel lblGrossSalary = new JLabel("GROSS SALARY:");
		lblGrossSalary.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblGrossSalary.setBounds(10, 215, 113, 20);
		frmSalaryCalculator.getContentPane().add(lblGrossSalary);
		
		textFieldGrossSalary = new JTextField();
		textFieldGrossSalary.setEditable(false);
		textFieldGrossSalary.setBounds(133, 215, 96, 20);
		frmSalaryCalculator.getContentPane().add(textFieldGrossSalary);
		textFieldGrossSalary.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("DEDUCTION OF SALARY");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_6.setForeground(new Color(128, 0, 0));
		lblNewLabel_6.setBounds(287, 62, 140, 14);
		frmSalaryCalculator.getContentPane().add(lblNewLabel_6);
		
		JLabel lblTaxOfMonthlyWage = new JLabel("TAX 15% of Monthly Wage:");
		lblTaxOfMonthlyWage.setFont(new Font("Arial", Font.PLAIN, 11));
		lblTaxOfMonthlyWage.setBounds(264, 83, 136, 14);
		frmSalaryCalculator.getContentPane().add(lblTaxOfMonthlyWage);
		
		textFieldTaxOfMonthlyWage = new JTextField();
		textFieldTaxOfMonthlyWage.setEditable(false);
		textFieldTaxOfMonthlyWage.setBounds(402, 80, 96, 20);
		frmSalaryCalculator.getContentPane().add(textFieldTaxOfMonthlyWage);
		textFieldTaxOfMonthlyWage.setColumns(10);
		
		JLabel lblPhilhealth = new JLabel("Philhealth 5%:");
		lblPhilhealth.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPhilhealth.setBounds(321, 122, 79, 14);
		frmSalaryCalculator.getContentPane().add(lblPhilhealth);
		
		textFieldPhilhealth = new JTextField();
		textFieldPhilhealth.setEditable(false);
		textFieldPhilhealth.setBounds(402, 122, 96, 20);
		frmSalaryCalculator.getContentPane().add(textFieldPhilhealth);
		textFieldPhilhealth.setColumns(10);
		
		JLabel lblSSS = new JLabel("SSS 2%:");
		lblSSS.setFont(new Font("Arial", Font.PLAIN, 11));
		lblSSS.setBounds(350, 157, 50, 14);
		frmSalaryCalculator.getContentPane().add(lblSSS);
		
		textFieldSSS = new JTextField();
		textFieldSSS.setEditable(false);
		textFieldSSS.setBounds(402, 151, 96, 20);
		frmSalaryCalculator.getContentPane().add(textFieldSSS);
		textFieldSSS.setColumns(10);
		
		JLabel lblTotalDeduction = new JLabel("TOTAL DEDUCTION :");
		lblTotalDeduction.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTotalDeduction.setBounds(266, 218, 134, 14);
		frmSalaryCalculator.getContentPane().add(lblTotalDeduction);
		
		textFieldTotalDeduction = new JTextField();
		textFieldTotalDeduction.setEditable(false);
		textFieldTotalDeduction.setBounds(402, 215, 96, 20);
		frmSalaryCalculator.getContentPane().add(textFieldTotalDeduction);
		textFieldTotalDeduction.setColumns(10);
		
		JLabel lblGrossSal = new JLabel("Gross Salary :");
		lblGrossSal.setFont(new Font("Arial", Font.PLAIN, 11));
		lblGrossSal.setBounds(551, 83, 69, 14);
		frmSalaryCalculator.getContentPane().add(lblGrossSal);
		
		textFieldGrossSal = new JTextField();
		textFieldGrossSal.setEditable(false);
		textFieldGrossSal.setBounds(632, 80, 96, 20);
		frmSalaryCalculator.getContentPane().add(textFieldGrossSal);
		textFieldGrossSal.setColumns(10);
		
		JLabel lblDeductions = new JLabel("Deductions :");
		lblDeductions.setFont(new Font("Arial", Font.PLAIN, 11));
		lblDeductions.setBounds(551, 122, 69, 14);
		frmSalaryCalculator.getContentPane().add(lblDeductions);
		
		textFieldDeductions = new JTextField();
		textFieldDeductions.setEditable(false);
		textFieldDeductions.setBounds(632, 119, 96, 20);
		frmSalaryCalculator.getContentPane().add(textFieldDeductions);
		textFieldDeductions.setColumns(10);
		
		JLabel lblNetSalary = new JLabel("NET SALARY :");
		lblNetSalary.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNetSalary.setBounds(541, 218, 89, 14);
		frmSalaryCalculator.getContentPane().add(lblNetSalary);
		
		textFieldNetSalary = new JTextField();
		textFieldNetSalary.setEditable(false);
		textFieldNetSalary.setBounds(632, 215, 96, 20);
		frmSalaryCalculator.getContentPane().add(textFieldNetSalary);
		textFieldNetSalary.setColumns(10);
		
		JButton btnCompute = new JButton("Compute");
		btnCompute.setForeground(new Color(255, 255, 255));
		btnCompute.setBackground(new Color(0, 64, 0));
		btnCompute.setBounds(321, 268, 100, 35);
		frmSalaryCalculator.getContentPane().add(btnCompute);
		btnCompute.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				
				int hours, rates, days, GSal;
				rates = Integer.valueOf(textFieldRatesPerHour.getText()).intValue();
				hours = Integer.valueOf(textFieldHoursPerDay.getText()).intValue();
				days = Integer.valueOf(textFieldNumberOfDaysWorked.getText()).intValue();
				GSal = rates * days * hours;
				
				int tax = (15 * GSal)/100;
				int Phil = (5 * GSal)/100;
				int SSS = (2 * GSal)/100;
				int deductions = tax + Phil + SSS;
				int gross = GSal;
				int NSal = gross - deductions;
				
				textFieldGrossSalary.setText(String.valueOf(GSal));
				textFieldTotalDeduction.setText(String.valueOf(deductions));
				textFieldNetSalary.setText(String.valueOf(NSal));
				textFieldTaxOfMonthlyWage.setText(String.valueOf(tax));
				textFieldPhilhealth.setText(String.valueOf(Phil));
				textFieldSSS.setText(String.valueOf(SSS));
				textFieldGrossSal.setText(String.valueOf(GSal));
				textFieldDeductions.setText(String.valueOf(deductions));
				
			}
		});
	}
}
