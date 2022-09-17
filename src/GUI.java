import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    private JFrame frame;
    private JLabel label1;
    private JLabel label2;
    private JPanel panel;
    public JTextField textfield1;
    public JTextField textfield2;

    public GUI() {

        frame = new JFrame();
        textfield1 = new JTextField(20);
        textfield2 = new JTextField(20);
        JButton button = new JButton("Parse");
        button.addActionListener(this);
        label1 = new JLabel("Copy the link of website: ");
        label2 = new JLabel("Write the name of the tag(html): ");
        panel = new JPanel();

        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panel.setLayout(new GridLayout(3, 2));
        panel.add(label1);
        panel.add(textfield1);
        panel.add(label2);
        panel.add(textfield2);
        panel.add(button);

        frame.add(panel);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Java Parser");
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        new GetHTML(textfield1.getText(), textfield2.getText());
        new ResultFrame();
    }

}
