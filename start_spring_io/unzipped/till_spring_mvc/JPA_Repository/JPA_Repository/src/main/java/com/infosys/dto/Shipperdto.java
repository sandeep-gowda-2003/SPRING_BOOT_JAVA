package com.infosys.dto;

import com.infosys.domain.Shipper;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Shipperdto {
	private Integer shipper_id;
	private String company_name;
	private Integer phone_no;

	public static Shipper prepareShipperEntity(Shipperdto shipperdto) {
		Shipper shipper=new Shipper();
		shipper.setShipper_id(shipperdto.getShipper_id());
		shipper.setCompany_name(shipperdto.getCompany_name());
		shipper.setPhone_no(shipper.getPhone_no());
		return shipper;
	}
}
