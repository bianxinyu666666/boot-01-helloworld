package com.anguigu.boot.Service;

        import com.anguigu.boot.bean.TUser;

        import java.util.List;

public interface UserService {
    /**
     * 后台查询用户列表
     * @param user
     */
    public List<TUser> userDetail() throws Exception;
}
