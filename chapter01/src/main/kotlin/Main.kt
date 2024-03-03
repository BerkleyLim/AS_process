package org.example

import java.util.Scanner

fun main() {
    // 아래는 입력 받는 값 : Java에서는 Scanner sc = new Scanner(System.in) 과 비슷
    // 결국 Java와 사용 비슷하다.
    var sc : Scanner = Scanner(System.`in`)

    var str1 : String = sc.nextLine()
    var str2 : String = sc.nextLine()

//    println("Hello World!")
    println(str1 + ' ' + str2)
}