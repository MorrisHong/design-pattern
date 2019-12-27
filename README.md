# 본 레포는 디자인패턴을 공부, 정리하기 위한 레포입니다.

## 퍼사드패턴
### 정의
- 복잡한 과정을 간단하게 표현한다.  
- 하위 시스템의 인터페이스 세트에 일관된 인터페이스를 제공하는 것.
### 예
- 세탁모드가 두가지 ( 찌든 때, 조물조물 ) 뿐인 세탁기.
- 물의 온도, 세탁시간, 세제의 양 등등의 로직등은 인터페이스 내부에 두고, 두 가지 세탁 모드만 제공한다.
- 사용자는 두 가지 모드 중 하나를 고르면 그만이다.
