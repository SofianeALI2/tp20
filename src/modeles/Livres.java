package modeles;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Livres {
    // Variables
    private String titre, artiste;
    private int pages = 0;

    @Id
    @GeneratedValue
    private int id;

    public Livres(){

    }

    public Livres(String titre, String artiste, int pages) {
        this.titre = titre;
        this.artiste = artiste;
        this.pages = pages;
    }

    // Constructeur
    public Livres(String unArtist, String unTitre) {
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
        return pages;
    }

    // Accesseur
    public String getArtiste() {
        return artiste;
    }

    // Modificateur

    public void setArtiste(String artisteNom){
        this.artiste = artisteNom;
    }

    public String toString(){
        String description = "Titre : " + titre + " | Artiste = " + artiste + " | Durée : " + pages;
        return description;
    }

    public boolean equals(Musique m2){
        if( (this.pages == m2.getDuree()) && (this.artiste == m2.getArtiste()) &&(this.titre == m2.getTitre()) ){
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
