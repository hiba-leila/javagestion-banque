package presentation.vue;


import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class VueLogin extends JFrame {
    // Declaration
    private Container mainContainer;
    private JPanel titlePanel,formePanel,buttonPanel;

    private JLabel lbl_title, lbl_login, lbl_pass;

    private  JButton btn_login, btn_cancel;

    private JTextField txt_login;

    private JPasswordField txt_pass;

    // Initialisation
    private void initTextFields(){
        txt_login = new JTextField("");
        txt_login.setFont(new Font("Optima", Font.BOLD, 17));
        txt_login.setForeground(Color.BLUE);
        txt_login.setHorizontalAlignment(JLabel.CENTER);

        txt_pass = new JPasswordField("");
        txt_pass.setFont(new Font("Optima", Font.BOLD, 17));
        txt_pass.setForeground(Color.BLUE);
        txt_pass.setHorizontalAlignment(JLabel.CENTER);
    }
    private void initButton()
    {
        btn_login = new JButton("Coonexion");
        btn_login.setFont(new Font("Optima", Font.BOLD, 17));
        btn_login.setForeground(new Color(45,71,132,255));

        btn_cancel = new JButton("Annuler");
        btn_cancel.setFont(new Font("Optima", Font.BOLD, 18));
        btn_cancel.setForeground(new Color(45,71,132,255));

    }
    private void initLabels()
    {
        lbl_title = new JLabel("C O N N E X I O N");
        lbl_title.setFont(new Font("Optima", Font.BOLD, 30));
        lbl_title.setForeground(Color.white);
        lbl_title.setHorizontalAlignment(JLabel.CENTER);

        lbl_login = new JLabel("Nom-U");
        lbl_login.setFont(new Font("Optima", Font.BOLD, 17));
        lbl_login.setForeground(Color.BLUE);
        lbl_login.setHorizontalAlignment(JLabel.CENTER);

        lbl_pass = new JLabel("P@ss");
        lbl_pass.setFont(new Font("Optima", Font.BOLD, 17));
        lbl_pass.setForeground(Color.BLUE);
        lbl_pass.setHorizontalAlignment(JLabel.CENTER);
    }
    private void initPanels()
    {
        initTextFields();
        initLabels();
        initButton();
        // ----------------- TITLE ------------------
        titlePanel = new JPanel();
        titlePanel.setBackground(new Color(45,71,132,255));
        titlePanel.setBorder(new EmptyBorder(15,0,15,0));
        titlePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        titlePanel.add(lbl_title);
        // ----------------- FORME ------------------
        formePanel = new JPanel();
        formePanel.setBackground(Color.WHITE);
        formePanel.setBorder(new EmptyBorder(15,0,15,0));
        formePanel.setLayout(new BorderLayout());
        // formePanel.setLayout(new BoxLayout(formePanel, BoxLayout.Y_AXIS));
        // formePanel.setLayout(new GridLayout(2,1));
        JPanel  westPanel = new JPanel();
        westPanel.setLayout(new GridLayout(2,1,5,5));
        westPanel.setBorder(new EmptyBorder(180,20,180,20));
        westPanel.setBackground(Color.WHITE);
        westPanel.add(lbl_login);
        westPanel.add(lbl_pass);
        JPanel  centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(2,1,5,5));
        centerPanel.setBorder(new EmptyBorder(180,20,180,20));
        centerPanel.setBackground(Color.WHITE);
        centerPanel.add(txt_login);
        centerPanel.add(txt_pass);
        formePanel.add(westPanel,BorderLayout.WEST);
        formePanel.add(centerPanel,BorderLayout.CENTER);


        // ----------------- BUTTON ------------------
        buttonPanel = new JPanel();
        buttonPanel.setBackground(new Color(45,71,132,255));
        buttonPanel.setBorder(new EmptyBorder(15,0,15,0));
        buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT ));
        buttonPanel.add(btn_login);
        buttonPanel.add(btn_cancel);
    }
    private void initContainer()
    {
        initPanels();
        mainContainer = getContentPane();
        mainContainer.setLayout(new BorderLayout());



        mainContainer.add(titlePanel, BorderLayout.NORTH);
        mainContainer.add(formePanel, BorderLayout.CENTER);
        mainContainer.add(buttonPanel, BorderLayout.SOUTH);

    }




    public VueLogin(String titre){
        initContainer();
        // 1 - Titre
        setTitle(titre);
        // 2 - Dimensionner fenêtre
        setSize(700,800);
        // 3 - Positionner au milieu
        setLocationRelativeTo(null);
        // 4 - fixer la taille de la fenêtre
        setResizable(false);
        // 5 - fermer l'application en fermant cette fenêtre
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 6 - rendre fenêtre visible
        setVisible(true);

    }

    public static void main(String[] args){

        new VueLogin("Test");
    }
}
