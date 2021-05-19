SqlBuilder is java library that tries to simplify writing plain, vanila sql queries in java.

#### Example
Instead of writing a code like
```
String sql = "SELECT column_a, column_b FROM table WHERE column_a > 100"
```
You can do
```
    new SqlBuilder()
        .select("column_a", "column_b")
        .from("table")
        .where("column_a > 100")
        .build()
```

