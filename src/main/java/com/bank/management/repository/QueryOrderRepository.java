package com.bank.management.repository;

import com.bank.management.entity.QueryOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QueryOrderRepository extends JpaRepository<QueryOrder, Long> {

}
