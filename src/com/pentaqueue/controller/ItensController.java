package com.pentaqueue.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import com.pentaqueue.factory.Api;
import com.pentaqueue.util.NameUtil;

import net.rithms.riot.api.RiotApiException;
import net.rithms.riot.api.endpoints.static_data.constant.ItemListTags;
import net.rithms.riot.api.endpoints.static_data.constant.Locale;
import net.rithms.riot.api.endpoints.static_data.dto.Item;
import net.rithms.riot.api.endpoints.static_data.dto.ItemList;
import net.rithms.riot.constant.Platform;

@Named
@SessionScoped
public class ItensController implements Serializable {

	private static final long serialVersionUID = 1L;

	private ItemList itemList;
	private ArrayList<Item> itens = new ArrayList<Item>();

	@PostConstruct
	public void init() {
		try {
			itemList = Api.getRiotApi().getDataItemList(Platform.BR,Locale.PT_BR, null, ItemListTags.ALL);

			for (Map.Entry<String, Item> item : itemList.getData().entrySet()) {
				itens.add(item.getValue());
			}
		} catch (RiotApiException e) {
			e.printStackTrace();
		}
	}
	
	public String listToString(List<String> lista) {
		if (lista == null) {
			return "";
		}
		return Arrays.toString(lista.toArray())
				.toUpperCase()
				.replace("[", "")
				.replace(",", " ")
				//.replace(" ", "")
				.replace("]", "");
	}
	
	public String normalizarNome(String nome) {
		return NameUtil.normalizaNome(nome);
	}

	public ItemList getItemList() {
		return itemList;
	}

	public void setItemList(ItemList itemList) {
		this.itemList = itemList;
	}

	public ArrayList<Item> getItens() {
		return itens;
	}

	public void setItens(ArrayList<Item> itens) {
		this.itens = itens;
	}
}
