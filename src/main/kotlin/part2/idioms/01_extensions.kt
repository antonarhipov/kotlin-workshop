package part2.idioms

import jdbc.JdbcTemplate
import jdbc.RowMapper

//
//import jdbc.JdbcTemplate
//import jdbc.RowMapper
//
data class Message(val id: String?, val text: String)

fun main() {

    val db = JdbcTemplate()

    db.query("select * from messages") { rs, _ ->
        Message(rs.getString("id"), rs.getString("text"))
    }

    db.query(
        "select * from messages where id = ?",
        RowMapper { rs, _ ->
            Message(rs.getString("id"), rs.getString("text"))
        },
        123
    )

}

