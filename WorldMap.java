
public class WorldMap {
    public static void main(String[] args) {

        int width = StdIn.readInt();
        int height = StdIn.readInt();
        StdDraw.setCanvasSize(width, height);
        StdDraw.setXscale(0.0, width);
        StdDraw.setYscale(0.0, height);

        while (!StdIn.isEmpty()) {
            StdIn.readString();
            int points = StdIn.readInt();
            double[] x = new double[points];
            double[] y = new double[points];
            for (int i = 0; i < points; i++) {
                x[i] = StdIn.readDouble();
                y[i] = StdIn.readDouble();
            }
            StdDraw.polygon(x, y);
        }

    }
}
