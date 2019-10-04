package com.vcs.lects.l10.trees;

import java.util.List;

/**
 * @author owr
 *
 */
public class PrekiuKatalogas {

	public static void main(String[] args) {

		/**
		 * Ukines
		 */

		Item vokiski = new Item("Vokiski", new Item("Gooten clean"), new Item("Fertxcdzasd"));
		Item lePrancuziski = new Item("LePrancuziskas", new Item("Parfume clean"), new Item("LeEifel clean"),
				new Item("LeParfume"));

		Item valikliai = new Item("Valikliai", vokiski, lePrancuziski);
		Item balikliai = new Item("Balikliai", new Item("Vanish"), new Item("Baltuoklis"));
		Item chemija = new Item("Chemija", new Item("Cezis"), new Item("Radis"), new Item("Boras"));

		Item ukines = new Item("Ukines", new Item("Buitine chemija", valikliai, balikliai, chemija));

		/**
		 * Laisvailaikio
		 */
		Item lauko = new Item("Lauko", new Item("Slides"), new Item("Dviratis"), new Item("Meskere"));
		Item vidaus = new Item("Vidaus", new Item("Stalo futbolas"), new Item("Dartai"));

		Item laisvaliakio = new Item("Laisvaliakis", lauko, vidaus);

		/**
		 * Statybines
		 */
		Item staybines = new Item("Statybines", new Item("Cementas"));

		/**
		 * Katalogas (root)
		 * 
		 */
		Item katalogas = new Item("Prekes", ukines, staybines, laisvaliakio, new Item("Atvezimo paslauga"));

		PrekiuKatalogas pk = new PrekiuKatalogas();

		System.out.println("Pagal prekes pavadinima: " + pk.searchItem(katalogas, "bor"));

	}

	/**
	 * Randa pirma pasitaikiusi pagal paieskos teksta
	 * 
	 */
	public Item searchItem(Item item, String searchText) {

		if (isItContainsTheText(searchText, item.getName())) {
			return item;
		}

		for (Item child : item.getChilds()) {
			Item found = searchItem(child, searchText);
			if (found != null) {
				return found;
			}
		}
		return null;
	}

	/**
	 * Suskaiciuoja elementus pagal paieskos fraze
	 * 
	 * @param item       - kurioje sakoje ieskoma
	 * @param searchText - paieskos fraze
	 * @return kiekis
	 */
	public int countItems(Item item, String searchText) {
		// TODO #1
		return 0;
	}

	/**
	 * Suranda elementus pagal paieskos fraze
	 * 
	 * @param item       - kurioje sakoje ieskoma
	 * @param searchText - paieskos fraze
	 * @return elemntu sarasas
	 */
	public List<Item> searchAllElements(Item item, String searchText) {
		// TODO #2
		return null;
	}

	/**
	 * Grazina elemnto kategorijos kelia (path)
	 * 
	 * @param item       - kurioje sakoje ieskoma
	 * @param searchText - paieskos fraze
	 * @return kelias iki elemento
	 */
	public String getCategoryPath(Item item, String elementName) {
		// TODO #3
		return null;
	}

	private boolean isItContainsTheText(String searchText, String name) {
		return name.toLowerCase().contains(searchText.trim().toLowerCase());
	}

}
