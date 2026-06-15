package drealm.util;

import lotr.common.entity.npc.*;
import lotr.common.LOTRMod;
import lotr.common.entity.animal.*;

public class DRUnitChanger {

    public static void modifyUnits() {
        modifyMordorOrcMercenaryCaptain();
        modifyGondorianCaptain();
        modifyNanUngol();
        modifyBlackrootCaptain();
        modifyBlackUrukCaptain();
        modifyDolAmrothCaptain();
        modifyRangerIthilienCaptain();
        modifyLossarnachCaptain();
        modifyLebenninCaptain();
        modifyPelargirCaptain();
        modifyPinnathGelinCaptain();
        modifyLamedonCaptain();
        modifyNearHaradrimWarlord();
        modifyHarnedorWarlord();
        modifyGulfWarlord();
        modifyUmbarCaptain();
        modifyWoodElfCaptain();
        modifyElfLord();
        modifyUrukHaiMercenaryCaptain();
        modifyDwarfCommander();
        modifyRohirrimMarshal();
        modifyAngmarHillmanChieftain();
        modifyAngmarOrcMercenaryCaptain();
        modifyDolGuldurCaptain();
        modifyDorwinionCaptain();
        modifyDorwinionElfCaptain();
        modifyEasterlingWarlord();
        modifyBlueDwarfCommander();
        modifyHobbitShirriff();
        modifyGundabadOrcMercenaryCaptain();
        modifyRangerNorthCaptain();
        modifyDunlendingWarlord();
        modifyHalfTrollWarlord();
        modifyDaleCaptain();
        modifyTauredainChieftain();
        modifyHighElfLord();
        modifyRivendellLord();
        // Add more method calls for other units
    }
    public static void modifyMordorOrcMercenaryCaptain() {
        LOTRUnitTradeEntries.MORDOR_ORC_MERCENARY_CAPTAIN = new LOTRUnitTradeEntries(0.0f,
                new LOTRUnitTradeEntry(LOTREntityMordorOrc.class, 2500, 700.0f),
                new LOTRUnitTradeEntry(LOTREntityMordorOrcArcher.class, 3500, 1500.0f),
                new LOTRUnitTradeEntry(LOTREntityMordorOrcBombardier.class, 9000, 4500.0f),
                new LOTRUnitTradeEntry(LOTREntityMordorWarg.class, 2500, 700.0f),
                new LOTRUnitTradeEntry(LOTREntityMordorOrc.class, LOTREntityMordorWarg.class, "MordorOrc_Warg", 4000, 2000.0f).setMountArmor(LOTRMod.wargArmorMordor, 0.6f),
                new LOTRUnitTradeEntry(LOTREntityMordorOrcArcher.class, LOTREntityMordorWarg.class, "MordorOrcArcher_Warg", 4500, 2500.0f).setMountArmor(LOTRMod.wargArmorMordor, 0.6f),
                new LOTRUnitTradeEntry(LOTREntityMordorWargBombardier.class, 9500, 5000.0f),
                new LOTRUnitTradeEntry(LOTREntityOlogHai.class, 18000, 8000.0f).setPledgeExclusive(),
                new LOTRUnitTradeEntry(LOTREntityMordorBannerBearer.class, 8000, 3000.0f),
                new LOTRUnitTradeEntry(LOTREntityMinasMorgulBannerBearer.class, 8000, 3000.0f)
        );
    }

    public static void modifyNanUngol() {
        LOTRUnitTradeEntries.MORDOR_ORC_SPIDER_KEEPER = new LOTRUnitTradeEntries(0.0F, new LOTRUnitTradeEntry[]{
                new LOTRUnitTradeEntry(LOTREntityMordorSpider.class, 3500, 2500.0F),
                new LOTRUnitTradeEntry(LOTREntityMordorOrc.class, LOTREntityMordorSpider.class, "MordorOrc_Spider", 4500, 2500.0F),
                new LOTRUnitTradeEntry(LOTREntityMordorOrcArcher.class, LOTREntityMordorSpider.class, "MordorOrcArcher_Spider", 5500, 3000.0F),
                new LOTRUnitTradeEntry(LOTREntityNanUngolBannerBearer.class, 8000, 3000.0F)
        });
    }

    public static void modifyBlackUrukCaptain() {
        LOTRUnitTradeEntries.BLACK_URUK_CAPTAIN = new LOTRUnitTradeEntries(0.0F, new LOTRUnitTradeEntry[]{
                (new LOTRUnitTradeEntry(LOTREntityBlackUruk.class, 7000, 5000.0F)).setPledgeExclusive(),
                (new LOTRUnitTradeEntry(LOTREntityBlackUrukArcher.class, 8000, 5500.0F)).setPledgeExclusive(),
                (new LOTRUnitTradeEntry(LOTREntityOlogHai.class, 20000, 10000.0F)).setPledgeExclusive(),
                (new LOTRUnitTradeEntry(LOTREntityBlackUrukBannerBearer.class, 8000, 3000.0F)).setPledgeExclusive()
        });
    }

