public class Livre extends Document {
    private double prix;

    public Livre(String titre, String auteur, double prix) {
        super(titre, auteur);
        setPrix(prix);
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        if (prix < 0) {
            System.out.println("le prix invalide ,modification refusee");

        } else {
            this.prix = prix;
        }

    }

    @Override
    public void afficher() {
        System.out.println("Titre:" + getTitre() + ",auteur:" + getAuteur() + ",Prix:" + prix + ",Disponible:" + (isDisponible() ? "oui" : "non"));
    }
}
