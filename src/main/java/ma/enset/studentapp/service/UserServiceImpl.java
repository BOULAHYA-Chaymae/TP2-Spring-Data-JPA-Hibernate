package ma.enset.studentapp.service;

import lombok.AllArgsConstructor;
import ma.enset.studentapp.entities.Role;
import ma.enset.studentapp.entities.User;
import ma.enset.studentapp.repository.RoleRepository;
import ma.enset.studentapp.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;
    private RoleRepository roleRepository;



    @Override
    public User addNewUser(User user) {
        user.setUserId((UUID.randomUUID().toString()));
        return userRepository.save(user);
    }

    @Override
    public Role addNewRole(Role role) {

        return roleRepository.save(role);
    }

    @Override
    public User findUserByUserName(String userName) {


        return userRepository.findByUsername(userName);
    }

    @Override
    public Role findUserByRoleName(String roleName) {

        return roleRepository.findByRoleName(roleName);
    }




    @Override
    public void addRoleToUser(String username, String roleName) {
        User user=findUserByUserName(username);
        Role role=findUserByRoleName(roleName);
        if(user.getRoles()!=null) {
            user.getRoles().add(role);
            role.getUsers().add(user);
        }
        //userRepository.save(user);

    }
}
