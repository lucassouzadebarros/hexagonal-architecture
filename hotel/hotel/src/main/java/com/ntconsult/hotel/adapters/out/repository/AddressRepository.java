package com.ntconsult.hotel.adapters.out.repository;

import com.ntconsult.hotel.adapters.out.repository.entity.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<AddressEntity, Long> {
}
