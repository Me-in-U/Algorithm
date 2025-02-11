public class Main2 {
    public static class Hole {
        int x1 = -1;
        int y1 = -1;
        int x2;
        int y2;

        Hole(int x, int y) {
            if (x1 == -1) {
                this.x1 = x;
                this.y1 = y;
            } else {
                this.x2 = x;
                this.y2 = y;
            }
        }

        public int[] getAnotherHole(int x, int y) {
            if (this.x1 == x && this.y1 == y) {
                return new int[] { this.x2, this.y2 };
            } else {
                return new int[] { this.x1, this.y1 };
            }
        }
    }

    public static void main(String[] args) {
        Hole[] holes = new Hole[10];
        holes[6] = new Hole(2, 3);
        holes[6] = new Hole(3, 9);

        holes[7] = new Hole(10, 3);
        holes[7] = new Hole(0, 7);

    }
}
