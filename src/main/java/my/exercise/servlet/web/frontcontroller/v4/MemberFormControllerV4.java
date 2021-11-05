package my.exercise.servlet.web.frontcontroller.v4;

import java.util.Map;
import my.exercise.servlet.web.frontcontroller.ModelView;
import my.exercise.servlet.web.frontcontroller.v3.ControllerV3;

public class MemberFormControllerV4 implements ControllerV4 {

    @Override
    public String process(Map<String, String> paramMap, Map<String, Object> model) {
        return "new-form";
    }
}
