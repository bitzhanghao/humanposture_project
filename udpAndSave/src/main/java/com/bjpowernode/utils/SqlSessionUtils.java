package com.bjpowernode.utils;

// 这个工具类是必须要随时会写的！
// 注意还没有测试
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlSessionUtils
{
    private static SqlSessionFactory factory = null;
    static
    {
        String config="mybatis-config.xml"; // 需要和你的项目中的文件名一样
        InputStream in = null;
        try
        {
            in = Resources.getResourceAsStream(config);
            //创建SqlSessionFactory对象，使用SqlSessionFactoryBuild
            factory = new SqlSessionFactoryBuilder().build(in);
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    private static ThreadLocal<SqlSession> t = new ThreadLocal<>();

    public static SqlSession getSqlSession()
    {
        SqlSession session = t.get();
        if(session == null)
        {
            session = factory.openSession();
            t.set(session);
        }
        return session;
    }

    public static void close(SqlSession session)
    {
        if(session !=null)
        {
            session.close();
            t.remove();
        }
    }
}

