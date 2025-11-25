package com.tcs.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service ( "business")
public class BusinessService {

   @Autowired
    MySQLRepository repository;

   public void callRepo(){
       repository.testConnection();
   }
    }

