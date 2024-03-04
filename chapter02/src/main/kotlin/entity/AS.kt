package entity

import java.time.ZonedDateTime

// object 설정
data class AS(
    var no : Int?,
    var name : String?,
    var phoneNumber : String?,
    var asServiceNumber : String?,
    var modelNumber : String?,
    var impsbDesc : String?,
    var impsbCuzCd : Int?,
    var impsbCuz : String?,
    var preferDeliDate : ZonedDateTime?,
    var receiptDate : ZonedDateTime?,
    var prcsCpltDate : ZonedDateTime?
) {
    override fun toString(): String {
        return "AS(no=$no, name=$name, phoneNumber=$phoneNumber, asServiceNumber=$asServiceNumber, modelNumber=$modelNumber, impsbDesc=$impsbDesc, impsbCuzCd=$impsbCuzCd, impsbCuz=$impsbCuz, preferDeliDate=$preferDeliDate, receiptDate=$receiptDate, prcsCpltDate=$prcsCpltDate)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as AS

        if (no != other.no) return false
        if (name != other.name) return false
        if (phoneNumber != other.phoneNumber) return false
        if (asServiceNumber != other.asServiceNumber) return false
        if (modelNumber != other.modelNumber) return false
        if (impsbDesc != other.impsbDesc) return false
        if (impsbCuzCd != other.impsbCuzCd) return false
        if (impsbCuz != other.impsbCuz) return false
        if (preferDeliDate != other.preferDeliDate) return false
        if (receiptDate != other.receiptDate) return false
        if (prcsCpltDate != other.prcsCpltDate) return false

        return true
    }

    override fun hashCode(): Int {
        var result = no ?: 0
        result = 31 * result + (name?.hashCode() ?: 0)
        result = 31 * result + (phoneNumber?.hashCode() ?: 0)
        result = 31 * result + (asServiceNumber?.hashCode() ?: 0)
        result = 31 * result + (modelNumber?.hashCode() ?: 0)
        result = 31 * result + (impsbDesc?.hashCode() ?: 0)
        result = 31 * result + (impsbCuzCd ?: 0)
        result = 31 * result + (impsbCuz?.hashCode() ?: 0)
        result = 31 * result + (preferDeliDate?.hashCode() ?: 0)
        result = 31 * result + (receiptDate?.hashCode() ?: 0)
        result = 31 * result + (prcsCpltDate?.hashCode() ?: 0)
        return result
    }
}
