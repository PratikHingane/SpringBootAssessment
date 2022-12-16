package com.nissan.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.dao.IAssetDefDAO;
import com.nissan.model.AssetDefination;
@Service
public class AssetDefinationServiceImpl implements IAssetDefService {

	@Autowired
	private IAssetDefDAO assetDefinationDao;
	
	@Override
	public List<AssetDefination> getAssetDefinationList() {
		
		return assetDefinationDao.findAll();
	}

	@Override
	@Transactional
	public AssetDefination addAssetDefination(AssetDefination _assetDefination) {
		
		return assetDefinationDao.save(_assetDefination);
	}

	@Override
	public AssetDefination getAssetDefinationWithId(Integer _assetDefinationId) {
		
		return assetDefinationDao.findById(_assetDefinationId).get();
	}

}
