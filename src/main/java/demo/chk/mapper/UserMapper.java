package demo.chk.mapper;

import demo.chk.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Insert("insert into user(username,password) values (#{username},#{password})")
    void insertUser(@Param("username")String username, @Param("password") String password) throws Exception;

    @Select("select username from user where username=#{username} limit 1")
    User selectUser(@Param("username")String username);
}
