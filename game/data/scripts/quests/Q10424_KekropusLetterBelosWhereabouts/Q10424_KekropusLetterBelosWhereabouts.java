/*
 * Copyright (c) 2013 L2jMobius
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR
 * IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package quests.Q10424_KekropusLetterBelosWhereabouts;

import org.l2jmobius.gameserver.model.Location;
import org.l2jmobius.gameserver.model.actor.Creature;
import org.l2jmobius.gameserver.model.actor.Npc;
import org.l2jmobius.gameserver.model.actor.Player;
import org.l2jmobius.gameserver.model.quest.QuestState;
import org.l2jmobius.gameserver.network.NpcStringId;
import org.l2jmobius.gameserver.network.serverpackets.ExShowScreenMessage;

import quests.LetterQuest;

/**
 * Kekropus' Letter: Belos' Whereabouts (10424)
 * @author Stayway
 */
public class Q10424_KekropusLetterBelosWhereabouts extends LetterQuest
{
	// NPCs
	private static final int ANDREI = 31292;
	private static final int LUGONNES = 33852;
	private static final int INVISIBLE_NPC = 19543;
	// Items
	private static final int SOE_TOWN_OF_GODDARD = 37121; // Scroll of Escape: Town of Goddard
	private static final int SOE_KETRA_ORC_OUTPOST = 37035; // Scroll of Escape: Varka Silenos Barracks
	private static final int EWS = 959; // Scroll: Enchant Weapon (S-grade)
	// Location
	private static final Location TELEPORT_LOC = new Location(147491, -56633, -2776);
	// Misc
	private static final int MIN_LEVEL = 76;
	private static final int MAX_LEVEL = 80;
	
	public Q10424_KekropusLetterBelosWhereabouts()
	{
		super(10424);
		addTalkId(ANDREI, LUGONNES);
		addCreatureSeeId(INVISIBLE_NPC);
		setIsErtheiaQuest(false);
		setLevel(MIN_LEVEL, MAX_LEVEL);
		setStartQuestSound("Npcdialog1.kekrops_quest_10");
		setStartLocation(SOE_TOWN_OF_GODDARD, TELEPORT_LOC);
		registerQuestItems(SOE_TOWN_OF_GODDARD, SOE_KETRA_ORC_OUTPOST);
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
			case "31292-02.htm":
			{
				htmltext = event;
				break;
			}
			case "31292-03.htm":
			{
				if (qs.isCond(1))
				{
					takeItems(player, SOE_TOWN_OF_GODDARD, -1);
					giveItems(player, SOE_KETRA_ORC_OUTPOST, 1);
					qs.setCond(2, true);
					htmltext = event;
				}
				break;
			}
			case "33852-02.htm":
			{
				if (qs.isCond(2))
				{
					qs.exitQuest(false, true);
					giveItems(player, EWS, 1);
					giveStoryQuestReward(player, 182);
					if (player.getLevel() >= MIN_LEVEL)
					{
						addExpAndSp(player, 1_277_640, 306);
					}
					showOnScreenMsg(player, NpcStringId.GROW_STRONGER_HERE_UNTIL_YOU_RECEIVE_THE_NEXT_LETTER_FROM_KEKROPUS_AT_LV_81, ExShowScreenMessage.TOP_CENTER, 6000);
					htmltext = event;
				}
				break;
			}
		}
		return htmltext;
	}
	
	@Override
	public String onTalk(Npc npc, Player player)
	{
		String htmltext = getNoQuestMsg(player);
		final QuestState qs = getQuestState(player, false);
		if (qs == null)
		{
			return htmltext;
		}
		
		if (qs.isStarted())
		{
			if ((npc.getId() == ANDREI) && qs.isCond(1))
			{
				htmltext = "31292-01.htm";
			}
			else if (qs.isCond(2))
			{
				htmltext = npc.getId() == ANDREI ? "31292-04.htm" : "33852-01.htm";
			}
		}
		return htmltext;
	}
	
	@Override
	public String onCreatureSee(Npc npc, Creature creature)
	{
		if (creature.isPlayer())
		{
			final Player player = creature.asPlayer();
			final QuestState qs = getQuestState(player, false);
			if ((qs != null) && qs.isCond(2))
			{
				showOnScreenMsg(player, NpcStringId.KETRA_ORC_OUTPOST_IS_A_GOOD_HUNTING_ZONE_FOR_LV_76_OR_ABOVE, ExShowScreenMessage.TOP_CENTER, 6000);
			}
		}
		return super.onCreatureSee(npc, creature);
	}
	
	@Override
	public boolean canShowTutorialMark(Player player)
	{
		return player.isMageClass();
	}
}