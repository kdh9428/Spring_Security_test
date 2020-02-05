/*
 * package com.java.dao;
 * 
 * import java.sql.ResultSet; import java.sql.SQLException; import
 * java.util.List;
 * 
 * import org.slf4j.Logger; import org.slf4j.LoggerFactory; import
 * org.springframework.jdbc.core.RowMapper; import
 * org.springframework.security.core.authority.AuthorityUtils; import
 * org.springframework.security.core.userdetails.User; import
 * org.springframework.security.core.userdetails.UserDetails; import
 * org.springframework.security.core.userdetails.jdbc.JdbcDaoImpl;
 * 
 * 
 * public class SecurityDao extends JdbcDaoImpl{
 * 
 * private static final Logger logger =
 * LoggerFactory.getLogger(SecurityDao.class);
 * 
 * @Override protected List<UserDetails> loadUsersByUsername(String username) {
 * String crcCode = String.valueOf(new Crc32().getCode(username)); return
 * getJdbcTemplate().query(getUsersByUsernameQuery(), new String[] { crcCode,
 * username }, new RowMapper<UserDetails>() { public UserDetails
 * mapRow(ResultSet rs, int rowNum) throws SQLException { String username =
 * rs.getString(1); String password = rs.getString(2); boolean enabled =
 * rs.getBoolean(3); return new User(username, password, enabled, true, true,
 * true, AuthorityUtils.NO_AUTHORITIES); } }); } }
 */