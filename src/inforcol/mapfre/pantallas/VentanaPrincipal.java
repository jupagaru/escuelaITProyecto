package inforcol.mapfre.pantallas;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPrincipal extends JFrame {

   private JPanel contentPane;
   
   private JMenuBar menuBar = new JMenuBar();
   
   private JMenu mnFile = new JMenu("File");
   private JMenu mnNew  = new JMenu("New") ;
   
   private JMenuItem mntmInsert = new JMenuItem("Insert");
   private JMenuItem mntmUpdate = new JMenuItem("Update");
   private JMenuItem mntmDelete = new JMenuItem("Delete");
   PanelInsert pnlInsert = new PanelInsert();
   JMenuItem mntmCreate = new JMenuItem("Create");

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               VentanaPrincipal frame = new VentanaPrincipal();
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
   public VentanaPrincipal() {
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100, 100, 450, 300);
      
      setJMenuBar(menuBar);
      
      menuBar.add(mnFile);
      
      mnFile.add(mnNew);
      
      JMenu mnTemplates = new JMenu("Templates");
      mnNew.add(mnTemplates);
      
      
      mntmInsert.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            
            pnlInsert.setVisible(true);
         }
      });
      mnTemplates.add(mntmInsert);
      
      mnTemplates.add(mntmUpdate);
      
      mnTemplates.add(mntmDelete);
      
      mnTemplates.add(mntmCreate);
      
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      contentPane.setLayout(new BorderLayout(0, 0));
      contentPane.add(pnlInsert);
      pnlInsert.setVisible(false);
      setContentPane(contentPane);
   }

}
