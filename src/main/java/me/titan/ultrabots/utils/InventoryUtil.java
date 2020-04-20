package me.titan.ultrabots.utils;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public class InventoryUtil {

	@RequiredArgsConstructor
	@Getter
	public static enum ArmorLevels {

		LEATHER_ALL(6), LEATHER_ONE_BIG(2), LEATHER_TWO_BIG(4), LEATHER_ONE_SMALL(1), LEATHER_TWO_SMALL(2),
		GOLD_ALL(12), GOLD_ONE_BIG(4), GOLD_TWO_BIG(8), GOLD_ONE_SMALL(2), GOLD_TWO_SMALL(4),
		CHAIN_ALL(12), CHAIN_ONE_BIG(4), CHAIN_TWO_BIG(8), CHAIN_ONE_SMALL(2), CHAIN_TWO_SMALL(4),

		IRON_ALL(24),IRON_ONE_BIG(8), IRON_TWO_BIG(16), IRON_ONE_SMALL(4), IRON_TWO_SMALL(8),
		DIAMOND_ALL(48),DIAMOND_ONE_BIG(16),DIAMOND_TWO_BIG(32), DIAMOND_ONE_SMALL(8), DIAMOND_TWO_SMALL(16);


		final int level;

		public static int of(ItemStack item){
			String[] parts = item.toString().split("_");

			if(parts[0].equalsIgnoreCase("DIAMOND")){
				switch (parts[1]){
					case "CHESTPLATE":
					case "LEGGINGS":
						return DIAMOND_ONE_BIG.level;
					case "HELMET":
					case "BOOTS":
						return DIAMOND_ONE_SMALL.level;
				}
			}else if(parts[0].equalsIgnoreCase("IRON")){
				switch (parts[1]){
					case "CHESTPLATE":
					case "LEGGINGS":
						return IRON_ONE_BIG.level;
					case "HELMET":
					case "BOOTS":
						return IRON_ONE_SMALL.level;
				}
			}else if(parts[0].equalsIgnoreCase("GOLD") || parts[0].equalsIgnoreCase("CHAINMAIL")){
				switch (parts[1]){
					case "CHESTPLATE":
					case "LEGGINGS":
						return GOLD_ONE_BIG.level;
					case "HELMET":
					case "BOOTS":
						return GOLD_ONE_SMALL.level;
				}
			}else if(parts[0].equalsIgnoreCase("LEATHER")){
				switch (parts[1]){
					case "CHESTPLATE":
					case "LEGGINGS":
						return LEATHER_ONE_BIG.level;
					case "HELMET":
					case "BOOTS":
						return LEATHER_ONE_SMALL.level;
				}
			}
			return 0;
		}

	}

	public static int getArmorLevel(List<ItemStack> armor){


		int result = 0;
		if(armor.isEmpty()) {
			return result;
		}

		for(ItemStack i : armor){

		result+=ArmorLevels.of(i);


		}

		return result;

	}

}
