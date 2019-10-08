package com.vcs.lects.l05.tasks;



public class KaroliukaiTest {

	private static final char EMPTY = ' ';
	
	public static void main(String[] s) {
		


		char[][] a1 = { 
				{ EMPTY, 'X', 'X', EMPTY }, 
				{ EMPTY, EMPTY, 'A', EMPTY }, 
				{ 'Q', EMPTY, 'Z', EMPTY },
				{ 'M', EMPTY, 'A', 'M' },
				{ EMPTY, EMPTY, EMPTY, EMPTY } 
				};
		
		char[][] a2 = { 
				{ 'M', EMPTY, EMPTY, EMPTY, EMPTY }, 
				{ 'A', EMPTY, EMPTY, EMPTY, EMPTY },
				{ 'X', EMPTY, EMPTY, 'Q', EMPTY },
				{ 'X', 'A', 'Z', 'M', EMPTY } 
				};
		
		char[][] b1 = {{ EMPTY, 'X', EMPTY, 'X', EMPTY }};
		char[][] b2 = {{ 'X', EMPTY, 'X', EMPTY, EMPTY }};

		char[][] c1 = {
				{ EMPTY, '0', EMPTY, '0', '0' }, 
				{ '0', EMPTY, '0', '0', '0' }, 
				{ '0', EMPTY, EMPTY, '0', EMPTY },
				{ EMPTY, EMPTY, '0', EMPTY, EMPTY }, 
				{ EMPTY, '0', '0', EMPTY, EMPTY } 
				};
		char[][] c2 = { 
				{ EMPTY, EMPTY, EMPTY, '0', EMPTY }, 
				{ EMPTY, EMPTY, '0', EMPTY, '0' }, 
				{ EMPTY, EMPTY, EMPTY, '0', EMPTY },
				{ '0', EMPTY, EMPTY, '0', '0' }, 
				{ '0', '0', '0', '0', '0' } 
				};

		Karoliukai k = new KaroliukaiImpl();

		System.out.println(check(a2, k.rotateClockwise(a1, EMPTY, 47)) ? "Ok" : "fail");
		System.out.println(check(b2, k.rotateClockwise(b1, EMPTY, 4)) ? "Ok" : "fail");
		System.out.println(check(c2, k.rotateClockwise(c1, EMPTY, 1)) ? "Ok" : "fail");

	}

	private static boolean check(char[][] c1, char[][] c2) {

		if (c1.length != c2.length) {
			return false;
		}

		if (c1[0].length != c2[0].length) {
			return false;
		}

		for (int i = 0; i < c1.length; i++) {
			for (int j = 0; j < c1[0].length; j++) {
				if (c1[i][j] != c2[i][j]) {
					return false;
				}
			}
		}

		return true;

	}
}
