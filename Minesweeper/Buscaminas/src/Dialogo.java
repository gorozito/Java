import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.border.BevelBorder;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.Font;
import java.util.Vector;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Dialogo {

	private JFrame window = null;
	private BD base;
	private JTextField textField;
	private JLabel lblNewPlayer, lblOldPlayer, lblPoints, lblNewLabel;
	private JList list;
	private JButton btnNewButton, btnGet;
	private DefaultListModel model;
	private Player jugadorNuevo = null;
	
	public Dialogo(BD base){

		this.base = base;
		window = new JFrame();
		window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		window.setSize(517,  442);
		window.getContentPane().setLayout(null);
		
		lblNewPlayer = new JLabel("New Player");
		lblNewPlayer.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewPlayer.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewPlayer.setBounds(51, 35, 89, 24);
		window.getContentPane().add(lblNewPlayer);
		
		lblOldPlayer = new JLabel("Old Player");
		lblOldPlayer.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblOldPlayer.setHorizontalAlignment(SwingConstants.CENTER);
		lblOldPlayer.setBounds(200, 35, 109, 24);
		window.getContentPane().add(lblOldPlayer);
		
		model = new DefaultListModel();
		list = new JList(model);
		list.setBounds(200, 73, 109, 190);
		window.getContentPane().add(list);
		
		textField = new JTextField();
		textField.setBounds(51, 70, 89, 20);
		window.getContentPane().add(textField);
		textField.setColumns(10);
		
		btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(base.getCantidadPlayers());
				jugadorNuevo = new Player(Dialogo.this.base.getCantidadPlayers() + 1, textField.getText(), Integer.parseInt(lblNewLabel.getText()));
				base.addPlayer(jugadorNuevo);
			}
		});
		//btnNewButton.addActionListener(new ActionListenerSave(base, textField.getText(), lblNewLabel.getText()));
		
		btnNewButton.setBounds(51, 101, 89, 23);
		window.getContentPane().add(btnNewButton);
		
		btnGet = new JButton("Get");
		btnGet.setBounds(200, 274, 109, 23);
		window.getContentPane().add(btnGet);
		
		lblPoints = new JLabel("Points");
		lblPoints.setHorizontalAlignment(SwingConstants.CENTER);
		lblPoints.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPoints.setBounds(369, 35, 109, 24);
		window.getContentPane().add(lblPoints);
		
		lblNewLabel = new JLabel("0");
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Consolas", Font.ITALIC, 14));
		lblNewLabel.setBounds(369, 74, 109, 24);
		window.getContentPane().add(lblNewLabel);
		window.setVisible(true);
 }
	
	public void setPlayers(Vector<Player> players) {
		for (int i = 0; i<players.size(); i++)
			model.add(i, (((Player)players.elementAt(i)).getNombre()));		
	}
	
	
	
}
