package entity

import java.time.ZonedDateTime

// object 설정
data class AS(
    val no : Int,
    val name : String,
    val phoneNumber : String,
    val asServiceNumber : String,
    val modelNumber : String,
    val impsbDesc : String,
    val impsbCuzCd : Int,
    val impsbCuz : String,
    val preferDeliDate : ZonedDateTime,
    val receiptDate : ZonedDateTime,
    val prcsCpltDate : ZonedDateTime
)
