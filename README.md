# AS_process

- AS 처리 알고리즘 및 앱 개발을 위한 Repository
- 실제 SI 프로젝트 및 서비스 기업에서 일한다고 가정하에 작업을 진행한다.
- 설계 및 기획 연습까지 하여 알고리즘을 구성하여 개발 숙련도를 올린다.
- 여기서 웹 환경 및 앱 환경에서까지 적용을 해보자.

<br/><br/>


## 요구사항 


<h3> TV AS 서비스 </h3>
<br/>

- 다음은 AS 서비스를 받고자 한다.
- 고객 마다 찾아오는 유형은 각각 다른데 A고객은 AS 신청 이력 조회를 하고 싶고, B고객은 AS 신청 내역을 변경하고 싶어 한다. C고객은 AS건 취소를 원하고 D고객은 AS 신청을 하고 싶다.

<br/>

- 따라서 메뉴는 “신청”, “조회”, “변경”, “취소”  총 4가지로 구분되어 있다. 따라서 고객이 원하는 서비스 각 기능을 구현해야 합니다.
- 서비스 진행 전 본인의 인적사항이 필요합니다.
- 기본 인적사항은 “이름”, “나이”, “휴대폰번호" 를 입력 받고 AS 서비스를 진행하기 위해 AS 번호가 필요합니다.

1) 신청인 경우
> - 입력 값 : 이름, 나이, 휴대폰번호, 모델 명, 불능 사유, 출장 희망일, 접수일
> - 출력 값 : as서비스번호
> - 로직 흐름 설명
> > - 입력 값을 바탕으로 데이터를 저장하고, 사유 추가, 불능 원인은 본래라면 수리기사가 작업 진행 후 변경 해야 하지만, 연습이기 때문에 판매자 입장으로 진행 해야 하는 로직에서 하루가 지나면 변경 처리(불능 원인 코드, 불능원인, 진행사항, 진행사항코드)를 입력 하는 방식하고, 처리완료일을 진행하자> > - 이후, 데이터 저장하여 성공 메시지를 띄어본다.

2) 조회인 경우
> - 입력 값 : 이름, 나이, 휴대폰 as서비스번호
> - 출력 값 : as서비스번호, 모델명, 접수일, 불능 사유, 불능 원인코드, 불능 원인, 출장희망일, 처리완료일을 출력해보자.

3) 변경인 경우
> - 입력 값 : 이름, 나이, 휴대폰번호, as서비스 번호, 모델명, 불능 사유, 출장 희망일, 접수일
> - 출력 값 : as서비스번호
> - 로직 흐름 설명
> > - 모델명, 불능 사유, 출장 희망일 변경 가능
> > - 이후, 데이터 저장하여 성공 메시지를 띄어본다

4) 취소인 경우
> - 입력 값 : 이름, 나이, 휴대폰 as서비스번호
> - 출력 값 : as서비스번호, 모델명, 접수일, 불능 사유, 불능 원인코드, 불능 원인, 출장희망일, 처리완료일을 출력해보자.

<br/>

- 이벤트 진행 이후, 2일이 지나면 처리 완료로 default로 설정 하여 로직을 작성하세요.


<br/><br/>

# 작업 순서도

- 다음은 작업을 진행 하기 앞서 문제 풀이 과정을 걸쳐본다.

<br/>

## Chapter01
- Kotlin 기반으로 정하고 환경설정 셋팅
- 요구사항 정의
- 블로그 : https://berkley.tistory.com/138

## Chapter02
- 여기서 Database 없이 순수 kotlin으로만 작업 실시
- 