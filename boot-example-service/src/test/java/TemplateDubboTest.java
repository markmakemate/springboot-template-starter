import com.boot.template.starter.remote.TemplateDubboService;
import org.apache.dubbo.config.annotation.Reference;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TemplateDubboTest {

    @Reference
    private TemplateDubboService templateDubboService;

    @Test
    public void testTemplate() {
        Assert.assertNotNull(templateDubboService);
        System.out.println(templateDubboService.add(1, 2));
    }

}
