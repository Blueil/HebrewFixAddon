package me.blue.il.hebrew.fix;

import java.util.List;

import me.blue.il.hebrew.fix.Events.ChatModifyEvent;
import net.labymod.api.LabyModAddon;
import net.labymod.settings.elements.SettingsElement;

public class HebrewFix extends LabyModAddon {
	
	private Utils utils;
	
	@Override
	protected void fillSettings(List<SettingsElement> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void loadConfig() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onEnable() {
		utils = new Utils();
		getApi().getEventManager().register(new ChatModifyEvent(utils));
	}

	
	
}
