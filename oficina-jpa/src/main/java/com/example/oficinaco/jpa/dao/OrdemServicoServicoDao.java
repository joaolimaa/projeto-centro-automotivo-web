package com.example.oficinaco.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.oficinaco.jpa.model.OrdemServicoServico;

@Repository
public interface OrdemServicoServicoDao extends JpaRepository<OrdemServicoServico, Integer> {
}
