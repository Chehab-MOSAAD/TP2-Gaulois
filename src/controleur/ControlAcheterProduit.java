package controleur;

import personnages.Gaulois;
import villagegaulois.Village;

public class ControlAcheterProduit {
    private Village village;
    private ControlTrouverEtalVendeur controlTrouverEtalVendeur;
    private ControlVerifierIdentite controlVerifierIdentite;

    public ControlAcheterProduit(ControlVerifierIdentite controlVerifierIdentite, ControlTrouverEtalVendeur controlTrouverEtalVendeur, Village village) {
        this.village = village;
        this.controlVerifierIdentite = controlVerifierIdentite;
        this.controlTrouverEtalVendeur = controlTrouverEtalVendeur;
    }

    public boolean verifierIdentite(String nomAcheteur) {
        return controlVerifierIdentite.verifierIdentite(nomAcheteur);
    }

    public Gaulois[] listeVendeurs(String produit) {
        return village.rechercherVendeursProduit(produit);
    }
}
