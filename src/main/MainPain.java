package main;

import arc.*;
import arc.util.*;
import arc.Events;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.game.Saves;
import mindustry.io.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;
import mindustry.core.*;
import mindustry.game.Saves.*;

public class MainPain extends Mod{
    public Saves saves;
    public MainPain(){
        Log.info("Warning! This mod makes it so that if you die the game exits.");

        Events.on(ClientLoadEvent.class, shenanagins ->{
            BaseDialog dialog = new BaseDialog("Warning!");
            dialog.cont.add("By Kris's Pain Machine!").pad(10).row();
            dialog.cont.add("This mod has PERMADEATH and wont let you load your saves. Be warned").pad(10).row();
            dialog.cont.button("Ok.", dialog::hide).pad(10).row();
            dialog.show();
        });

        Events.on(SaveLoadEvent.class, nill ->{
            Core.app.exit();
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
