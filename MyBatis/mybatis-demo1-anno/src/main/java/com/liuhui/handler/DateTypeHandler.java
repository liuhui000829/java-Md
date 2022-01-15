package com.liuhui.handler;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class DateTypeHandler extends BaseTypeHandler<Date>{
    // 将java类型转化成数据库需要的类型
    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, Date date, JdbcType jdbcType) throws SQLException {
        long dateTime = date.getTime();
        preparedStatement.setLong(i, dateTime);
    }

    // 将数据库中类型转化成java类型
    // String 参数 ,数据库中要转换的字段名称
    // ResultSet: 查出的结果集
    @Override
    public Date getNullableResult(ResultSet resultSet, String s) throws SQLException {
        // 获取结果集中需要的数据(long)转化成Date类型 返回
        long along = resultSet.getLong(s);
        return new Date(along);
    }

    // 将数据库中类型转化成java类型
    @Override
    public Date getNullableResult(ResultSet resultSet, int i) throws SQLException {
        long along = resultSet.getLong(i);
        return new Date(along);
    }

    // 将数据库中类型转化成java类型
    @Override
    public Date getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        long along = callableStatement.getLong(i);
        return new Date(along);
    }
}
