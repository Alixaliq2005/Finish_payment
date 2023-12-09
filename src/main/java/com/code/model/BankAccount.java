package com.code.model;

import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Getter
@Setter
@Entity
@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Table(name = "account")
public class BankAccount {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer accountNumber;

	@NotNull
	@Size(min = 10, max = 10)
	@Pattern(regexp = "[6-9][0-9]{9}", message = "Mobile number must have 10 digits mobile Number")
	private String mobileNumber;

	private String bankName;

	private double bankBalance;

	private Integer walletId;

}

//we have entity for bank account which includes id, mobile number, bankName, balance and wallet id for to
// create bank