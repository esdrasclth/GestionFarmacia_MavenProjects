package com.farmacia.uth.data.service;

import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.Call;

import com.farmacia.uth.data.entity.ResponseFarmacias;
import com.farmacia.uth.data.entity.ResponseInventory;
import com.farmacia.uth.data.entity.ResponseProveedores;

public interface RepositoryInventory {
	@Headers({
		"Content-Type: application/json",
		"Accept-Charset: utf-8",
		"User-Agent: Retrofit-Sample-App"
	})
	
	@GET("pls/apex/mtech_paii_20232/gestionalmacenes/productos/")
	Call<ResponseInventory> obtenerInventario();
	
	@Headers({
		"Content-Type: application/json",
		"Accept-Charset: utf-8",
		"User-Agent: Retrofit-Sample-App"
	})
	
	@GET("pls/apex/mtech_paii_20232/gestionalmacenes/proveedores/")
	Call<ResponseProveedores> obtenerProveedores();
	
	@Headers({
		"Content-Type: application/json",
		"Accept-Charset: utf-8",
		"User-Agent: Retrofit-Sample-App"
	})
	
	@GET("pls/apex/mtech_paii_20232/gestionalmacenes/farmacias/")
	Call<ResponseFarmacias> obtenerFarmacias();
}
