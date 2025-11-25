package com.tcs.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("repository")
public class MySQLRepository {
    @Autowired
    Connection connection;

    public void testConnection(){
        System.out.println(connection.getConnection());}

}
