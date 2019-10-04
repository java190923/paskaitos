package com.vcs.lects.l10.err;

public class Formule {

	public static void main(String[] args) {

		Formule f = new Formule();

		try {
			System.out.println(f.daryk1(" "));
			return;
		} catch (TusciasString e) {
			System.out.println("Nevalidus duomenys, pataisykit! Klaidos zinute: " + e.getMessage());
			throw new RuntimeException(e);
		} catch (Exception e) {
			// System.out.println("Nenumatyta situacija");
			e.printStackTrace();
		} finally {
			System.out.println("Va ir final");
		}

		System.out.println("Darba baigiau sekmingai");
		return;
	}

	private int daryk1(String str) {
		return daryk2(str);
	}

	private int daryk2(String str) {

		if (str == null) {
			throw new NullPointerException("Null string'as BLOGAI");
		}

		if (str.isEmpty()) {
			throw new TusciasString("Tuscias tekstas");
		}

		if (str.isBlank()) {
			throw new TusciasString("Nera prasmingu simboliu");
		}

		return str.length();
	}

}
