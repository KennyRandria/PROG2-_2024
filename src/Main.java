public class Main {
    public static void main(String[] args) {
        Quartier quartier = new Quartier("1", "Analamahitsy");
        Immeuble immeuble = new Immeuble("2", "Jade", 5);

        Appartement appartement1 = new Appartement("A1", "Appartement 1", "Bel appartement", 300, "libre", immeuble);
        immeuble.ajouterAppartement(appartement1);

        quartier.ajouterImmeuble(immeuble);

        System.out.println("Nombre d'appartements dans le quartier : " + quartier.compterAppartements());
        System.out.println("L'appartement est présent : " + quartier.appartementPresent(appartement1));
    }
}
