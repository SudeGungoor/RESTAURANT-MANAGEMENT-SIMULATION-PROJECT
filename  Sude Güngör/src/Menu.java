/* *********** Pledge of Honor ***************************************************************************
* I hereby certify that I have completed this programming project on my own
* without any help from anyone else. The effort in the project thus belongs
* completely to me. I did not search for a solution, or I did not consult to any program
* written by other students or did not copy any program from other sources. I read and
* followed the guidelines provided in the project description.
*
* READ AND SIGN BY WRITING YOUR NAME SURNAME AND STUDENT ID
* SIGNATURE: <Remziye Sude Güngör, 71812>
*
************************************************************************************************************/
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Menu implements Comparable<Map<Double,String>>{
	
	protected JFrame frame;
	protected JTextField textBacon;
	protected JTextField textPancake;
	protected JTextField TextCroissant;
	protected JTextField TextFrench;
	protected JTextField TextCorn;
	
	protected JTextField TextMargh;
	protected JTextField TextPepperoni;
	protected JTextField TextVeggie;
	protected JTextField TextMexi;
	protected JTextField TextSea;
	
	protected JTextField TextAvacado;
	protected JTextField TextPasta;
	protected JTextField TextStraw;
	protected JTextField TextWaterm;
	protected JTextField TextGreen;
	
	protected JTextField TextWaffle;
	protected JTextField TextCups;
	protected JTextField TextIce;
	protected JTextField TextApple;
	protected JTextField TextTiramisu;
	
	protected JTextField TextAmericano;
	protected JTextField TextWater;
	protected JTextField TextLatte;
	protected JTextField TextOrange;
	protected JTextField TextLemon;
	
	protected JTextField nameText;
	protected JTextField ageText;
	protected static List<String> namess = new ArrayList<>();
	protected static List<Integer>agess= new ArrayList<>();
	protected static List<Double> pricess = new ArrayList<>();
	protected static List<String> sonList = new ArrayList<>();
	
	protected JTextField numberOfPpl;
	protected static Map<String, Double> stock= new HashMap<>();
	protected static Map<String , Double> totalmap = new HashMap<>();
				
	protected static Map<Double , String> sonMap = new TreeMap<>();
	protected static Map<Double , String> sonMap2 = new TreeMap<>();
	protected Map<String, Double> orders = new HashMap<>();
	protected Map<Double, Integer> priceAge = new HashMap<>();
	protected Map<String, Double> prices = new HashMap<>();
	protected static Map< Integer, String> givenOrders = new TreeMap<>();
	protected Map< Integer, String> map = new HashMap<>();
	protected Map< Integer, String> givenOrders2 = new TreeMap<>();
	

	protected static List<Double> printOrders = new ArrayList<>();
	protected static List<Double> printOrders2 = new ArrayList<>();
	protected List<Integer> tables = new ArrayList<>();
	protected List<Integer> people = new ArrayList<>();

	protected static String names = "";
	
	
	Pizza Margherita = new Pizza("Margherita", 14.80, 20);
	Pizza Pepperoni = new Pizza("Pepperoni", 15.80, 30);
	Pizza Veggie = new Pizza("Veggie", 13.80, 30);
	Pizza Mexican = new Pizza("Mexican", 13.80, 20);
	Pizza SeaFood = new Pizza("SeaFood", 14.80, 20);
	
	Drinks Americano = new Drinks("Americano", 14.80, 20);
	Drinks Water = new Drinks("Water", 15.80, 30);
	Drinks Latte = new Drinks("Latte", 13.80, 30);
	Drinks Lemonade = new Drinks("Lemonade", 13.80, 20);
	Drinks OrangeJuice = new Drinks("Orange Juice", 17.80, 20);
	
	Breakfast BaconsEggs = new Breakfast("Bacons and Eggs", 14.80, 20);
	Breakfast Pancake = new Breakfast("Pancake", 15.80, 30);
	Breakfast Croissant = new Breakfast("Croissant", 13.80, 30);
	Breakfast FrenchToast = new Breakfast("French Toast", 11.80, 20);
	Breakfast CornFlakes = new Breakfast("Corn Flakes", 16.80, 20);
	
	Salad Avacado = new Salad("Avacado Salad", 14.80, 20);
	Salad Pasta = new Salad("Pasta Salad", 15.80, 30);
	Salad Strawberry = new Salad("Strawberry Salad", 13.80, 30);
	Salad Watermelon= new Salad("Watermelon Salad", 11.80, 20);
	Salad Green = new Salad("Green Salad", 16.80, 20);
	
	Dessert Waffle = new Dessert("Waffle", 14.80, 20);
	Dessert Cupcake = new Dessert("Cupcake", 15.80, 30);
	Dessert Ice_Cream = new Dessert("Ice Cream", 13.80, 30);
	Dessert Apple= new Dessert("Apple Pie", 11.80, 20);
	Dessert Tiramisu = new Dessert("Tiramisu", 16.80, 20);
	
	protected List<Integer> o_pizza = new ArrayList<>();
	protected List<Integer> o_breakfast= new ArrayList<>();
	protected List<Integer> o_dessert = new ArrayList<>();
	protected List<Integer> o_drinks= new ArrayList<>();
	protected List<Integer> o_salad = new ArrayList<>();
	
	protected int a; 
	protected double total;


	public static void main(String[] args) {
			Menu window = new Menu();
			window.frame.setVisible(true);			
	}
	Menu() {
		
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Lucida Grande", Font.BOLD, 43));
		frame.setBounds(0, 0, 2000, 1600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1280, 10);
		frame.getContentPane().add(panel);
		
		JPanel Breakfast = new JPanel();
		Breakfast.setForeground(new Color(255, 140, 0));
		Breakfast.setBorder(new LineBorder(new Color(210, 105, 30), 1, true));
		Breakfast.setBounds(71, 121, 266, 588);
		frame.getContentPane().add(Breakfast);
		Breakfast.setLayout(null);
		
		JLabel lblBreakfast = new JLabel("BREAKFAST");
		lblBreakfast.setBounds(67, 6, 131, 27);
		lblBreakfast.setForeground(new Color(0, 100, 0));
		lblBreakfast.setFont(new Font("Lucida Grande", Font.BOLD, 22));
		Breakfast.add(lblBreakfast);
		
		//Bacon and Eggs
		JLabel ImageBacon = new JLabel("");
		Image images = new ImageIcon(this.getClass().getResource("/bacon_eggs.jpeg")).getImage(); 
		ImageBacon.setIcon(new ImageIcon(images));
		// I added image 
		ImageBacon.setBounds(6, 76, 102, 71);
		Breakfast.add(ImageBacon);
		//set the bounds and used the breakfast label to show images, names etc.
		textBacon = new JTextField();
		textBacon.setBounds(118, 121, 130, 26);
		Breakfast.add(textBacon);
		textBacon.setColumns(10);
		JLabel baconsLabel= new JLabel("Bacon and Eggs");
		baconsLabel.setBounds(132, 103, 128, 16);
		Breakfast.add(baconsLabel);
		
		
		
		
		//Pancake
		JLabel ImagePancake = new JLabel("");
		ImagePancake.setBounds(6, 167, 102, 71);
		Breakfast.add(ImagePancake);
		
		Image images2 = new ImageIcon(this.getClass().getResource("/pancake.jpeg")).getImage(); 
		ImagePancake.setIcon(new ImageIcon(images2));
	
		JLabel pancakeLabel = new JLabel("Pancake");
		pancakeLabel.setBounds(132, 194, 128, 16);
		Breakfast.add(pancakeLabel);
		textPancake = new JTextField();
		//double c_pancake = Double.parseDouble(textField_8.getText());  
		textPancake.setColumns(10);
		textPancake.setBounds(118, 212, 130, 26);
		Breakfast.add(textPancake);
		
		
	
		
		
		
		
		//Croissant
		JLabel ImageCroissant= new JLabel("");
		ImageCroissant.setBounds(6, 271, 102, 71);
		Breakfast.add(ImageCroissant);
		
		Image images3 = new ImageIcon(this.getClass().getResource("/croissant.png")).getImage(); 
		ImageCroissant.setIcon(new ImageIcon(images3));
		
		JLabel croissantLabel = new JLabel("Croissant");
		croissantLabel.setBounds(132, 298, 128, 16);
		Breakfast.add(croissantLabel);
		TextCroissant = new JTextField();
		//double c_croissant=Double.parseDouble(textField_9.getText());
		TextCroissant.setColumns(10);
		TextCroissant.setBounds(118, 314, 130, 26);
		Breakfast.add(TextCroissant);
		
		
		
		
		//French toast
		JLabel ImageFrench = new JLabel("");
		ImageFrench.setBounds(6, 383, 102, 71);
		Breakfast.add(ImageFrench);
		
		Image images4 = new ImageIcon(this.getClass().getResource("/french_toast.png")).getImage(); 
		ImageFrench.setIcon(new ImageIcon(images4));
	
		JLabel frenchLabel = new JLabel("French toast");
		frenchLabel.setBounds(132, 410, 128, 16);
		Breakfast.add(frenchLabel);
		TextFrench = new JTextField();
		//double c_french_toast = Double.parseDouble(textField_10.getText());  
		TextFrench.setColumns(10);
		TextFrench.setBounds(118, 426, 130, 26);
		Breakfast.add(TextFrench);
		
		
		//corn flakes
		JLabel ImageCorn = new JLabel("");
		ImageCorn .setBounds(6, 494, 102, 71);
		Breakfast.add(ImageCorn );
		
		Image images5 = new ImageIcon(this.getClass().getResource("/corn_flakes.png")).getImage(); 
		ImageCorn .setIcon(new ImageIcon(images5));
		
		JLabel cornLabel = new JLabel("Corn Flakes");
		cornLabel.setBounds(132, 521, 128, 16);
		Breakfast.add(cornLabel);
		TextCorn = new JTextField();
		//double c_corn_flakes = Double.parseDouble(textField_12.getText());  
		TextCorn.setColumns(10);
		TextCorn.setBounds(118, 539, 130, 26);
		Breakfast.add(TextCorn);
		
		
		
		
		JPanel Pizza = new JPanel();
		Pizza.setLayout(null);
		Pizza.setForeground(new Color(255, 140, 0));
		Pizza.setBorder(new LineBorder(new Color(210, 105, 30), 1, true));
		Pizza.setBounds(402, 121, 266, 588);
		frame.getContentPane().add(Pizza);
		
		JLabel lblPizza = new JLabel("PIZZA");
		lblPizza.setForeground(new Color(0, 100, 0));
		lblPizza.setFont(new Font("Lucida Grande", Font.BOLD, 22));
		lblPizza.setBounds(83, 6, 131, 27);
		Pizza.add(lblPizza);
		
		
		//margherita
		JLabel ImageMargherita = new JLabel("");
		ImageMargherita.setBounds(6, 76, 102, 71);
		Pizza.add(ImageMargherita);
		
		Image images6 = new ImageIcon(this.getClass().getResource("/margherita.png")).getImage(); 
		ImageMargherita.setIcon(new ImageIcon(images6));
		
		TextMargh = new JTextField();
		//double c_margherita = Double.parseDouble(textField_13.getText()); 
		TextMargh.setColumns(10);
		TextMargh.setBounds(118, 121, 130, 26);
		Pizza.add(TextMargh);
		JLabel margheritaLabel= new JLabel("Margherita");
		margheritaLabel.setBounds(132, 103, 128, 16);
		Pizza.add(margheritaLabel);
		
		
		
		//pepperoni
		JLabel ImagePepperoni = new JLabel("");
		ImagePepperoni.setBounds(6, 167, 102, 71);
		Pizza.add(ImagePepperoni);
	
		Image images7 = new ImageIcon(this.getClass().getResource("/pepperoni.png")).getImage(); 
		ImagePepperoni.setIcon(new ImageIcon(images7));
		
		JLabel pepperoniLabel = new JLabel("Pepperoni");
		pepperoniLabel.setBounds(132, 194, 128, 16);
		Pizza.add(pepperoniLabel);
		TextPepperoni = new JTextField();
		//double c_pepperoni = Double.parseDouble(textField_14.getText()); 
		TextPepperoni.setColumns(10);
		TextPepperoni.setBounds(118, 212, 130, 26);
		Pizza.add(TextPepperoni);
		
		
		
		
		//veggie
		JLabel ImageVeggie= new JLabel("");
		ImageVeggie.setBounds(6, 271, 102, 71);
		Pizza.add(ImageVeggie);
		
		Image images8 = new ImageIcon(this.getClass().getResource("/veggie.png")).getImage(); 
		ImageVeggie.setIcon(new ImageIcon(images8));
		
		JLabel veggieLabel = new JLabel("Veggie");
		veggieLabel.setBounds(132, 298, 128, 16);
		Pizza.add(veggieLabel);
		TextVeggie = new JTextField();
		//double c_pepperoni = Double.parseDouble(textField_14.getText()); 
		TextVeggie.setColumns(10);
		TextVeggie.setBounds(118, 314, 130, 26);
		Pizza.add(TextVeggie);
		
		
		//mexican
		JLabel ImageMexi = new JLabel("");
		ImageMexi.setBounds(6, 383, 102, 71);
		Pizza.add(ImageMexi);
		
		Image images9 = new ImageIcon(this.getClass().getResource("/mexican.png")).getImage(); 
		ImageMexi.setIcon(new ImageIcon(images9));
		
		JLabel mexicanLabel = new JLabel("Mexican");
		mexicanLabel.setBounds(132, 410, 128, 16);
		Pizza.add(mexicanLabel);
		TextMexi = new JTextField();
		TextMexi.setColumns(10);
		TextMexi.setBounds(118, 426, 130, 26);
		Pizza.add(TextMexi);
		
		
		
		//seafood
		JLabel ImageSea = new JLabel("");
		ImageSea.setBounds(6, 494, 102, 71);
		Pizza.add(ImageSea);
		
		Image images10 = new ImageIcon(this.getClass().getResource("/seafood.png")).getImage(); 
		ImageSea.setIcon(new ImageIcon(images10));
		
		JLabel seaLabel = new JLabel("Seafood");
		seaLabel.setBounds(132, 521, 128, 16);
		Pizza.add(seaLabel);
		
		TextSea = new JTextField();
		TextSea.setColumns(10);
		TextSea.setBounds(118, 539, 130, 26);
		Pizza.add(TextSea);
		
		
		JPanel Salad = new JPanel();
		Salad.setLayout(null);
		Salad.setForeground(new Color(255, 140, 0));
		Salad.setBorder(new LineBorder(new Color(210, 105, 30), 1, true));
		Salad.setBounds(727, 121, 266, 588);
		frame.getContentPane().add(Salad);
		
		JLabel SaladLabel = new JLabel("SALAD");
		SaladLabel.setForeground(new Color(0, 100, 0));
		SaladLabel.setFont(new Font("Lucida Grande", Font.BOLD, 22));
		SaladLabel.setBounds(83, 6, 131, 27);
		Salad.add(SaladLabel);
		
		
		//avacado
		JLabel ImageAvacado = new JLabel("");
		ImageAvacado.setBounds(6, 76, 102, 71);
		Salad.add(ImageAvacado);
		
		Image images11 = new ImageIcon(this.getClass().getResource("/avacado salad.png")).getImage(); 
		ImageAvacado.setIcon(new ImageIcon(images11));
		
		TextAvacado = new JTextField();
		TextAvacado.setColumns(10);
		TextAvacado.setBounds(118, 121, 130, 26);
		Salad.add(TextAvacado);
		JLabel AvacadoLabel = new JLabel("Avacado Salad");
		AvacadoLabel.setBounds(132, 103, 128, 16);
		Salad.add(AvacadoLabel);
		
		
		//pasta salad
		JLabel ImagePasta = new JLabel("");
		ImagePasta.setBounds(6, 167, 102, 71);
		Salad.add(ImagePasta);
		
		Image images12 = new ImageIcon(this.getClass().getResource("/pasta salad.png")).getImage(); 
		ImagePasta.setIcon(new ImageIcon(images12));
		
		JLabel PastaLabel = new JLabel("Pasta Salad");
		PastaLabel.setBounds(132, 194, 128, 16);
		Salad.add(PastaLabel);
		
		TextPasta = new JTextField();
		TextPasta.setColumns(10);
		TextPasta.setBounds(118, 212, 130, 26);
		Salad.add(TextPasta);
		
		
		//strawberry
		JLabel ImageStraw = new JLabel("");
		ImageStraw.setBounds(6, 271, 102, 71);
		Salad.add(ImageStraw);
		
		Image images13 = new ImageIcon(this.getClass().getResource("/strawberry salad.png")).getImage(); 
		ImageStraw.setIcon(new ImageIcon(images13));
		
		JLabel StrawLabel = new JLabel("Strawberry Salad");
		StrawLabel.setBounds(132, 298, 128, 16);
		Salad.add(StrawLabel);
		TextStraw = new JTextField();
		TextStraw.setColumns(10);
		TextStraw.setBounds(118, 314, 130, 26);
		Salad.add(TextStraw);
		
		
		//watermelon
		JLabel ImageWaterm = new JLabel("");
		ImageWaterm.setBounds(6, 383, 102, 71);
		Salad.add(ImageWaterm);
		
		Image images14 = new ImageIcon(this.getClass().getResource("/watermelon salad.png")).getImage(); 
		ImageWaterm.setIcon(new ImageIcon(images14));
		
		JLabel watermLabel= new JLabel("Watermelon Salad");
		watermLabel.setBounds(132, 410, 128, 16);
		Salad.add(watermLabel);
		TextWaterm = new JTextField();
		TextWaterm.setColumns(10);
		TextWaterm.setBounds(118, 426, 130, 26);
		Salad.add(TextWaterm);
		
		
		//green
		JLabel ImageGreen = new JLabel("");
		ImageGreen.setBounds(6, 494, 102, 71);
		Salad.add(ImageGreen);
		
		Image images15 = new ImageIcon(this.getClass().getResource("/green_salad.png")).getImage(); 
		ImageGreen.setIcon(new ImageIcon(images15));
		
		JLabel greenLabel = new JLabel("Green Salad");
		greenLabel.setBounds(132, 521, 128, 16);
		Salad.add(greenLabel);
		TextGreen = new JTextField();
		TextGreen.setColumns(10);
		TextGreen.setBounds(118, 539, 130, 26);
		Salad.add(TextGreen);
		
		
		
		
		
		JPanel Dessert = new JPanel();
		Dessert.setLayout(null);
		Dessert.setForeground(new Color(255, 140, 0));
		Dessert.setBorder(new LineBorder(new Color(210, 105, 30), 1, true));
		Dessert.setBounds(1062, 121, 266, 588);
		frame.getContentPane().add(Dessert);
		
		JLabel lblDessert= new JLabel("DESSERT");
		lblDessert.setForeground(new Color(0, 100, 0));
		lblDessert.setFont(new Font("Lucida Grande", Font.BOLD, 22));
		lblDessert.setBounds(83, 6, 131, 27);
		Dessert.add(lblDessert);
		
		
		//waffle
		JLabel ImageWaffle = new JLabel("");
		ImageWaffle.setBounds(6, 76, 102, 71);
		Dessert.add(ImageWaffle);
		Image images16 = new ImageIcon(this.getClass().getResource("/waffle.png")).getImage(); 
		ImageWaffle.setIcon(new ImageIcon(images16));
		TextWaffle = new JTextField();
		TextWaffle.setColumns(10);
		TextWaffle.setBounds(118, 121, 130, 26);
		Dessert.add(TextWaffle);
		JLabel waffleLabel = new JLabel("Waffle");
		waffleLabel.setBounds(132, 103, 128, 16);
		Dessert.add(waffleLabel);
		
		
		
		//cupcake
		JLabel ImageCups = new JLabel("");
		ImageCups.setBounds(6, 167, 102, 71);
		Dessert.add(ImageCups);
		Image images17 = new ImageIcon(this.getClass().getResource("/cupcake.png")).getImage(); 
		ImageCups.setIcon(new ImageIcon(images17));
		JLabel CupsLabel = new JLabel("Cupcake");
		CupsLabel.setBounds(132, 194, 128, 16);
		Dessert.add(CupsLabel);
		TextCups = new JTextField();
		TextCups.setColumns(10);
		TextCups.setBounds(118, 212, 130, 26);
		Dessert.add(TextCups);
		
		
		
		//ice cream
		JLabel ImageIce = new JLabel("");
		ImageIce.setBounds(6, 271, 102, 71);
		Dessert.add(ImageIce);
		Image images18 = new ImageIcon(this.getClass().getResource("/ice cream.jpeg")).getImage(); 
		ImageIce.setIcon(new ImageIcon(images18));
		JLabel iceLabel = new JLabel("Ice cream");
		iceLabel.setBounds(132, 298, 128, 16);
		Dessert.add(iceLabel);
		TextIce = new JTextField();
		TextIce.setColumns(10);
		TextIce.setBounds(118, 314, 130, 26);
		Dessert.add(TextIce);
		
		
		//apple pie
		JLabel imageApple = new JLabel("");
		imageApple.setBounds(6, 383, 102, 71);
		Dessert.add(imageApple);
		Image images19 = new ImageIcon(this.getClass().getResource("/apple pie.png")).getImage(); 
		imageApple.setIcon(new ImageIcon(images19));
		JLabel appleLabel = new JLabel("Apple pie");
		appleLabel.setBounds(132, 410, 128, 16);
		Dessert.add(appleLabel);
		TextApple = new JTextField();
		TextApple.setColumns(10);
		TextApple.setBounds(118, 426, 130, 26);
		Dessert.add(TextApple);
		
		
		
		//tiramisu
		JLabel ImageTiramisu = new JLabel("");
		ImageTiramisu.setBounds(6, 494, 102, 71);
		Dessert.add(ImageTiramisu);
		Image images20 = new ImageIcon(this.getClass().getResource("/tiramisu.jpeg")).getImage(); 
		ImageTiramisu.setIcon(new ImageIcon(images20));
		JLabel tiramisuLabel= new JLabel("Tiramisu");
		tiramisuLabel.setBounds(132, 521, 128, 16);
		Dessert.add(tiramisuLabel);
		TextTiramisu = new JTextField();
		TextTiramisu.setColumns(10);
		TextTiramisu.setBounds(118, 539, 130, 26);
		Dessert.add(TextTiramisu);
		
		
		
		JPanel Drinks = new JPanel();
		Drinks.setLayout(null);
		Drinks.setForeground(new Color(255, 140, 0));
		Drinks.setBorder(new LineBorder(new Color(210, 105, 30), 1, true));
		Drinks.setBounds(1393, 121, 266, 588);
		frame.getContentPane().add(Drinks);
		
		JLabel lblDrinks = new JLabel("DRINKS");
		lblDrinks.setForeground(new Color(0, 100, 0));
		lblDrinks.setFont(new Font("Lucida Grande", Font.BOLD, 22));
		lblDrinks.setBounds(83, 6, 131, 27);
		Drinks.add(lblDrinks);
		
		
		//americano
		JLabel ImageAmericano = new JLabel("");
		ImageAmericano.setBounds(6, 76, 102, 71);
		Drinks.add(ImageAmericano);
		Image images21 = new ImageIcon(this.getClass().getResource("/americano.png")).getImage(); 
		ImageAmericano.setIcon(new ImageIcon(images21));
		TextAmericano = new JTextField();
		TextAmericano.setColumns(10);
		TextAmericano.setBounds(118, 121, 130, 26);
		Drinks.add(TextAmericano);
		JLabel americanoLabel = new JLabel("Americano");
		americanoLabel.setBounds(132, 103, 128, 16);
		Drinks.add(americanoLabel);
		
		
		//water
		JLabel ImageWater = new JLabel("");
		ImageWater.setBounds(6, 167, 102, 71);
		Drinks.add(ImageWater);
		Image images22 = new ImageIcon(this.getClass().getResource("/water.jpeg")).getImage(); 
		ImageWater.setIcon(new ImageIcon(images22));
		JLabel WaterLabel = new JLabel("Water");
		WaterLabel.setBounds(132, 194, 128, 16);
		Drinks.add(WaterLabel);
		TextWater = new JTextField();
		TextWater.setColumns(10);
		TextWater.setBounds(118, 212, 130, 26);
		Drinks.add(TextWater);
		
		
		//latte
		JLabel ImageLatte = new JLabel("");
		ImageLatte.setBounds(6, 271, 102, 71);
		Drinks.add(ImageLatte);
		Image images23 = new ImageIcon(this.getClass().getResource("/latte.png")).getImage(); 
		ImageLatte.setIcon(new ImageIcon(images23));
		JLabel latteLabel= new JLabel("Latte");
		latteLabel.setBounds(132, 298, 128, 16);
		Drinks.add(latteLabel);
		TextLatte = new JTextField();
		TextLatte.setColumns(10);
		TextLatte.setBounds(118, 314, 130, 26);
		Drinks.add(TextLatte);
		
		
		//orange
		JLabel ImageOrange = new JLabel("");
		ImageOrange.setBounds(6, 383, 102, 71);
		Drinks.add(ImageOrange);
		Image images24 = new ImageIcon(this.getClass().getResource("/orange_juice.png")).getImage(); 
		ImageOrange.setIcon(new ImageIcon(images24));
		JLabel orangeLabel = new JLabel("Orange Juice");
		orangeLabel.setBounds(132, 410, 128, 16);
		Drinks.add(orangeLabel);
		TextOrange = new JTextField();
		TextOrange.setColumns(10);
		TextOrange.setBounds(118, 426, 130, 26);
		Drinks.add(TextOrange);
		
		
		//lemonade
		JLabel ImageLemon = new JLabel("");
		ImageLemon.setBounds(6, 494, 102, 71);
		Drinks.add(ImageLemon);
		Image images25 = new ImageIcon(this.getClass().getResource("/lemonade.png")).getImage(); 
		ImageLemon.setIcon(new ImageIcon(images25));
		JLabel lemonLabel= new JLabel("Lemonade");
		lemonLabel.setBounds(132, 521, 128, 16);
		Drinks.add(lemonLabel);
		TextLemon = new JTextField();
		TextLemon.setColumns(10);
		TextLemon.setBounds(118, 539, 130, 26);
		Drinks.add(TextLemon);
	
		
		//I did same thing x25 for every menu item
		
		//I am asking for reservation here
		JLabel question = new JLabel("Number of people that you are going to order:");
		question.setBounds(71, 93, 312, 16);
		frame.add(question);
		
		
		JLabel warningppl = new JLabel();
		warningppl.setBounds(1096, 736, 435, 16);
		frame.add(warningppl);
		
		JLabel order = new JLabel();
		order.setBounds(400, 760, 1263, 16);
		frame.add(order);
		
		
		numberOfPpl = new JTextField();
		numberOfPpl.setColumns(10);
		numberOfPpl.setBounds(369, 83, 130, 26);
		frame.add(numberOfPpl);
		
		
		//I have limited tables and seats created here

		tables.add(0);
		tables.add(2);
		tables.add(3);
		tables.add(2);
		tables.add(3);
		tables.add(3);
		tables.add(3);
		
		people.add(1);
		people.add(2);
		people.add(3);
		people.add(4);
		people.add(5);
		people.add(6);
		
		//I created a label to show total amount
		JLabel totalAmount = new JLabel();
		totalAmount.setBounds(400, 772, 257, 16);
		frame.getContentPane().add(totalAmount);
		
		//to show warning if there is no seat
		JLabel noSeat = new JLabel();
		noSeat.setBounds(701, 716, 682, 16);
		frame.getContentPane().add(noSeat);
		
		//getting age and name information
		JLabel ageLabel = new JLabel("Age");
		ageLabel.setBounds(422, 27, 61, 16);
		frame.getContentPane().add(ageLabel);
		
		JLabel nameLabel = new JLabel("Name Surname");
		nameLabel.setBounds(128, 27, 136, 16);
		frame.getContentPane().add(nameLabel);
		
		nameText = new JTextField();
		nameText.setBounds(241, 22, 130, 26);
		frame.getContentPane().add(nameText);
		nameText.setColumns(10);
		
		ageText = new JTextField();
		ageText.setBounds(463, 22, 130, 26);
		frame.getContentPane().add(ageText);
		ageText.setColumns(10);
		
		//////////////////////////////////////////
		JLabel table = new JLabel(tables.get(1) + "  tables for 1 people,  " + tables.get(2) + "  tables for 2 people,  " +  tables.get(3) + "  tables for 3 people,  " +  
				 tables.get(4) + "  tables for 4 people,  " + tables.get(5) + "  tables for 5 people,  " +  tables.get(6) + "  tables for 6 people."  );
		table.setBounds(71, 65, 1137, 16);
		frame.add(table);
		// created empty table info 
		
		
		//I created some requirements by writing the if else blocks under button option
		JButton orderButton = new JButton("Order!");
		orderButton.setBounds(789, 731, 117, 29);
		frame.getContentPane().add(orderButton);
		
		
		double pizza = Margherita.getStock() + Mexican.getStock() + Veggie.getStock()+ Pepperoni.getStock()+ SeaFood.getStock();
		double breakfast = BaconsEggs.getStock() + Croissant.getStock() + Pancake.getStock() + FrenchToast.getStock() + CornFlakes.getStock();
		double dessert = Waffle.getStock() + Cupcake.getStock()+ Ice_Cream.getStock() + Apple.getStock() + Tiramisu.getStock();
		double salad = Avacado.getStock()+ Green.getStock()+ Strawberry.getStock()+Watermelon.getStock()+ Pasta.getStock();
		double drinks = Americano.getStock()+ Water.getStock()+ Lemonade.getStock()+ OrangeJuice.getStock()+ Latte.getStock();
		
		
		
		
		orderButton.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			
		if(e.getSource()==orderButton) {
			System.out.println(pizza);
			// the name and the age and the number of ppl should be given by customer
			//if not the button will not calculate anything
			if(nameText.getText().length()!=0 & ageText.getText().length()!=0) {
				
				
				if(numberOfPpl.getText().length()!=0) {
					int ppl = Integer.parseInt(numberOfPpl.getText());
					if(people.contains(ppl)) {
					
					if(tables.get(ppl)>0) {
					int a = tables.get(ppl);
					tables.set(ppl, a-1);
					}
					else if(tables.get(ppl+1)>0) {
					a = tables.get(ppl+1);
					tables.set(ppl+1, a-1);
					}
					else if (tables.get(ppl+1)==0 & tables.get(ppl)==0 ) {
						people.remove(people.indexOf(ppl));
						people.remove(people.indexOf(ppl+1));
						noSeat.setText("Restaurant is full, you cannot reserve for now");
					}
				}
			// here I am checking if there are seats for n and n+1 ppl if not the customer will get a warning
			
					
					
			//again I rewrite 25 times these requirements 	
			
			if(BaconsEggs.getStock()==0) {
				//if there is no stock , there will be no image etc.
				baconsLabel.setVisible(false);
				textBacon.setEditable(false);
				ImageBacon.setVisible(false);
			}
			if(textBacon.getText().length()!=0) {
				//if the order is given for bacon 
				//I changed the type string to double
				double bacon = Double.parseDouble(textBacon.getText());
				if(bacon > BaconsEggs.getStock()) {
					//ordere bacon is more than stock
					//than it is grayed out
					baconsLabel.setForeground(Color.gray);	
				}
	
				else {
					//if there is no other occurences than order is ready
					orders.put("Bacons and Eggs", bacon);
					prices.put("Bacons and Eggs", BaconsEggs.getPrice());
					BaconsEggs.setStock(BaconsEggs.getStock()-bacon);
					//stock decreased
					//I have 2 maps to use later on
					//one is for prices other #orders 
				}
			}
			
			
			if(Croissant.getStock()==0) {
				croissantLabel.setVisible(false);
				TextCroissant.setEditable(false);
				ImageCroissant.setVisible(false);
			}
			
			if(TextCroissant.getText().length()!=0) {
				double croissant = Double.parseDouble(TextCroissant.getText());
				if(croissant > Croissant.getStock()) {
					croissantLabel.setForeground(Color.gray);	
				}
				else {
		
					orders.put("Croissant", croissant);
					prices.put("Croissant", Croissant.getPrice());
					Croissant.setStock(Croissant.getStock()-croissant);
					//stock decreased
				}
			}

			if(Pancake.getStock()==0.0) {
				pancakeLabel.setVisible(false);
				textPancake.setEditable(false);
				ImagePancake.setVisible(false);	
			}
			if(textPancake.getText().length()!=0) {
				double pancake = Double.parseDouble(textPancake.getText());
				if(pancake > Pancake.getStock()) {
					pancakeLabel.setForeground(Color.gray);	
				}
				else {
		
					orders.put("Pancake", pancake);
					prices.put("Pancake", Pancake.getPrice());
					Pancake.setStock(Pancake.getStock()-pancake);
				}
			}
			if(FrenchToast.getStock()==0) {
				frenchLabel.setVisible(false);
				TextFrench.setEditable(false);
				ImageFrench.setVisible(false);
			}
			
			if(TextFrench.getText().length()!=0) {
				double french = Double.parseDouble(TextFrench.getText());
				if(french > FrenchToast.getStock()) {
					frenchLabel.setForeground(Color.gray);	
				}
				else {
		
					orders.put("French Toast", french);
					prices.put("French Toast", FrenchToast.getPrice());
					FrenchToast.setStock(FrenchToast.getStock()-french);
					//stock decreased
				}
			}
			if(CornFlakes.getStock()==0) {
				cornLabel.setVisible(false);
				TextCorn.setEditable(false);
				ImageCorn.setVisible(false);
			}
			
			if(TextCorn.getText().length()!=0) {
				double corn = Double.parseDouble(TextCorn.getText());
				if(corn > CornFlakes.getStock()) {
					cornLabel.setForeground(Color.gray);	
				}
				else {
		
					orders.put("Corn Flakes", corn);
					prices.put("Corn Flakes", CornFlakes.getPrice());
					CornFlakes.setStock(CornFlakes.getStock()-corn);
					//stock decreased
				}
			}	
		
			if(Margherita.getStock()==0) {
				margheritaLabel.setVisible(false);
				TextMargh.setEditable(false);
				ImageMargherita.setVisible(false);
			}
			
			if(TextMargh.getText().length()!=0) {
				double margherita = Double.parseDouble(TextMargh.getText());
				if(margherita > Margherita.getStock()) {
					margheritaLabel.setForeground(Color.gray);	
				}
				else {
		
					orders.put("Margherita", margherita);
					prices.put("Margherita", Margherita.getPrice());
					Margherita.setStock(Margherita.getStock()-margherita);
					//stock decreased
				}
			}	
			

			if(Pepperoni.getStock()==0) {
				pepperoniLabel.setVisible(false);
				TextPepperoni.setEditable(false);
				ImagePepperoni.setVisible(false);
			}
			
			if(TextPepperoni.getText().length()!=0) {
				double pepperoni = Double.parseDouble(TextPepperoni.getText());
				if(pepperoni> Pepperoni.getStock()) {
					pepperoniLabel.setForeground(Color.gray);	
				}
				else {
		
					orders.put("Pepperoni", pepperoni);
					prices.put("Pepperoni", Pepperoni.getPrice());
					Pepperoni.setStock(Pepperoni.getStock()-pepperoni);
					//stock decreased
				}
			}	
			
			if(Veggie.getStock()==0) {
				veggieLabel.setVisible(false);
				TextVeggie.setEditable(false);
				ImageVeggie.setVisible(false);
			}
			
			if(TextVeggie.getText().length()!=0) {
				double veggie = Double.parseDouble(TextVeggie.getText());
				if(veggie> Veggie.getStock()) {
					veggieLabel.setForeground(Color.gray);	
				}
				else {
		
					orders.put("Veggie", veggie);
					prices.put("Veggie", Veggie.getPrice());
					Veggie.setStock(Veggie.getStock()-veggie);
					//stock decreased
				}
			}	

			if(Mexican.getStock()==0) {
				mexicanLabel.setVisible(false);
				TextMexi.setEditable(false);
				ImageMexi.setVisible(false);
			}
			
			if(TextMexi.getText().length()!=0) {
				double mexican = Double.parseDouble(TextMexi.getText());
				if(mexican> Mexican.getStock()) {
					mexicanLabel.setForeground(Color.gray);	
				}
				else {
		
					orders.put("Mexican", mexican);
					prices.put("Mexican", Mexican.getPrice());
					Mexican.setStock(Mexican.getStock()-mexican);
					//stock decreased
				}
			}	
			
			if(SeaFood.getStock()==0) {
				seaLabel.setVisible(false);
				TextSea.setEditable(false);
				ImageSea.setVisible(false);
			}
			
			if(TextSea.getText().length()!=0) {
				double sea = Double.parseDouble(TextSea.getText());
				if(sea> SeaFood.getStock()) {
					seaLabel.setForeground(Color.gray);	
				}
				else {
		
					orders.put("Seafood", sea);
					prices.put("Seafood", SeaFood.getPrice());
					SeaFood.setStock(SeaFood.getStock()-sea);
					//stock decreased
				}
			}	
			
			if(Avacado.getStock()==0) {
				AvacadoLabel.setVisible(false);
				TextAvacado.setEditable(false);
				ImageAvacado.setVisible(false);
			}
			
			if(TextAvacado.getText().length()!=0) {
				double avacado = Double.parseDouble(TextAvacado.getText());
				if(avacado> Avacado.getStock()) {
					AvacadoLabel.setForeground(Color.gray);	
				}
			else {
		
				orders.put("Avacado Salad", avacado);
				prices.put("Avacado Salad", Avacado.getPrice());
				Avacado.setStock(Avacado.getStock()-avacado);
				//stock decreased
			}
			}	
			if(Pasta.getStock()==0) {
				PastaLabel.setVisible(false);
				TextPasta.setEditable(false);
				ImagePasta.setVisible(false);
			}
			
			if(TextPasta.getText().length()!=0) {
				double pasta= Double.parseDouble(TextPasta.getText());
				if(pasta> Pasta.getStock()) {
					PastaLabel.setForeground(Color.gray);	
				}
				else {
		
					orders.put("Pasta Salad", pasta);
					prices.put("Pasta Salad", Pasta.getPrice());
					Pasta.setStock(Pasta.getStock()-pasta);
					//stock decreased
				}
			}
			if(Strawberry.getStock()==0) {
			StrawLabel.setVisible(false);
			TextStraw.setEditable(false);
			ImageStraw.setVisible(false);
			}
			
			if(TextStraw.getText().length()!=0) {
				double straw = Double.parseDouble(TextStraw.getText());
				if(straw > Strawberry.getStock()) {
					StrawLabel.setForeground(Color.gray);	
				}
			else {
		
				orders.put("Strawberry Salad", straw);
				prices.put("Strawberry Salad", Strawberry.getPrice());
				Strawberry.setStock(Strawberry.getStock()-straw);
				//stock decreased
				}
			}
			if(Watermelon.getStock()==0) {
				watermLabel.setVisible(false);
				TextWaterm.setEditable(false);
				ImageWaterm.setVisible(false);
			}
			
			if(TextWaterm.getText().length()!=0) {
				double waterm = Double.parseDouble(TextWaterm.getText());
				if(waterm > Watermelon.getStock()) {
					watermLabel.setForeground(Color.gray);	
				}
			else {
	
				orders.put("Watermelon Salad", waterm);
				prices.put("Watermelon Salad", Watermelon.getPrice());
				Watermelon.setStock(Watermelon.getStock()-waterm);
				//stock decreased
				}
			}

			if(Green.getStock()==0) {
				greenLabel.setVisible(false);
				TextGreen.setEditable(false);
				ImageGreen.setVisible(false);
			}
			
			if(TextGreen.getText().length()!=0) {
				double green = Double.parseDouble(TextGreen.getText());
				if(green > Green.getStock()) {
					greenLabel.setForeground(Color.gray);	
				}
			else {
		
				orders.put("Green Salad", green);
				prices.put("Green Salad", Green.getPrice());
				Green.setStock(Green.getStock()-green);
				//stock decreased
			}
			}
			if(Waffle.getStock()==0) {
				waffleLabel.setVisible(false);
				TextWaffle.setEditable(false);
				ImageWaffle.setVisible(false);
			}
			
			if(TextWaffle.getText().length()!=0) {
				double waffle = Double.parseDouble(TextWaffle.getText());
				if(waffle > Waffle.getStock()) {
					waffleLabel.setForeground(Color.gray);	
				}
			else {
		
				orders.put("Waffle", waffle);
				prices.put("Waffle", Waffle.getPrice());
				Waffle.setStock(Waffle.getStock()-waffle);
				//stock decreased
			}
			}
			if(Cupcake.getStock()==0) {
				CupsLabel.setVisible(false);
				TextCups.setEditable(false);
				ImageCups.setVisible(false);
			}
			
			if(TextCups.getText().length()!=0) {
				double cups = Double.parseDouble(TextCups.getText());
				if(cups >Cupcake.getStock()) {
					CupsLabel.setForeground(Color.gray);	
				}
			else {
		
				orders.put("Cupcake", cups);
				prices.put("Cupcake", Cupcake.getPrice());
				Cupcake.setStock(Cupcake.getStock()-cups);
				//stock decreased
			}
			}	
			if(Ice_Cream.getStock()==0) {
				iceLabel.setVisible(false);
				TextIce.setEditable(false);
				ImageIce.setVisible(false);
			}
			
			if(TextIce.getText().length()!=0) {
				double ice = Double.parseDouble(TextIce.getText());
				if(ice >Ice_Cream.getStock()) {
					iceLabel.setForeground(Color.gray);	
				}
			else {
	
				orders.put("Ice Cream", ice);
				prices.put("Ice Cream", Ice_Cream.getPrice());
				Ice_Cream.setStock(Ice_Cream.getStock()-ice);
				//stock decreased
			}
			}
			if(Apple.getStock()==0) {
				appleLabel.setVisible(false);
				TextApple.setEditable(false);
				imageApple.setVisible(false);
			}
			
			if(TextApple.getText().length()!=0) {
				double apple = Double.parseDouble(TextApple.getText());
				if(apple > Apple.getStock()) {
					appleLabel.setForeground(Color.gray);	
				}
			else {

				orders.put("Apple Pie", apple);
				prices.put("Apple Pie", Apple.getPrice());
				Apple.setStock(Apple.getStock()-apple);
				
				//stock decreased
			}
			}
			if(Tiramisu.getStock()==0) {
				tiramisuLabel.setVisible(false);
				TextTiramisu.setEditable(false);
				ImageTiramisu.setVisible(false);
			}
			
			if(TextTiramisu.getText().length()!=0) {
				double tiramisu = Double.parseDouble(TextTiramisu.getText());
				if(tiramisu > Tiramisu.getStock()) {
					tiramisuLabel.setForeground(Color.gray);	
				}
				else {
		
					orders.put("Tiramisu", tiramisu);
					prices.put("Tiramisu", Tiramisu.getPrice());
					Tiramisu.setStock(Tiramisu.getStock()-tiramisu);
					//stock decreased
				}
			}
			if(Americano.getStock()==0) {
				americanoLabel.setVisible(false);
				TextAmericano.setEditable(false);
				ImageAmericano.setVisible(false);
			}
			if(TextAmericano.getText().length()!=0) {
				double americano = Double.parseDouble(TextAmericano.getText());
				if(americano > Americano.getStock()) {
					americanoLabel.setForeground(Color.gray);	
				}
				else {
					orders.put("Americano", americano);
					prices.put("Americano", Americano.getPrice());
					Americano.setStock(Americano.getStock()-americano);
					//stock decreased
				}
			}
			if(Water.getStock()==0) {
				WaterLabel.setVisible(false);
				TextWater.setEditable(false);
				ImageWater.setVisible(false);
			}
			if(TextWater.getText().length()!=0) {
				double water = Double.parseDouble(TextWater.getText());
				if(water > Water.getStock()) {
					WaterLabel.setForeground(Color.gray);	
				}
				else {
					orders.put("Water", water);
					prices.put("Water", Water.getPrice());
					Water.setStock(Water.getStock()-water);
					//stock decreased
				}
			}
			if(Latte.getStock()==0) {
				latteLabel.setVisible(false);
				TextLatte.setEditable(false);
				ImageLatte.setVisible(false);
			}
			if(TextLatte.getText().length()!=0) {
				double latte = Double.parseDouble(TextLatte.getText());
				if(latte > Latte.getStock()) {
					latteLabel.setForeground(Color.gray);	
				}
				else {
					orders.put("Latte", latte);
					prices.put("Latte", Latte.getPrice());
					Latte.setStock(Latte.getStock()-latte);
					//stock decreased
				}
			}
		
			if(OrangeJuice.getStock()==0) {
				orangeLabel.setVisible(false);
				TextOrange.setEditable(false);
				ImageOrange.setVisible(false);
				
			}
			if(TextOrange.getText().length()!=0) {
				double orange = Double.parseDouble(TextOrange.getText());
				if(orange > OrangeJuice.getStock()) {
					orangeLabel.setForeground(Color.gray);	
				}
			else{
				orders.put("Orange Juice", orange);
				prices.put("Orange Juice", OrangeJuice.getPrice());
				OrangeJuice.setStock(OrangeJuice.getStock()-orange);
				//stock decreased
			}
				
			}
			if(Lemonade.getStock()==0) {
				lemonLabel.setVisible(false);
				TextLemon.setEditable(false);
				ImageLemon.setVisible(false);
			}
			if(TextLemon.getText().length()!=0  ) {
				double lemon = Double.parseDouble(TextLemon.getText());
				if(lemon > Lemonade.getStock()) {
					lemonLabel.setForeground(Color.gray);	
				}
			else {
				orders.put("Lemonade", lemon);
				prices.put("Lemonade",Lemonade.getPrice());
				Lemonade.setStock(Lemonade.getStock()-lemon);
				//stock decreased
			}
				
			}
			}
			//////////////end of x25 checking
			else {
				warningppl.setText("You need to state the number of people");
				//i did not close first if statement to make customers to give 
				//the number of ppl that they will be ordering for
			}
			}
			//first I get the stocks before the customer gave an order
			//after the order is given I get the stocks again
			//then I calculate the difference
			double pizza2 = Margherita.getStock() + Mexican.getStock() + Veggie.getStock()+ Pepperoni.getStock()+ SeaFood.getStock();
			double breakfast2 = BaconsEggs.getStock() + Croissant.getStock() + Pancake.getStock() + FrenchToast.getStock() + CornFlakes.getStock();
			double dessert2 = Waffle.getStock() + Cupcake.getStock()+ Ice_Cream.getStock() + Apple.getStock() + Tiramisu.getStock();
			double salad2 = Avacado.getStock()+ Green.getStock()+ Strawberry.getStock()+Watermelon.getStock()+ Pasta.getStock();
			double drinks2 = Americano.getStock()+ Water.getStock()+ Lemonade.getStock()+ OrangeJuice.getStock()+ Latte.getStock();
	
			double pizza_ = pizza - pizza2;
			double brakfast_ = breakfast - breakfast2;
			double dessert_ = dessert - dessert2;
			double salad_ = salad - salad2;
			double drinks_ = drinks- drinks2;
			
			printOrders.clear();
			printOrders.add(pizza_);
			printOrders.add(brakfast_);
			printOrders.add(dessert_);
			printOrders.add(salad_);
			printOrders.add(drinks_);
			
			//I am iterating over the orders map which includes name of menu items 
			//and amount of the menu items
			//then I set the textfields 
			String orderOut = "";
			for (String i : orders.keySet()) {
				if(orders.get(i)!=0) {
					orderOut= orderOut.concat(i + " : " + orders.get(i) + " " ) ;
				}
				order.setText("The order is:  " + orderOut);
			}
			//setting the order out
			
			for (String i : orders.keySet()) {
				if(orders.get(i)>0) {
					total += orders.get(i) * prices.get(i);	
				}			
			}
			String result = Double.toString( total );
			totalAmount.setText("Total amount is : " +result +  "TL" );
			//setting the total price here
			
			table.setText(tables.get(1) + "  tables for 1 people,  " + tables.get(2) + "  tables for 2 people,  " +  tables.get(3) + "  tables for 3 people,  " +  
				 tables.get(4) + "  tables for 4 people,  " + tables.get(5) + "  tables for 5 people,  " +  tables.get(6) + "  tables for 6 people.");
			//for next orders I cleared the map
			orders.clear();
			totalmap.put(nameText.getText(), total);
		
			
			total = 0;
			}
			givenOrders.put(Integer.parseInt(ageText.getText()) , nameText.getText());
			givenOrders2.put(Integer.parseInt(ageText.getText()) , nameText.getText());
			
			
			for (String i : givenOrders2.values()) {
				sonMap.put(totalmap.get(i),i);
			}
		
			
			for (double i : sonMap.keySet()) {
				sonMap2.put(i, sonMap.get(i));		
			}
			/*
			Comparator<Entry<Integer, String>> comparator = (o1,o2) -> {
				int i = o1.getvalue().compareTo(o2.getValue());
				if(i==0) {
					return o1.getKey().compareTo(o2.getKey());
					
				}else {
					return 1;
				
			}
			};
			givenOrders.entrySet().stream().sorted(comparator);
			*/
			stock.put(Margherita.getName(), Margherita.getStock());
			stock.put(Veggie.getName(), Veggie.getStock());
			stock.put(SeaFood.getName(), SeaFood.getStock());
			stock.put(Mexican.getName(),Mexican.getStock());
			stock.put(Pepperoni.getName(), Pepperoni.getStock());
			
			
			stock.put(Americano.getName(), Americano.getStock());
			stock.put(Water.getName(), Water.getStock());
			stock.put(Lemonade.getName(), Lemonade.getStock());
			stock.put(OrangeJuice.getName(),OrangeJuice.getStock());
			stock.put(Latte.getName(), Latte.getStock());
			
			
			stock.put(Cupcake.getName(), Cupcake.getStock());
			stock.put(Waffle.getName(), Waffle.getStock());
			stock.put(Ice_Cream.getName(), Ice_Cream.getStock());
			stock.put(Apple.getName(),Apple.getStock());
			stock.put(Tiramisu.getName(), Tiramisu.getStock());
			
		
			stock.put(Pasta.getName(), Pasta.getStock());
			stock.put(Avacado.getName(), Avacado.getStock());
			stock.put(Strawberry.getName(), Strawberry.getStock());
			stock.put(Watermelon.getName(),Watermelon.getStock());
			stock.put(Green.getName(), Green.getStock());
			
			
			stock.put(BaconsEggs.getName(), BaconsEggs.getStock());
			stock.put(Croissant.getName(), Croissant.getStock());
			stock.put(Pancake.getName(), Pancake.getStock());
			stock.put(FrenchToast.getName(),FrenchToast.getStock());
			stock.put(CornFlakes.getName(), CornFlakes.getStock());
			
			
		}
			});
		
			JButton managementPanel = new JButton("Management Panel");
			managementPanel.setBounds(0, 755, 266, 29);
			frame.getContentPane().add(managementPanel);
			managementPanel.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					
				if(e.getSource()==managementPanel) {
					
					Management label= new Management();
					label.frame.setVisible(true);	
					baconsLabel.setForeground(Color.black);	
					croissantLabel.setForeground(Color.black);
					pancakeLabel.setForeground(Color.black);
					frenchLabel.setForeground(Color.black);
					cornLabel.setForeground(Color.black);	
					margheritaLabel.setForeground(Color.black);	
					pepperoniLabel.setForeground(Color.black);	
					veggieLabel.setForeground(Color.black);	
					mexicanLabel.setForeground(Color.black);
					seaLabel.setForeground(Color.black);	
					AvacadoLabel.setForeground(Color.black);	
					PastaLabel.setForeground(Color.black);
					StrawLabel.setForeground(Color.black);	
					watermLabel.setForeground(Color.black);	
					greenLabel.setForeground(Color.black);	
					waffleLabel.setForeground(Color.black);
					CupsLabel.setForeground(Color.black);
					iceLabel.setForeground(Color.black);	
					appleLabel.setForeground(Color.black);
					tiramisuLabel.setForeground(Color.black);
					americanoLabel.setForeground(Color.black);	
					WaterLabel.setForeground(Color.black);	
					latteLabel.setForeground(Color.black);	
					orangeLabel.setForeground(Color.black);	
					lemonLabel.setForeground(Color.black);
					
				}
			}					
			});
			
	}

	@Override
	public int compareTo(Map<Double,String> o) {
		// TODO Auto-generated method stub
		
		for(int i : givenOrders2.keySet()) {
			givenOrders2.remove(i);
			for(int j : givenOrders2.keySet()) {
				if(i == j)	{
					for(double a : sonMap.keySet()) {
						sonMap2.remove(a);
						for(double b : sonMap2.keySet()) {
							if(a<b) {
							return -1;	
							}
						if (b<a){
						return 1;
						}
						}
			}
		}
		}
	
	}
		return 0;
	}
	
	
	
}


	

	