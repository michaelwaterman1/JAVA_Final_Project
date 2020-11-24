import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Final_project extends JFrame implements ActionListener {
	// The up and bottom panels
	JPanel p_up = new JPanel();
	JPanel p_bottom = new JPanel();
	
	
	// The buttons
	JButton b_cart = new JButton("Cart");
	JButton b_add = new JButton("Add");
	JButton b_remove = new JButton("Remove");
	JButton b_checkout = new JButton("CheckOut");
	JButton b_startnew = new JButton("Start over the Order");
	
	//The combobox
	JComboBox<Integer> cb_quantity = new JComboBox<Integer>();
	
	//The Labels
	JLabel l_heading1 = new JLabel("Bear's Cafe");
	JLabel l_heading2 = new JLabel("Quantity");
	
	
	public static void main(String[] args) {
		Final_project app = new Final_project();
		app.setSize(600, 700);
		app.setTitle("Bear's Cafe");
		app.setDefaultCloseOperation(EXIT_ON_CLOSE);
		app.setVisible(true);
	}
	
	Final_project() {
		this.setLayout(new BorderLayout());
		
		// add action listeners
		b_cart.addActionListener(this);
		b_add.addActionListener(this);
		b_remove.addActionListener(this);
		b_checkout.addActionListener(this);
		b_startnew.addActionListener(this);
		
		//interface design
		p_up.add(l_heading1);
		p_up.add(b_cart);
		add(p_up,BorderLayout.NORTH);
		p_bottom.add(l_heading2);
		
		//adding quantity number into combobox
		for (int i = 1; i <= 100; i++) {
			cb_quantity.addItem(new Integer(i));
		}
		p_bottom.add(cb_quantity);
		p_bottom.add(b_add);
		add(p_bottom,BorderLayout.SOUTH);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
class Coffee {
	String name;
	String [] names = {"Iced coffee", "Hot coffee", "Decaf coffee"};
	size();
	
public String getSizeasString() {
	String size$ = "";
	switch (size) {
	case 0: size$ = "Small"; break;
	case 1: size$ = "medium"; break;
	case 2: size$ = "Large"; break;
	default: size$ = "Error parsing size!";
	
	}
	
	return size$;
	

}
}
