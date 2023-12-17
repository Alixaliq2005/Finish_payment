package com.code.dto.response.transaction;

import com.code.model.TransactionType;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
@RequiredArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TransactionResponse {

    Long transactionId;

    @Enumerated(EnumType.STRING)
    TransactionType transactionType;

    private Double amount;

    private String senderName;

    private String receiverName;

    private String description;

}
