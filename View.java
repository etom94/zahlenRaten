package Java.zahlenRaten;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import Java.Multiuse.MyFrame;
import Java.Multiuse.GridBagCreator;

public class View {
    private MyFrame myFrame;
    private GridBagCreator creator = new GridBagCreator();
    private GridBagConstraints placement;
    private JPanel mainPanel, titelPanel, instructionPanel, inputPanel, confirmPanel, outputPanel;
    private JLabel titelLabel, instructionLabel, outputLabel;
    private JTextArea inputArea;
    private JButton confirmButton;

    public View() {
        myFrame = new MyFrame(500,500);

        mainPanel = new JPanel(new GridBagLayout());
        mainPanel.setBackground(Color.RED);
        placement = creator.build();
        myFrame.add(mainPanel, placement);

            titelPanel = new JPanel(new GridBagLayout());
            mainPanel.add(titelPanel, placement = creator.gridX(0).gridY(0).fill(GridBagConstraints.BOTH).build());
                titelLabel = new JLabel();
                titelLabel.setText("Zahlen Raten");
                titelPanel.add(titelLabel, placement = creator.weightY(0.2).anchor(GridBagConstraints.CENTER).build());
    }

    public static void main(String[] args) {
        new View();
    }
}
