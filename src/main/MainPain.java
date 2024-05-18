package main;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;

public class MainPain extends Mod{

    public MainPain(){
        Log.info("Test");

        //Detects when something dies!
        Events.on(UnitDestroyEvent.class, dead ->{
            // This code will kill me from the .isPlayer()
            Vars.ui.hudfrag.showToast("if this is because the dead.unit.isPlayer() is acting up i swear to god");
            if(dead.unit.isPlayer()){
                Core.app.exit()
                Vars.ui.hudfrag.showToast("If you see this Kris fucked up. :3");
            }
    });

}
}
