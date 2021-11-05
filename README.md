### ** 개요 **
- Spring MVC 구현 방식과 그 등장 배경을 알아보자

  - Servlet과 Java만을 이용한 Controller 구현 -> 뷰 템플릿과 MVC 패턴이 필요한 이유 이해
  - Servlet과 MVC 패턴으로 Controller 구현 
  - 중복 코드 제거(공통 기능 처리)를 위한 Front Controllr 패턴 구현
  - Spring MVC의 Adapter 패턴 구현


# Servlet과 MVC 패턴 이해 - 간단한 회원 관리 App
## 1. HttpServlet 상속 + 자바 코드만 사용하여 컨트롤러 구현
- package my.exercise.servlet.web.servlet;

## 2. HttpServlet 상속 + MVC 패턴으로 구현
- package my.exercise.servlet.web.servletmvc;

![image](https://user-images.githubusercontent.com/83579691/140530073-61e7bf63-8ce9-4328-8ff9-2079ab4deca0.png)

## 3. Front Controller 패턴 도입
### - 컨트롤러 호출 전 공통 기능을 처리
![image](https://user-images.githubusercontent.com/83579691/140529803-ceaa9f27-cddb-4c82-8e0c-c056c18ce203.png)

## 4. Adapter 패턴 도입 
### - 여러 방식의 컨트롤러 인터페이스 호환
- package my.exercise.servlet.web.frontcontroller.v5;
- package my.exercise.servlet.web.frontcontroller.v5.adapter;

![image](https://user-images.githubusercontent.com/83579691/140529916-47f2c282-22c8-4dc3-9ef2-82ed17230cc3.png)
