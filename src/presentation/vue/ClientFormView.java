package presentation.vue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class ClientFormView extends JFrame{
    // Declaration
    private Container mainContainer;
    private JPanel titlePanel,formePanel,buttonPanel;

    private JLabel lbl_title,lbl_nom,lbl_prenom,lbl_login, lbl_pass,lbl_confpass,lbl_cin,lbl_email,lbl_tele,lbl_idAg;

    private  JButton btn_ajouter,btn_effacer, btn_cancel;

    private JTextField txt_nom,txt_prenom,txt_login, txt_pass,txt_confpass,txt_cin,txt_email,txt_tele,txt_idAg;

    // Initialisation
    private void initTextFields(){
        txt_nom = new JTextField("");
        txt_nom.setFont(new Font("Optima", Font.BOLD, 17));
        txt_nom.setForeground(Color.BLUE);
        txt_nom.setHorizontalAlignment(JLabel.CENTER);

        txt_prenom = new JTextField("");
        txt_prenom.setFont(new Font("Optima", Font.BOLD, 17));
        txt_prenom.setForeground(Color.BLUE);
        txt_prenom.setHorizontalAlignment(JLabel.CENTER);

        txt_login = new JTextField("");
        txt_login.setFont(new Font("Optima", Font.BOLD, 17));
        txt_login.setForeground(Color.BLUE);
        txt_login.setHorizontalAlignment(JLabel.CENTER);

        txt_pass = new JPasswordField("");
        txt_pass.setFont(new Font("Optima", Font.BOLD, 17));
        txt_pass.setForeground(Color.BLUE);
        txt_pass.setHorizontalAlignment(JLabel.CENTER);

        txt_confpass = new JTextField("");
        txt_confpass.setFont(new Font("Optima", Font.BOLD, 17));
        txt_confpass.setForeground(Color.BLUE);
        txt_confpass.setHorizontalAlignment(JLabel.CENTER);

        txt_cin = new JTextField("");
        txt_cin.setFont(new Font("Optima", Font.BOLD, 17));
        txt_cin.setForeground(Color.BLUE);
        txt_cin.setHorizontalAlignment(JLabel.CENTER);

        txt_email = new JTextField("");
        txt_email.setFont(new Font("Optima", Font.BOLD, 17));
        txt_email.setForeground(Color.BLUE);
        txt_email.setHorizontalAlignment(JLabel.CENTER);

        txt_tele = new JTextField("");
        txt_tele.setFont(new Font("Optima", Font.BOLD, 17));
        txt_tele.setForeground(Color.BLUE);
        txt_tele.setHorizontalAlignment(JLabel.CENTER);

        txt_idAg = new JTextField("");
        txt_idAg.setFont(new Font("Optima", Font.BOLD, 17));
        txt_idAg.setForeground(Color.BLUE);
        txt_idAg.setHorizontalAlignment(JLabel.CENTER);
    }
    private void initButton()
    {
        btn_ajouter = new JButton("Ajouter");
        btn_ajouter.setFont(new Font("Optima", Font.BOLD, 17));
        btn_ajouter.setForeground(new Color(45,71,132,255));

        btn_effacer = new JButton("Effacer");
        btn_effacer.setFont(new Font("Optima", Font.BOLD, 17));
        btn_effacer.setForeground(new Color(45,71,132,255));


        btn_cancel = new JButton("Annuler");
        btn_cancel.setFont(new Font("Optima", Font.BOLD, 18));
        btn_cancel.setForeground(new Color(45,71,132,255));

    }
    private void initLabels()
    {
        lbl_title = new JLabel("Formulaire Client");
        lbl_title.setFont(new Font("Optima", Font.BOLD, 30));
        lbl_title.setForeground(Color.white);
        lbl_title.setHorizontalAlignment(JLabel.CENTER);

        lbl_nom = new JLabel("Nom Client :");
        lbl_nom.setFont(new Font("Optima", Font.BOLD, 17));
        lbl_nom.setForeground(Color.BLUE);
        lbl_nom.setHorizontalAlignment(JLabel.CENTER);

        lbl_prenom = new JLabel("Prenom Client :");
        lbl_prenom.setFont(new Font("Optima", Font.BOLD, 17));
        lbl_prenom.setForeground(Color.BLUE);
        lbl_prenom.setHorizontalAlignment(JLabel.CENTER);

        lbl_login = new JLabel("Login :");
        lbl_login.setFont(new Font("Optima", Font.BOLD, 17));
        lbl_login.setForeground(Color.BLUE);
        lbl_login.setHorizontalAlignment(JLabel.CENTER);

        lbl_pass = new JLabel("Mot de passe :");
        lbl_pass.setFont(new Font("Optima", Font.BOLD, 17));
        lbl_pass.setForeground(Color.BLUE);
        lbl_pass.setHorizontalAlignment(JLabel.CENTER);

        lbl_confpass = new JLabel("Confirmer Mot de passe :");
        lbl_confpass.setFont(new Font("Optima", Font.BOLD, 17));
        lbl_confpass.setForeground(Color.BLUE);
        lbl_confpass.setHorizontalAlignment(JLabel.CENTER);

        lbl_cin = new JLabel("CIN :");
        lbl_cin.setFont(new Font("Optima", Font.BOLD, 17));
        lbl_cin.setForeground(Color.BLUE);
        lbl_cin.setHorizontalAlignment(JLabel.CENTER);

        lbl_email = new JLabel("Email :");
        lbl_email.setFont(new Font("Optima", Font.BOLD, 17));
        lbl_email.setForeground(Color.BLUE);
        lbl_email.setHorizontalAlignment(JLabel.CENTER);

        lbl_tele = new JLabel("Tele :");
        lbl_tele.setFont(new Font("Optima", Font.BOLD, 17));
        lbl_tele.setForeground(Color.BLUE);
        lbl_tele.setHorizontalAlignment(JLabel.CENTER);

        lbl_idAg = new JLabel("Id_Agence :");
        lbl_idAg.setFont(new Font("Optima", Font.BOLD, 17));
        lbl_idAg.setForeground(Color.BLUE);
        lbl_idAg.setHorizontalAlignment(JLabel.CENTER);

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
        westPanel.setLayout(new GridLayout(9,1,5,5));
        westPanel.setBorder(new EmptyBorder(80,20,80,20));
        westPanel.setBackground(Color.WHITE);
        westPanel.add(lbl_nom);
        westPanel.add(lbl_prenom);
        westPanel.add(lbl_login);
        westPanel.add(lbl_pass);
        westPanel.add(lbl_confpass);
        westPanel.add(lbl_cin);
        westPanel.add(lbl_email);
        westPanel.add(lbl_tele);
        westPanel.add(lbl_idAg);
        JPanel  centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(9,1,5,5));
        centerPanel.setBorder(new EmptyBorder(80,20,80,20));
        centerPanel.setBackground(Color.WHITE);
        centerPanel.add(txt_nom);
        centerPanel.add(txt_prenom);
        centerPanel.add(txt_login);
        centerPanel.add(txt_pass);
        centerPanel.add(txt_confpass);
        centerPanel.add(txt_cin);
        centerPanel.add(txt_email);
        centerPanel.add(txt_tele);
        centerPanel.add(txt_idAg);
        formePanel.add(westPanel,BorderLayout.WEST);
        formePanel.add(centerPanel,BorderLayout.CENTER);


        // ----------------- BUTTON ------------------
        buttonPanel = new JPanel();
        buttonPanel.setBackground(new Color(45,71,132,255));
        buttonPanel.setBorder(new EmptyBorder(15,0,15,0));
        buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT ));
        buttonPanel.add(btn_ajouter);
        buttonPanel.add(btn_effacer);
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




    public ClientFormView(String titre){
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

        new ClientFormView("Test");
    }
}
