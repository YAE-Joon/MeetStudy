# meetstudy

***
### 목차
- 요약

- 기술 스택

- 주요 기능

- ERD

- APIs

- 트러블 슈팅

## 요약
***
- 다양한 주제의 스터디를 쉽게 생성, 참여하고 관리 할 수 있는 서비스

  - 공통 관심사를 가진 이들과 함께하며 효과적으로 자기계발을 이어나가길 원하는 사람
  - 일정 관리와 소통을 한 공간에서 하고 싶은 사람
  - 다양한 관심사의 사람들과 어울리고 싶은 사람

## 기술 스택
***
- ## ![Next JS](https://img.shields.io/badge/Next-black?style=for-the-badge&logo=next.js&logoColor=white)![TypeScript](https://img.shields.io/badge/typescript-%23007ACC.svg?style=for-the-badge&logo=typescript&logoColor=white)![React](https://img.shields.io/badge/react-%2320232a.svg?style=for-the-badge&logo=react&logoColor=%2361DAFB)
- ## ![Redis](https://img.shields.io/badge/redis-%23DD0031.svg?style=for-the-badge&logo=redis&logoColor=white)![MySQL](https://img.shields.io/badge/mysql-4479A1.svg?style=for-the-badge&logo=mysql&logoColor=white)![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
- ## ![Swagger](https://img.shields.io/badge/-Swagger-%23Clojure?style=for-the-badge&logo=swagger&logoColor=white)![Notion](https://img.shields.io/badge/Notion-%23000000.svg?style=for-the-badge&logo=notion&logoColor=white)![GitLab](https://img.shields.io/badge/gitlab-%23181717.svg?style=for-the-badge&logo=gitlab&logoColor=white)

## 개발 과정

<img width="816" alt="스크린샷 2024-08-07 오후 6 56 42" src="https://github.com/user-attachments/assets/e998a762-383e-4f29-8a18-51d0abc69acb">


## 주요 기능

● 실시간 채팅: 채팅을 통해 더욱 생생하게 소통합니다.

● 스터디룸: 카테고리 별로 스터디룸을 검색하고 생성할 수 있습니다.

● 캘린더: 개인 및 스터디별 일정을 관리할 수 있습니다.

● 개인 프로필 관리: 마이페이지에서 프로필 설정, 스터디룸 기록 조회, 닉네임 설정 등 다양한 기능을 제공합니다.

● 철저한 인증: 이메일 인증 방식으로 안전하게 회원가입할 수 있습니다.

● 자유게시판: 다양한 주제로 소통할 수 있는 자유게시판을 통해 정보를 공유하고, 질문과 답변을 나눌 수 있습니다.

● 게시판, 게시글 스크랩: 유용한 정보를 스크랩하여 언제든지 쉽게 접근할 수 있습니다.

● 관리자 도구: 관리자 기능을 통해 회원, 채팅방, 게시판을 효율적으로 관리하고 모니터링합니다.



## ERD
***
![final_ERD(1)](https://github.com/user-attachments/assets/b5860771-8df6-460c-8509-92bf15146c3f)

## APIs
***
![Apis](https://github.com/user-attachments/assets/bc18d889-b5a9-48d9-8d66-37e0d7bd3ffc)

## 트러블 슈팅
***
- 
  문제 : 카테고리 조회할 때 데이터가 중첩되는 문제 발생

  원인 : category 엔티티와 post, studyroom 엔티티 간의 순환 참조 문제로 인해 JSON 직렬화 과정에서 무한 루프 발생
  
  해결 : category 엔티티에서 post와 studyroom 리스트를 제거해 직렬화 과정에서 순환 참조가 발생하지 않도록 함.
-
  문제 : 인증이 필요한 엔드포인트에 접근 시 403 Forbidden 에러 발생 

  원인 : 서버의 특정 엔드포인트는 특정 권한을 가진 사용자만 접근할 수 있도록 설정되어 있는데 JWT 토큰에 포함된 권한 정보가 엔드포인트의 접근 권한과 일치하지 않음.
 
  해결 : Spring Security 설정에서 엔드포인트의 접근 권한을 정확하게 설정함. 예를 들어, 권한 없이 접근 가능한 엔드포인트에 public을 붙여 구분해줌.
