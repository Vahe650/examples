package shild.Glux3;

public class ThreeDMatrixClass {
    public static void main(String[] args) {
        int threeD[][][] = new int[7][8][9];
        int i, j, k;
        for (i = 0; i < 7; i++)
            for (j = 0; j < 8; j++)
                for (k = 0; k < 9; k++)
                    threeD[i][j][k] = i * j * k;
        for (i = 0; i < 7; i++) {
            for (j = 0; j < 8; j++) {
                for (k = 0; k < 9; k++)
                    System.out.print(threeD[i][j][k] + "  ");
                System.out.println();
            }
            System.out.println();
        }
    }
}
