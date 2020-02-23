class array5 {
    public static void main(String[] args) {
        int threeD[][][] = new int[3][4][5];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int j2 = 0; j2 < 5; j2++) {
                    threeD[i][j][j2] = i * j * j2;   
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int j2 = 0; j2 < 5; j2++) {
                    System.out.print(threeD[i][j][j2] + " ");   
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}