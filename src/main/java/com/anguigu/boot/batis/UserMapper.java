package com.anguigu.boot.batis;

import com.anguigu.boot.bean.TUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;
@Mapper
public interface UserMapper{
    /**
     * 后台查询用户列表
     * @param user
     */
    @Select("select * from tuser")
    public List<TUser> userDetail() throws Exception ;
}
