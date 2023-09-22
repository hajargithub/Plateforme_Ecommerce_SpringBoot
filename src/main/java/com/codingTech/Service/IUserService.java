package com.codingTech.Service;
import com.codingTech.entity.User;

public interface IUserService {
    public User ajouterUser(User u);
    public User chercherParEmail(String email);
}