    public static void modifyGondorianCaptain() {
        LOTRUnitTradeEntries.GONDORIAN_CAPTAIN = new LOTRUnitTradeEntries(0.0f,
                new LOTRUnitTradeEntry(LOTREntityGondorLevyman.class, 2500, 700.0f),
                new LOTRUnitTradeEntry(LOTREntityGondorSoldier.class, 3000, 700.0f),
                new LOTRUnitTradeEntry(LOTREntityGondorArcher.class, 3500, 1500.0f),
                new LOTRUnitTradeEntry(LOTREntityGondorSoldier.class, LOTREntityHorse.class, "GondorSoldier_Horse", 4000, 2000.0f).setMountArmor(LOTRMod.horseArmorGondor),
                new LOTRUnitTradeEntry(LOTREntityGondorTowerGuard.class, 8000, 5000.0f).setPledgeExclusive(),
                new LOTRUnitTradeEntry(LOTREntityGondorBannerBearer.class, 8000, 3000.0f)
        );
    }

    public static void modifyDolAmrothCaptain() {
        LOTRUnitTradeEntries.DOL_AMROTH_CAPTAIN = new LOTRUnitTradeEntries(0.0F, new LOTRUnitTradeEntry[]{
                new LOTRUnitTradeEntry(LOTREntityDolAmrothSoldier.class, 3000, 700.0F),
                new LOTRUnitTradeEntry(LOTREntityDolAmrothArcher.class, 3500, 1500.0F),
                (new LOTRUnitTradeEntry(LOTREntitySwanKnight.class, 8000, 5000.0F)).setPledgeExclusive(),
                (new LOTRUnitTradeEntry(LOTREntityDolAmrothSoldier.class, LOTREntityHorse.class, "DolAmrothSoldier_Horse", 4000, 2000.0F)).setMountArmor(LOTRMod.horseArmorDolAmroth, 0.5F),
                (new LOTRUnitTradeEntry(LOTREntitySwanKnight.class, LOTREntityHorse.class, "SwanKnight_Horse", 4500, 2000.0F)).setMountArmor(LOTRMod.horseArmorDolAmroth).setPledgeExclusive(),
                new LOTRUnitTradeEntry(LOTREntityDolAmrothBannerBearer.class, 8000, 3000.0F)
        });
    }

    public static void modifyRangerIthilienCaptain() {
        LOTRUnitTradeEntries.RANGER_ITHILIEN_CAPTAIN = new LOTRUnitTradeEntries(0.0F, new LOTRUnitTradeEntry[]{
                new LOTRUnitTradeEntry(LOTREntityRangerIthilien.class, 3000, 700.0F),
                new LOTRUnitTradeEntry(LOTREntityRangerIthilienBannerBearer.class, 8000, 3000.0F)
        });
    }

    public static void modifyLossarnachCaptain() {
        LOTRUnitTradeEntries.LOSSARNACH_CAPTAIN = new LOTRUnitTradeEntries(0.0F, new LOTRUnitTradeEntry[]{
                new LOTRUnitTradeEntry(LOTREntityGondorLevyman.class, 2500, 700.0F),
                new LOTRUnitTradeEntry(LOTREntityLossarnachAxeman.class, 3000, 1500.0F),
                new LOTRUnitTradeEntry(LOTREntityLossarnachBannerBearer.class, 8000, 3000.0F)
        });
    }

    public static void modifyLebenninCaptain() {
        LOTRUnitTradeEntries.LEBENNIN_CAPTAIN = new LOTRUnitTradeEntries(0.0F, new LOTRUnitTradeEntry[]{
                new LOTRUnitTradeEntry(LOTREntityLebenninLevyman.class, 2500, 700.0F),
                new LOTRUnitTradeEntry(LOTREntityLebenninBannerBearer.class, 8000, 3000.0F)
        });
    }

    public static void modifyPelargirCaptain() {
        LOTRUnitTradeEntries.PELARGIR_CAPTAIN = new LOTRUnitTradeEntries(0.0F, new LOTRUnitTradeEntry[]{
                new LOTRUnitTradeEntry(LOTREntityLebenninLevyman.class, 2500, 700.0F),
                new LOTRUnitTradeEntry(LOTREntityPelargirMarine.class, 3000, 1500.0F),
                new LOTRUnitTradeEntry(LOTREntityPelargirBannerBearer.class, 8000, 3000.0F)
        });
    }

    public static void modifyBlackrootCaptain() {
        LOTRUnitTradeEntries.BLACKROOT_CAPTAIN = new LOTRUnitTradeEntries(0.0F, new LOTRUnitTradeEntry[]{
                new LOTRUnitTradeEntry(LOTREntityGondorLevyman.class, 2500, 700.0F),
                new LOTRUnitTradeEntry(LOTREntityBlackrootSoldier.class, 3000, 700.0F),
                new LOTRUnitTradeEntry(LOTREntityBlackrootArcher.class, 3500, 1500.0F),
                new LOTRUnitTradeEntry(LOTREntityBlackrootSoldier.class, LOTREntityHorse.class, "BlackrootSoldier_Horse", 4000, 2000.0F)
                        .setMountArmor(LOTRMod.horseArmorGondor),
                new LOTRUnitTradeEntry(LOTREntityBlackrootBannerBearer.class, 8000, 3000.0F)
        });
    }

