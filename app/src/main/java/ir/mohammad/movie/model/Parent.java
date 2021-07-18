package ir.mohammad.movie.model;

import java.util.List;

public class Parent {

    private List<Filter>filter;
    private List<Tabligh>tabligh;
    private List<pishnahad>pishnahad;
    private List<Estakhr>estakhr;

    public Parent(List<Filter> filter, List<Tabligh> tabligh, List<ir.mohammad.movie.model.pishnahad> pishnahad, List<Estakhr> estakhr) {
        this.filter = filter;
        this.tabligh = tabligh;
        this.pishnahad = pishnahad;
        this.estakhr = estakhr;
    }

    public List<Filter> getFilter() {
        return filter;
    }

    public void setFilter(List<Filter> filter) {
        this.filter = filter;
    }

    public List<Tabligh> getTabligh() {
        return tabligh;
    }

    public void setTabligh(List<Tabligh> tabligh) {
        this.tabligh = tabligh;
    }

    public List<ir.mohammad.movie.model.pishnahad> getPishnahad() {
        return pishnahad;
    }

    public void setPishnahad(List<ir.mohammad.movie.model.pishnahad> pishnahad) {
        this.pishnahad = pishnahad;
    }

    public List<Estakhr> getEstakhr() {
        return estakhr;
    }

    public void setEstakhr(List<Estakhr> estakhr) {
        this.estakhr = estakhr;
    }
}
