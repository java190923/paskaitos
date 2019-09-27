package com.vcs.lects.l05.quiz;

public class QuizMatrix {

	public static void main(String[] args) {

		QuizMatrix q = new QuizMatrix();

		
		Integer[] intw = {
				
				1,
				4,
				null,
				6
		};
		
		int[][] m = { 
				{ 1, 2, 3, 4, 14, 16}, 
				{},
				null,
				{ 9, 0, 9, 8, 11}, 
				{ 7, 6, 5, 4, 12, 17, 18 }
				
			};

		System.out.println( q.getLastMatrixEmenet(m) );
	}

	public int getLastMatrixEmenet(int[][] matrix) {

		int eilutesIndex = matrix.length -1; 
		
		int stulpIndex = matrix[ eilutesIndex ].length -1; 
		
		return matrix[eilutesIndex][stulpIndex];
	}
	
	
	public void lastAsFirst(int[][] matrix) {

		int eilutesIndex = matrix.length -1; 
		
		int stulpIndex = matrix[ eilutesIndex ].length -1; 
		
		 matrix[eilutesIndex][stulpIndex] = matrix[0][0];
	}
}
