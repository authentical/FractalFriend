package com.potatospy.fractalfriend;



/*

  _   _  ____ _______ ______
 | \ | |/ __ \__   __|  ____|
 |  \| | |  | | | |  | |__
 | . ` | |  | | | |  |  __|
 | |\  | |__| | | |  | |____
 |_| \_|\____/  |_|  |______|



 In order to build an executable fat jar (Maven Shade - Use package phase),
 this NewMain was required since the Main class extends Application. Launching a
 class extending Application causes an issue with sun.launcher.LauncherHelper.
 This launcher goes looking into the fat jar for JavaFX modules but everything
 appears to be built in one module... so those FX modules are no longer visible.
 */



public class NewMain {
    public static void main(String[] args) {

        Main.main(args);
    }
}
