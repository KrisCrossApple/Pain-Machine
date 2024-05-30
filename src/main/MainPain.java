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

        // Detects when something dies :3
        Events.on(UnitDestroyEvent.class, e -> {
            if(e.unit.isPlayer())
                Core.app.exit();
        });
    }

    @Override
    public void init() {
        // Why do I have this?
    }
}
