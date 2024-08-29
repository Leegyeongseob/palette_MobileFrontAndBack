package com.kh.Palette_BackEnd.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name="payment_tema_TB")
public class PaymentTemaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String paymentId;
    private String orderName;
    private int totalAmount;
    private String customerName;
    private String customerPhone;
    private String customerEmail;
    private String status;

    // 커플모두 볼수 있어야함. 저장 데이터 불러오기
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.REMOVE)
    @JoinColumn(name = "couple_id")
    private CoupleEntity couple;
}
