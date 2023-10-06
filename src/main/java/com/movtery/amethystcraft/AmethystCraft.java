package com.movtery.amethystcraft;

import com.movtery.amethystcraft.block.*;
import com.movtery.amethystcraft.item.*;
import com.movtery.amethystcraft.sound.ModSoundEvents;
import com.movtery.amethystcraft.tool.*;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.*;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class AmethystCraft implements ModInitializer {
    public static final String MODID = "amethystcraft"; //模组ID
    private static final RegistryKey<ItemGroup> ACG = register(); //物品组
    private static RegistryKey<ItemGroup> register() {
        return RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(MODID, "amethystcraft"));
    }
    private static final ItemGroup AC = FabricItemGroup.builder()
            .icon(() -> new ItemStack(AmethystRawStone.AMETHYST_RAW_STONE))
            .displayName(Text.translatable("itemGroup.amethystcraft"))
            .build();

    @Override
    public void onInitialize() {
        /* 注册Mod音效 */
        Registry.register(Registries.SOUND_EVENT, ModSoundEvents.USE_GAUZE, ModSoundEvents.AC_USE_GAUZE);
        //音效 使用纱布

        /* 注册模组方块 */
        Registry.register(Registries.BLOCK, new Identifier(MODID, "suspicious_amethyst_block"), SuspiciousAmethystBlock.SUSPICIOUS_AMETHYST_BLOCK);
        //可疑的紫水晶块
        Registry.register(Registries.BLOCK, new Identifier(MODID, "wrapped_suspicious_amethyst_block"), WrappedSuspiciousAmethystBlock.WRAPPED_SUSPICIOUS_AMETHYST_BLOCK);
        //被包裹的可疑的紫水晶块

        /* 注册模组物品 */
        Registry.register(Registries.ITEM, new Identifier(MODID, "suspicious_amethyst_block"), new BlockItem(SuspiciousAmethystBlock.SUSPICIOUS_AMETHYST_BLOCK, new FabricItemSettings()));
        //可疑的紫水晶块
        Registry.register(Registries.ITEM, new Identifier(MODID, "wrapped_suspicious_amethyst_block"), new BlockItem(WrappedSuspiciousAmethystBlock.WRAPPED_SUSPICIOUS_AMETHYST_BLOCK, new FabricItemSettings()));
        //被包裹的可疑的紫水晶块

        Registry.register(Registries.ITEM, new Identifier(MODID, "amethyst_raw_stone"), AmethystRawStone.AMETHYST_RAW_STONE);
        //紫水晶原石
        Registry.register(Registries.ITEM, new Identifier(MODID, "amethyst_with_diamonds"), AmethystWithDiamonds.AMETHYST_WITH_DIAMONDS);
        //镶钻紫水晶
        Registry.register(Registries.ITEM, new Identifier(MODID, "gauze"), Gauze.GAUZE);
        //纱布
        Registry.register(Registries.ITEM, new Identifier(MODID, "gauze_fragments"), GauzeFragments.GAUZE_FRAGMENTS);
        //纱布碎片

        /* 注册模组工具 */
        Registry.register(Registries.ITEM, new Identifier(MODID, "amethyst_sword"), AmethystSword.AMETHYST_SWORD);
        //紫水晶剑
        Registry.register(Registries.ITEM, new Identifier(MODID, "amethyst_shovel"), AmethystShovel.AMETHYST_SHOVEL);
        //紫水晶铲
        Registry.register(Registries.ITEM, new Identifier(MODID, "amethyst_pickaxe"), AmethystPickaxe.AMETHYST_PICKAXE);
        //紫水晶镐
        Registry.register(Registries.ITEM, new Identifier(MODID, "amethyst_axe"), AmethystAxe.AMETHYST_AXE);
        //紫水晶斧
        Registry.register(Registries.ITEM, new Identifier(MODID, "amethyst_hoe"), AmethystHoe.AMETHYST_HOE);
        //紫水晶锄
        Registry.register(Registries.ITEM, new Identifier(MODID, "amethyst_with_diamonds_sword"), AmethystWithDiamondsSword.AMETHYST_WITH_DIAMONDS_SWORD);
        //镶钻紫水晶剑
        Registry.register(Registries.ITEM, new Identifier(MODID, "amethyst_with_diamonds_shovel"), AmethystWithDiamondsShovel.AMETHYST_WITH_DIAMONDS_SHOVEL);
        //镶钻紫水晶铲
        Registry.register(Registries.ITEM, new Identifier(MODID, "amethyst_with_diamonds_pickaxe"), AmethystWithDiamondsPickaxe.AMETHYST_WITH_DIAMONDS_PICKAXE);
        //镶钻紫水晶镐
        Registry.register(Registries.ITEM, new Identifier(MODID, "amethyst_with_diamonds_axe"), AmethystWithDiamondsAxe.AMETHYST_WITH_DIAMONDS_AXE);
        //镶钻紫水晶斧
        Registry.register(Registries.ITEM, new Identifier(MODID, "amethyst_with_diamonds_hoe"), AmethystWithDiamondsHoe.AMETHYST_WITH_DIAMONDS_HOE);
        //镶钻紫水晶锄

        /* 加入物品组 */
        ItemGroupEvents.modifyEntriesEvent(ACG).register(content -> content.add(SuspiciousAmethystBlock.SUSPICIOUS_AMETHYST_BLOCK));
        //可疑的紫水晶块
        ItemGroupEvents.modifyEntriesEvent(ACG).register(content -> content.add(WrappedSuspiciousAmethystBlock.WRAPPED_SUSPICIOUS_AMETHYST_BLOCK));
        //被包裹的可疑的紫水晶块
        ItemGroupEvents.modifyEntriesEvent(ACG).register(content -> content.add(AmethystRawStone.AMETHYST_RAW_STONE));
        //紫水晶原石
        ItemGroupEvents.modifyEntriesEvent(ACG).register(content -> content.add(AmethystWithDiamonds.AMETHYST_WITH_DIAMONDS));
        //镶钻紫水晶
        ItemGroupEvents.modifyEntriesEvent(ACG).register(content -> content.add(Gauze.GAUZE));
        //纱布
        ItemGroupEvents.modifyEntriesEvent(ACG).register(content -> content.add(GauzeFragments.GAUZE_FRAGMENTS));
        //纱布碎片
        ItemGroupEvents.modifyEntriesEvent(ACG).register(content -> content.add(AmethystSword.AMETHYST_SWORD));
        //紫水晶剑
        ItemGroupEvents.modifyEntriesEvent(ACG).register(content -> content.add(AmethystShovel.AMETHYST_SHOVEL));
        //紫水晶铲
        ItemGroupEvents.modifyEntriesEvent(ACG).register(content -> content.add(AmethystPickaxe.AMETHYST_PICKAXE));
        //紫水晶镐
        ItemGroupEvents.modifyEntriesEvent(ACG).register(content -> content.add(AmethystAxe.AMETHYST_AXE));
        //紫水晶斧
        ItemGroupEvents.modifyEntriesEvent(ACG).register(content -> content.add(AmethystHoe.AMETHYST_HOE));
        //紫水晶锄
        ItemGroupEvents.modifyEntriesEvent(ACG).register(content -> content.add(AmethystWithDiamondsSword.AMETHYST_WITH_DIAMONDS_SWORD));
        //镶钻紫水晶剑
        ItemGroupEvents.modifyEntriesEvent(ACG).register(content -> content.add(AmethystWithDiamondsShovel.AMETHYST_WITH_DIAMONDS_SHOVEL));
        //镶钻紫水晶铲
        ItemGroupEvents.modifyEntriesEvent(ACG).register(content -> content.add(AmethystWithDiamondsPickaxe.AMETHYST_WITH_DIAMONDS_PICKAXE));
        //镶钻紫水晶镐
        ItemGroupEvents.modifyEntriesEvent(ACG).register(content -> content.add(AmethystWithDiamondsAxe.AMETHYST_WITH_DIAMONDS_AXE));
        //镶钻紫水晶斧
        ItemGroupEvents.modifyEntriesEvent(ACG).register(content -> content.add(AmethystWithDiamondsHoe.AMETHYST_WITH_DIAMONDS_HOE));
        //镶钻紫水晶锄
    }

    static {
        Registry.register(Registries.ITEM_GROUP, ACG, AC); //注册物品组
    }
}
