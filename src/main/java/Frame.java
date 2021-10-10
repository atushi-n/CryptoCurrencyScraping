import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    private JLabel label = new JLabel("1BTC");

    public Frame(Dimension size, String title) {
        this.setSize(size);
        this.setTitle(title);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        this.add(panel);
        GridBagLayout layout = new GridBagLayout();
        panel.setLayout(layout);
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 1;
        gbc.gridy = 1;


        panel.setBackground(new Color(200, 200, 255, 255));

        layout.setConstraints(label, gbc);
        label.setBackground(new Color(233,2, 2));
        label.setOpaque(true);

        panel.add(label);






    }

    public void setLabel(String text){
        label.setText("1BTC=" + text + "円");
    }

}
