package MobileComponent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service("iphone13")
public class MobileService {

@Autowired
    Sim sim;

public  void switchOn(){
    sim.connect();
    System.out.println("mobile is on...");
}
   /* public MobileService() {}

   // @Autowired
//            @Qualifier("TMobile")
//            private Sim simCard;

  /*  @Autowired  //autowired can work only for one
    TMobile tMobile;*/
/*
    @Autowired
    ATnTMobile aTnTMobile;*/
  /*  public void callConnection(){
        tMobile.connect();
        aTnTMobile.connect();
    }*/

        //constructor injection
//    public MobileService(@Qualifier("TMobile")Sim simCard){
//        this.simCard= simCard;
//    }


//    @PostConstruct
//    public void myInit(){
//        System.out.println("from myInit()");
//    }
//@PreDestroy
//    public void myDestroy(){
//    System.out.println("from myDestroy");
}

