package com.example.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;
import com.example.domain.Administrator;

@Repository
public class AdministratorRepository {

    @Autowired
    private NamedParameterJdbcTemplate template;

    private static final RowMapper<Administrator> ADMINISTRATOR_ROW_MAPPER = (rs, i) -> {
        Administrator administrator = new Administrator();
        administrator.setId(rs.getInt("id"));
        administrator.setName(rs.getString("name"));
        administrator.setMailAddress(rs.getString("mail_address"));
        administrator.setPassword(rs.getString("password"));
        return administrator;
    };

    /**
     * 
     * 管理者情報を挿入する
     * 
     */

    public void save(Administrator administrator) {

        SqlParameterSource param = new BeanPropertySqlParameterSource(administrator);
        if (administrator.getId() == null) {
            String sqlInsert = "INSERT INTO administrators(name, mail_address, password)"
                    + " VALUES(:name,:mailAddress,:password)";
            template.update(sqlInsert, param);
        } else {
            String upDateSql = "UPDATE administrators SET id=:id,name=:name,mail_address=:mailAddress,password=:password";
            template.update(upDateSql, param);
        }

    }

    /**
     * 全権検索をする
     */

    public List<Administrator> findAll(Administrator administrator) {
        String findAllSql = "SELECT id,name,mail_address,password FROM administrators";
         
        SqlParameterSource param = new BeanPropertySqlParameterSource(administrator);

        List<Administrator> administratorList = template.query(findAllSql, param, ADMINISTRATOR_ROW_MAPPER);
        if (administratorList.size() == 0) {
            return null;
        }
        return administratorList;
    }
}
