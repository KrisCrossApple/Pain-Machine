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
        Log.info("Warning! This mod makes it so that if you die the game crashes and then it WILL DELETE YOUR SAVES. remember BACK UP YOUR SAVES.");

        Events.on(ClientLoadEvent.class, shenanagins ->{
            BaseDialog dialog = new BaseDialog("Warning!");
            dialog.cont.add("This mod has PERMADEATH and will DELETE YOUR SAVES when you die.").row();
            dialog.cont.add("You have been WARNED.");
            dialog.cont.button("Ok.", dialog::hide);
            dialog.show();
        });

        // Detects when something dies :3
        Events.on(UnitDestroyEvent.class, event -> {
            // PAIN IN MY *BLEEP* :3
            if(event.unit.isPlayer()){
                Core.app.exit();
                Vars.ui.hudfrag.showToast("If this shows up again :3");
            }
        });
    }

    @Override
    public void init() {
        // Why do I have this?
    }
}
