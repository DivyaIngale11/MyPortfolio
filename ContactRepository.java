package main.java.com.example.repository;

import com.example.portfolio.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
    // Basic CRUD methods are provided by JpaRepository
}
