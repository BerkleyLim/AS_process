import entity.AS
import org.json.JSONArray
import java.util.Scanner
import org.json.JSONException
import org.json.JSONObject
import java.time.LocalDate
import java.time.ZonedDateTime
import java.util.Date

fun main() {
    // 아래는 입력 받는 값 : Java에서는 Scanner sc = new Scanner(System.in) 과 비슷
    // 결국 Java와 사용 비슷하다.
    val sc : Scanner = Scanner(System.`in`)

    println("AS 서비스 이용 전 인적사항을 먼저 확인합니다.")
    print("이름을 입력하세요.")
    val name : String = sc.nextLine()

    print("나이를 입력하세요.")
    val age : Int = sc.nextInt()
    sc.nextLine()

    print("휴대폰 번호 입력하세요. (- 제외)")
    val phoneNumber : String = sc.nextLine()


    println("******************************************************************")
    println(name + "(" + age + ") : " + phoneNumber + " 회원 환영합니다.")
    println("******************************************************************")
    println()

    val path = "/data/dataSample.json"

    // c언어 처럼 변수를 초기화 해줘야 함
//    var as_service : AS[] = AS(0,null,null,null,null,null,0,null,null, null,null)
    var as_service : Array<AS?> = arrayOfNulls<AS>(1)

    // json 파일 오픈
    as_service = loadJsonFile(path)

    // java랑 다르게 변수는 무조건 초기화 해줘야함
    for (index : Int in 0 until as_service.size) {
        println(as_service[index])
    }

    // 비즈니스 로직 부분
    while(true) {
        println("계속 하실려면 9 클릭, 종료 시 아무키나 클릭하여 주세요.")
        if (!readln().equals("9")) {
            break
        }
        println()
        println("******************************************************************")
        println("메뉴를 선택해 주세요. 1. 신청, 2. 조회, 3. 변경, 4. 취소")
        val menuNumber : Int = sc.nextInt();
        if (menuNumber == 1) {
            // 신청 메뉴
        } else if (menuNumber == 2) {
            // 조회 메뉴
        } else if (menuNumber == 3) {
            // 변경 메뉴
        } else if (menuNumber == 4) {
            // 취소 메뉴
        } else {
            // 메뉴 선택 잘 못 시
            println("메뉴를 잘 못 선택하였습니다.")
            println()
        }
    }
}

/**
 * (1)
 * loadJsonFile : 다음은 json 파일읇 불려오는 메서드 입니다.
 * parameter : 경로
 * return : as_service 값, json 파일을 AS 객체에 삽입합니다.
 */
fun loadJsonFile(
    path: String
):Array<AS?> {
    // call-by-reference 지원 하지 않아 여기서 지원 후, as_service 만 리턴
    var as_service : Array<AS?> = arrayOfNulls<AS>(1)

    // java와 다르게 변수는 무조건 초기화 해줘야 됨:
    var jsonArray = JSONArray();

    //https://www.techiedelight.com/ko/write-json-to-a-file-in-kotlin/
    try {
        // 파일 읽어오기
        fun getResourceAsText(path: String): String? =
            object {}.javaClass.getResource(path)?.readText()

        jsonArray = JSONArray(getResourceAsText(path))


        as_service = arrayOfNulls<AS?>(jsonArray.length())
//        println(jsonArray.length())
//        println(jsonArray.javaClass)

        for (index:Int in 0..(jsonArray.length()-1)) {
            var jsonObject = jsonArray.getJSONObject(index)

//            var as_temp : AS = AS(
//                jsonObject.getInt("no"),
//                jsonObject.getString("name"),
//                jsonObject.getString("phoneNumber"),
//                jsonObject.getString("asServiceNumber"),
//                jsonObject.getString("modelNumber"),
//                jsonObject.getString("impsbDesc"),
//                jsonObject.getInt("impsbCuzCd"),
//                jsonObject.getString("impsbCuz"),
//                LocalDate.parse(jsonObject.getString("preferDeliDate")),
//                LocalDate.parse(jsonObject.getString("receiptDate")),
//                LocalDate.parse(jsonObject.getString("prcsCpltDate"))
//            );

            // 다음은 as_service 를 각 json을 가공하여 AS 객체에 저장한다.
            as_service[index] = AS(
                jsonObject.getInt("no"),
                jsonObject.getString("name"),
                jsonObject.getString("phoneNumber"),
                jsonObject.getString("asServiceNumber"),
                jsonObject.getString("modelNumber"),
                jsonObject.getString("impsbDesc"),
                jsonObject.getInt("impsbCuzCd"),
                jsonObject.getString("impsbCuz"),
                LocalDate.parse(jsonObject.getString("preferDeliDate")),
                LocalDate.parse(jsonObject.getString("receiptDate")),
                LocalDate.parse(jsonObject.getString("prcsCpltDate"))
            )

        }
    } catch (e: Exception) {
        e.printStackTrace()

    }

    return as_service
}

