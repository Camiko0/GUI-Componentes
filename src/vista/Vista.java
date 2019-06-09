//Paquete
package vista;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
//Librerias
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

import com.sun.java.swing.plaf.motif.MotifBorders.BevelBorder;

//Declaración de la clase
public class Vista extends JFrame implements ActionListener{
	
	//Declaración de componentes
	private JPanel panelFormulario, panelMensaje, panelInformacion;
	private JLabel labelTitulo,labelNombreUsuario, labelTipoUsuario,labelClaveUsuario,
	labelTipoConexion;
	private JTextField textoNombreUsuario;
	private JButton botonIngresar, botonRegistrar;
	private JRadioButton rBotonOpcion1, rBotonOpcion2;
	private ButtonGroup grupo;
	private JCheckBox checkOpcion1;
	private JPasswordField textoClave;
	private JComboBox comboTipoUsuario;
	private JTextArea textoSugerencias, textoActividades, textoAliados;
	private JSeparator separador;
	private Color colorAzul, colorAzulOscuro, colorRojo, colorRojoOscuro, colorMorado, colorCafeOscuro;
	private Cursor cursor;
	private Font fuenteNegrilla, fuenteNormal, fuenteCursiva;
	private Border borde1, borde2, borde3;
	
	//Constructor
	public Vista() {
		//Color
		colorAzul = new Color (50,112,191,50);
		colorAzulOscuro = new Color (77,109,203);
		colorRojoOscuro = new Color(201,72,57);
		colorRojo = new Color(223,117,94,200);
		colorMorado = new Color(226,218,230,150);
		colorCafeOscuro = new Color(82,25,2);
		
		//Cursor
		cursor= new Cursor(Cursor.HAND_CURSOR);
		
		//Fuente
		fuenteNegrilla = new Font("Times New Roman", Font.BOLD, 21); // BOLD → Negrilla
		fuenteNormal = new Font("Calibri (Cuerpo)", Font.PLAIN, 15); // PLAIN → texto normal
		fuenteCursiva = new Font("Arial", Font. ITALIC, 15); // ITALIC → cursive
		
		//Borde
		borde1= BorderFactory.createMatteBorder(0, 0, 3, 0, colorCafeOscuro);
		borde2= BorderFactory.createDashedBorder(colorRojoOscuro, 2, 2, 1, true);
		borde3= BorderFactory.createLineBorder(colorCafeOscuro, 2, true);
		
		//Panel
		//Lado izquierdo
		panelFormulario= new JPanel();
		panelFormulario.setBounds(10, 10, 400, 500);
		panelFormulario.setBackground(Color.white);
		panelFormulario.setLayout(null);
		add(panelFormulario);
		//Lado Derecho
		panelMensaje= new JPanel();
		panelMensaje.setBounds(420, 10, 250, 200);
		panelMensaje.setBackground(Color.white);
		panelMensaje.setLayout(null);
		add(panelMensaje);
		panelInformacion= new JPanel();
		panelInformacion.setBounds(420, 220, 250, 290);
		panelInformacion.setBackground(Color.white);
		panelInformacion.setLayout(null);
		add(panelInformacion);
		
		//Label
		labelTitulo = new JLabel("Login de usuario");
		labelTitulo.setSize(200, 40);
		labelTitulo.setLocation(panelFormulario.getWidth()/2 - labelTitulo.getWidth()/2 , 10);
		labelTitulo.setFont(fuenteNegrilla);
		labelTitulo.setForeground(colorRojoOscuro);
		labelTitulo.setBorder(borde1);
		panelFormulario.add(labelTitulo);
		labelNombreUsuario = new JLabel("Escriba el nombre de usuario:");
		labelNombreUsuario.setBounds(40, 60, 230, 40);
		labelNombreUsuario.setLocation(panelFormulario.getWidth()/2 - labelNombreUsuario.getWidth()/2, labelNombreUsuario.getY());
		labelNombreUsuario.setForeground(colorAzulOscuro); 
		labelNombreUsuario.setFont(fuenteNormal);
		panelFormulario.add(labelNombreUsuario);
		labelTipoUsuario = new JLabel("Escoja el tipo de usuario");
		labelTipoUsuario.setBounds(40, 160, 220, 40);
		labelTipoUsuario.setLocation(panelFormulario.getWidth()/2 - labelTipoUsuario.getWidth()/2, labelTipoUsuario.getY());
		labelTipoUsuario.setForeground(colorAzulOscuro); 
		labelTipoUsuario.setFont(fuenteNormal);
		panelFormulario.add(labelTipoUsuario);
		labelClaveUsuario = new JLabel("Escriba la clave del usuario:");
		labelClaveUsuario.setBounds(40, 260, 220, 40);
		labelClaveUsuario.setLocation(panelFormulario.getWidth()/2 - labelClaveUsuario.getWidth()/2,  labelClaveUsuario.getY());
		labelClaveUsuario.setForeground(colorAzulOscuro); 
		labelClaveUsuario.setFont(fuenteNormal);
		panelFormulario.add(labelClaveUsuario);
		labelTipoConexion = new JLabel("Escoja el tipo de conexion");
		labelTipoConexion.setBounds(40, 360, 220, 40);
		labelTipoConexion.setLocation(panelFormulario.getWidth()/2 - labelTipoConexion.getWidth()/2, labelTipoConexion.getY());
		labelTipoConexion.setForeground(colorAzulOscuro); 
		labelTipoConexion.setFont(fuenteNormal);
		panelFormulario.add(labelTipoConexion);
		
		//TextField
		textoNombreUsuario= new JTextField("Ingrese Texto");
		textoNombreUsuario .setBounds(30, 100, 220, 30);
		textoNombreUsuario.setLocation(panelFormulario.getWidth()/2 - textoNombreUsuario.getWidth()/2, textoNombreUsuario.getY());
		textoNombreUsuario.setForeground(colorCafeOscuro); 
		textoNombreUsuario.setFont(fuenteNormal);
		textoNombreUsuario.setBorder(borde1);
		panelFormulario.add(textoNombreUsuario);
		
		//Button
		botonIngresar= new JButton("Ingresar");
		botonIngresar.setBounds(120, 460, 120, 30);
		botonIngresar.setCursor(cursor);
		botonIngresar.setForeground(colorRojoOscuro); 
		botonIngresar.setFont(fuenteNormal);
		botonIngresar.setBorder(borde3);
		panelFormulario.add(botonIngresar);
		botonRegistrar= new JButton("Registrar");
		botonRegistrar.setBounds(130, 160, 110, 30);
		botonRegistrar.setCursor(cursor);
		botonRegistrar.setForeground(colorRojoOscuro); 
		botonRegistrar.setFont(fuenteNormal);
		botonRegistrar.setBorder(borde3);
		panelMensaje.add(botonRegistrar);
		
		//RadioButton
		rBotonOpcion1= new JRadioButton("Local");
		rBotonOpcion1.setBounds(50, 400, 120, 30);
		rBotonOpcion1.setCursor(cursor);
		rBotonOpcion1.setForeground(colorCafeOscuro); 
		rBotonOpcion1.setFont(fuenteCursiva);
		rBotonOpcion1.setBorder(borde3);
		panelFormulario.add(rBotonOpcion1);
		rBotonOpcion2= new JRadioButton("En la nube");
		rBotonOpcion2.setBounds(200, 400, 120, 30);
		rBotonOpcion2.setCursor(cursor);
		rBotonOpcion2.setForeground(colorCafeOscuro); 
		rBotonOpcion2.setFont(fuenteCursiva);
		rBotonOpcion2.setBorder(borde3);
		panelFormulario.add(rBotonOpcion2);
		
		//ButtonGroup
		grupo = new ButtonGroup();
		grupo.add(rBotonOpcion1);
		grupo.add(rBotonOpcion2);
		
		//CheckBox
		checkOpcion1 = new JCheckBox("Guardar");
		checkOpcion1.setBounds(20, 160, 90, 30);
		checkOpcion1.setCursor(cursor);
		checkOpcion1.setForeground(colorCafeOscuro); 
		checkOpcion1.setFont(fuenteCursiva);
		checkOpcion1.setBorder(borde3);
		panelMensaje.add(checkOpcion1);
		
		//PasswordField
		textoClave= new JPasswordField("---------");
		textoClave.setBounds(30, 300, 220, 30);
		textoClave.setLocation(panelFormulario.getWidth()/2 - textoClave.getWidth()/2, textoClave.getY());
		textoClave.setBorder(borde1);
		panelFormulario.add(textoClave);
		
		//ComboBox
		comboTipoUsuario= new JComboBox();
		comboTipoUsuario.addItem("Coordinador");
		comboTipoUsuario.addItem("Administrador");
		comboTipoUsuario .setBounds(30, 200, 220, 30);
		comboTipoUsuario.setLocation(panelFormulario.getWidth()/2 - comboTipoUsuario.getWidth()/2, comboTipoUsuario.getY());
		comboTipoUsuario.setForeground(colorCafeOscuro); 
		comboTipoUsuario.setFont(fuenteCursiva);
		panelFormulario.add(comboTipoUsuario);
		
		//TextArea
		textoSugerencias= new JTextArea("Escribe algo...");
		textoSugerencias.setBounds(10, 10, 230, 140);
		textoSugerencias.setForeground(colorCafeOscuro); 
		textoSugerencias.setFont(fuenteCursiva);
		textoSugerencias.setBackground(colorMorado);
		textoSugerencias.setBorder(borde2);
		panelMensaje.add(textoSugerencias);
		textoActividades= new JTextArea("Nuestras Actividades...");
		textoActividades.setBounds(430, 220, 230, 140);
		textoActividades.setEditable(false);
		textoActividades.setForeground(colorCafeOscuro); 
		textoActividades.setFont(fuenteCursiva);
		textoActividades.setBackground(colorAzul);
		panelInformacion.add(textoActividades);
		textoAliados= new JTextArea("Nuestros Aliados...");
		textoAliados.setBounds(430, 370, 230, 140);
		textoAliados.setEditable(false);
		textoAliados.setForeground(colorCafeOscuro); 
		textoAliados.setFont(fuenteCursiva);
		textoAliados.setBackground(colorRojo);
		panelInformacion.add(textoAliados);
		
		//Separator
		separador = new JSeparator(SwingConstants.VERTICAL);
		separador.setBounds(410, 10, 10, 500);
		panelInformacion.add(separador);
		
		getContentPane().setBackground(colorMorado);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(685,560);
		setLocationRelativeTo(this); //Configuración Ventana (de ultimas en el constructor)
		setLayout(null);
		setVisible(true);
	}

	//Metodo de eventos	
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
	}
}
