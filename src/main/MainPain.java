package main;

import arc.*;
import arc.util.*;
import arc.Events;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;
import mindustry.core.*;

public class MainPain extends Mod{

    public MainPain(){
        Log.info("Test");

        // Detects when something dies!
        Events.on(UnitDestroyEvent.class, event -> {
            // Check if the unit is a player
            if(event.unit.isPlayer()){
                Vars.ui.hudfrag.showToast("Why");
            }
        });
    }

    @Override
    public void init() {
        // You can add initialization code here if needed
    }
}
