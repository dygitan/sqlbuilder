package org.github.dygitan.sql.builder.api.impl;

import org.github.dygitan.sql.builder.api.SqlStatement;
import org.github.dygitan.sql.builder.api.WhereStatement;

public class SimpleWhereStatement implements WhereStatement {

    private StringBuilder sqlBuilder;

    public SimpleWhereStatement(StringBuilder sqlBuilder) {
        this.sqlBuilder = sqlBuilder;
    }

    @Override
    public SqlStatement where(String condition) {
        sqlBuilder.append(" WHERE ");
        sqlBuilder.append(condition);
        return () -> sqlBuilder.toString();
    }

    @Override
    public String build() {
        return sqlBuilder.toString();
    }
}
