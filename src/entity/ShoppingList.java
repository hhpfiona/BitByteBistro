package entity;

import java.time.LocalDateTime;

public class ShoppingList {
	
	private final String listOwner;
	private String shoppingListName; // changed the name of this
	private List<Grocery> listItems;
	private final LocalDateTime creationDate;
	private String listStatus;
	private Float estimatedTotalCost;

	/**
	 * Requires:
	 * @param listOwner
	 * @param shoppingListName
	 * @param listItems
	 */
	ShoppingList(String listOwner, String shoppingListName, List<Grocery> listItems) {
		this.listOwnder = listOwner;
		this.shoppingListName = shoppingListName 
		this.listItems = listItems;
		this.creationDate = creationDate;
		this.listStatus = 'in progress';
		this.estimatedTotalCost = 0.00; // TODO: implement method to compute this
	}

	public String getListOwner() {
		return userID;
	}

	public String setListOwner(String listOwner) {
		this.listOwner = listOwner;
	}

	public String getShoppingListName() {
		return shoppingListName;
	}

	public void setShoppingListName(String shoppingListName) {
		this.shoppingListName = shoppingListName;
	}

	public List<Grocery> getListItems() {
		return getListItems;
	}

	public void setListItems(List<Grocery> listItems) {
		this.listItems = listItems;
	}

	public LocalDateTime getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDateTime creationDate) {
		this.creationDate = creationDate
	}

	public String getListStatus() {
		return listStatus;
	}

	public void setListStatus(String listStatus) {
		this.listStatus = listStatus;
	}

	public Float getEstimatedTotalCost() {
		return estimatedTotalCost;
	}

	public void setEstimatedTotalCost(Float estimatedTotalCost) {
		this.estimatedTotalCost = estimatedTotalCost;
	}
}