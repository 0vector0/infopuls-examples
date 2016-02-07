package course02.prj14.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import course02.prj14.DisplayElement;
import course02.prj14.WeatherData;

import javax.swing.JTextPane;
import javax.swing.SwingConstants;

public class WeaterDisplayGui extends JFrame implements Observer, DisplayElement {

	private JPanel contentPane;
	WeatherData weatherData = new WeatherData();
	Observable observable;
	private float tempereature;
	private float humidity;
	private float pressure;
	// JTextPane textPane = new JTextPane();
	private JTextField textFieldTempretature;
	private JTextField textFieldHumidity;
	private JTextField textFieldPressure;
	// WeatherData weatherData = new WeatherData();
	private JPanel panelWeather;
	private JLabel labelTempretature;
	private JLabel labelWeaterDisplay;
	private JLabel labelHumidity;
	private JLabel labelPressure;


	/**
	 * Create the frame.
	 */
	public WeaterDisplayGui(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		labelWeaterDisplay = new JLabel("WeaterDisplay");
		labelWeaterDisplay.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelWeaterDisplay.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(labelWeaterDisplay, BorderLayout.NORTH);

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

	@Override
	public void display() {

		textFieldTempretature.setText(String.valueOf(tempereature));
		textFieldHumidity.setText(String.valueOf(humidity));
		textFieldPressure.setText(String.valueOf(pressure));

	}

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) o;
			this.tempereature = weatherData.getTempretature();
			this.humidity = weatherData.getHumidity();
			this.pressure = weatherData.getPressure();
			display();
		}

	}

}
