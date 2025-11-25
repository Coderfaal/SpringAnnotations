package MobileComponent;

import com.tcs.ioc.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestComponent {
    public static void main(String[] args) {


        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfiguration.class);

        MobileService mobile= (MobileService) context.getBean("iphone13");
        mobile.switchOn();

       // TMobile tMobile= (TMobile) context.getBean("TMobile");
        //System.out.println(tMobile.connect());

       // ATnTMobile aTnTMobile=(ATnTMobile) context.getBean("ATnTMobile");
       // System.out.println(aTnTMobile.connect());

    }
}
