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
            dialog.cont.add("By Kris's Pain Machine!").pad(10).row();
            dialog.cont.add("This mod has PERMADEATH and will DELETE YOUR SAVES when you die.").pad(10).row();
            dialog.cont.add("[red]You have been WARNED.").pad(10).row();
            dialog.cont.button("Ok.", dialog::hide).pad(10).row();
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
