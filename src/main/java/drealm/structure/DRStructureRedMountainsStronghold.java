//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package drealm.structure;

import net.minecraft.world.*;
import net.minecraft.entity.*;
import java.util.*;
import net.minecraft.init.*;
import lotr.common.entity.*;
import net.minecraft.block.*;
import drealm.item.*;
import lotr.common.world.structure.*;
import drealm.database.*;
import lotr.common.*;
import drealm.entity.*;
import lotr.common.entity.npc.*;

public class DRStructureRedMountainsStronghold extends LOTRWorldGenStructureBase
{
    public DRStructureRedMountainsStronghold(final boolean flag) {
        super(flag);
    }
    
    public static void spawnDwarf(final World world, final int i, final int j, final int k) {
        final DREntityRedDwarfWarrior dwarf = (DREntityRedDwarfWarrior)((world.rand.nextInt(3) == 0) ? new DREntityRedDwarfAxeThrower(world) : new DREntityRedDwarfWarrior(world));
        dwarf.setLocationAndAngles(i + 0.5, (double)j, k + 0.5, 0.0f, 0.0f);
        ((DREntityRedDwarf)dwarf).onSpawnWithEgg((IEntityLivingData)null);
        dwarf.isNPCPersistent = true;
        dwarf.setHomeArea(i, j, k, 16);
        world.spawnEntityInWorld((Entity)dwarf);
    }
    
    public static void spawnDwarfCommander(final World world, final int i, final int j, final int k) {
        final DREntityRedDwarfCommander dwarf = new DREntityRedDwarfCommander(world);
        dwarf.setLocationAndAngles(i + 0.5, (double)j, k + 0.5, 0.0f, 0.0f);
        ((LOTREntityDwarf)dwarf).onSpawnWithEgg((IEntityLivingData)null);
        dwarf.setHomeArea(i, j, k, 16);
        world.spawnEntityInWorld((Entity)dwarf);
    }
    
    public boolean generate(final World world, final Random random, int i, int j, int k) {
        final Block block;
        if (this.restrictions && (block = world.getBlock(i, j - 1, k)) != Blocks.grass && block != Blocks.stone && block != Blocks.dirt && block != LOTRMod.rock && block != Blocks.snow) {
            return false;
        }
        --j;
        int rotation = random.nextInt(4);
        if (!this.restrictions && this.usingPlayer != null) {
            rotation = this.usingPlayerRotation();
        }
        switch (rotation) {
            case 0: {
                k += 8;
                break;
            }
            case 1: {
                i -= 8;
                break;
            }
            case 2: {
                k -= 8;
                break;
            }
            case 3: {
                i += 8;
                break;
            }
        }
        if (this.restrictions) {
            int minHeight = j;
            int maxHeight = j;
            for (int i2 = i - 6; i2 <= i + 6; ++i2) {
                for (int k2 = k - 6; k2 <= k + 6; ++k2) {
                    final int j2 = world.getTopSolidOrLiquidBlock(i2, k2) - 1;
                    final Block block2 = world.getBlock(i2, j2, k2);
                    if (block2 != Blocks.grass && block2 != Blocks.stone && block2 != Blocks.dirt && block2 != LOTRMod.rock && block2 != Blocks.snow) {
                        return false;
                    }
                    if (j2 < minHeight) {
                        minHeight = j2;
                    }
                    if (j2 > maxHeight) {
                        maxHeight = j2;
                    }
                }
            }
            if (maxHeight - minHeight > 10) {
                return false;
            }
        }
        for (int k3 = k - 6; k3 <= k + 6; ++k3) {
            for (int i3 = i - 6; i3 <= i + 6; ++i3) {
                final boolean flag = Math.abs(k3 - k) == 6 && Math.abs(i3 - i) == 6;
                for (int j3 = j + 7; (j3 >= j || !LOTRMod.isOpaque(world, i3, j3, k3)) && j3 >= 0; --j3) {
                    if (flag) {
                        this.setBlockAndNotifyAdequately(world, i3, j3, k3, LOTRMod.pillar, 4);
                    }
                    else {
                        if (Math.abs(i3 - i) < 6 && Math.abs(k3 - k) < 6) {
                            if ((j3 >= j + 1 && j3 <= j + 3) || (j3 >= j + 4 && j3 <= j + 7)) {
                                this.setAir(world, i3, j3, k3);
                                continue;
                            }
                            if (j3 == j) {
                                this.setBlockAndNotifyAdequately(world, i3, j3, k3, Blocks.planks, 1);
                                continue;
                            }
                        }
                        this.setBlockAndNotifyAdequately(world, i3, j3, k3, LOTRMod.brick2, 2);
                    }
                    if (j3 <= j) {
                        this.setGrassToDirt(world, i3, j3 - 1, k3);
                    }
                }
            }
        }
        for (int i4 = i - 6; i4 <= i + 6; ++i4) {
            this.setBlockAndNotifyAdequately(world, i4, j + 8, k - 6, LOTRMod.stairsDwarvenBrick, 2);
            this.setBlockAndNotifyAdequately(world, i4, j + 8, k + 6, LOTRMod.stairsDwarvenBrick, 3);
        }
        for (int k3 = k - 6; k3 <= k + 6; ++k3) {
            this.setBlockAndNotifyAdequately(world, i - 6, j + 8, k3, LOTRMod.stairsDwarvenBrick, 0);
            this.setBlockAndNotifyAdequately(world, i + 6, j + 8, k3, LOTRMod.stairsDwarvenBrick, 1);
        }
        for (int k3 = k - 5; k3 <= k + 5; ++k3) {
            for (int i3 = i - 5; i3 <= i + 5; ++i3) {
                this.setBlockAndNotifyAdequately(world, i3, j + 4, k3, LOTRMod.slabDouble3, 5);
                this.setBlockAndNotifyAdequately(world, i3, j + 8, k3, LOTRMod.slabDouble3, 5);
                final int i5 = Math.abs(i3 - i);
                final int k4 = Math.abs(k3 - k);
                int l = -1;
                if (i5 == 5) {
                    l = k4 % 2;
                }
                else if (k4 == 5) {
                    l = i5 % 2;
                }
                if (l != -1) {
                    if (l == 1) {
                        for (int j4 = j + 9; j4 <= j + 11; ++j4) {
                            this.setBlockAndNotifyAdequately(world, i3, j4, k3, LOTRMod.pillar, 4);
                        }
                    }
                    else {
                        this.setBlockAndNotifyAdequately(world, i3, j + 9, k3, LOTRMod.wall2, 3);
                    }
                }
            }
        }
        for (int i4 = i - 5; i4 <= i + 5; ++i4) {
            this.setBlockAndNotifyAdequately(world, i4, j + 12, k - 5, LOTRMod.stairsDwarvenBrick, 2);
            this.setBlockAndNotifyAdequately(world, i4, j + 12, k + 5, LOTRMod.stairsDwarvenBrick, 3);
        }
        for (int k3 = k - 5; k3 <= k + 5; ++k3) {
            this.setBlockAndNotifyAdequately(world, i - 5, j + 12, k3, LOTRMod.stairsDwarvenBrick, 0);
            this.setBlockAndNotifyAdequately(world, i + 5, j + 12, k3, LOTRMod.stairsDwarvenBrick, 1);
        }
        for (int k3 = k - 4; k3 <= k + 4; ++k3) {
            for (int i3 = i - 4; i3 <= i + 4; ++i3) {
                this.setBlockAndNotifyAdequately(world, i3, j + 12, k3, LOTRMod.slabSingle, 15);
            }
        }
        this.setBlockAndNotifyAdequately(world, i, j + 7, k, DRRegistry.chandelier, 0);
        this.setBlockAndNotifyAdequately(world, i, j + 11, k, DRRegistry.chandelier, 0);
        this.setBlockAndNotifyAdequately(world, i, j + 12, k, LOTRMod.brick, 6);
        switch (rotation) {
            case 0: {
                this.generateFacingSouth(world, random, i, j, k);
                break;
            }
            case 1: {
                this.generateFacingWest(world, random, i, j, k);
                break;
            }
            case 2: {
                this.generateFacingNorth(world, random, i, j, k);
                break;
            }
            case 3: {
                this.generateFacingEast(world, random, i, j, k);
                break;
            }
        }
        spawnDwarfCommander(world, i, j + 9, k);
        for (int m = 0; m < 4; ++m) {
            spawnDwarf(world, i, j + 5, k);
        }
        final LOTREntityNPCRespawner respawner = new LOTREntityNPCRespawner(world);
        respawner.setSpawnClasses((Class)DREntityRedDwarfWarrior.class, (Class)DREntityRedDwarfAxeThrower.class);
        respawner.setCheckRanges(8, -8, 16, 8);
        respawner.setSpawnRanges(8, 1, 10, 16);
        this.placeNPCRespawner(respawner, world, i, j, k);
        return true;
    }
    
