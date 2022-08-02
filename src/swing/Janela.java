package swing;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Janela extends JFrame{
	
	public Janela(){
		setTitle("Minha Aplicação");
		setSize(600 , 300);
		setLocation(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menu = new JMenuBar();
		JMenu menuArquivo = new JMenu("Arquivo");
		menuArquivo.setMnemonic('A');
		JMenu menuEditar = new JMenu("Editar");
		menuEditar.setMnemonic('E');
		menu.add(menuArquivo);
		menu.add(menuEditar);
		
		JMenuItem itemCopiar = new JMenuItem("Copiar");
		itemCopiar.setMnemonic('C');
		menuEditar.add(itemCopiar);
		
		JMenuItem itemNovo = new JMenuItem("Novo");
		itemNovo.setMnemonic('N');
		
		JMenuItem itemSair = new JMenuItem(new SairAction());
		itemSair.setText("Sair");
		itemSair.setMnemonic('S');
		
		
		
		menuArquivo.add(itemNovo);
		menuArquivo.add(itemSair);
		
		
		
		
		
		setJMenuBar(menu);
		setVisible(true);
	}
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		new Janela();
	}

}
