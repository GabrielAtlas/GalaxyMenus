package galaxy.gabrielblink.galaxymenus;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import galaxy.gabrielblink.galaxycash.General.CashAPI;

public class CaixasMisteriosasEvent implements Listener{

	@EventHandler
	public void oao(InventoryClickEvent event) {
		if(event.getInventory().getName().equalsIgnoreCase("Kits - Caixas Misteriosas")) {
			event.setCancelled(true);
			Player p = (Player)event.getWhoClicked();
			if(event.getSlot() == 49) {
				p.chat("/kit");
				return;
			}
			if(event.getCurrentItem()!=null) {
				if(event.getCurrentItem().hasItemMeta()) {
					if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§eCaixa Misteriosa")) {
					int quantity = event.getCurrentItem().getAmount();
					if(event.getCurrentItem().getType().equals(Material.CHEST)) {
						p.closeInventory();
						if(CashAPI.getCash(p.getName()) >= Main.getInstance().getConfig().getInt("Caixas.Basica.Preco")*quantity) {
							p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
							p.sendMessage("§aItem comprado com sucesso.");
							int price = Main.getInstance().getConfig().getInt("Caixas.Basica.Preco")*quantity;
							CashAPI.removeCash(p.getName(), price);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), Main.getInstance().getConfig().getString("Caixas.Basica.Comando").replace("@player", p.getName()).replace("@quantity", ""+quantity));
						}else {
							p.sendMessage("§cVocê não tem cash suficiente para comprar este item.");
							p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1, 1);
						}
					}else if(event.getCurrentItem().getType().equals(Material.ENDER_CHEST)) {
						p.closeInventory();
						if(CashAPI.getCash(p.getName()) >= Main.getInstance().getConfig().getInt("Caixas.Avancada.Preco")*quantity) {
							p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
							p.sendMessage("§aItem comprado com sucesso.");
							int price = Main.getInstance().getConfig().getInt("Caixas.Avancada.Preco")*quantity;
							CashAPI.removeCash(p.getName(), price);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), Main.getInstance().getConfig().getString("Caixas.Avancada.Comando").replace("@player", p.getName()).replace("@quantity", ""+quantity));
						}else {
							p.sendMessage("§cVocê não tem cash suficiente para comprar este item.");
							p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1, 1);
						}
					}else if(event.getCurrentItem().getType().equals(Material.ENDER_PORTAL_FRAME)) {
						p.closeInventory();
						if(CashAPI.getCash(p.getName()) >= Main.getInstance().getConfig().getInt("Caixas.Suprema.Preco")*quantity) {
							p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
							p.sendMessage("§aItem comprado com sucesso.");
							int price = Main.getInstance().getConfig().getInt("Caixas.Suprema.Preco")*quantity;
							CashAPI.removeCash(p.getName(), price);
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), Main.getInstance().getConfig().getString("Caixas.Suprema.Comando").replace("@player", p.getName()).replace("@quantity", ""+quantity));
						}else {
							p.sendMessage("§cVocê não tem cash suficiente para comprar este item.");
							p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1, 1);
						}
					}
					}
				}
			}
		}
	}
}
