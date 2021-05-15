package yaksha;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Purchase implements Comparable<Object> {
	private long id;
	private Date purchaseDate;
	private double totalAmount;
	private String user;

	public Purchase(long id, Date purchaseDate, double totalAmount, String user) {
		super();
		this.id = id;
		this.purchaseDate = purchaseDate;
		this.totalAmount = totalAmount;
		this.user = user;
	}

	public Purchase() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return null;
	}

	static Purchase obtainPurchaseWithAmount(String str) {
		
		return null;
	}

	@Override
	public int compareTo(Object arg0) {
		return 0;
	}
}
