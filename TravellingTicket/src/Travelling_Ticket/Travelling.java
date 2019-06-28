package Travelling_Ticket;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Travelling {

	private JFrame frame;
	private JTextField txtTax;
	private JTextField txtSubTotal;
	private JTextField txtTotal;
	private JTextField txtClass;
	private JTextField txtTicket;
	private JTextField txtAdult;
	private JTextField txtChild;
	private JTextField txtFrom;
	private JTextField txtTo;
	private JTextField txtDate;
	private JTextField txtTime;
	private JTextField txtTicketNo;
	private JTextField txtPrice;
	private JTextField txtRoute;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Travelling window = new Travelling();
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
	public Travelling() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 24));
		frame.setBounds(0, 0, 1370, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(46, 44, 610, 73);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("Travelling Ticketing System");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("TicketType");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1.setBounds(254, 146, 179, 43);
		frame.getContentPane().add(lblNewLabel_1);
		
		JRadioButton rdbtnStandard = new JRadioButton("Standard");
		rdbtnStandard.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnStandard.setBounds(36, 198, 127, 25);
		frame.getContentPane().add(rdbtnStandard);
		
		JRadioButton rdbtnEconomy = new JRadioButton("Economy");
		rdbtnEconomy.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnEconomy.setBounds(36, 250, 127, 25);
		frame.getContentPane().add(rdbtnEconomy);
		
		JRadioButton rdbtnFirstClass = new JRadioButton("First Class");
		rdbtnFirstClass.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnFirstClass.setBounds(36, 313, 149, 25);
		frame.getContentPane().add(rdbtnFirstClass);
		
		JRadioButton rdbtnReturnTicket = new JRadioButton("Return Ticket");
		rdbtnReturnTicket.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnReturnTicket.setBounds(226, 250, 179, 25);
		frame.getContentPane().add(rdbtnReturnTicket);
		
		JRadioButton rdbtnSingleTicket = new JRadioButton("Single Ticket");
		rdbtnSingleTicket.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnSingleTicket.setBounds(226, 198, 164, 25);
		frame.getContentPane().add(rdbtnSingleTicket);
		
		JRadioButton rdbtnAdult = new JRadioButton("Adult");
		rdbtnAdult.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnAdult.setBounds(426, 198, 127, 25);
		frame.getContentPane().add(rdbtnAdult);
		
		JRadioButton rdbtnChild = new JRadioButton("Child");
		rdbtnChild.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnChild.setBounds(426, 253, 127, 25);
		frame.getContentPane().add(rdbtnChild);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(124, 188, -41, 1);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(46, 186, 610, 3);
		frame.getContentPane().add(separator_1);
		
		JComboBox cmbDestination = new JComboBox();
		cmbDestination.setModel(new DefaultComboBoxModel(new String[] {"Destination", "Kilburn", "Preston", "Oxford", "Leed"}));
		cmbDestination.setFont(new Font("Tahoma", Font.BOLD, 24));
		cmbDestination.setBounds(226, 317, 283, 35);
		frame.getContentPane().add(cmbDestination);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(46, 365, 610, 3);
		frame.getContentPane().add(separator_2);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTax.setBounds(46, 392, 56, 16);
		frame.getContentPane().add(lblTax);
		
		JLabel lblSubTotal = new JLabel("SubTotal");
		lblSubTotal.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSubTotal.setBounds(46, 433, 104, 16);
		frame.getContentPane().add(lblSubTotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTotal.setBounds(46, 476, 56, 16);
		frame.getContentPane().add(lblTotal);
		
		txtTax = new JTextField();
		txtTax.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtTax.setHorizontalAlignment(SwingConstants.CENTER);
		txtTax.setBounds(234, 389, 116, 22);
		frame.getContentPane().add(txtTax);
		txtTax.setColumns(10);
		
		txtSubTotal = new JTextField();
		txtSubTotal.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtSubTotal.setHorizontalAlignment(SwingConstants.CENTER);
		txtSubTotal.setBounds(234, 430, 116, 22);
		frame.getContentPane().add(txtSubTotal);
		txtSubTotal.setColumns(10);
		
		txtTotal = new JTextField();
		txtTotal.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtTotal.setHorizontalAlignment(SwingConstants.CENTER);
		txtTotal.setBounds(234, 473, 116, 22);
		frame.getContentPane().add(txtTotal);
		txtTotal.setColumns(10);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				double tax = 19.50;
				double MilesK8 = 25.78;
				double MilesK12 = 25.10;
				double MilesK20 = 45.23;
				double MilesK30 = 55.98;
				double totalCost, eco = 3.85, fclass = 5.60;
				
				
				
				//standard kilburn
				
				if((rdbtnStandard.isSelected()) && (rdbtnSingleTicket.isSelected()) && (rdbtnAdult.isSelected()) && cmbDestination.getSelectedItem().equals("Kilburn"))
				{
					
					
					totalCost = (tax*MilesK8)/100;
					String sTax = String.format("£%.2f", totalCost);
					txtTax.setText(sTax);
					String SubTotal = String.format("£%.2f", MilesK8);
					txtSubTotal.setText(SubTotal);
					String Total  = String.format("£%.2f", MilesK8 + totalCost);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
				}
				
				else if ((rdbtnStandard.isSelected()) && (rdbtnReturnTicket.isSelected()) && (rdbtnAdult.isSelected()) && cmbDestination.getSelectedItem().equals("Kilburn"))
				{
					
					totalCost = (tax*(MilesK8 * 2))/100;
					String sTax = String.format("£%.2f", totalCost);
					txtTax.setText(sTax);
					String SubTotal = String.format("£%.2f", MilesK8 * 2);
					txtSubTotal.setText(SubTotal);
					String Total  = String.format("£%.2f", (MilesK8 + totalCost) * 2);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
					
				}
				
				else if ((rdbtnStandard.isSelected()) && (rdbtnSingleTicket.isSelected()) && (rdbtnChild.isSelected()) && cmbDestination.getSelectedItem().equals("Kilburn"))
				{
					
					totalCost = (tax*MilesK8)/100;
					String sTax = String.format("£%.2f", totalCost - 18);
					txtTax.setText(sTax);
					String SubTotal = String.format("£%.2f", MilesK8);
					txtSubTotal.setText(SubTotal);
					String Total  = String.format("£%.2f", MilesK8 + totalCost - 18);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
					
				}
				
				else if ((rdbtnStandard.isSelected()) && (rdbtnReturnTicket.isSelected()) && (rdbtnChild.isSelected()) && cmbDestination.getSelectedItem().equals("Kilburn"))
				{
					
					totalCost = (tax*(MilesK8 * 2))/100;
					String sTax = String.format("£%.2f", totalCost - 18);
					txtTax.setText(sTax);
					String SubTotal = String.format("£%.2f", MilesK8*2);
					txtSubTotal.setText(SubTotal);
					String Total  = String.format("£%.2f", ((MilesK8 + totalCost) * 2)-18);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
					
				}
				
				//economy kilburn
				
				
				
				
			}
		});
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//time
				Calendar timer = Calendar.getInstance();
				timer.getTime();
				SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
				txtTime.setText(tTime.format(timer.getTime()));
				//date
				SimpleDateFormat Tdate = new SimpleDateFormat("dd-MMM-yyyy");
				txtDate.setText(Tdate.format(timer.getTime()));
				
				txtFrom.setText("London");
				txtTo.setText((String) cmbDestination.getSelectedItem()+ "*");
				//random number generator
				int num1;
				String q1 = "";
				num1 = 1325 + (int) (Math.random()*4238);
				q1+=num1 + 1325;//why is + 1325?
				txtTicketNo.setText(q1);
				
				txtRoute.setText("Any");
				
				
				
				
			}
		});
		btnTotal.setToolTipText("Total Cost of Ticket");
		btnTotal.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnTotal.setBounds(88, 562, 97, 25);
		frame.getContentPane().add(btnTotal);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setToolTipText("Reset System");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtTax.setText(null);
				txtSubTotal.setText(null);
				txtTotal.setText(null);
				rdbtnAdult.setSelected(false);
				rdbtnChild.setSelected(false);
				rdbtnStandard.setSelected(false);
				rdbtnEconomy.setSelected(false);
				rdbtnFirstClass.setSelected(false);
				rdbtnSingleTicket.setSelected(false);
				rdbtnReturnTicket.setSelected(false);
				cmbDestination.setSelectedItem("Destination");
				txtClass.setText(null);
				txtTicket.setText(null);
				txtAdult.setText(null);
				txtChild.setText(null);
				txtFrom.setText(null);
				txtTo.setText(null);
				txtDate.setText(null);
				txtTime.setText(null);
				txtTicketNo.setText(null);
				txtPrice.setText(null);
				txtRoute.setText(null);
				
				
				
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnReset.setBounds(254, 562, 116, 25);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setToolTipText("Exit System");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frame = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Ticketing System", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnExit.setBounds(412, 562, 97, 25);
		frame.getContentPane().add(btnExit);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(46, 518, 610, 3);
		frame.getContentPane().add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(786, 75, -8, 477);
		frame.getContentPane().add(separator_4);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(786, 334, 12, -248);
		frame.getContentPane().add(separator_5);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setOrientation(SwingConstants.VERTICAL);
		separator_6.setBounds(701, 44, 2, 574);
		frame.getContentPane().add(separator_6);
		
		txtClass = new JTextField();
		txtClass.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtClass.setHorizontalAlignment(SwingConstants.CENTER);
		txtClass.setColumns(10);
		txtClass.setBounds(747, 99, 97, 22);
		frame.getContentPane().add(txtClass);
		
		txtTicket = new JTextField();
		txtTicket.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtTicket.setHorizontalAlignment(SwingConstants.CENTER);
		txtTicket.setColumns(10);
		txtTicket.setBounds(897, 102, 110, 22);
		frame.getContentPane().add(txtTicket);
		
		txtAdult = new JTextField();
		txtAdult.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtAdult.setHorizontalAlignment(SwingConstants.CENTER);
		txtAdult.setColumns(10);
		txtAdult.setBounds(1043, 102, 97, 22);
		frame.getContentPane().add(txtAdult);
		
		txtChild = new JTextField();
		txtChild.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtChild.setHorizontalAlignment(SwingConstants.CENTER);
		txtChild.setColumns(10);
		txtChild.setBounds(1199, 102, 97, 22);
		frame.getContentPane().add(txtChild);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setBounds(730, 134, 610, 3);
		frame.getContentPane().add(separator_7);
		
		JLabel lblClass = new JLabel("Class");
		lblClass.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblClass.setBounds(747, 64, 104, 16);
		frame.getContentPane().add(lblClass);
		
		JLabel lblTicket = new JLabel("Ticket");
		lblTicket.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTicket.setBounds(897, 64, 104, 16);
		frame.getContentPane().add(lblTicket);
		
		JLabel lblAdult = new JLabel("Adult");
		lblAdult.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblAdult.setBounds(1043, 64, 104, 16);
		frame.getContentPane().add(lblAdult);
		
		JLabel lblChild = new JLabel("Child");
		lblChild.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblChild.setBounds(1192, 64, 104, 16);
		frame.getContentPane().add(lblChild);
		
		JSeparator separator_8 = new JSeparator();
		separator_8.setBounds(730, 86, 610, 3);
		frame.getContentPane().add(separator_8);
		
		JLabel lblFrom = new JLabel("From");
		lblFrom.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblFrom.setBounds(740, 166, 104, 16);
		frame.getContentPane().add(lblFrom);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTo.setBounds(740, 233, 104, 16);
		frame.getContentPane().add(lblTo);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDate.setBounds(740, 293, 104, 16);
		frame.getContentPane().add(lblDate);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTime.setBounds(740, 352, 104, 16);
		frame.getContentPane().add(lblTime);
		
		txtFrom = new JTextField();
		txtFrom.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtFrom.setHorizontalAlignment(SwingConstants.CENTER);
		txtFrom.setColumns(10);
		txtFrom.setBounds(897, 163, 97, 22);
		frame.getContentPane().add(txtFrom);
		
		txtTo = new JTextField();
		txtTo.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtTo.setHorizontalAlignment(SwingConstants.CENTER);
		txtTo.setColumns(10);
		txtTo.setBounds(897, 227, 97, 22);
		frame.getContentPane().add(txtTo);
		
		txtDate = new JTextField();
		txtDate.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtDate.setHorizontalAlignment(SwingConstants.CENTER);
		txtDate.setColumns(10);
		txtDate.setBounds(897, 293, 97, 22);
		frame.getContentPane().add(txtDate);
		
		txtTime = new JTextField();
		txtTime.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtTime.setHorizontalAlignment(SwingConstants.CENTER);
		txtTime.setColumns(10);
		txtTime.setBounds(897, 346, 97, 22);
		frame.getContentPane().add(txtTime);
		
		JLabel lblTicketNo = new JLabel("Ticket No");
		lblTicketNo.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTicketNo.setBounds(1123, 163, 104, 16);
		frame.getContentPane().add(lblTicketNo);
		
		txtTicketNo = new JTextField();
		txtTicketNo.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtTicketNo.setHorizontalAlignment(SwingConstants.CENTER);
		txtTicketNo.setColumns(10);
		txtTicketNo.setBounds(1112, 198, 97, 22);
		frame.getContentPane().add(txtTicketNo);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPrice.setBounds(1123, 233, 104, 16);
		frame.getContentPane().add(lblPrice);
		
		txtPrice = new JTextField();
		txtPrice.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtPrice.setHorizontalAlignment(SwingConstants.CENTER);
		txtPrice.setColumns(10);
		txtPrice.setBounds(1112, 262, 97, 22);
		frame.getContentPane().add(txtPrice);
		
		JLabel lblRoute = new JLabel("Route");
		lblRoute.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblRoute.setBounds(1123, 299, 104, 16);
		frame.getContentPane().add(lblRoute);
		
		txtRoute = new JTextField();
		txtRoute.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtRoute.setHorizontalAlignment(SwingConstants.CENTER);
		txtRoute.setColumns(10);
		txtRoute.setBounds(1112, 328, 97, 22);
		frame.getContentPane().add(txtRoute);
		
		JSeparator separator_9 = new JSeparator();
		separator_9.setOrientation(SwingConstants.VERTICAL);
		separator_9.setBounds(747, 216, 610, 3);
		frame.getContentPane().add(separator_9);
		
		JSeparator separator_10 = new JSeparator();
		separator_10.setOrientation(SwingConstants.VERTICAL);
		separator_10.setBounds(1053, 146, 2, 472);
		frame.getContentPane().add(separator_10);
	}
}
