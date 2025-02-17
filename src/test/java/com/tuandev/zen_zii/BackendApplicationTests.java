package com.tuandev.zen_zii;
import com.tuandev.zen_zii.mapper.UserMapper;
import com.tuandev.zen_zii.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BackendApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void getAll(){
        List<User> users = userMapper.getAllUsers();
        System.out.println(users.toString());
    }

    @Test
    public void getUserById(){
        User user = userMapper.getUserById(1);
        System.out.println(user.toString());
    }

}
