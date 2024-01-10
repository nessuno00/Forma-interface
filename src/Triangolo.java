class Triangolo implements  Forma {

    private double altezza;
    private double base;


    public Triangolo( double altezza, double base) {
this.altezza = altezza;
this.base = base;

    }

    @Override
    public double calcoloArea() {
        return  (base * altezza) / 2;
    }
}