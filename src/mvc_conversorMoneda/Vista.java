package mvc_conversorMoneda;

import java.awt.BorderLayout;
//import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;

public class Vista extends JFrame {

	private JPanel contentPane;

	private JPanel panel_norte;
	private JPanel panel_centro;
	private JPanel panel_sur;
	JButton euros;
	JButton dolares;
	JLabel lResultado;
	JTextField campoTexto;


	/**
	 * Create the frame.
	 */
	public Vista() {
		setTitle("Conversor Euro - Dolar");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		panel_norte = new JPanel();
		contentPane.add(panel_norte, BorderLayout.NORTH);
		panel_norte.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		campoTexto = new JTextField();
		campoTexto.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_norte.add(campoTexto);
		campoTexto.setColumns(10);
		
		panel_centro = new JPanel();
		contentPane.add(panel_centro, BorderLayout.CENTER);
		panel_centro.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lResultado = new JLabel("Conversor...");
		lResultado.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lResultado.setHorizontalAlignment(SwingConstants.CENTER);
		panel_centro.add(lResultado);
		
		panel_sur = new JPanel();
		contentPane.add(panel_sur, BorderLayout.SOUTH);
		panel_sur.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		euros = new JButton("Convertir a euros");
		panel_sur.add(euros);
		
		dolares = new JButton("Convertir a dolares");
		panel_sur.add(dolares);
		campoTexto.setColumns(10);
	}

}
