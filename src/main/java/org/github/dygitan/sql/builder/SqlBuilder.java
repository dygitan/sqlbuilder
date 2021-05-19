package org.github.dygitan.sql.builder;

import org.github.dygitan.sql.builder.api.FromStatement;
import org.github.dygitan.sql.builder.api.impl.SimpleFromStatement;

public class SqlBuilder {

    private StringBuilder sqlBuilder = new StringBuilder();

    public FromStatement select(String... columns) {
        if(columns.length == 0) {
            throw new IllegalArgumentException("At least one column is required.");
        }

        sqlBuilder.append("SELECT ");

        for (int index = 0; index < columns.length; index++) {
            sqlBuilder.append(columns[index]);
            if (index + 1 < columns.length) {
                sqlBuilder.append(",");
            }
            sqlBuilder.append(" ");
        }

        return new SimpleFromStatement(sqlBuilder);
    }
}
