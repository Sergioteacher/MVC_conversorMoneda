package mvc_conversorMoneda;

import java.awt.BorderLayout;
import java.awt.EventQueue;

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

	JButton euros, dolares;
	JLabel lResultado;
	JTextField campoTexto;


	/**
	 * Create the frame.
	 */
	public Vista() {
		setTitle("Conversor Euro - Dolar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel_sur = new JPanel();
		contentPane.add(panel_sur, BorderLayout.SOUTH);
		panel_sur.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		//JButton euros = new JButton("Convertir a euros");
		euros = new JButton("Convertir a euros");
		panel_sur.add(euros);
		
		//JButton dolares = new JButton("Convertir a dolares");
		dolares = new JButton("Convertir a dolares");
		panel_sur.add(dolares);
		
		//JLabel lResultado = new JLabel("Conversor");
		lResultado = new JLabel("Conversor");
		lResultado.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lResultado.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lResultado, BorderLayout.CENTER);
		
		//campoTexto = new JTextField();
		campoTexto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(campoTexto, BorderLayout.NORTH);
		campoTexto.setColumns(10);
	}

}
