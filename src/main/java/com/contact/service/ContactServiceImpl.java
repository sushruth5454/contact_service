package com.contact.service;

import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService{
    List<Contact>list= List.of(
            new Contact(1L,"sushruth@gmail.com","sushruth",12L),
            new Contact(2L,"ramu@gmail.com","ramu",12L),
            new Contact(3L,"tada@gmail.com","tada",14L),
            new Contact(4L,"mami@gmail.com","mami",15L),
            new Contact(5L,"ramya@gmail.com","ramya",13L),
            new Contact(6L,"laxmi@gmail.com","laxmi",13L),
            new Contact(7L,"raju@gmail.com","raju",12L)

    );

    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
