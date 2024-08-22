package by.dramlyn.extra_armor.item;

import by.dramlyn.extra_armor.ExtraArmorMod;
import by.dramlyn.extra_armor.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

/**
 * Класс для кастомизации ячеек предметов в креативном моде
 */
public class MyCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> MY_CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ExtraArmorMod.MY_MOD_ID);

    public static final RegistryObject<CreativeModeTab> MY_CREATIVE_MODE_TAB =
            MY_CREATIVE_MODE_TABS.register("extra-armor-tab",
                    () -> CreativeModeTab.builder()
                            .icon(() -> new ItemStack(ModItems.FIANIT.get()))
                            .title(Component.translatable("extra-armor.create-mode-tab-title"))
                            .displayItems(((pParameters, pOutput) -> {
                                pOutput.accept(ModItems.FIANIT.get());
                                pOutput.accept(ModBlocks.FIANIT_ORE_BLOCK.get());
                                pOutput.accept(ModBlocks.FIANIT_BLOCK.get());
                            }))
                            .build());

    public static void register(IEventBus eventBus){
        MY_CREATIVE_MODE_TABS.register(eventBus);
    }
}
