package com.lpzipo.dao.intercept;

import com.mysql.jdbc.Connection;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;

import java.util.Properties;

/**
 * 分页拦截器
 *
 * 看MyInterceptor类上我们用@Intercepts标记了这是一个Interceptor，然后在@Intercepts中定义了两个@Signature，即两个拦截点。
 * 第一个@Signature我们定义了该Interceptor将拦截Executor接口中参数类型为MappedStatement、Object、RowBounds和ResultHandler
 * 的query方法；第二个@Signature我们定义了该Interceptor将拦截StatementHandler中参数类型为Connection的prepare方法。
 *
 */
@Intercepts( {
        @Signature(method = "query", type = Executor.class, args = {
                MappedStatement.class, Object.class, RowBounds.class,
                ResultHandler.class }),
        @Signature(method = "prepare", type = StatementHandler.class, args = { Connection.class }) })
public class PageInterceptor implements Interceptor {


    public Object intercept(Invocation invocation) throws Throwable {
        //插入sql
        return  null;
    }

    /***
     * plugin方法是拦截器用于封装目标对象的，通过该方法我们可以返回目标对象本身
     * Plugin的类，里面有一个静态方法wrap(Object target,Interceptor interceptor)，通过该方法可以决定要返回的对象是目标对象还是对应的代理
     * @param o
     * @return
     */
    public Object plugin(Object o) {
        return Plugin.wrap(o,this);
    }

    public void setProperties(Properties properties) {

    }
}
