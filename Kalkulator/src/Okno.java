import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Okno extends JFrame {

	String cyfra1;
	double c1, wynik;
	char znak;

	public Okno() {

		JPanel p = new JPanel();
		JLabel wyswietlanaCyfra = new JLabel("");

		JButton button1 = new JButton("1");
		JButton button2 = new JButton("2");
		JButton button3 = new JButton("3");
		JButton button4 = new JButton("4");
		JButton button5 = new JButton("5");
		JButton button6 = new JButton("6");
		JButton button7 = new JButton("7");
		JButton button8 = new JButton("8");
		JButton button9 = new JButton("9");
		JButton button0 = new JButton("0");
		JButton buttondod = new JButton("+");
		JButton buttonodejm = new JButton("-");
		JButton buttonmnoz = new JButton("*");
		JButton buttondziel = new JButton("/");
		JButton buttonwynik = new JButton("=");

		setSize(400, 400);
		setLocation(100, 100);
		setTitle("kalkulatorek");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				wyswietlanaCyfra.setText("1");
			}
		});
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				wyswietlanaCyfra.setText("2");
			}
		});
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				wyswietlanaCyfra.setText("3");
			}
		});
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				wyswietlanaCyfra.setText("4");
			}
		});
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				wyswietlanaCyfra.setText("5");
			}
		});
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				wyswietlanaCyfra.setText("6");
			}
		});
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				wyswietlanaCyfra.setText("7");
			}
		});
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				wyswietlanaCyfra.setText("8");
			}
		});
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				wyswietlanaCyfra.setText("9");
			}
		});
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				wyswietlanaCyfra.setText("0");
			}
		});

		buttondod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cyfra1 = wyswietlanaCyfra.getText();
				c1 = Double.parseDouble(cyfra1);
				znak = '+';
				wyswietlanaCyfra.setText("");
			}
		});
		buttonodejm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cyfra1 = wyswietlanaCyfra.getText();
				c1 = Double.parseDouble(cyfra1);
				znak = '-';
				wyswietlanaCyfra.setText("");
			}
		});
		buttonmnoz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cyfra1 = wyswietlanaCyfra.getText();
				c1 = Double.parseDouble(cyfra1);
				znak = '*';
				wyswietlanaCyfra.setText("");
			}
		});
		buttondziel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cyfra1 = wyswietlanaCyfra.getText();
				c1 = Double.parseDouble(cyfra1);
				if (c1 != 0) {
				znak = '/';
				wyswietlanaCyfra.setText("");
				} else {
					wyswietlanaCyfra.setText("naucz sie liczyc");
				}
			}
		});

		buttonwynik.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cyfra1 = wyswietlanaCyfra.getText();
				double c2 = Double.parseDouble(cyfra1);
				switch (znak) {
				case '+':
					wynik = c1 + c2;
					break;
				case '-':
					wynik = c1 - c2;
					break;
				case '*':
					wynik = c1 * c2;
					break;
				case '/':
					wynik = c1 / c2;
				}

				wyswietlanaCyfra.setText(String.valueOf(wynik));

			}
		});

		p.setLayout(new GridLayout(6,3));
		p.add(button1);
		p.add(button2);
		p.add(button3);
		p.add(button4);
		p.add(button5);
		p.add(button6);
		p.add(button7);
		p.add(button8);
		p.add(button9);
		p.add(button0);
		p.add(buttondod);
		p.add(buttonodejm);
		p.add(buttonmnoz);
		p.add(buttondziel);
		p.add(buttonwynik);
		p.add(wyswietlanaCyfra);

		add(p);
	}

}
