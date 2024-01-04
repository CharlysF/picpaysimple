package com.picpaysimple.domain.user.transaction;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.apache.catalina.User;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity(name = "transactions")
@Table
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private BigDecimal amount;

    @ManyToOne
    @JoinColumn(name = "sender_id")
    private User sender;

    @JoinColumn(name = "receiver_id")
    private User receiver;
    private LocalDateTime timestampt;
}
