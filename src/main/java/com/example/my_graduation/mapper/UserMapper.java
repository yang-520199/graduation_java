package com.example.my_graduation.mapper;
import java.util.List;
import com.example.my_graduation.model.*;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
@Mapper
@Repository
public interface UserMapper {
    List<User> findAll();
    void  addUser(User user);
    User findByName(String u_name);


}
