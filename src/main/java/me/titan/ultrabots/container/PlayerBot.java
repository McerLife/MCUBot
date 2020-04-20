package me.titan.ultrabots.container;

import lombok.Getter;
import net.citizensnpcs.api.CitizensAPI;
import net.citizensnpcs.api.npc.NPC;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.mineacademy.fo.Common;
import org.mineacademy.fo.remain.Remain;

import java.util.List;

@Getter
public class PlayerBot extends Bot {


	NPC npc;

	public static String BOT_META_DATA = "PlayerBot_ID";



	public PlayerBot(int id,String name){

		super(id);
		npc = CitizensAPI.getNPCRegistry().createNPC(EntityType.PLAYER, Common.colorize(name));

		npc.data().setPersistent(BOT_META_DATA,id);

		npc.setProtected(false);
		npc.setFlyable(false);

	}


	public void findNearby(){
		if(!npc.isSpawned() || npc.getEntity() == null) return;

		Entity en = npc.getEntity();
		List<Entity> nearby = (List<Entity>) Remain.getNearbyEntities(en.getLocation(),5);
		if(nearby.size() == 1){

			Entity t = nearby.get(0);
			//if(InventoryUtil.)

		}

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
