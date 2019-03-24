package galaxy.gabrielblink.galaxymenus;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;

public class CaixasMisteriosas implements Listener, CommandExecutor {

	public static void openCaixas(Player p) {
		Inventory inv = Bukkit.createInventory(null, 54,"Kits - Caixas Misteriosas");
		inv.setItem(11, new ItemBuilder(Material.CHEST).setName("§eCaixa Misteriosa").setLore("§eTipo: §fBásica","","§6Cash: "+Main.getInstance().getConfig().getInt("Caixas.Basica.Preco")).toItemStack());
		inv.setItem(20, new ItemBuilder(Material.CHEST,5).setName("§eCaixa Misteriosa").setLore("§eTipo: §fBásica","","§6Cash: "+(Main.getInstance().getConfig().getInt("Caixas.Basica.Preco")*5)).toItemStack());
		inv.setItem(29, new ItemBuilder(Material.CHEST,10).setName("§eCaixa Misteriosa").setLore("§eTipo: §fBásica","","§6Cash: "+(Main.getInstance().getConfig().getInt("Caixas.Basica.Preco")*10)).toItemStack());
		inv.setItem(38, new ItemBuilder(Material.CHEST,25).setName("§eCaixa Misteriosa").setLore("§eTipo: §fBásica","","§6Cash: "+(Main.getInstance().getConfig().getInt("Caixas.Basica.Preco")*25)).toItemStack());
		
		inv.setItem(13, new ItemBuilder(Material.ENDER_CHEST).setName("§eCaixa Misteriosa").setLore("§eTipo: §fAvançada","","§6Cash: "+Main.getInstance().getConfig().getInt("Caixas.Avancada.Preco")).toItemStack());
		inv.setItem(22, new ItemBuilder(Material.ENDER_CHEST,5).setName("§eCaixa Misteriosa").setLore("§eTipo: §fAvançada","","§6Cash: "+(Main.getInstance().getConfig().getInt("Caixas.Avancada.Preco")*5)).toItemStack());
		inv.setItem(31, new ItemBuilder(Material.ENDER_CHEST,10).setName("§eCaixa Misteriosa").setLore("§eTipo: §fAvançada","","§6Cash: "+(Main.getInstance().getConfig().getInt("Caixas.Avancada.Preco")*10)).toItemStack());
		inv.setItem(40, new ItemBuilder(Material.ENDER_CHEST,25).setName("§eCaixa Misteriosa").setLore("§eTipo: §fAvançada","","§6Cash: "+(Main.getInstance().getConfig().getInt("Caixas.Avancada.Preco")*25)).toItemStack());
		
		inv.setItem(15, new ItemBuilder(Material.ENDER_PORTAL_FRAME).setName("§eCaixa Misteriosa").setLore("§eTipo: §fSuprema","","§6Cash: "+Main.getInstance().getConfig().getInt("Caixas.Suprema.Preco")).addEnchant(Enchantment.ARROW_DAMAGE, 1).addItemFlag(ItemFlag.HIDE_ENCHANTS).toItemStack());
		inv.setItem(24, new ItemBuilder(Material.ENDER_PORTAL_FRAME,5).setName("§eCaixa Misteriosa").setLore("§eTipo: §fSuprema","","§6Cash: "+(Main.getInstance().getConfig().getInt("Caixas.Suprema.Preco")*5)).addEnchant(Enchantment.ARROW_DAMAGE, 1).addItemFlag(ItemFlag.HIDE_ENCHANTS).toItemStack());
		inv.setItem(33, new ItemBuilder(Material.ENDER_PORTAL_FRAME,10).setName("§eCaixa Misteriosa").setLore("§eTipo: §fSuprema","","§6Cash: "+(Main.getInstance().getConfig().getInt("Caixas.Suprema.Preco")*10)).addEnchant(Enchantment.ARROW_DAMAGE, 1).addItemFlag(ItemFlag.HIDE_ENCHANTS).toItemStack());
		inv.setItem(42, new ItemBuilder(Material.ENDER_PORTAL_FRAME,25).setName("§eCaixa Misteriosa").setLore("§eTipo: §fSuprema","","§6Cash: "+(Main.getInstance().getConfig().getInt("Caixas.Suprema.Preco")*25)).addEnchant(Enchantment.ARROW_DAMAGE, 1).addItemFlag(ItemFlag.HIDE_ENCHANTS).toItemStack());
		
		inv.setItem(49, new ItemBuilder(Material.ARROW).setName("§bVoltar").setLore("§7Clique para voltar uma página").toItemStack());
		p.openInventory(inv);
	}
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String arg2, String[] args) {
		// TODO Auto-generated method stub
		if(cmd.getName().equalsIgnoreCase("caixasmisteriosas")) {
			if(sender instanceof Player) {
				Player p = (Player)sender;
				openCaixas(p);
			}
		}
		return false;
	}

}
