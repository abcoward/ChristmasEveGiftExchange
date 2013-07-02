import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class Gui extends JFrame {

	private JPanel panel_top;
	private JPanel panel_center;
	private JPanel panel_bottem;
	
	private JLabel output;

	private JButton btnAddPerson;
	private JButton btnGetList;
	
	private JLabel first_name_label;
	private JTextField first_name_text;
	
	private JLabel last_name_label;
	private JTextField last_name_text;
	private ListMaker lm = new ListMaker();
	
	public Gui(){
		super("Gift Program");
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
		
		panel_top = new JPanel();
		panel_top.setBackground(Color.WHITE);
		
		panel_center = new JPanel();
		panel_center.setBackground(Color.WHITE);
		
		panel_bottem = new JPanel();
		panel_bottem.setBackground(Color.WHITE);
		
		first_name_text = new JTextField(20);
		first_name_text.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
		first_name_text.setEditable(true);
		first_name_text.setFont(new Font("Arial", Font.PLAIN, 12));
		first_name_text.setBackground(Color.white);
		first_name_text.setForeground(Color.black);
		
		last_name_text = new JTextField(20);
		last_name_text.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
		last_name_text.setEditable(true);
		last_name_text.setFont(new Font("Arial", Font.PLAIN, 12));
		last_name_text.setBackground(Color.WHITE);
		last_name_text.setForeground(Color.BLACK);
		
		output = new JLabel();
		output.setSize(50, 50);
		output.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.GREEN));
		output.setFont(new Font("Arial", Font.PLAIN, 12));
		output.setBackground(Color.WHITE);
		output.setForeground(Color.BLACK);
		
		first_name_label = new JLabel();
		first_name_label.setToolTipText("Enter The First Name of The Person");
		first_name_label.setFont(new Font("Arial", Font.BOLD, 12));
		first_name_label.setText("First Name: ");
		first_name_label.setForeground(Color.RED);
		
		last_name_label = new JLabel();
		last_name_label.setToolTipText("Enter the Last Name of the Person");
		last_name_label.setFont(new Font("Arial", Font.BOLD, 12));
		last_name_label.setText("Last Name: ");
		last_name_label.setForeground(Color.RED);
		
		btnAddPerson = new JButton("Add Person");
		btnGetList = new JButton("Get List");
		
		btnAddPerson.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lm.addPerson(first_name_text.getText(), last_name_text.getText());
				first_name_text.setText("");
				last_name_text.setText("");
				output.setText(lm.getCurrentList());
			}
		});
		
		btnGetList.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				output.setText(lm.getFinalList());
			}
		});
		
		panel_top.add(first_name_label);
		panel_top.add(first_name_text);
		panel_top.add(last_name_label);
		panel_top.add(last_name_text);
		
		panel_center.add(output);
		panel_bottem.add(btnAddPerson);
		panel_bottem.add(btnGetList);
		
		getContentPane().add(panel_top);
		getContentPane().add(panel_center);
		getContentPane().add(panel_bottem);
		
	}

}
