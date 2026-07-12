package syntax;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI
{
    private JTextField nameTextField;
    private JButton button;
    private JLabel greetingLabel;
    private JPanel rootPanel;
    private JComboBox<String> titleComboBox;

    public static void main(String[] args)
    {
        GUI form = new GUI();
    }

    public GUI()
    {
        /* Typical set up */
        JFrame frame = new JFrame("Greeter");
        frame.setContentPane(rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();    // fit contents to size of window
        frame.setVisible(true);

        button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                // write code to execute when button is pressed
                Object objectFromComboBox = titleComboBox.getSelectedItem();
                String title = (String) objectFromComboBox;
                String message = "Hello " + title + " " + nameTextField.getText();
                greetingLabel.setText(message);

                JOptionPane.showMessageDialog(null, "Message");
                // Also:
                // ERROR_MESSAGE
                // QUESTION_MESSAGE
                // PLAIN_MESSAGE

                frame.pack();
            }
        });
    }

    private void createUIComponents()
    {
        // TODO: place custom component creation code here
        titleComboBox = new JComboBox<>();
        titleComboBox.addItem("Dr");
        titleComboBox.addItem("Miss");
        titleComboBox.addItem("Mr");
        titleComboBox.addItem("Mrs");
        titleComboBox.addItem("Professor");
    }
}
