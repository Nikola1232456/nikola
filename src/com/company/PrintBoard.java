package com.company;

public class PrintBoard {
    private char[] [] board = {{' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}};

    public void printBoard( ) {
        System.out.println(board[0][0] + " " + "|" + board[0][1] + " " + "|" + board[0][2]);
        System.out.println("--+--+--");
        System.out.println(board[1][0] + " " + "|" + board[1][1] + " " + "|" + board[1][2]);
        System.out.println("--+--+--");
        System.out.println(board[2][0] + " " + "|" + board[2][1] + " " + "|" + board[2][2]);
    }
    public void play(char player,int x,int y) {
        this.board[x][y] = player;
    }
}
