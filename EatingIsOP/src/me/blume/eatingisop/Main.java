package me.blume.eatingisop;

import org.bukkit.plugin.java.JavaPlugin;

import me.blume.eatingisop.listeners.EatingListener;

public class Main extends JavaPlugin{

	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new EatingListener(this), this);
	}
	@Override
	public void onDisable() {
		
	}
}
