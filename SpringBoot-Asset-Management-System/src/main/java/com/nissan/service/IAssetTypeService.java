package com.nissan.service;

import java.util.List;

import com.nissan.model.AssetType;

public interface IAssetTypeService {

	//get All List
		public List<AssetType> getAllAssetType();

		//GET BY ID
		public AssetType getAssetTypeById(Integer at_id);
		
		//save OrderItem
		public AssetType addAssetType(AssetType assettype);

		
}