    public void generateFacingEast(final World world, final Random random, final int i, final int j, final int k) {
        for (int k2 = k - 6; k2 <= k + 6; ++k2) {
            this.setBlockAndNotifyAdequately(world, i - 7, j + 1, k2, LOTRMod.slabSingle3, 5);
            this.setGrassToDirt(world, i - 7, j, k2);
            for (int j2 = j; !LOTRMod.isOpaque(world, i - 7, j2, k2) && j2 >= 0; --j2) {
                this.setBlockAndNotifyAdequately(world, i - 7, j2, k2, LOTRMod.pillar, 4);
                this.setGrassToDirt(world, i - 7, j2 - 1, k2);
            }
        }
        for (int j3 = j + 1; j3 <= j + 2; ++j3) {
            this.setAir(world, i - 6, j3, k);
            this.setBlockAndNotifyAdequately(world, i - 7, j3, k - 1, LOTRMod.pillar, 4);
            this.setBlockAndNotifyAdequately(world, i - 7, j3, k + 1, LOTRMod.pillar, 4);
        }
        this.setBlockAndNotifyAdequately(world, i - 7, j, k, Blocks.planks, 1);
        this.setBlockAndNotifyAdequately(world, i - 6, j, k, Blocks.planks, 1);
        this.setBlockAndNotifyAdequately(world, i - 7, j + 1, k, LOTRMod.doorSpruce, 0);
        this.setBlockAndNotifyAdequately(world, i - 7, j + 2, k, LOTRMod.doorSpruce, 8);
        this.setBlockAndNotifyAdequately(world, i - 7, j + 3, k - 1, LOTRMod.stairsDwarvenBrick, 2);
        this.setBlockAndNotifyAdequately(world, i - 7, j + 3, k, LOTRMod.brick3, 12);
        this.setBlockAndNotifyAdequately(world, i - 7, j + 3, k + 1, LOTRMod.stairsDwarvenBrick, 3);
        this.setBlockAndNotifyAdequately(world, i - 7, j + 4, k, LOTRMod.slabSingle, 7);
        this.placeWallBanner(world, i - 6, j + 6, k, 1, DRItemBanner.RED_MOUNTAINS);
        for (int j3 = j + 1; j3 <= j + 3; ++j3) {
            for (int i2 = i - 4; i2 <= i - 1; ++i2) {
                for (int k3 = k - 5; k3 <= k - 1; ++k3) {
                    this.setBlockAndNotifyAdequately(world, i2, j3, k3, LOTRMod.brick2, 2);
                }
                for (int k3 = k + 1; k3 <= k + 5; ++k3) {
                    this.setBlockAndNotifyAdequately(world, i2, j3, k3, LOTRMod.brick2, 2);
                }
            }
            for (int i2 = i - 2; i2 <= i + 5; ++i2) {
                this.setBlockAndNotifyAdequately(world, i2, j3, k - 1, LOTRMod.brick2, 2);
                this.setBlockAndNotifyAdequately(world, i2, j3, k + 1, LOTRMod.brick2, 2);
            }
        }
        this.setBlockAndNotifyAdequately(world, i + 3, j + 1, k - 1, LOTRMod.doorSpruce, 1);
        this.setBlockAndNotifyAdequately(world, i + 3, j + 2, k - 1, LOTRMod.doorSpruce, 8);
        this.setBlockAndNotifyAdequately(world, i + 3, j + 1, k + 1, LOTRMod.doorSpruce, 3);
        this.setBlockAndNotifyAdequately(world, i + 3, j + 2, k + 1, LOTRMod.doorSpruce, 8);
        for (int k2 = k - 5; k2 <= k + 2; k2 += 7) {
            this.setBlockAndNotifyAdequately(world, i + 1, j + 1, k2, LOTRMod.dwarvenBed, 1);
            this.setBlockAndNotifyAdequately(world, i, j + 1, k2, LOTRMod.dwarvenBed, 9);
            this.setBlockAndNotifyAdequately(world, i + 1, j + 1, k2 + 3, LOTRMod.dwarvenBed, 1);
            this.setBlockAndNotifyAdequately(world, i, j + 1, k2 + 3, LOTRMod.dwarvenBed, 9);
            this.setBlockAndNotifyAdequately(world, i, j + 1, k2 + 1, (Block)Blocks.chest, 0);
            this.setBlockAndNotifyAdequately(world, i, j + 1, k2 + 2, (Block)Blocks.chest, 0);
            LOTRChestContents.fillChest(world, random, i, j + 1, k2 + 1, LOTRChestContents.DWARF_HOUSE_LARDER);
            LOTRChestContents.fillChest(world, random, i, j + 1, k2 + 2, DRChestContents.RED_MOUNTAINS_STRONGHOLD);
            this.setBlockAndNotifyAdequately(world, i + 3, j + 3, k2 + 1, DRRegistry.chandelier, 0);
            this.setBlockAndNotifyAdequately(world, i + 5, j + 1, k2, Blocks.planks, 1);
            this.setBlockAndNotifyAdequately(world, i + 5, j + 1, k2 + 3, Blocks.planks, 1);
            this.placeBarrel(world, random, i + 5, j + 2, k2, 4, LOTRFoods.DWARF_DRINK);
            this.placeBarrel(world, random, i + 5, j + 2, k2 + 3, 4, LOTRFoods.DWARF_DRINK);
            this.setBlockAndNotifyAdequately(world, i + 5, j + 1, k2 + 1, Blocks.furnace, 0);
            this.setBlockMetadata(world, i + 5, j + 1, k2 + 1, 4);
            this.setBlockAndNotifyAdequately(world, i + 5, j + 1, k2 + 2, Blocks.furnace, 0);
            this.setBlockMetadata(world, i + 5, j + 1, k2 + 2, 4);
        }
        this.setAir(world, i - 5, j + 4, k);
        int stairX = 1;
        for (int j2 = j + 1; j2 <= j + 4; ++j2) {
            this.setAir(world, i - 5, j + 4, k - stairX);
            this.setAir(world, i - 5, j + 4, k + stairX);
            this.setBlockAndNotifyAdequately(world, i - 5, j2, k - stairX, LOTRMod.stairsDwarvenBrick, 3);
            this.setBlockAndNotifyAdequately(world, i - 5, j2, k + stairX, LOTRMod.stairsDwarvenBrick, 2);
            for (int j4 = j2 - 1; j4 > j; --j4) {
                this.setBlockAndNotifyAdequately(world, i - 5, j4, k - stairX, LOTRMod.brick, 6);
                this.setBlockAndNotifyAdequately(world, i - 5, j4, k + stairX, LOTRMod.brick, 6);
            }
            ++stairX;
        }
        for (int j2 = j + 1; j2 <= j + 3; ++j2) {
            this.setBlockAndNotifyAdequately(world, i - 5, j2, k - stairX, LOTRMod.brick, 6);
            this.setBlockAndNotifyAdequately(world, i - 5, j2, k + stairX, LOTRMod.brick, 6);
        }
        for (int k4 = k - 5; k4 <= k + 5; k4 += 10) {
            this.setBlockAndNotifyAdequately(world, i - 2, j + 5, k4, Blocks.planks, 1);
            this.setBlockAndNotifyAdequately(world, i - 2, j + 6, k4, (Block)Blocks.wooden_slab, 1);
            this.setBlockAndNotifyAdequately(world, i + 2, j + 5, k4, Blocks.planks, 1);
            this.setBlockAndNotifyAdequately(world, i + 2, j + 6, k4, (Block)Blocks.wooden_slab, 1);
            this.setBlockAndNotifyAdequately(world, i, j + 5, k4, DRRegistry.redDwarvenTable, 0);
            this.setBlockAndNotifyAdequately(world, i - 1, j + 5, k4, LOTRMod.dwarvenForge, 0);
            this.setBlockAndNotifyAdequately(world, i + 1, j + 5, k4, LOTRMod.dwarvenForge, 0);
        }
        this.setBlockAndNotifyAdequately(world, i + 6, j + 6, k - 3, LOTRMod.brick3, 12);
        this.setBlockAndNotifyAdequately(world, i + 6, j + 6, k + 3, LOTRMod.brick3, 12);
        stairX = 4;
        for (int j2 = j + 5; j2 <= j + 8; ++j2) {
            this.setAir(world, i - 4, j + 8, k - stairX);
            this.setAir(world, i - 4, j + 8, k + stairX);
            this.setBlockAndNotifyAdequately(world, i - 4, j2, k - stairX, LOTRMod.stairsDwarvenBrick, 2);
            this.setBlockAndNotifyAdequately(world, i - 4, j2, k + stairX, LOTRMod.stairsDwarvenBrick, 3);
            for (int j4 = j2 - 1; j4 > j + 4; --j4) {
                this.setBlockAndNotifyAdequately(world, i - 4, j4, k - stairX, LOTRMod.brick, 6);
                this.setBlockAndNotifyAdequately(world, i - 4, j4, k + stairX, LOTRMod.brick, 6);
            }
            --stairX;
        }
        for (int j2 = j + 5; j2 <= j + 7; ++j2) {
            this.setBlockAndNotifyAdequately(world, i - 4, j2, k, LOTRMod.brick, 6);
        }
        this.setBlockAndNotifyAdequately(world, i - 4, j + 6, k, LOTRMod.brick3, 12);
        for (int i2 = i + 7; i2 <= i + 8; ++i2) {
            for (int k3 = k - 4; k3 <= k + 4; ++k3) {
                this.placeBalconySection(world, i2, j, k3, false, false);
            }
            this.placeBalconySection(world, i2, j, k - 5, true, false);
            this.placeBalconySection(world, i2, j, k + 5, true, false);
        }
        for (int k4 = k - 2; k4 <= k + 2; ++k4) {
            this.placeBalconySection(world, i + 9, j, k4, false, false);
        }
        for (int k4 = k - 5; k4 <= k + 5; ++k4) {
            if (Math.abs(k4 - k) >= 3) {
                this.placeBalconySection(world, i + 9, j, k4, true, false);
            }
        }
        for (int k4 = k - 1; k4 <= k + 1; ++k4) {
            this.placeBalconySection(world, i + 10, j, k4, false, false);
        }
        for (int k4 = k - 3; k4 <= k + 3; ++k4) {
            if (Math.abs(k4 - k) >= 2) {
                this.placeBalconySection(world, i + 10, j, k4, true, false);
            }
        }
        for (int k4 = k - 2; k4 <= k + 2; ++k4) {
            if (Math.abs(k4 - k) == 0) {
                this.placeBalconySection(world, i + 11, j, k4, true, true);
            }
            else {
                this.placeBalconySection(world, i + 11, j, k4, true, false);
            }
        }
        this.setBlockAndNotifyAdequately(world, i + 6, j + 4, k, LOTRMod.slabDouble3, 5);
        this.setAir(world, i + 6, j + 5, k);
        this.setAir(world, i + 6, j + 6, k);
        this.setBlockAndNotifyAdequately(world, i + 6, j, k, Blocks.planks, 1);
        this.setBlockAndNotifyAdequately(world, i + 6, j + 1, k, LOTRMod.doorSpruce, 2);
        this.setBlockAndNotifyAdequately(world, i + 6, j + 2, k, LOTRMod.doorSpruce, 8);
        this.setBlockAndNotifyAdequately(world, i + 8, j + 3, k, DRRegistry.chandelier, 0);
        for (int j2 = j + 1; j2 <= j + 2; ++j2) {
            for (int i3 = i + 7; i3 <= i + 8; ++i3) {
                this.placeRandomOre(world, random, i3, j2, k - 4);
                this.placeRandomOre(world, random, i3, j2, k - 3);
                this.placeRandomOre(world, random, i3, j2, k + 3);
                this.placeRandomOre(world, random, i3, j2, k + 4);
            }
            this.placeRandomOre(world, random, i + 9, j2, k - 2);
            this.placeRandomOre(world, random, i + 9, j2, k + 2);
            for (int k3 = k - 1; k3 <= k + 1; ++k3) {
                this.placeRandomOre(world, random, i + 10, j2, k3);
            }
        }
        this.setBlockAndNotifyAdequately(world, i + 3, j + 9, k, LOTRMod.commandTable, 0);
    }
    