    public static void modifyPinnathGelinCaptain() {
        LOTRUnitTradeEntries.PINNATH_GELIN_CAPTAIN = new LOTRUnitTradeEntries(0.0F, new LOTRUnitTradeEntry[]{
                new LOTRUnitTradeEntry(LOTREntityGondorLevyman.class, 2500, 700.0F),
                new LOTRUnitTradeEntry(LOTREntityPinnathGelinSoldier.class, 3000, 700.0F),
                new LOTRUnitTradeEntry(LOTREntityPinnathGelinSoldier.class, LOTREntityHorse.class, "PinnathGelinSoldier_Horse", 4000, 2000.0F)
                        .setMountArmor(LOTRMod.horseArmorGondor),
                new LOTRUnitTradeEntry(LOTREntityPinnathGelinBannerBearer.class, 8000, 3000.0F)
        });
    }

    public static void modifyLamedonCaptain() {
        LOTRUnitTradeEntries.LAMEDON_CAPTAIN = new LOTRUnitTradeEntries(0.0F, new LOTRUnitTradeEntry[]{
                new LOTRUnitTradeEntry(LOTREntityLamedonHillman.class, 2500, 700.0F),
                new LOTRUnitTradeEntry(LOTREntityLamedonSoldier.class, 3000, 700.0F),
                new LOTRUnitTradeEntry(LOTREntityLamedonArcher.class, 3500, 1500.0F),
                new LOTRUnitTradeEntry(LOTREntityLamedonSoldier.class, LOTREntityHorse.class, "LamedonSoldier_Horse", 4000, 2000.0F)
                        .setMountArmor(LOTRMod.horseArmorLamedon),
                new LOTRUnitTradeEntry(LOTREntityLamedonBannerBearer.class, 8000, 3000.0F)
        });
    }

    public static void modifyNearHaradrimWarlord() {
        LOTRUnitTradeEntries.NEAR_HARADRIM_WARLORD = new LOTRUnitTradeEntries(0.0F, new LOTRUnitTradeEntry[]{
                new LOTRUnitTradeEntry(LOTREntityNearHaradrimWarrior.class, 2500, 700.0F),
                new LOTRUnitTradeEntry(LOTREntityNearHaradrimArcher.class, 3000, 1500.0F),
                new LOTRUnitTradeEntry(LOTREntitySouthronChampion.class, LOTREntityHorse.class, "SouthronChampion_Horse", 8000, 5000.0F)
                        .setMountArmor(LOTRMod.horseArmorNearHarad).setPledgeExclusive(),
                new LOTRUnitTradeEntry(LOTREntityNearHaradBannerBearer.class, 8000, 3000.0F)
        });
    }

    public static void modifyHarnedorWarlord() {
        LOTRUnitTradeEntries.HARNEDOR_WARLORD = new LOTRUnitTradeEntries(0.0F, new LOTRUnitTradeEntry[]{
                new LOTRUnitTradeEntry(LOTREntityHarnedorWarrior.class, 3000, 700.0F),
                new LOTRUnitTradeEntry(LOTREntityHarnedorArcher.class, 3500, 1500.0F),
                new LOTRUnitTradeEntry(LOTREntityHarnedorWarrior.class, LOTREntityHorse.class, "HarnedorWarrior_Horse", 4000, 2000.0F),
                new LOTRUnitTradeEntry(LOTREntityHarnedorArcher.class, LOTREntityHorse.class, "HarnedorArcher_Horse", 4500, 2500.0F),
                new LOTRUnitTradeEntry(LOTREntityHarnedorBannerBearer.class, 8000, 3000.0F)
        });
    }

    public static void modifyGulfWarlord() {
        LOTRUnitTradeEntries.GULF_WARLORD = new LOTRUnitTradeEntries(0.0F, new LOTRUnitTradeEntry[]{
                new LOTRUnitTradeEntry(LOTREntityGulfHaradWarrior.class, 2500, 700.0F),
                new LOTRUnitTradeEntry(LOTREntityGulfHaradArcher.class, 3500, 1500.0F),
                new LOTRUnitTradeEntry(LOTREntityGulfHaradWarrior.class, LOTREntityHorse.class, "GulfWarrior_Horse", 4000, 2000.0F),
                new LOTRUnitTradeEntry(LOTREntityGulfHaradArcher.class, LOTREntityHorse.class, "GulfArcher_Horse", 4500, 2500.0F),
                new LOTRUnitTradeEntry(LOTREntityGulfHaradBannerBearer.class, 8000, 3000.0F)
        });
    }

