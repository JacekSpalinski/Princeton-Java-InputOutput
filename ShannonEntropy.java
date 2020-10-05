
public class ShannonEntropy {
    public static void main(String[] args) {

        int m = Integer.parseInt(args[0]);

        int[] values = new int[m + 1];
        int total = 0;
        while (!StdIn.isEmpty()) {

            int v = StdIn.readInt();
            values[v]++;
            total++;
        }

        double[] p = new double[m + 1];
        for (int i = 1; i < m + 1; i++) {
            p[i] = (double) values[i] / total;
        }

        double[] pl = new double[m + 1];
        for (int i = 1; i < m + 1; i++) {
            if (p[i] != 0) pl[i] = -p[i] * (Math.log(p[i]) / Math.log(2));
        }

        double h = 0;
        for (int i = 1; i < m + 1; i++) {
            h = h + pl[i];
        }
        StdOut.printf("%.4f\n", h);
    }
}
