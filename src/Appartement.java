import java.util.Objects;

public class Appartement {
    private String id;
    private String titre;
    private String description;
    private double loyerMensuel;
    private String statut;
    private Immeuble immeuble;

    public Appartement(String id, String titre, String description, double loyerMensuel, String statut, Immeuble immeuble) {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.loyerMensuel = loyerMensuel;
        this.statut = statut;
        this.immeuble = immeuble;
    }

    public String getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public String getDescription() {
        return description;
    }

    public double getLoyerMensuel() {
        return loyerMensuel;
    }

    public String getStatut() {
        return statut;
    }

    public Immeuble getImmeuble() {
        return immeuble;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Appartement that = (Appartement) obj;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
