package com.nissan.service;

import java.util.List;

import com.nissan.model.AssetDefination;

public interface IAssetDefService {

	List<AssetDefination> getAssetDefinationList();

	AssetDefination addAssetDefination(AssetDefination _assetDefination);

	AssetDefination getAssetDefinationWithId(Integer _assetDefinationId);
}
