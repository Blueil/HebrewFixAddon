package me.blue.il.hebrew.fix.Events;

import me.blue.il.hebrew.fix.Utils;
import net.labymod.api.events.MessageModifyChatEvent;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;

public class ChatModifyEvent implements MessageModifyChatEvent {
	
	private Utils utils;
	
	public ChatModifyEvent(Utils utils) {
		this.utils = utils;
	}
	
	@Override
	public Object onModifyChatMessage(Object o) {
		IChatComponent iChatComponent = (IChatComponent) o;
		String fixedMsg = this.utils.fixMessage(iChatComponent.getFormattedText());
		IChatComponent base = new ChatComponentText(fixedMsg);
		return base.createCopy();
	}


}
