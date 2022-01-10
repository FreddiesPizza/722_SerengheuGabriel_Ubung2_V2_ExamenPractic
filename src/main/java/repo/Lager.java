package repo;

import model.Produkt;

import java.util.Date;
import java.util.List;

public class Lager extends InMemoryRepository<Produkt> {

    private Date datum;
    private List<Produkt> produkte;

    public Lager() {
    }

    public Lager(Date datum, List<Produkt> produkte) {
        this.datum = datum;
        this.produkte = produkte;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public List<Produkt> getProdukte() {
        return produkte;
    }

    public void setProdukte(List<Produkt> produkte) {
        this.produkte = produkte;
    }


    @Override
    public Produkt update(Produkt obj) {
        Produkt produktToUpdate = this.repoList.stream()
                .filter(course -> course.getClass() == obj.getClass())
                .findFirst()
                .orElseThrow();

        produktToUpdate.setAnz(obj.getAnz());
        produktToUpdate.setName(obj.getName());
        produktToUpdate.setPreis(obj.getPreis());
        produktToUpdate.setSku(obj.getSku());

        return produktToUpdate;
    }
}
