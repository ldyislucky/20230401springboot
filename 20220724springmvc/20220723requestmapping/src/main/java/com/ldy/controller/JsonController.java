package com.ldy.controller;

import com.ldy.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author : ldy
 * @version : 1.0
 */
@Controller
@RequestMapping("/json")
public class JsonController {
  @RequestMapping("listparamJson")
  @ResponseBody//将返回的对象自动转换为json
  public List listparamJson(@RequestBody List<String> list){//@RequestBody必须得加上
    System.out.println(list);
    return list;//将对象以json的格式响应到客户端  是@ResponseBody的功劳
  }

  @RequestMapping("pojoJson")
  @ResponseBody
  public User pojoJson(@RequestBody User user){//@RequestBody必须得加上
    System.out.println(user);
    return user;
  }

  @RequestMapping("pojoListJson")
  @ResponseBody
  public List pojoListJson(@RequestBody List<User> users){//@RequestBody必须得加上
    System.out.println(users);
    return users;
  }

}
