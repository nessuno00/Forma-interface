 class Rettangolo implements  Forma {

    private  double altezza;
    private double base;


    public Rettangolo(double altezza, double base) {

        this.altezza = altezza;
        this.base = base;
 }

     @Override
     public double calcoloArea() {
         return  base * altezza;
     }
 }

