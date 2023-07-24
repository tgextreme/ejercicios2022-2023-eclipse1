package examen.parc202112;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/** Ventana principal de minitienda
 */
@SuppressWarnings("serial")
public class Main extends JFrame{

	private static Main ventana;  // Ventana única principal
	public static void main(String[] args) {
		ventana = new Main();
		ventana.setVisible( true );
	}
	private static SimpleDateFormat sdf = new SimpleDateFormat( "dd/MM/yyyy HH:mm:ss" ); // Formateador de fechas con horas
	private static SimpleDateFormat sdf2 = new SimpleDateFormat( "dd/MM/yyyy" ); // Formateador de fechas solo con dia-mes-año
	
	private JLabel lInfo; // Información
	private DefaultTableModel mDatos;  // Modelo de datos de tabla central
	private JTable tDatos;      // Tabla central de la ventana
	private ArrayList<Producto> listaProds;
	
	/** Constructor de la ventana
	 */
	public Main() {
		setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
		setSize( 640, 400 );
		setTitle( "Minitienda Programación III" );
		lInfo = new JLabel( " " );
		tDatos = new JTable();
		tDatos.setFont( new Font( "Arial", Font.PLAIN, 14 ) );
		JPanel pBotonera = new JPanel();
		getContentPane().add( lInfo, BorderLayout.NORTH );
		getContentPane().add( new JScrollPane(tDatos), BorderLayout.CENTER );
		getContentPane().add( pBotonera, BorderLayout.SOUTH );
		addWindowListener( new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				if (new File("minitienda.db").exists()) {
					// Poner el parámetro a true si se quiere reiniciar la base de datos
					BaseDatos.abrirConexion( "minitienda.db", false );  // Abrir base de datos existente
				} else {
					BaseDatos.abrirConexion( "minitienda.db", true );  // Crear base de datos con datos iniciales
				}
				verProductos();  // Según se inicia la ventana se visualizan los productos
			}
			@Override
			public void windowClosed(WindowEvent e) {
				BaseDatos.cerrarConexion();
			}
		});
		
		JButton b = new JButton( "Prods" );
		b.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		pBotonera.add( b );
		b.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				verProductos();
			}
		});
		
		b = new JButton( "Compras" );
		b.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		pBotonera.add( b );
		b.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				verCompras();
			}
		});
		
		b = new JButton( "+ Compra" );
		b.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		pBotonera.add( b );
		b.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				accionCompra();
			}
		});
		
		b = new JButton( "- Compra" );
		b.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		pBotonera.add( b );
		b.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				anularCompra();
			}
		});
		
		// T2
		b = new JButton( "Fechas" );
		b.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		pBotonera.add( b );
		b.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Date hoy = new Date();
					Date ayer = new Date( System.currentTimeMillis()-24*3600000L );
					String resp = JOptionPane.showInputDialog( ventana, "Fecha inicial filtro:", sdf2.format(ayer) );
					String resp2 = JOptionPane.showInputDialog( ventana, "Fecha final filtro:", sdf2.format(hoy) );
					Date dIni = sdf2.parse( resp );
					Date dFin = sdf.parse( resp2 + " 23:59:00" );
					verComprasEntreFechas( dIni, dFin );
				} catch (Exception e2) {  // Error en entrada de datos
					JOptionPane.showMessageDialog( ventana, "Error en entrada de fechas" );
				}	
			}
		});
		
		// T3
		b = new JButton( "Posibles compras" );
		b.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		pBotonera.add( b );
		b.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					String resp = JOptionPane.showInputDialog( ventana, "Dinero disponible:", "1000" );
					if (resp==null) return; // No definida cantidad
					double dinero = Double.parseDouble( resp );
					calcularComprasPosibles( dinero );
				} catch (NumberFormatException e2) { } // Error en cantidad - no se calcula nada
			}
		});
	}
	
	// Carga todos los productos en memoria partiendo de la base de datos
	private void cargarProds() {
		listaProds = BaseDatos.getProductos();  // Carga los productos con compras vacías
		for (Producto p : listaProds) {
			p.getListaCompras().addAll( BaseDatos.getCompras(p) );  // Añade las compras de cada producto
		}
	}

	// T2
	private ArrayList<Compra> lComprasFechas;
	private void verComprasEntreFechas( Date fechaIni, Date fechaFin ) {
		System.out.println( sdf.format( fechaIni ) + " -> " + sdf.format( fechaFin ) );
		lComprasFechas = BaseDatos.getComprasEntreFechas( listaProds, fechaIni, fechaFin );
		Vector<String> cabeceras = new Vector<String>( Arrays.asList( "Prod", "Nombre prod", "Cliente", "Fecha", "Cant" ) );
		mDatos = new DefaultTableModel(  // Inicializa el modelo
			new Vector<Vector<Object>>(),  // Datos de la jtable (vector de vectores) - vacíos de momento
			cabeceras  // Cabeceras de la jtable
		);
		for (Compra compra : lComprasFechas) {
			String fecha = sdf.format( new Date( compra.getFecha() ) );
			mDatos.addRow( new Object[] { compra.getProducto().getId(), compra.getProducto().getNombre(), compra.getCliente(), fecha, compra.getCantidad() } );
		}
		tDatos.setModel( mDatos );
		// Pone tamaños a las columnas de la tabla
		tDatos.getColumnModel().getColumn(0).setMinWidth(40);
		tDatos.getColumnModel().getColumn(0).setMaxWidth(40);
		tDatos.getColumnModel().getColumn(1).setPreferredWidth(200);
		tDatos.getColumnModel().getColumn(2).setPreferredWidth(150);
		tDatos.getColumnModel().getColumn(3).setMinWidth(160);
		tDatos.getColumnModel().getColumn(3).setMaxWidth(160);		
		tDatos.getColumnModel().getColumn(4).setMinWidth(40);
		tDatos.getColumnModel().getColumn(4).setMaxWidth(40);
		// Permite alt+click para borrar compra
		for (MouseListener ml : tDatos.getMouseListeners()) tDatos.removeMouseListener(ml);  // Borra los que hubiera
		tDatos.addMouseListener( new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.isAltDown()) {
					int fila = tDatos.rowAtPoint( e.getPoint() );
					if (fila>=0) {
						anularCompra( lComprasFechas.get(fila) );
					}
				}
			}
		});
		// Renderer de las filas con el mismo producto en gris y alineación por columna
		tDatos.setDefaultRenderer( Object.class, new DefaultTableCellRenderer() {
			@Override
			public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
				JLabel ret = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
				ret.setForeground( Color.BLACK );
				if (column==0 || column==4) {
					ret.setHorizontalAlignment( JLabel.RIGHT );
				} else if (column==3) {
					ret.setHorizontalAlignment( JLabel.CENTER );
				} else {
					ret.setHorizontalAlignment( JLabel.LEFT );
				}
				if (row>=1 && column<=1) {
					// Comparamos los productos (se podrían comparar también los strings de la tabla directamente)
					Producto pAnterior = lComprasFechas.get(row-1).getProducto();
					Producto pActual = lComprasFechas.get(row).getProducto();
					if (pAnterior.getId() == pActual.getId()) {
						ret.setForeground( Color.LIGHT_GRAY );
					}
				}
				return ret;
			}
		});
	}
	
	// T3
	// Calcular las compras posibles con el dinero disponible sobrando 100 euros como mucho
	private void calcularComprasPosibles( double disponible ) {
		ArrayList<Producto> lProds = new ArrayList<>();
		calcularComprasPosibles( listaProds, disponible, lProds );
	}
	private void calcularComprasPosibles( ArrayList<Producto> prods, double dineroQueda, ArrayList<Producto> lProdsComprados ) {
		if (dineroQueda < 0 ) {  // Caso base: compra imposible  (no hay suficiente dinero)
			return;
		} else if (dineroQueda < 50) {  // Caso base: compra posible con menos de 100 euros sobrantes
			System.out.println( "Posible compra (sobran " + String.format("%.2f",dineroQueda) + " euros): " + lProdsComprados );
		} else {  // Caso general - probar por combinatoria todos los productos posibles para comprar
			for (Producto p : prods) {
				lProdsComprados.add( p );
				calcularComprasPosibles( prods, dineroQueda - p.getPrecio(), lProdsComprados );
				lProdsComprados.remove( lProdsComprados.size()-1 );
			}
		}
	}

	// Ver productos en la ventana
	private void verProductos() {
		Vector<String> cabeceras = new Vector<String>( Arrays.asList( "Cod", "Nombre", "Precio" ) );
		mDatos = new DefaultTableModel(  // Inicializa el modelo
			new Vector<Vector<Object>>(),  // Datos de la jtable (vector de vectores) - vacíos de momento
			cabeceras  // Cabeceras de la jtable
		);
		cargarProds();
		for (Producto p : listaProds) {
			mDatos.addRow( new Object[] { p.getId(), p.getNombre(), p.getPrecio() } );
		}
		tDatos.setModel( mDatos );
		// Pone tamaños a las columnas de la tabla
		tDatos.getColumnModel().getColumn(0).setMinWidth(40);
		tDatos.getColumnModel().getColumn(0).setMaxWidth(40);
		tDatos.getColumnModel().getColumn(2).setMinWidth(60);
		tDatos.getColumnModel().getColumn(2).setMaxWidth(60);		
	}
	
	// Ver todas las compras en la tabla principal de la ventana
	private void verCompras() {
		Vector<String> cabeceras = new Vector<String>( Arrays.asList( "Cod", "Prod", "Cliente", "Fecha", "Cant" ) );
		mDatos = new DefaultTableModel(  // Inicializa el modelo
			new Vector<Vector<Object>>(),  // Datos de la jtable (vector de vectores) - vacíos de momento
			cabeceras  // Cabeceras de la jtable
		);
		ArrayList<Compra> compras = BaseDatos.getCompras( listaProds );
		for (Compra compra : compras) {
			String fecha = sdf.format( new Date( compra.getFecha() ) );
			mDatos.addRow( new Object[] { compra.getId(), compra.getProducto().getId(), compra.getCliente(), fecha, compra.getCantidad() } );
		}
		tDatos.setModel( mDatos );
		// Pone tamaños a las columnas de la tabla
		tDatos.getColumnModel().getColumn(0).setMinWidth(40);
		tDatos.getColumnModel().getColumn(0).setMaxWidth(40);
		tDatos.getColumnModel().getColumn(1).setMinWidth(40);
		tDatos.getColumnModel().getColumn(1).setMaxWidth(40);
		tDatos.getColumnModel().getColumn(3).setMinWidth(160);
		tDatos.getColumnModel().getColumn(3).setMaxWidth(160);		
		tDatos.getColumnModel().getColumn(4).setMinWidth(40);
		tDatos.getColumnModel().getColumn(4).setMaxWidth(40);
	}
	
	// Lanza una acción de compra
	private void accionCompra() {
		if (listaProds==null || listaProds.isEmpty()) return;
		Producto producto = selProducto();
		if (producto==null) return;  // No elegido producto
		do {  // Ciclo de validación de cantidad (pide cantidad hasta que sea correcta o escape
			try {
				String resp = JOptionPane.showInputDialog( ventana, "Cantidad a comprar:", "1" );
				if (resp==null) return; // No definida cantidad
				int cantidad = Integer.parseInt( resp );
				resp = JOptionPane.showInputDialog( ventana, "Cliente que compra:", "" );
				if (resp.isEmpty()) return; // No definido cliente
				if (cantidad > 0) {  // Correcto: insertar
					Compra compra = new Compra( 0, System.currentTimeMillis(), resp, cantidad, producto );  // id 0 porque no lo sabemos
					BaseDatos.insertarCompra( compra );  // El método modifica el id al insertarlo
					lInfo.setText( "Añadida compra: " + compra );
					break; // Sale del ciclo
				} else {
					// Error en cantidad no positiva
					JOptionPane.showMessageDialog( ventana, "Error en cantidad, introduce un número mayor que cero" );
				}
			} catch (NumberFormatException e) {
				// Error en cantidad
				JOptionPane.showMessageDialog( ventana, "Error en cantidad, introduce un número mayor que cero" );
			}
		} while (true);
		verCompras();  // Ver la tabla de compras
	}
		private Producto selProducto() {
			String[] opciones = new String[ listaProds.size() ];
			int i = 0;
			for (Producto p : listaProds) {
				opciones[ i ] = p.getNombre();
				i++;
			}
			Object selProducto = JOptionPane.showInputDialog( ventana, "Selecciona artículo:", "Compra", JOptionPane.QUESTION_MESSAGE, null, opciones, null );
			if (selProducto==null) return null;  // No elegido producto
			Producto producto = null;
			for (Producto p : listaProds)
				if (p.getNombre().equals( selProducto )) { producto = p; break; }
			return producto;
		}
	
	// Lanza una anulación de compra
	private void anularCompra() {
		if (listaProds==null || listaProds.isEmpty()) return;
		Producto producto = selProducto();
		if (producto==null) return;  // No elegido producto
		ArrayList<Compra> listaCompras = BaseDatos.getCompras( producto );
		if (listaCompras!=null && listaCompras.size()>0) {
			producto.getListaCompras().clear();
			producto.getListaCompras().addAll( listaCompras );
			Compra compra = selCompra( producto );
			if (compra!=null) {
				anularCompra( compra );
			}
		} else {
			lInfo.setText( "No hay compras de este producto" );
		}
	}

	// Anula una compra ya conocida borrándola de la base de datos y mostrando las compras en ventana
	private void anularCompra( Compra compra ) {
		try {
			BaseDatos.borrarCompra( compra );
			lInfo.setText( "Borrada compra: " + compra );
			verCompras();  // Ver la tabla de compras refrescada
		} catch (SQLException e) {
			lInfo.setText( "Error en borrado de compra: " + compra );
		}
	}
	
		private Compra selCompra( Producto producto ) {
			String[] opciones = new String[ producto.getListaCompras().size() ];
			int i = 0;
			for (Compra c : producto.getListaCompras()) {
				opciones[ i ] = sdf.format( new Date( c.getFecha() ) ) + " (" + c.getCantidad() + " unidades)";
				i++;
			}
			Object selCompra = JOptionPane.showInputDialog( ventana, "Selecciona compra:", "Selección compra de " + producto.getNombre(), JOptionPane.QUESTION_MESSAGE, null, opciones, null );
			if (selCompra==null) return null;  // No elegida compra
			int seleccionado = 0;
			for (String texto : opciones) {
				if (texto.equals( selCompra )) { 
					break; 
				}
				seleccionado++; 
			}
			return producto.getListaCompras().get( seleccionado );
		}
	
}
