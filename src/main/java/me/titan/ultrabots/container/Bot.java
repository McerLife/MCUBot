package me.titan.ultrabots.container;

import lombok.Getter;
import lombok.Setter;
import me.titan.ultrabots.manager.BotManager;
import net.citizensnpcs.api.npc.NPC;
import org.bukkit.Location;
import org.bukkit.entity.LivingEntity;

@Getter
@Setter
public abstract class Bot {

	final int id;

	public Bot(int id) {
		this.id = id;

		BotManager.getInstance().getBots().put(id,this);
	}

	public abstract NPC getNpc();

	public abstract boolean attackTarget(LivingEntity entity);

	public abstract boolean runAway(Location out);

}
