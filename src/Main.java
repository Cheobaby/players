import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.acl.Group;
import jdk.nashorn.internal.scripts.JO;

public class Main extends JFrame implements ActionListener{
    private JPanel panel;
    private JButton click;
    private JRadioButton[] radioButtons;
    private JScrollPane bar;
    private JTextArea area;
    public static void main(String[] args) {
        Main frame=new Main();
        frame.setSize(600,350);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
    public Main(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Players");
        Container windows=getContentPane();
        windows.setLayout(null);
        panel=new JPanel();
        windows.add(panel);
        String[] options={
            "Add player",
            "Search player",
            "Delete player",
            "Delete list"
        };
        radioButtons=new JRadioButton[options.length];
        ButtonGroup group=new ButtonGroup();
        for(int i=0;i< options.length;i++){
            radioButtons[i]=new JRadioButton(options[i]);
            radioButtons[i].addActionListener(this );
            radioButtons[i].setBounds(10,30+30*i,130,25);
            group.add(radioButtons[i]);
            windows.add(radioButtons[i]);
        }
        area=new JTextArea(20,20);
        area.setBounds(150,30,400,150);
        area.setEditable(false);
        windows.add(area);
        bar=new JScrollPane(area);
        bar.setBounds(150,30,400,150);
        windows.add(bar);

        click=new JButton("Show data");
        click.addActionListener(this);
        click.setBounds(250,270,100,25);
        windows.add(click);

    }
    @Override
    public void actionPerformed(ActionEvent event){
        if(event.getSource()==click){
            JOptionPane.showMessageDialog(null,"hola");
        }
        for(int i=0;i<radioButtons.length;i++){
            if(event.getSource()==radioButtons[i]){
                switch (i){
                    case 0:
                        JOptionPane.showMessageDialog(null,"OPCION 1");
                        break;
                    case 1:
                        JOptionPane.showMessageDialog(null,"OPCION 2");

                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null,"OPCION 3");

                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null,"OPCION 4");

                        break;
                }
            }
        }
    }
}