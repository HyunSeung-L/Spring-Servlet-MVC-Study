package my.exercise.servlet.web.frontcontroller.v4;

import java.util.List;
import java.util.Map;
import my.exercise.servlet.domain.Member;
import my.exercise.servlet.domain.MemberRepository;
import my.exercise.servlet.web.frontcontroller.ModelView;

public class MemberListControllerV4 implements ControllerV4 {

    private MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    public String process(Map<String, String> paramMap, Map<String, Object> model) {
        List<Member> members = memberRepository.findAll();

        model.put("members", members);

        return "members";
    }
}
