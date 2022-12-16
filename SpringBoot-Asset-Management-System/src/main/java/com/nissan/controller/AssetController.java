package com.nissan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.model.AssetDefination;
import com.nissan.model.AssetType;
import com.nissan.model.UserRegistration;
import com.nissan.service.IAssetDefService;
import com.nissan.service.IAssetTypeService;

@RestController
@RequestMapping("api/")
public class AssetController {
	@Autowired
	private IAssetTypeService assetTypeService;
	
	@Autowired
	private IAssetDefService assetDefService;
	
	@GetMapping("assets")
	public List<AssetType> getAllAssetTypes(){
		
		return assetTypeService.getAssetTypeList();
	}
	
	@PostMapping("assets")
	public AssetType addNewAssetType(@RequestBody AssetType _assetType){
		
		return assetTypeService.addAssetType(_assetType);
	}
	
	@GetMapping("assets/{_assetTypeId}")
	public AssetType getAssetTypeById(@PathVariable Integer _assetTypeId){
		
		return assetTypeService.getAssetTypeWithId(_assetTypeId);
	}
	
	
	@GetMapping("assetsdef")
	public List<AssetDefination> getAllAssetDefinations(){
		
		return assetDefService.getAssetDefinationList();
	}
	
	@PostMapping("assetsdef")
	public AssetDefination addNewAssetDefination(@RequestBody AssetDefination _assetDefination){
		
		return assetDefService.addAssetDefination(_assetDefination);
	}
	
	@GetMapping("assetsdef/{_assetsdefId}")
	public AssetDefination getAssetDefinationById(@PathVariable Integer _assetsdefId){
		
		return assetDefService.getAssetDefinationWithId(_assetsdefId);
	}

}
