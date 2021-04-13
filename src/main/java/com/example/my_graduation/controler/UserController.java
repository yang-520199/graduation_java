package com.example.my_graduation.controler;

import com.example.my_graduation.mapper.UserMapper;
import com.example.my_graduation.model.LoginVO;
import com.example.my_graduation.model.Result;
import com.example.my_graduation.model.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
@CrossOrigin
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/test")
    @ResponseBody
    public List test(){
        List<User> list=userMapper.findAll();
        System.out.println(list.get(0).getU_sex().getClass());

        System.out.println("fadfdafsd");
        return list;
    }
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public Result login(@RequestHeader Map<String,Object> he, @RequestBody Map<String,Object> par  )throws JsonProcessingException {
        System.out.println(he);
        String username=(String)par.get("username");
        String password=(String)par.get("password");
        Result result=new Result();
        User user=new User();
        user=userMapper.findByName(username);
        if (user.getU_name().equals(username)&&user.getU_password().equals(password)){
            result.setCode(200);
        }else {
            result.setCode(400);
            result.setMessage("用户名或者密码错误！");
        }

        System.out.println(username);
        LoginVO loginVO=new LoginVO();
        loginVO.setId(user.getU_id());
        loginVO.setToken(UUID.randomUUID().toString());
        loginVO.setUser(user);
        result.setData(loginVO);
//        HashMap<String,Object> hs=new HashMap<>();
//        hs.put("token","token"+username+password);
//        ObjectMapper objectMapper=new ObjectMapper();
//        return objectMapper.writeValueAsString(hs);
        return result;
    }
    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    @ResponseBody
    public Result addUser(@RequestBody User user) throws JsonProcessingException{
       Result result=new Result();
        System.out.println(user.getU_name());
        userMapper.addUser(user);
        result.setCode(200);
        result.setMessage("成功添加用户");
        return result;
    }

}
