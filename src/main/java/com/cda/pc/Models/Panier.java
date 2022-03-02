package entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Panier {


	private String user;
	private Collection<Computers>computers;
	private float price;
	
	
	public Panier() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Panier(String user, Collection<Computers> computers, float price) {
		super();
		this.user = user;
		this.computers = computers;
		this.price = price;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public Collection<Computers> getComputers() {
		return computers;
	}
	public void setComputers(Collection<Computers> computers) {
		this.computers = computers;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
}