package me.acf.FullPvP.comandos;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.acf.FormatText.Format;
import me.acf.FullPvP.FPConfig;
import me.acf.FullPvP.Teleport;
import me.acf.FullPvP.API.HomeAPI;
import me.hub.API.Util.message.Message;
import me.hub.comandos.ComandosAPI;

public class spawn implements CommandExecutor {

	public String[] atalhos = new String[] { "inicio" };
    public String desc = "Ir o spawn";
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	  {
		   if (ComandosAPI.VerConsole(sender).equals("sim"))
		   {
			   sender.sendMessage(Message.Console_Não);
  			   return true;
		   }
		  
		   final Player jogador = (Player) sender;
		   
		   Teleport.TeleportTempo(Bukkit.getWorld("world").getSpawnLocation(), jogador);
		   
		return false;
	  }
	
	

	

}

