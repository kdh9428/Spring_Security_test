/*
 * package com.java.service;
 * 
 * import org.slf4j.Logger; import org.slf4j.LoggerFactory; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.security.access.prepost.PreAuthorize; import
 * org.springframework.security.core.userdetails.UserDetails; import
 * org.springframework.security.core.userdetails.UserDetailsService; import
 * org.springframework.security.core.userdetails.UsernameNotFoundException;
 * import org.springframework.stereotype.Service;
 * 
 * import com.java.dao.SecurityDao;
 * 
 * 
 * @Service public class SecurityService implements UserDetailsService { private
 * static final Logger logger = LoggerFactory.getLogger(SecurityService.class);
 * 
 * 
 * @PreAuthorize("#userVO.user_name == authentication.name or hasRole(‘ROLE_ADMIN')"
 * ) public void getUser(SecurityDao securityDao) { // 테스트를 위한 로그 출력
 * logger.info("getUser success"); } } }
 * 
 * @Autowired private AccountRepository accountRepository;
 * 
 * 
 * @Override public UserDetails loadUserByUsername(String username) throws
 * UsernameNotFoundException { // TODO Auto-generated method stub return null; }
 * }
 */
