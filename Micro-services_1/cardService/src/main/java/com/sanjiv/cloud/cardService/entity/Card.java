package com.sanjiv.cloud.cardService.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Card {
	
	@Id
	private long id;
	private String cardHolderName;
	private String pan;
	private String validDate;
	
	public Card() {
		super();
	}
	public Card(Long id, String cardHolderName, String pan, String validDate) {
		super();
		this.id = id;
		this.cardHolderName = cardHolderName;
		this.pan = pan;
		this.validDate = validDate;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCardHolderName() {
		return cardHolderName;
	}
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public String getValidDate() {
		return validDate;
	}
	public void setValidDate(String validDate) {
		this.validDate = validDate;
	}
	
}
