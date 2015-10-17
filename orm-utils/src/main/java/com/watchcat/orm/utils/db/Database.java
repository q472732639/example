/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.watchcat.orm.utils.db;

import java.sql.Connection;
import java.sql.ResultSetMetaData;
import java.util.List;

/**
 *
 * @author Lv15
 */
public interface Database {

    public Table getTable(String name);

    public List<Table> scanTables(String... name);

    public Type getType();

    public static enum Type {

        MySQL,
    }

}

class DatabaseFactory {

    public static Database getDatabase(String driverClass, String url, String username, String password) {
        return null;
    }

}

class MySQL implements Database {

    private final Connection conn;

    public MySQL(String driverClass, String url, String username, String password) {
        try {
            Class.forName(driverClass);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        ResultSetMetaData meta;
        conn = null;
    }

    @Override
    public Table getTable(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Table> scanTables(String... name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Type getType() {
        return Type.MySQL;
    }

}
