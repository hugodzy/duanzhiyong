package com.itheima.phoneix;

import org.junit.Test;

import java.sql.*;

/**
 * description:
 *
 * @auther hugo
 * @date 2020/8/31 20:30
 */
public class PhoneixTest {
    @Test

    public void Phoneix() throws ClassNotFoundException, SQLException {
        Class.forName("org.apache.phoenix.jdbc.PhoenixDriver");

        Connection connection = DriverManager.getConnection("jdbc:phoenix:hadoop01:2181", "", "");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from \"dwd_order_detail\" limit 10 ");

        while(resultSet.next()) {
            String rowid = resultSet.getString("rowid");
            String ogId = resultSet.getString("ogId");
            String orderId = resultSet.getString("orderId");
            String goodsId = resultSet.getString("goodsId");
            String goodsNum = resultSet.getString("goodsNum");
            String goodsPrice = resultSet.getString("goodsPrice");
            String goodsName = resultSet.getString("goodsName");
            String shopId = resultSet.getString("shopId");
            String goodsThirdCatId = resultSet.getString("goodsThirdCatId");
            String goodsThirdCatName = resultSet.getString("goodsThirdCatName");
            String goodsSecondCatId = resultSet.getString("goodsSecondCatId");
            String goodsSecondCatName = resultSet.getString("goodsSecondCatName");
            String goodsFirstCatId = resultSet.getString("goodsFirstCatId");
            String goodsFirstCatName = resultSet.getString("goodsFirstCatName");
            String areaId = resultSet.getString("areaId");
            String shopName = resultSet.getString("shopName");
            String shopCompany = resultSet.getString("shopCompany");
            String cityId = resultSet.getString("cityId");
            String cityName = resultSet.getString("cityName");
            String regionId = resultSet.getString("regionId");
            String regionName = resultSet.getString("regionName");

            System.out.print(rowid);
            System.out.print(ogId);
            System.out.print(orderId);
            System.out.print(goodsId);
            System.out.print(goodsNum);
            System.out.print(goodsPrice);
            System.out.print(goodsName);
            System.out.print(shopId);
            System.out.print(goodsThirdCatId);
            System.out.print(goodsThirdCatName);
            System.out.print(goodsSecondCatId);
            System.out.print(goodsSecondCatName);
            System.out.print(goodsFirstCatId);
            System.out.print(goodsFirstCatName);
            System.out.print(areaId);
            System.out.print(shopName);
            System.out.print(shopCompany);
            System.out.print(cityId);
            System.out.print(cityName);
            System.out.print(regionId);
            System.out.print(regionName);
            System.out.println();
        }

        resultSet.close();
        statement.close();
        connection.close();
    }
}

