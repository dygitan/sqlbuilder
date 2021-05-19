package org.github.dygitan.sql.builder.api.impl;

import org.github.dygitan.sql.builder.api.FromStatement;
import org.github.dygitan.sql.builder.api.SqlStatement;
import org.github.dygitan.sql.builder.api.WhereStatement;

public class SimpleFromStatement implements FromStatement {

    private StringBuilder sqlBuilder;

    public SimpleFromStatement(StringBuilder sqlBuilder) {
        this.sqlBuilder = sqlBuilder;
    }

    @Override
    public WhereStatement from(String table) {
        if (table == null || table.isEmpty()) {
            throw new IllegalArgumentException("From table is required.");
        }

        sqlBuilder.append("FROM ");
        sqlBuilder.append(table);

        return new SimpleWhereStatement(sqlBuilder);
    }
}