    public void generateFacingNorth(final World world, final Random random, final int i, final int j, final int k) {
        for (int i2 = i - 6; i2 <= i + 6; ++i2) {
            this.setBlockAndNotifyAdequately(world, i2, j + 1, k + 7, LOTRMod.slabSingle3, 5);
            this.setGrassToDirt(world, i2, j, k + 7);
            for (int j2 = j; !LOTRMod.isOpaque(world, i2, j2, k + 7) && j2 >= 0; --j2) {
                this.setBlockAndNotifyAdequately(world, i2, j2, k + 7, LOTRMod.pillar, 4);
                this.setGrassToDirt(world, i2, j2 - 1, k + 7);
            }
        }
        for (int j3 = j + 1; j3 <= j + 2; ++j3) {
            this.setAir(world, i, j3, k + 6);
            this.setBlockAndNotifyAdequately(world, i - 1, j3, k + 7, LOTRMod.pillar, 4);
            this.setBlockAndNotifyAdequately(world, i + 1, j3, k + 7, LOTRMod.pillar, 4);
        }
        this.setBlockAndNotifyAdequately(world, i, j, k + 7, Blocks.planks, 1);
        this.setBlockAndNotifyAdequately(world, i, j, k + 6, Blocks.planks, 1);
        this.setBlockAndNotifyAdequately(world, i, j + 1, k + 7, LOTRMod.doorSpruce, 3);
        this.setBlockAndNotifyAdequately(world, i, j + 2, k + 7, LOTRMod.doorSpruce, 8);
        this.setBlockAndNotifyAdequately(world, i - 1, j + 3, k + 7, LOTRMod.stairsDwarvenBrick, 0);
        this.setBlockAndNotifyAdequately(world, i, j + 3, k + 7, LOTRMod.brick3, 12);
        this.setBlockAndNotifyAdequately(world, i + 1, j + 3, k + 7, LOTRMod.stairsDwarvenBrick, 1);
        this.setBlockAndNotifyAdequately(world, i, j + 4, k + 7, LOTRMod.slabSingle, 7);
        this.placeWallBanner(world, i, j + 6, k + 6, 0, DRItemBanner.RED_MOUNTAINS);
        for (int j3 = j + 1; j3 <= j + 3; ++j3) {
            for (int k2 = k + 4; k2 >= k + 1; --k2) {
                for (int i3 = i - 5; i3 <= i - 1; ++i3) {
                    this.setBlockAndNotifyAdequately(world, i3, j3, k2, LOTRMod.brick2, 2);
                }
                for (int i3 = i + 1; i3 <= i + 5; ++i3) {
                    this.setBlockAndNotifyAdequately(world, i3, j3, k2, LOTRMod.brick2, 2);
                }
            }
            for (int k2 = k + 2; k2 >= k - 5; --k2) {
                this.setBlockAndNotifyAdequately(world, i - 1, j3, k2, LOTRMod.brick2, 2);
                this.setBlockAndNotifyAdequately(world, i + 1, j3, k2, LOTRMod.brick2, 2);
            }
        }
        this.setBlockAndNotifyAdequately(world, i - 1, j + 1, k - 3, LOTRMod.doorSpruce, 0);
        this.setBlockAndNotifyAdequately(world, i - 1, j + 2, k - 3, LOTRMod.doorSpruce, 8);
        this.setBlockAndNotifyAdequately(world, i + 1, j + 1, k - 3, LOTRMod.doorSpruce, 2);
        this.setBlockAndNotifyAdequately(world, i + 1, j + 2, k - 3, LOTRMod.doorSpruce, 8);
        for (int i2 = i - 5; i2 <= i + 2; i2 += 7) {
            this.setBlockAndNotifyAdequately(world, i2, j + 1, k - 1, LOTRMod.dwarvenBed, 0);
            this.setBlockAndNotifyAdequately(world, i2, j + 1, k, LOTRMod.dwarvenBed, 8);
            this.setBlockAndNotifyAdequately(world, i2 + 3, j + 1, k - 1, LOTRMod.dwarvenBed, 0);
            this.setBlockAndNotifyAdequately(world, i2 + 3, j + 1, k, LOTRMod.dwarvenBed, 8);
            this.setBlockAndNotifyAdequately(world, i2 + 1, j + 1, k, (Block)Blocks.chest, 0);
            this.setBlockAndNotifyAdequately(world, i2 + 2, j + 1, k, (Block)Blocks.chest, 0);
            LOTRChestContents.fillChest(world, random, i2 + 1, j + 1, k, LOTRChestContents.DWARF_HOUSE_LARDER);
            LOTRChestContents.fillChest(world, random, i2 + 2, j + 1, k, DRChestContents.RED_MOUNTAINS_STRONGHOLD);
            this.setBlockAndNotifyAdequately(world, i2 + 1, j + 3, k - 3, DRRegistry.chandelier, 0);
            this.setBlockAndNotifyAdequately(world, i2, j + 1, k - 5, Blocks.planks, 1);
            this.setBlockAndNotifyAdequately(world, i2 + 3, j + 1, k - 5, Blocks.planks, 1);
            this.placeBarrel(world, random, i2, j + 2, k - 5, 3, LOTRFoods.DWARF_DRINK);
            this.placeBarrel(world, random, i2 + 3, j + 2, k - 5, 3, LOTRFoods.DWARF_DRINK);
            this.setBlockAndNotifyAdequately(world, i2 + 1, j + 1, k - 5, Blocks.furnace, 0);
            this.setBlockMetadata(world, i2 + 1, j + 1, k - 5, 3);
            this.setBlockAndNotifyAdequately(world, i2 + 2, j + 1, k - 5, Blocks.furnace, 0);
            this.setBlockMetadata(world, i2 + 2, j + 1, k - 5, 3);
        }
        this.setAir(world, i, j + 4, k + 5);
        int stairX = 1;
        for (int j2 = j + 1; j2 <= j + 4; ++j2) {
            this.setAir(world, i - stairX, j + 4, k + 5);
            this.setAir(world, i + stairX, j + 4, k + 5);
            this.setBlockAndNotifyAdequately(world, i - stairX, j2, k + 5, LOTRMod.stairsDwarvenBrick, 1);
            this.setBlockAndNotifyAdequately(world, i + stairX, j2, k + 5, LOTRMod.stairsDwarvenBrick, 0);
            for (int j4 = j2 - 1; j4 > j; --j4) {
                this.setBlockAndNotifyAdequately(world, i - stairX, j4, k + 5, LOTRMod.brick, 6);
                this.setBlockAndNotifyAdequately(world, i + stairX, j4, k + 5, LOTRMod.brick, 6);
            }
            ++stairX;
        }
        for (int j2 = j + 1; j2 <= j + 3; ++j2) {
            this.setBlockAndNotifyAdequately(world, i - stairX, j2, k + 5, LOTRMod.brick, 6);
            this.setBlockAndNotifyAdequately(world, i + stairX, j2, k + 5, LOTRMod.brick, 6);
        }
        for (int i4 = i - 5; i4 <= i + 5; i4 += 10) {
            this.setBlockAndNotifyAdequately(world, i4, j + 5, k + 2, Blocks.planks, 1);
            this.setBlockAndNotifyAdequately(world, i4, j + 6, k + 2, (Block)Blocks.wooden_slab, 1);
            this.setBlockAndNotifyAdequately(world, i4, j + 5, k - 2, Blocks.planks, 1);
            this.setBlockAndNotifyAdequately(world, i4, j + 6, k - 2, (Block)Blocks.wooden_slab, 1);
            this.setBlockAndNotifyAdequately(world, i4, j + 5, k, DRRegistry.redDwarvenTable, 0);
            this.setBlockAndNotifyAdequately(world, i4, j + 5, k + 1, LOTRMod.dwarvenForge, 0);
            this.setBlockAndNotifyAdequately(world, i4, j + 5, k - 1, LOTRMod.dwarvenForge, 0);
        }
        this.setBlockAndNotifyAdequately(world, i - 3, j + 6, k - 6, LOTRMod.brick3, 12);
        this.setBlockAndNotifyAdequately(world, i + 3, j + 6, k - 6, LOTRMod.brick3, 12);
        stairX = 4;
        for (int j2 = j + 5; j2 <= j + 8; ++j2) {
            this.setAir(world, i - stairX, j + 8, k + 4);
            this.setAir(world, i + stairX, j + 8, k + 4);
            this.setBlockAndNotifyAdequately(world, i - stairX, j2, k + 4, LOTRMod.stairsDwarvenBrick, 0);
            this.setBlockAndNotifyAdequately(world, i + stairX, j2, k + 4, LOTRMod.stairsDwarvenBrick, 1);
            for (int j4 = j2 - 1; j4 > j + 4; --j4) {
                this.setBlockAndNotifyAdequately(world, i - stairX, j4, k + 4, LOTRMod.brick, 6);
                this.setBlockAndNotifyAdequately(world, i + stairX, j4, k + 4, LOTRMod.brick, 6);
            }
            --stairX;
        }
        for (int j2 = j + 5; j2 <= j + 7; ++j2) {
            this.setBlockAndNotifyAdequately(world, i, j2, k + 4, LOTRMod.brick, 6);
        }
        this.setBlockAndNotifyAdequately(world, i, j + 6, k + 4, LOTRMod.brick3, 12);
        for (int k2 = k - 7; k2 >= k - 8; --k2) {
            for (int i3 = i - 4; i3 <= i + 4; ++i3) {
                this.placeBalconySection(world, i3, j, k2, false, false);
            }
            this.placeBalconySection(world, i - 5, j, k2, true, false);
            this.placeBalconySection(world, i + 5, j, k2, true, false);
        }
        for (int i4 = i - 2; i4 <= i + 2; ++i4) {
            this.placeBalconySection(world, i4, j, k - 9, false, false);
        }
        for (int i4 = i - 5; i4 <= i + 5; ++i4) {
            if (Math.abs(i4 - i) >= 3) {
                this.placeBalconySection(world, i4, j, k - 9, true, false);
            }
        }
        for (int i4 = i - 1; i4 <= i + 1; ++i4) {
            this.placeBalconySection(world, i4, j, k - 10, false, false);
        }
        for (int i4 = i - 3; i4 <= i + 3; ++i4) {
            if (Math.abs(i4 - i) >= 2) {
                this.placeBalconySection(world, i4, j, k - 10, true, false);
            }
        }
        for (int i4 = i - 2; i4 <= i + 2; ++i4) {
            if (Math.abs(i4 - i) == 0) {
                this.placeBalconySection(world, i4, j, k - 11, true, true);
            }
            else {
                this.placeBalconySection(world, i4, j, k - 11, true, false);
            }
        }
        this.setBlockAndNotifyAdequately(world, i, j + 4, k - 6, LOTRMod.slabDouble3, 5);
        this.setAir(world, i, j + 5, k - 6);
        this.setAir(world, i, j + 6, k - 6);
        this.setBlockAndNotifyAdequately(world, i, j, k - 6, Blocks.planks, 1);
        this.setBlockAndNotifyAdequately(world, i, j + 1, k - 6, LOTRMod.doorSpruce, 1);
        this.setBlockAndNotifyAdequately(world, i, j + 2, k - 6, LOTRMod.doorSpruce, 8);
        this.setBlockAndNotifyAdequately(world, i, j + 3, k - 8, DRRegistry.chandelier, 0);
        for (int j2 = j + 1; j2 <= j + 2; ++j2) {
            for (int k3 = k - 7; k3 >= k - 8; --k3) {
                this.placeRandomOre(world, random, i - 4, j2, k3);
                this.placeRandomOre(world, random, i - 3, j2, k3);
                this.placeRandomOre(world, random, i + 3, j2, k3);
                this.placeRandomOre(world, random, i + 4, j2, k3);
            }
            this.placeRandomOre(world, random, i - 2, j2, k - 9);
            this.placeRandomOre(world, random, i + 2, j2, k - 9);
            for (int i3 = i - 1; i3 <= i + 1; ++i3) {
                this.placeRandomOre(world, random, i3, j2, k - 10);
            }
        }
        this.setBlockAndNotifyAdequately(world, i, j + 9, k - 3, LOTRMod.commandTable, 0);
    }
    
