package com.codewars.kata.kyu4;

import java.util.List;

/**
 * @see <a href="https://www.codewars.com/kata/connect-four-1">Connect Four</a>
 */
public class ConnectFour
{
    public static String kata(List<String> piecesPositionList)
    {
        var board = new String[7][6];
        for (String piece : piecesPositionList)
        {
            int row, column = piece.charAt(0) - 'A';
            for (row = 0; board[column][row] != null; row++);

            board[column][row] = piece.substring(2);
            for (var move : new int[][] { { 0, 1 }, { 1, 0 }, { 1, 1 }, { 1, -1 } })
            {
                for (int n = 0, f = 1; f >= -1; f -= 2)
                {
                    for (int c = column, r = row; c >= 0 && c < 7 && r >= 0 && r < 6 && piece.substring(2).equals(board[c][r]); c += move[0] * f, r += move[1] * f)
                    {
                        if (++n > 4)
                        {
                            return piece.substring(2);
                        }
                    }
                }
            }
        }
        return "Draw";
    }
}
