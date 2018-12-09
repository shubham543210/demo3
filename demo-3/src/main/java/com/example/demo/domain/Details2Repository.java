package com.example.demo.domain;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.beans.Details2;

public interface Details2Repository extends JpaRepository<Details2,String>,Details2RepositoryCustom{

	public List<Details2> findByPropertyLid(int lid);
}
