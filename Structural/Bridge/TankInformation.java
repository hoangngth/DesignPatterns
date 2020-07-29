package Structural.Bridge;

import Structural.Bridge.Engine.*;
import Structural.Bridge.Tank.*;

public class TankInformation {
    
    public static void main(String[] args) {

        Engine tigerEngine = new GermanEngine();
        Tank tigerTank = new TigerTank(tigerEngine);
        tigerTank.runsWith();

        Engine cometEngine = new BritishEngine();
        Tank cometTank = new CometTank(cometEngine);
        cometTank.runsWith();

        // Captured Tiger using British Engine (Tiger 131 - at The Tank Museum in Bovington, England)
        Tank capturedTigerTank = new TigerTank(cometEngine);
        capturedTigerTank.runsWith();
    }
}