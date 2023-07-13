package com.farmacia.uth.data.service;

import java.io.IOException;
import retrofit2.Call;
import retrofit2.Response;

import com.farmacia.uth.data.entity.ResponseFarmacias;
import com.farmacia.uth.data.entity.ResponseInventory;
import com.farmacia.uth.data.entity.ResponseProveedores;

public class RepositoryInventoryImpl {
	private static RepositoryInventoryImpl instance;
	private RepositoryClient client;
	
	private RepositoryInventoryImpl(String url, Long timeout) {
		System.out.println(url);
		this.client = new RepositoryClient(url, timeout);
	}
	
	public static RepositoryInventoryImpl getInstance(String url, Long timeout) {
		if(instance == null) {
			synchronized (RepositoryInventoryImpl.class) {
				instance = new RepositoryInventoryImpl(url, timeout);
			}
		}
		return instance;
	}
	
	public ResponseInventory getInventory() throws IOException{
		Call<ResponseInventory> call = client.getDataBaseInventory().obtenerInventario();
		Response<ResponseInventory> response = call.execute();
		if(response.isSuccessful()) {
			return response.body();
		}else {
			return null;
		}
	}
	
	public ResponseProveedores getProveedores() throws IOException {
		Call<ResponseProveedores> call = client.getDataBaseInventory().obtenerProveedores();
		Response<ResponseProveedores> response = call.execute();
		if(response.isSuccessful()) {
			return response.body();
		} else {
			return null;
		}
	}
	
	public ResponseFarmacias getFarmacias() throws IOException {
		Call<ResponseFarmacias> call = client.getDataBaseInventory().obtenerFarmacias();
		Response<ResponseFarmacias> response = call.execute();
		if(response.isSuccessful()) {
			return response.body();
		} else {
			return null;
		}
	}
}
