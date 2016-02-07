package course02.prj14.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import course02.prj14.WeatherData;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class WeatherDataGui extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldTempretature;
	private JTextField textFieldHumidity;
	private JTextField textFieldPressure;
	WeatherData weatherData = new WeatherData();
	private JPanel panelWeather;
	private JLabel labelTempretature;
	private JLabel labelWeaterData;
	private JLabel labelHumidity;
	private JLabel labelPressure;

	public WeatherDataGui(WeatherData weatherData) {
		this.weatherData = weatherData;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JButton buttonOK = new JButton("OK");
		buttonOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float tempretature = Float.parseFloat(textFieldTempretature.getText());
				float humidity = Float.parseFloat(textFieldHumidity.getText());
				float pressure = Float.parseFloat(textFieldPressure.getText());
				weatherData.setMeasurement(tempretature, humidity, pressure);
			}
		});

		labelWeaterData = new JLabel("WeaterData");
		labelWeaterData.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelWeaterData.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(labelWeaterData, BorderLayout.NORTH);
		contentPane.add(buttonOK, BorderLayout.SOUTH);

		panelWeather = new JPanel();
		contentPane.add(panelWeather, BorderLayout.CENTER);
		panelWeather.setLayout(new GridLayout(3, 1, 0, 0));

		labelTempretature = new JLabel("Tempretature");
		labelTempretature.setHorizontalAlignment(SwingConstants.RIGHT);
		panelWeather.add(labelTempretature);

		textFieldTempretature = new JTextField();
		panelWeather.add(textFieldTempretature);
		textFieldTempretature.setColumns(10);

		labelHumidity = new JLabel("Humidity");
		labelHumidity.setHorizontalAlignment(SwingConstants.RIGHT);
		panelWeather.add(labelHumidity);

		textFieldHumidity = new JTextField();
		panelWeather.add(textFieldHumidity);
		textFieldHumidity.setColumns(10);

		labelPressure = new JLabel("Pressure");
		labelPressure.setHorizontalAlignment(SwingConstants.RIGHT);
		panelWeather.add(labelPressure);

		textFieldPressure = new JTextField();
		panelWeather.add(textFieldPressure);
		textFieldPressure.setColumns(10);
		pack();
	}
}
