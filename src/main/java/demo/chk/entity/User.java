package demo.chk.entity;

import demo.chk.common.BaseEntity;
import lombok.Data;

@Data
public class User extends BaseEntity{
    private String username;
    private String password;
}
