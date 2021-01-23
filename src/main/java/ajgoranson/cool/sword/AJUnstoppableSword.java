package ajgoranson.cool.sword;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class AJUnstoppableSword implements ModInitializer {


	public static final Item AJ_COOL = new Item(new Item.Settings().group(ItemGroup.COMBAT));

	@Override
	public void onInitialize() {

		Registry.register(Registry.ITEM, new Identifier("ajsword", "best_sword"), AJ_COOL);

	}
}