    public void generateFacingSouth(final World world, final Random random, final int i, final int j, final int k) {
        for (int i2 = i - 6; i2 <= i + 6; ++i2) {
            this.setBlockAndNotifyAdequately(world, i2, j + 1, k - 7, LOTRMod.slabSingle3, 5);
            this.setGrassToDirt(world, i2, j, k - 7);
            for (int j2 = j; !LOTRMod.isOpaque(world, i2, j2, k - 7) && j2 >= 0; --j2) {
                this.setBlockAndNotifyAdequately(world, i2, j2, k - 7, LOTRMod.pillar, 4);
                this.setGrassToDirt(world, i2, j2 - 1, k - 7);
            }
        }
        for (int j3 = j + 1; j3 <= j + 2; ++j3) {
            this.setAir(world, i, j3, k - 6);
            this.setBlockAndNotifyAdequately(world, i - 1, j3, k - 7, LOTRMod.pillar, 4);
            this.setBlockAndNotifyAdequately(world, i + 1, j3, k - 7, LOTRMod.pillar, 4);
        }
        this.setBlockAndNotifyAdequately(world, i, j, k - 7, Blocks.planks, 1);
        this.setBlockAndNotifyAdequately(world, i, j, k - 6, Blocks.planks, 1);
        this.setBlockAndNotifyAdequately(world, i, j + 1, k - 7, LOTRMod.doorSpruce, 1);
        this.setBlockAndNotifyAdequately(world, i, j + 2, k - 7, LOTRMod.doorSpruce, 8);
        this.setBlockAndNotifyAdequately(world, i - 1, j + 3, k - 7, LOTRMod.stairsDwarvenBrick, 0);
        this.setBlockAndNotifyAdequately(world, i, j + 3, k - 7, LOTRMod.brick3, 12);
        this.setBlockAndNotifyAdequately(world, i + 1, j + 3, k - 7, LOTRMod.stairsDwarvenBrick, 1);
        this.setBlockAndNotifyAdequately(world, i, j + 4, k - 7, LOTRMod.slabSingle, 7);
        this.placeWallBanner(world, i, j + 6, k - 6, 2, DRItemBanner.RED_MOUNTAINS);
        for (int j3 = j + 1; j3 <= j + 3; ++j3) {
            for (int k2 = k - 4; k2 <= k - 1; ++k2) {
                for (int i3 = i - 5; i3 <= i - 1; ++i3) {
                    this.setBlockAndNotifyAdequately(world, i3, j3, k2, LOTRMod.brick2, 2);
                }
                for (int i3 = i + 1; i3 <= i + 5; ++i3) {
                    this.setBlockAndNotifyAdequately(world, i3, j3, k2, LOTRMod.brick2, 2);
                }
            }
            for (int k2 = k - 2; k2 <= k + 5; ++k2) {
                this.setBlockAndNotifyAdequately(world, i - 1, j3, k2, LOTRMod.brick2, 2);
                this.setBlockAndNotifyAdequately(world, i + 1, j3, k2, LOTRMod.brick2, 2);
            }
        }
        this.setBlockAndNotifyAdequately(world, i - 1, j + 1, k + 3, LOTRMod.doorSpruce, 0);
        this.setBlockAndNotifyAdequately(world, i - 1, j + 2, k + 3, LOTRMod.doorSpruce, 8);
        this.setBlockAndNotifyAdequately(world, i + 1, j + 1, k + 3, LOTRMod.doorSpruce, 2);
        this.setBlockAndNotifyAdequately(world, i + 1, j + 2, k + 3, LOTRMod.doorSpruce, 8);
        for (int i2 = i - 5; i2 <= i + 2; i2 += 7) {
            this.setBlockAndNotifyAdequately(world, i2, j + 1, k + 1, LOTRMod.dwarvenBed, 2);
            this.setBlockAndNotifyAdequately(world, i2, j + 1, k, LOTRMod.dwarvenBed, 10);
            this.setBlockAndNotifyAdequately(world, i2 + 3, j + 1, k + 1, LOTRMod.dwarvenBed, 2);
            this.setBlockAndNotifyAdequately(world, i2 + 3, j + 1, k, LOTRMod.dwarvenBed, 10);
            this.setBlockAndNotifyAdequately(world, i2 + 1, j + 1, k, (Block)Blocks.chest, 0);
            this.setBlockAndNotifyAdequately(world, i2 + 2, j + 1, k, (Block)Blocks.chest, 0);
            LOTRChestContents.fillChest(world, random, i2 + 1, j + 1, k, LOTRChestContents.DWARF_HOUSE_LARDER);
            LOTRChestContents.fillChest(world, random, i2 + 2, j + 1, k, DRChestContents.RED_MOUNTAINS_STRONGHOLD);
            this.setBlockAndNotifyAdequately(world, i2 + 1, j + 3, k + 3, DRRegistry.chandelier, 0);
            this.setBlockAndNotifyAdequately(world, i2, j + 1, k + 5, Blocks.planks, 1);
            this.setBlockAndNotifyAdequately(world, i2 + 3, j + 1, k + 5, Blocks.planks, 1);
            this.placeBarrel(world, random, i2, j + 2, k + 5, 2, LOTRFoods.DWARF_DRINK);
            this.placeBarrel(world, random, i2 + 3, j + 2, k + 5, 2, LOTRFoods.DWARF_DRINK);
            this.setBlockAndNotifyAdequately(world, i2 + 1, j + 1, k + 5, Blocks.furnace, 0);
            this.setBlockMetadata(world, i2 + 1, j + 1, k + 5, 2);
            this.setBlockAndNotifyAdequately(world, i2 + 2, j + 1, k + 5, Blocks.furnace, 0);
            this.setBlockMetadata(world, i2 + 2, j + 1, k + 5, 2);
        }
        this.setAir(world, i, j + 4, k - 5);
        int stairX = 1;
        for (int j2 = j + 1; j2 <= j + 4; ++j2) {
            this.setAir(world, i - stairX, j + 4, k - 5);
            this.setAir(world, i + stairX, j + 4, k - 5);
            this.setBlockAndNotifyAdequately(world, i - stairX, j2, k - 5, LOTRMod.stairsDwarvenBrick, 1);
            this.setBlockAndNotifyAdequately(world, i + stairX, j2, k - 5, LOTRMod.stairsDwarvenBrick, 0);
            for (int j4 = j2 - 1; j4 > j; --j4) {
                this.setBlockAndNotifyAdequately(world, i - stairX, j4, k - 5, LOTRMod.brick, 6);
                this.setBlockAndNotifyAdequately(world, i + stairX, j4, k - 5, LOTRMod.brick, 6);
            }
            ++stairX;
        }
        for (int j2 = j + 1; j2 <= j + 3; ++j2) {
            this.setBlockAndNotifyAdequately(world, i - stairX, j2, k - 5, LOTRMod.brick, 6);
            this.setBlockAndNotifyAdequately(world, i + stairX, j2, k - 5, LOTRMod.brick, 6);
        }
        for (int i4 = i - 5; i4 <= i + 5; i4 += 10) {
            this.setBlockAndNotifyAdequately(world, i4, j + 5, k - 2, Blocks.planks, 1);
            this.setBlockAndNotifyAdequately(world, i4, j + 6, k - 2, (Block)Blocks.wooden_slab, 1);
            this.setBlockAndNotifyAdequately(world, i4, j + 5, k + 2, Blocks.planks, 1);
            this.setBlockAndNotifyAdequately(world, i4, j + 6, k + 2, (Block)Blocks.wooden_slab, 1);
            this.setBlockAndNotifyAdequately(world, i4, j + 5, k, DRRegistry.redDwarvenTable, 0);
            this.setBlockAndNotifyAdequately(world, i4, j + 5, k - 1, LOTRMod.dwarvenForge, 0);
            this.setBlockAndNotifyAdequately(world, i4, j + 5, k + 1, LOTRMod.dwarvenForge, 0);
        }
        this.setBlockAndNotifyAdequately(world, i - 3, j + 6, k + 6, LOTRMod.brick3, 12);
        this.setBlockAndNotifyAdequately(world, i + 3, j + 6, k + 6, LOTRMod.brick3, 12);
        stairX = 4;
        for (int j2 = j + 5; j2 <= j + 8; ++j2) {
            this.setAir(world, i - stairX, j + 8, k - 4);
            this.setAir(world, i + stairX, j + 8, k - 4);
            this.setBlockAndNotifyAdequately(world, i - stairX, j2, k - 4, LOTRMod.stairsDwarvenBrick, 0);
            this.setBlockAndNotifyAdequately(world, i + stairX, j2, k - 4, LOTRMod.stairsDwarvenBrick, 1);
            for (int j4 = j2 - 1; j4 > j + 4; --j4) {
                this.setBlockAndNotifyAdequately(world, i - stairX, j4, k - 4, LOTRMod.brick, 6);
                this.setBlockAndNotifyAdequately(world, i + stairX, j4, k - 4, LOTRMod.brick, 6);
            }
            --stairX;
        }
        for (int j2 = j + 5; j2 <= j + 7; ++j2) {
            this.setBlockAndNotifyAdequately(world, i, j2, k - 4, LOTRMod.brick, 6);
        }
        this.setBlockAndNotifyAdequately(world, i, j + 6, k - 4, LOTRMod.brick3, 12);
        for (int k2 = k + 7; k2 <= k + 8; ++k2) {
            for (int i3 = i - 4; i3 <= i + 4; ++i3) {
                this.placeBalconySection(world, i3, j, k2, false, false);
            }
            this.placeBalconySection(world, i - 5, j, k2, true, false);
            this.placeBalconySection(world, i + 5, j, k2, true, false);
        }
        for (int i4 = i - 2; i4 <= i + 2; ++i4) {
            this.placeBalconySection(world, i4, j, k + 9, false, false);
        }
        for (int i4 = i - 5; i4 <= i + 5; ++i4) {
            if (Math.abs(i4 - i) >= 3) {
                this.placeBalconySection(world, i4, j, k + 9, true, false);
            }
        }
        for (int i4 = i - 1; i4 <= i + 1; ++i4) {
            this.placeBalconySection(world, i4, j, k + 10, false, false);
        }
        for (int i4 = i - 3; i4 <= i + 3; ++i4) {
            if (Math.abs(i4 - i) >= 2) {
                this.placeBalconySection(world, i4, j, k + 10, true, false);
            }
        }
        for (int i4 = i - 2; i4 <= i + 2; ++i4) {
            if (Math.abs(i4 - i) == 0) {
                this.placeBalconySection(world, i4, j, k + 11, true, true);
            }
            else {
                this.placeBalconySection(world, i4, j, k + 11, true, false);
            }
        }
        this.setBlockAndNotifyAdequately(world, i, j + 4, k + 6, LOTRMod.slabDouble3, 5);
        this.setAir(world, i, j + 5, k + 6);
        this.setAir(world, i, j + 6, k + 6);
        this.setBlockAndNotifyAdequately(world, i, j, k + 6, Blocks.planks, 1);
        this.setBlockAndNotifyAdequately(world, i, j + 1, k + 6, LOTRMod.doorSpruce, 3);
        this.setBlockAndNotifyAdequately(world, i, j + 2, k + 6, LOTRMod.doorSpruce, 8);
        this.setBlockAndNotifyAdequately(world, i, j + 3, k + 8, DRRegistry.chandelier, 0);
        for (int j2 = j + 1; j2 <= j + 2; ++j2) {
            for (int k3 = k + 7; k3 <= k + 8; ++k3) {
                this.placeRandomOre(world, random, i - 4, j2, k3);
                this.placeRandomOre(world, random, i - 3, j2, k3);
                this.placeRandomOre(world, random, i + 3, j2, k3);
                this.placeRandomOre(world, random, i + 4, j2, k3);
            }
            this.placeRandomOre(world, random, i - 2, j2, k + 9);
            this.placeRandomOre(world, random, i + 2, j2, k + 9);
            for (int i3 = i - 1; i3 <= i + 1; ++i3) {
                this.placeRandomOre(world, random, i3, j2, k + 10);
            }
        }
        this.setBlockAndNotifyAdequately(world, i, j + 9, k + 3, LOTRMod.commandTable, 0);
    }
    
