package practicals;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingUtilities;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class p16_RGb extends JFrame {
    private JSlider redSlider;
    private JSlider greenSlider;
    private JSlider blueSlider;
    private JPanel colorPanel;

    public p16_RGb() {
        // Create sliders
        redSlider = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
        greenSlider = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
        blueSlider = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);

        // Create color panel
        colorPanel = new JPanel();
        colorPanel.setPreferredSize(new Dimension(200, 200));

        // Add sliders and color panel to the frame
        add(redSlider, BorderLayout.NORTH);
        add(greenSlider, BorderLayout.CENTER);
        add(blueSlider, BorderLayout.SOUTH);
        add(colorPanel, BorderLayout.EAST);

        // Register listeners for sliders
        redSlider.addChangeListener(new ColorChangeListener());
        greenSlider.addChangeListener(new ColorChangeListener());
        blueSlider.addChangeListener(new ColorChangeListener());

        // Set up the frame
        setTitle("RGB Color Combination");
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private class ColorChangeListener implements ChangeListener {
        @Override
        public void stateChanged(ChangeEvent e) {
            int redValue = redSlider.getValue();
            int greenValue = greenSlider.getValue();
            int blueValue = blueSlider.getValue();

            Color selectedColor = new Color(redValue, greenValue, blueValue);
            colorPanel.setBackground(selectedColor);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new p16_RGb());
    }
}
