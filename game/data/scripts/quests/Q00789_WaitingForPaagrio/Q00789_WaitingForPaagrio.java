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
package quests.Q00789_WaitingForPaagrio;

import org.l2jmobius.gameserver.enums.QuestType;
import org.l2jmobius.gameserver.instancemanager.QuestManager;
import org.l2jmobius.gameserver.model.actor.Npc;
import org.l2jmobius.gameserver.model.actor.Player;
import org.l2jmobius.gameserver.model.quest.Quest;
import org.l2jmobius.gameserver.model.quest.QuestState;
import org.l2jmobius.gameserver.model.quest.State;

import quests.Q00759_TheDwarvenNightmareContinues.Q00759_TheDwarvenNightmareContinues;

/**
 * Waiting for Pa'agrio (789)
 * @author Kazumi
 */
public final class Q00789_WaitingForPaagrio extends Quest
{
	// NPCs
	private static final int HARP_ZU_HESTUI = 34014;
	// Monster
	private static final int[] MONSTERS =
	{
		23487, // Magma Ailith
		23488, // Magma Apophis
		23489, // Lava Wyrm
		23490, // Lava Drake
		23491, // Lava Wendigo
		23492, // Lavastone Golem
		23493, // Lava Leviah
		23494, // Magma Salamander
		23495, // Magma Dre Vanul
		23496, // Magma Ifrit
		23497, // Blazing Saurus
		23498, // Blazing Wizard
		23499, // Flame Preta
		23500, // Flame Crow
		23501, // Flame Rael
		23502, // Flame Salamander
		23503, // Flame Drake
		23504, // Flame Votis
	};
	// Items
	private static final int MAGMA_ORE = 45449;
	private static final int HARPS_REWARD_BOX = 45451;
	// Misc
	private static final int MIN_LEVEL = 97;
	private static final int MAX_LEVEL = 99;
	
	public Q00789_WaitingForPaagrio()
	{
		super(789);
		addStartNpc(HARP_ZU_HESTUI);
		addTalkId(HARP_ZU_HESTUI);
		addKillId(MONSTERS);
		registerQuestItems(MAGMA_ORE);
		addCondMinLevel(MIN_LEVEL, "harpe_zu_hestui_q0789_02.htm");
		addCondMaxLevel(MAX_LEVEL, "harpe_zu_hestui_q0789_02.htm");
	}
	
