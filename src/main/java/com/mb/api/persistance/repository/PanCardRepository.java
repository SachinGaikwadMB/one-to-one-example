package com.mb.api.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.mb.api.persistance.entity.PanCard;

@Repository
public interface PanCardRepository extends JpaRepository<PanCard, Integer>
{
	PanCard findByPanId(Integer panId);
}
