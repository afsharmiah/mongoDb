package MobileApps.MobileApps.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "List of Mobile")
public class Mobile {
	private int id;
	private String brand;
	private String mobileModel;
	private int price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getMobileModel() {
		return mobileModel;
	}

	public void setMobileModel(String mobileModel) {
		this.mobileModel = mobileModel;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Mobile(int id, String brand, String mobileModel, int price) {
		super();
		this.id = id;
		this.brand = brand;
		this.mobileModel = mobileModel;
		this.price = price;
	}

	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}

}
