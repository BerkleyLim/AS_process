import entity.AS
import java.util.Scanner
import org.json.JSONException
import org.json.JSONObject
import java.io.File
import java.io.FileWriter
import java.io.PrintWriter
import java.nio.charset.Charset

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
    val json = JSONObject();

    //https://www.techiedelight.com/ko/write-json-to-a-file-in-kotlin/
    try {
//       File file = new File(path);

    } catch (e: Exception) {
        e.printStackTrace()
    }

    val as_service : AS = AS(0,null,null,null,null,null,0,null,null, null,null)

//    println(as_service.toString())

    as_service.name = "홍길동"

    println(as_service.toString())

    // 비즈니스 로직 부분
    while(true) {
        println("계속 하실려면 9 클릭, 종료 시 아무키나 클릭하여 주세요.")
        if (!readln().equals("9")) {
            break
        }
        println()
        println("******************************************************************")
        println("메뉴를 선택해 주세요. 1. 신청, 2. 조회, 3. 변경, 4. 취소")
        var menuNumber : Int = sc.nextInt();
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