    public void generateFacingWest(final World world, final Random random, final int i, final int j, final int k) {
        for (int k2 = k - 6; k2 <= k + 6; ++k2) {
            this.setBlockAndNotifyAdequately(world, i + 7, j + 1, k2, LOTRMod.slabSingle3, 5);
            this.setGrassToDirt(world, i + 7, j, k2);
            for (int j2 = j; !LOTRMod.isOpaque(world, i + 7, j2, k2) && j2 >= 0; --j2) {
                this.setBlockAndNotifyAdequately(world, i + 7, j2, k2, LOTRMod.pillar, 4);
                this.setGrassToDirt(world, i + 7, j2 - 1, k2);
            }
        }
        for (int j3 = j + 1; j3 <= j + 2; ++j3) {
            this.setAir(world, i + 6, j3, k);
            this.setBlockAndNotifyAdequately(world, i + 7, j3, k - 1, LOTRMod.pillar, 4);
            this.setBlockAndNotifyAdequately(world, i + 7, j3, k + 1, LOTRMod.pillar, 4);
        }
        this.setBlockAndNotifyAdequately(world, i + 7, j, k, Blocks.planks, 1);
        this.setBlockAndNotifyAdequately(world, i + 6, j, k, Blocks.planks, 1);
        this.setBlockAndNotifyAdequately(world, i + 7, j + 1, k, LOTRMod.doorSpruce, 2);
        this.setBlockAndNotifyAdequately(world, i + 7, j + 2, k, LOTRMod.doorSpruce, 8);
        this.setBlockAndNotifyAdequately(world, i + 7, j + 3, k - 1, LOTRMod.stairsDwarvenBrick, 2);
        this.setBlockAndNotifyAdequately(world, i + 7, j + 3, k, LOTRMod.brick3, 12);
        this.setBlockAndNotifyAdequately(world, i + 7, j + 3, k + 1, LOTRMod.stairsDwarvenBrick, 3);
        this.setBlockAndNotifyAdequately(world, i + 7, j + 4, k, LOTRMod.slabSingle, 7);
        this.placeWallBanner(world, i + 6, j + 6, k, 3, DRItemBanner.RED_MOUNTAINS);
        for (int j3 = j + 1; j3 <= j + 3; ++j3) {
            for (int i2 = i + 4; i2 >= i + 1; --i2) {
                for (int k3 = k - 5; k3 <= k - 1; ++k3) {
                    this.setBlockAndNotifyAdequately(world, i2, j3, k3, LOTRMod.brick2, 2);
                }
                for (int k3 = k + 1; k3 <= k + 5; ++k3) {
                    this.setBlockAndNotifyAdequately(world, i2, j3, k3, LOTRMod.brick2, 2);
                }
            }
            for (int i2 = i + 2; i2 >= i - 5; --i2) {
                this.setBlockAndNotifyAdequately(world, i2, j3, k - 1, LOTRMod.brick2, 2);
                this.setBlockAndNotifyAdequately(world, i2, j3, k + 1, LOTRMod.brick2, 2);
            }
        }
        this.setBlockAndNotifyAdequately(world, i - 3, j + 1, k - 1, LOTRMod.doorSpruce, 1);
        this.setBlockAndNotifyAdequately(world, i - 3, j + 2, k - 1, LOTRMod.doorSpruce, 8);
        this.setBlockAndNotifyAdequately(world, i - 3, j + 1, k + 1, LOTRMod.doorSpruce, 3);
        this.setBlockAndNotifyAdequately(world, i - 3, j + 2, k + 1, LOTRMod.doorSpruce, 8);
        for (int k2 = k - 5; k2 <= k + 2; k2 += 7) {
            this.setBlockAndNotifyAdequately(world, i - 1, j + 1, k2, LOTRMod.dwarvenBed, 3);
            this.setBlockAndNotifyAdequately(world, i, j + 1, k2, LOTRMod.dwarvenBed, 11);
            this.setBlockAndNotifyAdequately(world, i - 1, j + 1, k2 + 3, LOTRMod.dwarvenBed, 3);
            this.setBlockAndNotifyAdequately(world, i, j + 1, k2 + 3, LOTRMod.dwarvenBed, 11);
            this.setBlockAndNotifyAdequately(world, i, j + 1, k2 + 1, (Block)Blocks.chest, 0);
            this.setBlockAndNotifyAdequately(world, i, j + 1, k2 + 2, (Block)Blocks.chest, 0);
            LOTRChestContents.fillChest(world, random, i, j + 1, k2 + 1, LOTRChestContents.DWARF_HOUSE_LARDER);
            LOTRChestContents.fillChest(world, random, i, j + 1, k2 + 2, DRChestContents.RED_MOUNTAINS_STRONGHOLD);
            this.setBlockAndNotifyAdequately(world, i - 3, j + 3, k2 + 1, DRRegistry.chandelier, 0);
            this.setBlockAndNotifyAdequately(world, i - 5, j + 1, k2, Blocks.planks, 1);
            this.setBlockAndNotifyAdequately(world, i - 5, j + 1, k2 + 3, Blocks.planks, 1);
            this.placeBarrel(world, random, i - 5, j + 2, k2, 5, LOTRFoods.DWARF_DRINK);
            this.placeBarrel(world, random, i - 5, j + 2, k2 + 3, 5, LOTRFoods.DWARF_DRINK);
            this.setBlockAndNotifyAdequately(world, i - 5, j + 1, k2 + 1, Blocks.furnace, 0);
            this.setBlockMetadata(world, i - 5, j + 1, k2 + 1, 5);
            this.setBlockAndNotifyAdequately(world, i - 5, j + 1, k2 + 2, Blocks.furnace, 0);
            this.setBlockMetadata(world, i - 5, j + 1, k2 + 2, 5);
        }
        this.setAir(world, i + 5, j + 4, k);
        int stairX = 1;
        for (int j2 = j + 1; j2 <= j + 4; ++j2) {
            this.setAir(world, i + 5, j + 4, k - stairX);
            this.setAir(world, i + 5, j + 4, k + stairX);
            this.setBlockAndNotifyAdequately(world, i + 5, j2, k - stairX, LOTRMod.stairsDwarvenBrick, 3);
            this.setBlockAndNotifyAdequately(world, i + 5, j2, k + stairX, LOTRMod.stairsDwarvenBrick, 2);
            for (int j4 = j2 - 1; j4 > j; --j4) {
                this.setBlockAndNotifyAdequately(world, i + 5, j4, k - stairX, LOTRMod.brick, 6);
                this.setBlockAndNotifyAdequately(world, i + 5, j4, k + stairX, LOTRMod.brick, 6);
            }
            ++stairX;
        }
        for (int j2 = j + 1; j2 <= j + 3; ++j2) {
            this.setBlockAndNotifyAdequately(world, i + 5, j2, k - stairX, LOTRMod.brick, 6);
            this.setBlockAndNotifyAdequately(world, i + 5, j2, k + stairX, LOTRMod.brick, 6);
        }
        for (int k4 = k - 5; k4 <= k + 5; k4 += 10) {
            this.setBlockAndNotifyAdequately(world, i - 2, j + 5, k4, Blocks.planks, 1);
            this.setBlockAndNotifyAdequately(world, i - 2, j + 6, k4, (Block)Blocks.wooden_slab, 1);
            this.setBlockAndNotifyAdequately(world, i + 2, j + 5, k4, Blocks.planks, 1);
            this.setBlockAndNotifyAdequately(world, i + 2, j + 6, k4, (Block)Blocks.wooden_slab, 1);
            this.setBlockAndNotifyAdequately(world, i, j + 5, k4, DRRegistry.redDwarvenTable, 0);
            this.setBlockAndNotifyAdequately(world, i - 1, j + 5, k4, LOTRMod.dwarvenForge, 0);
            this.setBlockAndNotifyAdequately(world, i + 1, j + 5, k4, LOTRMod.dwarvenForge, 0);
        }
        this.setBlockAndNotifyAdequately(world, i - 6, j + 6, k - 3, LOTRMod.brick3, 12);
        this.setBlockAndNotifyAdequately(world, i - 6, j + 6, k + 3, LOTRMod.brick3, 12);
        stairX = 4;
        for (int j2 = j + 5; j2 <= j + 8; ++j2) {
            this.setAir(world, i + 4, j + 8, k - stairX);
            this.setAir(world, i + 4, j + 8, k + stairX);
            this.setBlockAndNotifyAdequately(world, i + 4, j2, k - stairX, LOTRMod.stairsDwarvenBrick, 2);
            this.setBlockAndNotifyAdequately(world, i + 4, j2, k + stairX, LOTRMod.stairsDwarvenBrick, 3);
            for (int j4 = j2 - 1; j4 > j + 4; --j4) {
                this.setBlockAndNotifyAdequately(world, i + 4, j4, k - stairX, LOTRMod.brick, 6);
                this.setBlockAndNotifyAdequately(world, i + 4, j4, k + stairX, LOTRMod.brick, 6);
            }
            --stairX;
        }
        for (int j2 = j + 5; j2 <= j + 7; ++j2) {
            this.setBlockAndNotifyAdequately(world, i + 4, j2, k, LOTRMod.brick, 6);
        }
        this.setBlockAndNotifyAdequately(world, i + 4, j + 6, k, LOTRMod.brick3, 12);
        for (int i2 = i - 7; i2 >= i - 8; --i2) {
            for (int k3 = k - 4; k3 <= k + 4; ++k3) {
                this.placeBalconySection(world, i2, j, k3, false, false);
            }
            this.placeBalconySection(world, i2, j, k - 5, true, false);
            this.placeBalconySection(world, i2, j, k + 5, true, false);
        }
        for (int k4 = k - 2; k4 <= k + 2; ++k4) {
            this.placeBalconySection(world, i - 9, j, k4, false, false);
        }
        for (int k4 = k - 5; k4 <= k + 5; ++k4) {
            if (Math.abs(k4 - k) >= 3) {
                this.placeBalconySection(world, i - 9, j, k4, true, false);
            }
        }
        for (int k4 = k - 1; k4 <= k + 1; ++k4) {
            this.placeBalconySection(world, i - 10, j, k4, false, false);
        }
        for (int k4 = k - 3; k4 <= k + 3; ++k4) {
            if (Math.abs(k4 - k) >= 2) {
                this.placeBalconySection(world, i - 10, j, k4, true, false);
            }
        }
        for (int k4 = k - 2; k4 <= k + 2; ++k4) {
            if (Math.abs(k4 - k) == 0) {
                this.placeBalconySection(world, i - 11, j, k4, true, true);
            }
            else {
                this.placeBalconySection(world, i - 11, j, k4, true, false);
            }
        }
        this.setBlockAndNotifyAdequately(world, i - 6, j + 4, k, LOTRMod.slabDouble3, 5);
        this.setAir(world, i - 6, j + 5, k);
        this.setAir(world, i - 6, j + 6, k);
        this.setBlockAndNotifyAdequately(world, i - 6, j, k, Blocks.planks, 1);
        this.setBlockAndNotifyAdequately(world, i - 6, j + 1, k, LOTRMod.doorSpruce, 0);
        this.setBlockAndNotifyAdequately(world, i - 6, j + 2, k, LOTRMod.doorSpruce, 8);
        this.setBlockAndNotifyAdequately(world, i - 8, j + 3, k, DRRegistry.chandelier, 0);
        for (int j2 = j + 1; j2 <= j + 2; ++j2) {
            for (int i3 = i - 7; i3 >= i - 8; --i3) {
                this.placeRandomOre(world, random, i3, j2, k - 4);
                this.placeRandomOre(world, random, i3, j2, k - 3);
                this.placeRandomOre(world, random, i3, j2, k + 3);
                this.placeRandomOre(world, random, i3, j2, k + 4);
            }
            this.placeRandomOre(world, random, i - 9, j2, k - 2);
            this.placeRandomOre(world, random, i - 9, j2, k + 2);
            for (int k3 = k - 1; k3 <= k + 1; ++k3) {
                this.placeRandomOre(world, random, i - 10, j2, k3);
            }
        }
        this.setBlockAndNotifyAdequately(world, i - 3, j + 9, k, LOTRMod.commandTable, 0);
    }
    
