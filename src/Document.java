public abstract class Document implements Empruntable {
    private String titre;
    private boolean disponible;
    private String auteur;

    public Document(String titre, String auteur) {
        this.titre = titre;
        this.auteur = auteur;
        this.disponible = true;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }


    public boolean isDisponible() {
        return disponible;
    }


    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public void emprunter() {
        if (disponible) {
            disponible = false;
            System.out.println("Document emprunter avec succee");
        } else {
            System.out.println("Document est deja emprunte");
        }
    }

    public void rendre() {
        if (!disponible) {
            disponible = true;
            System.out.println(" Le document est rendu avec succee");
        } else {
            System.out.println("ce document n a pas ete emprunte ");
        }
    }

    public  abstract void afficher();



}


