package zb.pattern.template;

public class Template extends AbstractTemplate {
    @Override
    void getData() {
        System.out.println("template..getData.." + data + "\t" + user.getName());
    }

}
