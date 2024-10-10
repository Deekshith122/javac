package com.xworkz.dto.productdto.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.dto.productdto.ProductDTO;

public class ProductRunner {


public static void main(String[] args) {
    Collection<ProductDTO> info = new ArrayList<>();
    ProductDTO dto = new ProductDTO(1, "shoe", "nike", 5000);
	ProductDTO dto0 = new ProductDTO(1, "shoe", "nike", 5000);
	ProductDTO dto1 = new ProductDTO(2, "TV", "Lg", 40000);
	ProductDTO dto2 = new ProductDTO(3, "Bat", "MRF", 3000);
	ProductDTO dto3 = new ProductDTO(4, "Laptop", "Dell", 700000);
	ProductDTO dto4 = new ProductDTO(5, "Mobile", "Redmi", 15000);
	ProductDTO dto5 = new ProductDTO(6, "watch", "titan", 2000);
	ProductDTO dto6 = new ProductDTO(7, "Bag", "Wildcart", 1000);
	ProductDTO dto7 = new ProductDTO(8, "airpods", "Boat", 1000);
	ProductDTO dto8 = new ProductDTO(9, "radio", "", 5000);
	ProductDTO dto9 = new ProductDTO(10, "shoe", "nike", 5000);

	info.add(dto);
	info.add(dto0);
    info.add(dto1);
    info.add(dto2);
    info.add(dto3);
    info.add(dto4);
    info.add(dto5);
    info.add(dto6);
    info.add(dto7);
    info.add(dto8);
    info.add(dto9);
  

    info.forEach((product) -> System.out.println(product));

    System.out.println("*******************************");

    info.stream()
        .sorted()
        .forEach((ref) -> System.out.println(ref));

    System.out.println("****************************");

    info.stream()
        .filter(product -> product.getCost() > 5000)
        .collect(Collectors.toList())
        .forEach((ref) -> System.out.println(ref));

    System.out.println("****************************");

    info.stream()
        .filter(product -> product.getCost() > 5000 && product.getCost() < 30000)
        .collect(Collectors.toList())
        .forEach((ref) -> System.out.println(ref));

    System.out.println("*****************************");

    info.stream()
        .sorted((ref1, ref2) -> ref2.compareTo(ref1))
        .collect(Collectors.toList())
        .forEach((ref) -> System.out.println(ref));

    System.out.println("****************************");

    info.stream()
        .filter(product -> product.getVendor().startsWith("S"))
        .sorted()
        .collect(Collectors.toList())
        .forEach((ref) -> System.out.println(ref));

    System.out.println("********************************");

    info.stream()
        .map(product -> product.getName())
        .collect(Collectors.toList())
        .forEach((ref) -> System.out.println(ref));

    System.out.println("******************************");

    info.stream()
        .map(product -> product.getId())
        .collect(Collectors.toList())
        .forEach((ref) -> System.out.println(ref));

    System.out.println("*********************************");

    info.stream()
        .map(product -> product.getName().toUpperCase())
        .collect(Collectors.toList())
        .forEach((ref) -> System.out.println(ref));
}
}