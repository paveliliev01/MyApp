package com.mentormate.restaurant.model.pojos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Table;
import javax.persistence.*;
import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id", nullable = false, insertable = true, updatable = true)
    private Integer orderId;

    @ManyToOne
    @JoinColumn(name = "table_id")
    private com.mentormate.restaurant.model.pojos.Table table;

    @ManyToOne
    @JoinColumn(name = "waiter_id")
    private User waiter;

    @ManyToOne
    @JoinColumn(name = "order_status")
    private OrderStatus orderStatus;

    @Column(name = "order_date", nullable = false)
    private Date orderDate;


}