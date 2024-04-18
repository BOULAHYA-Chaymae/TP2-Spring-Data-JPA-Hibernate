package ma.enset.studentapp.service;

import ma.enset.studentapp.entities.Role;
import ma.enset.studentapp.entities.User;

public interface UserService {
    User addNewUser(User user);
    Role addNewRole(Role role);
    User findUserByUserName(String userName);
    Role findUserByRoleName(String roleName);
    void addRoleToUser(String username,String roleName);

}
