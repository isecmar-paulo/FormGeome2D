package po.leit;

public class Main {

    public static void main(String[] args) {
        Triangulo t4 = new Triangulo();
        Triangulo t1 = new Triangulo("preenchido", 19.0, 40.0, new Ponto2D(120,110));
        Triangulo t2 = new Triangulo("delineado", 8.0, 12.0);
        Triangulo t3 = new Triangulo(4.0,0,0);

        t1 = t4;

        System.out.println("Info para t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area é " + t1.area());

        System.out.println();

        System.out.println("Info para t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area é " + t2.area());

        System.out.println();

        System.out.println("Info for t3: ");
        t3.showStyle();
        t3.showDim();
        System.out.println("Area é " + t3.area());

        System.out.println();
    }
}
