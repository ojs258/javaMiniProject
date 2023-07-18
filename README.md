# PlayData Mini Project

### ※ 프로젝트의 Jframe관련 소스코드는 강사님이 제공해주셨습니다.

## 공통

생성자와 getter & setter 필드 변수의 개념

상속 관계에서 super키워드 개념

Custom생성자와 기본생성자 잠그기 개념

위 세가지 자바의 뼈대가 되는 기본 개념들을 활용

## Book package

추상 클래스를 이용한 패키지

추상클래스 Item을 구현하고 Item 클래스와 상속관계를 가지는 Book클래스에서 추상 메서드를 상속받아 사용

추상 클래스에서 추상메서드를 상속받아서 정의하는 개념,

txt 파일을 DB처럼 활용해 등록된 책목록을 조회하는 로직 개념

등을 활용해보는 패키지입니다.

## Cart package

인터페이스를 이용한 패키지

인터페이스 CartInterface를 구현하고 상속관계를 가지는 Cart클래스에서 메서드를 정의해서 사용

인터페이스의 상속과, ArrayList 개념,

updateTotalPrice와 같은 Entity에 구현하는 비즈니스 로직 개념

등을 활용해보는 패키지 입니다.

## Member package

Person부모 클래스와 Admin, User 자식 클래스의 상속 관계를 활용해서 자식 클래스에서 getter,setter메서드를 구현하지 않고 super키워드를 통해 Person의 필드에 정보를 저장하고 Person,의 getter, setter를 이용하는 개념

## Main과 Page package

강사님이 주신 Jframe 버튼과 리스너 관련 소스 코드입니다.

### Member package 변경사항

강사님이 문제의 난이도는 낮추는 과정에서 JFrame 리스너들 중에서 제대로 동작하지 않는 기능들이 생겨서 Admin 클래스는 생성자 없이 final필드를 가지게 하고 User클래스는 getAddress(주문 시점에 주소 등록)와 customUser(주문 회원과 받는 회원이 달라짐) 기능 복구를 위해 필드도 선언하고 getter,setter도 override 받아서 구현했습니다. (상속관계를 끊고 getter,setter를 직접 구현하는게 더 나아 보이지만 문제의 틀을 깨지 않기 위해 유지했습니다.)