    public void placeBalconySection(final World world, final int i, final int j, final int k, final boolean isEdge, final boolean isPillar) {
        if (isEdge) {
            for (int j2 = j + 4; (j2 >= j || !LOTRMod.isOpaque(world, i, j2, k)) && j2 >= 0; --j2) {
                if (isPillar) {
                    this.setBlockAndNotifyAdequately(world, i, j2, k, LOTRMod.pillar, 4);
                }
                else {
                    this.setBlockAndNotifyAdequately(world, i, j2, k, LOTRMod.brick2, 2);
                }
                this.setGrassToDirt(world, i, j2 - 1, k);
            }
            if (isPillar) {
                this.setBlockAndNotifyAdequately(world, i, j + 4, k, LOTRMod.brick3, 12);
            }
            this.setBlockAndNotifyAdequately(world, i, j + 5, k, LOTRMod.brick, 6);
            this.setBlockAndNotifyAdequately(world, i, j + 6, k, LOTRMod.wall2, 3);
        }
        else {
            for (int j2 = j - 1; !LOTRMod.isOpaque(world, i, j2, k) && j2 >= 0; --j2) {
                this.setBlockAndNotifyAdequately(world, i, j2, k, LOTRMod.brick2, 2);
                this.setGrassToDirt(world, i, j2 - 1, k);
            }
            this.setBlockAndNotifyAdequately(world, i, j, k, Blocks.planks, 1);
            for (int j2 = j + 1; j2 <= j + 6; ++j2) {
                this.setAir(world, i, j2, k);
            }
            this.setBlockAndNotifyAdequately(world, i, j + 4, k, LOTRMod.slabDouble3, 5);
        }
    }
    
    public void placeRandomOre(final World world, final Random random, final int i, final int j, final int k) {
        if (!LOTRMod.isOpaque(world, i, j - 1, k) || !random.nextBoolean()) {
            return;
        }
        final int l = random.nextInt(5);
        Block block = null;
        switch (l) {
            case 0: {
                block = Blocks.iron_ore;
                break;
            }
            case 1: {
                block = Blocks.gold_ore;
                break;
            }
            case 2: {
                block = LOTRMod.oreCopper;
                break;
            }
            case 3: {
                block = LOTRMod.oreTin;
                break;
            }
            case 4: {
                block = LOTRMod.oreSilver;
                break;
            }
        }
        this.setBlockAndNotifyAdequately(world, i, j, k, block, 0);
    }
}
