package inforcol.mapfre.pantallas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Window;

import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelInsert extends JPanel {
   private JTextField textField;
   
   private JButton btnCancelar = new JButton("Cancelar");
   private JButton btnGenerar  = new JButton("Generar") ;
   /**
    * Create the panel.
    */
   public PanelInsert() {
      setLayout(null);
      
      JLabel lblNewLabel = new JLabel("INSERT");
      lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 15));
      lblNewLabel.setBounds(160, 28, 86, 14);
      add(lblNewLabel);
      
      JLabel lblTable = new JLabel("Table :");
      lblTable.setBounds(37, 76, 46, 14);
      add(lblTable);
      
      textField = new JTextField();
      textField.setBounds(114, 73, 197, 20);
      add(textField);
      textField.setColumns(10);
      
      btnGenerar.setBounds(40, 134, 89, 23);
      add(btnGenerar);
      
      
      btnCancelar.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            Window w = SwingUtilities.getWindowAncestor(PanelInsert.this);
            w.setVisible(false);
         }
      });
      btnCancelar.setBounds(188, 134, 89, 23);
      add(btnCancelar);

   }
}
