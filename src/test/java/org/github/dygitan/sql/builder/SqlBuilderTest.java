package org.github.dygitan.sql.builder;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertThrows;

public class SqlBuilderTest {

    @Test
    public void verify_simple_select_query() {
        assertThat(new SqlBuilder()
                .select("column_a", "column_b")
                .from("table_a")
                .build())
                .isEqualTo("SELECT column_a, column_b FROM table_a");
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
}