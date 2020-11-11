import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 

class Bingkai 
	extends JFrame 
	implements ActionListener { 

	private Container c; 
	private JLabel title;
	private JLabel nim; 
	private JTextField tnim; 
	private JLabel name; 
	private JTextField tname; 
	private JLabel mk; 
	private JTextField tmk; 
	private JLabel absen; 
	private JRadioButton hadir; 
	private JRadioButton thadir; 
	private ButtonGroup gengp; 
	private JLabel tk; 
	private JComboBox date; 
	private JComboBox month; 
	private JComboBox year; 
	private JCheckBox term; 
	private JButton sub; 
	private JButton reset; 
	private JTextArea tout; 
	private JLabel res; 
	private JTextArea resadd; 

	private String dates[] 
		= { "1", "2", "3", "4", "5", 
			"6", "7", "8", "9", "10", 
			"11", "12", "13", "14", "15", 
			"16", "17", "18", "19", "20", 
			"21", "22", "23", "24", "25", 
			"26", "27", "28", "29", "30", 
			"31" }; 
	private String months[] 
		= { "Jan", "feb", "Mar", "Apr", 
			"May", "Jun", "July", "Aug", 
			"Sup", "Oct", "Nov", "Dec" }; 
	private String years[] 
		= { "1995", "1996", "1997", "1998", 
			"1999", "2000", "2001", "2002", 
			"2003", "2004", "2005", "2006", 
			"2007", "2008", "2009", "2010", 
			"2011", "2012", "2013", "2014", 
			"2015", "2016", "2017", "2018", 
			"2019" }; 

	public Bingkai() 
	{ 
		setTitle("Form Absen"); 
		setBounds(300, 90, 900, 600); 
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
		setResizable(false); 

		c = getContentPane(); 
		c.setLayout(null); 

		title = new JLabel("Form Absen Mata kuliah FTI"); 
		title.setFont(new Font("compact", Font.BOLD, 30)); 
		title.setSize(500, 30); 
		title.setLocation(250, 30); 
		c.add(title); 

				nim = new JLabel("NIM"); 
				nim.setFont(new Font("Arial", Font.BOLD, 20)); 
				nim.setSize(100, 20); 
				nim.setLocation(100, 100); 
				c.add(nim);
				
				tnim = new JTextField(); 
				tnim.setFont(new Font("Arial", Font.BOLD, 15)); 
				tnim.setSize(190, 20); 
				tnim.setLocation(200, 100); 
				c.add(tnim); 
		
		name = new JLabel("Nama"); 
		name.setFont(new Font("Arial", Font.BOLD, 20)); 
		name.setSize(100, 20); 
		name.setLocation(100, 150); 
		c.add(name); 

		tname = new JTextField(); 
		tname.setFont(new Font("Arial", Font.BOLD, 15)); 
		tname.setSize(190, 20); 
		tname.setLocation(200, 150); 
		c.add(tname); 

				mk = new JLabel("Mata Kuliah"); 
				mk.setFont(new Font("Arial", Font.BOLD, 20)); 
				mk.setSize(300, 20); 
				mk.setLocation(100, 200); 
				c.add(mk); 

				tmk = new JTextField(); 
				tmk.setFont(new Font("Arial", Font.BOLD, 15)); 
				tmk.setSize(150, 20); 
				tmk.setLocation(240, 200); 
				c.add(tmk); 

		absen = new JLabel("Absen"); 
		absen.setFont(new Font("Arial", Font.BOLD, 20)); 
		absen.setSize(100, 20); 
		absen.setLocation(100, 250); 
		c.add(absen); 

		hadir = new JRadioButton("Hadir"); 
		hadir.setFont(new Font("Arial", Font.BOLD, 15)); 
		hadir.setSelected(true); 
		hadir.setSize(75, 20); 
		hadir.setLocation(200, 250); 
		c.add(hadir); 

				thadir = new JRadioButton("Tidak Hadir"); 
				thadir.setFont(new Font("Arial", Font.BOLD, 15)); 
				thadir.setSelected(false); 
				thadir.setSize(150, 20); 
				thadir.setLocation(275, 250); 
				c.add(thadir); 

				gengp = new ButtonGroup(); 
				gengp.add(hadir); 
				gengp.add(thadir); 

		tk = new JLabel("Tanggal Kelas"); 
		tk.setFont(new Font("Arial", Font.BOLD, 20)); 
		tk.setSize(300, 30); 
		tk.setLocation(100, 300); 
		c.add(tk); 

		date = new JComboBox(dates); 
		date.setFont(new Font("Arial", Font.BOLD, 15)); 
		date.setSize(50, 20); 
		date.setLocation(200, 350); 
		c.add(date); 

		month = new JComboBox(months); 
		month.setFont(new Font("Arial", Font.BOLD, 15)); 
		month.setSize(60, 20); 
		month.setLocation(250, 350); 
		c.add(month); 

		year = new JComboBox(years); 
		year.setFont(new Font("Arial", Font.BOLD, 15)); 
		year.setSize(60, 20); 
		year.setLocation(320, 350); 
		c.add(year); 

		term = new JCheckBox("Saya Absen nya Jujur"); 
		term.setFont(new Font("Arial", Font.BOLD, 15)); 
		term.setSize(250, 20); 
		term.setLocation(150, 400); 
		c.add(term); 

		sub = new JButton("Absenkan"); 
		sub.setFont(new Font("Arial", Font.BOLD, 15)); 
		sub.setSize(150, 20); 
		sub.setLocation(50, 450); 
		sub.addActionListener(this); 
		c.add(sub); 

		reset = new JButton("Isi Ulang"); 
		reset.setFont(new Font("Arial", Font.BOLD, 15)); 
		reset.setSize(150, 20); 
		reset.setLocation(270, 450); 
		reset.addActionListener(this); 
		c.add(reset); 

		tout = new JTextArea(); 
		tout.setFont(new Font("Arial", Font.BOLD, 15)); 
		tout.setSize(300, 400); 
		tout.setLocation(500, 100); 
		tout.setLineWrap(true); 
		tout.setEditable(false); 
		c.add(tout); 

		res = new JLabel(""); 
		res.setFont(new Font("Arial", Font.BOLD, 20)); 
		res.setSize(500, 25); 
		res.setLocation(100, 500); 
		c.add(res); 

		resadd = new JTextArea(); 
		resadd.setFont(new Font("Arial", Font.BOLD, 15)); 
		resadd.setSize(200, 75); 
		resadd.setLocation(580, 175); 
		resadd.setLineWrap(true); 
		c.add(resadd); 

		setVisible(true); 
	} 

	public void actionPerformed(ActionEvent e) 
	{ 
		if (e.getSource() == sub) { 
			if (term.isSelected()) { 
				String data1; 
				String data
					= "NIM  : "
					+ tnim.getText() + "\n"
					+ "Nama : "
					+ tname.getText() + "\n"
					+ "Mobile : "
					+ tmk.getText() + "\n"; 
				if (hadir.isSelected()) 
					data1 = "Absen : Hadir"
							+ "\n"; 
				else
					data1 = "Absen : Tidak hadir"
							+ "\n"; 
				String data2 
					= "Tanggal Kelas : "
					+ (String)date.getSelectedItem() 
					+ "/" + (String)month.getSelectedItem() 
					+ "/" + (String)year.getSelectedItem() 
					+ "\n"; 
					
				tout.setText(data + data1 + data2); 
				tout.setEditable(false); 
				res.setText("Absen Berhasil.."); 
			} 
			else { 
				tout.setText("");
				res.setText("Please accept the"
							+ " terms & conditions.."); 
			} 
		} 

		else if (e.getSource() == reset) { 
			String def = "";
			tnim.setText(def);
			tname.setText(def);
			tmk.setText(def); 
			res.setText(def); 
			tout.setText(def); 
			term.setSelected(false); 
			date.setSelectedIndex(0); 
			month.setSelectedIndex(0); 
			year.setSelectedIndex(0);
		} 
	} 
}
