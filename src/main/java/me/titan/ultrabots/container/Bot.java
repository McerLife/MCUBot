package me.titan.ultrabots.container;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import net.citizensnpcs.api.npc.NPC;
import org.bukkit.Location;
import org.bukkit.entity.LivingEntity;

@RequiredArgsConstructor
@Getter
@Setter
public abstract class Bot {

	final int id;

	public abstract NPC getNpc();

	public abstract boolean attackTarget(LivingEntity entity);

	public abstract boolean runAway(Location out);

}
