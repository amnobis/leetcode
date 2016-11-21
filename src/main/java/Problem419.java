/**
 * @author anobis
 */
public class Problem419 {
    public static void main(String[] args) {

    }

    public static int countBattleships(char[][] board) {
        int count = 0;

        for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board[i].length; ++j) {
                char val = board[i][j];

                if (val == 'X' && first(i-1, j, board) && first(i, j-1, board)) {
                    count++;
                }
            }
        }

        return count;
    }

    public static boolean first(int i, int j, char[][] board) {
        if (i < 0 || j < 0) {
            return true;
        } else if (board[i][j] == 'X') {
            return false;
        }

        return true;
    }
}
