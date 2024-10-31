- 오토와이어링
- 의존성 주입

====

- spring boot starter project로 더 쉽게 빌드 가능.
- starter는 여러가지 종류 있음
- 자동으로 오류 페이지도 잡아줌. error mvc configuration.....
- starter가 서블렛,톰켓,json변환도 자동으로 해줌

- spring boot DevTools. 자동으로 코드변경시 서버 재시동
- 프로필 사용하여 관리하기 가능 <- dev 환경...pord 환경.. 등
- spring.profiles.active=prod : application-prod.properties 이렇게 설정할 수 있음
- 더 복잡한 애플리케이션의 설정을 저장하려면?
- 프로퍼티스에서 기본주소 등을 설정하고 오토와이어링 해주면 쓸 수 있음.

- 스프링 프레임워크는 의존성이 핵심. 의존성 주입,식별,자동 연결...
- modules와 project는 생태계를 확장함.
- spring MVC의 핵심은 웹앱과 RESTAPI의 빌드 과정을 간소화 하는 것(@Controller,@RestController)
- spring boot는 project. 빠른 빌드를 도와준다. web starter...Auto configuration...비기능 요구사항(로깅) 등...

- 유저 rest api

  - 검색할 땐 GET으로 /users 만들땐 POST /users 한 명만 검색하고 싶을 땐 GET /users/{id} 한 명만 지우고 싶을 땐 DELETE /users/{id}

- 포스트 rest api
  - 검색은 GET /users{id}/posts 만들땐 검색은 POST /users{id}/posts 하나만 검색하고 싶을 땐 검색은 GET /users{id}/posts/{post_id}
