package RedJaVa.com.crimsonempires;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class Hugs extends JavaPlugin implements CommandExecutor{
	public final Logger logger = Logger.getLogger("Minecraft");
	public static Hugs plugin;
	String prefix = "[" + ChatColor.DARK_AQUA + "C" + ChatColor.DARK_RED + "E" + ChatColor.LIGHT_PURPLE + " Hugs" + ChatColor.WHITE + "] ";
	@Override
	public void onDisable(){
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + " Version: " + pdfFile.getVersion() + " Has Been Enabled");
	}
	@Override
	public void onEnable(){
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + " Version: " + pdfFile.getVersion() + " Has Been Enabled");
		this.getCommand("hug").setExecutor(this);
		this.getCommand("slap").setExecutor(this);
		this.getCommand("brohoof").setExecutor(this);
		this.getCommand("highfive").setExecutor(this);
		this.getCommand("poke").setExecutor(this);
		this.getCommand("punch").setExecutor(this);
		this.getCommand("kiss").setExecutor(this);
		this.getCommand("blowkiss").setExecutor(this);
		this.getCommand("like").setExecutor(this);
		this.getCommand("dislike").setExecutor(this);
		this.getCommand("fliptable").setExecutor(this);
		this.getCommand("fixtable").setExecutor(this);
		this.getCommand("hugs").setExecutor(this);
	}
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player send;
		try{
			send = (Player)sender;
		}
		catch(Exception e){
			sender.sendMessage(prefix + ChatColor.AQUA + "You must be online to perform this command!");
			return false;
		}
		if(cmd.getName().equalsIgnoreCase("hug")){
			if(args.length != 1){
				send.sendMessage(prefix + ChatColor.AQUA + "Do /hug [player_name]   Do /hugs for more!");
				return false;
			}
			Player recieve = null;
			try{
				recieve = Bukkit.getServer().getPlayer(args[0]);
			}catch(Exception e){}
			if(recieve == null || !send.canSee(recieve)){
				send.sendMessage(prefix + ChatColor.AQUA + "Couldn't find " + args[0] + " in the server");
				return false;
			}
			recieve.sendMessage(prefix + ChatColor.LIGHT_PURPLE + send.getDisplayName() + ChatColor.AQUA + " hugged you!");
			send.sendMessage(prefix + ChatColor.AQUA + "You hugged " + ChatColor.LIGHT_PURPLE + recieve.getDisplayName() + ChatColor.AQUA + "!");
		}
		else if(cmd.getName().equalsIgnoreCase("slap")){
			if(args.length != 1){
				send.sendMessage(prefix + ChatColor.AQUA + "Do /slap [player_name]   Do /hugs for more!");
				return false;
			}
			Player recieve = null;
			try{
				recieve = Bukkit.getServer().getPlayer(args[0]);
			}catch(Exception e){}
			if(recieve == null || !send.canSee(recieve)){
				send.sendMessage(prefix + ChatColor.AQUA + "Couldn't find " + args[0] + " in the server");
				return false;
			}
			recieve.sendMessage(prefix + ChatColor.AQUA + "WHACK! " + ChatColor.LIGHT_PURPLE + send.getDisplayName() + ChatColor.AQUA + " slapped you!");
			send.sendMessage(prefix + ChatColor.AQUA + "You slapped " + ChatColor.LIGHT_PURPLE + recieve.getDisplayName() + ChatColor.AQUA + "!");
		}
		else if(cmd.getName().equalsIgnoreCase("brohoof")){
			if(args.length != 1){
				send.sendMessage(prefix + ChatColor.AQUA + "Do /brohoof [player_name]   Do /hugs for more!");
				return false;
			}
			Player recieve = null;
			try{
				recieve = Bukkit.getServer().getPlayer(args[0]);
			}catch(Exception e){}
			if(recieve == null || !send.canSee(recieve)){
				send.sendMessage(prefix + ChatColor.AQUA + "Couldn't find " + args[0] + " in the server");
				return false;
			}
			recieve.sendMessage(prefix + ChatColor.AQUA + "/) " + ChatColor.LIGHT_PURPLE + send.getDisplayName() + ChatColor.AQUA + " brohoofed you!");
			send.sendMessage(prefix + ChatColor.AQUA + "You brohoofed " + ChatColor.LIGHT_PURPLE + recieve.getDisplayName() + ChatColor.AQUA + "!");
		}
		else if(cmd.getName().equalsIgnoreCase("highfive")){
			if(args.length != 1){
				send.sendMessage(prefix + ChatColor.AQUA + "Do /highfive [player_name]   Do /hugs for more!");
				return false;
			}
			Player recieve = null;
			try{
				recieve = Bukkit.getServer().getPlayer(args[0]);
			}catch(Exception e){}
			if(recieve == null || !send.canSee(recieve)){
				send.sendMessage(prefix + ChatColor.AQUA + "Couldn't find " + args[0] + " in the server");
				return false;
			}
			recieve.sendMessage(prefix + ChatColor.AQUA + "**highfive** " + ChatColor.LIGHT_PURPLE + send.getDisplayName() + ChatColor.AQUA + " highfived you!");
			send.sendMessage(prefix + ChatColor.AQUA + "You highfived " + ChatColor.LIGHT_PURPLE + recieve.getDisplayName() + ChatColor.AQUA + "!");
		}
		else if(cmd.getName().equalsIgnoreCase("poke")){
			if(args.length != 1){
				send.sendMessage(prefix + ChatColor.AQUA + "Do /poke [player_name]   Do /hugs for more!");
				return false;
			}
			Player recieve = null;
			try{
				recieve = Bukkit.getServer().getPlayer(args[0]);
			}catch(Exception e){}
			if(recieve == null || !send.canSee(recieve)){
				send.sendMessage(prefix + ChatColor.AQUA + "Couldn't find " + args[0] + " in the server");
				return false;
			}
			recieve.sendMessage(prefix + ChatColor.AQUA + "**poke** " + ChatColor.LIGHT_PURPLE + send.getDisplayName() + ChatColor.AQUA + " poked you!");
			send.sendMessage(prefix + ChatColor.AQUA + "You poked " + ChatColor.LIGHT_PURPLE + recieve.getDisplayName() + ChatColor.AQUA + "!");
		}
		else if(cmd.getName().equalsIgnoreCase("punch")){
			if(args.length != 1){
				send.sendMessage(prefix + ChatColor.AQUA + "Do /punch [player_name]   Do /hugs for more");
				return false;
			}
			Player recieve = null;
			try{
				recieve = Bukkit.getServer().getPlayer(args[0]);
			}catch(Exception e){}
			if(recieve == null || !send.canSee(recieve)){
				send.sendMessage(prefix + ChatColor.AQUA + "Couldn't find " + args[0] + " in the server");
				return false;
			}
			recieve.sendMessage(prefix + ChatColor.AQUA + "POW! " + ChatColor.LIGHT_PURPLE + send.getDisplayName() + ChatColor.AQUA + " punched you!");
			send.sendMessage(prefix + ChatColor.AQUA + "You punched " + ChatColor.LIGHT_PURPLE + recieve.getDisplayName() + ChatColor.AQUA + "!");
		}
		else if(cmd.getName().equalsIgnoreCase("kiss")){
			if(args.length != 1){
				send.sendMessage(prefix + ChatColor.AQUA + "Do /kiss [player_name]   Do /hugs for more!");
				return false;
			}
			Player recieve = null;
			try{
				recieve = Bukkit.getServer().getPlayer(args[0]);
			}catch(Exception e){}
			if(recieve == null || !send.canSee(recieve)){
				send.sendMessage(prefix + ChatColor.AQUA + "Couldn't find " + args[0] + " in the server");
				return false;
			}
			recieve.sendMessage(prefix + ChatColor.AQUA + "Smooch <3<3 " + ChatColor.LIGHT_PURPLE + send.getDisplayName() + ChatColor.AQUA + " kissed you!");
			send.sendMessage(prefix + ChatColor.AQUA + "You kissed " + ChatColor.LIGHT_PURPLE + recieve.getDisplayName() + ChatColor.AQUA + "!");
		}
		else if(cmd.getName().equalsIgnoreCase("blowkiss")){
			if(args.length != 1){
				send.sendMessage(prefix + ChatColor.AQUA + "Do /blowkiss [player_name]   Do /hugs for more!");
				return false;
			}
			Player recieve = null;
			try{
				recieve = Bukkit.getServer().getPlayer(args[0]);
			}catch(Exception e){}
			if(recieve == null || !send.canSee(recieve)){
				send.sendMessage(prefix + ChatColor.AQUA + "Couldn't find " + args[0] + " in the server");
				return false;
			}
			recieve.sendMessage(prefix + ChatColor.AQUA + "**Kiss flutters in air** " + ChatColor.LIGHT_PURPLE + send.getDisplayName() + ChatColor.AQUA + " blew a kiss to you!");
			send.sendMessage(prefix + ChatColor.AQUA + "You blew a kiss to " + ChatColor.LIGHT_PURPLE + recieve.getDisplayName() + ChatColor.AQUA + "!");
		}
		else if(cmd.getName().equalsIgnoreCase("like")){
			if(args.length != 1){
				send.sendMessage(prefix + ChatColor.AQUA + "Do /like [player_name]   Do /hugs for more!");
				return false;
			}
			Player recieve = null;
			try{
				recieve = Bukkit.getServer().getPlayer(args[0]);
			}catch(Exception e){}
			if(recieve == null || !send.canSee(recieve)){
				send.sendMessage(prefix + ChatColor.AQUA + "Couldn't find " + args[0] + " in the server");
				return false;
			}
			Bukkit.getServer().broadcastMessage(prefix + ChatColor.LIGHT_PURPLE + send.getDisplayName() + ChatColor.AQUA + " liked what " + ChatColor.LIGHT_PURPLE + recieve.getDisplayName() + ChatColor.AQUA + " said!");
		}
		else if(cmd.getName().equalsIgnoreCase("dislike")){
			if(args.length != 1){
				send.sendMessage(prefix + ChatColor.AQUA + "Do /dislike [player_name]   Do /hugs for more!");
				return false;
			}
			Player recieve = null;
			try{
				recieve = Bukkit.getServer().getPlayer(args[0]);
			}catch(Exception e){}
			if(recieve == null || !send.canSee(recieve)){
				send.sendMessage(prefix + ChatColor.AQUA + "Couldn't find " + args[0] + " in the server");
				return false;
			}
			Bukkit.getServer().broadcastMessage(prefix + ChatColor.LIGHT_PURPLE + send.getDisplayName() + ChatColor.AQUA + " disliked what " + ChatColor.LIGHT_PURPLE + recieve.getDisplayName() + ChatColor.AQUA + " said!");
		}
		else if(cmd.getName().equalsIgnoreCase("fliptable")){
			if(args.length != 0){
				send.sendMessage(prefix + ChatColor.AQUA + "Do /fliptable   Do /hugs for more!");
				return false;
			}
			Bukkit.getServer().broadcastMessage(prefix + ChatColor.LIGHT_PURPLE + send.getDisplayName() + ChatColor.AQUA + " flips table");
		}
		else if(cmd.getName().equalsIgnoreCase("fixtable")){
			if(args.length != 0){
				send.sendMessage(prefix + ChatColor.AQUA + "Do /fixtable   Do /hugs for more!");
				return false;
			}
			Bukkit.getServer().broadcastMessage(prefix + ChatColor.LIGHT_PURPLE + send.getDisplayName() + ChatColor.AQUA + " fixes table");
		}
		else if(cmd.getName().equalsIgnoreCase("hugs")){
			send.sendMessage(ChatColor.AQUA + "=================="+prefix+ ChatColor.AQUA + "==================");
			send.sendMessage(ChatColor.LIGHT_PURPLE + "/hugs");
			send.sendMessage(ChatColor.LIGHT_PURPLE + "/slap [player_name]");
			send.sendMessage(ChatColor.LIGHT_PURPLE + "/brohoof [player_name]");
			send.sendMessage(ChatColor.LIGHT_PURPLE + "/highfive [player_name]");
			send.sendMessage(ChatColor.LIGHT_PURPLE + "/poke [player_name]");
			send.sendMessage(ChatColor.LIGHT_PURPLE + "/punch [player_name]");
			send.sendMessage(ChatColor.LIGHT_PURPLE + "/kiss [player_name]");
			send.sendMessage(ChatColor.LIGHT_PURPLE + "/blowkiss [player_name]");
			send.sendMessage(ChatColor.LIGHT_PURPLE + "/like [player_name]");
			send.sendMessage(ChatColor.LIGHT_PURPLE + "/dislike [player_name]");
			send.sendMessage(ChatColor.LIGHT_PURPLE + "/fliptable");
			send.sendMessage(ChatColor.LIGHT_PURPLE + "/fixtable");
			send.sendMessage(ChatColor.AQUA + "=================="+prefix+ ChatColor.AQUA + "==================");
		}
		return true; 
	}
}