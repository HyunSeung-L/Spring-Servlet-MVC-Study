package my.exercise.servlet.web.frontcontroller.v3;

import java.util.Map;
import my.exercise.servlet.web.frontcontroller.ModelView;

public class MemberFormControllerV3 implements ControllerV3 {
    @Override
    public ModelView process(Map<String, String> paramMap) {
        return new ModelView("new-form");
    }
}
