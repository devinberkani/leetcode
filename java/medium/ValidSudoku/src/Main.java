public class Main {
    public static void main(String[] args) {
//        System.out.println(isValidSudoku(new char[][] {{'5','3','.','.','7','.','.','.','.'}
//                ,{'6','.','.','1','9','5','.','.','.'}
//                ,{'.','9','8','.','.','.','.','6','.'}
//                ,{'8','.','.','.','6','.','.','.','3'}
//                ,{'4','.','.','8','.','3','.','.','1'}
//                ,{'7','.','.','.','2','.','.','.','6'}
//                ,{'.','6','.','.','.','.','2','8','.'}
//                ,{'.','.','.','4','1','9','.','.','5'}
//                ,{'.','.','.','.','8','.','.','7','9'}}));
        System.out.println(isValidSudoku(new char[][] {
                {'.','.','4','.','.','.','6','3','.'},
                {'.','.','.','.','.','.','.','.','.'},
                {'5','.','.','.','.','.','.','9','.'},
                {'.','.','.','5','6','.','.','.','.'},
                {'4','.','3','.','.','.','.','.','1'},
                {'.','.','.','7','.','.','.','.','.'},
                {'.','.','.','5','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.','.'}}
        ));
    }

    public static boolean isValidSudoku(char[][] board) {
        boolean[][] rowCheck = new boolean[9][9];
        boolean[][] columnCheck = new boolean[9][9];

        int k = -3;
        for (int c = 0; c < 3; c++) {
            k += 3;
            int l = k + 3;
            boolean[] groupCheck = new boolean[9];
            for (int i = 0; i < 9; i++) {
                for (int j = k; j < l; j++) {
                    if (board[i][j] != '.') {
                        int current = Character.getNumericValue(board[i][j]) - 1;
                        if (rowCheck[i][current] || columnCheck[j][current] || groupCheck[current]) return false;
                        rowCheck[i][current] = true;
                        columnCheck[j][current] = true;
                        groupCheck[current] = true;
                    }
                }
                if (i == 2 || i == 5) groupCheck = new boolean[9];
            }
        }
        return true;
    }

    public static void printDouble(boolean[][] arr) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}