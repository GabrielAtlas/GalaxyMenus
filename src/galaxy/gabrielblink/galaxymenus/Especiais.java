package galaxy.gabrielblink.galaxymenus;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Especiais {

	public static void open(Player p) {
		ArrayList<ItemStack> itens = new ArrayList<ItemStack>();
		Inventory inv = Bukkit.createInventory(null, 36,"Itens Especiais");
		inv.setItem(31, new ItemBuilder(Material.ARROW).setName("§bVoltar").setLore("§7Voltar para a pagina anterior").toItemStack());
	    ItemStack bola_de_fogo = HookSuperItens.BolaDeFogo.clone();
	    ItemMeta meta = bola_de_fogo.getItemMeta();
	    ArrayList<String> a = new ArrayList<String>();
	    for(String b : bola_de_fogo.getItemMeta().getLore()) {
	    	a.add(b);
	    }
	    a.add("");
	    a.add("§6Cash: "+(galaxy.gabrielblink.galaxymenus.Main.getInstance().getConfig().getInt("BolaDeFogo.Preco")*galaxy.gabrielblink.galaxymenus.Main.getInstance().getConfig().getInt("BolaDeFogo.Quantia")));
	    a.add("");
	    meta.setLore(a);
	    bola_de_fogo.setItemMeta(meta);
	    itens.add(bola_de_fogo);
	    /////////////////////////////////////
	    ItemStack BauExtra = HookSuperItens.BauExtra.clone();
	    ItemMeta meta1 = BauExtra.getItemMeta();
	    ArrayList<String> a1 = new ArrayList<String>();
	    for(String b : BauExtra.getItemMeta().getLore()) {
	    	a1.add(b);
	    }
	    a1.add("");
	    a1.add("§6Cash: "+(galaxy.gabrielblink.galaxymenus.Main.getInstance().getConfig().getInt("BauExtra.Preco")*galaxy.gabrielblink.galaxymenus.Main.getInstance().getConfig().getInt("BauExtra.Quantia")));
	    a1.add("");
	    meta1.setLore(a1);
	    BauExtra.setItemMeta(meta1);
	    itens.add(BauExtra);
	    
	    ItemStack Armadilha = HookSuperItens.Armadilha.clone();
	    ItemMeta meta11 = Armadilha.getItemMeta();
	    ArrayList<String> a11 = new ArrayList<String>();
	    for(String b : Armadilha.getItemMeta().getLore()) {
	    	a11.add(b);
	    }
	    a11.add("");
	    a11.add("§6Cash: "+(galaxy.gabrielblink.galaxymenus.Main.getInstance().getConfig().getInt("Armadilha.Preco")*galaxy.gabrielblink.galaxymenus.Main.getInstance().getConfig().getInt("Armadilha.Quantia")));
	    a11.add("");
	    meta11.setLore(a11);
	    Armadilha.setItemMeta(meta11);
	    itens.add(Armadilha);
	    ItemStack Lancador = HookSuperItens.Lancador.clone();
	    ItemMeta meta111 = Lancador.getItemMeta();
	    ArrayList<String> a111 = new ArrayList<String>();
	    for(String b : Lancador.getItemMeta().getLore()) {
	    	a111.add(b);
	    }
	    a111.add("");
	    a111.add("§6Cash: "+(galaxy.gabrielblink.galaxymenus.Main.getInstance().getConfig().getInt("Lancador.Preco")*galaxy.gabrielblink.galaxymenus.Main.getInstance().getConfig().getInt("Lancador.Quantia")));
	    a111.add("");
	    meta111.setLore(a111);
	    Lancador.setItemMeta(meta111);
	    itens.add(Lancador);
	    ItemStack Purificador = HookSuperItens.Purificador.clone();
	    ItemMeta meta1111 = Purificador.getItemMeta();
	    ArrayList<String> a1111 = new ArrayList<String>();
	    for(String b : Purificador.getItemMeta().getLore()) {
	    	a1111.add(b);
	    }
	    a1111.add("");
	    a1111.add("§6Cash: "+(galaxy.gabrielblink.galaxymenus.Main.getInstance().getConfig().getInt("Purificador.Preco")*galaxy.gabrielblink.galaxymenus.Main.getInstance().getConfig().getInt("Purificador.Quantia")));
	    a1111.add("");
	    meta1111.setLore(a1111);
	    Purificador.setItemMeta(meta1111);
	    itens.add(Purificador);
	    ItemStack Raio = HookSuperItens.Raio.clone();
	    ItemMeta meta11111 = Raio.getItemMeta();
	    ArrayList<String> a11111 = new ArrayList<String>();
	    for(String b : Raio.getItemMeta().getLore()) {
	    	a11111.add(b);
	    }
	    a11111.add("");
	    a11111.add("§6Cash: "+(galaxy.gabrielblink.galaxymenus.Main.getInstance().getConfig().getInt("Raio.Preco")*galaxy.gabrielblink.galaxymenus.Main.getInstance().getConfig().getInt("Raio.Quantia")));
	    a11111.add("");
	    meta11111.setLore(a11111);
	    Raio.setItemMeta(meta11111);
	    itens.add(Raio);
	    
	    
	    ItemStack Reparador = HookSuperItens.Reparador.clone();
	    ItemMeta meta111111 = Reparador.getItemMeta();
	    ArrayList<String> a111111 = new ArrayList<String>();
	    for(String b : Reparador.getItemMeta().getLore()) {
	    	a111111.add(b);
	    }
	    a111111.add("");
	    a111111.add("§6Cash: "+(galaxy.gabrielblink.galaxymenus.Main.getInstance().getConfig().getInt("Reparador.Preco")*galaxy.gabrielblink.galaxymenus.Main.getInstance().getConfig().getInt("Reparador.Quantia")));
	    a111111.add("");
	    meta111111.setLore(a111111);
	    Reparador.setItemMeta(meta111111);
	    itens.add(Reparador);
	    ItemStack SuperCreeper = HookSuperItens.SuperCreeper.clone();
	    ItemMeta meta1111111 = SuperCreeper.getItemMeta();
	    ArrayList<String> a1111111 = new ArrayList<String>();
	    for(String b : SuperCreeper.getItemMeta().getLore()) {
	    	a1111111.add(b);
	    }
	    a1111111.add("");
	    a1111111.add("§6Cash: "+(galaxy.gabrielblink.galaxymenus.Main.getInstance().getConfig().getInt("SuperCreeper.Preco")*galaxy.gabrielblink.galaxymenus.Main.getInstance().getConfig().getInt("SuperCreeper.Quantia")));
	    a1111111.add("");
	    meta1111111.setLore(a1111111);
	    SuperCreeper.setItemMeta(meta1111111);
	    itens.add(SuperCreeper);
	    
	    int slot = 10;
	    for(ItemStack i : itens) {
	    	inv.setItem(slot, i);
	    	if(slot == 16) {
	    		slot = 19;
	    	}else {
	    	slot++;
	    	}
	    }
	    
	    p.openInventory(inv);
	}
}
