package metier.clients;

import presentation.modele.Compte;

public class ServiceClient implements IServiceClient{
    @Override
    public boolean versement() {
        return false;
    }

    @Override
    public boolean retrait() {
        return false;
    }

    @Override
    public boolean retrait(int choixRetrait) {
        return false;
    }

    @Override
    public boolean virement() {
        return false;
    }

    @Override
    public boolean modifierProfile(int choixModification) {
        return false;
    }

    @Override
    public void dernièresOpérations() {

    }

    @Override
    public Double afficherSolde() {
        return null;
    }

    @Override
    public Compte choisirCompte() {
        return null;
    }

    @Override
    public void afficherTicket() {

    }
}
