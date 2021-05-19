SqlBuilder is java library that tries to simplify writing plain, vanila sql queries in java.

#### Example
Instead of writing a code like
```
String sql = "SELECT column_a, column_b FROM table"
```
You can do
```
    new SqlBuilder()
        .select("column_a", "column_b")
        .build()
```

