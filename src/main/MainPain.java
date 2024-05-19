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

        // Detects when something dies :3
        Events.on(UnitDestroyEvent.class, event -> {
            // PAIN IN MY *BLEEP* :3
            if(event.unit.isPlayer() == true){
                Vars.ui.hudfrag.showToast("Why");
            }
        });
    }

    @Override
    public void init() {
        // Why do I have this?
    }
}
