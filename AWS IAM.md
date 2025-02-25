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
