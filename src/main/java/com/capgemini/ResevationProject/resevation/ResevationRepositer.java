package com.capgemini.ResevationProject.resevation;

import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

interface ResevationRepositery extends JpaRepository<Resevation, Long> {
}