    public static void modifyUmbarCaptain() {
        LOTRUnitTradeEntries.UMBAR_CAPTAIN = new LOTRUnitTradeEntries(0.0F, new LOTRUnitTradeEntry[]{
                new LOTRUnitTradeEntry(LOTREntityUmbarWarrior.class, 2500, 700.0F),
                new LOTRUnitTradeEntry(LOTREntityUmbarArcher.class, 3500, 1500.0F),
                (new LOTRUnitTradeEntry(LOTREntityUmbarWarrior.class, LOTREntityHorse.class, "UmbarWarrior_Horse", 8000, 5000.0F)).setMountArmor(LOTRMod.horseArmorUmbar),
                new LOTRUnitTradeEntry(LOTREntityUmbarBannerBearer.class, 8000, 3000.0F)
        });
    }

    public static void modifyWoodElfCaptain() {
        LOTRUnitTradeEntries.WOOD_ELF_CAPTAIN = new LOTRUnitTradeEntries(0.0F, new LOTRUnitTradeEntry[]{
                new LOTRUnitTradeEntry(LOTREntityWoodElf.class, 2500, 700.0F),
                (new LOTRUnitTradeEntry(LOTREntityWoodElfScout.class, 4000, 1500.0F)).setPledgeType(LOTRUnitTradeEntry.PledgeType.ANY_ELF),
                (new LOTRUnitTradeEntry(LOTREntityWoodElfWarrior.class, 5000, 2500.0F)).setPledgeType(LOTRUnitTradeEntry.PledgeType.ANY_ELF),
                (new LOTRUnitTradeEntry(LOTREntityWoodElfWarrior.class, LOTREntityElk.class, "WoodElfWarrior_Elk", 8000, 4000.0F)).setMountArmor(LOTRMod.elkArmorWoodElven).setPledgeType(LOTRUnitTradeEntry.PledgeType.ANY_ELF),
                (new LOTRUnitTradeEntry(LOTREntityWoodElfBannerBearer.class, 8000, 3000.0F)).setPledgeType(LOTRUnitTradeEntry.PledgeType.ANY_ELF)
        });
    }

    public static void modifyDwarfCommander() {
        LOTRUnitTradeEntries.DWARF_COMMANDER = new LOTRUnitTradeEntries(0.0f,
                new LOTRUnitTradeEntry(LOTREntityDwarf.class, 2500, 700.0f),
                new LOTRUnitTradeEntry(LOTREntityDwarfWarrior.class, 4500, 2500.0f).setPledgeType(LOTRUnitTradeEntry.PledgeType.ANY_DWARF),
                new LOTRUnitTradeEntry(LOTREntityDwarfAxeThrower.class, 5000, 4000.0f).setPledgeType(LOTRUnitTradeEntry.PledgeType.ANY_DWARF),
                new LOTRUnitTradeEntry(LOTREntityDwarfWarrior.class, LOTREntityWildBoar.class, "DwarfWarrior_Boar", 7500, 3000.0f).setMountArmor(LOTRMod.boarArmorDwarven).setPledgeType(LOTRUnitTradeEntry.PledgeType.ANY_DWARF),
                new LOTRUnitTradeEntry(LOTREntityDwarfAxeThrower.class, LOTREntityWildBoar.class, "DwarfAxeThrower_Boar", 8000, 4500.0f).setMountArmor(LOTRMod.boarArmorDwarven).setPledgeType(LOTRUnitTradeEntry.PledgeType.ANY_DWARF),
                new LOTRUnitTradeEntry(LOTREntityDwarfBannerBearer.class, 8000, 3000.0f).setPledgeType(LOTRUnitTradeEntry.PledgeType.ANY_DWARF)
        );
    }

    public static void modifyUrukHaiMercenaryCaptain() {
        LOTRUnitTradeEntries.URUK_HAI_MERCENARY_CAPTAIN = new LOTRUnitTradeEntries(0.0f,
                new LOTRUnitTradeEntry(LOTREntityIsengardSnaga.class, 2500, 700.0f),
                new LOTRUnitTradeEntry(LOTREntityIsengardSnagaArcher.class, 3000, 1500.0f),
                new LOTRUnitTradeEntry(LOTREntityUrukHai.class, 5000, 2500.0f),
                new LOTRUnitTradeEntry(LOTREntityUrukHaiCrossbower.class, 5500, 3500.0f),
                new LOTRUnitTradeEntry(LOTREntityUrukHaiSapper.class, 9000, 5000.0f),
                new LOTRUnitTradeEntry(LOTREntityUrukHaiBerserker.class, 8000, 4500.0f).setPledgeExclusive(),
                new LOTRUnitTradeEntry(LOTREntityUrukWarg.class, 2500, 700.0f),
                new LOTRUnitTradeEntry(LOTREntityIsengardSnaga.class, LOTREntityUrukWarg.class, "IsengardSnaga_Warg", 3500, 1500.0f).setMountArmor(LOTRMod.wargArmorUruk, 0.6f),
                new LOTRUnitTradeEntry(LOTREntityIsengardSnagaArcher.class, LOTREntityUrukWarg.class, "IsengardSnagaArcher_Warg", 4000, 2000.0f).setMountArmor(LOTRMod.wargArmorUruk, 0.6f),
                new LOTRUnitTradeEntry(LOTREntityUrukWargBombardier.class, 9500, 4000.0f),
                new LOTRUnitTradeEntry(LOTREntityUrukHaiBannerBearer.class, 8000, 3000.0f)
        );
    }

