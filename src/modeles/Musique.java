package modeles;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Musique {
    // Variables
    private String titre, artiste;
    private int duree = 0;

    @Id
    @GeneratedValue
    private int id;

    public Musique(){

    }

    public Musique(String titre, String artiste, int duree) {
        this.titre = titre;
        this.artiste = artiste;
        this.duree = duree;
    }

    // Constructeur
    public Musique(String unArtist, String unTitre) {
        artiste = unArtist;
        titre = unTitre;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getDuree() {
        return duree;
    }

    // Accesseur
    public String getArtiste() {
        return artiste;
    }

    // Modificateur
    public void setDuree(int sec) {
        if (sec < 0){
            System.out.println("La durée ne peut pas être négative");
        }
        duree = sec;

    }
    public void setArtiste(String artisteNom){
        this.artiste = artisteNom;
    }

    public String toString(){
        String description = "Titre : " + titre + " | Artiste = " + artiste + " | Durée : " + duree;
        return description;
    }

    public boolean equals(Musique m2){
        if( (this.duree == m2.getDuree()) && (this.artiste == m2.getArtiste()) &&(this.titre == m2.getTitre()) ){
            return true;
        }
        else {
            return false;
        }

    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
