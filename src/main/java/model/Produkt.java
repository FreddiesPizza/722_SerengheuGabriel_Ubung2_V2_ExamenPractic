package model;

public class Produkt {
    private String name;
    private int preis;
    private String sku;
    private int anz;

    public Produkt(String name, int preis, String sku, int anz) {
        this.name = name;
        this.preis = preis;
        this.sku = sku;
        this.anz = anz;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPreis() {
        return preis;
    }

    public void setPreis(int preis) {
        this.preis = preis;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public int getAnz() {
        return anz;
    }

    public void setAnz(int anz) {
        this.anz = anz;
    }
}
