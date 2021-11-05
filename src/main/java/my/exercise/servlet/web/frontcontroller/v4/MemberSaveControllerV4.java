package my.exercise.servlet.web.frontcontroller.v4;

import java.util.Map;
import my.exercise.servlet.domain.Member;
import my.exercise.servlet.domain.MemberRepository;
import my.exercise.servlet.web.frontcontroller.ModelView;

public class MemberSaveControllerV4 implements ControllerV4 {

    private MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    public String process(Map<String, String> paramMap, Map<String, Object> model) {
        String username = paramMap.get("username");
        int age = Integer.parseInt(paramMap.get("age"));

        Member member = new Member(username, age);
        memberRepository.save(member);

        model.put("member", member);

        return "save-result";
    }
}
