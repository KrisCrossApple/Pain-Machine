package main;

import arc.*;
import arc.util.*;
import arc.Events;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType;
import mindustry.game.EventType.*;
import mindustry.game.Saves;
import mindustry.io.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;
import mindustry.core.*;
import mindustry.game.Saves.*;

public class MainPain extends Mod{
    public MainPain(){
        Events.run(EventType.Trigger.update, () -> {
        Log.info(Vars.player.unit().health);
        });

        // Detects when something dies :3
        Events.on(UnitDestroyEvent.class, event -> {
            // PAIN IN MY *BLEEP* :3
            if (event.unit.isPlayer() != true) {
                return;
            }
            else {
            Core.app.exit();
            Vars.ui.hudfrag.showToast("Why do you only SOMETIMES work?");
            }
        });
    }

    @Override
    public void init() {
        // Why do I have this?
    }
}
