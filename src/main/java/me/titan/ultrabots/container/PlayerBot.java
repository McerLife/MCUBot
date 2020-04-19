package me.titan.ultrabots.container;

import lombok.Getter;
import net.citizensnpcs.api.CitizensAPI;
import net.citizensnpcs.api.npc.NPC;
import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.mineacademy.fo.Common;

@Getter
public class PlayerBot extends Bot {


	NPC npc;

	public static String BOT_META_DATA = "PlayerBot_ID";



	public PlayerBot(int id,String name){

		super(id);
		npc = CitizensAPI.getNPCRegistry().createNPC(EntityType.PLAYER, Common.colorize(name));

		npc.data().setPersistent(BOT_META_DATA,id);


	}



	@Override
	public boolean attackTarget(LivingEntity entity) {
		return false;
	}

	@Override
	public boolean runAway(Location out) {
		return false;
	}
}