    public static void modifyElfLord() {
        LOTRUnitTradeEntries.ELF_LORD = new LOTRUnitTradeEntries(0.0f,
                new LOTRUnitTradeEntry(LOTREntityGaladhrimElf.class, 2500, 700.0f),
                new LOTRUnitTradeEntry(LOTREntityGaladhrimWarden.class, 4000, 1500.0f).setPledgeType(LOTRUnitTradeEntry.PledgeType.ANY_ELF),
                new LOTRUnitTradeEntry(LOTREntityGaladhrimWarrior.class, 6000, 3500.0f).setPledgeType(LOTRUnitTradeEntry.PledgeType.ANY_ELF),
                new LOTRUnitTradeEntry(LOTREntityGaladhrimWarrior.class, LOTREntityHorse.class, "GaladhrimWarrior_Horse", 6500, 4000.0f).setMountArmor(LOTRMod.horseArmorGaladhrim).setPledgeType(LOTRUnitTradeEntry.PledgeType.ANY_ELF),
                new LOTRUnitTradeEntry(LOTREntityGaladhrimBannerBearer.class, 8000, 3000.0f).setPledgeType(LOTRUnitTradeEntry.PledgeType.ANY_ELF)
        );
    }

    public static void modifyRohirrimMarshal() {
        LOTRUnitTradeEntries.ROHIRRIM_MARSHAL = new LOTRUnitTradeEntries(0.0f,
                new LOTRUnitTradeEntry(LOTREntityRohirrimWarrior.class, 2500, 700.0f),
                new LOTRUnitTradeEntry(LOTREntityRohirrimArcher.class, 4000, 1500.0f),
                new LOTRUnitTradeEntry(LOTREntityRohirrimWarrior.class, LOTREntityHorse.class, "Rohirrim_Horse", 6000, 2500.0f).setMountArmor(LOTRMod.horseArmorRohan),
                (new LOTRUnitTradeEntry(LOTREntityRohirrimArcher.class, LOTREntityHorse.class, "RohirrimArcher_Horse", 8000, 3500.0F)).setMountArmor(LOTRMod.horseArmorRohan),
                new LOTRUnitTradeEntry(LOTREntityRohanBannerBearer.class, 8000, 3000.0f)
        );
    }


    public static void modifyAngmarHillmanChieftain() {
        LOTRUnitTradeEntries.ANGMAR_HILLMAN_CHIEFTAIN = new LOTRUnitTradeEntries(0.0F, new LOTRUnitTradeEntry[]{
                new LOTRUnitTradeEntry(LOTREntityAngmarHillman.class, 2500, 700.0F),
                new LOTRUnitTradeEntry(LOTREntityAngmarHillmanWarrior.class, 3500, 1000.0F),
                new LOTRUnitTradeEntry(LOTREntityAngmarHillmanAxeThrower.class, 4500, 2000.0F),
                new LOTRUnitTradeEntry(LOTREntityAngmarHillman.class, LOTREntityAngmarWarg.class, "AngmarHillman_Warg", 4000, 2500.0F),
                (new LOTRUnitTradeEntry(LOTREntityAngmarHillmanWarrior.class, LOTREntityAngmarWarg.class, "AngmarHillmanWarrior_Warg", 4500, 3000.0F)).setMountArmor(LOTRMod.wargArmorAngmar, 0.3F),
                (new LOTRUnitTradeEntry(LOTREntityAngmarHillmanAxeThrower.class, LOTREntityAngmarWarg.class, "AngmarHillmanAxeThrower_Warg", 5000, 3500.0F)).setMountArmor(LOTRMod.wargArmorAngmar, 0.3F),
                new LOTRUnitTradeEntry(LOTREntityAngmarHillmanBannerBearer.class, 8000, 3000.0F)
        });
    }

