package com.lpzipo.tom.mybatis;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.*;

public class Test {

    public static void main(String[] args) {

        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(new File(""));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

    }
}
