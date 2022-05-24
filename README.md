# CirculateBmi
## 남자/여자, 키를 입력하면 Bmi 지수를 계산해 정상인지 아닌지 판단해주는 기능을 가진 프로젝트


## 클린 코드 활용 프로젝트 만들어보기

관련 도메인 참고 페이지 https://blog.naver.com/c1004ok/221968563313



## 기초세팅
 -> healthcheck 컨트롤러, http 파일 사용해서 테스트 ( env 세팅 )

## 껍데기 만들기
 -> circulateBmiQuery 컨트롤러, 파라미터를 위한 enum 클래스 생성, http파일로 테스트 확인
 
## policy and rule
 -> 실제 구현부분 파트 1

## policy and rule finish
-> 실제 구현부분 파트 2 완료!

## add comment
-> 어떤 일을 하는 클래스인지 주석 추가


## add Entity
-> 객체를 사용해서 PersonId로 키, 몸무게 받아오기

## h2 console 설정 및 오타 수정
-> 자동으로 된다는데 나만 자동으로 안되서 일단 설정 해줌 + 테스트해보니 오타가 있어서 수정함