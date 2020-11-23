import javax.swing.*;

public class Final_Project extends JFrame {
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
	JComboBox cb_quantity = new JComboBox();
	
	
	public static void main(String[] args) {
		Final_Project app = new Final_Project();
		app.setSize(600, 700);
		app.setTitle("Bear's Store");
		app.setDefaultCloseOperation(EXIT_ON_CLOSE);
		app.setVisible(true);
		for(int i=0;i<=100;i++) {
			cb_quantity.addItem(new Integer(i));
		}
	}
}
