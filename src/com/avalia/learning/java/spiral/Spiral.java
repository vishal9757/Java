package com.avalia.learning.java.spiral;

public class Spiral {
	private int number = 1;
	private int[][] mat;

	public Spiral(int x, int y) {
		int[][] mat = new int[x][y];
		fill(mat);
		this.mat = mat;
	}

	public Spiral(int[][] mat) {
		this.mat = mat;
	}

	public void fill(int[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = number;
				number++;
			}
		}
	}

	public void print() {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + ",");
			}
			System.out.println("");
		}
	}

	public void spiralPrint() {
		int startcol = 0;
		int startrow = 0;
		int endcol = mat[0].length - 1;
		int endrow = mat.length - 1;
		spiralPrint(startrow, startcol, endrow, endcol);
	}

	private void spiralPrint(int startrow, int startcol, int endrow, int endcol) {
		ltr(startrow, startcol, endcol);
		startrow++;
		ttb(endcol, startrow, endrow);
		endcol--;
		rtl(endrow, endcol, startcol);
		endrow--;
		btt(startcol, endrow, startrow);
		startcol++;
		if (startrow <= endrow && startcol <= endcol) {
			spiralPrint(startrow, startcol, endrow, endcol);
		}
	}

	private void ltr(int row, int sCol, int eCol) {
		for (int i = sCol; i <= eCol; i++) {
			System.out.print(mat[row][i] + ",");
		}
	}

	private void rtl(int row, int sCol, int eCol) {
		for (int i = sCol; i >= eCol; i--) {
			System.out.print(mat[row][i] + ",");
		}
	}

	private void ttb(int col, int sRow, int eRow) {
		for (int i = sRow; i <= eRow; i++) {
			System.out.print(mat[i][col] + ",");
		}
	}

	private void btt(int col, int sRow, int eRow) {
		for (int i = sRow; i >= eRow; i--) {
			System.out.print(mat[i][col] + ",");
		}
	}
}
