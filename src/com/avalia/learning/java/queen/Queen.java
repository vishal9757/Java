package com.avalia.learning.java.queen;

public class Queen {

	private int[][] mat;
	int a = 0;
	// int[] arr = new int[8];
	// int j = 1;
	//
	private int boardSize;

	public Queen(int boardSize) {
		this.boardSize = boardSize;
		this.mat = new int[boardSize][boardSize];
	}

	public void solve() {

		int queenCount = boardSize;
		int x = 0;
		int y = 0;
		// int oldX = 0;
		// int oldY = 0;
		// int newY = 1;
		while (queenCount > 0) {
			for (x = 0, y = 0; x < boardSize && y < boardSize;) {
				if (checkPosition(x, y)) {
					mat[x][y] = 1;
					queenCount--;
					printMat();
					System.out.println("__________________________");
					x++;
				} else {
					y++;
				}
			}

		}
	}

	public boolean test(int row, int col) {
		return checkPosition(row, col);
	}

	private boolean checkPosition(int row, int col) {

		if (checkRow(row) && checkCol(col) && checkFDiag(row, col) && checkBDiag(row, col)) {

			return true;
		}
		return false;
		// for (int i = 0; i < 8; i++) {
		// if (i != oldX && checkDiag(oldX, oldY, newY, i) && oldY != newY &&
		// checkRow(i)) {
		// oldY = newY;
		// oldX = i;
		// arr[j] = i;
		// j++;
		// update(mat, i, newY);
		// return true;
		// }
		// }

	}

	private boolean checkCol(int col) {
		for (int i = 0; i < boardSize; i++) {
			if (mat[i][col] == 1)
				return false;
		}
		return true;
	}

	private boolean checkBDiag(int row, int column) {
		for (int i = row, j = column; i >= 0 && j >= 0 && i < boardSize && j < boardSize; i--, j--) {
			if (mat[i][j] == 1) {
				return false;
			}
		}
		for (int i = row, j = column; i >= 0 && j >= 0 && i < boardSize && j < boardSize; i++, j++) {
			if (mat[i][j] == 1) {
				return false;
			}
		}
		return true;
	}

	private boolean checkFDiag(int row, int column) {
		for (int i = row, j = column; i >= 0 && j >= 0 && i < boardSize && j < boardSize; i--, j++) {
			if (mat[i][j] == 1) {
				return false;
			}
		}
		for (int i = row, j = column; i >= 0 && j >= 0 && i < boardSize && j < boardSize; i++, j--) {
			if (mat[i][j] == 1) {
				return false;
			}
		}
		return true;
	}

	private boolean checkRow(int row) {

		for (int i = 0; i < boardSize; i++) {
			if (mat[row][i] == 1)
				return false;
		}
		return true;
	}

	private void update(int[][] mat, int i, int y2) {
		mat[i][y2] = 1;
	}

	private void printMat() {
		for (int i = 0; i < boardSize; i++) {
			for (int j = 0; j < boardSize; j++) {
				System.out.print(mat[i][j]);
			}
			System.out.println("");
		}
	}

}
