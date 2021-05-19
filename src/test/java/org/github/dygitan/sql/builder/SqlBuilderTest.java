package org.github.dygitan.sql.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SqlBuilderTest {

    @Test
    public void verify_simple_select_query() {
        assertEquals("SELECT column_a, column_b FROM table_a", new SqlBuilder()
                .select("column_a", "column_b")
                .from("table_a")
                .build());
    }

    @Test
    public void verify_simple_select_query_no_column_selected() {
        assertThrows(IllegalArgumentException.class, () -> new SqlBuilder()
                .select()
                .from("table_a")
                .build());
    }

    @Test
    public void verify_simple_select_query_no_from_table() {
        assertThrows(IllegalArgumentException.class, () -> new SqlBuilder()
                .select("column_a", "column_b")
                .from(null)
                .build());
    }

    @Test
    public void verify_simple_select_query_with_where() {
        assertEquals("SELECT column_a, column_b FROM table_a WHERE column_a > 100", new SqlBuilder()
                .select("column_a", "column_b")
                .from("table_a")
                .where("column_a > 100")
                .build());
    }
}