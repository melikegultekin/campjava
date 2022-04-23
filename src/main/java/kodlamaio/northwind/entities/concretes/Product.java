package kodlamaio.northwind.entities.concretes;

public class Product {
       private int id;
       private int categoryId;
       private String productName;
       private double unitPrice;
       private short unitInStock;
       private String quantityPerUnit;
	public Product(int id, int categoryId, String productName, double unitPrice, short unitInStock,
			String quantityPerUnit) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.productName = productName;
		this.unitPrice = unitPrice;
		this.unitInStock = unitInStock;
		this.quantityPerUnit = quantityPerUnit;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public short getUnitInStock() {
		return unitInStock;
	}
	public void setUnitInStock(short unitInStock) {
		this.unitInStock = unitInStock;
	}
	public String getQuantityPerUnit() {
		return quantityPerUnit;
	}
	public void setQuantityPerUnit(String quantityPerUnit) {
		this.quantityPerUnit = quantityPerUnit;
	}
	
}
