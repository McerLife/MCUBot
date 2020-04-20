package me.titan.ultrabots.manager;

import lombok.Getter;
import me.titan.ultrabots.container.Bot;

import java.util.HashMap;
import java.util.Map;

public class BotManager {

	@Getter
	private final static BotManager instance = new BotManager();

	@Getter
	private final Map<Integer, Bot> bots = new HashMap<>();




}
