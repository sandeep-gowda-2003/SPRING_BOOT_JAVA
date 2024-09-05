package com.infosys.service;

import java.util.List;


import com.infosys.domain.Shipper;

public interface ShipperService {
	List<Shipper> fetchShipperList();
	public void insertShipper(Shipper shipper);
	public void removeShipper(int shipperID);
	public Shipper getShipper(int shipperid);
	public String updateShipper(int shipperid,String cname);
}
