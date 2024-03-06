import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;


public class DeliveryService extends JFrame {
    private JTextField weightTextField;
    private JLabel EnterweightInPounds, TypeofDelivery,insuranceLabel;
    private JPanel northPanel, centerPanel, southPanel,westPanel,westPanel2;
    private JCheckBox InsuranceCheckBox;
    private JRadioButton localOption, longDistanceOption;
    private ButtonGroup deliveryGroup;
    private JButton goButton, resetButton;

    public DeliveryService() {
        super("Delivery Service");
        setSize(400, 300); // Set size for the frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Make sure the program exits when the frame is closed
        
        // Creating and setting layout for north panel
        northPanel = new JPanel();
        EnterweightInPounds = new JLabel("Enter weight in pounds:");
        weightTextField = new JTextField(10);
        northPanel.add(EnterweightInPounds);
        northPanel.add(weightTextField);
        add(northPanel, BorderLayout.NORTH);
        
     // Creating and setting layout for west panel
        JPanel westPanel = new JPanel(new GridLayout(0, 1));
        JLabel TypeofDelivery = new JLabel("Type of Delivery:");
        westPanel.add(TypeofDelivery);

        // Creating and adding insurance components to the same west panel
        insuranceLabel = new JLabel("Insurance");
        InsuranceCheckBox = new JCheckBox("Insurance");
        westPanel.add(InsuranceCheckBox);

        // Adding the west panel to the JFrame
        add(westPanel, BorderLayout.WEST);
        

        // Creating and setting layout for center panel
        JPanel centerPanel = new JPanel(new GridLayout(1, 3));
        JRadioButton localOption = new JRadioButton("Local");
        JRadioButton longDistanceOption = new JRadioButton("Long Distance");
        ButtonGroup deliveryGroup = new ButtonGroup();
        deliveryGroup.add(localOption);
        deliveryGroup.add(longDistanceOption);
        centerPanel.add(localOption);
        centerPanel.add(new JLabel(""));
        centerPanel.add(longDistanceOption);
        add(centerPanel, BorderLayout.CENTER);
        
        // Creating and setting layout for south panel
        goButton = new JButton("Go");
        resetButton = new JButton("Reset");
        southPanel = new JPanel();
        southPanel.add(goButton);
        southPanel.add(resetButton);
        add(southPanel, BorderLayout.SOUTH);

        setVisible(true); // Make the frame visible
    }

    public static void main(String[] args) {
        DeliveryService app = new DeliveryService(); // Creating an instance of the DeliveryService class
    }
}
