package my.exercise.servlet.web.frontcontroller.v1.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import my.exercise.servlet.domain.Member;
import my.exercise.servlet.domain.MemberRepository;
import my.exercise.servlet.web.frontcontroller.v1.ControllerV1;

public class MemberSaveControllerV1 implements ControllerV1 {

    private MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    public void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("username");
        int age = Integer.parseInt(request.getParameter("age"));
        Member member = new Member(userName, age);
        memberRepository.save(member);

        //Model에 데이터를 보관
        request.setAttribute("member", member);

        String viewPath = "/WEB-INF/views/save-result.jsp";
        RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);
        dispatcher.forward(request, response);
    }
}
