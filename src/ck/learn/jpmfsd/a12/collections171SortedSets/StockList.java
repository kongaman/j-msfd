package ck.learn.jpmfsd.a12.collections171SortedSets;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class StockList {
	
	private final Map<String, StockItem> list;

	public StockList() {
		this.list = new LinkedHashMap<>();
	}
	
	public int addStock(StockItem item) {
		if(item != null) {
			//Check if we already have quantities of this item
			StockItem inStock = list.getOrDefault(item.getName(), item);
			// if there are already stocks of this item adjust quantity
			if(inStock != item) { // if they are not the same (inStock comes from list) = item already is stocked
				item.adjustQuantity(inStock.quantityInStock());
			}
			list.put(item.getName(), item);
			return item.quantityInStock();
		}
		return 0;
	}
	
	public int sellStock(String item, int quantity) {
		StockItem inStock = list.getOrDefault(item, null);
		if((inStock != null) && (inStock.quantityInStock() >= quantity) && (quantity >0)) {
			inStock.adjustQuantity(-quantity);
			return quantity;
		}
		return 0;
	}
	
	public StockItem get(String key) {
		return list.get(key);
	}
	public Map<String, Double> Pricelist() {
		Map<String, Double> prices = new LinkedHashMap<>();
		for (Map.Entry<String, StockItem> item : list.entrySet()) {
			prices.put(item.getKey(), item.getValue().getPrice());
		}
		return Collections.unmodifiableMap(prices);
	}
	
	public Map<String, StockItem> Items() {
		return Collections.unmodifiableMap(list);
	}

	@Override
	public String toString() {
		String s = "\nStocklist:\n";
		double totalCost = 0.0;
		for (Map.Entry<String, StockItem> item : list.entrySet()) {
			StockItem stockItem = item.getValue();
			double itemValue = stockItem.getPrice() * stockItem.quantityInStock();
			s = s + stockItem + ". There are " + stockItem.quantityInStock() + " in stock. Value of items: ";
			s = s + String.format("%.2f", itemValue) + "\n";
			totalCost += itemValue;
		}
		return s + "Totals stock value: " + String.format("%.2f", totalCost);
	}
	
	
}
