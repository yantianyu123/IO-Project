package com.yan.mapper;

import com.yan.entity.User;
import org.apache.ibatis.annotations.Delete;

/**
 * @author 闫天宇
 * @date 2019/7/3-10:15
 */
public interface UserMapper {
    //根据id查询
    public User getUserById(int id);
    //根据id删除
    @Delete("delete from users where id = #{id}")
    public void deleteUserById(int id);
}
