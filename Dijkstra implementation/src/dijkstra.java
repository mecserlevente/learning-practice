public class dijkstra {

    public static void main(String[] args) {

        int graf[][] = new int[][]{{0, 4, 0, 0, 7},
                {4, 0, 1, 2, 0},
                {0, 1, 0, 6, 0},
                {7, 0, 0, 0, 0}

        };

        dijkstra p = new dijkstra();
        p.legrovut(graf, 0);

    }

    public void legrovut(int graf[][], int src) {

        int tav[] = new int[5];

        boolean b[] = new boolean[5];
        for (int i = 0; i < 5; i++) {
            tav[i] = Integer.MAX_VALUE;
            b[i] = false;

        }
        tav[0] = 0;
        for (int i = 0; i < 5; i++) {
            int u = mintav(tav, b);
            b[u] = true;
            for (int j = 0; j < 5; j++) {

                if (!b[j] && graf[u][j] != 0 && tav[u] != Integer.MAX_VALUE && tav[u] + graf[u][j] < tav[j]) {
                    tav[j] = tav[u] + graf[u][j];
                }
            }
            printgraf(tav, 5);
        }

    }

    public int mintav(int tav[], boolean b[]) {
        int min = Integer.MAX_VALUE, index = -1;
        for (int i = 0; i < 5; i++) {
            if (b[i] == false && tav[i] <= min) {
                min = tav[i];
                index = i;
            }

        }
        return index;
    }

    public void printgraf(int tav[], int j) {
        System.out.println("Távolság a forrástól a végpontig: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(i + "---->" + tav[i]);
        }

    }
}
