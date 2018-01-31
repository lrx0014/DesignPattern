import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
 
public class Main extends JFrame
{
    private static final long serialVersionUID = 1L;
 
    public Main ()
    {
        setTitle ("Calculator");
        setSize (500, 120);
        setLayout (new BorderLayout ());
        setLocationRelativeTo (null);
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    }
 
    private void addComponents ()
    {
        final JTextField textField = new JTextField ();
        textField.setFont(new Font("ÀŒÃÂ", Font.BOLD, 42));
        JButton button = new JButton ("º∆À„");
        button.addActionListener (new ActionListener ()
        {
            @Override
            public void actionPerformed ( ActionEvent e )
            {
            	String statement = textField.getText();
            	Calculator cal = new Calculator();
            	cal.build(statement);
            	int result = cal.compute();
            	String str = Integer.toString(result);
                MyDialog.show (str);
            }
        });
        add (textField, BorderLayout.CENTER);
        add (button, BorderLayout.EAST);
    }
 
    public static void main ( String[] args )
    {
        Main ui = new Main ();
        ui.addComponents ();
        ui.setVisible (true);
    }
}
 
class MyDialog
{
    public static void show ( String text )
    {
        JDialog dialog = new JDialog ();
        JPanel jp = new JPanel();
        JLabel label = new JLabel (text);
        jp.add(label,BorderLayout.CENTER);
        label.setFont(new Font("ÀŒÃÂ", Font.BOLD, 82));
        dialog.add (jp);
        dialog.setSize (200, 150);
        dialog.setLocationRelativeTo (null);
        dialog.setDefaultCloseOperation (JDialog.DISPOSE_ON_CLOSE);
        dialog.setModal (true);
        dialog.setVisible (true);
    }
}