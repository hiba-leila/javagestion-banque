package metier.admin;

import presentation.modele.Client;
import presentation.modele.Compte;
import presentation.modele.TableauDeBord;

import java.time.LocalDateTime;
import java.util.List;

public class ServiceAdmin implements IServiceAdmin{
    @Override
    public Client nouveauClient() {
        return null;
    }

    @Override
    public Client nouveauCompteClientExistant() {
        return null;
    }

    @Override
    public Client chercherClientParId(Long id) {
        return null;
    }

    @Override
    public List<Client> chercherClientParNom(String nom) {
        return null;
    }

    @Override
    public List<Client> chercherClientParPrénom(String prenom) {
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
