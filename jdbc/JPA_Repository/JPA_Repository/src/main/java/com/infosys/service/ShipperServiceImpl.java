package com.infosys.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.domain.Shipper;
import com.infosys.repository.ShipperRepository;

@Service
public class ShipperServiceImpl implements ShipperService{

	@Autowired
	ShipperRepository srepository;
	
	@Override
	public List<Shipper> fetchShipperList() {
		return (List<Shipper>) srepository.findAll();
	}

	@Override
	public void insertShipper(Shipper shipper) {
		srepository.saveAndFlush(shipper);
	}

	@Override
	public void removeShipper(int shipperID) {
		srepository.deleteById(shipperID);
	}

	@Override
	public Shipper getShipper(int shipperid) {
		Optional<Shipper> oshipper=srepository.findById(shipperid);
		Shipper sentity=oshipper.get();
		return sentity;
	}

	@Override
	public String updateShipper(int shipperid, String cname) {
		Optional<Shipper> oshipper=srepository.findById(shipperid);
		Shipper sentity=oshipper.get();
		sentity.setCompany_name(cname);
		srepository.save(sentity);
		return "updated successfully";
	}

}
