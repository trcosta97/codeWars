public class PopulationGrowth {

    public static int nbYear(int p0, double percent, int aug, int p) {
        double numberOfYears = 0;
        while (p0 <= p){
            p0 += p0* percent / 100 + aug;
            numberOfYears += 1;
        }
        int total = (int) Math.round(numberOfYears);
        return total;
    }

    public static void main(String[] args) {
        System.out.println(nbYear(1500000, 0.25, 1000, 2000000));
    }
}
