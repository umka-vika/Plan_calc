import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Form3 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the frame.
	 */
	public Form3(double S, int m, double O) {
		// Установка параметров окна
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 365, 144);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Создание текстовой метки
		JLabel label = new JLabel("\u041E\u0431\u0449\u0430\u044F \u043F\u043B\u043E\u0449\u0430\u0434\u044C:");
		label.setBounds(10, 14, 120, 14);
		contentPane.add(label);
		
		// Создание текстового поля
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(180, 14, 86, 20);
		textField.setText(String.format("%.2f", S));
		contentPane.add(textField);
		
		// Создание текстовой метки
		JLabel label_1 = new JLabel("\u043C2.");
		label_1.setBounds(275, 17, 46, 14);
		contentPane.add(label_1);
		
		// Создание текстовой метки
		JLabel label_2 = new JLabel("\u0443\u043F\u0430\u043A\u043E\u0432\u043E\u043A");
		label_2.setBounds(275, 45, 71, 14);
		contentPane.add(label_2);
		
		// Создание текстового поля
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(180, 42, 86, 20);
		textField_1.setText(String.format("%d", m));
		contentPane.add(textField_1);
		
		// Создание текстовой метки
		JLabel label_3 = new JLabel("\u041A\u043E\u043B\u0438\u0447\u0435\u0441\u0442\u0432\u043E \u043C\u0430\u0442\u0435\u0440\u0438\u0430\u043B\u043E\u0432:");
		label_3.setBounds(10, 42, 147, 14);
		contentPane.add(label_3);
		
		// Создание текстовой метки
		JLabel label_4 = new JLabel("\u041E\u0431\u0449\u0430\u044F \u0441\u0443\u043C\u043C\u0430:");
		label_4.setBounds(10, 70, 147, 14);
		contentPane.add(label_4);
		
		// Создание текстового поля
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(180, 70, 86, 20);
		textField_2.setText(String.format("%.2f", O));
		contentPane.add(textField_2);
		
		// Создание текстовой метки
		JLabel label_5 = new JLabel("\u0440\u0443\u0431\u043B\u0435\u0439");
		label_5.setBounds(275, 73, 71, 14);
		contentPane.add(label_5);
	}

}
