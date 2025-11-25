package MobileComponent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component ("TMobile")
@Primary
public class TMobile implements Sim {

    @Override
    public void connect(){
        System.out.println("TMobile sim Connected..");

    }


}
