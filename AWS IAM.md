IAM 서비스는 글로벌 서비스로 리전 선택이 없음. 모두 사용 가능

IAM 정책 구조

version, id, statement 로 구성
statement는 Sid, effect, Principal, action, resource로 구성

```json
{
    "Version": "2012-10-17",
    "Id": "S3-Account-Permissions",
    "Statement": [
    {
        "Sid": "1",
                "Effect": "Allow",
                "Principal": {
                    "AWS": [
                        "arn:aws:iam::123456789012:user/user-name"
                    ]
                },
                "Action": [
                    "s3:GetObject",
                    "s3:PutObject",
                    "s3:DeleteObject"
                ],
                "Resource": [
                    "arn:aws:s3:::mybucket/*"
                ]
            }
        ]
    }
}
```

#### IAM MFA

AWS는 2가지 계정 방어책이 있음 1. 비밀번호 정책 : 최소길이나 특문추가 여부 기한설정 등 가능하다. 2. MFA : 사용자가 알고있는 비밀번호 + 물리적 보안 장치를 통해 로그인하는 것. 최소 2가지 이상을 섞어서 사용해야 함.
