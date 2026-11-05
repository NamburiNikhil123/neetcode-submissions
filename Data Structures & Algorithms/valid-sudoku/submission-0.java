class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int row = 0; row < 9; row++) {
            HashSet<Character> seen = new HashSet<>();
            for (int i = 0; i < 9; i++) {
                if (board[row][i] == '.')
                    continue;

                if (seen.contains(board[row][i])) {
                    return false;
                } else {
                    seen.add(board[row][i]);
                }
            }
        }

        for (int col = 0; col < 9; col++) {
            HashSet<Character> seen = new HashSet<>();
            for (int i = 0; i < 9; i++) {
                if (board[i][col] == '.')
                    continue;

                if (seen.contains(board[i][col])) {
                    return false;
                } else {
                    seen.add(board[i][col]);
                }
            }
        }

        HashMap<String, HashSet<Character>> squares = new HashMap<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                String key = (i/3)+ "," + (j/3);

                squares.putIfAbsent(key, new HashSet<>());

                if(board[i][j] == '.') continue;
                if(squares.get(key).contains(board[i][j])){
                    return false;
                } else {
                    squares.get(key).add(board[i][j]);
                }
            }
        }

        return true;
    }
}
