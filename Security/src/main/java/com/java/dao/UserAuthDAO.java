package com.java.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("userAuthDAO")
public class UserAuthDAO {
    
    @Autowired
    private SqlSessionTemplate sqlSession;
 
    public CustomUserDetails getUserById(String username) {
        return sqlSession.selectOne("selectUserById", username);
    }
 
}


