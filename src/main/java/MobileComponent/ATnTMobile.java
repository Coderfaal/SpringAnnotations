package MobileComponent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;



@Component("ATnTMobile")
public class ATnTMobile implements Sim{


    @Override
    public void connect() {
        System.out.println("ATnT sim Connected...");

    }
}
