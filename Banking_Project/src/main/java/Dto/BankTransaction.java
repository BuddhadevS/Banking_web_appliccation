package Dto;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BankTransaction {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int tid;
	
	double deposit;
	
	double withdraw;
	
	double balance;
	
	LocalDateTime date_time;

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public double getDeposit() {
		return deposit;
	}

	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}

	public double getWithdraw() {
		return withdraw;
	}

	public void setWithdraw(double withdraw) {
		this.withdraw = withdraw;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public LocalDateTime getDate_time() {
		return date_time;
	}

	public void setDate_time(LocalDateTime date_time) {
		this.date_time = date_time;
	}
	

}
