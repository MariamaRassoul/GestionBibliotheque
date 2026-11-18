public class Magazine extends Document {
    private int numero;
    private String mois;

    public Magazine(String titre, String auteur, int numero, String mois) {
        super(titre, auteur);
        setNumero(numero);
        setMois(mois);

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero <= 0) {
            System.out.println("numero invalide ,validation refusee");
        } else {
            this.numero = numero;
        }
    }

    public String getMois() {
        return mois;
    }

    public void setMois(String mois) {
        if (mois == null || mois.isEmpty()) {
            System.out.println("mois invalide");
        } else {
            this.mois = mois;
        }

    }

    @Override

    public void afficher() {
        System.out.println("Titre:" + getTitre() + "|auteur:" +
                getAuteur() + "|Numero:" + getNumero() + "|Mois:" + getMois() +
                "|Disponible:" + (isDisponible() ? "oui" : "non"));
    }
}
