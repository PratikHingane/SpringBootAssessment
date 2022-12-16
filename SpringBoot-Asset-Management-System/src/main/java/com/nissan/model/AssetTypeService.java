package com.nissan.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.nissan.dao.AssetTypeDAO;
import com.nissan.service.IAssetTypeService;

public class AssetTypeService implements IAssetTypeService {

	@Autowired
	AssetTypeDAO assetTypeDAO;

	//get all asset types
	@Override
	public List<AssetType> getAllAssetType() {
		// TODO Auto-generated method stub
		 return (List<AssetType>) assetTypeDAO.findAll();
	}

	//find asset type by id
	@Override
	public AssetType getAssetTypeById(Integer at_id) {
		// TODO Auto-generated method stub
		return assetTypeDAO.findById(at_id).get();
	}

	//add asset type
	@Override
	public AssetType addAssetType(AssetType assettype) {
		// TODO Auto-generated method stub
		return assetTypeDAO.save(assettype);
	}

}
