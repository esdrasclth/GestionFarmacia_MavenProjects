package com.farmacia.uth.data.service;

import com.farmacia.uth.data.entity.ResponseFarmacias;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface FarmaciaRepository {
	
	public interface ProveedorRepository {
		@Headers({
			"Content-Type: application/json",
			"Accept-Charset: utf-8",
			"User-Agent: Retrofit-Sample-App"
		})
		
		@GET("/pls/apex/mtech_paii_20232/gestionalmacenes/farmacias/")
		Call<ResponseFarmacias> obtenerFarmacias();
	}
}
