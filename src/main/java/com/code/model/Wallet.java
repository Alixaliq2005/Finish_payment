package com.code.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import lombok.*;
import java.util.List;

@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
@Data
public class Wallet {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String walletName;

	private Double balance;

	@OneToOne(cascade = CascadeType.ALL)
	private Customer customer;

	@OneToMany
	@JsonIgnore
	private List<Transaction> transaction;

	@OneToMany
	@JsonIgnore
	private List<BillPayment> billPayments;

	@OneToMany
	@JsonIgnore
	private List<BeneficiaryDetail> beneficiaryDetails;

	public Long getWalletId() {
        return null;
    }
}
