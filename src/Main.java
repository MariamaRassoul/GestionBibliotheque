public class Main{
    public  static void  main(String[]args){
        Livre l1 = new Livre("Une si longue lettre","mariama ba",5000);
        Livre l2 = new Livre("Xala","Ousmane sembene",3500);
        Livre l3 = new Livre("Le ventre de  l Atlantique","Fatou Diome",4000);
        l1.afficher();
        l2.afficher();
        l3.afficher();
        l1.emprunter();
        l1.emprunter();
        l1.emprunter();
        l1.rendre();
        l1.rendre();
        l1.afficher();
        l1.setPrix(-500);
        l1.afficher();
        Bibliotheque b = new Bibliotheque();
        b.ajouterDocument(l1);
        b.ajouterDocument(l2);
        b.ajouterDocument(l3);
        b.afficherTous();
        System.out.println("Le nombre de document est :" + b.nombreDocument());
        Document trouve = b.rechercherParTitre("Xala");
        if(trouve!=null){
            trouve.afficher();

        }else{
            System.out.println("Livre introuvable");
        }
        Document inconnu = b.rechercherParTitre("inconnu");
        if(inconnu!=null){
            inconnu.afficher();
        }else{
            System.out.println("Ce livre n existe pas dans la bibliotheque");
        }
        b.emprunterDocumentParTitre("Xala");
        b.emprunterDocumentParTitre("Xala");
        b.emprunterDocumentParTitre("inconnu");
        Livre test = new Livre("test","auteur",-400);
        test.afficher();
        Magazine m1 = new Magazine("Jeune Afrique ", "Redaction",12,"Mars");
        m1.afficher();
        m1.emprunter();
        m1.emprunter();
        Magazine m2 = new Magazine("Test","auteur",-3,"Avril");
        m2.afficher();
        b.ajouterDocument(m1);
        b.afficherTous();


    }
}