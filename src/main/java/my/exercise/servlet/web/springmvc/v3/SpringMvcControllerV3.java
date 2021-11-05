package my.exercise.servlet.web.springmvc.v3;

import java.util.List;
import my.exercise.servlet.domain.Member;
import my.exercise.servlet.domain.MemberRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/springmvc/v3/members")
public class SpringMvcControllerV3 {

    private MemberRepository memberRepository = MemberRepository.getInstance();

    //@RequestMapping(value = "/new_form", method = RequestMethod.GET)
    @GetMapping("/new-form")
    public String newForm() {
        return "new-form";
    }

    //@RequestMapping(value = "/save", method = RequestMethod.POST)
    @PostMapping("/save")
    public String save(
        @RequestParam("username") String username,
        @RequestParam("age") int age,
        Model model) {
        Member member = new Member(username, age);
        memberRepository.save(member);

        model.addAttribute("member", member);
        return "save-result";
    }

    //@RequestMapping(value = "/new_form", method = RequestMethod.GET)
    @GetMapping
    public String members(Model model) {
        List<Member> members = memberRepository.findAll();
        model.addAttribute("members", members);
        return "members";
    }
}
