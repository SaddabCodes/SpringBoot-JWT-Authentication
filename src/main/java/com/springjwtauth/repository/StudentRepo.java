package com.springjwtauth.repository;

import com.springjwtauth.model.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

//@Repository
public interface StudentRepo extends JpaRepository<StudentEntity, Long> {
}
