/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datamodel;

public class DataFilm extends InformasiFilm {
    private double alur;
    private double penokohan;
    private double akting;

    public DataFilm(int id, String judul, double alur, double penokohan, double akting) {
        super(id, judul);
        this.alur = alur;
        this.penokohan = penokohan;
        this.akting = akting;
    }

    public DataFilm(String judul, double alur, double penokohan, double akting) {
        this(0, judul, alur, penokohan, akting);
    }

    public double getAlur() {
        return alur;
    }

    public void setAlur(double alur) {
        this.alur = alur;
    }

    public double getPenokohan() {
        return penokohan;
    }

    public void setPenokohan(double penokohan) {
        this.penokohan = penokohan;
    }

    public double getAkting() {
        return akting;
    }

    public void setAkting(double akting) {
        this.akting = akting;
    }

    public double getRating() {
        return (alur + penokohan + akting) / 3.0;
    }
}
