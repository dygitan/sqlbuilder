package org.github.dygitan.sql.builder.api;

public interface WhereStatement extends SqlStatement {

    SqlStatement where(String condition);
}
