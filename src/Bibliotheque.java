import java.util.ArrayList;

public class Bibliotheque {
    private ArrayList<Document> documents;

    public Bibliotheque() {

        this.documents = new ArrayList<>();
    }

    public void ajouterDocument(Document document) {
        documents.add(document);

    }

    public void afficherTous() {
        for (Document d : documents) {
            d.afficher();
        }
    }

    public int nombreDocument() {
        return documents.size();
    }

    public Document rechercherParTitre(String titre) {
        for (Document d : documents) {
            if (d.getTitre().equalsIgnoreCase(titre)) {
                return d;
            }
        }
        return null;
    }

    public void emprunterDocumentParTitre(String titre) {
        Document d = rechercherParTitre(titre);
        if (d == null) {
            System.out.println("Ce document n existe pas");
        } else {
            d.emprunter();
        }
    }


}
