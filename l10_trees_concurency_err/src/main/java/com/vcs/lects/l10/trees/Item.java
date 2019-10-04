package com.vcs.lects.l10.trees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Item {

	private String name;

	private List<Item> childs = new ArrayList<Item>();

	public Item(String name, Item... childs) {
		this.name = name;
		this.childs.addAll(Arrays.asList(childs));
	}

	public List<Item> getChilds() {
		return childs;
	}

	public void setChilds(List<Item> childs) {
		this.childs = childs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isLeaf() {
		return childs.size() == 0;
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ", last=" + isLeaf() + "]";
	}

}
