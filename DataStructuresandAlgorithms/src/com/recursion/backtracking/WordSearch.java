package com.recursion.backtracking;

import java.util.*;

public class WordSearch {
    public static void main(String[] args) {
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'z'}
        };

        String word = "ABCCED";
        WordSearch obj = new WordSearch();
        System.out.println(obj.exist(board, word));
//        char[][] board = {
//                {'o', 'a', 'a', 'n'},
//                {'e', 't', 'a', 'e'},
//                {'i', 'h', 'k', 'r'}
//        };
//        String words[] = {"oath","pea","eat","rain"};
//        System.out.println(obj.findWords(board, words));
    }

    final int[] rowDirection = {-1, 0, 1, 0}, colDirection = {0, 1, 0, -1};

    public boolean exist(char[][] board, String word) {
        final int MAX_ROWS = board.length, MAX_COLS = board[0].length;
        for (int i = 0; i < MAX_ROWS; i++) {
            for (int j = 0; j < MAX_COLS; j++) {
                if (board[i][j] == word.charAt(0) && dfs(i, j, 0, MAX_ROWS, MAX_COLS, board, word)) return true;
            }
        }
        return false;
    }

    private boolean dfs(int r, int c, int idx, int MAX_ROWS, int MAX_COLS, char[][] board, String word) {
        if (idx >= word.length()) return true;
        if (r < 0 || r >= MAX_ROWS ||
                c < 0 || c >= MAX_COLS ||
                board[r][c] != word.charAt(idx)) return false;
        char visted = board[r][c];
        board[r][c] = '-';
        for (int dir = 0; dir < 4; dir++) {
            if (dfs(r + rowDirection[dir], c + colDirection[dir], idx + 1, MAX_ROWS, MAX_COLS, board, word))
                return true;
        }
        board[r][c] = visted;
        return false;
    }

    public List<String> findWords(char[][] board, String[] words) {
        List<String> res = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if(exist(board, words[i])) {
                res.add(words[i]);
            }
        }
        return res;
    }

}