    public static void modifyAngmarOrcMercenaryCaptain() {
        LOTRUnitTradeEntries.ANGMAR_ORC_MERCENARY_CAPTAIN = new LOTRUnitTradeEntries(0.0F, new LOTRUnitTradeEntry[]{
                new LOTRUnitTradeEntry(LOTREntityAngmarOrc.class, 2500, 700.0F),
                new LOTRUnitTradeEntry(LOTREntityAngmarOrcArcher.class, 3500, 1000.0F),
                new LOTRUnitTradeEntry(LOTREntityAngmarOrcBombardier.class, 9000, 2500.0F),
                new LOTRUnitTradeEntry(LOTREntityAngmarWarg.class, 2500, 700.0F),
                (new LOTRUnitTradeEntry(LOTREntityAngmarOrc.class, LOTREntityAngmarWarg.class, "AngmarOrc_Warg", 4000, 2500.0F)).setMountArmor(LOTRMod.wargArmorAngmar, 0.5F),
                (new LOTRUnitTradeEntry(LOTREntityAngmarOrcArcher.class, LOTREntityAngmarWarg.class, "AngmarOrcArcher_Warg", 5000, 3000.0F)).setMountArmor(LOTRMod.wargArmorAngmar, 0.5F),
                new LOTRUnitTradeEntry(LOTREntityAngmarWargBombardier.class, 9500, 3000.0F),
                new LOTRUnitTradeEntry(LOTREntityTroll.class, 9000, 7000.0F),
                (new LOTRUnitTradeEntry(LOTREntityMountainTroll.class, 15000, 7000.0F)).setPledgeExclusive(),
                new LOTRUnitTradeEntry(LOTREntityAngmarBannerBearer.class, 8000, 3000.0F)
        });
    }

    public static void modifyDolGuldurCaptain() {
        LOTRUnitTradeEntries.DOL_GULDUR_CAPTAIN = new LOTRUnitTradeEntries(0.0F, new LOTRUnitTradeEntry[]{
                new LOTRUnitTradeEntry(LOTREntityDolGuldurOrc.class, 2500, 700.0F),
                new LOTRUnitTradeEntry(LOTREntityDolGuldurOrcArcher.class, 4000, 2000.0F),
                new LOTRUnitTradeEntry(LOTREntityMirkwoodSpider.class, 3000, 1000.0F),
                new LOTRUnitTradeEntry(LOTREntityDolGuldurOrc.class, LOTREntityMirkwoodSpider.class, "DolGuldurOrc_Spider", 4000, 2500.0F),
                new LOTRUnitTradeEntry(LOTREntityDolGuldurOrcArcher.class, LOTREntityMirkwoodSpider.class, "DolGuldurOrcArcher_Spider", 4500, 3000.0F),
                (new LOTRUnitTradeEntry(LOTREntityMirkTroll.class, 12000, 5000.0F)).setPledgeExclusive(),
                new LOTRUnitTradeEntry(LOTREntityDolGuldurBannerBearer.class, 8000, 3000.0F)
        });
    }

    public static void modifyDaleCaptain() {
        LOTRUnitTradeEntries.DALE_CAPTAIN = new LOTRUnitTradeEntries(0.0F, new LOTRUnitTradeEntry[]{
                new LOTRUnitTradeEntry(LOTREntityDaleLevyman.class, 2000, 700.0F),
                new LOTRUnitTradeEntry(LOTREntityDaleSoldier.class, 3000, 1000.0F),
                new LOTRUnitTradeEntry(LOTREntityDaleArcher.class, 3500, 1500.0F),
                (new LOTRUnitTradeEntry(LOTREntityDaleSoldier.class, LOTREntityHorse.class, "DaleSoldier_Horse", 4500, 2500.0F)).setMountArmor(LOTRMod.horseArmorDale),
                new LOTRUnitTradeEntry(LOTREntityDaleBannerBearer.class, 8000, 3000.0F),
                new LOTRUnitTradeEntry(LOTREntityEsgarothBannerBearer.class, 8000, 3000.0F)
        });
    }

    public static void modifyDorwinionCaptain() {
        LOTRUnitTradeEntries.DORWINION_CAPTAIN = new LOTRUnitTradeEntries(0.0F, new LOTRUnitTradeEntry[]{
                new LOTRUnitTradeEntry(LOTREntityDorwinionGuard.class, 2500, 700.0F),
                new LOTRUnitTradeEntry(LOTREntityDorwinionCrossbower.class, 3500, 1500.0F),
                new LOTRUnitTradeEntry(LOTREntityDorwinionBannerBearer.class, 8000, 3000.0F)
        });
    }
    public static void modifyDorwinionElfCaptain() {
        LOTRUnitTradeEntries.DORWINION_ELF_CAPTAIN = new LOTRUnitTradeEntries(0.0F, new LOTRUnitTradeEntry[]{
                new LOTRUnitTradeEntry(LOTREntityDorwinionElfWarrior.class, 2500, 700.0F),
                new LOTRUnitTradeEntry(LOTREntityDorwinionElfArcher.class, 4500, 2000.0F),
                new LOTRUnitTradeEntry(LOTREntityDorwinionElfBannerBearer.class, 8000, 3000.0F)
        });
    }

