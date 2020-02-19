package com.example.demo.enitity;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="cscore")
public class CibilScore {
	@Id
	private int panId;
	@Column(name="card_HolderName") 
	private String cardHolderName;
	@Column(name="pin_code") 
	private long pincode;
}
