class fA {
    public void area(double r) {
        double area = 3.14 * r * r;
        System.out.println("circle area " + area);
    }

    public void area(int li, int hi) {
        int area = li * hi;
        System.out.println("rect area " + area);
    }

    public void area(double l, double h) {
        double area = l * h;
        System.out.println("double area " + area);
    }

}

class MainfA {
    public static void main(String args[]) {
        fA c = new fA();
        c.area(3);
        c.area(2, 4);
        c.area(2.0, 4.0);
    }

}