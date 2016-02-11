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
import java.util.concurrent.TimeUnit;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

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
	private JPanel panelButton;
	private JButton buttonStart;
	private JButton buttonStop;
	boolean flag = true;
	Timer timer;

	public WeatherDataGui(WeatherData weatherData) {
		this.weatherData = weatherData;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		labelWeaterData = new JLabel("WeaterData");
		labelWeaterData.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelWeaterData.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(labelWeaterData, BorderLayout.NORTH);

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

		panelButton = new JPanel();
		contentPane.add(panelButton, BorderLayout.SOUTH);

		JButton buttonOK = new JButton("OK");
		panelButton.add(buttonOK);
		buttonOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				save();
			}
		});
		
		timer = new Timer(400, new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				//System.out.println("timer");
			}
		});
		
		buttonStart = new JButton("Start");
		buttonStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				timer.stop();
				timer = new Timer(1000, new ActionListener() {
					public void actionPerformed(ActionEvent ev) {
						float tempretature = (float) (Math.random() * 100) - 50;
						float humidity = (float) (Math.random() * 100) - 50;
						float pressure = (float) (Math.random() * 100) - 50;
						weatherData.setMeasurement(tempretature, humidity, pressure);
						textFieldTempretature.setText(String.valueOf(tempretature));
						textFieldHumidity.setText(String.valueOf(humidity));
						textFieldPressure.setText(String.valueOf(pressure));
				
				}
				});
				timer.start();

		}
		});
		panelButton.add(buttonStart);

		buttonStop = new JButton("Stop");
		buttonStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				timer.stop();
			}
		});
		panelButton.add(buttonStop);

		pack();
	}

	private void save() {
		float tempretature = Float.parseFloat(textFieldTempretature.getText());
		float humidity = Float.parseFloat(textFieldHumidity.getText());
		float pressure = Float.parseFloat(textFieldPressure.getText());
		weatherData.setMeasurement(tempretature, humidity, pressure);
	}
}
