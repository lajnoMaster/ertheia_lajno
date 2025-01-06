/*
 * This file is part of the L2J Mobius project.
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package quests;

import java.util.logging.Level;
import java.util.logging.Logger;

import quests.Q00013_ParcelDelivery.Q00013_ParcelDelivery;
import quests.Q00015_SweetWhispers.Q00015_SweetWhispers;
import quests.Q00016_TheComingDarkness.Q00016_TheComingDarkness;
import quests.Q00017_LightAndDarkness.Q00017_LightAndDarkness;
import quests.Q00019_GoToThePastureland.Q00019_GoToThePastureland;
import quests.Q00020_BringUpWithLove.Q00020_BringUpWithLove;
import quests.Q00026_TiredOfWaiting.Q00026_TiredOfWaiting;
import quests.Q00031_SecretBuriedInTheSwamp.Q00031_SecretBuriedInTheSwamp;
import quests.Q00032_AnObviousLie.Q00032_AnObviousLie;
import quests.Q00033_MakeAPairOfDressShoes.Q00033_MakeAPairOfDressShoes;
import quests.Q00034_InSearchOfCloth.Q00034_InSearchOfCloth;
import quests.Q00035_FindGlitteringJewelry.Q00035_FindGlitteringJewelry;
import quests.Q00036_MakeASewingKit.Q00036_MakeASewingKit;
import quests.Q00037_MakeFormalWear.Q00037_MakeFormalWear;
import quests.Q00038_DragonFangs.Q00038_DragonFangs;
import quests.Q00039_RedEyedInvaders.Q00039_RedEyedInvaders;
import quests.Q00040_ASpecialOrder.Q00040_ASpecialOrder;
import quests.Q00042_HelpTheUncle.Q00042_HelpTheUncle;
import quests.Q00043_HelpTheSister.Q00043_HelpTheSister;
import quests.Q00044_HelpTheSon.Q00044_HelpTheSon;
import quests.Q00061_LawEnforcement.Q00061_LawEnforcement;
import quests.Q00109_InSearchOfTheNest.Q00109_InSearchOfTheNest;
import quests.Q00110_ToThePrimevalIsle.Q00110_ToThePrimevalIsle;
import quests.Q00111_ElrokianHuntersProof.Q00111_ElrokianHuntersProof;
import quests.Q00113_StatusOfTheBeaconTower.Q00113_StatusOfTheBeaconTower;
import quests.Q00114_ResurrectionOfAnOldManager.Q00114_ResurrectionOfAnOldManager;
import quests.Q00115_TheOtherSideOfTruth.Q00115_TheOtherSideOfTruth;
import quests.Q00117_TheOceanOfDistantStars.Q00117_TheOceanOfDistantStars;
import quests.Q00119_LastImperialPrince.Q00119_LastImperialPrince;
import quests.Q00120_PavelsLastResearch.Q00120_PavelsLastResearch;
import quests.Q00121_PavelTheGiant.Q00121_PavelTheGiant;
import quests.Q00122_OminousNews.Q00122_OminousNews;
import quests.Q00124_MeetingTheElroki.Q00124_MeetingTheElroki;
import quests.Q00125_TheNameOfEvil1.Q00125_TheNameOfEvil1;
import quests.Q00126_TheNameOfEvil2.Q00126_TheNameOfEvil2;
import quests.Q00128_PailakaSongOfIceAndFire.Q00128_PailakaSongOfIceAndFire;
import quests.Q00129_PailakaDevilsLegacy.Q00129_PailakaDevilsLegacy;
import quests.Q00134_TempleMissionary.Q00134_TempleMissionary;
import quests.Q00135_TempleExecutor.Q00135_TempleExecutor;
import quests.Q00136_MoreThanMeetsTheEye.Q00136_MoreThanMeetsTheEye;
import quests.Q00137_TempleChampionPart1.Q00137_TempleChampionPart1;
import quests.Q00138_TempleChampionPart2.Q00138_TempleChampionPart2;
import quests.Q00139_ShadowFoxPart1.Q00139_ShadowFoxPart1;
import quests.Q00140_ShadowFoxPart2.Q00140_ShadowFoxPart2;
import quests.Q00141_ShadowFoxPart3.Q00141_ShadowFoxPart3;
import quests.Q00142_FallenAngelRequestOfDawn.Q00142_FallenAngelRequestOfDawn;
import quests.Q00143_FallenAngelRequestOfDusk.Q00143_FallenAngelRequestOfDusk;
import quests.Q00144_PailakaInjuredDragon.Q00144_PailakaInjuredDragon;
import quests.Q00146_TheZeroHour.Q00146_TheZeroHour;
import quests.Q00149_PrimalMotherIstina.Q00149_PrimalMotherIstina;
import quests.Q00150_ExtremeChallengePrimalMotherResurrected.Q00150_ExtremeChallengePrimalMotherResurrected;
import quests.Q00177_SplitDestiny.Q00177_SplitDestiny;
import quests.Q00180_InfernalFlamesBurningInCrystalPrison.Q00180_InfernalFlamesBurningInCrystalPrison;
import quests.Q00181_DevilsStrikeBackAdventOfBalok.Q00181_DevilsStrikeBackAdventOfBalok;
import quests.Q00183_RelicExploration.Q00183_RelicExploration;
import quests.Q00184_ArtOfPersuasion.Q00184_ArtOfPersuasion;
import quests.Q00185_NikolasCooperation.Q00185_NikolasCooperation;
import quests.Q00186_ContractExecution.Q00186_ContractExecution;
import quests.Q00187_NikolasHeart.Q00187_NikolasHeart;
import quests.Q00189_ContractCompletion.Q00189_ContractCompletion;
import quests.Q00190_LostDream.Q00190_LostDream;
import quests.Q00192_SevenSignsSeriesOfDoubt.Q00192_SevenSignsSeriesOfDoubt;
import quests.Q00193_SevenSignsDyingMessage.Q00193_SevenSignsDyingMessage;
import quests.Q00194_SevenSignsMammonsContract.Q00194_SevenSignsMammonsContract;
import quests.Q00195_SevenSignsSecretRitualOfThePriests.Q00195_SevenSignsSecretRitualOfThePriests;
import quests.Q00196_SevenSignsSealOfTheEmperor.Q00196_SevenSignsSealOfTheEmperor;
import quests.Q00197_SevenSignsTheSacredBookOfSeal.Q00197_SevenSignsTheSacredBookOfSeal;
import quests.Q00198_SevenSignsEmbryo.Q00198_SevenSignsEmbryo;
import quests.Q00210_ObtainAWolfPet.Q00210_ObtainAWolfPet;
import quests.Q00237_WindsOfChange.Q00237_WindsOfChange;
import quests.Q00238_SuccessFailureOfBusiness.Q00238_SuccessFailureOfBusiness;
import quests.Q00239_WontYouJoinUs.Q00239_WontYouJoinUs;
import quests.Q00240_ImTheOnlyOneYouCanTrust.Q00240_ImTheOnlyOneYouCanTrust;
import quests.Q00245_ComeToMe.Q00245_ComeToMe;
import quests.Q00254_LegendaryTales.Q00254_LegendaryTales;
import quests.Q00270_TheOneWhoEndsSilence.Q00270_TheOneWhoEndsSilence;
import quests.Q00278_HomeSecurity.Q00278_HomeSecurity;
import quests.Q00298_LizardmensConspiracy.Q00298_LizardmensConspiracy;
import quests.Q00307_ControlDeviceOfTheGiants.Q00307_ControlDeviceOfTheGiants;
import quests.Q00310_OnlyWhatRemains.Q00310_OnlyWhatRemains;
import quests.Q00336_CoinsOfMagic.Q00336_CoinsOfMagic;
import quests.Q00337_AudienceWithTheLandDragon.Q00337_AudienceWithTheLandDragon;
import quests.Q00344_1000YearsTheEndOfLamentation.Q00344_1000YearsTheEndOfLamentation;
import quests.Q00350_EnhanceYourWeapon.Q00350_EnhanceYourWeapon;
import quests.Q00357_WarehouseKeepersAmbition.Q00357_WarehouseKeepersAmbition;
import quests.Q00359_ForASleeplessDeadman.Q00359_ForASleeplessDeadman;
import quests.Q00371_ShrieksOfGhosts.Q00371_ShrieksOfGhosts;
import quests.Q00372_LegacyOfInsolence.Q00372_LegacyOfInsolence;
import quests.Q00373_SupplierOfReagents.Q00373_SupplierOfReagents;
import quests.Q00376_ExplorationOfTheGiantsCavePart1.Q00376_ExplorationOfTheGiantsCavePart1;
import quests.Q00377_ExplorationOfTheGiantsCavePart2.Q00377_ExplorationOfTheGiantsCavePart2;
import quests.Q00381_LetsBecomeARoyalMember.Q00381_LetsBecomeARoyalMember;
import quests.Q00382_KailsMagicCoin.Q00382_KailsMagicCoin;
import quests.Q00386_StolenDignity.Q00386_StolenDignity;
import quests.Q00420_LittleWing.Q00420_LittleWing;
import quests.Q00421_LittleWingsBigAdventure.Q00421_LittleWingsBigAdventure;
import quests.Q00431_WeddingMarch.Q00431_WeddingMarch;
import quests.Q00432_BirthdayPartySong.Q00432_BirthdayPartySong;
import quests.Q00450_GraveRobberRescue.Q00450_GraveRobberRescue;
import quests.Q00451_LuciensAltar.Q00451_LuciensAltar;
import quests.Q00452_FindingtheLostSoldiers.Q00452_FindingtheLostSoldiers;
import quests.Q00453_NotStrongEnoughAlone.Q00453_NotStrongEnoughAlone;
import quests.Q00454_CompletelyLost.Q00454_CompletelyLost;
import quests.Q00455_WingsOfSand.Q00455_WingsOfSand;
import quests.Q00456_DontKnowDontCare.Q00456_DontKnowDontCare;
import quests.Q00457_LostAndFound.Q00457_LostAndFound;
import quests.Q00458_PerfectForm.Q00458_PerfectForm;
import quests.Q00459_TheVillainOfTheUndergroundMineTeredor.Q00459_TheVillainOfTheUndergroundMineTeredor;
import quests.Q00460_PreciousResearchMaterial.Q00460_PreciousResearchMaterial;
import quests.Q00462_StuffedAncientHeroes.Q00462_StuffedAncientHeroes;
import quests.Q00463_IMustBeaGenius.Q00463_IMustBeaGenius;
import quests.Q00464_Oath.Q00464_Oath;
import quests.Q00465_WeAreFriends.Q00465_WeAreFriends;
import quests.Q00466_PlacingMySmallPower.Q00466_PlacingMySmallPower;
import quests.Q00468_BeLostInTheMysteriousScent.Q00468_BeLostInTheMysteriousScent;
import quests.Q00469_SuspiciousGardener.Q00469_SuspiciousGardener;
import quests.Q00470_DivinityProtector.Q00470_DivinityProtector;
import quests.Q00471_BreakingThroughTheEmeraldSquare.Q00471_BreakingThroughTheEmeraldSquare;
import quests.Q00472_ChallengeSteamCorridor.Q00472_ChallengeSteamCorridor;
import quests.Q00473_InTheCoralGarden.Q00473_InTheCoralGarden;
import quests.Q00474_WaitingForTheSummer.Q00474_WaitingForTheSummer;
import quests.Q00476_PlainMission.Q00476_PlainMission;
import quests.Q00481_ShadowHelper.Q00481_ShadowHelper;
import quests.Q00482_RecertificationOfValue.Q00482_RecertificationOfValue;
import quests.Q00483_IntendedTactic.Q00483_IntendedTactic;
import quests.Q00485_HotSpringWater.Q00485_HotSpringWater;
import quests.Q00488_WondersOfCaring.Q00488_WondersOfCaring;
import quests.Q00489_InThisQuietPlace.Q00489_InThisQuietPlace;
import quests.Q00490_DutyOfTheSurvivor.Q00490_DutyOfTheSurvivor;
import quests.Q00491_InNominePatris.Q00491_InNominePatris;
import quests.Q00492_TombRaiders.Q00492_TombRaiders;
import quests.Q00493_KickingOutUnwelcomeGuests.Q00493_KickingOutUnwelcomeGuests;
import quests.Q00494_IncarnationOfGreedZellakaGroup.Q00494_IncarnationOfGreedZellakaGroup;
import quests.Q00495_IncarnationOfJealousyPellineGroup.Q00495_IncarnationOfJealousyPellineGroup;
import quests.Q00496_IncarnationOfGluttonyKaliosGroup.Q00496_IncarnationOfGluttonyKaliosGroup;
import quests.Q00497_IncarnationOfGreedZellakaSolo.Q00497_IncarnationOfGreedZellakaSolo;
import quests.Q00498_IncarnationOfJealousyPellineSolo.Q00498_IncarnationOfJealousyPellineSolo;
import quests.Q00499_IncarnationOfGluttonyKaliosSolo.Q00499_IncarnationOfGluttonyKaliosSolo;
import quests.Q00500_BrothersBoundInChains.Q00500_BrothersBoundInChains;
import quests.Q00501_ProofOfClanAlliance.Q00501_ProofOfClanAlliance;
import quests.Q00503_PursuitOfClanAmbition.Q00503_PursuitOfClanAmbition;
import quests.Q00508_AClansReputation.Q00508_AClansReputation;
import quests.Q00509_AClansFame.Q00509_AClansFame;
import quests.Q00510_AClansPrestige.Q00510_AClansPrestige;
import quests.Q00511_AwlUnderFoot.Q00511_AwlUnderFoot;
import quests.Q00512_BladeUnderFoot.Q00512_BladeUnderFoot;
import quests.Q00551_OlympiadStarter.Q00551_OlympiadStarter;
import quests.Q00553_OlympiadUndefeated.Q00553_OlympiadUndefeated;
import quests.Q00617_GatherTheFlames.Q00617_GatherTheFlames;
import quests.Q00618_IntoTheFlame.Q00618_IntoTheFlame;
import quests.Q00620_FourGoblets.Q00620_FourGoblets;
import quests.Q00621_EggDelivery.Q00621_EggDelivery;
import quests.Q00622_SpecialtyLiquorDelivery.Q00622_SpecialtyLiquorDelivery;
import quests.Q00623_TheFinestFood.Q00623_TheFinestFood;
import quests.Q00624_TheFinestIngredientsPart1.Q00624_TheFinestIngredientsPart1;
import quests.Q00625_TheFinestIngredientsPart2.Q00625_TheFinestIngredientsPart2;
import quests.Q00626_ADarkTwilight.Q00626_ADarkTwilight;
import quests.Q00627_HeartInSearchOfPower.Q00627_HeartInSearchOfPower;
import quests.Q00631_DeliciousTopChoiceMeat.Q00631_DeliciousTopChoiceMeat;
import quests.Q00641_AttackSailren.Q00641_AttackSailren;
import quests.Q00642_APowerfulPrimevalCreature.Q00642_APowerfulPrimevalCreature;
import quests.Q00643_RiseAndFallOfTheElrokiTribe.Q00643_RiseAndFallOfTheElrokiTribe;
import quests.Q00645_GhostsOfBatur.Q00645_GhostsOfBatur;
import quests.Q00647_InfluxOfMachines.Q00647_InfluxOfMachines;
import quests.Q00648_AnIceMerchantsDream.Q00648_AnIceMerchantsDream;
import quests.Q00650_ABrokenDream.Q00650_ABrokenDream;
import quests.Q00652_AnAgedExAdventurer.Q00652_AnAgedExAdventurer;
import quests.Q00662_AGameOfCards.Q00662_AGameOfCards;
import quests.Q00663_SeductiveWhispers.Q00663_SeductiveWhispers;
import quests.Q00688_DefeatTheElrokianRaiders.Q00688_DefeatTheElrokianRaiders;
import quests.Q00699_GuardianOfTheSkies.Q00699_GuardianOfTheSkies;
import quests.Q00700_CursedLife.Q00700_CursedLife;
import quests.Q00701_ProofOfExistence.Q00701_ProofOfExistence;
import quests.Q00702_ATrapForRevenge.Q00702_ATrapForRevenge;
import quests.Q00726_LightWithinTheDarkness.Q00726_LightWithinTheDarkness;
import quests.Q00727_HopeWithinTheDarkness.Q00727_HopeWithinTheDarkness;
import quests.Q00751_LiberatingTheSpirits.Q00751_LiberatingTheSpirits;
import quests.Q00752_UncoverTheSecret.Q00752_UncoverTheSecret;
import quests.Q00753_ReactingToACrisis.Q00753_ReactingToACrisis;
import quests.Q00754_AssistingTheRebelForces.Q00754_AssistingTheRebelForces;
import quests.Q00755_InNeedOfPetras.Q00755_InNeedOfPetras;
import quests.Q00756_TopQualityPetra.Q00756_TopQualityPetra;
import quests.Q00757_TriolsMovement.Q00757_TriolsMovement;
import quests.Q00758_TheFallenKingsMen.Q00758_TheFallenKingsMen;
import quests.Q00759_TheDwarvenNightmareContinues.Q00759_TheDwarvenNightmareContinues;
import quests.Q00761_AssistingTheGoldenRamArmy.Q00761_AssistingTheGoldenRamArmy;
import quests.Q00762_AnOminousRequest.Q00762_AnOminousRequest;
import quests.Q00763_ADauntingTask.Q00763_ADauntingTask;
import quests.Q00764_WeakeningTheVarkaSilenosForces.Q00764_WeakeningTheVarkaSilenosForces;
import quests.Q00765_WeakeningTheKetraOrcForces.Q00765_WeakeningTheKetraOrcForces;
import quests.Q00772_PurifyingSouls.Q00772_PurifyingSouls;
import quests.Q00775_RetrievingTheChaosFragment.Q00775_RetrievingTheChaosFragment;
import quests.Q00776_SlayDarkLordEkimus.Q00776_SlayDarkLordEkimus;
import quests.Q00777_SlayDarkLordTiat.Q00777_SlayDarkLordTiat;
import quests.Q00778_OperationRoaringFlame.Q00778_OperationRoaringFlame;
import quests.Q00779_UtilizeTheDarknessSeedOfDestruction.Q00779_UtilizeTheDarknessSeedOfDestruction;
import quests.Q00780_UtilizeTheDarknessSeedOfInfinity.Q00780_UtilizeTheDarknessSeedOfInfinity;
import quests.Q00781_UtilizeTheDarknessSeedOfAnnihilation.Q00781_UtilizeTheDarknessSeedOfAnnihilation;
import quests.Q00782_UtilizeTheDarknessSeedOfHellfire.Q00782_UtilizeTheDarknessSeedOfHellfire;
import quests.Q00784_TheQuietKiller.Q00784_TheQuietKiller;
import quests.Q00785_ASuspiciousIngredient.Q00785_ASuspiciousIngredient;
import quests.Q00786_AwaitingTheVoiceOfTheGods.Q00786_AwaitingTheVoiceOfTheGods;
import quests.Q00787_TheRoleOfAWatcher.Q00787_TheRoleOfAWatcher;
import quests.Q00789_WaitingForPaagrio.Q00789_WaitingForPaagrio;
import quests.Q00901_HowLavasaurusesAreMade.Q00901_HowLavasaurusesAreMade;
import quests.Q00902_ReclaimOurEra.Q00902_ReclaimOurEra;
import quests.Q00903_TheCallOfAntharas.Q00903_TheCallOfAntharas;
import quests.Q00904_DragonTrophyAntharas.Q00904_DragonTrophyAntharas;
import quests.Q00905_RefinedDragonBlood.Q00905_RefinedDragonBlood;
import quests.Q00906_TheCallOfValakas.Q00906_TheCallOfValakas;
import quests.Q00907_DragonTrophyValakas.Q00907_DragonTrophyValakas;
import quests.Q00943_FillingTheEnergyOfDestruction.Q00943_FillingTheEnergyOfDestruction;
import quests.Q10273_GoodDayToFly.Q10273_GoodDayToFly;
import quests.Q10274_CollectingInTheAir.Q10274_CollectingInTheAir;
import quests.Q10275_ContainingTheAttributePower.Q10275_ContainingTheAttributePower;
import quests.Q10282_ToTheSeedOfAnnihilation.Q10282_ToTheSeedOfAnnihilation;
import quests.Q10283_RequestOfIceMerchant.Q10283_RequestOfIceMerchant;
import quests.Q10284_AcquisitionOfDivineSword.Q10284_AcquisitionOfDivineSword;
import quests.Q10285_MeetingSirra.Q10285_MeetingSirra;
import quests.Q10286_ReunionWithSirra.Q10286_ReunionWithSirra;
import quests.Q10287_StoryOfThoseLeft.Q10287_StoryOfThoseLeft;
import quests.Q10288_SecretMission.Q10288_SecretMission;
import quests.Q10289_FadeToBlack.Q10289_FadeToBlack;
import quests.Q10290_LandDragonConqueror.Q10290_LandDragonConqueror;
import quests.Q10291_FireDragonDestroyer.Q10291_FireDragonDestroyer;
import quests.Q10292_SevenSignsGirlOfDoubt.Q10292_SevenSignsGirlOfDoubt;
import quests.Q10293_SevenSignsForbiddenBookOfTheElmoreAdenKingdom.Q10293_SevenSignsForbiddenBookOfTheElmoreAdenKingdom;
import quests.Q10294_SevenSignsToTheMonasteryOfSilence.Q10294_SevenSignsToTheMonasteryOfSilence;
import quests.Q10295_SevenSignsSolinasTomb.Q10295_SevenSignsSolinasTomb;
import quests.Q10296_SevenSignsOneWhoSeeksThePowerOfTheSeal.Q10296_SevenSignsOneWhoSeeksThePowerOfTheSeal;
import quests.Q10301_ShadowOfTerrorBlackishRedFog.Q10301_ShadowOfTerrorBlackishRedFog;
import quests.Q10302_UnsettlingShadowAndRumors.Q10302_UnsettlingShadowAndRumors;
import quests.Q10303_CrossroadsBetweenLightAndDarkness.Q10303_CrossroadsBetweenLightAndDarkness;
import quests.Q10304_ForForgottenHeroes.Q10304_ForForgottenHeroes;
import quests.Q10305_UnstoppableFutileEfforts.Q10305_UnstoppableFutileEfforts;
import quests.Q10306_TheCorruptedLeader.Q10306_TheCorruptedLeader;
import quests.Q10307_TheCorruptedLeaderHisTruth.Q10307_TheCorruptedLeaderHisTruth;
import quests.Q10310_TwistedCreationTree.Q10310_TwistedCreationTree;
import quests.Q10311_PeacefulDaysAreOver.Q10311_PeacefulDaysAreOver;
import quests.Q10312_AbandonedGodsCreature.Q10312_AbandonedGodsCreature;
import quests.Q10315_ToThePrisonOfDarkness.Q10315_ToThePrisonOfDarkness;
import quests.Q10316_UndecayingMemoryOfThePast.Q10316_UndecayingMemoryOfThePast;
import quests.Q10317_OrbisWitch.Q10317_OrbisWitch;
import quests.Q10318_DecayingDarkness.Q10318_DecayingDarkness;
import quests.Q10320_LetsGoToTheCentralSquare.Q10320_LetsGoToTheCentralSquare;
import quests.Q10321_QualificationsOfTheSeeker.Q10321_QualificationsOfTheSeeker;
import quests.Q10322_SearchingForTheMysteriousPower.Q10322_SearchingForTheMysteriousPower;
import quests.Q10323_TrainLikeItsReal.Q10323_TrainLikeItsReal;
import quests.Q10324_FindingMagisterGallint.Q10324_FindingMagisterGallint;
import quests.Q10325_SearchingForNewPower.Q10325_SearchingForNewPower;
import quests.Q10326_RespectYourElders.Q10326_RespectYourElders;
import quests.Q10327_IntruderWhoWantsTheBookOfGiants.Q10327_IntruderWhoWantsTheBookOfGiants;
import quests.Q10328_RequestToSealTheEvilFragment.Q10328_RequestToSealTheEvilFragment;
import quests.Q10329_BackupSeekers.Q10329_BackupSeekers;
import quests.Q10330_ToTheRuinsOfYeSagira.Q10330_ToTheRuinsOfYeSagira;
import quests.Q10331_StartOfFate.Q10331_StartOfFate;
import quests.Q10332_ToughRoad.Q10332_ToughRoad;
import quests.Q10333_DisappearedSakum.Q10333_DisappearedSakum;
import quests.Q10334_ReportingTheStatusOfTheWindmillHill.Q10334_ReportingTheStatusOfTheWindmillHill;
import quests.Q10335_RequestToFindSakum.Q10335_RequestToFindSakum;
import quests.Q10336_DividedSakumKanilov.Q10336_DividedSakumKanilov;
import quests.Q10337_SakumsImpact.Q10337_SakumsImpact;
import quests.Q10338_SeizeYourDestiny.Q10338_SeizeYourDestiny;
import quests.Q10339_FightingTheForgotten.Q10339_FightingTheForgotten;
import quests.Q10341_DayOfDestinyHumansFate.Q10341_DayOfDestinyHumansFate;
import quests.Q10342_DayOfDestinyElvenFate.Q10342_DayOfDestinyElvenFate;
import quests.Q10343_DayOfDestinyDarkElfsFate.Q10343_DayOfDestinyDarkElfsFate;
import quests.Q10344_DayOfDestinyOrcsFate.Q10344_DayOfDestinyOrcsFate;
import quests.Q10345_DayOfDestinyDwarfsFate.Q10345_DayOfDestinyDwarfsFate;
import quests.Q10346_DayOfDestinyKamaelsFate.Q10346_DayOfDestinyKamaelsFate;
import quests.Q10351_OwnerOfHall.Q10351_OwnerOfHall;
import quests.Q10353_CertificationOfValue.Q10353_CertificationOfValue;
import quests.Q10354_ResurrectedOwnerOfHall.Q10354_ResurrectedOwnerOfHall;
import quests.Q10358_DividedSakumPoslof.Q10358_DividedSakumPoslof;
import quests.Q10359_TracesOfEvil.Q10359_TracesOfEvil;
import quests.Q10360_CertificationOfFate.Q10360_CertificationOfFate;
import quests.Q10361_RolesOfTheSeeker.Q10361_RolesOfTheSeeker;
import quests.Q10362_CertificationOfTheSeeker.Q10362_CertificationOfTheSeeker;
import quests.Q10363_RequestOfTheSeeker.Q10363_RequestOfTheSeeker;
import quests.Q10364_ObligationsOfTheSeeker.Q10364_ObligationsOfTheSeeker;
import quests.Q10365_SeekerEscort.Q10365_SeekerEscort;
import quests.Q10366_RuinsStatusUpdate.Q10366_RuinsStatusUpdate;
import quests.Q10368_RebellionOfMonsters.Q10368_RebellionOfMonsters;
import quests.Q10369_NoblesseSoulTesting.Q10369_NoblesseSoulTesting;
import quests.Q10370_MenacingTimes.Q10370_MenacingTimes;
import quests.Q10371_GraspThyPower.Q10371_GraspThyPower;
import quests.Q10372_PurgatoryVolvere.Q10372_PurgatoryVolvere;
import quests.Q10374_ThatPlaceSuccubus.Q10374_ThatPlaceSuccubus;
import quests.Q10375_SuccubusDisciples.Q10375_SuccubusDisciples;
import quests.Q10376_BloodyGoodTime.Q10376_BloodyGoodTime;
import quests.Q10377_TheInvadedExecutionGrounds.Q10377_TheInvadedExecutionGrounds;
import quests.Q10378_WeedingWork.Q10378_WeedingWork;
import quests.Q10379_AnUninvitedGuest.Q10379_AnUninvitedGuest;
import quests.Q10380_TheExecutionersExecution.Q10380_TheExecutionersExecution;
import quests.Q10381_ToTheSeedOfHellfire.Q10381_ToTheSeedOfHellfire;
import quests.Q10382_DayOfLiberation.Q10382_DayOfLiberation;
import quests.Q10383_FergasonsOffer.Q10383_FergasonsOffer;
import quests.Q10384_AnAudienceWithTauti.Q10384_AnAudienceWithTauti;
import quests.Q10385_RedThreadOfFate.Q10385_RedThreadOfFate;
import quests.Q10386_MysteriousJourney.Q10386_MysteriousJourney;
import quests.Q10387_SoullessOne.Q10387_SoullessOne;
import quests.Q10388_ConspiracyBehindDoor.Q10388_ConspiracyBehindDoor;
import quests.Q10389_TheVoiceOfAuthority.Q10389_TheVoiceOfAuthority;
import quests.Q10390_KekropusLetter.Q10390_KekropusLetter;
import quests.Q10391_ASuspiciousHelper.Q10391_ASuspiciousHelper;
import quests.Q10392_FailureAndItsConsequences.Q10392_FailureAndItsConsequences;
import quests.Q10393_KekropusLetterAClueCompleted.Q10393_KekropusLetterAClueCompleted;
import quests.Q10394_MutualBenefit.Q10394_MutualBenefit;
import quests.Q10395_NotATraitor.Q10395_NotATraitor;
import quests.Q10397_KekropusLetterASuspiciousBadge.Q10397_KekropusLetterASuspiciousBadge;
import quests.Q10398_ASuspiciousBadge.Q10398_ASuspiciousBadge;
import quests.Q10399_TheAlphabetOfTheGiants.Q10399_TheAlphabetOfTheGiants;
import quests.Q10401_KekropusLetterDecodingTheBadge.Q10401_KekropusLetterDecodingTheBadge;
import quests.Q10402_NowhereToTurn.Q10402_NowhereToTurn;
import quests.Q10403_TheGuardianGiant.Q10403_TheGuardianGiant;
import quests.Q10404_KekropusLetterAHiddenMeaning.Q10404_KekropusLetterAHiddenMeaning;
import quests.Q10405_KartiasSeed.Q10405_KartiasSeed;
import quests.Q10406_BeforeDarknessBearsFruit.Q10406_BeforeDarknessBearsFruit;
import quests.Q10408_KekropusLetterTheSwampOfScreams.Q10408_KekropusLetterTheSwampOfScreams;
import quests.Q10409_ASuspiciousVagabondInTheSwamp.Q10409_ASuspiciousVagabondInTheSwamp;
import quests.Q10410_EmbryoInTheSwampOfScreams.Q10410_EmbryoInTheSwampOfScreams;
import quests.Q10411_KekropusLetterTheForestOfTheDead.Q10411_KekropusLetterTheForestOfTheDead;
import quests.Q10412_ASuspiciousVagabondInTheForest.Q10412_ASuspiciousVagabondInTheForest;
import quests.Q10413_EmbryoInTheForestOfTheDead.Q10413_EmbryoInTheForestOfTheDead;
import quests.Q10414_KekropusLetterWithCourage.Q10414_KekropusLetterWithCourage;
import quests.Q10415_KekropusLetterWithWisdom.Q10415_KekropusLetterWithWisdom;
import quests.Q10416_InSearchOfTheEyeOfArgos.Q10416_InSearchOfTheEyeOfArgos;
import quests.Q10417_DaimonTheWhiteEyed.Q10417_DaimonTheWhiteEyed;
import quests.Q10419_KekropusLetterKampfsWhereabouts.Q10419_KekropusLetterKampfsWhereabouts;
import quests.Q10420_TheVarkaSilenosSupporters.Q10420_TheVarkaSilenosSupporters;
import quests.Q10421_AssassinationOfTheVarkaSilenosCommander.Q10421_AssassinationOfTheVarkaSilenosCommander;
import quests.Q10422_AssassinationOfTheVarkaSilenosChief.Q10422_AssassinationOfTheVarkaSilenosChief;
import quests.Q10424_KekropusLetterBelosWhereabouts.Q10424_KekropusLetterBelosWhereabouts;
import quests.Q10425_TheKetraOrcSupporters.Q10425_TheKetraOrcSupporters;
import quests.Q10426_AssassinationOfTheKetraOrcCommander.Q10426_AssassinationOfTheKetraOrcCommander;
import quests.Q10427_AssassinationOfTheKetraOrcChief.Q10427_AssassinationOfTheKetraOrcChief;
import quests.Q10430_KekropusLetterTrackingTheEvil.Q10430_KekropusLetterTrackingTheEvil;
import quests.Q10431_TheSealOfPunishmentDenOfEvil.Q10431_TheSealOfPunishmentDenOfEvil;
import quests.Q10432_ChasingVarangka.Q10432_ChasingVarangka;
import quests.Q10433_KekropusLetterRegardingASeal.Q10433_KekropusLetterRegardingASeal;
import quests.Q10434_TheSealOfPunishmentSelMahumTrainingGrounds.Q10434_TheSealOfPunishmentSelMahumTrainingGrounds;
import quests.Q10435_ChasingKeltron.Q10435_ChasingKeltron;
import quests.Q10436_KekropusLetterTheSealOfPunishment.Q10436_KekropusLetterTheSealOfPunishment;
import quests.Q10437_TheSealOfPunishmentPlainsOfTheLizardmen.Q10437_TheSealOfPunishmentPlainsOfTheLizardmen;
import quests.Q10438_ChasingLoygen.Q10438_ChasingLoygen;
import quests.Q10439_KekropusLetterTheOriginsOfARumor.Q10439_KekropusLetterTheOriginsOfARumor;
import quests.Q10440_TheSealOfPunishmentTheFields.Q10440_TheSealOfPunishmentTheFields;
import quests.Q10441_ChasingMeccadan.Q10441_ChasingMeccadan;
import quests.Q10442_TheAnnihilatedPlains1.Q10442_TheAnnihilatedPlains1;
import quests.Q10443_TheAnnihilatedPlains2.Q10443_TheAnnihilatedPlains2;
import quests.Q10444_TheOriginOfMonsters.Q10444_TheOriginOfMonsters;
import quests.Q10445_AnImpendingThreat.Q10445_AnImpendingThreat;
import quests.Q10446_HitAndRun.Q10446_HitAndRun;
import quests.Q10447_TimingIsEverything.Q10447_TimingIsEverything;
import quests.Q10450_ADarkAmbition.Q10450_ADarkAmbition;
import quests.Q10452_IsItEdible.Q10452_IsItEdible;
import quests.Q10453_StoppingTheWindDragon.Q10453_StoppingTheWindDragon;
import quests.Q10455_ElikiasLetter.Q10455_ElikiasLetter;
import quests.Q10457_KefensisIllusion.Q10457_KefensisIllusion;
import quests.Q10459_ASickAmbition.Q10459_ASickAmbition;
import quests.Q10460_ReturnOfTheAlligatorHunter.Q10460_ReturnOfTheAlligatorHunter;
import quests.Q10461_TappingThePowerWithin.Q10461_TappingThePowerWithin;
import quests.Q10462_TemperARustingBlade.Q10462_TemperARustingBlade;
import quests.Q10464_BePreparedForAnything.Q10464_BePreparedForAnything;
import quests.Q10472_WindsOfFateEncroachingShadows.Q10472_WindsOfFateEncroachingShadows;
import quests.Q10501_ZakenEmbroideredSoulCloak.Q10501_ZakenEmbroideredSoulCloak;
import quests.Q10502_FreyaEmbroideredSoulCloak.Q10502_FreyaEmbroideredSoulCloak;
import quests.Q10503_FrintezzaEmbroideredSoulCloak.Q10503_FrintezzaEmbroideredSoulCloak;
import quests.Q10504_JewelOfAntharas.Q10504_JewelOfAntharas;
import quests.Q10505_JewelOfValakas.Q10505_JewelOfValakas;
import quests.Q10701_TheRoadToDestruction.Q10701_TheRoadToDestruction;
import quests.Q10702_TheRoadToInfinity.Q10702_TheRoadToInfinity;
import quests.Q10703_BottleOfIstinasSoul.Q10703_BottleOfIstinasSoul;
import quests.Q10704_BottleOfOctavisSoul.Q10704_BottleOfOctavisSoul;
import quests.Q10705_BottleOfTautisSoul.Q10705_BottleOfTautisSoul;
import quests.Q10707_FlamesOfSorrow.Q10707_FlamesOfSorrow;
import quests.Q10708_StrengthenTheBarrier.Q10708_StrengthenTheBarrier;
import quests.Q10709_TheStolenSeed.Q10709_TheStolenSeed;
import quests.Q10710_LifeEnergyRepository.Q10710_LifeEnergyRepository;
import quests.Q10732_AForeignLand.Q10732_AForeignLand;
import quests.Q10733_TheTestForSurvival.Q10733_TheTestForSurvival;
import quests.Q10734_DoOrDie.Q10734_DoOrDie;
import quests.Q10735_ASpecialPower.Q10735_ASpecialPower;
import quests.Q10736_ASpecialPower.Q10736_ASpecialPower;
import quests.Q10737_GrakonsWarehouse.Q10737_GrakonsWarehouse;
import quests.Q10738_AnInnerBeauty.Q10738_AnInnerBeauty;
import quests.Q10739_SupplyAndDemand.Q10739_SupplyAndDemand;
import quests.Q10740_NeverForget.Q10740_NeverForget;
import quests.Q10741_ADraughtForTheCold.Q10741_ADraughtForTheCold;
import quests.Q10742_AFurryFriend.Q10742_AFurryFriend;
import quests.Q10743_StrangeFungus.Q10743_StrangeFungus;
import quests.Q10744_StrongerThanSteel.Q10744_StrongerThanSteel;
import quests.Q10745_TheSecretIngredients.Q10745_TheSecretIngredients;
import quests.Q10746_SeeTheWorld.Q10746_SeeTheWorld;
import quests.Q10748_MysteriousSuggestion1.Q10748_MysteriousSuggestion1;
import quests.Q10749_MysteriousSuggestion2.Q10749_MysteriousSuggestion2;
import quests.Q10751_WindsOfFateEncounters.Q10751_WindsOfFateEncounters;
import quests.Q10752_WindsOfFateAPromise.Q10752_WindsOfFateAPromise;
import quests.Q10753_WindsOfFateChoices.Q10753_WindsOfFateChoices;
import quests.Q10755_LettersFromTheQueenWindyHill.Q10755_LettersFromTheQueenWindyHill;
import quests.Q10756_AnInterdimensionalDraft.Q10756_AnInterdimensionalDraft;
import quests.Q10757_QuietingTheStorm.Q10757_QuietingTheStorm;
import quests.Q10758_TheOathOfTheWind.Q10758_TheOathOfTheWind;
import quests.Q10760_LettersFromTheQueenOrcBarracks.Q10760_LettersFromTheQueenOrcBarracks;
import quests.Q10761_AnOrcInLove.Q10761_AnOrcInLove;
import quests.Q10762_MarionetteSpirit.Q10762_MarionetteSpirit;
import quests.Q10763_TerrifyingChertuba.Q10763_TerrifyingChertuba;
import quests.Q10764_FreeSpirit.Q10764_FreeSpirit;
import quests.Q10766_ANewCraft.Q10766_ANewCraft;
import quests.Q10767_AWholeNewLevelOfAlchemy.Q10767_AWholeNewLevelOfAlchemy;
import quests.Q10769_LettersFromTheQueenCrumaTowerPart1.Q10769_LettersFromTheQueenCrumaTowerPart1;
import quests.Q10770_InSearchOfTheGrail.Q10770_InSearchOfTheGrail;
import quests.Q10771_VolatilePower.Q10771_VolatilePower;
import quests.Q10772_ReportsFromCrumaTowerPart1.Q10772_ReportsFromCrumaTowerPart1;
import quests.Q10774_LettersFromTheQueenCrumaTowerPart2.Q10774_LettersFromTheQueenCrumaTowerPart2;
import quests.Q10775_InSearchOfAnAncientGiant.Q10775_InSearchOfAnAncientGiant;
import quests.Q10776_TheWrathOfTheGiants.Q10776_TheWrathOfTheGiants;
import quests.Q10777_ReportsFromCrumaTowerPart2.Q10777_ReportsFromCrumaTowerPart2;
import quests.Q10779_LettersFromTheQueenSeaOfSpores.Q10779_LettersFromTheQueenSeaOfSpores;
import quests.Q10780_AWeakenedBarrier.Q10780_AWeakenedBarrier;
import quests.Q10781_IngredientsToEnforcements.Q10781_IngredientsToEnforcements;
import quests.Q10782_LettersFromTheQueenForsakenPlains.Q10782_LettersFromTheQueenForsakenPlains;
import quests.Q10783_TracesOfAnAmbush.Q10783_TracesOfAnAmbush;
import quests.Q10784_TheBrokenDevice.Q10784_TheBrokenDevice;
import quests.Q10785_LettersFromTheQueenFieldsOfMassacre.Q10785_LettersFromTheQueenFieldsOfMassacre;
import quests.Q10786_ResidentProblemSolver.Q10786_ResidentProblemSolver;
import quests.Q10787_ASpyMission.Q10787_ASpyMission;
import quests.Q10789_LettersFromTheQueenSwampOfScreams.Q10789_LettersFromTheQueenSwampOfScreams;
import quests.Q10790_AMercenaryHelper.Q10790_AMercenaryHelper;
import quests.Q10791_TheManOfMystery.Q10791_TheManOfMystery;
import quests.Q10792_LettersFromTheQueenForestOfTheDead.Q10792_LettersFromTheQueenForestOfTheDead;
import quests.Q10793_SaveTheSouls.Q10793_SaveTheSouls;
import quests.Q10794_InvestigateTheForest.Q10794_InvestigateTheForest;
import quests.Q10795_LettersFromTheQueenWallOfAgros.Q10795_LettersFromTheQueenWallOfAgros;
import quests.Q10796_TheEyeThatDefiedTheGods.Q10796_TheEyeThatDefiedTheGods;
import quests.Q10797_CrossingFate.Q10797_CrossingFate;
import quests.Q10798_LettersFromTheQueenDragonValley.Q10798_LettersFromTheQueenDragonValley;
import quests.Q10799_StrangeThingsAfootInTheValley.Q10799_StrangeThingsAfootInTheValley;
import quests.Q10800_ReconnaissanceAtDragonValley.Q10800_ReconnaissanceAtDragonValley;
import quests.Q10801_TheDimensionalWarpPart1.Q10801_TheDimensionalWarpPart1;
import quests.not_done.Q00353_PowerOfDarkness;
import quests.not_done.Q00480_AnotherLegacyOfCrumaTower;
import quests.not_done.Q00504_CompetitionForTheBanditStronghold;
import quests.not_done.Q00655_AGrandPlanForTamingWildBeasts;
import quests.not_done.Q00750_SevenFlowers;
import quests.not_done.Q00767_BanishingEvil;
import quests.not_done.Q00768_TerrorOfTown;
import quests.not_done.Q00769_TheTruthConcealedInBeauty;
import quests.not_done.Q00770_MaintainingTheFieldBusiness;
import quests.not_done.Q00771_PartakingInThePurificationCampaign;
import quests.not_done.Q10352_LegacyOfCrumaTower;
import quests.not_done.Q10357_AltarOfBloodThatAwakensDestruction;
import quests.not_done.Q10456_OperationRescue;
import quests.not_done.Q10458_ToTheDesertQuarry;
import quests.not_done.Q10463_TheSoulOfASword;
import quests.not_done.Q10506_PaddysRequest;
import quests.not_done.Q10507_PaddysRequest;
import quests.not_done.Q10508_PaddysRequest;
import quests.not_done.Q10713_TheHerosJourneyBloodySwampland;
import quests.not_done.Q10714_TheHerosJourneySeedOfAnnihilation;
import quests.not_done.Q10715_TheHerosJourneyHarnakUndergroundRuins;
import quests.not_done.Q10716_TheHerosJourneyKartiasLabyrinth;
import quests.not_done.Q10718_TheHerosJourneyFairySettlement;
import quests.not_done.Q10721_TheHerosJourneyPrisonOfDarkness;
import quests.not_done.Q10722_TheHerosJourneyFortuna;
import quests.not_done.Q10724_TheHerosJourneyIsleOfSouls;
import quests.not_done.Q10725_TheHerosJourneyNornilsCave;
import quests.not_done.Q10727_TheHerosJourneySealOfShilen;
import quests.not_done.Q10728_TheHerosJourneyCemetary;
import quests.not_done.Q10729_TheHerosJourneyGuillotineFortress;
import quests.not_done.Q10730_TheHerosJourneyOrbisTemple;
import quests.not_done.Q10747_TheHerosJourneyPaganTemple;
import quests.not_done.Q10809_TheHerosJourneyBlazingSwamp;

/**
 * @author NosBit
 */
