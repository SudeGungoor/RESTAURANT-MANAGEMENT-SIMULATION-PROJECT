import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JLabel;

public class Management extends Menu{
	
	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	
	Management() {
		frame.setBounds(0, 0, 1320, 788);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1320,788);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
	
		JLabel customers = new JLabel("Customers(ordered)");
		customers.setBounds(700, 30, 1900, 16);
		panel.add(customers);
		
		JLabel orderedppl = new JLabel("");
		orderedppl.setBounds(700, 50, 1900, 16);
		panel.add(orderedppl);
		
		JLabel stockLabel = new JLabel("Stock Information");
		stockLabel.setBounds(100, 30, 172, 16);
		panel.add(stockLabel);
		
		JLabel totalLabel = new JLabel("Total orders");
		totalLabel.setBounds(500, 30, 92, 16);
		panel.add(totalLabel);
		
		JLabel breakfast_item2 = new JLabel("Breakfast: " + printOrders.get(1));
		breakfast_item2.setBounds(500, 50, 1166, 16);
		panel.add(breakfast_item2);
		
		JLabel pizza_item2 = new JLabel("Pizza: " + printOrders.get(0) ) ;
		pizza_item2.setBounds(500, 70, 1166, 16);
		panel.add(pizza_item2);
		
		JLabel salad_item2 = new JLabel("Salad: " + printOrders.get(3));
		salad_item2.setBounds(500, 90, 1166, 16);
		panel.add(salad_item2);
		
		JLabel dessert_item2 = new JLabel("Dessert: " + printOrders.get(2));
		dessert_item2.setBounds(500, 110, 1166, 16);
		panel.add(dessert_item2);
		
		JLabel drinks_item2 = new JLabel("Drinks: " + printOrders.get(4));
		drinks_item2.setBounds(500, 130, 1166, 16);
		panel.add(drinks_item2);
		
				
		for (Double a: sonMap.keySet()) {
			names = names.concat(sonMap.get(a));
		}
		orderedppl.setText(names);
		
		String stockOut = "";
		int j = 0;
		
		
		for (String i : Menu.stock.keySet()) {
				stockOut= i + " : " + stock.get(i)  ;
				JLabel stock_label = new JLabel("");
				stock_label.setBounds(100, 50+20*j, 2800, 16);
				panel.add(stock_label);		
				stock_label.setText(stockOut);
				j=j+1;
		}
	}
}
