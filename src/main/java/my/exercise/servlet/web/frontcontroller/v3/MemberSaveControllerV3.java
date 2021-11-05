package my.exercise.servlet.web.frontcontroller.v3;

import java.util.Map;
import my.exercise.servlet.domain.Member;
import my.exercise.servlet.domain.MemberRepository;
import my.exercise.servlet.web.frontcontroller.ModelView;

public class MemberSaveControllerV3 implements ControllerV3 {

    private MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    public ModelView process(Map<String, String> paramMap) {
        String username = paramMap.get("username");
        int age = Integer.parseInt(paramMap.get("age"));
        Member member = new Member(username, age);
        memberRepository.save(member);
        ModelView mv = new ModelView("save-result");
        mv.getModel().put("member", member);
        return mv;
    }
}
