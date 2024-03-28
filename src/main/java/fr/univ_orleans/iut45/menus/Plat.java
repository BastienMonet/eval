package fr.univ_orleans.iut45.menus;

import java.util.List;

class Plat {
    protected String nom;
    protected List<String> allergenes;
    protected boolean contient_viande;
    protected double prix_de_revient;

    public Plat(String nom,
                boolean contient_viande,
                List<String> allergenes,
                double prix_de_revient) {
        this.nom = nom;
        this.contient_viande = contient_viande;
        this.allergenes = allergenes;
        this.prix_de_revient = prix_de_revient;
    }

    public double prixDeRevient() {
        return this.prix_de_revient;
    }

    public boolean contientViande() {
        return this.contient_viande;
    }

    public List<String> getListAlergene() {
        return this.allergenes;
    }

}
