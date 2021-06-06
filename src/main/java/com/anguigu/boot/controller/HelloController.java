package com.anguigu.boot.controller;

import com.anguigu.boot.Service.UserService;
import com.anguigu.boot.bean.TUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

//@Controller
//@ResponseBody
@Slf4j
@RestController         //相当于 @Controller、@ResponseBody的合体
public class HelloController {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    public UserService userService;

    /**
     * 整合mybatis查询数据
     * @return users
     */
    @GetMapping("/hello")
    public List<TUser> hello() {
        List<TUser> users = null;
        try{
            users = userService.userDetail();
        }catch (Exception e){
            log.info("数据库查询报错");
        }
        return users;
    }


    /**
     * 使用jdbcTemplate查询数据
     * @return  list
     */
    //@RequestMapping(value = "/getUsers", method = RequestMethod.GET)
    @GetMapping("/getUsers")
    public List<Map<String, Object>> getDbType(){
        String sql = "select * from tuser";
        List<Map<String, Object>> list =  jdbcTemplate.queryForList(sql);
        for (Map<String, Object> map : list) {
            Set<Map.Entry<String, Object>> entries = map.entrySet( );
            if(entries != null) {
                Iterator<Map.Entry<String, Object>> iterator = entries.iterator( );
                while(iterator.hasNext( )) {
                    Map.Entry<String, Object> entry =(Map.Entry<String, Object>) iterator.next( );
                    Object key = entry.getKey( );
                    Object value = entry.getValue();
                    System.out.println(key+":"+value);
                }
            }
        }
        return list;
    }
}
