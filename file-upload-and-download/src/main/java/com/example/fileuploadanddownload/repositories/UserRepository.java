package com.example.fileuploadanddownload.repositories;

import com.example.fileuploadanddownload.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface UserRepository extends JpaRepository<User,Long> {
}
