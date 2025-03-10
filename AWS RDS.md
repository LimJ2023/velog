AWS의 데이터베이스 - RDS

관계형 데이터베이스를 제공하는 서비스
Relational Database Service
ec2위에서 작동 (가상머신 위에서 동작) - 직접 시스템에 로그인 불가능. os관리는 aws의 역할

RDS는 Serverless 서비스가 아님 (실제로 서버가 존재함)
CloudWatch와 연동됨 - DB 인스턴스의 모니터링 - DB에서 발생하는 여러 로그를 확인 가능

VPC안에서 동작함
서브넷, 보안그룹 지정 필요함

EC2 타입의 지정 필요
