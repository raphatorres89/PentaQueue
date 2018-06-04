package com.pentaqueue.util;

public class NameUtil {

	public static String normalizaNome(String nome) {
		switch (nome.toUpperCase().trim()) {
		case "START":
			return "Início";
		case "LANE":
			return "Rota";
		case "JUNGLE":
			return "Selva";
		case "TOOLS":
			return "Úteis";
		case "GOLDPER":
			return "Ouro";
		case "CONSUMABLE":
			return "Consumíveis";
		case "VISION":
			return "Visão";
		case "DEFENSE":
			return "Defesa";
		case "HEALTH":
			return "Vida";
		case "HEALTHREGEN":
			return "Regen. de Vida";
		case "ARMOR":
			return "Defesa";
		case "SPELLBLOCK":
			return "Bloqueio Mágico";
		case "ATTACK":
			return "Ataque";
		case "LIFESTEAL":
			return "Roubo de Vida";
		case "CRITICALSTRIKE":
			return "Crítico";
		case "ATTACKSPEED":
			return "Vel. de Ataque";
		case "DAMAGE":
			return "Dano";
		case "MAGIC":
			return "Magia";
		case "MANA":
			return "Mana";
		case "SPELLDAMAGE":
			return "Dano Mágico";
		case "COOLDOWNREDUCTION":
			return "Tempo de Recarga";
		case "MANAREGEN":
			return "Regen. Mágica";
		case "MOVEMENT":
			return "Movimento";
		case "BOOTS":
			return "Botas";
		case "NONBOOTSMOVEMENT":
			return "Movimento(outros)";
		case "UNCATEGORIZED":
			return "Outros";
		case "ACTIVE":
			return "Ativo";
		case "SPELLVAMP":
			return "Roubo Mágico";
		case "MAGICPENETRATION":
			return "Penetr. Mágica";
		case "ARMORPENETRATION":
			return "Penetr. de Armadura";
		case "AURA":
			return "Aura";
		case "ONHIT":
			return "Impacto";
		case "TRINKET":
			return "Bugiganga";
		case "SLOW":
			return "Lentidão";
		case "STEALTH":
			return "Furtividade";
		case "TENACITY":
			return "Tenacidade";
		default:
			return nome;
		}
		
	}
}
