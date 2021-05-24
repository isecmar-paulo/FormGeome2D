package po.leit;

import po.leit.Ponto2D;

public class Forma2D {
    private double width;
    private double height;
    private final Ponto2D localIni;

    public Forma2D() {
        this.width = 0;
        this.height = 0;
        this.localIni = null;
    }
    public Forma2D(double width, double height) {
        this.width = width;
        this.height = height;
        this.localIni = new Ponto2D();
    }

    public Forma2D(double width, double height, Ponto2D local) {
        this.width = width;
        this.height = height;
        this.localIni = local;
    }

    public Forma2D(double width, double height, int cX, int cY) {
        this.width = width;
        this.height = height;
        this.localIni = new Ponto2D(cX, cY);
    }

    public Forma2D(double tamanho, int cX, int cY)
    {
        this.width = this.height = tamanho;
        this.localIni = new Ponto2D(cX, cY);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Ponto2D getLocalIni() {
        return this.localIni;
    }

    void showDim() {
        System.out.println("Largura e cumprimento " +
                width + " e " + height);
    }
}
