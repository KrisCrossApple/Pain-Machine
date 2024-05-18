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
        Log.info(":3 This is kris! I am inside your walls! :3");

        //listen for game load event
        Events.on(UnitDestroyEvent.class, dead ->{
            if(dead.isPlayer()){
                Vars.ui.hudfrag.showToast("If you see this Kris fucked up. :3");
        };
    });

}
}
