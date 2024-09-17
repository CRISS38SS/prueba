package itz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Font;

import javax.swing.SwingConstants;

public class Calculadora extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 380, 420);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(61, 56, 70));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtResultado = new JTextField();
		txtResultado.setHorizontalAlignment(SwingConstants.RIGHT);
		txtResultado.setBounds(12, 12, 356, 51);
		txtResultado.setEditable(false);
		contentPane.add(txtResultado);
		txtResultado.setColumns(10);
		
		JButton btnCE = new JButton("CE");
		btnCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                String txtActual=txtResultado.getText();
                if (!txtActual.isEmpty()) {
                    txtResultado.setText(txtActual.substring(0,txtActual.length()-1));
                }
			}
		});
		estiloBtn(btnCE);
		btnCE.setBounds(22, 75, 73, 35);
		contentPane.add(btnCE);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                txtResultado.setText("");
			}
		});
		estiloBtn(btnC);
		btnC.setBounds(107, 75, 73, 35);
		contentPane.add(btnC);
		
		JButton btnPotencia = new JButton("=");
		estiloBtn(btnPotencia);
		btnPotencia.setBounds(277, 257, 73, 95);
		contentPane.add(btnPotencia);
		
		JButton btnDivision = new JButton("/");
		estiloBtn(btnDivision);
		btnDivision.setBounds(192, 75, 73, 35);
		contentPane.add(btnDivision);
		
		JButton btnMultiplicacion = new JButton("*");
		estiloBtn(btnMultiplicacion);
		btnMultiplicacion.setBounds(277, 75, 73, 35);
		contentPane.add(btnMultiplicacion);
		
		JButton btnResta = new JButton("-");
		estiloBtn(btnResta);
		btnResta.setBounds(277, 200, 73, 35);
		contentPane.add(btnResta);
		
		JButton btnSuma = new JButton("+");
		estiloBtn(btnSuma);
		btnSuma.setBounds(277, 140, 73, 35);
		contentPane.add(btnSuma);
		
		JButton btnTres = new JButton("3");
		estiloBtn(btnTres);
		btnTres.setBounds(192, 257, 73, 35);
		contentPane.add(btnTres);
		
		JButton btnSeis = new JButton("6");
		estiloBtn(btnSeis);
		btnSeis.setBounds(192, 197, 73, 35);
		contentPane.add(btnSeis);
		
		JButton btnNueve = new JButton("9");
		estiloBtn(btnNueve);
		btnNueve.setBounds(192, 140, 73, 35);
		contentPane.add(btnNueve);
		
		JButton btnDos = new JButton("2");
		estiloBtn(btnDos);
		btnDos.setBounds(107, 257, 73, 35);
		contentPane.add(btnDos);
		
		JButton btnCinco = new JButton("5");
		estiloBtn(btnCinco);
		btnCinco.setBounds(107, 197, 73, 35);
		contentPane.add(btnCinco);
		
		JButton btnOcho = new JButton("8");
		estiloBtn(btnOcho);
		btnOcho.setBounds(107, 140, 73, 35);
		contentPane.add(btnOcho);
		
		JButton btnPunto = new JButton(".");
		estiloBtn(btnPunto);
		btnPunto.setBounds(107, 317, 73, 35);
		contentPane.add(btnPunto);
		
		JButton btnUno = new JButton("1");
		estiloBtn(btnUno);
		btnUno.setBounds(22, 257, 73, 35);
		contentPane.add(btnUno);
		
		JButton btnCuatro = new JButton("4");
		estiloBtn(btnCuatro);
		btnCuatro.setBounds(22, 197, 73, 35);
		contentPane.add(btnCuatro);
		
		JButton btnSiete = new JButton("7");
		estiloBtn(btnSiete);
		btnSiete.setBounds(22, 140, 73, 35);
		contentPane.add(btnSiete);
		
		JButton btnCero = new JButton("0");
		estiloBtn(btnCero);
		btnCero.setBounds(22, 317, 73, 35);
		contentPane.add(btnCero);

        //----------------botones action listener----------
		btnUno.addActionListener(btn);
        btnDos.addActionListener(btn);
        btnTres.addActionListener(btn);
        btnCuatro.addActionListener(btn);
        btnCinco.addActionListener(btn);
        btnSeis.addActionListener(btn);
        btnSiete.addActionListener(btn);
        btnOcho.addActionListener(btn);
        btnNueve.addActionListener(btn);
        btnPunto.addActionListener(btn);
        btnCero.addActionListener(btn);
		//-------------botones actionLIstener Operaciones----
        btnResta.addActionListener(btn);
        btnSuma.addActionListener(btn);
        btnMultiplicacion.addActionListener(btn);
        btnDivision.addActionListener(btn);
		//----------------igual--------------------------------
		btnPotencia.addActionListener(btnIgual);
	}

    public String numero(JButton button){
        String num=button.getText();
        return num;
    }

    ActionListener btn=new ActionListener() {
        public void actionPerformed(ActionEvent e){
            JButton button=(JButton) e.getSource();
            txtResultado.setText(txtResultado.getText()+numero(button));
        }
    };

	ActionListener btnIgual = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String txActual = txtResultado.getText(); // Obtener el texto actual del campo
			String[] numeros = txActual.split("[\\+\\-\\*/]"); // Dividir por operadores
			ArrayList<Character> operadores = new ArrayList<>(); // Lista para almacenar los operadores
	
			// Extraer los operadores de la cadena
			for (char c : txActual.toCharArray()) {
				if (c == '+' || c == '-' || c == '*' || c == '/') {
					operadores.add(c);
				}
			}
	
			// Convertir los números de String a Double (para manejar decimales)
			ArrayList<Double> numerosLista = new ArrayList<>();
			for (String numero : numeros) {
				numerosLista.add(Double.parseDouble(numero));
			}
	
			// Fase 1: Evaluar multiplicación y división
			for (int i = 0; i < operadores.size(); i++) {
				char operadorActual = operadores.get(i);
				if (operadorActual == '*' || operadorActual == '/') {
					double resultadoTemp;
					double num1 = numerosLista.get(i);
					double num2 = numerosLista.get(i + 1);
	
					if (operadorActual == '*') {
						resultadoTemp = num1 * num2;
					} else { // operadorActual == '/'
						if (num2 != 0) {
							resultadoTemp = num1 / num2;
						} else {
							txtResultado.setText("Error: División por cero");
							return; // Detener la ejecución si hay división por cero
						}
					}
	
					// Remplazar los dos números evaluados por su resultado
					numerosLista.set(i, resultadoTemp);
					numerosLista.remove(i + 1); // Eliminar el segundo número ya evaluado
					operadores.remove(i); // Eliminar el operador ya evaluado
					i--; // Ajustar índice para no saltar elementos
				}
			}
	
			// Fase 2: Evaluar suma y resta
			double resultado = numerosLista.get(0);
			for (int i = 0; i < operadores.size(); i++) {
				char operadorActual = operadores.get(i);
				double numeroActual = numerosLista.get(i + 1);
	
				if (operadorActual == '+') {
					resultado += numeroActual;
				} else if (operadorActual == '-') {
					resultado -= numeroActual;
				}
			}
	
			// Mostrar el resultado en el campo de texto
			txtResultado.setText(String.valueOf(resultado));
		}
	};

	public void estiloBtn(JButton button){
		button.setBackground(new Color(94, 92, 100));
		button.setForeground(new Color(255, 255, 255));
		button.setFont(new Font("DejaVu Sans", Font.BOLD, 18));
		button.setBorder(null);
	}

}
