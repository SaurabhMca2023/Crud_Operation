package com.jsp.jdbc_prepared_statement.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.jsp.jdbc_prepared_statement.connection.laptopConnection;
import com.jsp.jdbc_prepared_statement.entity.laptop;


public class laptopController {

	public static void main(String[] args) {
		
		while(true)
		{
			System.out.println("1.INSERT\n2.DELETE\n3.UPDATE\n4.DISPLAY");
			Scanner sc=new Scanner(System.in);
			int choice=sc.nextInt();
			switch(choice){
				case 1:{
		
					Connection connection=laptopConnection.getlaptopConnection();
					System.out.println("enter laptop id: ");
					int id=sc.nextInt();
					System.out.println("enter laptop name");
					String name=sc.next();
					System.out.println("enter color of laptop: ");
					String color=sc.next();
					System.out.println("enter price: ");
					double price=sc.nextDouble();
					System.out.println("enter laptop ram: ");
					int ram=sc.nextInt();
					
					laptop l1=new laptop(id,name,color,price,ram);
					String insertQuery="insert into laptop values(?,?,?,?,?)";
					
					
					try {
						PreparedStatement ps=connection.prepareStatement(insertQuery);
						ps.setInt(1,l1.getId());
						ps.setString(2, l1.getName());
						ps.setString(3,l1.getColor());
						ps.setDouble(4,l1.getPrice());
						ps.setInt(5,l1.getRam());
						
						ps.execute();
						System.out.println("data===stored");
						
					}
					catch(SQLException e){
						e.printStackTrace();
					}
					
					}
				break;
				case 2:{
					Connection connection=laptopConnection.getlaptopConnection();
					System.out.println("enter laptop id: ");
					int id=sc.nextInt();
					String deleteQuery="delete from laptop where id=?";
					
					try {
						PreparedStatement ps=connection.prepareStatement(deleteQuery);
						ps.setInt(1,id);
						int a=ps.executeUpdate();
						
						if(a==1)
						{
							System.err.println("deleted");
						}
						else {
							System.err.println("id not found...........");
						}
					}catch(SQLException e){
						e.printStackTrace();
						
					}
				}
				break;
				case 3:{
					Connection connection=laptopConnection.getlaptopConnection();
					System.out.println("what do you want to update");
					System.out.println("1.NAME\n2.COLOR\n3.PRICE\n4.ram\n5.ALL THING UPDATE");
					int option=sc.nextInt();
					switch(option) {
					case 1:
					System.out.println("enter laptop id to update");
					int id=sc.nextInt();
					System.out.println("enter laptop name which you want to update");
					String name=sc.next();
					
					String updateNameQuery="update laptop set name=? where id=?";
						try {
							PreparedStatement prs = connection.prepareStatement(updateNameQuery);
							prs.setInt(2,id);
							prs.setString(1,name);
							int a=prs.executeUpdate();
							if(a==1) {
								System.out.println("updated");
							}else {
								System.out.println("given id is not found");
							}
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				
				break;
				case 2:{
					System.out.println("enter laptop id to update");
					int i=sc.nextInt();
					System.out.println("enter laptop color which you want to update");
					String color=sc.next();
					
					String updateColorQuery="update laptop set color=? where id=?";
						try {
							PreparedStatement prs = connection.prepareStatement(updateColorQuery);
							prs.setInt(2,i);
							prs.setString(1,color);
							int a=prs.executeUpdate();
							if(a==1) {
								System.out.println("updated");
							}else {
								System.out.println("given id is not found");
							}
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					
					
					}
				
				break;
				case 3:{
					System.out.println("enter laptop id to update");
					int i=sc.nextInt();
					System.out.println("enter laptop price which you want to update");
					String price=sc.next();
					
					String updatePriceQuery="update laptop set price=? where id=?";
						try {
							PreparedStatement prs = connection.prepareStatement(updatePriceQuery);
							prs.setInt(2,i);
							prs.setString(1,price);
							int a=prs.executeUpdate();
							if(a==1) {
								System.out.println("updated");
							}else {
								System.out.println("given id is not found");
							}
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					
					
					}
				
				break;
				case 4:{
					System.out.println("enter laptop id to update");
					int i=sc.nextInt();
					System.out.println("enter laptop ram which you want to update");
					int ram=sc.nextInt();
					
					String updatePriceQuery="update laptop set ram=? where id=?";
						try {
							PreparedStatement prs = connection.prepareStatement(updatePriceQuery);
							prs.setInt(2,i);
							prs.setInt(1,ram);
							int a=prs.executeUpdate();
							if(a==1) {
								System.out.println("updated");
							}else {
								System.out.println("given id is not found");
							}
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					
					
					}
				
				break;
			
				//for update everything
				case 5:{
					System.out.println("enter laptop id to all column update");
					int i=sc.nextInt();
					System.out.println("enter laptop name which you want to update");
					String UpdatedName=sc.next();
					System.out.println("enter laptop price which you want to update");
					double price=sc.nextDouble();
					System.out.println("enter laptop color which you want to update");
					String color=sc.next();
					System.out.println("enter laptop ram which you want to update");
					int ram=sc.nextInt();
					String updateColorQuery="update laptop set name=?,price=?, color=?,ram=? where id=?";
						try {
							PreparedStatement prs = connection.prepareStatement(updateColorQuery);
							prs.setInt(4,i);
							prs.setString(1,UpdatedName);
							prs.setDouble(2, price);
							prs.setString(3,color);
							prs.setInt(4,ram);
							int a=prs.executeUpdate();
							if(a==1) {
								System.out.println("updated");
							}else {
								System.out.println("given id is not found");
							}
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					
					
					}
				
				break;
					}
}
				
				break;
				case 4:{
					String SelectQuery="select * from laptop";
					Connection connection=laptopConnection.getlaptopConnection();
					try {
						@SuppressWarnings("unused")
						PreparedStatement preparedStatement = connection.prepareStatement(SelectQuery);
						ResultSet resultset=preparedStatement.executeQuery();
						
						while(resultset.next()) {
							int id=resultset.getInt("id");
							String name=resultset.getString("name");
							String color=resultset.getString("color");
							double price=resultset.getDouble("price");
							int ram=resultset.getInt("ram");
							
							laptop l1=new laptop(id,name,color,price,ram);
							System.out.println(l1);
						}
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				break;
			}
		}
		
		
		
	}
	
	
}
