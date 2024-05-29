package moi;

import java.util.ArrayList;
import java.util.List;

public class service implements Statistique {
    private List<Voiture> listeVoiture;

    public service() {
        this.listeVoiture = new ArrayList<>();
    }

    @Override
    public void ajouter(Voiture voiture) {
        this.listeVoiture.add(voiture);
    }

    @Override
    public int prix() throws ArithmeticException {
        if (listeVoiture.isEmpty()) {
            throw new ArithmeticException("La liste de voitures est vide");
        }

        int sommePrix = 0;
        for (Voiture voiture : listeVoiture) {
            sommePrix += voiture.getPrix();
        }
        return sommePrix;
    }

    public List<Voiture> getListeVoiture() {
        return listeVoiture;
    }

    public void setListeVoiture(List<Voiture> listeVoiture) {
        this.listeVoiture = listeVoiture;
    }

    @Override
    public String toString() {
        return "service{" +
                "listeVoiture=" + listeVoiture +
                '}';
    }
}
