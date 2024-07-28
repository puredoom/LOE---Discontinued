//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package drealm.database;

import drealm.util.*;
import lotr.common.*;
import net.minecraft.item.*;
import net.minecraft.init.*;
import lotr.common.fac.*;
import lotr.common.entity.npc.*;
import lotr.common.quest.*;

public class DRMiniQuestFactory
{
    public static LOTRMiniQuestFactory RED_MOUNTAINS;
    
    public static void addMiniQuestsFactories() {
        DRMiniQuestFactory.RED_MOUNTAINS = DRCommander.addMiniQuestFactory("RED_MOUNTAINS", "redMountains");
    }
    
    public static void onInit() {
        addMiniQuestsFactories();
        setupMiniQuestFactories();
    }
    
    public static void setupMiniQuestFactories() {
        DRCommander.setMiniQuestFactoryAchievement(DRMiniQuestFactory.RED_MOUNTAINS, DRAchievement.doMiniquestRedMountains);
        DRCommander.addMiniQuest(DRMiniQuestFactory.RED_MOUNTAINS, (LOTRMiniQuest.QuestFactoryBase<? extends LOTRMiniQuest>)new LOTRMiniQuestCollect.QFCollect("mineMithril").setCollectItem(new ItemStack(LOTRMod.mithril), 1, 2).setRewardFactor(50.0f));
        DRCommander.addMiniQuest(DRMiniQuestFactory.RED_MOUNTAINS, (LOTRMiniQuest.QuestFactoryBase<? extends LOTRMiniQuest>)new LOTRMiniQuestCollect.QFCollect("collectMineral").setCollectItem(new ItemStack(Items.gold_ingot), 3, 15).setRewardFactor(4.0f));
        DRCommander.addMiniQuest(DRMiniQuestFactory.RED_MOUNTAINS, (LOTRMiniQuest.QuestFactoryBase<? extends LOTRMiniQuest>)new LOTRMiniQuestCollect.QFCollect("collectMineral").setCollectItem(new ItemStack(LOTRMod.silver), 3, 15).setRewardFactor(4.0f));
        DRCommander.addMiniQuest(DRMiniQuestFactory.RED_MOUNTAINS, (LOTRMiniQuest.QuestFactoryBase<? extends LOTRMiniQuest>)new LOTRMiniQuestCollect.QFCollect("collectMineral").setCollectItem(new ItemStack(Items.glowstone_dust), 5, 15).setRewardFactor(2.0f));
        DRCommander.addMiniQuest(DRMiniQuestFactory.RED_MOUNTAINS, (LOTRMiniQuest.QuestFactoryBase<? extends LOTRMiniQuest>)new LOTRMiniQuestCollect.QFCollect("collectMineral").setCollectItem(new ItemStack(LOTRMod.diamond), 1, 3).setRewardFactor(15.0f));
        DRCommander.addMiniQuest(DRMiniQuestFactory.RED_MOUNTAINS, (LOTRMiniQuest.QuestFactoryBase<? extends LOTRMiniQuest>)new LOTRMiniQuestCollect.QFCollect("collectMineral").setCollectItem(new ItemStack(LOTRMod.sapphire), 1, 3).setRewardFactor(12.0f));
        DRCommander.addMiniQuest(DRMiniQuestFactory.RED_MOUNTAINS, (LOTRMiniQuest.QuestFactoryBase<? extends LOTRMiniQuest>)new LOTRMiniQuestCollect.QFCollect("collectMineral").setCollectItem(new ItemStack(LOTRMod.opal), 1, 3).setRewardFactor(10.0f));
        DRCommander.addMiniQuest(DRMiniQuestFactory.RED_MOUNTAINS, (LOTRMiniQuest.QuestFactoryBase<? extends LOTRMiniQuest>)new LOTRMiniQuestCollect.QFCollect("collectMineral").setCollectItem(new ItemStack(LOTRMod.amethyst), 1, 3).setRewardFactor(10.0f));
        DRCommander.addMiniQuest(DRMiniQuestFactory.RED_MOUNTAINS, (LOTRMiniQuest.QuestFactoryBase<? extends LOTRMiniQuest>)new LOTRMiniQuestCollect.QFCollect("forgeDwarfWeapon").setCollectItem(new ItemStack(DRRegistry.hammerRedDwarven), 1, 3).setRewardFactor(5.0f));
        DRCommander.addMiniQuest(DRMiniQuestFactory.RED_MOUNTAINS, (LOTRMiniQuest.QuestFactoryBase<? extends LOTRMiniQuest>)new LOTRMiniQuestCollect.QFCollect("forgeDwarfWeapon").setCollectItem(new ItemStack(DRRegistry.battleaxeRedDwarven), 1, 3).setRewardFactor(5.0f));
        DRCommander.addMiniQuest(DRMiniQuestFactory.RED_MOUNTAINS, (LOTRMiniQuest.QuestFactoryBase<? extends LOTRMiniQuest>)new LOTRMiniQuestCollect.QFCollect("forgeDwarfWeapon").setCollectItem(new ItemStack(DRRegistry.throwingAxeRedDwarven), 1, 4).setRewardFactor(4.0f));
        DRCommander.addMiniQuest(DRMiniQuestFactory.RED_MOUNTAINS, (LOTRMiniQuest.QuestFactoryBase<? extends LOTRMiniQuest>)new LOTRMiniQuestCollect.QFCollect("collectDrink").setCollectItem(new ItemStack(LOTRMod.mugDwarvenAle), 2, 5).setRewardFactor(3.0f));
        DRCommander.addMiniQuest(DRMiniQuestFactory.RED_MOUNTAINS, (LOTRMiniQuest.QuestFactoryBase<? extends LOTRMiniQuest>)new LOTRMiniQuestKillFaction.QFKillFaction("killMordor").setKillFaction(LOTRFaction.MORDOR, 20, 40));
        DRCommander.addMiniQuest(DRMiniQuestFactory.RED_MOUNTAINS, (LOTRMiniQuest.QuestFactoryBase<? extends LOTRMiniQuest>)new LOTRMiniQuestKillEntity.QFKillEntity("killOrc").setKillEntity((Class)LOTREntityMordorOrc.class, 10, 30));
        DRCommander.addMiniQuest(DRMiniQuestFactory.RED_MOUNTAINS, (LOTRMiniQuest.QuestFactoryBase<? extends LOTRMiniQuest>)new LOTRMiniQuestKillEntity.QFKillEntity("killWarg").setKillEntity((Class)LOTREntityMordorWarg.class, 10, 30));
        DRCommander.addMiniQuest(DRMiniQuestFactory.RED_MOUNTAINS, (LOTRMiniQuest.QuestFactoryBase<? extends LOTRMiniQuest>)new LOTRMiniQuestBounty.QFBounty("bounty"));
    }
}
