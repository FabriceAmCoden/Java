public class arrays {
    public static void main(String[] args) {
        int[] trhowsArray = new int[6];
        System.out.println(trhowsArray[4]);
        for (int i = 0; i < trhowsArray.length; i++) {
            System.out.println(trhowsArray[i]);

            int[][] playGround = new int[3][3];

            playGround[0][0] = 1;

            for (int row = 0; row < playGround.length; row++) {

                for (int col = 0; col < playGround.length; col++) {
                    System.out.print(playGround[row][col] + " ");
                }
            }


        }
    }
}
        


