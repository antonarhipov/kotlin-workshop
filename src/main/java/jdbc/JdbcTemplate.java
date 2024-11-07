package jdbc;

import org.jetbrains.annotations.Nullable;

import java.util.List;

public class JdbcTemplate {
    public <T> List<T> query(String sql, RowMapper<T> rowMapper) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public <T> List<T> query(String sql, RowMapper<T> rowMapper, @Nullable Object... args) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void someFunction(String a, String b) {

    }
}