    public static void modifyEasterlingWarlord() {
        LOTRUnitTradeEntries.EASTERLING_WARLORD = new LOTRUnitTradeEntries(0.0F, new LOTRUnitTradeEntry[]{
                new LOTRUnitTradeEntry(LOTREntityEasterlingLevyman.class, 2500, 700.0F),
                new LOTRUnitTradeEntry(LOTREntityEasterlingWarrior.class, 4000, 1500.0F),
                new LOTRUnitTradeEntry(LOTREntityEasterlingArcher.class, 4500, 2000.0F),
                (new LOTRUnitTradeEntry(LOTREntityEasterlingGoldWarrior.class, 8000, 3500.0F)).setPledgeExclusive(),
                new LOTRUnitTradeEntry(LOTREntityEasterlingWarrior.class, LOTREntityHorse.class, "EasterlingWarrior_Horse", 4000, 2500.0F),
                new LOTRUnitTradeEntry(LOTREntityEasterlingArcher.class, LOTREntityHorse.class, "EasterlingArcher_Horse", 4500, 3000.0F),
                (new LOTRUnitTradeEntry(LOTREntityEasterlingGoldWarrior.class, LOTREntityHorse.class, "EasterlingGoldWarrior_Horse", 9000, 4000.0F))
                        .setMountArmor(LOTRMod.horseArmorRhunGold).setPledgeExclusive(),
                new LOTRUnitTradeEntry(LOTREntityEasterlingFireThrower.class, 7000, 4500.0F),
                new LOTRUnitTradeEntry(LOTREntityEasterlingBannerBearer.class, 8000, 3000.0F)
        });
    }

    public static void modifyBlueDwarfCommander() {
        LOTRUnitTradeEntries.BLUE_DWARF_COMMANDER = new LOTRUnitTradeEntries(0.0F, new LOTRUnitTradeEntry[]{
                new LOTRUnitTradeEntry(LOTREntityBlueDwarf.class, 2500, 700.0F),
                (new LOTRUnitTradeEntry(LOTREntityBlueDwarfWarrior.class, 4500, 2500.0F)).setPledgeType(LOTRUnitTradeEntry.PledgeType.ANY_DWARF),
                (new LOTRUnitTradeEntry(LOTREntityBlueDwarfAxeThrower.class, 5000, 4000.0F)).setPledgeType(LOTRUnitTradeEntry.PledgeType.ANY_DWARF),
                (new LOTRUnitTradeEntry(LOTREntityBlueDwarfWarrior.class, LOTREntityWildBoar.class, "BlueDwarfWarrior_Boar", 7500, 3000.0F))
                        .setMountArmor(LOTRMod.boarArmorBlueDwarven).setPledgeType(LOTRUnitTradeEntry.PledgeType.ANY_DWARF),
                (new LOTRUnitTradeEntry(LOTREntityBlueDwarfAxeThrower.class, LOTREntityWildBoar.class, "BlueDwarfAxeThrower_Boar", 8000, 4500.0F))
                        .setMountArmor(LOTRMod.boarArmorBlueDwarven).setPledgeType(LOTRUnitTradeEntry.PledgeType.ANY_DWARF),
                (new LOTRUnitTradeEntry(LOTREntityBlueDwarfBannerBearer.class, 8000, 3000.0F)).setPledgeType(LOTRUnitTradeEntry.PledgeType.ANY_DWARF)
        });
    }

    public static void modifyHobbitShirriff() {
        LOTRUnitTradeEntries.HOBBIT_SHIRRIFF = new LOTRUnitTradeEntries(0.0F, new LOTRUnitTradeEntry[]{
                new LOTRUnitTradeEntry(LOTREntityHobbitBounder.class, 1500, 300.0F),
                new LOTRUnitTradeEntry(LOTREntityHobbitBounder.class, LOTREntityShirePony.class, "HobbitBounder_Pony", 3000, 1000.0F)
        });
    }

    public static void modifyGundabadOrcMercenaryCaptain() {
        LOTRUnitTradeEntries.GUNDABAD_ORC_MERCENARY_CAPTAIN = new LOTRUnitTradeEntries(0.0F, new LOTRUnitTradeEntry[]{
                new LOTRUnitTradeEntry(LOTREntityGundabadOrc.class, 2500, 700.0F),
                new LOTRUnitTradeEntry(LOTREntityGundabadOrcArcher.class, 3500, 1000.0F),
                new LOTRUnitTradeEntry(LOTREntityGundabadWarg.class, 2500, 700.0F),
                new LOTRUnitTradeEntry(LOTREntityGundabadOrc.class, LOTREntityGundabadWarg.class, "GundabadOrc_Warg", 4000, 1500.0F),
                new LOTRUnitTradeEntry(LOTREntityGundabadOrcArcher.class, LOTREntityGundabadWarg.class, "GundabadOrcArcher_Warg", 5000, 2500.0F),
                (new LOTRUnitTradeEntry(LOTREntityGundabadUruk.class, 7000, 4000.0F)).setPledgeExclusive(),
                (new LOTRUnitTradeEntry(LOTREntityGundabadUrukArcher.class, 8000, 4500.0F)).setPledgeExclusive(),
                new LOTRUnitTradeEntry(LOTREntityGundabadBannerBearer.class, 8000, 3000.0F)
        });
    }