public class QuestMasterHandler
{
	private static final Logger LOGGER = Logger.getLogger(QuestMasterHandler.class.getName());
	
	private static final Class<?>[] QUESTS =
	{
		Q00013_ParcelDelivery.class,
		Q00015_SweetWhispers.class,
		Q00016_TheComingDarkness.class,
		Q00017_LightAndDarkness.class,
		Q00019_GoToThePastureland.class,
		Q00020_BringUpWithLove.class,
		Q00026_TiredOfWaiting.class,
		Q00031_SecretBuriedInTheSwamp.class,
		Q00032_AnObviousLie.class,
		Q00033_MakeAPairOfDressShoes.class,
		Q00034_InSearchOfCloth.class,
		Q00035_FindGlitteringJewelry.class,
		Q00036_MakeASewingKit.class,
		Q00037_MakeFormalWear.class,
		Q00038_DragonFangs.class,
		Q00039_RedEyedInvaders.class,
		Q00040_ASpecialOrder.class,
		Q00042_HelpTheUncle.class,
		Q00043_HelpTheSister.class,
		Q00044_HelpTheSon.class,
		Q00061_LawEnforcement.class,
		Q00109_InSearchOfTheNest.class,
		Q00110_ToThePrimevalIsle.class,
		Q00111_ElrokianHuntersProof.class,
		Q00113_StatusOfTheBeaconTower.class,
		Q00114_ResurrectionOfAnOldManager.class,
		Q00115_TheOtherSideOfTruth.class,
		Q00117_TheOceanOfDistantStars.class,
		Q00119_LastImperialPrince.class,
		Q00120_PavelsLastResearch.class,
		Q00121_PavelTheGiant.class,
		Q00122_OminousNews.class,
		Q00124_MeetingTheElroki.class,
		Q00125_TheNameOfEvil1.class,
		Q00126_TheNameOfEvil2.class,
		Q00128_PailakaSongOfIceAndFire.class,
		Q00129_PailakaDevilsLegacy.class,
		Q00134_TempleMissionary.class,
		Q00135_TempleExecutor.class,
		Q00136_MoreThanMeetsTheEye.class,
		Q00137_TempleChampionPart1.class,
		Q00138_TempleChampionPart2.class,
		Q00139_ShadowFoxPart1.class,
		Q00140_ShadowFoxPart2.class,
		Q00141_ShadowFoxPart3.class,
		Q00142_FallenAngelRequestOfDawn.class,
		Q00143_FallenAngelRequestOfDusk.class,
		Q00144_PailakaInjuredDragon.class,
		Q00146_TheZeroHour.class,
		Q00149_PrimalMotherIstina.class,
		Q00150_ExtremeChallengePrimalMotherResurrected.class,
		Q00177_SplitDestiny.class,
		Q00180_InfernalFlamesBurningInCrystalPrison.class,
		Q00181_DevilsStrikeBackAdventOfBalok.class,
		Q00183_RelicExploration.class,
		Q00184_ArtOfPersuasion.class,
		Q00185_NikolasCooperation.class,
		Q00186_ContractExecution.class,
		Q00187_NikolasHeart.class,
		Q00189_ContractCompletion.class,
		Q00190_LostDream.class,
		Q00192_SevenSignsSeriesOfDoubt.class,
		Q00193_SevenSignsDyingMessage.class,
		Q00194_SevenSignsMammonsContract.class,
		Q00195_SevenSignsSecretRitualOfThePriests.class,
		Q00196_SevenSignsSealOfTheEmperor.class,
		Q00197_SevenSignsTheSacredBookOfSeal.class,
		Q00198_SevenSignsEmbryo.class,
		Q00210_ObtainAWolfPet.class,
		Q00237_WindsOfChange.class,
		Q00238_SuccessFailureOfBusiness.class,
		Q00239_WontYouJoinUs.class,
		Q00240_ImTheOnlyOneYouCanTrust.class,
		Q00245_ComeToMe.class,
		Q00254_LegendaryTales.class,
		Q00270_TheOneWhoEndsSilence.class,
		Q00278_HomeSecurity.class,
		Q00298_LizardmensConspiracy.class,
		Q00307_ControlDeviceOfTheGiants.class,
		Q00310_OnlyWhatRemains.class,
		Q00336_CoinsOfMagic.class,
		Q00337_AudienceWithTheLandDragon.class,
		Q00344_1000YearsTheEndOfLamentation.class,
		Q00350_EnhanceYourWeapon.class,
		Q00353_PowerOfDarkness.class, // TODO: Not done.
		Q00357_WarehouseKeepersAmbition.class,
		Q00359_ForASleeplessDeadman.class,
		Q00371_ShrieksOfGhosts.class,
		Q00372_LegacyOfInsolence.class,
		Q00373_SupplierOfReagents.class,
		Q00376_ExplorationOfTheGiantsCavePart1.class,
		Q00377_ExplorationOfTheGiantsCavePart2.class,
		Q00381_LetsBecomeARoyalMember.class,
		Q00382_KailsMagicCoin.class,
		Q00386_StolenDignity.class,
		Q00420_LittleWing.class,
		Q00421_LittleWingsBigAdventure.class,
		Q00431_WeddingMarch.class,
		Q00432_BirthdayPartySong.class,
		Q00450_GraveRobberRescue.class,
		Q00451_LuciensAltar.class,
		Q00452_FindingtheLostSoldiers.class,
		Q00453_NotStrongEnoughAlone.class,
		Q00454_CompletelyLost.class,
		Q00455_WingsOfSand.class,
		Q00456_DontKnowDontCare.class,
		Q00457_LostAndFound.class,
		Q00458_PerfectForm.class,
		Q00459_TheVillainOfTheUndergroundMineTeredor.class,
		Q00460_PreciousResearchMaterial.class,
		Q00462_StuffedAncientHeroes.class,
		Q00463_IMustBeaGenius.class,
		Q00464_Oath.class,
		Q00465_WeAreFriends.class,
		Q00466_PlacingMySmallPower.class,
		Q00468_BeLostInTheMysteriousScent.class,
		Q00469_SuspiciousGardener.class,
		Q00470_DivinityProtector.class,
		Q00471_BreakingThroughTheEmeraldSquare.class,
		Q00472_ChallengeSteamCorridor.class,
		Q00473_InTheCoralGarden.class,
		Q00474_WaitingForTheSummer.class,
		Q00476_PlainMission.class,
		Q00480_AnotherLegacyOfCrumaTower.class, // TODO: Not done.
		Q00481_ShadowHelper.class,
		Q00482_RecertificationOfValue.class,
		Q00483_IntendedTactic.class,
		Q00485_HotSpringWater.class,
		Q00488_WondersOfCaring.class,
		Q00489_InThisQuietPlace.class,
		Q00490_DutyOfTheSurvivor.class,
		Q00491_InNominePatris.class,
		Q00492_TombRaiders.class,
		Q00493_KickingOutUnwelcomeGuests.class,
		Q00494_IncarnationOfGreedZellakaGroup.class,
		Q00495_IncarnationOfJealousyPellineGroup.class,
		Q00496_IncarnationOfGluttonyKaliosGroup.class,
		Q00497_IncarnationOfGreedZellakaSolo.class,
		Q00498_IncarnationOfJealousyPellineSolo.class,
		Q00499_IncarnationOfGluttonyKaliosSolo.class,
		Q00500_BrothersBoundInChains.class,
		Q00501_ProofOfClanAlliance.class,
		Q00503_PursuitOfClanAmbition.class,
		Q00504_CompetitionForTheBanditStronghold.class, // TODO: Not done.
		Q00508_AClansReputation.class,
		Q00509_AClansFame.class,
		Q00510_AClansPrestige.class,
		Q00511_AwlUnderFoot.class,
		Q00512_BladeUnderFoot.class,
		Q00551_OlympiadStarter.class,
		Q00553_OlympiadUndefeated.class,
		Q00617_GatherTheFlames.class,
		Q00618_IntoTheFlame.class,
		Q00620_FourGoblets.class,
		Q00621_EggDelivery.class,
		Q00622_SpecialtyLiquorDelivery.class,
		Q00623_TheFinestFood.class,
		Q00624_TheFinestIngredientsPart1.class,
		Q00625_TheFinestIngredientsPart2.class,
		Q00626_ADarkTwilight.class,
		Q00627_HeartInSearchOfPower.class,
		Q00631_DeliciousTopChoiceMeat.class,
		Q00641_AttackSailren.class,
		Q00642_APowerfulPrimevalCreature.class,
		Q00643_RiseAndFallOfTheElrokiTribe.class,
		Q00645_GhostsOfBatur.class,
		Q00647_InfluxOfMachines.class,
		Q00648_AnIceMerchantsDream.class,
		Q00650_ABrokenDream.class,
		Q00652_AnAgedExAdventurer.class,
		Q00655_AGrandPlanForTamingWildBeasts.class, // TODO: Not done.
		Q00662_AGameOfCards.class,
		Q00663_SeductiveWhispers.class,
		Q00688_DefeatTheElrokianRaiders.class,
		Q00699_GuardianOfTheSkies.class,
		Q00700_CursedLife.class,
		Q00701_ProofOfExistence.class,
		Q00702_ATrapForRevenge.class,
		Q00726_LightWithinTheDarkness.class,
		Q00727_HopeWithinTheDarkness.class,
		Q00750_SevenFlowers.class, // TODO: Not done.
		Q00751_LiberatingTheSpirits.class,
		Q00752_UncoverTheSecret.class,
		Q00753_ReactingToACrisis.class,
		Q00754_AssistingTheRebelForces.class,
		Q00755_InNeedOfPetras.class,
		Q00756_TopQualityPetra.class,
		Q00757_TriolsMovement.class,
		Q00758_TheFallenKingsMen.class,
		Q00759_TheDwarvenNightmareContinues.class,
		Q00761_AssistingTheGoldenRamArmy.class,
		Q00762_AnOminousRequest.class,
		Q00763_ADauntingTask.class,
		Q00764_WeakeningTheVarkaSilenosForces.class,
		Q00765_WeakeningTheKetraOrcForces.class,
		Q00767_BanishingEvil.class, // TODO: Not done.
		Q00768_TerrorOfTown.class, // TODO: Not done.
		Q00769_TheTruthConcealedInBeauty.class, // TODO: Not done.
		Q00770_MaintainingTheFieldBusiness.class, // TODO: Not done.
		Q00771_PartakingInThePurificationCampaign.class, // TODO: Not done.
		Q00772_PurifyingSouls.class,
		Q00775_RetrievingTheChaosFragment.class,
		Q00776_SlayDarkLordEkimus.class,
		Q00777_SlayDarkLordTiat.class,
		Q00778_OperationRoaringFlame.class,
		Q00779_UtilizeTheDarknessSeedOfDestruction.class,
		Q00780_UtilizeTheDarknessSeedOfInfinity.class,
		Q00781_UtilizeTheDarknessSeedOfAnnihilation.class,
		Q00782_UtilizeTheDarknessSeedOfHellfire.class,
		Q00784_TheQuietKiller.class,
		Q00785_ASuspiciousIngredient.class,
		Q00786_AwaitingTheVoiceOfTheGods.class,
		Q00787_TheRoleOfAWatcher.class,
		Q00789_WaitingForPaagrio.class,
		Q00901_HowLavasaurusesAreMade.class,
		Q00902_ReclaimOurEra.class,
		Q00903_TheCallOfAntharas.class,
		Q00904_DragonTrophyAntharas.class,
		Q00905_RefinedDragonBlood.class,
		Q00906_TheCallOfValakas.class,
		Q00907_DragonTrophyValakas.class,
		Q00943_FillingTheEnergyOfDestruction.class,
		Q10273_GoodDayToFly.class,
		Q10274_CollectingInTheAir.class,
		Q10275_ContainingTheAttributePower.class,
		Q10282_ToTheSeedOfAnnihilation.class,
		Q10283_RequestOfIceMerchant.class,
		Q10284_AcquisitionOfDivineSword.class,
		Q10285_MeetingSirra.class,
		Q10286_ReunionWithSirra.class,
		Q10287_StoryOfThoseLeft.class,
		Q10288_SecretMission.class,
		Q10289_FadeToBlack.class,
		Q10290_LandDragonConqueror.class,
		Q10291_FireDragonDestroyer.class,
		Q10292_SevenSignsGirlOfDoubt.class,
		Q10293_SevenSignsForbiddenBookOfTheElmoreAdenKingdom.class,
		Q10294_SevenSignsToTheMonasteryOfSilence.class,
		Q10295_SevenSignsSolinasTomb.class,
		Q10296_SevenSignsOneWhoSeeksThePowerOfTheSeal.class,
		Q10301_ShadowOfTerrorBlackishRedFog.class,
		Q10302_UnsettlingShadowAndRumors.class,
		Q10303_CrossroadsBetweenLightAndDarkness.class,
		Q10304_ForForgottenHeroes.class,
		Q10305_UnstoppableFutileEfforts.class,
		Q10306_TheCorruptedLeader.class,
		Q10307_TheCorruptedLeaderHisTruth.class,
		Q10310_TwistedCreationTree.class,
		Q10311_PeacefulDaysAreOver.class,
		Q10312_AbandonedGodsCreature.class,
		Q10315_ToThePrisonOfDarkness.class,
		Q10316_UndecayingMemoryOfThePast.class,
		Q10317_OrbisWitch.class,
		Q10318_DecayingDarkness.class,
		Q10320_LetsGoToTheCentralSquare.class,
		Q10321_QualificationsOfTheSeeker.class,
		Q10322_SearchingForTheMysteriousPower.class,
		Q10323_TrainLikeItsReal.class,
		Q10324_FindingMagisterGallint.class,
		Q10325_SearchingForNewPower.class,
		Q10326_RespectYourElders.class,
		Q10327_IntruderWhoWantsTheBookOfGiants.class,
		Q10328_RequestToSealTheEvilFragment.class,
		Q10329_BackupSeekers.class,
		Q10330_ToTheRuinsOfYeSagira.class,
		Q10331_StartOfFate.class,
		Q10332_ToughRoad.class,
		Q10333_DisappearedSakum.class,
		Q10334_ReportingTheStatusOfTheWindmillHill.class,
		Q10335_RequestToFindSakum.class,
		Q10336_DividedSakumKanilov.class,
		Q10337_SakumsImpact.class,
		Q10338_SeizeYourDestiny.class,
		Q10339_FightingTheForgotten.class,
		Q10341_DayOfDestinyHumansFate.class,
		Q10342_DayOfDestinyElvenFate.class,
		Q10343_DayOfDestinyDarkElfsFate.class,
		Q10344_DayOfDestinyOrcsFate.class,
		Q10345_DayOfDestinyDwarfsFate.class,
		Q10346_DayOfDestinyKamaelsFate.class,
		Q10351_OwnerOfHall.class,
		Q10352_LegacyOfCrumaTower.class, // TODO: Not done.
		Q10353_CertificationOfValue.class,
		Q10354_ResurrectedOwnerOfHall.class,
		Q10357_AltarOfBloodThatAwakensDestruction.class, // TODO: Not done.
		Q10358_DividedSakumPoslof.class,
		Q10359_TracesOfEvil.class,
		Q10360_CertificationOfFate.class,
		Q10361_RolesOfTheSeeker.class,
		Q10362_CertificationOfTheSeeker.class,
		Q10363_RequestOfTheSeeker.class,
		Q10364_ObligationsOfTheSeeker.class,
		Q10365_SeekerEscort.class,
		Q10366_RuinsStatusUpdate.class,
		Q10368_RebellionOfMonsters.class,
		Q10369_NoblesseSoulTesting.class,
		Q10370_MenacingTimes.class,
		Q10371_GraspThyPower.class,
		Q10372_PurgatoryVolvere.class,
		Q10374_ThatPlaceSuccubus.class,
		Q10375_SuccubusDisciples.class,
		Q10376_BloodyGoodTime.class,
		Q10377_TheInvadedExecutionGrounds.class,
		Q10378_WeedingWork.class,
		Q10379_AnUninvitedGuest.class,
		Q10380_TheExecutionersExecution.class,
		Q10381_ToTheSeedOfHellfire.class,
		Q10382_DayOfLiberation.class,
		Q10383_FergasonsOffer.class,
		Q10384_AnAudienceWithTauti.class,
		Q10385_RedThreadOfFate.class,
		Q10386_MysteriousJourney.class,
		Q10387_SoullessOne.class,
		Q10388_ConspiracyBehindDoor.class,
		Q10389_TheVoiceOfAuthority.class,
		Q10390_KekropusLetter.class,
		Q10391_ASuspiciousHelper.class,
		Q10392_FailureAndItsConsequences.class,
		Q10393_KekropusLetterAClueCompleted.class,
		Q10394_MutualBenefit.class,
		Q10395_NotATraitor.class,
		Q10397_KekropusLetterASuspiciousBadge.class,
		Q10398_ASuspiciousBadge.class,
		Q10399_TheAlphabetOfTheGiants.class,
		Q10401_KekropusLetterDecodingTheBadge.class,
		Q10402_NowhereToTurn.class,
		Q10403_TheGuardianGiant.class,
		Q10404_KekropusLetterAHiddenMeaning.class,
		Q10405_KartiasSeed.class,
		Q10406_BeforeDarknessBearsFruit.class,
		Q10408_KekropusLetterTheSwampOfScreams.class,
		Q10409_ASuspiciousVagabondInTheSwamp.class,
		Q10410_EmbryoInTheSwampOfScreams.class,
		Q10411_KekropusLetterTheForestOfTheDead.class,
		Q10412_ASuspiciousVagabondInTheForest.class,
		Q10413_EmbryoInTheForestOfTheDead.class,
		Q10414_KekropusLetterWithCourage.class,
		Q10415_KekropusLetterWithWisdom.class,
		Q10416_InSearchOfTheEyeOfArgos.class,
		Q10417_DaimonTheWhiteEyed.class,
		Q10419_KekropusLetterKampfsWhereabouts.class,
		Q10420_TheVarkaSilenosSupporters.class,
		Q10421_AssassinationOfTheVarkaSilenosCommander.class,
		Q10422_AssassinationOfTheVarkaSilenosChief.class,
		Q10424_KekropusLetterBelosWhereabouts.class,
		Q10425_TheKetraOrcSupporters.class,
		Q10426_AssassinationOfTheKetraOrcCommander.class,
		Q10427_AssassinationOfTheKetraOrcChief.class,
		Q10430_KekropusLetterTrackingTheEvil.class,
		Q10431_TheSealOfPunishmentDenOfEvil.class,
		Q10432_ChasingVarangka.class,
		Q10433_KekropusLetterRegardingASeal.class,
		Q10434_TheSealOfPunishmentSelMahumTrainingGrounds.class,
		Q10435_ChasingKeltron.class,
		Q10436_KekropusLetterTheSealOfPunishment.class,
		Q10437_TheSealOfPunishmentPlainsOfTheLizardmen.class,
		Q10438_ChasingLoygen.class,
		Q10439_KekropusLetterTheOriginsOfARumor.class,
		Q10440_TheSealOfPunishmentTheFields.class,
		Q10441_ChasingMeccadan.class,
		Q10442_TheAnnihilatedPlains1.class,
		Q10443_TheAnnihilatedPlains2.class,
		Q10444_TheOriginOfMonsters.class,
		Q10445_AnImpendingThreat.class,
		Q10446_HitAndRun.class,
		Q10447_TimingIsEverything.class,
		Q10450_ADarkAmbition.class,
		Q10452_IsItEdible.class,
		Q10453_StoppingTheWindDragon.class,
		Q10455_ElikiasLetter.class,
		Q10456_OperationRescue.class, // TODO: Not done.
		Q10457_KefensisIllusion.class,
		Q10458_ToTheDesertQuarry.class, // TODO: Not done.
		Q10459_ASickAmbition.class,
		Q10460_ReturnOfTheAlligatorHunter.class,
		Q10461_TappingThePowerWithin.class,
		Q10462_TemperARustingBlade.class,
		Q10463_TheSoulOfASword.class, // TODO: Not done.
		Q10464_BePreparedForAnything.class,
		Q10472_WindsOfFateEncroachingShadows.class,
		Q10501_ZakenEmbroideredSoulCloak.class,
		Q10502_FreyaEmbroideredSoulCloak.class,
		Q10503_FrintezzaEmbroideredSoulCloak.class,
		Q10504_JewelOfAntharas.class,
		Q10505_JewelOfValakas.class,
		Q10506_PaddysRequest.class, // TODO: Not done.
		Q10507_PaddysRequest.class, // TODO: Not done.
		Q10508_PaddysRequest.class, // TODO: Not done.
		Q10701_TheRoadToDestruction.class,
		Q10702_TheRoadToInfinity.class,
		Q10703_BottleOfIstinasSoul.class,
		Q10704_BottleOfOctavisSoul.class,
		Q10705_BottleOfTautisSoul.class,
		Q10707_FlamesOfSorrow.class,
		Q10708_StrengthenTheBarrier.class,
		Q10709_TheStolenSeed.class,
		Q10710_LifeEnergyRepository.class,
		Q10713_TheHerosJourneyBloodySwampland.class, // TODO: Not done.
		Q10714_TheHerosJourneySeedOfAnnihilation.class, // TODO: Not done.
		Q10715_TheHerosJourneyHarnakUndergroundRuins.class, // TODO: Not done.
		Q10716_TheHerosJourneyKartiasLabyrinth.class, // TODO: Not done.
		Q10718_TheHerosJourneyFairySettlement.class, // TODO: Not done.
		Q10721_TheHerosJourneyPrisonOfDarkness.class, // TODO: Not done.
		Q10722_TheHerosJourneyFortuna.class, // TODO: Not done.
		Q10724_TheHerosJourneyIsleOfSouls.class, // TODO: Not done.
		Q10725_TheHerosJourneyNornilsCave.class, // TODO: Not done.
		Q10727_TheHerosJourneySealOfShilen.class, // TODO: Not done.
		Q10728_TheHerosJourneyCemetary.class, // TODO: Not done.
		Q10729_TheHerosJourneyGuillotineFortress.class, // TODO: Not done.
		Q10730_TheHerosJourneyOrbisTemple.class, // TODO: Not done.
		Q10732_AForeignLand.class,
		Q10733_TheTestForSurvival.class,
		Q10734_DoOrDie.class,
		Q10735_ASpecialPower.class,
		Q10736_ASpecialPower.class,
		Q10737_GrakonsWarehouse.class,
		Q10738_AnInnerBeauty.class,
		Q10739_SupplyAndDemand.class,
		Q10740_NeverForget.class,
		Q10741_ADraughtForTheCold.class,
		Q10742_AFurryFriend.class,
		Q10743_StrangeFungus.class,
		Q10744_StrongerThanSteel.class,
		Q10745_TheSecretIngredients.class,
		Q10746_SeeTheWorld.class,
		Q10747_TheHerosJourneyPaganTemple.class, // TODO: Not done.
		Q10748_MysteriousSuggestion1.class,
		Q10749_MysteriousSuggestion2.class,
		Q10751_WindsOfFateEncounters.class,
		Q10752_WindsOfFateAPromise.class,
		Q10753_WindsOfFateChoices.class,
		Q10755_LettersFromTheQueenWindyHill.class,
		Q10756_AnInterdimensionalDraft.class,
		Q10757_QuietingTheStorm.class,
		Q10758_TheOathOfTheWind.class,
		Q10760_LettersFromTheQueenOrcBarracks.class,
		Q10761_AnOrcInLove.class,
		Q10762_MarionetteSpirit.class,
		Q10763_TerrifyingChertuba.class,
		Q10764_FreeSpirit.class,
		Q10766_ANewCraft.class,
		Q10767_AWholeNewLevelOfAlchemy.class,
		Q10769_LettersFromTheQueenCrumaTowerPart1.class,
		Q10770_InSearchOfTheGrail.class,
		Q10771_VolatilePower.class,
		Q10772_ReportsFromCrumaTowerPart1.class,
		Q10774_LettersFromTheQueenCrumaTowerPart2.class,
		Q10775_InSearchOfAnAncientGiant.class,
		Q10776_TheWrathOfTheGiants.class,
		Q10777_ReportsFromCrumaTowerPart2.class,
		Q10779_LettersFromTheQueenSeaOfSpores.class,
		Q10780_AWeakenedBarrier.class,
		Q10781_IngredientsToEnforcements.class,
		Q10782_LettersFromTheQueenForsakenPlains.class,
		Q10783_TracesOfAnAmbush.class,
		Q10784_TheBrokenDevice.class,
		Q10785_LettersFromTheQueenFieldsOfMassacre.class,
		Q10786_ResidentProblemSolver.class,
		Q10787_ASpyMission.class,
		Q10789_LettersFromTheQueenSwampOfScreams.class,
		Q10790_AMercenaryHelper.class,
		Q10791_TheManOfMystery.class,
		Q10792_LettersFromTheQueenForestOfTheDead.class,
		Q10793_SaveTheSouls.class,
		Q10794_InvestigateTheForest.class,
		Q10795_LettersFromTheQueenWallOfAgros.class,
		Q10796_TheEyeThatDefiedTheGods.class,
		Q10797_CrossingFate.class,
		Q10798_LettersFromTheQueenDragonValley.class,
		Q10799_StrangeThingsAfootInTheValley.class,
		Q10800_ReconnaissanceAtDragonValley.class,
		Q10801_TheDimensionalWarpPart1.class,
		Q10809_TheHerosJourneyBlazingSwamp.class, // TODO: Not done.
	};
	
	public static void main(String[] args)
	{
		for (Class<?> quest : QUESTS)
		{
			try
			{
				quest.getDeclaredConstructor().newInstance();
			}
			catch (Exception e)
			{
				LOGGER.log(Level.SEVERE, QuestMasterHandler.class.getSimpleName() + ": Failed loading " + quest.getSimpleName() + ":", e);
			}
		}
	}
}
