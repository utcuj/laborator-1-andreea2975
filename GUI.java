import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class GUI extends Test{

	private JFrame frame;
	private JTextField textField;
	//public Garaa gara = new Garaa();
	private JPanel panel=new JPanel();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Garaa gara =new Garaa();
		Tren tren1 = new Tren("Bucuresti", "12:00", "1595");
		
		Tren tren2 = new Tren("Craiova", "11:11", "1156");
		
		Tren tren3 = new Tren("Cluj", "11:15", "3326");
		
		Tren tren4 = new Tren("Timisoara", "11:14", "1295");
	
		Tren tren5 = new Tren("Brasov", "11:12", "3595");
		
	
		gara.Adaugare_tren(tren1);
		gara.Adaugare_tren(tren2);
		gara.Adaugare_tren(tren3);
		gara.Adaugare_tren(tren4);
		gara.Adaugare_tren(tren5);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
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
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JTextArea textArea = new JTextArea();
		JButton btnCauta = new JButton("Cauta");
		btnCauta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.setText(Garaa.getTren(textField.getText()));
				if(textArea.getText().equals("Trenul nu a fost gasit!"))
					JOptionPane.showMessageDialog(panel, "Nu exista!", "Error", JOptionPane.ERROR_MESSAGE);
			}
		});
		btnCauta.setBounds(258, 38, 97, 25);
		frame.getContentPane().add(btnCauta);
		
		textField = new JTextField();
		textField.setBounds(64, 39, 182, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		textArea.setBounds(64, 111, 225, 90);
		frame.getContentPane().add(textArea);
	}
}
