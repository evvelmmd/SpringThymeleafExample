
package com.company.service;

import com.company.model.User;

import java.util.List;


public interface UserService {
    List<User> getAllUsers();
    void saveUser(User user);
    User getUserById(long id);
    void deleteUserById(long id);
//    Page<User> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}