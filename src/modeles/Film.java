package modeles;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Film {

    private String nom;
    private int annee;
    private String realisateur;
    @Id
    @GeneratedValue
    private int id;

    public int getId() {
        return id;
    }

    public Film() {
    }

    public Film(String nom, int annee, String realisateur) {
        this.nom = nom;
        this.annee = annee;
        this.realisateur = realisateur;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public String getRealisateur() {
        return realisateur;
    }

    public void setRealisateur(String realisateur) {
        this.realisateur = realisateur;
    }

    @Override
    public String toString() {
        return "Film{" +
                "nom='" + nom + '\'' +
                ", annee=" + annee +
                ", realisateur='" + realisateur + '\'' +
                ", id=" + id +
                '}';
    }
}
