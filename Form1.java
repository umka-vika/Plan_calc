import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Form1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form1 frame = new Form1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Form1() {

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 299, 178);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u0428\u0438\u0440\u0438\u043D\u0430:");
		lblNewLabel.setBounds(10, 11, 89, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(109, 8, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\u043C.");
		lblNewLabel_1.setBounds(205, 11, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel label = new JLabel("\u0414\u043B\u0438\u043D\u0430:");
		label.setBounds(10, 39, 89, 14);
		contentPane.add(label);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(109, 36, 86, 20);
		contentPane.add(textField_1);

		JLabel label_1 = new JLabel("\u043C.");
		label_1.setBounds(205, 39, 46, 14);
		contentPane.add(label_1);

		final JCheckBox checkBox = new JCheckBox("\u0443\u0441\u0442\u0430\u043D\u043E\u0432\u043A\u0430 \u043F\u043B\u0438\u043D\u0442\u0443\u0441\u0430");
		checkBox.setSelected(true);
		checkBox.setBounds(20, 63, 195, 23);
		contentPane.add(checkBox);

		JButton button = new JButton("\u0414\u0430\u043B\u0435\u0435");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double width = Double.valueOf(textField.getText());
				double length = Double.valueOf(textField_1.getText());
				boolean plint = checkBox.isSelected();

				Form2 frame = new Form2(width, length, plint);
				frame.setVisible(true);
			}
		});
		button.setBounds(151, 93, 89, 23);
		contentPane.add(button);
	}
}
