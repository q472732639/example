package com.watchcat.orm.utils.db;

import java.util.LinkedList;

/**
 *
 * @author Lv15
 */
public class Table {

    private String entityName;

    private String tableName;

    private String comment;

    private final LinkedList<Column> columns = new LinkedList<Column>();

    public LinkedList<Column> getColumns() {
        return columns;
    }

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public static class Column {

        private boolean pk = false;

        private String columnName;

        private String propertyName;

        private String columnType;

        private int length;

        private String comment;

        private boolean increment = false;

        private boolean notNull = false;

        public boolean isPk() {
            return pk;
        }

        public void setPk(boolean pk) {
            this.pk = pk;
        }

        public String getColumnName() {
            return columnName;
        }

        public void setColumnName(String columnName) {
            this.columnName = columnName;
        }

        public String getPropertyName() {
            return propertyName;
        }

        public void setPropertyName(String propertyName) {
            this.propertyName = propertyName;
        }

        public String getColumnType() {
            return columnType;
        }

        public void setColumnType(String columnType) {
            this.columnType = columnType;
        }

        public int getLength() {
            return length;
        }

        public void setLength(int length) {
            this.length = length;
        }

        public String getComment() {
            return comment;
        }

        public void setComment(String comment) {
            this.comment = comment;
        }

        public boolean isIncrement() {
            return increment;
        }

        public void setIncrement(boolean increment) {
            this.increment = increment;
        }

        public boolean isNotNull() {
            return notNull;
        }

        public void setNotNull(boolean notNull) {
            this.notNull = notNull;
        }

    }

}
