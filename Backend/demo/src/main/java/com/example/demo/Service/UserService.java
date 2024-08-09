package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.User;
import com.example.demo.Service.UserService;
import com.example.demo.repository.UserRepository;

@Service
public class UserService
 {
    @Autowired
    UserRepository repo;

    public User edit(User user)
    {
        return repo.save(user);
    }
    public User register(User user)
    {
        return repo.save(user);
    }
    public List<User> login()
    {
       return repo.findAll();
    }
    public void deleteId(Long id)
    {
        repo.deleteById(id);
    }
}