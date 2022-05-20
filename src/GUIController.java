import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

public class GUIController implements ActionListener {
    private WeatherNetworkingClient client;
    private JTextField zipCode;
    private JLabel temperature;
    private JLabel condition;
    private JLabel pictureLabel; // picture
    private JCheckBox enableC; // button for celcius
    private Weather weather;

    public GUIController(){
        client = new WeatherNetworkingClient();
        zipCode = new JTextField();
        temperature = new JLabel();
        condition = new JLabel();
        pictureLabel = new JLabel();
        enableC = new JCheckBox();
        weather = null;
        start();
    }

    private void start(){
        JFrame frame = new JFrame("Weather App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel intro = new JLabel("")
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
