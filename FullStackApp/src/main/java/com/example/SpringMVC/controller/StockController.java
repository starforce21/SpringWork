package com.example.SpringMVC.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringMVC.repository.StockRepository;
import com.example.SpringMVC.model.Stock;

@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping("/api/")
public class StockController {
@Autowired
	private StockRepository stockRepo;
	
	// get all holding
	@GetMapping("/allstocks")
	public List<Stock> getAllStocks()
	{
		return stockRepo.findAll();
	}
	
	@PostMapping("/allstock")
	public Stock newStocks(@RequestBody Stock stonk)
	{
		return stockRepo.save(stonk);
	}
	
	@GetMapping("/stock/{company}")
	public List<Stock> getStockByName(@PathVariable String company)
{
		
		List <Stock> stocks=stockRepo.findByName(company);
		if(stocks.isEmpty())
		{
			System.out.println(new Exception("Company with the name "+ company +" not found"));
		}
		
		return stockRepo.findByName(company);
	}
	
	@GetMapping("/stock/{ticker}")
	public List<Stock> getStockByTicker(@PathVariable String ticker)
	{
		
		List <Stock> stocks=stockRepo.findByTicker(ticker);
		if(stocks.isEmpty())
		{
			System.out.println(new Exception("Stock with the ticker "+ ticker +" not found"));
		}
		
		return stockRepo.findByTicker(ticker);
	}
	
	
	
	@PutMapping("/student/{ticker}")
	public ResponseEntity<Stock> updateStock(@PathVariable String ticker, @RequestBody Stock stonk)
	{
		List <Stock> stocks=stockRepo.findByTicker(ticker);
		if(stocks.isEmpty())
		{
			System.out.println(new Exception("Stock with the ticker "+ ticker +" not found"));
		}
		Stock s= stockRepo.findBySingleTicker(ticker);
	    s.setTicker(stonk.getTicker());
	    s.setCompany(stonk.getCompany());
	    s.setQuantity(stonk.getQuantity());
	    s.setPurchasePrice(stonk.getPurchasePrice());
	    Stock updatedStock=stockRepo.save(s);
	    return ResponseEntity.ok(updatedStock);
	}
	

	
	@DeleteMapping("/student/{ticker}")
	public String deleteStudent(@PathVariable String ticker)
	{
		List <Stock> stocks=stockRepo.findByTicker(ticker);
		if(stocks.isEmpty())
		{
			System.out.println(new Exception("Stock with the ticker "+ ticker +" not found"));
		}
	    stockRepo.deleteByTicker(ticker);
	    return "The Stock with ticker: "+ ticker +" is removed from the database.";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
