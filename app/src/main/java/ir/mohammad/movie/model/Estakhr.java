package ir.mohammad.movie.model;

public class Estakhr {
    String image_estakhr;
    String text_t;
    String text_m;
    String text_c;

    public Estakhr(String image_estakhr, String text_t, String text_m, String text_c) {
        this.image_estakhr = image_estakhr;
        this.text_t = text_t;
        this.text_m = text_m;
        this.text_c = text_c;
    }

    public String getImage_estakhr() {
        return image_estakhr;
    }

    public void setImage_estakhr(String image_estakhr) {
        this.image_estakhr = image_estakhr;
    }

    public String getText_t() {
        return text_t;
    }

    public void setText_t(String text_t) {
        this.text_t = text_t;
    }

    public String getText_m() {
        return text_m;
    }

    public void setText_m(String text_m) {
        this.text_m = text_m;
    }

    public String getText_c() {
        return text_c;
    }

    public void setText_c(String text_c) {
        this.text_c = text_c;
    }
}
