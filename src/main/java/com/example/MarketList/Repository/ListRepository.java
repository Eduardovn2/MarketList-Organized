package com.example.MarketList.Repository;

import com.example.MarketList.Entity.MarketListEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListRepository extends JpaRepository<MarketListEntity, Long> {
}
