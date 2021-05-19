package org.github.dygitan.sql.builder.api.impl;

import org.github.dygitan.sql.builder.api.FromStatement;
import org.github.dygitan.sql.builder.api.SqlStatement;

public class SimpleFromStatement implements FromStatement {

    private StringBuilder sqlBuilder;

    public SimpleFromStatement(StringBuilder sqlBuilder) {
        this.sqlBuilder = sqlBuilder;
    }

    @Override
    public SqlStatement from(String table) {
        if (table == null || table.isEmpty()) {
            throw new IllegalArgumentException("From table is required.");
        }

        return () -> sqlBuilder.append("FROM ").append(table).toString();
    }
}