        public static void modifyRangerNorthCaptain() {
            LOTRUnitTradeEntries RANGER_NORTH_CAPTAIN = new LOTRUnitTradeEntries(0.0F, new LOTRUnitTradeEntry[]{
                    new LOTRUnitTradeEntry(LOTREntityRangerNorth.class, 1500, 700.0F),
                    new LOTRUnitTradeEntry(LOTREntityRangerNorth.class, LOTREntityHorse.class, "RangerNorth_Horse", 3500, 1500.0F),
                    new LOTRUnitTradeEntry(LOTREntityRangerNorthBannerBearer.class, 8000, 3000.0F)
            });
        }
    public static void modifyDunlendingWarlord() {
        LOTRUnitTradeEntries.DUNLENDING_WARLORD = new LOTRUnitTradeEntries(0.0F, new LOTRUnitTradeEntry[]{
                new LOTRUnitTradeEntry(LOTREntityDunlending.class, 2500, 700.0F),
                new LOTRUnitTradeEntry(LOTREntityDunlendingWarrior.class, 3500, 1500.0F),
                new LOTRUnitTradeEntry(LOTREntityDunlendingArcher.class, 4500, 2000.0F),
                new LOTRUnitTradeEntry(LOTREntityDunlendingAxeThrower.class, 5000, 2500.0F),
                (new LOTRUnitTradeEntry(LOTREntityDunlendingBerserker.class, 6500, 5000.0F)).setPledgeExclusive(),
                new LOTRUnitTradeEntry(LOTREntityDunlendingBannerBearer.class, 8000, 3000.0F)
        });
    }

    public static void modifyHalfTrollWarlord() {
        LOTRUnitTradeEntries.HALF_TROLL_WARLORD = new LOTRUnitTradeEntries(0.0F, new LOTRUnitTradeEntry[]{
                new LOTRUnitTradeEntry(LOTREntityHalfTroll.class, 2500, 700.0F),
                new LOTRUnitTradeEntry(LOTREntityHalfTrollWarrior.class, 4000, 1500.0F),
                (new LOTRUnitTradeEntry(LOTREntityHalfTrollWarrior.class, LOTREntityRhino.class, "HalfTrollWarrior_Rhino", 7500, 3000.0F)).setMountArmor(LOTRMod.rhinoArmorHalfTroll, 0.5F),
                new LOTRUnitTradeEntry(LOTREntityHalfTrollBannerBearer.class, 8000, 5000.0F)
        });
    }
    public static void modifyTauredainChieftain() {
        LOTRUnitTradeEntries.TAUREDAIN_CHIEFTAIN = new LOTRUnitTradeEntries(0.0F, new LOTRUnitTradeEntry[]{
                new LOTRUnitTradeEntry(LOTREntityTauredainWarrior.class, 2500, 500.0F),
                new LOTRUnitTradeEntry(LOTREntityTauredainBlowgunner.class, 5000, 1500.0F),
                new LOTRUnitTradeEntry(LOTREntityTauredainBannerBearer.class, 8000, 5000.0F)
        });
    }

    public static void modifyHighElfLord() {
        LOTRUnitTradeEntries.HIGH_ELF_LORD = new LOTRUnitTradeEntries(0.0F, new LOTRUnitTradeEntry[]{
                new LOTRUnitTradeEntry(LOTREntityHighElf.class, 2500, 700.0F),
                (new LOTRUnitTradeEntry(LOTREntityHighElfWarrior.class, 6000, 300.0F)).setPledgeType(LOTRUnitTradeEntry.PledgeType.ANY_ELF),
                (new LOTRUnitTradeEntry(LOTREntityHighElfWarrior.class, LOTREntityHorse.class, "HighElfWarrior_Horse", 9000, 5000.0F)).setMountArmor(LOTRMod.horseArmorHighElven).setPledgeType(LOTRUnitTradeEntry.PledgeType.ANY_ELF),
                (new LOTRUnitTradeEntry(LOTREntityHighElfBannerBearer.class, 8000, 3000.0F)).setPledgeType(LOTRUnitTradeEntry.PledgeType.ANY_ELF)
        });
    }

    public static void modifyRivendellLord() {
        LOTRUnitTradeEntries.RIVENDELL_LORD = new LOTRUnitTradeEntries(0.0F, new LOTRUnitTradeEntry[]{
                new LOTRUnitTradeEntry(LOTREntityRivendellElf.class, 2500, 700.0F),
                (new LOTRUnitTradeEntry(LOTREntityRivendellWarrior.class, 6000, 3000.0F)).setPledgeType(LOTRUnitTradeEntry.PledgeType.ANY_ELF),
                (new LOTRUnitTradeEntry(LOTREntityRivendellWarrior.class, LOTREntityHorse.class, "RivendellWarrior_Horse", 9000, 5000.0F)).setMountArmor(LOTRMod.horseArmorRivendell).setPledgeType(LOTRUnitTradeEntry.PledgeType.ANY_ELF),
                (new LOTRUnitTradeEntry(LOTREntityRivendellBannerBearer.class, 8000, 3000.0F)).setPledgeType(LOTRUnitTradeEntry.PledgeType.ANY_ELF)
        });
    }
    }


    // Add more methods for other unit trade entries as needed
