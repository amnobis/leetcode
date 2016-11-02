/**
 * @author anobis
 */
public class Problem36 {
    public static void main(String[] args) {

    }

    public boolean isValidSudoku(char[][] board) {
        boolean result = true;

        for (int i = 0; i < 9 && result; ++i) {
            result &= validateRow(board, i);
            result &= validateColumn(board, i);
            result &= validateBox(board, i % 3, i / 3);
        }

        return result;
    }

    public boolean validateRow(char[][] board, int row) {
        int[] vals = new int[9];

        for (int i = 0; i < board[row].length; ++i) {
            int val = board[row][i] - 49;
            if (val == -3) {
                continue;
            }

            vals[val]++;

            if (vals[val] > 1) {
                return false;
            }
        }
        return true;
    }

    public boolean validateColumn(char[][] board, int col) {
        int[] vals = new int[9];

        for (int i = 0; i < board[0].length; ++i) {
            int val = board[i][col] - 49;
            if (val == -3) {
                continue;
            }

            vals[val]++;

            if (vals[val] > 1) {
                return false;
            }
        }
        return true;
    }

    public boolean validateBox(char[][] board, int x, int y) {
        int[] vals = new int[9];
        int startR = x * 3;
        int endR = startR + 3;
        int startC = y * 3;
        int endC = startC + 3;

        for (int i = startR; i < endR; ++i) {
            for (int j = startC; j < endC; ++j) {
                int val = board[i][j] - 49;

                if (val == -3) {
                    continue;
                }

                vals[val]++;

                if (vals[val] > 1) {
                    return false;
                }
            }
        }
        return true;
    }
}
