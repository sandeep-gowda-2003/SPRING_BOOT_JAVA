package com.infosys;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.infosys.domain.Shipper;
import com.infosys.dto.Shipperdto;
import com.infosys.service.ShipperService;

@SpringBootApplication
public class JpaRepositoryApplication implements CommandLineRunner{

	@Autowired
	ShipperService service;
	
	public static void main(String[] args) {
		SpringApplication.run(JpaRepositoryApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Shipper> shipper=service.fetchShipperList();
//		for(Shipper s:shipper) {
//			System.out.println(s);
//		}
//		Shipper shipper1=new Shipper(14,"HP",979887);
//		service.insertShipper(shipper1);
		shipper=service.fetchShipperList();
		for(Shipper s:shipper) {
			System.out.println(s);
		}
//		Shipperdto shipper2=new Shipperdto(15,"xxx",7867687);
//		Shipper s=Shipperdto.prepareShipperEntity(shipper2);
//		service.insertShipper(s);
		
//		System.out.println("Enter the shipper_id to delete");
//		Scanner sc=new Scanner(System.in);
//		int id=sc.nextInt();
//		service.removeShipper(id);
		
//		shipper=service.fetchShipperList();
//		for(Shipper sh:shipper) {
//			System.out.println(sh);
//		}
//		System.out.println("Enter the shipper_id to display");
//		Scanner sc=new Scanner(System.in);
//		int id=sc.nextInt();
//		System.out.println(service.getShipper(id));
		
		
		shipper=service.fetchShipperList();
		for(Shipper sh:shipper) {
			System.out.println(sh);
		}
//		System.out.println("Enter the shipper_id to update");
//		Scanner sc=new Scanner(System.in);
//		int id=sc.nextInt();
//		System.out.println("Enter the new company name");
//		String cname=sc.next();
//		System.out.println(service.updateShipper(id,cname));
		shipper=service.fetchShipperList();
		for(Shipper sh:shipper) {
			System.out.println(sh);
		}
		
		
	}
	
	
}
