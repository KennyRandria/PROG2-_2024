import java.util.ArrayList;
import java.util.List;

public class Immeuble extends Endroit {
    private int nombreEtages;
    private List<Appartement> appartements;

    public Immeuble(String id, String nom, int nombreEtages) {
        super(id, nom);
        this.nombreEtages = nombreEtages;
        this.appartements = new ArrayList<>();
    }

    public void ajouterAppartement(Appartement appartement) {
        appartements.add(appartement);
    }

    public List<Appartement> getAppartements() {
        return appartements; 
    }

    @Override
    public int compterAppartements() {
        return appartements.size();
    }

}