	@Override
	public String onEvent(String event, Npc npc, Player player)
	{
		final QuestState qs = getQuestState(player, false);
		if (qs == null)
		{
			return null;
		}
		
		String htmltext = null;
		
		switch (event)
		{
			case "harpe_zu_hestui_q0789_03.htm":
			case "harpe_zu_hestui_q0789_04.htm":
			case "harpe_zu_hestui_q0789_05.htm":
			case "harpe_zu_hestui_q0789_13.htm":
			{
				htmltext = event;
				break;
			}
			case "quest_accept":
			{
				htmltext = "harpe_zu_hestui_q0789_06.htm";
				qs.startQuest();
				break;
			}
			case "continue":
			{
				htmltext = "harpe_zu_hestui_q0789_06.htm";
				break;
			}
			case "harpe_zu_hestui_q0789_12.htm":
			{
				if (qs.isCond(2))
				{
					if (player.getLevel() >= MIN_LEVEL)
					{
						final int magmaCount = (int) (getQuestItemsCount(player, MAGMA_ORE));
						takeItems(player, MAGMA_ORE, magmaCount);
						qs.exitQuest(QuestType.DAILY, true);
						addExpAndSp(player, 3015185490L, 7236360);
						giveItems(player, HARPS_REWARD_BOX, 1);
						
						final Quest qsMain = QuestManager.getInstance().getQuest(Q00759_TheDwarvenNightmareContinues.class.getSimpleName());
						if (qsMain != null)
						{
							qsMain.notifyEvent("NOTIFY_Q759", npc, player);
						}
						
						htmltext = event;
						break;
					}
					htmltext = getNoQuestLevelRewardMsg(player);
					break;
				}
				break;
			}
			case "harpe_zu_hestui_q0789_14.htm":
			{
				if (qs.isCond(2))
				{
					if (player.getLevel() >= MIN_LEVEL)
					{
						final int magmaCount = (int) (getQuestItemsCount(player, MAGMA_ORE));
						takeItems(player, MAGMA_ORE, magmaCount);
						qs.exitQuest(QuestType.DAILY, true);
						addExpAndSp(player, 6030370980L, 14472720);
						giveItems(player, HARPS_REWARD_BOX, 2);
						
						final Quest qsMain = QuestManager.getInstance().getQuest(Q00759_TheDwarvenNightmareContinues.class.getSimpleName());
						if (qsMain != null)
						{
							qsMain.notifyEvent("NOTIFY_Q759", npc, player);
						}
						
						htmltext = event;
						break;
					}
					htmltext = getNoQuestLevelRewardMsg(player);
					break;
				}
				break;
			}
			case "harpe_zu_hestui_q0789_15.htm":
			{
				if (qs.isCond(2))
				{
					if (player.getLevel() >= MIN_LEVEL)
					{
						final int magmaCount = (int) (getQuestItemsCount(player, MAGMA_ORE));
						takeItems(player, MAGMA_ORE, magmaCount);
						qs.exitQuest(QuestType.DAILY, true);
						addExpAndSp(player, 9045556470L, 21709080);
						giveItems(player, HARPS_REWARD_BOX, 3);
						
						final Quest qsMain = QuestManager.getInstance().getQuest(Q00759_TheDwarvenNightmareContinues.class.getSimpleName());
						if (qsMain != null)
						{
							qsMain.notifyEvent("NOTIFY_Q759", npc, player);
						}
						
						htmltext = event;
						break;
					}
					htmltext = getNoQuestLevelRewardMsg(player);
					break;
				}
				break;
			}
			case "captain_mathias_q0748_16.htm":
			{
				if (qs.isCond(3))
				{
					if (player.getLevel() >= MIN_LEVEL)
					{
						final int magmaCount = (int) (getQuestItemsCount(player, MAGMA_ORE));
						takeItems(player, MAGMA_ORE, magmaCount);
						qs.exitQuest(QuestType.DAILY, true);
						addExpAndSp(player, 12060741960L, 28945440);
						giveItems(player, HARPS_REWARD_BOX, 3);
						htmltext = event;
						break;
					}
					htmltext = getNoQuestLevelRewardMsg(player);
					break;
				}
				break;
			}
		}
		return htmltext;
	}
	
	@Override
	public String onTalk(Npc npc, Player player)
	{
		final QuestState qs = getQuestState(player, true);
		String htmltext = getNoQuestMsg(player);
		
		switch (qs.getState())
		{
			case State.CREATED:
			{
				if (player.getLevel() >= MIN_LEVEL)
				{
					htmltext = "harpe_zu_hestui_q0789_01.htm";
					break;
				}
				htmltext = "harpe_zu_hestui_q0789_02.htm";
				break;
			}
			case State.STARTED:
			{
				switch (qs.getCond())
				{
					case 1:
					{
						htmltext = "harpe_zu_hestui_q0789_07.htm";
						break;
					}
					case 2:
					{
						if ((getQuestItemsCount(player, MAGMA_ORE) >= 100) && (getQuestItemsCount(player, MAGMA_ORE) <= 199))
						{
							htmltext = "harpe_zu_hestui_q0789_08.htm";
							break;
						}
						else if ((getQuestItemsCount(player, MAGMA_ORE) >= 200) && (getQuestItemsCount(player, MAGMA_ORE) <= 299))
						{
							htmltext = "harpe_zu_hestui_q0789_09.htm";
							break;
						}
						else if ((getQuestItemsCount(player, MAGMA_ORE) >= 300) && (getQuestItemsCount(player, MAGMA_ORE) <= 399))
						{
							htmltext = "harpe_zu_hestui_q0789_10.htm";
							break;
						}
						break;
					}
					case 3:
					{
						if (getQuestItemsCount(player, MAGMA_ORE) >= 400)
						{
							htmltext = "harpe_zu_hestui_q0789_11.htm";
							break;
						}
						break;
					}
				}
				break;
			}
			case State.COMPLETED:
			{
				qs.setState(State.CREATED);
				break;
			}
		}
		return htmltext;
	}
	
	@Override
	public String onKill(Npc npc, Player killer, boolean isSummon)
	{
		final QuestState qs = getQuestState(killer, true);
		if ((qs != null) && (qs.getCond() <= 2) && giveItemRandomly(killer, npc, MAGMA_ORE, 1, 400, 1.0, true))
		{
			if (getQuestItemsCount(killer, MAGMA_ORE) >= 400)
			{
				qs.setCond(3, true);
			}
		}
		return super.onKill(npc, killer, isSummon);
	}
}
