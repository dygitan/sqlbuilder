package org.github.dygitan.sql.builder.api;

public interface FromStatement {

    WhereStatement from(String table);
}
