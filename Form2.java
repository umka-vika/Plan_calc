import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Form2 extends JFrame {
	
	/**
	 * Create the frame.
	 */
	public Form2(final double a, final double b, final boolean pl) {

		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		JLabel label = new JLabel("\u0412\u044B\u0431\u0435\u0440\u0438\u0442\u0435 \u043D\u0430\u043F\u043E\u043B\u044C\u043D\u043E\u0435 \u043F\u043E\u043A\u0440\u044B\u0442\u0438\u0435:");
		label.setBounds(10, 11, 230, 14);
		getContentPane().add(label);

		final JCheckBox checkBox = new JCheckBox("\u043B\u0438\u043D\u043E\u043B\u0438\u0443\u043C \u0438 \u043F\u043E\u043A\u0440\u044B\u0442\u0438\u0435 \u043D\u0430 \u0440\u0435\u0437\u0438\u043D\u043E\u0432\u043E\u0439 \u043E\u0441\u043D\u043E\u0432\u0435");
		checkBox.setBounds(20, 32, 299, 23);
		getContentPane().add(checkBox);

		final JCheckBox checkBox_1 = new JCheckBox("\u043F\u043E\u043B\u0438\u0432\u0438\u043D\u0438\u043B\u0445\u043B\u043E\u0440\u0438\u0434\u043D\u044B\u0435");
		checkBox_1.setBounds(20, 58, 172, 23);
		getContentPane().add(checkBox_1);

		final JCheckBox checkBox_2 = new JCheckBox("\u043F\u0440\u043E\u0431\u043A\u043E\u0432\u044B\u0435 \u043F\u043E\u043B\u044B");
		checkBox_2.setBounds(20, 84, 172, 23);
		getContentPane().add(checkBox_2);

		final JCheckBox checkBox_3 = new JCheckBox("\u043B\u0430\u043C\u0438\u043D\u0430\u0442");
		checkBox_3.setBounds(20, 110, 172, 23);
		getContentPane().add(checkBox_3);
		
		final JCheckBox checkBox_4 = new JCheckBox("\u043A\u0435\u0440\u0430\u043C\u0438\u0447\u0435\u0441\u043A\u0430\u044F \u043F\u043B\u0438\u0442\u043A\u0430");
		checkBox_4.setBounds(20, 136, 172, 23);
		getContentPane().add(checkBox_4);

		final JCheckBox checkBox_5 = new JCheckBox("\u043A\u043E\u0432\u0440\u043E\u0432\u044B\u0435 \u043F\u043E\u043A\u0440\u044B\u0442\u0438\u044F");
		checkBox_5.setBounds(20, 162, 172, 23);
		getContentPane().add(checkBox_5);

		final JCheckBox checkBox_6 = new JCheckBox("\u043F\u0430\u0440\u043A\u0435\u0442 \u0438 \u043C\u0430\u0441\u0441\u0438\u0432\u043D\u0430\u044F \u0434\u043E\u0441\u043A\u0430");
		checkBox_6.setBounds(20, 188, 172, 23);
		getContentPane().add(checkBox_6);

		final JCheckBox checkBox_7 = new JCheckBox("\u043F\u043E\u043B\u0438\u043C\u0435\u0440\u043D\u044B\u0435");
		checkBox_7.setBounds(20, 214, 172, 23);
		getContentPane().add(checkBox_7);
		
		JButton btnNewButton = new JButton("\u0420\u0430\u0441\u0441\u0447\u0438\u0442\u0430\u0442\u044C");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double S = a*b;
				double P = 2*(a+b);
				
				double L = 0;
				int m = 0;

				if (checkBox.isSelected()) {
					double D = 2.24, C = 321;
					double M = Math.ceil(S/D);
					m += M;
					L += M*C;
				}
				if (checkBox_1.isSelected()) {
					double D = 1.9, C = 418;
					double M = Math.ceil(S/D);
					m += M;
					L += M*C;
				}
				if (checkBox_2.isSelected()) {
					double D = 1.3, C = 1100;
					double M = Math.ceil(S/D);
					m += M;
					L += M*C;
				}
				if (checkBox_3.isSelected()) {
					double D = 1.3, C = 1670;
					double M = Math.ceil(S/D);
					m += M;
					L += M*C;
				}
				if (checkBox_4.isSelected()) {
					double D = 1.368, C = 459;
					double M = Math.ceil(S/D);
					m += M;
					L += M*C;
				}
				if (checkBox_5.isSelected()) {
					double D = 1.48, C = 1244;
					double M = Math.ceil(S/D);
					m += M;
					L += M*C;
				}
				if (checkBox_6.isSelected()) {
					double D = 1.68, C = 1044;
					double M = Math.ceil(S/D);
					m += M;
					L += M*C;
				}
				if (checkBox_7.isSelected()) {
					double D = 1.368, C = 459;
					double M = Math.ceil(S/D);
					m += M;
					L += M*C;
				}
				
				double W = pl ? P*671 : 0;
				double O = L+W;

				Form3 frame = new Form3(S, m, O);
				frame.setVisible(true);
			}
		});
		btnNewButton.setBounds(300, 214, 104, 23);
		getContentPane().add(btnNewButton);

	}
}
