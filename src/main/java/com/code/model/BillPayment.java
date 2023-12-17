package com.code.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;


@Getter
@Setter
@Entity
@Data
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
public class BillPayment {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long billId;

	private BillType billtype;

	private TransactionType transactionType;

	private Double amount;

	private Long walletId;

}
