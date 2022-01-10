package Controller;

import exceptions.AlreadyExists;
import model.Produkt;
import repo.Lager;

public class Controller {

    private Lager lager;

    public Controller(Lager lager) {
        this.lager = lager;
    }

    public Lager getLager() {
        return lager;
    }

    public void setLager(Lager lager) {
        this.lager = lager;
    }

    public void createProdukt(String name,int preis, String sku, int anz ) throws AlreadyExists {
        for (Produkt p:lager.getAll())
            if (p.getName() == name) throw new AlreadyExists("A course with this ID already exists");
        Produkt newProdukt = new Produkt(name, preis, sku, anz);
        lager.create(newProdukt);
    }

    public void updateProdukt(String name,int preis, String sku, int anz){
        Produkt updatedProdukt = new Produkt(name, preis, sku, anz);
        lager.update(updatedProdukt);
    }

    public void deleteProdukt(String name,int preis, String sku, int anz){
        Produkt deleteProdukt = new Produkt(name, preis, sku, anz);
        lager.delete(deleteProdukt);
    }

}
