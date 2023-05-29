package com.example.Registration.repo;

import com.example.Registration.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorsRepo extends JpaRepository<Doctor, Long> {

}
