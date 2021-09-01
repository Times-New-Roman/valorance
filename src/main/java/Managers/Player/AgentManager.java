package Managers.Player;

import Agent.Agent;
import org.bukkit.entity.Player;

import java.util.HashMap;

public class AgentManager {

    private HashMap<String, Agent> agentPlayerList = new HashMap<>();

    public void setPlayerAgent(Player player, Agent agent) {
        String playerName = player.getName();
        agentPlayerList.put(playerName, agent);
    }

    public Agent getPlayerAgent(Player p) {
        String playername = p.getName();
        return agentPlayerList.get(playername);
    }

    public void clear() {
        agentPlayerList.clear();
    }

}
