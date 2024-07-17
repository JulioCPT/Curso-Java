import java.awt.*;
import javax.swing.*;

public class MenuFrame extends JFrame {
    private final JLabel displayJLabel; // displays sample text

    // no-argument constructor set up GUI
    public MenuFrame() {
        super("Using JMenus");

        JMenu arquivoMenu = new JMenu("Arquivo");
        arquivoMenu.setMnemonic('A');

        JMenu editarMenu = new JMenu("Editar");
        editarMenu.setMnemonic('E');

        JMenuBar bar = new JMenuBar();
        setJMenuBar(bar);
        bar.add(arquivoMenu);
        bar.add(editarMenu);

        // set up label to display text
        displayJLabel = new JLabel("Senac", SwingConstants.CENTER);
        displayJLabel.setFont(new Font("Serif", Font.PLAIN, 72));

        getContentPane().setBackground(Color.CYAN);
        add(displayJLabel, BorderLayout.CENTER);
    }
}