package metier.admin;

import dao.daoFiles.ClientDao;
import presentation.modele.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;


public class ServiceAdmin implements IServiceAdmin{
    private static Banque banque;
    private static ClientDao clientDao = new ClientDao();
    public ServiceAdmin(Banque banque) {
        this.banque = banque;
    }
    public static Client getClient(Long id) {
        for (Client c : banque.getClientsDeBanque()) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }
    public static Compte getCompte(String numeroCompte) {
        for (Client c : banque.getClientsDeBanque()) {
            for (Compte compte : c.getComptesClient()) {
                if (compte.getNumeroCompte().equals(numeroCompte)) {
                    return compte;
                }
            }
        }
        return null;
    }

    @Override
    public Client nouveauClient() {
        // ajouter nouveau client
        Scanner clavier = new Scanner(System.in);
        System.out.println("Veuillez saisir le nom du client : ");
        String nom = clavier.nextLine();
        System.out.println("Veuillez saisir le prenom du client : ");
        String prenom = clavier.nextLine();
        System.out.println("Veuillez saisir le login du client : ");
        String login = clavier.nextLine();
        System.out.println("Veuillez saisir le mot de passe du client : ");
        String pass = clavier.nextLine();
        System.out.println("Veuillez saisir le cin du client : ");
        String cin = clavier.nextLine();
        System.out.println("Veuillez saisir le tel du client : ");
        String tel = clavier.nextLine();
        System.out.println("Veuillez saisir le email du client : ");
        String email = clavier.nextLine();
        // choisir le sexe
        System.out.println("Veuillez choisir le sexe du client : ");
        System.out.println("1- Homme");
        System.out.println("2- Femme");
        int choix = clavier.nextInt();
        Sexe sexe = null;
        switch (choix) {
            case 1:
                sexe = Sexe.HOMME;
                break;
            case 2:
                sexe = Sexe.FEMME;
                break;
            default:
                System.out.println("Choix invalide");
                break;
        }
        Client client = new Client(login, pass, nom, prenom, email, cin, tel, sexe);
        banque.getClientsDeBanque().add(client);
        clientDao.save(client);
        return client;
    }

    @Override
    public Client nouveauCompteClientExistant() {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Veuillez saisir l'id du client : ");
        Long id = clavier.nextLong();
        Client client = getClient(id);
        if (client != null) {
            Compte compte = new Compte();
            compte.setNumeroCompte();
            System.out.println("Veuillez saisir le solde du compte : ");
            compte.setSolde(clavier.nextDouble());
            compte.setDateCreation();
            compte.setPropriétaire(client);
            client.getComptesClient().add(compte);
            return client;
        } else {
            System.out.println("Client introuvable");
            return null;
        }
    }

    @Override
    public Client chercherClientParId(Long id) {
        // chercher client par ID
        for (Client c : banque.getClientsDeBanque()) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }

    @Override
    public List<Client> chercherClientParNom(String nom) {
        // chercher client par nom
        for (Client c : banque.getClientsDeBanque()) {
            if (c.getNom().equals(nom)) {
                return banque.getClientsDeBanque();
            }
        }
        return null;
    }

    @Override
    public List<Client> chercherClientParPrénom(String prenom) {
        // chercher client par prenom
        for (Client c : banque.getClientsDeBanque()) {
            if (c.getPrenom().equals(prenom)) {
                return banque.getClientsDeBanque();
            }
        }
        return null;
    }

    @Override
    public Client chercherClientParCin(String cin) {
        return null;
    }

    @Override
    public Client chercherClientParEmail(String email) {
        return null;
    }

    @Override
    public Compte chercherCompteParId(Long idCompte) {
        return null;
    }

    @Override
    public List<Compte> chercherCompteParSolde(double solde) {
        return null;
    }

    @Override
    public List<Compte> chercherCompteParDateCreation(LocalDateTime date) {
        return null;
    }

    @Override
    public List<Compte> chercherCompteParPropriétaire(Client propriétaire) {
        return null;
    }

    @Override
    public Client modifierClient(String filtre) {
        return null;
    }

    @Override
    public boolean supprimerClient(Long id) {
        return false;
    }

    @Override
    public TableauDeBord calculerEtAfficherStatistiques() {
        return null;
    }

    @Override
    public List<Client> trierClientParNom() {
        return null;
    }

    @Override
    public List<Client> trierClientParCin() {
        return null;
    }

    @Override
    public List<Client> trierClientParEmail() {
        return null;
    }

    @Override
    public List<Client> trierClientParAdresse() {
        return null;
    }

    @Override
    public List<Client> trierClientParSoldeCompte() {
        return null;
    }

    @Override
    public List<Compte> trierComptesParSolde() {
        return null;
    }

    @Override
    public List<Compte> trierComptesParDateDeCreation() {
        return null;
    }

    @Override
    public List<Compte> trierComptesParNomPropriétaire() {
        return null;
    }
}
