package main.java.com.example.controller;

import com.example.portfolio.model.Contact;
import com.example.portfolio.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*") // allow requests from any origin (for local dev)
public class ContactController {

    @Autowired
    private ContactRepository contactRepository;

    // Save contact
    @PostMapping("/contact")
    public ResponseEntity<String> saveContact(@RequestBody Contact contact) {
        contactRepository.save(contact);
        return ResponseEntity.ok("Contact Saved Successfully!");
    }

    // Optional: List all contacts (admin)
    @GetMapping("/contacts")
    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }
}
