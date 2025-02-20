package onetomany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Bank {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String bank_name;
	private long Accountnumber;
	
	@ManyToOne
	PersonB person;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBank_name() {
		return bank_name;
	}

	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}

	public long getAccountnumber() {
		return Accountnumber;
	}

	public void setAccountnumber(long accountnumber) {
		Accountnumber = accountnumber;
	}

	public PersonB getPerson() {
		return person;
	}

	public void setPerson(PersonB person) {
		this.person = person;
	}
	
	
}
