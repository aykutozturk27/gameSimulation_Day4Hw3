package Entities;

import Abstract.IEntity;

public class Sales implements IEntity {
	int salesPrice;
    int salesAmount;
    
	public Sales() {
		
	}

	public Sales(int salesPrice, int salesAmount) {
		this.salesPrice = salesPrice;
		this.salesAmount = salesAmount;
	}

	public int getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(int salesPrice) {
		this.salesPrice = salesPrice;
	}

	public int getSalesAmount() {
		return salesAmount;
	}

	public void setSalesAmount(int salesAmount) {
		this.salesAmount = salesAmount;
	}
}
